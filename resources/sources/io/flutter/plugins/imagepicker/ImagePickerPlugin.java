package io.flutter.plugins.imagepicker;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.e;
import androidx.lifecycle.h;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.plugins.lifecycle.FlutterLifecycleAdapter;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.File;

public class ImagePickerPlugin implements MethodChannel.MethodCallHandler, FlutterPlugin, ActivityAware {
    private static final int CAMERA_DEVICE_FRONT = 1;
    private static final int CAMERA_DEVICE_REAR = 0;
    private static final String CHANNEL = "plugins.flutter.io/image_picker_android";
    static final String METHOD_CALL_IMAGE = "pickImage";
    static final String METHOD_CALL_MULTI_IMAGE = "pickMultiImage";
    private static final String METHOD_CALL_RETRIEVE = "retrieve";
    static final String METHOD_CALL_VIDEO = "pickVideo";
    private static final int SOURCE_CAMERA = 0;
    private static final int SOURCE_GALLERY = 1;
    /* access modifiers changed from: private */
    public ActivityState activityState;
    private FlutterPlugin.FlutterPluginBinding pluginBinding;

    private class ActivityState {
        private Activity activity;
        private ActivityPluginBinding activityBinding;
        private Application application;
        private MethodChannel channel;
        private ImagePickerDelegate delegate;
        private e lifecycle;
        private LifeCycleObserver observer;

        ActivityState(Application application2, Activity activity2, BinaryMessenger binaryMessenger, MethodChannel.MethodCallHandler methodCallHandler, PluginRegistry.Registrar registrar, ActivityPluginBinding activityPluginBinding) {
            this.application = application2;
            this.activity = activity2;
            this.activityBinding = activityPluginBinding;
            this.delegate = ImagePickerPlugin.this.constructDelegate(activity2);
            MethodChannel methodChannel = new MethodChannel(binaryMessenger, ImagePickerPlugin.CHANNEL);
            this.channel = methodChannel;
            methodChannel.setMethodCallHandler(methodCallHandler);
            LifeCycleObserver lifeCycleObserver = new LifeCycleObserver(activity2);
            this.observer = lifeCycleObserver;
            if (registrar != null) {
                application2.registerActivityLifecycleCallbacks(lifeCycleObserver);
                registrar.addActivityResultListener(this.delegate);
                registrar.addRequestPermissionsResultListener(this.delegate);
                return;
            }
            activityPluginBinding.addActivityResultListener(this.delegate);
            activityPluginBinding.addRequestPermissionsResultListener(this.delegate);
            e activityLifecycle = FlutterLifecycleAdapter.getActivityLifecycle(activityPluginBinding);
            this.lifecycle = activityLifecycle;
            activityLifecycle.a(this.observer);
        }

        ActivityState(ImagePickerDelegate imagePickerDelegate, Activity activity2) {
            this.activity = activity2;
            this.delegate = imagePickerDelegate;
        }

        /* access modifiers changed from: package-private */
        public Activity getActivity() {
            return this.activity;
        }

        /* access modifiers changed from: package-private */
        public ImagePickerDelegate getDelegate() {
            return this.delegate;
        }

        /* access modifiers changed from: package-private */
        public void release() {
            ActivityPluginBinding activityPluginBinding = this.activityBinding;
            if (activityPluginBinding != null) {
                activityPluginBinding.removeActivityResultListener(this.delegate);
                this.activityBinding.removeRequestPermissionsResultListener(this.delegate);
                this.activityBinding = null;
            }
            e eVar = this.lifecycle;
            if (eVar != null) {
                eVar.c(this.observer);
                this.lifecycle = null;
            }
            MethodChannel methodChannel = this.channel;
            if (methodChannel != null) {
                methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
                this.channel = null;
            }
            Application application2 = this.application;
            if (application2 != null) {
                application2.unregisterActivityLifecycleCallbacks(this.observer);
                this.application = null;
            }
            this.activity = null;
            this.observer = null;
            this.delegate = null;
        }
    }

    private class LifeCycleObserver implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {
        private final Activity thisActivity;

        LifeCycleObserver(Activity activity) {
            this.thisActivity = activity;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.thisActivity == activity && activity.getApplicationContext() != null) {
                ((Application) activity.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
            }
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
            if (this.thisActivity == activity) {
                ImagePickerPlugin.this.activityState.getDelegate().saveStateBeforeResult();
            }
        }

        public void onCreate(h hVar) {
        }

        public void onDestroy(h hVar) {
            onActivityDestroyed(this.thisActivity);
        }

        public void onPause(h hVar) {
        }

        public void onResume(h hVar) {
        }

        public void onStart(h hVar) {
        }

        public void onStop(h hVar) {
            onActivityStopped(this.thisActivity);
        }
    }

    private static class MethodResultWrapper implements MethodChannel.Result {
        private Handler handler = new Handler(Looper.getMainLooper());
        /* access modifiers changed from: private */
        public MethodChannel.Result methodResult;

        MethodResultWrapper(MethodChannel.Result result) {
            this.methodResult = result;
        }

        public void error(final String str, final String str2, final Object obj) {
            this.handler.post(new Runnable() {
                public void run() {
                    MethodResultWrapper.this.methodResult.error(str, str2, obj);
                }
            });
        }

        public void notImplemented() {
            this.handler.post(new Runnable() {
                public void run() {
                    MethodResultWrapper.this.methodResult.notImplemented();
                }
            });
        }

        public void success(final Object obj) {
            this.handler.post(new Runnable() {
                public void run() {
                    MethodResultWrapper.this.methodResult.success(obj);
                }
            });
        }
    }

    public ImagePickerPlugin() {
    }

    ImagePickerPlugin(ImagePickerDelegate imagePickerDelegate, Activity activity) {
        this.activityState = new ActivityState(imagePickerDelegate, activity);
    }

    public static void registerWith(PluginRegistry.Registrar registrar) {
        if (registrar.activity() != null) {
            Activity activity = registrar.activity();
            Application application = null;
            if (registrar.context() != null) {
                application = (Application) registrar.context().getApplicationContext();
            }
            new ImagePickerPlugin().setup(registrar.messenger(), application, activity, registrar, (ActivityPluginBinding) null);
        }
    }

    private void setup(BinaryMessenger binaryMessenger, Application application, Activity activity, PluginRegistry.Registrar registrar, ActivityPluginBinding activityPluginBinding) {
        this.activityState = new ActivityState(application, activity, binaryMessenger, this, registrar, activityPluginBinding);
    }

    private void tearDown() {
        ActivityState activityState2 = this.activityState;
        if (activityState2 != null) {
            activityState2.release();
            this.activityState = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final ImagePickerDelegate constructDelegate(Activity activity) {
        ImagePickerCache imagePickerCache = new ImagePickerCache(activity);
        File cacheDir = activity.getCacheDir();
        return new ImagePickerDelegate(activity, cacheDir, new ImageResizer(cacheDir, new ExifDataCopier()), imagePickerCache);
    }

    /* access modifiers changed from: package-private */
    public final ActivityState getActivityState() {
        return this.activityState;
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        setup(this.pluginBinding.getBinaryMessenger(), (Application) this.pluginBinding.getApplicationContext(), activityPluginBinding.getActivity(), (PluginRegistry.Registrar) null, activityPluginBinding);
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.pluginBinding = flutterPluginBinding;
    }

    public void onDetachedFromActivity() {
        tearDown();
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.pluginBinding = null;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        ActivityState activityState2 = this.activityState;
        if (activityState2 == null || activityState2.getActivity() == null) {
            result.error("no_activity", "image_picker plugin requires a foreground activity.", (Object) null);
            return;
        }
        MethodResultWrapper methodResultWrapper = new MethodResultWrapper(result);
        ImagePickerDelegate delegate = this.activityState.getDelegate();
        if (methodCall.argument("cameraDevice") != null) {
            delegate.setCameraDevice(((Integer) methodCall.argument("cameraDevice")).intValue() == 1 ? CameraDevice.FRONT : CameraDevice.REAR);
        }
        String str = methodCall.method;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1708939613:
                if (str.equals(METHOD_CALL_MULTI_IMAGE)) {
                    c = 0;
                    break;
                }
                break;
            case -1457314374:
                if (str.equals(METHOD_CALL_IMAGE)) {
                    c = 1;
                    break;
                }
                break;
            case -1445424934:
                if (str.equals(METHOD_CALL_VIDEO)) {
                    c = 2;
                    break;
                }
                break;
            case -310034372:
                if (str.equals(METHOD_CALL_RETRIEVE)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                delegate.chooseMultiImageFromGallery(methodCall, methodResultWrapper);
                return;
            case 1:
                int intValue = ((Integer) methodCall.argument("source")).intValue();
                if (intValue == 0) {
                    delegate.takeImageWithCamera(methodCall, methodResultWrapper);
                    return;
                } else if (intValue == 1) {
                    delegate.chooseImageFromGallery(methodCall, methodResultWrapper);
                    return;
                } else {
                    throw new IllegalArgumentException("Invalid image source: " + intValue);
                }
            case 2:
                int intValue2 = ((Integer) methodCall.argument("source")).intValue();
                if (intValue2 == 0) {
                    delegate.takeVideoWithCamera(methodCall, methodResultWrapper);
                    return;
                } else if (intValue2 == 1) {
                    delegate.chooseVideoFromGallery(methodCall, methodResultWrapper);
                    return;
                } else {
                    throw new IllegalArgumentException("Invalid video source: " + intValue2);
                }
            case 3:
                delegate.retrieveLostImage(methodResultWrapper);
                return;
            default:
                throw new IllegalArgumentException("Unknown method " + methodCall.method);
        }
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
