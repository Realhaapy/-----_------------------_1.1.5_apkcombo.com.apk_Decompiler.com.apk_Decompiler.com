package com.mr.flutter.plugin.filepicker;

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
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;

public class FilePickerPlugin implements MethodChannel.MethodCallHandler, FlutterPlugin, ActivityAware {

    /* renamed from: m  reason: collision with root package name */
    private static String f2928m = null;

    /* renamed from: n  reason: collision with root package name */
    private static boolean f2929n = false;

    /* renamed from: o  reason: collision with root package name */
    private static boolean f2930o = false;

    /* renamed from: e  reason: collision with root package name */
    private ActivityPluginBinding f2931e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public b f2932f;

    /* renamed from: g  reason: collision with root package name */
    private Application f2933g;

    /* renamed from: h  reason: collision with root package name */
    private FlutterPlugin.FlutterPluginBinding f2934h;

    /* renamed from: i  reason: collision with root package name */
    private e f2935i;

    /* renamed from: j  reason: collision with root package name */
    private LifeCycleObserver f2936j;

    /* renamed from: k  reason: collision with root package name */
    private Activity f2937k;

    /* renamed from: l  reason: collision with root package name */
    private MethodChannel f2938l;

    private class LifeCycleObserver implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

        /* renamed from: e  reason: collision with root package name */
        private final Activity f2939e;

        LifeCycleObserver(FilePickerPlugin filePickerPlugin, Activity activity) {
            this.f2939e = activity;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f2939e == activity && activity.getApplicationContext() != null) {
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
        }

        public void onCreate(h hVar) {
        }

        public void onDestroy(h hVar) {
            onActivityDestroyed(this.f2939e);
        }

        public void onPause(h hVar) {
        }

        public void onResume(h hVar) {
        }

        public void onStart(h hVar) {
        }

        public void onStop(h hVar) {
            onActivityStopped(this.f2939e);
        }
    }

    class a implements EventChannel.StreamHandler {
        a() {
        }

        public void onCancel(Object obj) {
            FilePickerPlugin.this.f2932f.l((EventChannel.EventSink) null);
        }

        public void onListen(Object obj, EventChannel.EventSink eventSink) {
            FilePickerPlugin.this.f2932f.l(eventSink);
        }
    }

    private static class b implements MethodChannel.Result {
        /* access modifiers changed from: private */
        public final MethodChannel.Result a;
        private final Handler b = new Handler(Looper.getMainLooper());

        class a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Object f2940e;

            a(Object obj) {
                this.f2940e = obj;
            }

            public void run() {
                b.this.a.success(this.f2940e);
            }
        }

        /* renamed from: com.mr.flutter.plugin.filepicker.FilePickerPlugin$b$b  reason: collision with other inner class name */
        class C0050b implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f2942e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f2943f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ Object f2944g;

            C0050b(String str, String str2, Object obj) {
                this.f2942e = str;
                this.f2943f = str2;
                this.f2944g = obj;
            }

            public void run() {
                b.this.a.error(this.f2942e, this.f2943f, this.f2944g);
            }
        }

        class c implements Runnable {
            c() {
            }

            public void run() {
                b.this.a.notImplemented();
            }
        }

        b(MethodChannel.Result result) {
            this.a = result;
        }

        public void error(String str, String str2, Object obj) {
            this.b.post(new C0050b(str, str2, obj));
        }

        public void notImplemented() {
            this.b.post(new c());
        }

        public void success(Object obj) {
            this.b.post(new a(obj));
        }
    }

    private static String b(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1349088399:
                if (str.equals("custom")) {
                    c = 0;
                    break;
                }
                break;
            case 96748:
                if (str.equals("any")) {
                    c = 1;
                    break;
                }
                break;
            case 99469:
                if (str.equals("dir")) {
                    c = 2;
                    break;
                }
                break;
            case 93166550:
                if (str.equals("audio")) {
                    c = 3;
                    break;
                }
                break;
            case 100313435:
                if (str.equals("image")) {
                    c = 4;
                    break;
                }
                break;
            case 103772132:
                if (str.equals("media")) {
                    c = 5;
                    break;
                }
                break;
            case 112202875:
                if (str.equals("video")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return "*/*";
            case 2:
                return "dir";
            case 3:
                return "audio/*";
            case 4:
                return "image/*";
            case 5:
                return "image/*,video/*";
            case 6:
                return "video/*";
            default:
                return null;
        }
    }

    private void c(BinaryMessenger binaryMessenger, Application application, Activity activity, PluginRegistry.Registrar registrar, ActivityPluginBinding activityPluginBinding) {
        this.f2937k = activity;
        this.f2933g = application;
        this.f2932f = new b(activity);
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "miguelruivo.flutter.plugins.filepicker");
        this.f2938l = methodChannel;
        methodChannel.setMethodCallHandler(this);
        new EventChannel(binaryMessenger, "miguelruivo.flutter.plugins.filepickerevent").setStreamHandler(new a());
        LifeCycleObserver lifeCycleObserver = new LifeCycleObserver(this, activity);
        this.f2936j = lifeCycleObserver;
        if (registrar != null) {
            application.registerActivityLifecycleCallbacks(lifeCycleObserver);
            registrar.addActivityResultListener(this.f2932f);
            registrar.addRequestPermissionsResultListener(this.f2932f);
            return;
        }
        activityPluginBinding.addActivityResultListener(this.f2932f);
        activityPluginBinding.addRequestPermissionsResultListener(this.f2932f);
        e activityLifecycle = FlutterLifecycleAdapter.getActivityLifecycle(activityPluginBinding);
        this.f2935i = activityLifecycle;
        activityLifecycle.a(this.f2936j);
    }

    private void d() {
        this.f2931e.removeActivityResultListener(this.f2932f);
        this.f2931e.removeRequestPermissionsResultListener(this.f2932f);
        this.f2931e = null;
        LifeCycleObserver lifeCycleObserver = this.f2936j;
        if (lifeCycleObserver != null) {
            this.f2935i.c(lifeCycleObserver);
            this.f2933g.unregisterActivityLifecycleCallbacks(this.f2936j);
        }
        this.f2935i = null;
        this.f2932f.l((EventChannel.EventSink) null);
        this.f2932f = null;
        this.f2938l.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.f2938l = null;
        this.f2933g = null;
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f2931e = activityPluginBinding;
        c(this.f2934h.getBinaryMessenger(), (Application) this.f2934h.getApplicationContext(), this.f2931e.getActivity(), (PluginRegistry.Registrar) null, this.f2931e);
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f2934h = flutterPluginBinding;
    }

    public void onDetachedFromActivity() {
        d();
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f2934h = null;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String[] strArr;
        String str;
        if (this.f2937k == null) {
            result.error("no_activity", "file picker plugin requires a foreground activity", (Object) null);
            return;
        }
        b bVar = new b(result);
        HashMap hashMap = (HashMap) methodCall.arguments;
        String str2 = methodCall.method;
        if (str2 == null || !str2.equals("clear")) {
            String b2 = b(methodCall.method);
            f2928m = b2;
            if (b2 == null) {
                bVar.notImplemented();
            } else if (b2 != "dir") {
                f2929n = ((Boolean) hashMap.get("allowMultipleSelection")).booleanValue();
                f2930o = ((Boolean) hashMap.get("withData")).booleanValue();
                strArr = c.i((ArrayList) hashMap.get("allowedExtensions"));
                str = methodCall.method;
                if (str == null && !str.equals("custom") && (strArr == null || strArr.length == 0)) {
                    bVar.error("FilePicker", "Unsupported filter. Make sure that you are only using the extension without the dot, (ie., jpg instead of .jpg). This could also have happened because you are using an unsupported file extension.  If the problem persists, you may want to consider using FileType.all instead.", (Object) null);
                    return;
                } else {
                    this.f2932f.o(f2928m, f2929n, f2930o, strArr, bVar);
                    return;
                }
            }
            strArr = null;
            str = methodCall.method;
            if (str == null && !str.equals("custom")) {
            }
            this.f2932f.o(f2928m, f2929n, f2930o, strArr, bVar);
            return;
        }
        bVar.success(Boolean.valueOf(c.a(this.f2937k.getApplicationContext())));
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
