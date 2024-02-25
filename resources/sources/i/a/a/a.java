package i.a.a;

import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import n.a.a.c;

public class a implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: e  reason: collision with root package name */
    private Context f4683e;

    /* renamed from: f  reason: collision with root package name */
    private MethodChannel f4684f;

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "g123k/flutter_app_badger");
        this.f4684f = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f4683e = flutterPluginBinding.getApplicationContext();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f4684f.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.f4683e = null;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.method.equals("updateBadgeCount")) {
            c.a(this.f4683e, Integer.valueOf(methodCall.argument("count").toString()).intValue());
        } else if (methodCall.method.equals("removeBadge")) {
            c.e(this.f4683e);
        } else if (methodCall.method.equals("isAppBadgeSupported")) {
            result.success(Boolean.valueOf(c.d(this.f4683e)));
            return;
        } else {
            result.notImplemented();
            return;
        }
        result.success((Object) null);
    }
}
