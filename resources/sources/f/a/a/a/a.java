package f.a.a.a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import e.c.b.d;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import m.s;
import m.y.d.g;
import m.y.d.l;
import m.y.d.m;

public final class a implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware, PluginRegistry.ActivityResultListener {

    /* renamed from: h  reason: collision with root package name */
    public static final C0100a f3711h = new C0100a((g) null);

    /* renamed from: i  reason: collision with root package name */
    private static MethodChannel.Result f3712i;

    /* renamed from: j  reason: collision with root package name */
    private static m.y.c.a<s> f3713j;

    /* renamed from: e  reason: collision with root package name */
    private final int f3714e = 1001;

    /* renamed from: f  reason: collision with root package name */
    private MethodChannel f3715f;

    /* renamed from: g  reason: collision with root package name */
    private ActivityPluginBinding f3716g;

    /* renamed from: f.a.a.a.a$a  reason: collision with other inner class name */
    public static final class C0100a {
        private C0100a() {
        }

        public /* synthetic */ C0100a(g gVar) {
            this();
        }
    }

    static final class b extends m implements m.y.c.a<s> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Activity f3717e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Activity activity) {
            super(0);
            this.f3717e = activity;
        }

        public final void a() {
            Intent launchIntentForPackage = this.f3717e.getPackageManager().getLaunchIntentForPackage(this.f3717e.getPackageName());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setPackage((String) null);
            }
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setFlags(67108864);
            }
            this.f3717e.startActivity(launchIntentForPackage);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return s.a;
        }
    }

    public boolean onActivityResult(int i2, int i3, Intent intent) {
        MethodChannel.Result result;
        if (i2 != this.f3714e || (result = f3712i) == null) {
            return false;
        }
        result.error("authorization-error/canceled", "The user closed the Custom Tab", (Object) null);
        f3712i = null;
        f3713j = null;
        return false;
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        l.d(activityPluginBinding, "binding");
        this.f3716g = activityPluginBinding;
        activityPluginBinding.addActivityResultListener(this);
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        l.d(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.aboutyou.dart_packages.sign_in_with_apple");
        this.f3715f = methodChannel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(this);
        }
    }

    public void onDetachedFromActivity() {
        ActivityPluginBinding activityPluginBinding = this.f3716g;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this);
        }
        this.f3716g = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        l.d(flutterPluginBinding, "binding");
        MethodChannel methodChannel = this.f3715f;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        }
        this.f3715f = null;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Object obj;
        String str;
        String str2;
        l.d(methodCall, "call");
        l.d(result, "result");
        String str3 = methodCall.method;
        if (l.a(str3, "isAvailable")) {
            result.success(Boolean.TRUE);
        } else if (l.a(str3, "performAuthorizationRequest")) {
            ActivityPluginBinding activityPluginBinding = this.f3716g;
            Activity activity = activityPluginBinding == null ? null : activityPluginBinding.getActivity();
            if (activity == null) {
                obj = methodCall.arguments;
                str = "MISSING_ACTIVITY";
                str2 = "Plugin is not attached to an activity";
            } else {
                String str4 = (String) methodCall.argument("url");
                if (str4 == null) {
                    obj = methodCall.arguments;
                    str = "MISSING_ARG";
                    str2 = "Missing 'url' argument";
                } else {
                    MethodChannel.Result result2 = f3712i;
                    if (result2 != null) {
                        result2.error("NEW_REQUEST", "A new request came in while this was still pending. The previous request (this one) was then cancelled.", (Object) null);
                    }
                    m.y.c.a<s> aVar = f3713j;
                    if (aVar != null) {
                        l.b(aVar);
                        aVar.invoke();
                    }
                    f3712i = result;
                    f3713j = new b(activity);
                    d a = new d.a().a();
                    l.c(a, "builder.build()");
                    a.a.addFlags(1073741824);
                    a.a.setData(Uri.parse(str4));
                    activity.startActivityForResult(a.a, this.f3714e, a.b);
                    return;
                }
            }
            result.error(str, str2, obj);
        } else {
            result.notImplemented();
        }
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        l.d(activityPluginBinding, "binding");
        onAttachedToActivity(activityPluginBinding);
    }
}
