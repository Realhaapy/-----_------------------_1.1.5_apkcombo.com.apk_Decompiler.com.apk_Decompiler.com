package com.facebook.y0.t0;

import android.util.Log;
import com.facebook.g0;
import com.facebook.internal.c0;
import com.facebook.internal.d0;
import com.facebook.internal.o0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import m.y.d.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    public static final a a = new a();
    private static boolean b = false;
    private static final String c = "com.facebook.y0.t0.a";

    /* renamed from: d  reason: collision with root package name */
    private static final List<C0034a> f2156d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private static final Set<String> f2157e = new CopyOnWriteArraySet();

    /* renamed from: com.facebook.y0.t0.a$a  reason: collision with other inner class name */
    public static final class C0034a {
        private String a;
        private Map<String, String> b;

        public C0034a(String str, Map<String, String> map) {
            l.d(str, "eventName");
            l.d(map, "restrictiveParams");
            this.a = str;
            this.b = map;
        }

        public final String a() {
            return this.a;
        }

        public final Map<String, String> b() {
            return this.b;
        }

        public final void c(Map<String, String> map) {
            l.d(map, "<set-?>");
            this.b = map;
        }
    }

    private a() {
    }

    public static final void a() {
        Class<a> cls = a.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                a aVar = a;
                b = true;
                aVar.c();
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    private final String b(String str, String str2) {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return null;
        }
        try {
            for (C0034a aVar : new ArrayList(f2156d)) {
                if (aVar != null) {
                    if (l.a(str, aVar.a())) {
                        for (String next : aVar.b().keySet()) {
                            if (l.a(str2, next)) {
                                return aVar.b().get(next);
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        } catch (Exception e2) {
            Log.w(c, "getMatchedRuleType failed", e2);
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return null;
        }
        return null;
    }

    private final void c() {
        String g2;
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                d0 d0Var = d0.a;
                g0 g0Var = g0.a;
                boolean z = false;
                c0 n2 = d0.n(g0.d(), false);
                if (n2 != null && (g2 = n2.g()) != null) {
                    if (g2.length() == 0) {
                        z = true;
                    }
                    if (!z) {
                        JSONObject jSONObject = new JSONObject(g2);
                        f2156d.clear();
                        f2157e.clear();
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                            if (jSONObject2 != null) {
                                JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                                l.c(next, "key");
                                C0034a aVar = new C0034a(next, new HashMap());
                                if (optJSONObject != null) {
                                    o0 o0Var = o0.a;
                                    aVar.c(o0.m(optJSONObject));
                                    f2156d.add(aVar);
                                }
                                if (jSONObject2.has("process_event_name")) {
                                    f2157e.add(aVar.a());
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    private final boolean d(String str) {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return false;
        }
        try {
            return f2157e.contains(str);
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return false;
        }
    }

    public static final String e(String str) {
        Class<a> cls = a.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            l.d(str, "eventName");
            return (!b || !a.d(str)) ? str : "_removed_";
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final void f(Map<String, String> map, String str) {
        Class<a> cls = a.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                l.d(map, "parameters");
                l.d(str, "eventName");
                if (b) {
                    HashMap hashMap = new HashMap();
                    for (String str2 : new ArrayList(map.keySet())) {
                        String b2 = a.b(str, str2);
                        if (b2 != null) {
                            hashMap.put(str2, b2);
                            map.remove(str2);
                        }
                    }
                    if (!hashMap.isEmpty()) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            for (Map.Entry entry : hashMap.entrySet()) {
                                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                            }
                            map.put("_restrictedParams", jSONObject.toString());
                        } catch (JSONException unused) {
                        }
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }
}
