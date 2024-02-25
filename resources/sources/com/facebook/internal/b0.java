package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.g0;
import com.facebook.internal.r0.b;
import com.facebook.j0;
import com.facebook.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import m.y.d.l;
import m.y.d.q;
import m.y.d.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b0 {
    public static final b0 a = new b0();
    private static final AtomicBoolean b = new AtomicBoolean(false);
    private static final ConcurrentLinkedQueue<a> c = new ConcurrentLinkedQueue<>();

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, JSONObject> f1415d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private static Long f1416e;

    /* renamed from: f  reason: collision with root package name */
    private static b f1417f;

    public interface a {
        void a();
    }

    static {
        q.b(b0.class).a();
    }

    private b0() {
    }

    private final JSONObject a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        g0 g0Var = g0.a;
        bundle.putString("sdk_version", g0.r());
        bundle.putString("fields", "gatekeepers");
        j0.c cVar = j0.f1546n;
        s sVar = s.a;
        String format = String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
        l.c(format, "java.lang.String.format(format, *args)");
        j0 x = cVar.x((u) null, format, (j0.b) null);
        x.G(bundle);
        JSONObject d2 = x.j().d();
        return d2 == null ? new JSONObject() : d2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r1 = r2.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean b(java.lang.String r1, java.lang.String r2, boolean r3) {
        /*
            java.lang.String r0 = "name"
            m.y.d.l.d(r1, r0)
            com.facebook.internal.b0 r0 = a
            java.util.Map r2 = r0.c(r2)
            boolean r0 = r2.containsKey(r1)
            if (r0 != 0) goto L_0x0012
            goto L_0x001f
        L_0x0012:
            java.lang.Object r1 = r2.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 != 0) goto L_0x001b
            return r3
        L_0x001b:
            boolean r3 = r1.booleanValue()
        L_0x001f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.b0.b(java.lang.String, java.lang.String, boolean):boolean");
    }

    private final boolean d(Long l2) {
        return l2 != null && System.currentTimeMillis() - l2.longValue() < 3600000;
    }

    public static final synchronized void h(a aVar) {
        synchronized (b0.class) {
            if (aVar != null) {
                c.add(aVar);
            }
            g0 g0Var = g0.a;
            String d2 = g0.d();
            b0 b0Var = a;
            if (!b0Var.d(f1416e) || !f1415d.containsKey(d2)) {
                Context c2 = g0.c();
                s sVar = s.a;
                String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{d2}, 1));
                l.c(format, "java.lang.String.format(format, *args)");
                if (c2 != null) {
                    JSONObject jSONObject = null;
                    String string = c2.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format, (String) null);
                    o0 o0Var = o0.a;
                    if (!o0.V(string)) {
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (JSONException e2) {
                            o0 o0Var2 = o0.a;
                            o0.d0("FacebookSDK", e2);
                        }
                        if (jSONObject != null) {
                            j(d2, jSONObject);
                        }
                    }
                    g0 g0Var2 = g0.a;
                    Executor k2 = g0.k();
                    if (k2 != null) {
                        if (b.compareAndSet(false, true)) {
                            k2.execute(new e(d2, c2, format));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            b0Var.k();
        }
    }

    /* access modifiers changed from: private */
    public static final void i(String str, Context context, String str2) {
        l.d(str, "$applicationId");
        l.d(context, "$context");
        l.d(str2, "$gateKeepersKey");
        b0 b0Var = a;
        JSONObject a2 = b0Var.a(str);
        if (a2.length() != 0) {
            j(str, a2);
            context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str2, a2.toString()).apply();
            f1416e = Long.valueOf(System.currentTimeMillis());
        }
        b0Var.k();
        b.set(false);
    }

    public static final synchronized JSONObject j(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (b0.class) {
            l.d(str, "applicationId");
            jSONObject2 = f1415d.get(str);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            int i2 = 0;
            JSONObject jSONObject3 = null;
            if (jSONObject != null) {
                JSONArray optJSONArray = jSONObject.optJSONArray("data");
                if (optJSONArray != null) {
                    jSONObject3 = optJSONArray.optJSONObject(0);
                }
            }
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
            if (optJSONArray2 == null) {
                optJSONArray2 = new JSONArray();
            }
            int length = optJSONArray2.length();
            if (length > 0) {
                while (true) {
                    int i3 = i2 + 1;
                    try {
                        JSONObject jSONObject4 = optJSONArray2.getJSONObject(i2);
                        jSONObject2.put(jSONObject4.getString("key"), jSONObject4.getBoolean("value"));
                    } catch (JSONException e2) {
                        o0 o0Var = o0.a;
                        o0.d0("FacebookSDK", e2);
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
            f1415d.put(str, jSONObject2);
        }
        return jSONObject2;
    }

    private final void k() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<a> concurrentLinkedQueue = c;
            if (!concurrentLinkedQueue.isEmpty()) {
                a poll = concurrentLinkedQueue.poll();
                if (poll != null) {
                    handler.post(new d(poll));
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void l(a aVar) {
        aVar.a();
    }

    public static final JSONObject m(String str, boolean z) {
        l.d(str, "applicationId");
        if (!z) {
            Map<String, JSONObject> map = f1415d;
            if (map.containsKey(str)) {
                JSONObject jSONObject = map.get(str);
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        }
        JSONObject a2 = a.a(str);
        g0 g0Var = g0.a;
        Context c2 = g0.c();
        s sVar = s.a;
        String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{str}, 1));
        l.c(format, "java.lang.String.format(format, *args)");
        c2.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(format, a2.toString()).apply();
        return j(str, a2);
    }

    public final Map<String, Boolean> c(String str) {
        g();
        if (str != null) {
            Map<String, JSONObject> map = f1415d;
            if (map.containsKey(str)) {
                b bVar = f1417f;
                List<com.facebook.internal.r0.a> a2 = bVar == null ? null : bVar.a(str);
                if (a2 != null) {
                    HashMap hashMap = new HashMap();
                    for (com.facebook.internal.r0.a aVar : a2) {
                        hashMap.put(aVar.a(), Boolean.valueOf(aVar.b()));
                    }
                    return hashMap;
                }
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject = map.get(str);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    l.c(next, "key");
                    hashMap2.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
                }
                b bVar2 = f1417f;
                if (bVar2 == null) {
                    bVar2 = new b();
                }
                ArrayList arrayList = new ArrayList(hashMap2.size());
                for (Map.Entry entry : hashMap2.entrySet()) {
                    arrayList.add(new com.facebook.internal.r0.a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                bVar2.b(str, arrayList);
                f1417f = bVar2;
                return hashMap2;
            }
        }
        return new HashMap();
    }

    public final void g() {
        h((a) null);
    }
}
