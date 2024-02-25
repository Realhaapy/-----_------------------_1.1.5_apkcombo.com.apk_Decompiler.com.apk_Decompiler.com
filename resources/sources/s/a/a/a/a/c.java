package s.a.a.a.a;

import android.app.Activity;
import androidx.appcompat.app.e;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

public class c implements MethodChannel.MethodCallHandler, FlutterPlugin, ActivityAware {

    /* renamed from: e  reason: collision with root package name */
    private b f5827e;

    /* renamed from: f  reason: collision with root package name */
    private ActivityPluginBinding f5828f;

    static {
        e.A(true);
    }

    private void b(BinaryMessenger binaryMessenger) {
        new MethodChannel(binaryMessenger, "plugins.hunghd.vn/image_cropper").setMethodCallHandler(this);
    }

    public b a(Activity activity) {
        b bVar = new b(activity);
        this.f5827e = bVar;
        return bVar;
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        a(activityPluginBinding.getActivity());
        this.f5828f = activityPluginBinding;
        activityPluginBinding.addActivityResultListener(this.f5827e);
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        b(flutterPluginBinding.getBinaryMessenger());
    }

    public void onDetachedFromActivity() {
        this.f5828f.removeActivityResultListener(this.f5827e);
        this.f5828f = null;
        this.f5827e = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.method.equals("cropImage")) {
            this.f5827e.j(methodCall, result);
        } else if (methodCall.method.equals("recoverImage")) {
            this.f5827e.h(methodCall, result);
        }
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
