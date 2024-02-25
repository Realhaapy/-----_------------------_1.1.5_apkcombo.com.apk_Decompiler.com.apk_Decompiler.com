package k.b.a.a.a;

import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import m.y.d.l;

public final class c implements FlutterPlugin {

    /* renamed from: e  reason: collision with root package name */
    private MethodChannel f4777e;

    private final void b() {
        MethodChannel methodChannel = this.f4777e;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        }
        this.f4777e = null;
    }

    public final void a(BinaryMessenger binaryMessenger, Context context) {
        l.d(binaryMessenger, "messenger");
        l.d(context, "context");
        this.f4777e = new MethodChannel(binaryMessenger, "PonnamKarthik/fluttertoast");
        d dVar = new d(context);
        MethodChannel methodChannel = this.f4777e;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(dVar);
        }
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        l.d(flutterPluginBinding, "binding");
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        l.c(binaryMessenger, "binding.binaryMessenger");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        l.c(applicationContext, "binding.applicationContext");
        a(binaryMessenger, applicationContext);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        l.d(flutterPluginBinding, "p0");
        b();
    }
}
