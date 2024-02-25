package g.a.a.a;

import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;

public class a implements FlutterPlugin {

    /* renamed from: e  reason: collision with root package name */
    MethodChannel f4643e;

    private void a(BinaryMessenger binaryMessenger, Context context) {
        this.f4643e = new MethodChannel(binaryMessenger, "dev.fluttercommunity.plus/device_info");
        this.f4643e.setMethodCallHandler(new b(context.getContentResolver(), context.getPackageManager()));
    }

    private void b() {
        this.f4643e.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.f4643e = null;
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        a(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        b();
    }
}
