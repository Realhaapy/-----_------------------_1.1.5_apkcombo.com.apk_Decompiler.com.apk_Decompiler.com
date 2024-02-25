package f.c.a;

import android.app.Activity;
import android.content.Context;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.List;
import java.util.Objects;

final class l implements MethodChannel.MethodCallHandler {

    /* renamed from: e  reason: collision with root package name */
    private final Context f3718e;

    /* renamed from: f  reason: collision with root package name */
    private final j f3719f;

    /* renamed from: g  reason: collision with root package name */
    private final n f3720g;

    /* renamed from: h  reason: collision with root package name */
    private final p f3721h;

    /* renamed from: i  reason: collision with root package name */
    private Activity f3722i;

    l(Context context, j jVar, n nVar, p pVar) {
        this.f3718e = context;
        this.f3719f = jVar;
        this.f3720g = nVar;
        this.f3721h = pVar;
    }

    public void e(Activity activity) {
        this.f3722i = activity;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1544053025:
                if (str.equals("checkServiceStatus")) {
                    c = 0;
                    break;
                }
                break;
            case -1017315255:
                if (str.equals("shouldShowRequestPermissionRationale")) {
                    c = 1;
                    break;
                }
                break;
            case -576207927:
                if (str.equals("checkPermissionStatus")) {
                    c = 2;
                    break;
                }
                break;
            case 347240634:
                if (str.equals("openAppSettings")) {
                    c = 3;
                    break;
                }
                break;
            case 1669188213:
                if (str.equals("requestPermissions")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                int parseInt = Integer.parseInt(methodCall.arguments.toString());
                p pVar = this.f3721h;
                Context context = this.f3718e;
                Objects.requireNonNull(result);
                pVar.a(parseInt, context, new f(result), new c(result));
                return;
            case 1:
                int parseInt2 = Integer.parseInt(methodCall.arguments.toString());
                n nVar = this.f3720g;
                Activity activity = this.f3722i;
                Objects.requireNonNull(result);
                nVar.h(parseInt2, activity, new h(result), new e(result));
                return;
            case 2:
                int parseInt3 = Integer.parseInt(methodCall.arguments.toString());
                n nVar2 = this.f3720g;
                Context context2 = this.f3718e;
                Objects.requireNonNull(result);
                nVar2.c(parseInt3, context2, new a(result));
                return;
            case 3:
                j jVar = this.f3719f;
                Context context3 = this.f3718e;
                Objects.requireNonNull(result);
                jVar.a(context3, new i(result), new d(result));
                return;
            case 4:
                n nVar3 = this.f3720g;
                Activity activity2 = this.f3722i;
                Objects.requireNonNull(result);
                nVar3.g((List) methodCall.arguments(), activity2, new g(result), new b(result));
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
