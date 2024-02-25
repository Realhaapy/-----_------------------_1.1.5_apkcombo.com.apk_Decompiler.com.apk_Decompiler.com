package k.a.a.a;

import android.app.Activity;
import android.os.Build;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

public class a implements MethodChannel.MethodCallHandler, FlutterPlugin, ActivityAware {

    /* renamed from: e  reason: collision with root package name */
    private Activity f4774e;

    private void a(BinaryMessenger binaryMessenger) {
        new MethodChannel(binaryMessenger, "flutter_windowmanager").setMethodCallHandler(this);
    }

    private boolean b(int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i2 == 1 || i2 == 2) {
            return true;
        }
        switch (i2) {
            case Integer.MIN_VALUE:
                return i3 >= 21;
            case 4:
                return i3 < 15;
            case 8:
            case 16:
            case 32:
            case 128:
            case 256:
            case 512:
            case 1024:
            case 2048:
            case 8192:
            case 16384:
            case 32768:
            case 65536:
            case 131072:
            case 262144:
            case 1048576:
            case 8388608:
            case 16777216:
                return true;
            case 64:
                return i3 < 20;
            case 4096:
                return i3 < 17;
            case 524288:
                return i3 < 27;
            case 2097152:
                return i3 < 27;
            case 4194304:
                return i3 >= 5 && i3 < 26;
            case 33554432:
                return i3 >= 18;
            case 67108864:
            case 134217728:
                return i3 >= 19;
            case 268435456:
                return i3 >= 19;
            case 1073741824:
                return i3 >= 22;
            default:
                return false;
        }
    }

    private boolean c(MethodChannel.Result result, int i2) {
        int i3 = 0;
        while (i3 < 32) {
            int i4 = 1 << i3;
            if ((i2 & i4) != 1 || b(i4)) {
                i3++;
            } else {
                result.error("FlutterWindowManagerPlugin", "FlutterWindowManagerPlugin: invalid flag specification: " + Integer.toHexString(i4), (Object) null);
                return false;
            }
        }
        return true;
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f4774e = activityPluginBinding.getActivity();
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        a(flutterPluginBinding.getBinaryMessenger());
    }

    public void onDetachedFromActivity() {
        this.f4774e = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.f4774e = null;
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Boolean bool = Boolean.TRUE;
        int intValue = ((Integer) methodCall.argument("flags")).intValue();
        if (this.f4774e == null) {
            result.error("FlutterWindowManagerPlugin", "FlutterWindowManagerPlugin: ignored flag state change, current activity is null", (Object) null);
        }
        if (c(result, intValue)) {
            String str = methodCall.method;
            str.hashCode();
            if (str.equals("addFlags")) {
                this.f4774e.getWindow().addFlags(intValue);
            } else if (!str.equals("clearFlags")) {
                result.notImplemented();
                return;
            } else {
                this.f4774e.getWindow().clearFlags(intValue);
            }
            result.success(bool);
        }
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
