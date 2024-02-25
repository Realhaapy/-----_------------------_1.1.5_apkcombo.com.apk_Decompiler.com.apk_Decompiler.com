package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.flutter.Log;
import io.flutter.embedding.android.AndroidTouchProcessor;
import io.flutter.embedding.android.FlutterImageView;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.android.MotionEventTracker;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.util.ViewUtils;
import io.flutter.view.AccessibilityBridge;
import io.flutter.view.TextureRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class PlatformViewsController implements PlatformViewsAccessibilityDelegate {
    private static final String TAG = "PlatformViewsController";
    /* access modifiers changed from: private */
    public static Class[] VIEW_TYPES_REQUIRE_VIRTUAL_DISPLAY = {SurfaceView.class};
    /* access modifiers changed from: private */
    public final AccessibilityEventsDelegate accessibilityEventsDelegate = new AccessibilityEventsDelegate();
    /* access modifiers changed from: private */
    public AndroidTouchProcessor androidTouchProcessor;
    private final PlatformViewsChannel.PlatformViewsHandler channelHandler = new PlatformViewsChannel.PlatformViewsHandler() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void b(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest, View view, boolean z) {
            if (z) {
                PlatformViewsController.this.platformViewsChannel.invokeViewFocused(platformViewCreationRequest.viewId);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void d(int i2, View view, boolean z) {
            PlatformViewsController platformViewsController = PlatformViewsController.this;
            if (z) {
                platformViewsController.platformViewsChannel.invokeViewFocused(i2);
            } else if (platformViewsController.textInputPlugin != null) {
                PlatformViewsController.this.textInputPlugin.clearPlatformViewClient(i2);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void f(VirtualDisplayController virtualDisplayController, PlatformViewsChannel.PlatformViewBufferResized platformViewBufferResized) {
            PlatformViewsController.this.unlockInputConnection(virtualDisplayController);
            platformViewBufferResized.run(new PlatformViewsChannel.PlatformViewBufferSize(PlatformViewsController.this.toLogicalPixels((double) virtualDisplayController.getBufferWidth()), PlatformViewsController.this.toLogicalPixels((double) virtualDisplayController.getBufferHeight())));
        }

        private void ensureValidAndroidVersion(int i2) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < i2) {
                throw new IllegalStateException("Trying to use platform views with API " + i3 + ", required API level is: " + i2);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x004e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void clearFocus(int r4) {
            /*
                r3 = this;
                io.flutter.plugin.platform.PlatformViewsController r0 = io.flutter.plugin.platform.PlatformViewsController.this
                boolean r0 = r0.usesVirtualDisplay(r4)
                java.lang.String r1 = "PlatformViewsController"
                if (r0 == 0) goto L_0x001d
                io.flutter.plugin.platform.PlatformViewsController r0 = io.flutter.plugin.platform.PlatformViewsController.this
                java.util.HashMap<java.lang.Integer, io.flutter.plugin.platform.VirtualDisplayController> r0 = r0.vdControllers
                java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
                java.lang.Object r0 = r0.get(r2)
                io.flutter.plugin.platform.VirtualDisplayController r0 = (io.flutter.plugin.platform.VirtualDisplayController) r0
                android.view.View r0 = r0.getView()
                goto L_0x0044
            L_0x001d:
                io.flutter.plugin.platform.PlatformViewsController r0 = io.flutter.plugin.platform.PlatformViewsController.this
                android.util.SparseArray r0 = r0.platformViews
                java.lang.Object r0 = r0.get(r4)
                io.flutter.plugin.platform.PlatformView r0 = (io.flutter.plugin.platform.PlatformView) r0
                if (r0 != 0) goto L_0x0040
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Clearing focus on an unknown view with id: "
            L_0x0032:
                r0.append(r2)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                io.flutter.Log.e(r1, r4)
                return
            L_0x0040:
                android.view.View r0 = r0.getView()
            L_0x0044:
                if (r0 != 0) goto L_0x004e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Clearing focus on a null view with id: "
                goto L_0x0032
            L_0x004e:
                r0.clearFocus()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.platform.PlatformViewsController.AnonymousClass1.clearFocus(int):void");
        }

        @TargetApi(19)
        public void createForPlatformViewLayer(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
            ensureValidAndroidVersion(19);
            int i2 = platformViewCreationRequest.viewId;
            if (PlatformViewsController.validateDirection(platformViewCreationRequest.direction)) {
                PlatformViewFactory factory = PlatformViewsController.this.registry.getFactory(platformViewCreationRequest.viewType);
                if (factory != null) {
                    Object obj = null;
                    if (platformViewCreationRequest.params != null) {
                        obj = factory.getCreateArgsCodec().decodeMessage(platformViewCreationRequest.params);
                    }
                    PlatformView create = factory.create(PlatformViewsController.this.context, i2, obj);
                    create.getView().setLayoutDirection(platformViewCreationRequest.direction);
                    PlatformViewsController.this.platformViews.put(i2, create);
                    Log.i(PlatformViewsController.TAG, "Using hybrid composition for platform view: " + i2);
                    return;
                }
                throw new IllegalStateException("Trying to create a platform view of unregistered type: " + platformViewCreationRequest.viewType);
            }
            throw new IllegalStateException("Trying to create a view with unknown direction value: " + platformViewCreationRequest.direction + "(view id: " + i2 + ")");
        }

        @TargetApi(20)
        public long createForTextureLayer(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
            long j2;
            PlatformViewWrapper platformViewWrapper;
            int i2 = platformViewCreationRequest.viewId;
            if (PlatformViewsController.this.viewWrappers.get(i2) != null) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + i2);
            } else if (!PlatformViewsController.validateDirection(platformViewCreationRequest.direction)) {
                throw new IllegalStateException("Trying to create a view with unknown direction value: " + platformViewCreationRequest.direction + "(view id: " + i2 + ")");
            } else if (PlatformViewsController.this.textureRegistry == null) {
                throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i2);
            } else if (PlatformViewsController.this.flutterView != null) {
                PlatformViewFactory factory = PlatformViewsController.this.registry.getFactory(platformViewCreationRequest.viewType);
                if (factory != null) {
                    Object obj = null;
                    if (platformViewCreationRequest.params != null) {
                        obj = factory.getCreateArgsCodec().decodeMessage(platformViewCreationRequest.params);
                    }
                    Object obj2 = obj;
                    PlatformView create = factory.create(new MutableContextWrapper(PlatformViewsController.this.context), i2, obj2);
                    PlatformViewsController.this.platformViews.put(i2, create);
                    View view = create.getView();
                    if (view == null) {
                        throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
                    } else if (view.getParent() == null) {
                        view.setLayoutDirection(platformViewCreationRequest.direction);
                        int access$700 = PlatformViewsController.this.toPhysicalPixels(platformViewCreationRequest.logicalWidth);
                        int access$7002 = PlatformViewsController.this.toPhysicalPixels(platformViewCreationRequest.logicalHeight);
                        boolean z = ViewUtils.hasChildViewOfType(view, PlatformViewsController.VIEW_TYPES_REQUIRE_VIRTUAL_DISPLAY) || Build.VERSION.SDK_INT < 23;
                        if (PlatformViewsController.this.usesSoftwareRendering || !z) {
                            ensureValidAndroidVersion(23);
                            Log.i(PlatformViewsController.TAG, "Hosting view in view hierarchy for platform view: " + i2);
                            if (PlatformViewsController.this.usesSoftwareRendering) {
                                platformViewWrapper = new PlatformViewWrapper(PlatformViewsController.this.context);
                                j2 = -1;
                            } else {
                                TextureRegistry.SurfaceTextureEntry createSurfaceTexture = PlatformViewsController.this.textureRegistry.createSurfaceTexture();
                                PlatformViewWrapper platformViewWrapper2 = new PlatformViewWrapper(PlatformViewsController.this.context, createSurfaceTexture);
                                long id = createSurfaceTexture.id();
                                platformViewWrapper = platformViewWrapper2;
                                j2 = id;
                            }
                            platformViewWrapper.setTouchProcessor(PlatformViewsController.this.androidTouchProcessor);
                            platformViewWrapper.setBufferSize(access$700, access$7002);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(access$700, access$7002);
                            int access$7003 = PlatformViewsController.this.toPhysicalPixels(platformViewCreationRequest.logicalTop);
                            int access$7004 = PlatformViewsController.this.toPhysicalPixels(platformViewCreationRequest.logicalLeft);
                            layoutParams.topMargin = access$7003;
                            layoutParams.leftMargin = access$7004;
                            platformViewWrapper.setLayoutParams(layoutParams);
                            view.setLayoutParams(new FrameLayout.LayoutParams(access$700, access$7002));
                            view.setImportantForAccessibility(4);
                            platformViewWrapper.addView(view);
                            platformViewWrapper.setOnDescendantFocusChangeListener(new a(this, i2));
                            PlatformViewsController.this.flutterView.addView(platformViewWrapper);
                            PlatformViewsController.this.viewWrappers.append(i2, platformViewWrapper);
                            return j2;
                        }
                        Log.i(PlatformViewsController.TAG, "Hosting view in a virtual display for platform view: " + i2);
                        ensureValidAndroidVersion(20);
                        TextureRegistry.SurfaceTextureEntry createSurfaceTexture2 = PlatformViewsController.this.textureRegistry.createSurfaceTexture();
                        VirtualDisplayController create2 = VirtualDisplayController.create(PlatformViewsController.this.context, PlatformViewsController.this.accessibilityEventsDelegate, create, createSurfaceTexture2, access$700, access$7002, platformViewCreationRequest.viewId, obj2, new c(this, platformViewCreationRequest));
                        if (create2 != null) {
                            if (PlatformViewsController.this.flutterView != null) {
                                create2.onFlutterViewAttached(PlatformViewsController.this.flutterView);
                            }
                            PlatformViewsController.this.vdControllers.put(Integer.valueOf(platformViewCreationRequest.viewId), create2);
                            PlatformViewsController.this.contextToEmbeddedView.put(view.getContext(), view);
                            return createSurfaceTexture2.id();
                        }
                        throw new IllegalStateException("Failed creating virtual display for a " + platformViewCreationRequest.viewType + " with id: " + platformViewCreationRequest.viewId);
                    } else {
                        throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
                    }
                } else {
                    throw new IllegalStateException("Trying to create a platform view of unregistered type: " + platformViewCreationRequest.viewType);
                }
            } else {
                throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i2);
            }
        }

        public void dispose(int i2) {
            PlatformView platformView = (PlatformView) PlatformViewsController.this.platformViews.get(i2);
            if (platformView == null) {
                Log.e(PlatformViewsController.TAG, "Disposing unknown platform view with id: " + i2);
                return;
            }
            PlatformViewsController.this.platformViews.remove(i2);
            try {
                platformView.dispose();
            } catch (RuntimeException e2) {
                Log.e(PlatformViewsController.TAG, "Disposing platform view threw an exception", e2);
            }
            if (PlatformViewsController.this.usesVirtualDisplay(i2)) {
                View view = PlatformViewsController.this.vdControllers.get(Integer.valueOf(i2)).getView();
                if (view != null) {
                    PlatformViewsController.this.contextToEmbeddedView.remove(view.getContext());
                }
                PlatformViewsController.this.vdControllers.remove(Integer.valueOf(i2));
                return;
            }
            PlatformViewWrapper platformViewWrapper = (PlatformViewWrapper) PlatformViewsController.this.viewWrappers.get(i2);
            if (platformViewWrapper != null) {
                platformViewWrapper.removeAllViews();
                platformViewWrapper.release();
                platformViewWrapper.unsetOnDescendantFocusChangeListener();
                ViewGroup viewGroup = (ViewGroup) platformViewWrapper.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(platformViewWrapper);
                }
                PlatformViewsController.this.viewWrappers.remove(i2);
                return;
            }
            FlutterMutatorView flutterMutatorView = (FlutterMutatorView) PlatformViewsController.this.platformViewParent.get(i2);
            if (flutterMutatorView != null) {
                flutterMutatorView.removeAllViews();
                flutterMutatorView.unsetOnDescendantFocusChangeListener();
                ViewGroup viewGroup2 = (ViewGroup) flutterMutatorView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(flutterMutatorView);
                }
                PlatformViewsController.this.platformViewParent.remove(i2);
            }
        }

        public void offset(int i2, double d2, double d3) {
            if (!PlatformViewsController.this.usesVirtualDisplay(i2)) {
                PlatformViewWrapper platformViewWrapper = (PlatformViewWrapper) PlatformViewsController.this.viewWrappers.get(i2);
                if (platformViewWrapper == null) {
                    Log.e(PlatformViewsController.TAG, "Setting offset for unknown platform view with id: " + i2);
                    return;
                }
                int access$700 = PlatformViewsController.this.toPhysicalPixels(d2);
                int access$7002 = PlatformViewsController.this.toPhysicalPixels(d3);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) platformViewWrapper.getLayoutParams();
                layoutParams.topMargin = access$700;
                layoutParams.leftMargin = access$7002;
                platformViewWrapper.setLayoutParams(layoutParams);
            }
        }

        public void onTouch(PlatformViewsChannel.PlatformViewTouch platformViewTouch) {
            int i2 = platformViewTouch.viewId;
            float f2 = PlatformViewsController.this.context.getResources().getDisplayMetrics().density;
            if (PlatformViewsController.this.usesVirtualDisplay(i2)) {
                PlatformViewsController.this.vdControllers.get(Integer.valueOf(i2)).dispatchTouchEvent(PlatformViewsController.this.toMotionEvent(f2, platformViewTouch, true));
                return;
            }
            PlatformView platformView = (PlatformView) PlatformViewsController.this.platformViews.get(i2);
            if (platformView == null) {
                Log.e(PlatformViewsController.TAG, "Sending touch to an unknown view with id: " + i2);
                return;
            }
            View view = platformView.getView();
            if (view == null) {
                Log.e(PlatformViewsController.TAG, "Sending touch to a null view with id: " + i2);
                return;
            }
            view.dispatchTouchEvent(PlatformViewsController.this.toMotionEvent(f2, platformViewTouch, false));
        }

        public void resize(PlatformViewsChannel.PlatformViewResizeRequest platformViewResizeRequest, PlatformViewsChannel.PlatformViewBufferResized platformViewBufferResized) {
            int access$700 = PlatformViewsController.this.toPhysicalPixels(platformViewResizeRequest.newLogicalWidth);
            int access$7002 = PlatformViewsController.this.toPhysicalPixels(platformViewResizeRequest.newLogicalHeight);
            int i2 = platformViewResizeRequest.viewId;
            if (PlatformViewsController.this.usesVirtualDisplay(i2)) {
                VirtualDisplayController virtualDisplayController = PlatformViewsController.this.vdControllers.get(Integer.valueOf(i2));
                PlatformViewsController.this.lockInputConnection(virtualDisplayController);
                virtualDisplayController.resize(access$700, access$7002, new b(this, virtualDisplayController, platformViewBufferResized));
                return;
            }
            PlatformView platformView = (PlatformView) PlatformViewsController.this.platformViews.get(i2);
            PlatformViewWrapper platformViewWrapper = (PlatformViewWrapper) PlatformViewsController.this.viewWrappers.get(i2);
            if (platformView == null || platformViewWrapper == null) {
                Log.e(PlatformViewsController.TAG, "Resizing unknown platform view with id: " + i2);
                return;
            }
            if (access$700 > platformViewWrapper.getBufferWidth() || access$7002 > platformViewWrapper.getBufferHeight()) {
                platformViewWrapper.setBufferSize(access$700, access$7002);
            }
            ViewGroup.LayoutParams layoutParams = platformViewWrapper.getLayoutParams();
            layoutParams.width = access$700;
            layoutParams.height = access$7002;
            platformViewWrapper.setLayoutParams(layoutParams);
            View view = platformView.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = access$700;
                layoutParams2.height = access$7002;
                view.setLayoutParams(layoutParams2);
            }
            platformViewBufferResized.run(new PlatformViewsChannel.PlatformViewBufferSize(PlatformViewsController.this.toLogicalPixels((double) platformViewWrapper.getBufferWidth()), PlatformViewsController.this.toLogicalPixels((double) platformViewWrapper.getBufferHeight())));
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void setDirection(int r4, int r5) {
            /*
                r3 = this;
                boolean r0 = io.flutter.plugin.platform.PlatformViewsController.validateDirection(r5)
                if (r0 == 0) goto L_0x0058
                io.flutter.plugin.platform.PlatformViewsController r0 = io.flutter.plugin.platform.PlatformViewsController.this
                boolean r0 = r0.usesVirtualDisplay(r4)
                java.lang.String r1 = "PlatformViewsController"
                if (r0 == 0) goto L_0x0023
                io.flutter.plugin.platform.PlatformViewsController r0 = io.flutter.plugin.platform.PlatformViewsController.this
                java.util.HashMap<java.lang.Integer, io.flutter.plugin.platform.VirtualDisplayController> r0 = r0.vdControllers
                java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
                java.lang.Object r0 = r0.get(r2)
                io.flutter.plugin.platform.VirtualDisplayController r0 = (io.flutter.plugin.platform.VirtualDisplayController) r0
                android.view.View r0 = r0.getView()
                goto L_0x004a
            L_0x0023:
                io.flutter.plugin.platform.PlatformViewsController r0 = io.flutter.plugin.platform.PlatformViewsController.this
                android.util.SparseArray r0 = r0.platformViews
                java.lang.Object r0 = r0.get(r4)
                io.flutter.plugin.platform.PlatformView r0 = (io.flutter.plugin.platform.PlatformView) r0
                if (r0 != 0) goto L_0x0046
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "Setting direction to an unknown view with id: "
            L_0x0038:
                r5.append(r0)
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                io.flutter.Log.e(r1, r4)
                return
            L_0x0046:
                android.view.View r0 = r0.getView()
            L_0x004a:
                if (r0 != 0) goto L_0x0054
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "Setting direction to a null view with id: "
                goto L_0x0038
            L_0x0054:
                r0.setLayoutDirection(r5)
                return
            L_0x0058:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Trying to set unknown direction value: "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = "(view id: "
                r1.append(r5)
                r1.append(r4)
                java.lang.String r4 = ")"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.platform.PlatformViewsController.AnonymousClass1.setDirection(int, int):void");
        }

        public void synchronizeToNativeViewHierarchy(boolean z) {
            boolean unused = PlatformViewsController.this.synchronizeToNativeViewHierarchy = z;
        }
    };
    /* access modifiers changed from: private */
    public Context context;
    final HashMap<Context, View> contextToEmbeddedView = new HashMap<>();
    private final HashSet<Integer> currentFrameUsedOverlayLayerIds = new HashSet<>();
    private final HashSet<Integer> currentFrameUsedPlatformViewIds = new HashSet<>();
    /* access modifiers changed from: private */
    public FlutterView flutterView;
    private boolean flutterViewConvertedToImageView = false;
    private final MotionEventTracker motionEventTracker = MotionEventTracker.getInstance();
    private int nextOverlayLayerId = 0;
    private final SparseArray<FlutterImageView> overlayLayerViews = new SparseArray<>();
    /* access modifiers changed from: private */
    public final SparseArray<FlutterMutatorView> platformViewParent = new SparseArray<>();
    /* access modifiers changed from: private */
    public final SparseArray<PlatformView> platformViews = new SparseArray<>();
    /* access modifiers changed from: private */
    public PlatformViewsChannel platformViewsChannel;
    /* access modifiers changed from: private */
    public final PlatformViewRegistryImpl registry = new PlatformViewRegistryImpl();
    /* access modifiers changed from: private */
    public boolean synchronizeToNativeViewHierarchy = true;
    /* access modifiers changed from: private */
    public TextInputPlugin textInputPlugin;
    /* access modifiers changed from: private */
    public TextureRegistry textureRegistry;
    /* access modifiers changed from: private */
    public boolean usesSoftwareRendering = false;
    final HashMap<Integer, VirtualDisplayController> vdControllers = new HashMap<>();
    /* access modifiers changed from: private */
    public final SparseArray<PlatformViewWrapper> viewWrappers = new SparseArray<>();

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void b(int i2, View view, boolean z) {
        if (z) {
            this.platformViewsChannel.invokeViewFocused(i2);
            return;
        }
        TextInputPlugin textInputPlugin2 = this.textInputPlugin;
        if (textInputPlugin2 != null) {
            textInputPlugin2.clearPlatformViewClient(i2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void d() {
        finishFrame(false);
    }

    private void diposeAllViews() {
        while (this.platformViews.size() > 0) {
            this.channelHandler.dispose(this.platformViews.keyAt(0));
        }
    }

    private void finishFrame(boolean z) {
        for (int i2 = 0; i2 < this.overlayLayerViews.size(); i2++) {
            int keyAt = this.overlayLayerViews.keyAt(i2);
            FlutterImageView valueAt = this.overlayLayerViews.valueAt(i2);
            if (this.currentFrameUsedOverlayLayerIds.contains(Integer.valueOf(keyAt))) {
                this.flutterView.attachOverlaySurfaceToRender(valueAt);
                z &= valueAt.acquireLatestImage();
            } else {
                if (!this.flutterViewConvertedToImageView) {
                    valueAt.detachFromRenderer();
                }
                valueAt.setVisibility(8);
            }
        }
        for (int i3 = 0; i3 < this.platformViewParent.size(); i3++) {
            int keyAt2 = this.platformViewParent.keyAt(i3);
            View view = this.platformViewParent.get(keyAt2);
            if (!this.currentFrameUsedPlatformViewIds.contains(Integer.valueOf(keyAt2)) || (!z && this.synchronizeToNativeViewHierarchy)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    private float getDisplayDensity() {
        return this.context.getResources().getDisplayMetrics().density;
    }

    private void initializeRootImageViewIfNeeded() {
        if (this.synchronizeToNativeViewHierarchy && !this.flutterViewConvertedToImageView) {
            this.flutterView.convertToImageView();
            this.flutterViewConvertedToImageView = true;
        }
    }

    /* access modifiers changed from: private */
    public void lockInputConnection(VirtualDisplayController virtualDisplayController) {
        TextInputPlugin textInputPlugin2 = this.textInputPlugin;
        if (textInputPlugin2 != null) {
            textInputPlugin2.lockPlatformViewInputConnection();
            virtualDisplayController.onInputConnectionLocked();
        }
    }

    private static MotionEvent.PointerCoords parsePointerCoords(Object obj, float f2) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        pointerCoords.toolMajor = ((float) ((Double) list.get(3)).doubleValue()) * f2;
        pointerCoords.toolMinor = ((float) ((Double) list.get(4)).doubleValue()) * f2;
        pointerCoords.touchMajor = ((float) ((Double) list.get(5)).doubleValue()) * f2;
        pointerCoords.touchMinor = ((float) ((Double) list.get(6)).doubleValue()) * f2;
        pointerCoords.x = ((float) ((Double) list.get(7)).doubleValue()) * f2;
        pointerCoords.y = ((float) ((Double) list.get(8)).doubleValue()) * f2;
        return pointerCoords;
    }

    private static List<MotionEvent.PointerCoords> parsePointerCoordsList(Object obj, float f2) {
        ArrayList arrayList = new ArrayList();
        for (Object parsePointerCoords : (List) obj) {
            arrayList.add(parsePointerCoords(parsePointerCoords, f2));
        }
        return arrayList;
    }

    private static MotionEvent.PointerProperties parsePointerProperties(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    private static List<MotionEvent.PointerProperties> parsePointerPropertiesList(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object parsePointerProperties : (List) obj) {
            arrayList.add(parsePointerProperties(parsePointerProperties));
        }
        return arrayList;
    }

    private void removeOverlaySurfaces() {
        if (this.flutterView == null) {
            Log.e(TAG, "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i2 = 0; i2 < this.overlayLayerViews.size(); i2++) {
            this.flutterView.removeView(this.overlayLayerViews.valueAt(i2));
        }
        this.overlayLayerViews.clear();
    }

    /* access modifiers changed from: private */
    public int toLogicalPixels(double d2) {
        return (int) Math.round(d2 / ((double) getDisplayDensity()));
    }

    /* access modifiers changed from: private */
    public int toPhysicalPixels(double d2) {
        return (int) Math.round(d2 * ((double) getDisplayDensity()));
    }

    /* access modifiers changed from: private */
    public void unlockInputConnection(VirtualDisplayController virtualDisplayController) {
        TextInputPlugin textInputPlugin2 = this.textInputPlugin;
        if (textInputPlugin2 != null) {
            textInputPlugin2.unlockPlatformViewInputConnection();
            virtualDisplayController.onInputConnectionUnlocked();
        }
    }

    /* access modifiers changed from: private */
    public static boolean validateDirection(int i2) {
        return i2 == 0 || i2 == 1;
    }

    public void attach(Context context2, TextureRegistry textureRegistry2, DartExecutor dartExecutor) {
        if (this.context == null) {
            this.context = context2;
            this.textureRegistry = textureRegistry2;
            PlatformViewsChannel platformViewsChannel2 = new PlatformViewsChannel(dartExecutor);
            this.platformViewsChannel = platformViewsChannel2;
            platformViewsChannel2.setPlatformViewsHandler(this.channelHandler);
            return;
        }
        throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
    }

    public void attachAccessibilityBridge(AccessibilityBridge accessibilityBridge) {
        this.accessibilityEventsDelegate.setAccessibilityBridge(accessibilityBridge);
    }

    public void attachTextInputPlugin(TextInputPlugin textInputPlugin2) {
        this.textInputPlugin = textInputPlugin2;
    }

    public void attachToFlutterRenderer(FlutterRenderer flutterRenderer) {
        this.androidTouchProcessor = new AndroidTouchProcessor(flutterRenderer, true);
    }

    public void attachToView(FlutterView flutterView2) {
        this.flutterView = flutterView2;
        for (int i2 = 0; i2 < this.viewWrappers.size(); i2++) {
            this.flutterView.addView(this.viewWrappers.valueAt(i2));
        }
        for (int i3 = 0; i3 < this.platformViewParent.size(); i3++) {
            this.flutterView.addView(this.platformViewParent.valueAt(i3));
        }
        for (int i4 = 0; i4 < this.platformViews.size(); i4++) {
            this.platformViews.valueAt(i4).onFlutterViewAttached(this.flutterView);
        }
    }

    public boolean checkInputConnectionProxy(View view) {
        if (view == null || !this.contextToEmbeddedView.containsKey(view.getContext())) {
            return false;
        }
        View view2 = this.contextToEmbeddedView.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    @TargetApi(19)
    public FlutterOverlaySurface createOverlaySurface() {
        return createOverlaySurface(new FlutterImageView(this.flutterView.getContext(), this.flutterView.getWidth(), this.flutterView.getHeight(), FlutterImageView.SurfaceKind.overlay));
    }

    @TargetApi(19)
    public FlutterOverlaySurface createOverlaySurface(FlutterImageView flutterImageView) {
        int i2 = this.nextOverlayLayerId;
        this.nextOverlayLayerId = i2 + 1;
        this.overlayLayerViews.put(i2, flutterImageView);
        return new FlutterOverlaySurface(i2, flutterImageView.getSurface());
    }

    public void destroyOverlaySurfaces() {
        for (int i2 = 0; i2 < this.overlayLayerViews.size(); i2++) {
            FlutterImageView valueAt = this.overlayLayerViews.valueAt(i2);
            valueAt.detachFromRenderer();
            valueAt.closeImageReader();
        }
    }

    public void detach() {
        PlatformViewsChannel platformViewsChannel2 = this.platformViewsChannel;
        if (platformViewsChannel2 != null) {
            platformViewsChannel2.setPlatformViewsHandler((PlatformViewsChannel.PlatformViewsHandler) null);
        }
        destroyOverlaySurfaces();
        this.platformViewsChannel = null;
        this.context = null;
        this.textureRegistry = null;
    }

    public void detachAccessibilityBridge() {
        this.accessibilityEventsDelegate.setAccessibilityBridge((AccessibilityBridge) null);
    }

    public void detachFromView() {
        for (int i2 = 0; i2 < this.viewWrappers.size(); i2++) {
            this.flutterView.removeView(this.viewWrappers.valueAt(i2));
        }
        for (int i3 = 0; i3 < this.platformViewParent.size(); i3++) {
            this.flutterView.removeView(this.platformViewParent.valueAt(i3));
        }
        destroyOverlaySurfaces();
        removeOverlaySurfaces();
        this.flutterView = null;
        this.flutterViewConvertedToImageView = false;
        for (int i4 = 0; i4 < this.platformViews.size(); i4++) {
            this.platformViews.valueAt(i4).onFlutterViewDetached();
        }
    }

    public void detachTextInputPlugin() {
        this.textInputPlugin = null;
    }

    public View getPlatformViewById(int i2) {
        if (usesVirtualDisplay(i2)) {
            return this.vdControllers.get(Integer.valueOf(i2)).getView();
        }
        PlatformView platformView = this.platformViews.get(i2);
        if (platformView == null) {
            return null;
        }
        return platformView.getView();
    }

    public PlatformViewRegistry getRegistry() {
        return this.registry;
    }

    /* access modifiers changed from: package-private */
    @TargetApi(19)
    public void initializePlatformViewIfNeeded(int i2) {
        PlatformView platformView = this.platformViews.get(i2);
        if (platformView == null) {
            throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
        } else if (this.platformViewParent.get(i2) == null) {
            View view = platformView.getView();
            if (view == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            } else if (view.getParent() == null) {
                Context context2 = this.context;
                FlutterMutatorView flutterMutatorView = new FlutterMutatorView(context2, context2.getResources().getDisplayMetrics().density, this.androidTouchProcessor);
                flutterMutatorView.setOnDescendantFocusChangeListener(new e(this, i2));
                this.platformViewParent.put(i2, flutterMutatorView);
                view.setImportantForAccessibility(4);
                flutterMutatorView.addView(view);
                this.flutterView.addView(flutterMutatorView);
            } else {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
        }
    }

    public void onAttachedToJNI() {
    }

    public void onBeginFrame() {
        this.currentFrameUsedOverlayLayerIds.clear();
        this.currentFrameUsedPlatformViewIds.clear();
    }

    public void onDetachedFromJNI() {
        diposeAllViews();
    }

    public void onDisplayOverlaySurface(int i2, int i3, int i4, int i5, int i6) {
        if (this.overlayLayerViews.get(i2) != null) {
            initializeRootImageViewIfNeeded();
            FlutterImageView flutterImageView = this.overlayLayerViews.get(i2);
            if (flutterImageView.getParent() == null) {
                this.flutterView.addView(flutterImageView);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i6);
            layoutParams.leftMargin = i3;
            layoutParams.topMargin = i4;
            flutterImageView.setLayoutParams(layoutParams);
            flutterImageView.setVisibility(0);
            flutterImageView.bringToFront();
            this.currentFrameUsedOverlayLayerIds.add(Integer.valueOf(i2));
            return;
        }
        throw new IllegalStateException("The overlay surface (id:" + i2 + ") doesn't exist");
    }

    public void onDisplayPlatformView(int i2, int i3, int i4, int i5, int i6, int i7, int i8, FlutterMutatorsStack flutterMutatorsStack) {
        initializeRootImageViewIfNeeded();
        initializePlatformViewIfNeeded(i2);
        FlutterMutatorView flutterMutatorView = this.platformViewParent.get(i2);
        flutterMutatorView.readyToDisplay(flutterMutatorsStack, i3, i4, i5, i6);
        flutterMutatorView.setVisibility(0);
        flutterMutatorView.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, i8);
        View view = this.platformViews.get(i2).getView();
        if (view != null) {
            view.setLayoutParams(layoutParams);
            view.bringToFront();
        }
        this.currentFrameUsedPlatformViewIds.add(Integer.valueOf(i2));
    }

    public void onEndFrame() {
        boolean z = false;
        if (!this.flutterViewConvertedToImageView || !this.currentFrameUsedPlatformViewIds.isEmpty()) {
            if (this.flutterViewConvertedToImageView && this.flutterView.acquireLatestImageViewFrame()) {
                z = true;
            }
            finishFrame(z);
            return;
        }
        this.flutterViewConvertedToImageView = false;
        this.flutterView.revertImageView(new d(this));
    }

    public void onPreEngineRestart() {
        diposeAllViews();
    }

    public void setSoftwareRendering(boolean z) {
        this.usesSoftwareRendering = z;
    }

    public MotionEvent toMotionEvent(float f2, PlatformViewsChannel.PlatformViewTouch platformViewTouch, boolean z) {
        PlatformViewsChannel.PlatformViewTouch platformViewTouch2 = platformViewTouch;
        MotionEvent pop = this.motionEventTracker.pop(MotionEventTracker.MotionEventId.from(platformViewTouch2.motionEventId));
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) parsePointerPropertiesList(platformViewTouch2.rawPointerPropertiesList).toArray(new MotionEvent.PointerProperties[platformViewTouch2.pointerCount]);
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) parsePointerCoordsList(platformViewTouch2.rawPointerCoords, f2).toArray(new MotionEvent.PointerCoords[platformViewTouch2.pointerCount]);
        if (!z && pop != null) {
            return MotionEvent.obtain(pop.getDownTime(), pop.getEventTime(), pop.getAction(), platformViewTouch2.pointerCount, pointerPropertiesArr, pointerCoordsArr, pop.getMetaState(), pop.getButtonState(), pop.getXPrecision(), pop.getYPrecision(), pop.getDeviceId(), pop.getEdgeFlags(), pop.getSource(), pop.getFlags());
        }
        return MotionEvent.obtain(platformViewTouch2.downTime.longValue(), platformViewTouch2.eventTime.longValue(), platformViewTouch2.action, platformViewTouch2.pointerCount, pointerPropertiesArr, pointerCoordsArr, platformViewTouch2.metaState, platformViewTouch2.buttonState, platformViewTouch2.xPrecision, platformViewTouch2.yPrecision, platformViewTouch2.deviceId, platformViewTouch2.edgeFlags, platformViewTouch2.source, platformViewTouch2.flags);
    }

    public boolean usesVirtualDisplay(int i2) {
        return this.vdControllers.containsKey(Integer.valueOf(i2));
    }
}
