package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewTreeObserver;
import io.flutter.plugin.platform.SingleViewPresentation;
import io.flutter.view.TextureRegistry;

@TargetApi(20)
class VirtualDisplayController {
    private static String TAG = "VirtualDisplayController";
    private final AccessibilityEventsDelegate accessibilityEventsDelegate;
    private int bufferHeight;
    private int bufferWidth;
    private final Context context;
    private final int densityDpi;
    private final View.OnFocusChangeListener focusChangeListener;
    SingleViewPresentation presentation;
    private final Surface surface;
    private final TextureRegistry.SurfaceTextureEntry textureEntry;
    private VirtualDisplay virtualDisplay;

    static class OneTimeOnDrawListener implements ViewTreeObserver.OnDrawListener {
        Runnable mOnDrawRunnable;
        final View mView;

        OneTimeOnDrawListener(View view, Runnable runnable) {
            this.mView = view;
            this.mOnDrawRunnable = runnable;
        }

        static void schedule(View view, Runnable runnable) {
            view.getViewTreeObserver().addOnDrawListener(new OneTimeOnDrawListener(view, runnable));
        }

        public void onDraw() {
            Runnable runnable = this.mOnDrawRunnable;
            if (runnable != null) {
                runnable.run();
                this.mOnDrawRunnable = null;
                this.mView.post(new Runnable() {
                    public void run() {
                        OneTimeOnDrawListener.this.mView.getViewTreeObserver().removeOnDrawListener(OneTimeOnDrawListener.this);
                    }
                });
            }
        }
    }

    private VirtualDisplayController(Context context2, AccessibilityEventsDelegate accessibilityEventsDelegate2, VirtualDisplay virtualDisplay2, PlatformView platformView, Surface surface2, TextureRegistry.SurfaceTextureEntry surfaceTextureEntry, View.OnFocusChangeListener onFocusChangeListener, int i2, Object obj) {
        Context context3 = context2;
        this.context = context3;
        AccessibilityEventsDelegate accessibilityEventsDelegate3 = accessibilityEventsDelegate2;
        this.accessibilityEventsDelegate = accessibilityEventsDelegate3;
        this.textureEntry = surfaceTextureEntry;
        View.OnFocusChangeListener onFocusChangeListener2 = onFocusChangeListener;
        this.focusChangeListener = onFocusChangeListener2;
        this.surface = surface2;
        this.virtualDisplay = virtualDisplay2;
        this.densityDpi = context2.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(context3, this.virtualDisplay.getDisplay(), platformView, accessibilityEventsDelegate3, i2, obj, onFocusChangeListener2);
        this.presentation = singleViewPresentation;
        singleViewPresentation.show();
    }

    public static VirtualDisplayController create(Context context2, AccessibilityEventsDelegate accessibilityEventsDelegate2, PlatformView platformView, TextureRegistry.SurfaceTextureEntry surfaceTextureEntry, int i2, int i3, int i4, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        int i5 = i2;
        int i6 = i3;
        context2.getResources().getDisplayMetrics();
        if (i5 == 0 || i6 == 0) {
            return null;
        }
        surfaceTextureEntry.surfaceTexture().setDefaultBufferSize(i5, i6);
        Surface surface2 = new Surface(surfaceTextureEntry.surfaceTexture());
        VirtualDisplay createVirtualDisplay = ((DisplayManager) context2.getSystemService("display")).createVirtualDisplay("flutter-vd", i2, i3, context2.getResources().getDisplayMetrics().densityDpi, surface2, 0);
        if (createVirtualDisplay == null) {
            return null;
        }
        VirtualDisplayController virtualDisplayController = new VirtualDisplayController(context2, accessibilityEventsDelegate2, createVirtualDisplay, platformView, surface2, surfaceTextureEntry, onFocusChangeListener, i4, obj);
        virtualDisplayController.bufferWidth = i5;
        virtualDisplayController.bufferHeight = i6;
        return virtualDisplayController;
    }

    public void dispatchTouchEvent(MotionEvent motionEvent) {
        SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation != null) {
            singleViewPresentation.dispatchTouchEvent(motionEvent);
        }
    }

    public void dispose() {
        this.presentation.cancel();
        this.presentation.detachState();
        this.virtualDisplay.release();
        this.textureEntry.release();
    }

    public int getBufferHeight() {
        return this.bufferHeight;
    }

    public int getBufferWidth() {
        return this.bufferWidth;
    }

    public View getView() {
        SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }

    /* access modifiers changed from: package-private */
    public void onFlutterViewAttached(View view) {
        SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
            this.presentation.getView().onFlutterViewAttached(view);
        }
    }

    /* access modifiers changed from: package-private */
    public void onFlutterViewDetached() {
        SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
            this.presentation.getView().onFlutterViewDetached();
        }
    }

    /* access modifiers changed from: package-private */
    public void onInputConnectionLocked() {
        SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
            this.presentation.getView().onInputConnectionLocked();
        }
    }

    /* access modifiers changed from: package-private */
    public void onInputConnectionUnlocked() {
        SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
            this.presentation.getView().onInputConnectionUnlocked();
        }
    }

    public void resize(int i2, int i3, final Runnable runnable) {
        boolean isFocused = getView().isFocused();
        SingleViewPresentation.PresentationState detachState = this.presentation.detachState();
        this.virtualDisplay.setSurface((Surface) null);
        this.virtualDisplay.release();
        this.bufferWidth = i2;
        this.bufferHeight = i3;
        this.textureEntry.surfaceTexture().setDefaultBufferSize(i2, i3);
        this.virtualDisplay = ((DisplayManager) this.context.getSystemService("display")).createVirtualDisplay("flutter-vd", i2, i3, this.densityDpi, this.surface, 0);
        final View view = getView();
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            public void onViewAttachedToWindow(View view) {
                OneTimeOnDrawListener.schedule(view, new Runnable() {
                    public void run() {
                        AnonymousClass1 r0 = AnonymousClass1.this;
                        view.postDelayed(runnable, 128);
                    }
                });
                view.removeOnAttachStateChangeListener(this);
            }

            public void onViewDetachedFromWindow(View view) {
            }
        });
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.context, this.virtualDisplay.getDisplay(), this.accessibilityEventsDelegate, detachState, this.focusChangeListener, isFocused);
        singleViewPresentation.show();
        this.presentation.cancel();
        this.presentation = singleViewPresentation;
    }
}
