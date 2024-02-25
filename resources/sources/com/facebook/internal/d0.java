package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.g0;
import com.facebook.internal.c0;
import com.facebook.internal.x;
import com.facebook.j0;
import com.facebook.u;
import com.facebook.y0.m0.n.e;
import com.facebook.y0.q0.i;
import com.facebook.y0.q0.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import m.y.d.l;
import m.y.d.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d0 {
    public static final d0 a = new d0();
    private static final String b;
    private static final List<String> c = j.g("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting");

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, c0> f1429d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReference<a> f1430e = new AtomicReference<>(a.NOT_LOADED);

    /* renamed from: f  reason: collision with root package name */
    private static final ConcurrentLinkedQueue<b> f1431f = new ConcurrentLinkedQueue<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f1432g;

    /* renamed from: h  reason: collision with root package name */
    private static JSONArray f1433h;

    public enum a {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    public interface b {
        void a();

        void b(c0 c0Var);
    }

    static {
        String simpleName = d0.class.getSimpleName();
        l.c(simpleName, "FetchedAppSettingsManager::class.java.simpleName");
        b = simpleName;
    }

    private d0() {
    }

    public static final void a(b bVar) {
        l.d(bVar, "callback");
        f1431f.add(bVar);
        g();
    }

    private final JSONObject b(String str) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        j0 x = j0.f1546n.x((u) null, "app", (j0.b) null);
        x.D(true);
        x.G(bundle);
        JSONObject d2 = x.j().d();
        return d2 == null ? new JSONObject() : d2;
    }

    public static final c0 c(String str) {
        if (str != null) {
            return f1429d.get(str);
        }
        return null;
    }

    public static final void g() {
        g0 g0Var = g0.a;
        Context c2 = g0.c();
        String d2 = g0.d();
        o0 o0Var = o0.a;
        if (o0.V(d2)) {
            f1430e.set(a.ERROR);
            a.k();
        } else if (f1429d.containsKey(d2)) {
            f1430e.set(a.SUCCESS);
            a.k();
        } else {
            AtomicReference<a> atomicReference = f1430e;
            a aVar = a.NOT_LOADED;
            a aVar2 = a.LOADING;
            if (!(atomicReference.compareAndSet(aVar, aVar2) || atomicReference.compareAndSet(a.ERROR, aVar2))) {
                a.k();
                return;
            }
            s sVar = s.a;
            String format = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{d2}, 1));
            l.c(format, "java.lang.String.format(format, *args)");
            g0.k().execute(new f(c2, format, d2));
        }
    }

    /* access modifiers changed from: private */
    public static final void h(Context context, String str, String str2) {
        JSONObject jSONObject;
        l.d(context, "$context");
        l.d(str, "$settingsKey");
        l.d(str2, "$applicationId");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
        c0 c0Var = null;
        String string = sharedPreferences.getString(str, (String) null);
        o0 o0Var = o0.a;
        if (!o0.V(string)) {
            if (string != null) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e2) {
                    o0 o0Var2 = o0.a;
                    o0.d0("FacebookSDK", e2);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    c0Var = a.i(str2, jSONObject);
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        d0 d0Var = a;
        JSONObject b2 = d0Var.b(str2);
        if (b2 != null) {
            d0Var.i(str2, b2);
            sharedPreferences.edit().putString(str, b2.toString()).apply();
        }
        if (c0Var != null) {
            String h2 = c0Var.h();
            if (!f1432g && h2 != null && h2.length() > 0) {
                f1432g = true;
                Log.w(b, h2);
            }
        }
        b0 b0Var = b0.a;
        b0.m(str2, true);
        i iVar = i.a;
        i.d();
        f1430e.set(f1429d.containsKey(str2) ? a.SUCCESS : a.ERROR);
        d0Var.k();
    }

    private final Map<String, Map<String, c0.a>> j(JSONObject jSONObject) {
        JSONArray optJSONArray;
        HashMap hashMap = new HashMap();
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null) {
            int i2 = 0;
            int length = optJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i3 = i2 + 1;
                    c0.a.C0026a aVar = c0.a.c;
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    l.c(optJSONObject, "dialogConfigData.optJSONObject(i)");
                    c0.a a2 = aVar.a(optJSONObject);
                    if (a2 != null) {
                        String a3 = a2.a();
                        Map map = (Map) hashMap.get(a3);
                        if (map == null) {
                            map = new HashMap();
                            hashMap.put(a3, map);
                        }
                        map.put(a2.b(), a2);
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void k() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.d0$a> r0 = f1430e     // Catch:{ all -> 0x0061 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0061 }
            com.facebook.internal.d0$a r0 = (com.facebook.internal.d0.a) r0     // Catch:{ all -> 0x0061 }
            com.facebook.internal.d0$a r1 = com.facebook.internal.d0.a.NOT_LOADED     // Catch:{ all -> 0x0061 }
            if (r1 == r0) goto L_0x005f
            com.facebook.internal.d0$a r1 = com.facebook.internal.d0.a.LOADING     // Catch:{ all -> 0x0061 }
            if (r1 != r0) goto L_0x0012
            goto L_0x005f
        L_0x0012:
            com.facebook.g0 r1 = com.facebook.g0.a     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = com.facebook.g0.d()     // Catch:{ all -> 0x0061 }
            java.util.Map<java.lang.String, com.facebook.internal.c0> r2 = f1429d     // Catch:{ all -> 0x0061 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x0061 }
            com.facebook.internal.c0 r1 = (com.facebook.internal.c0) r1     // Catch:{ all -> 0x0061 }
            android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x0061 }
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0061 }
            r2.<init>(r3)     // Catch:{ all -> 0x0061 }
            com.facebook.internal.d0$a r3 = com.facebook.internal.d0.a.ERROR     // Catch:{ all -> 0x0061 }
            if (r3 != r0) goto L_0x0046
        L_0x002d:
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.d0$b> r0 = f1431f     // Catch:{ all -> 0x0061 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0061 }
            if (r1 != 0) goto L_0x0044
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0061 }
            com.facebook.internal.d0$b r0 = (com.facebook.internal.d0.b) r0     // Catch:{ all -> 0x0061 }
            com.facebook.internal.g r1 = new com.facebook.internal.g     // Catch:{ all -> 0x0061 }
            r1.<init>(r0)     // Catch:{ all -> 0x0061 }
            r2.post(r1)     // Catch:{ all -> 0x0061 }
            goto L_0x002d
        L_0x0044:
            monitor-exit(r4)
            return
        L_0x0046:
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.d0$b> r0 = f1431f     // Catch:{ all -> 0x0061 }
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x0061 }
            if (r3 != 0) goto L_0x005d
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0061 }
            com.facebook.internal.d0$b r0 = (com.facebook.internal.d0.b) r0     // Catch:{ all -> 0x0061 }
            com.facebook.internal.h r3 = new com.facebook.internal.h     // Catch:{ all -> 0x0061 }
            r3.<init>(r0, r1)     // Catch:{ all -> 0x0061 }
            r2.post(r3)     // Catch:{ all -> 0x0061 }
            goto L_0x0046
        L_0x005d:
            monitor-exit(r4)
            return
        L_0x005f:
            monitor-exit(r4)
            return
        L_0x0061:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.d0.k():void");
    }

    /* access modifiers changed from: private */
    public static final void l(b bVar) {
        bVar.a();
    }

    /* access modifiers changed from: private */
    public static final void m(b bVar, c0 c0Var) {
        bVar.b(c0Var);
    }

    public static final c0 n(String str, boolean z) {
        l.d(str, "applicationId");
        if (!z) {
            Map<String, c0> map = f1429d;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        d0 d0Var = a;
        JSONObject b2 = d0Var.b(str);
        if (b2 == null) {
            return null;
        }
        c0 i2 = d0Var.i(str, b2);
        g0 g0Var = g0.a;
        if (l.a(str, g0.d())) {
            f1430e.set(a.SUCCESS);
            d0Var.k();
        }
        return i2;
    }

    public final c0 i(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        l.d(str, "applicationId");
        l.d(jSONObject2, "settingsJSON");
        JSONArray optJSONArray = jSONObject2.optJSONArray("android_sdk_error_categories");
        x.a aVar = x.f1541g;
        x a2 = aVar.a(optJSONArray);
        if (a2 == null) {
            a2 = aVar.b();
        }
        x xVar = a2;
        int optInt = jSONObject2.optInt("app_events_feature_bitmask", 0);
        boolean z = (optInt & 8) != 0;
        boolean z2 = (optInt & 16) != 0;
        boolean z3 = (optInt & 32) != 0;
        boolean z4 = (optInt & 256) != 0;
        boolean z5 = (optInt & 16384) != 0;
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("auto_event_mapping_android");
        f1433h = optJSONArray2;
        if (optJSONArray2 != null) {
            g0 g0Var = g0.a;
            if (g0.b()) {
                e eVar = e.a;
                e.c(optJSONArray2 == null ? null : optJSONArray2.toString());
            }
        }
        boolean optBoolean = jSONObject2.optBoolean("supports_implicit_sdk_logging", false);
        String optString = jSONObject2.optString("gdpv4_nux_content", "");
        String str2 = optString;
        l.c(optString, "settingsJSON.optString(APP_SETTING_NUX_CONTENT, \"\")");
        boolean optBoolean2 = jSONObject2.optBoolean("gdpv4_nux_enabled", false);
        j jVar = j.a;
        int optInt2 = jSONObject2.optInt("app_events_session_timeout", j.a());
        EnumSet<n0> a3 = n0.f1464f.a(jSONObject2.optLong("seamless_login"));
        Map<String, Map<String, c0.a>> j2 = j(jSONObject2.optJSONObject("android_dialog_configs"));
        String optString2 = jSONObject2.optString("smart_login_bookmark_icon_url");
        l.c(optString2, "settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL)");
        String optString3 = jSONObject2.optString("smart_login_menu_icon_url");
        String str3 = optString3;
        c0 c0Var = r3;
        l.c(optString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String optString4 = jSONObject2.optString("sdk_update_message");
        l.c(optString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        c0 c0Var2 = new c0(optBoolean, str2, optBoolean2, optInt2, a3, j2, z, xVar, optString2, str3, z2, z3, optJSONArray2, optString4, z4, z5, jSONObject2.optString("aam_rules"), jSONObject2.optString("suggested_events_setting"), jSONObject2.optString("restrictive_data_filter_params"));
        c0 c0Var3 = c0Var;
        f1429d.put(str, c0Var3);
        return c0Var3;
    }
}
