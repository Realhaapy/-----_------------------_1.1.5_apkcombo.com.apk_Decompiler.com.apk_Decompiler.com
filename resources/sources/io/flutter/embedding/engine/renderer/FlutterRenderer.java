package io.flutter.embedding.engine.renderer;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public class FlutterRenderer implements TextureRegistry {
    private static final String TAG = "FlutterRenderer";
    /* access modifiers changed from: private */
    public final FlutterJNI flutterJNI;
    private final FlutterUiDisplayListener flutterUiDisplayListener;
    /* access modifiers changed from: private */
    public Handler handler = new Handler();
    /* access modifiers changed from: private */
    public boolean isDisplayingFlutterUi = false;
    private final AtomicLong nextTextureId = new AtomicLong(0);
    private final Set<WeakReference<TextureRegistry.OnTrimMemoryListener>> onTrimMemoryListeners = new HashSet();
    private Surface surface;

    public static final class DisplayFeature {
        public final Rect bounds;
        public final DisplayFeatureState state;
        public final DisplayFeatureType type;

        public DisplayFeature(Rect rect, DisplayFeatureType displayFeatureType) {
            this.bounds = rect;
            this.type = displayFeatureType;
            this.state = DisplayFeatureState.UNKNOWN;
        }

        public DisplayFeature(Rect rect, DisplayFeatureType displayFeatureType, DisplayFeatureState displayFeatureState) {
            this.bounds = rect;
            this.type = displayFeatureType;
            this.state = displayFeatureState;
        }
    }

    public enum DisplayFeatureState {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);
        
        public final int encodedValue;

        private DisplayFeatureState(int i2) {
            this.encodedValue = i2;
        }
    }

    public enum DisplayFeatureType {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);
        
        public final int encodedValue;

        private DisplayFeatureType(int i2) {
            this.encodedValue = i2;
        }
    }

    static final class SurfaceTextureFinalizerRunnable implements Runnable {
        private final FlutterJNI flutterJNI;
        private final long id;

        SurfaceTextureFinalizerRunnable(long j2, FlutterJNI flutterJNI2) {
            this.id = j2;
            this.flutterJNI = flutterJNI2;
        }

        public void run() {
            if (this.flutterJNI.isAttached()) {
                Log.v(FlutterRenderer.TAG, "Releasing a SurfaceTexture (" + this.id + ").");
                this.flutterJNI.unregisterTexture(this.id);
            }
        }
    }

    final class SurfaceTextureRegistryEntry implements TextureRegistry.SurfaceTextureEntry, TextureRegistry.OnTrimMemoryListener {
        /* access modifiers changed from: private */
        public TextureRegistry.OnFrameConsumedListener frameConsumedListener;
        /* access modifiers changed from: private */
        public final long id;
        private final Runnable onFrameConsumed;
        private SurfaceTexture.OnFrameAvailableListener onFrameListener = new SurfaceTexture.OnFrameAvailableListener() {
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (!SurfaceTextureRegistryEntry.this.released && FlutterRenderer.this.flutterJNI.isAttached()) {
                    SurfaceTextureRegistryEntry surfaceTextureRegistryEntry = SurfaceTextureRegistryEntry.this;
                    FlutterRenderer.this.markTextureFrameAvailable(surfaceTextureRegistryEntry.id);
                }
            }
        };
        /* access modifiers changed from: private */
        public boolean released;
        private final SurfaceTextureWrapper textureWrapper;
        private TextureRegistry.OnTrimMemoryListener trimMemoryListener;

        SurfaceTextureRegistryEntry(long j2, SurfaceTexture surfaceTexture) {
            AnonymousClass1 r2 = new Runnable() {
                public void run() {
                    if (SurfaceTextureRegistryEntry.this.frameConsumedListener != null) {
                        SurfaceTextureRegistryEntry.this.frameConsumedListener.onFrameConsumed();
                    }
                }
            };
            this.onFrameConsumed = r2;
            this.id = j2;
            this.textureWrapper = new SurfaceTextureWrapper(surfaceTexture, r2);
            if (Build.VERSION.SDK_INT >= 21) {
                surfaceTexture().setOnFrameAvailableListener(this.onFrameListener, new Handler());
            } else {
                surfaceTexture().setOnFrameAvailableListener(this.onFrameListener);
            }
        }

        private void removeListener() {
            FlutterRenderer.this.removeOnTrimMemoryListener(this);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            try {
                if (!this.released) {
                    FlutterRenderer.this.handler.post(new SurfaceTextureFinalizerRunnable(this.id, FlutterRenderer.this.flutterJNI));
                    super.finalize();
                }
            } finally {
                super.finalize();
            }
        }

        public long id() {
            return this.id;
        }

        public void onTrimMemory(int i2) {
            TextureRegistry.OnTrimMemoryListener onTrimMemoryListener = this.trimMemoryListener;
            if (onTrimMemoryListener != null) {
                onTrimMemoryListener.onTrimMemory(i2);
            }
        }

        public void release() {
            if (!this.released) {
                Log.v(FlutterRenderer.TAG, "Releasing a SurfaceTexture (" + this.id + ").");
                this.textureWrapper.release();
                FlutterRenderer.this.unregisterTexture(this.id);
                removeListener();
                this.released = true;
            }
        }

        public void setOnFrameConsumedListener(TextureRegistry.OnFrameConsumedListener onFrameConsumedListener) {
            this.frameConsumedListener = onFrameConsumedListener;
        }

        public void setOnTrimMemoryListener(TextureRegistry.OnTrimMemoryListener onTrimMemoryListener) {
            this.trimMemoryListener = onTrimMemoryListener;
        }

        public SurfaceTexture surfaceTexture() {
            return this.textureWrapper.surfaceTexture();
        }

        public SurfaceTextureWrapper textureWrapper() {
            return this.textureWrapper;
        }
    }

    public static final class ViewportMetrics {
        public static final int unsetValue = -1;
        public float devicePixelRatio = 1.0f;
        public List<DisplayFeature> displayFeatures = new ArrayList();
        public int height = 0;
        public int physicalTouchSlop = -1;
        public int systemGestureInsetBottom = 0;
        public int systemGestureInsetLeft = 0;
        public int systemGestureInsetRight = 0;
        public int systemGestureInsetTop = 0;
        public int viewInsetBottom = 0;
        public int viewInsetLeft = 0;
        public int viewInsetRight = 0;
        public int viewInsetTop = 0;
        public int viewPaddingBottom = 0;
        public int viewPaddingLeft = 0;
        public int viewPaddingRight = 0;
        public int viewPaddingTop = 0;
        public int width = 0;

        /* access modifiers changed from: package-private */
        public boolean validate() {
            return this.width > 0 && this.height > 0 && this.devicePixelRatio > 0.0f;
        }
    }

    public FlutterRenderer(FlutterJNI flutterJNI2) {
        AnonymousClass1 r0 = new FlutterUiDisplayListener() {
            public void onFlutterUiDisplayed() {
                boolean unused = FlutterRenderer.this.isDisplayingFlutterUi = true;
            }

            public void onFlutterUiNoLongerDisplayed() {
                boolean unused = FlutterRenderer.this.isDisplayingFlutterUi = false;
            }
        };
        this.flutterUiDisplayListener = r0;
        this.flutterJNI = flutterJNI2;
        flutterJNI2.addIsDisplayingFlutterUiListener(r0);
    }

    private void clearDeadListeners() {
        Iterator<WeakReference<TextureRegistry.OnTrimMemoryListener>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            if (((TextureRegistry.OnTrimMemoryListener) it.next().get()) == null) {
                it.remove();
            }
        }
    }

    /* access modifiers changed from: private */
    public void markTextureFrameAvailable(long j2) {
        this.flutterJNI.markTextureFrameAvailable(j2);
    }

    private void registerTexture(long j2, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.flutterJNI.registerTexture(j2, surfaceTextureWrapper);
    }

    /* access modifiers changed from: private */
    public void unregisterTexture(long j2) {
        this.flutterJNI.unregisterTexture(j2);
    }

    public void addIsDisplayingFlutterUiListener(FlutterUiDisplayListener flutterUiDisplayListener2) {
        this.flutterJNI.addIsDisplayingFlutterUiListener(flutterUiDisplayListener2);
        if (this.isDisplayingFlutterUi) {
            flutterUiDisplayListener2.onFlutterUiDisplayed();
        }
    }

    /* access modifiers changed from: package-private */
    public void addOnTrimMemoryListener(TextureRegistry.OnTrimMemoryListener onTrimMemoryListener) {
        clearDeadListeners();
        this.onTrimMemoryListeners.add(new WeakReference(onTrimMemoryListener));
    }

    public TextureRegistry.SurfaceTextureEntry createSurfaceTexture() {
        Log.v(TAG, "Creating a SurfaceTexture.");
        return registerSurfaceTexture(new SurfaceTexture(0));
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i2) {
        this.flutterJNI.dispatchPointerDataPacket(byteBuffer, i2);
    }

    public void dispatchSemanticsAction(int i2, int i3, ByteBuffer byteBuffer, int i4) {
        this.flutterJNI.dispatchSemanticsAction(i2, i3, byteBuffer, i4);
    }

    public Bitmap getBitmap() {
        return this.flutterJNI.getBitmap();
    }

    public boolean isDisplayingFlutterUi() {
        return this.isDisplayingFlutterUi;
    }

    public boolean isSoftwareRenderingEnabled() {
        return this.flutterJNI.getIsSoftwareRenderingEnabled();
    }

    public void onTrimMemory(int i2) {
        Iterator<WeakReference<TextureRegistry.OnTrimMemoryListener>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            TextureRegistry.OnTrimMemoryListener onTrimMemoryListener = (TextureRegistry.OnTrimMemoryListener) it.next().get();
            if (onTrimMemoryListener != null) {
                onTrimMemoryListener.onTrimMemory(i2);
            } else {
                it.remove();
            }
        }
    }

    public TextureRegistry.SurfaceTextureEntry registerSurfaceTexture(SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        SurfaceTextureRegistryEntry surfaceTextureRegistryEntry = new SurfaceTextureRegistryEntry(this.nextTextureId.getAndIncrement(), surfaceTexture);
        Log.v(TAG, "New SurfaceTexture ID: " + surfaceTextureRegistryEntry.id());
        registerTexture(surfaceTextureRegistryEntry.id(), surfaceTextureRegistryEntry.textureWrapper());
        addOnTrimMemoryListener(surfaceTextureRegistryEntry);
        return surfaceTextureRegistryEntry;
    }

    public void removeIsDisplayingFlutterUiListener(FlutterUiDisplayListener flutterUiDisplayListener2) {
        this.flutterJNI.removeIsDisplayingFlutterUiListener(flutterUiDisplayListener2);
    }

    /* access modifiers changed from: package-private */
    public void removeOnTrimMemoryListener(TextureRegistry.OnTrimMemoryListener onTrimMemoryListener) {
        for (WeakReference next : this.onTrimMemoryListeners) {
            if (next.get() == onTrimMemoryListener) {
                this.onTrimMemoryListeners.remove(next);
                return;
            }
        }
    }

    public void setAccessibilityFeatures(int i2) {
        this.flutterJNI.setAccessibilityFeatures(i2);
    }

    public void setSemanticsEnabled(boolean z) {
        this.flutterJNI.setSemanticsEnabled(z);
    }

    public void setViewportMetrics(ViewportMetrics viewportMetrics) {
        ViewportMetrics viewportMetrics2 = viewportMetrics;
        if (viewportMetrics.validate()) {
            Log.v(TAG, "Setting viewport metrics\nSize: " + viewportMetrics2.width + " x " + viewportMetrics2.height + "\nPadding - L: " + viewportMetrics2.viewPaddingLeft + ", T: " + viewportMetrics2.viewPaddingTop + ", R: " + viewportMetrics2.viewPaddingRight + ", B: " + viewportMetrics2.viewPaddingBottom + "\nInsets - L: " + viewportMetrics2.viewInsetLeft + ", T: " + viewportMetrics2.viewInsetTop + ", R: " + viewportMetrics2.viewInsetRight + ", B: " + viewportMetrics2.viewInsetBottom + "\nSystem Gesture Insets - L: " + viewportMetrics2.systemGestureInsetLeft + ", T: " + viewportMetrics2.systemGestureInsetTop + ", R: " + viewportMetrics2.systemGestureInsetRight + ", B: " + viewportMetrics2.systemGestureInsetRight + "\nDisplay Features: " + viewportMetrics2.displayFeatures.size());
            int[] iArr = new int[(viewportMetrics2.displayFeatures.size() * 4)];
            int[] iArr2 = new int[viewportMetrics2.displayFeatures.size()];
            int[] iArr3 = new int[viewportMetrics2.displayFeatures.size()];
            for (int i2 = 0; i2 < viewportMetrics2.displayFeatures.size(); i2++) {
                DisplayFeature displayFeature = viewportMetrics2.displayFeatures.get(i2);
                int i3 = i2 * 4;
                Rect rect = displayFeature.bounds;
                iArr[i3] = rect.left;
                iArr[i3 + 1] = rect.top;
                iArr[i3 + 2] = rect.right;
                iArr[i3 + 3] = rect.bottom;
                iArr2[i2] = displayFeature.type.encodedValue;
                iArr3[i2] = displayFeature.state.encodedValue;
            }
            int[] iArr4 = iArr3;
            FlutterJNI flutterJNI2 = this.flutterJNI;
            flutterJNI2.setViewportMetrics(viewportMetrics2.devicePixelRatio, viewportMetrics2.width, viewportMetrics2.height, viewportMetrics2.viewPaddingTop, viewportMetrics2.viewPaddingRight, viewportMetrics2.viewPaddingBottom, viewportMetrics2.viewPaddingLeft, viewportMetrics2.viewInsetTop, viewportMetrics2.viewInsetRight, viewportMetrics2.viewInsetBottom, viewportMetrics2.viewInsetLeft, viewportMetrics2.systemGestureInsetTop, viewportMetrics2.systemGestureInsetRight, viewportMetrics2.systemGestureInsetBottom, viewportMetrics2.systemGestureInsetLeft, viewportMetrics2.physicalTouchSlop, iArr, iArr2, iArr4);
        }
    }

    public void startRenderingToSurface(Surface surface2, boolean z) {
        if (this.surface != null && !z) {
            stopRenderingToSurface();
        }
        this.surface = surface2;
        this.flutterJNI.onSurfaceCreated(surface2);
    }

    public void stopRenderingToSurface() {
        this.flutterJNI.onSurfaceDestroyed();
        this.surface = null;
        if (this.isDisplayingFlutterUi) {
            this.flutterUiDisplayListener.onFlutterUiNoLongerDisplayed();
        }
        this.isDisplayingFlutterUi = false;
    }

    public void surfaceChanged(int i2, int i3) {
        this.flutterJNI.onSurfaceChanged(i2, i3);
    }

    public void swapSurface(Surface surface2) {
        this.surface = surface2;
        this.flutterJNI.onSurfaceWindowChanged(surface2);
    }
}