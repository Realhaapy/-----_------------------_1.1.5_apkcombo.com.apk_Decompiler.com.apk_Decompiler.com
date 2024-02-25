package j.a.a.a;

import android.content.Context;
import android.os.Bundle;
import com.facebook.g0;
import com.facebook.y0.a0;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Map;
import java.util.Objects;
import m.y.d.l;

public final class a implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: e  reason: collision with root package name */
    private MethodChannel f4771e;

    /* renamed from: f  reason: collision with root package name */
    private a0 f4772f;

    /* renamed from: g  reason: collision with root package name */
    private String f4773g;

    private final Bundle a(Map<String, ? extends Object> map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            String str = (String) next.getKey();
            if (value instanceof String) {
                bundle.putString(str, (String) value);
            } else if (value instanceof Integer) {
                bundle.putInt(str, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                bundle.putLong(str, ((Long) value).longValue());
            } else if (value instanceof Double) {
                bundle.putDouble(str, ((Double) value).doubleValue());
            } else if (value instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value instanceof Map) {
                Bundle a = a((Map) value);
                Objects.requireNonNull(a, "null cannot be cast to non-null type android.os.Bundle");
                bundle.putBundle(str, a);
            } else {
                throw new IllegalArgumentException(l.j("Unsupported value type: ", m.y.a.b(value.getClass())));
            }
        }
        return bundle;
    }

    private final void b(MethodCall methodCall, MethodChannel.Result result) {
        a0.b.b();
        result.success((Object) null);
    }

    private final void c(MethodCall methodCall, MethodChannel.Result result) {
        a0.b.c();
        result.success((Object) null);
    }

    private final void d(MethodCall methodCall, MethodChannel.Result result) {
        a0 a0Var = this.f4772f;
        if (a0Var != null) {
            a0Var.a();
            result.success((Object) null);
            return;
        }
        l.n("appEventsLogger");
        throw null;
    }

    private final void e(MethodCall methodCall, MethodChannel.Result result) {
        String str = this.f4773g;
        if (str != null) {
            result.success(str);
        } else {
            l.n("anonymousId");
            throw null;
        }
    }

    private final void f(MethodCall methodCall, MethodChannel.Result result) {
        a0 a0Var = this.f4772f;
        if (a0Var != null) {
            result.success(a0Var.b());
        } else {
            l.n("appEventsLogger");
            throw null;
        }
    }

    private final void g(MethodCall methodCall, MethodChannel.Result result) {
        Object argument = methodCall.argument("name");
        String str = argument instanceof String ? (String) argument : null;
        Object argument2 = methodCall.argument("parameters");
        Map map = argument2 instanceof Map ? (Map) argument2 : null;
        Object argument3 = methodCall.argument("_valueToSum");
        Double d2 = argument3 instanceof Double ? (Double) argument3 : null;
        if (d2 != null && map != null) {
            Bundle a = a(map);
            a0 a0Var = this.f4772f;
            if (a0Var != null) {
                a0Var.e(str, d2.doubleValue(), a);
            } else {
                l.n("appEventsLogger");
                throw null;
            }
        } else if (d2 != null) {
            a0 a0Var2 = this.f4772f;
            if (a0Var2 != null) {
                a0Var2.d(str, d2.doubleValue());
            } else {
                l.n("appEventsLogger");
                throw null;
            }
        } else if (map != null) {
            Bundle a2 = a(map);
            a0 a0Var3 = this.f4772f;
            if (a0Var3 != null) {
                a0Var3.f(str, a2);
            } else {
                l.n("appEventsLogger");
                throw null;
            }
        } else {
            a0 a0Var4 = this.f4772f;
            if (a0Var4 != null) {
                a0Var4.c(str);
            } else {
                l.n("appEventsLogger");
                throw null;
            }
        }
        result.success((Object) null);
    }

    private final void h(MethodCall methodCall, MethodChannel.Result result) {
        Object argument = methodCall.argument("amount");
        Double d2 = argument instanceof Double ? (Double) argument : null;
        BigDecimal bigDecimal = d2 == null ? null : new BigDecimal(String.valueOf(d2.doubleValue()));
        Object argument2 = methodCall.argument("currency");
        Currency instance = Currency.getInstance(argument2 instanceof String ? (String) argument2 : null);
        Object argument3 = methodCall.argument("parameters");
        Bundle a = a(argument3 instanceof Map ? (Map) argument3 : null);
        if (a == null) {
            a = new Bundle();
        }
        a0 a0Var = this.f4772f;
        if (a0Var != null) {
            a0Var.g(bigDecimal, instance, a);
            result.success((Object) null);
            return;
        }
        l.n("appEventsLogger");
        throw null;
    }

    private final void i(MethodCall methodCall, MethodChannel.Result result) {
        Object argument = methodCall.argument("action");
        String str = argument instanceof String ? (String) argument : null;
        Object argument2 = methodCall.argument("payload");
        Bundle a = a(argument2 instanceof Map ? (Map) argument2 : null);
        l.b(a);
        if (str != null) {
            a0 a0Var = this.f4772f;
            if (a0Var != null) {
                a0Var.i(a, str);
            } else {
                l.n("appEventsLogger");
                throw null;
            }
        } else {
            a0 a0Var2 = this.f4772f;
            if (a0Var2 != null) {
                a0Var2.h(a);
            } else {
                l.n("appEventsLogger");
                throw null;
            }
        }
        result.success((Object) null);
    }

    private final void j(MethodCall methodCall, MethodChannel.Result result) {
        result.success((Object) null);
    }

    private final void k(MethodCall methodCall, MethodChannel.Result result) {
        Object obj = methodCall.arguments;
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
        g0.U(((Boolean) obj).booleanValue());
        result.success((Object) null);
    }

    private final void l(MethodCall methodCall, MethodChannel.Result result) {
        Object argument = methodCall.argument("options");
        ArrayList arrayList = argument instanceof ArrayList ? (ArrayList) argument : null;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        Object argument2 = methodCall.argument("country");
        Integer num = argument2 instanceof Integer ? (Integer) argument2 : null;
        int intValue = num == null ? 0 : num.intValue();
        Object argument3 = methodCall.argument("state");
        Integer num2 = argument3 instanceof Integer ? (Integer) argument3 : null;
        int intValue2 = num2 == null ? 0 : num2.intValue();
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        g0.V((String[]) array, intValue, intValue2);
        result.success((Object) null);
    }

    private final void m(MethodCall methodCall, MethodChannel.Result result) {
        Object argument = methodCall.argument("parameters");
        Bundle a = a(argument instanceof Map ? (Map) argument : null);
        a0.b.j(a == null ? null : a.getString("email"), a == null ? null : a.getString("firstName"), a == null ? null : a.getString("lastName"), a == null ? null : a.getString("phone"), a == null ? null : a.getString("dateOfBirth"), a == null ? null : a.getString("gender"), a == null ? null : a.getString("city"), a == null ? null : a.getString("state"), a == null ? null : a.getString("zip"), a == null ? null : a.getString("country"));
        result.success((Object) null);
    }

    private final void n(MethodCall methodCall, MethodChannel.Result result) {
        Object obj = methodCall.arguments;
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        a0.b.k((String) obj);
        result.success((Object) null);
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        l.d(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "flutter.oddbit.id/facebook_app_events");
        this.f4771e = methodChannel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(this);
            a0.a aVar = a0.b;
            Context applicationContext = flutterPluginBinding.getApplicationContext();
            l.c(applicationContext, "flutterPluginBinding.applicationContext");
            this.f4772f = aVar.h(applicationContext);
            Context applicationContext2 = flutterPluginBinding.getApplicationContext();
            l.c(applicationContext2, "flutterPluginBinding.applicationContext");
            this.f4773g = aVar.d(applicationContext2);
            return;
        }
        l.n("channel");
        throw null;
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        l.d(flutterPluginBinding, "binding");
        MethodChannel methodChannel = this.f4771e;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        } else {
            l.n("channel");
            throw null;
        }
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        l.d(methodCall, "call");
        l.d(result, "result");
        String str = methodCall.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -2129152299:
                    if (str.equals("getApplicationId")) {
                        f(methodCall, result);
                        return;
                    }
                    break;
                case -1529535789:
                    if (str.equals("clearUserID")) {
                        c(methodCall, result);
                        return;
                    }
                    break;
                case -1005195390:
                    if (str.equals("clearUserData")) {
                        b(methodCall, result);
                        return;
                    }
                    break;
                case -811628443:
                    if (str.equals("logPurchase")) {
                        h(methodCall, result);
                        return;
                    }
                    break;
                case -375431886:
                    if (str.equals("getAnonymousId")) {
                        e(methodCall, result);
                        return;
                    }
                    break;
                case 97532676:
                    if (str.equals("flush")) {
                        d(methodCall, result);
                        return;
                    }
                    break;
                case 645367080:
                    if (str.equals("setUserID")) {
                        n(methodCall, result);
                        return;
                    }
                    break;
                case 792787386:
                    if (str.equals("setAutoLogAppEventsEnabled")) {
                        k(methodCall, result);
                        return;
                    }
                    break;
                case 1413464691:
                    if (str.equals("logPushNotificationOpen")) {
                        i(methodCall, result);
                        return;
                    }
                    break;
                case 1722355863:
                    if (str.equals("setUserData")) {
                        m(methodCall, result);
                        return;
                    }
                    break;
                case 1817723455:
                    if (str.equals("setDataProcessingOptions")) {
                        l(methodCall, result);
                        return;
                    }
                    break;
                case 1989757366:
                    if (str.equals("logEvent")) {
                        g(methodCall, result);
                        return;
                    }
                    break;
                case 2126113028:
                    if (str.equals("setAdvertiserTracking")) {
                        j(methodCall, result);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }
}
