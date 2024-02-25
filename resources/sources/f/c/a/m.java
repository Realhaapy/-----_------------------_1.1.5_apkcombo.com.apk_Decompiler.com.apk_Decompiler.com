package f.c.a;

import android.app.Activity;
import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;

public final class m implements FlutterPlugin, ActivityAware {

    /* renamed from: e  reason: collision with root package name */
    private final n f3723e = new n();

    /* renamed from: f  reason: collision with root package name */
    private MethodChannel f3724f;

    /* renamed from: g  reason: collision with root package name */
    private PluginRegistry.Registrar f3725g;

    /* renamed from: h  reason: collision with root package name */
    private ActivityPluginBinding f3726h;

    /* renamed from: i  reason: collision with root package name */
    private l f3727i;

    private void a() {
        ActivityPluginBinding activityPluginBinding = this.f3726h;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this.f3723e);
            this.f3726h.removeRequestPermissionsResultListener(this.f3723e);
        }
    }

    private void b() {
        PluginRegistry.Registrar registrar = this.f3725g;
        if (registrar != null) {
            registrar.addActivityResultListener(this.f3723e);
            this.f3725g.addRequestPermissionsResultListener(this.f3723e);
            return;
        }
        ActivityPluginBinding activityPluginBinding = this.f3726h;
        if (activityPluginBinding != null) {
            activityPluginBinding.addActivityResultListener(this.f3723e);
            this.f3726h.addRequestPermissionsResultListener(this.f3723e);
        }
    }

    private void c(Context context, BinaryMessenger binaryMessenger) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "flutter.baseflow.com/permissions/methods");
        this.f3724f = methodChannel;
        l lVar = new l(context, new j(), this.f3723e, new p());
        this.f3727i = lVar;
        methodChannel.setMethodCallHandler(lVar);
    }

    private void d(Activity activity) {
        l lVar = this.f3727i;
        if (lVar != null) {
            lVar.e(activity);
        }
    }

    private void e() {
        this.f3724f.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.f3724f = null;
        this.f3727i = null;
    }

    private void f() {
        l lVar = this.f3727i;
        if (lVar != null) {
            lVar.e((Activity) null);
        }
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        d(activityPluginBinding.getActivity());
        this.f3726h = activityPluginBinding;
        b();
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        c(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
    }

    public void onDetachedFromActivity() {
        f();
        a();
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        e();
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
