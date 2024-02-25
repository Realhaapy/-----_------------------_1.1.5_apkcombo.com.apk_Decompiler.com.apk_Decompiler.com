package com.facebook.y0.u0;

import android.content.SharedPreferences;
import com.facebook.g0;
import com.facebook.internal.o0;
import com.facebook.internal.s0.n.a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import m.y.d.l;

public final class f {
    public static final f a = new f();
    private static final Map<String, String> b = new LinkedHashMap();
    private static SharedPreferences c;

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicBoolean f2171d = new AtomicBoolean(false);

    private f() {
    }

    public static final void a(String str, String str2) {
        Class<f> cls = f.class;
        if (!a.d(cls)) {
            try {
                l.d(str, "pathID");
                l.d(str2, "predictedEvent");
                if (!f2171d.get()) {
                    a.c();
                }
                Map<String, String> map = b;
                map.put(str, str2);
                SharedPreferences sharedPreferences = c;
                if (sharedPreferences != null) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    o0 o0Var = o0.a;
                    edit.putString("SUGGESTED_EVENTS_HISTORY", o0.g0(a0.l(map))).apply();
                    return;
                }
                l.n("shardPreferences");
                throw null;
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:4|5|6|7|(1:9)|17|10|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String b(android.view.View r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "text"
            java.lang.Class<com.facebook.y0.u0.f> r1 = com.facebook.y0.u0.f.class
            boolean r2 = com.facebook.internal.s0.n.a.d(r1)
            r3 = 0
            if (r2 == 0) goto L_0x000c
            return r3
        L_0x000c:
            java.lang.String r2 = "view"
            m.y.d.l.d(r4, r2)     // Catch:{ all -> 0x0045 }
            m.y.d.l.d(r5, r0)     // Catch:{ all -> 0x0045 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0045 }
            r2.<init>()     // Catch:{ all -> 0x0045 }
            r2.put(r0, r5)     // Catch:{ JSONException -> 0x003a }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x003a }
            r5.<init>()     // Catch:{ JSONException -> 0x003a }
        L_0x0021:
            if (r4 == 0) goto L_0x0035
            java.lang.Class r0 = r4.getClass()     // Catch:{ JSONException -> 0x003a }
            java.lang.String r0 = r0.getSimpleName()     // Catch:{ JSONException -> 0x003a }
            r5.put(r0)     // Catch:{ JSONException -> 0x003a }
            com.facebook.y0.m0.n.f r0 = com.facebook.y0.m0.n.f.a     // Catch:{ JSONException -> 0x003a }
            android.view.ViewGroup r4 = com.facebook.y0.m0.n.f.j(r4)     // Catch:{ JSONException -> 0x003a }
            goto L_0x0021
        L_0x0035:
            java.lang.String r4 = "classname"
            r2.put(r4, r5)     // Catch:{ JSONException -> 0x003a }
        L_0x003a:
            com.facebook.internal.o0 r4 = com.facebook.internal.o0.a     // Catch:{ all -> 0x0045 }
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x0045 }
            java.lang.String r4 = com.facebook.internal.o0.A0(r4)     // Catch:{ all -> 0x0045 }
            return r4
        L_0x0045:
            r4 = move-exception
            com.facebook.internal.s0.n.a.b(r4, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.u0.f.b(android.view.View, java.lang.String):java.lang.String");
    }

    private final void c() {
        String str = "";
        if (!a.d(this)) {
            try {
                AtomicBoolean atomicBoolean = f2171d;
                if (!atomicBoolean.get()) {
                    g0 g0Var = g0.a;
                    SharedPreferences sharedPreferences = g0.c().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
                    l.c(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(CLICKED_PATH_STORE, Context.MODE_PRIVATE)");
                    c = sharedPreferences;
                    Map<String, String> map = b;
                    o0 o0Var = o0.a;
                    SharedPreferences sharedPreferences2 = c;
                    if (sharedPreferences2 != null) {
                        String string = sharedPreferences2.getString("SUGGESTED_EVENTS_HISTORY", str);
                        if (string != null) {
                            str = string;
                        }
                        map.putAll(o0.a0(str));
                        atomicBoolean.set(true);
                        return;
                    }
                    l.n("shardPreferences");
                    throw null;
                }
            } catch (Throwable th) {
                a.b(th, this);
            }
        }
    }

    public static final String d(String str) {
        Class<f> cls = f.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(str, "pathID");
            Map<String, String> map = b;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            return null;
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }
}
