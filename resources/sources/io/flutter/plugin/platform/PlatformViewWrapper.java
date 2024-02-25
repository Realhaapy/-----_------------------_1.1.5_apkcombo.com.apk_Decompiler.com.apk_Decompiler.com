package io.flutter.plugin.platform;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.Log;
import io.flutter.embedding.android.AndroidTouchProcessor;
import io.flutter.util.ViewUtils;
import io.flutter.view.TextureRegistry;
import java.util.concurrent.atomic.AtomicLong;

@TargetApi(23)
class PlatformViewWrapper extends FrameLayout {
    private static final String TAG = "PlatformViewWrapper";
    ViewTreeObserver.OnGlobalFocusChangeListener activeFocusListener;
    private int bufferHeight;
    private int bufferWidth;
    private final TextureRegistry.OnFrameConsumedListener frameConsumedListener;
    private int left;
    /* access modifiers changed from: private */
    public final AtomicLong pendingFramesCount;
    private int prevLeft;
    private int prevTop;
    /* access modifiers changed from: private */
    public boolean shouldRecreateSurfaceForLowMemory;
    private Surface surface;
    private int top;
    private AndroidTouchProcessor touchProcessor;
    private final TextureRegistry.OnTrimMemoryListener trimMemoryListener;
    private SurfaceTexture tx;

    public PlatformViewWrapper(Context context) {
        super(context);
        this.pendingFramesCount = new AtomicLong(0);
        this.frameConsumedListener = new TextureRegistry.OnFrameConsumedListener() {
            public void onFrameConsumed() {
                if (Build.VERSION.SDK_INT == 29) {
                    PlatformViewWrapper.this.pendingFramesCount.decrementAndGet();
                }
            }
        };
        this.shouldRecreateSurfaceForLowMemory = false;
        this.trimMemoryListener = new TextureRegistry.OnTrimMemoryListener() {
            public void onTrimMemory(int i2) {
                if (i2 == 80 && Build.VERSION.SDK_INT >= 29) {
                    boolean unused = PlatformViewWrapper.this.shouldRecreateSurfaceForLowMemory = true;
                }
            }
        };
        setWillNotDraw(false);
    }

    public PlatformViewWrapper(Context context, TextureRegistry.SurfaceTextureEntry surfaceTextureEntry) {
        this(context);
        surfaceTextureEntry.setOnFrameConsumedListener(this.frameConsumedListener);
        surfaceTextureEntry.setOnTrimMemoryListener(this.trimMemoryListener);
        setTexture(surfaceTextureEntry.surfaceTexture());
    }

    private void onFrameProduced() {
        if (Build.VERSION.SDK_INT == 29) {
            this.pendingFramesCount.incrementAndGet();
        }
    }

    private void recreateSurfaceIfNeeded() {
        if (this.shouldRecreateSurfaceForLowMemory) {
            Surface surface2 = this.surface;
            if (surface2 != null) {
                surface2.release();
            }
            this.surface = createSurface(this.tx);
            this.shouldRecreateSurfaceForLowMemory = false;
        }
    }

    private boolean shouldDrawToSurfaceNow() {
        return Build.VERSION.SDK_INT != 29 || this.pendingFramesCount.get() <= 0;
    }

    /* access modifiers changed from: protected */
    public Surface createSurface(SurfaceTexture surfaceTexture) {
        return new Surface(surfaceTexture);
    }

    @SuppressLint({"NewApi"})
    public void draw(Canvas canvas) {
        String str;
        Surface surface2 = this.surface;
        if (surface2 == null) {
            super.draw(canvas);
            str = "Platform view cannot be composed without a surface.";
        } else if (!surface2.isValid()) {
            str = "Invalid surface. The platform view cannot be displayed.";
        } else {
            SurfaceTexture surfaceTexture = this.tx;
            if (surfaceTexture == null || surfaceTexture.isReleased()) {
                str = "Invalid texture. The platform view cannot be displayed.";
            } else if (!shouldDrawToSurfaceNow()) {
                invalidate();
                return;
            } else {
                recreateSurfaceIfNeeded();
                Canvas lockHardwareCanvas = this.surface.lockHardwareCanvas();
                try {
                    lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    super.draw(lockHardwareCanvas);
                    onFrameProduced();
                    return;
                } finally {
                    this.surface.unlockCanvasAndPost(lockHardwareCanvas);
                }
            }
        }
        Log.e(TAG, str);
    }

    public int getBufferHeight() {
        return this.bufferHeight;
    }

    public int getBufferWidth() {
        return this.bufferWidth;
    }

    public SurfaceTexture getTexture() {
        return this.tx;
    }

    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @SuppressLint({"NewApi"})
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i2;
        float f2;
        if (this.touchProcessor == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i3 = this.left;
            this.prevLeft = i3;
            i2 = this.top;
            this.prevTop = i2;
            f2 = (float) i3;
        } else if (action != 2) {
            f2 = (float) this.left;
            i2 = this.top;
        } else {
            matrix.postTranslate((float) this.prevLeft, (float) this.prevTop);
            this.prevLeft = this.left;
            this.prevTop = this.top;
            return this.touchProcessor.onTouchEvent(motionEvent, matrix);
        }
        matrix.postTranslate(f2, (float) i2);
        return this.touchProcessor.onTouchEvent(motionEvent, matrix);
    }

    public void release() {
        this.tx = null;
        Surface surface2 = this.surface;
        if (surface2 != null) {
            surface2.release();
            this.surface = null;
        }
    }

    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setBufferSize(int i2, int i3) {
        this.bufferWidth = i2;
        this.bufferHeight = i3;
        SurfaceTexture surfaceTexture = this.tx;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i2, i3);
        }
    }

    public void setLayoutParams(FrameLayout.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        this.left = layoutParams.leftMargin;
        this.top = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(final View.OnFocusChangeListener onFocusChangeListener) {
        unsetOnDescendantFocusChangeListener();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.activeFocusListener == null) {
            AnonymousClass3 r1 = new ViewTreeObserver.OnGlobalFocusChangeListener() {
                public void onGlobalFocusChanged(View view, View view2) {
                    View.OnFocusChangeListener onFocusChangeListener = onFocusChangeListener;
                    PlatformViewWrapper platformViewWrapper = PlatformViewWrapper.this;
                    onFocusChangeListener.onFocusChange(platformViewWrapper, ViewUtils.childHasFocus(platformViewWrapper));
                }
            };
            this.activeFocusListener = r1;
            viewTreeObserver.addOnGlobalFocusChangeListener(r1);
        }
    }

    @SuppressLint({"NewApi"})
    public void setTexture(SurfaceTexture surfaceTexture) {
        int i2;
        if (Build.VERSION.SDK_INT < 23) {
            Log.e(TAG, "Platform views cannot be displayed below API level 23. You can prevent this issue by setting `minSdkVersion: 23` in build.gradle.");
            return;
        }
        this.tx = surfaceTexture;
        int i3 = this.bufferWidth;
        if (i3 > 0 && (i2 = this.bufferHeight) > 0) {
            surfaceTexture.setDefaultBufferSize(i3, i2);
        }
        Surface surface2 = this.surface;
        if (surface2 != null) {
            surface2.release();
        }
        Surface createSurface = createSurface(surfaceTexture);
        this.surface = createSurface;
        Canvas lockHardwareCanvas = createSurface.lockHardwareCanvas();
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            onFrameProduced();
        } finally {
            this.surface.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public void setTouchProcessor(AndroidTouchProcessor androidTouchProcessor) {
        this.touchProcessor = androidTouchProcessor;
    }

    public void unsetOnDescendantFocusChangeListener() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (onGlobalFocusChangeListener = this.activeFocusListener) != null) {
            this.activeFocusListener = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }
}