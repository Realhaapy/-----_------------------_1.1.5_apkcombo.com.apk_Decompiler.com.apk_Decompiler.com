package com.facebook.y0.n0;

import com.facebook.g0;
import com.facebook.internal.c0;
import com.facebook.internal.d0;
import com.facebook.internal.o0;
import com.facebook.y0.v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m.y.d.l;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {
    public static final a a = new a();
    private static boolean b;
    private static final List<C0032a> c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private static final Set<String> f2046d = new HashSet();

    /* renamed from: com.facebook.y0.n0.a$a  reason: collision with other inner class name */
    public static final class C0032a {
        private String a;
        private List<String> b;

        public C0032a(String str, List<String> list) {
            l.d(str, "eventName");
            l.d(list, "deprecateParams");
            this.a = str;
            this.b = list;
        }

        public final List<String> a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final void c(List<String> list) {
            l.d(list, "<set-?>");
            this.b = list;
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
                aVar.b();
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    private final synchronized void b() {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                d0 d0Var = d0.a;
                g0 g0Var = g0.a;
                boolean z = false;
                c0 n2 = d0.n(g0.d(), false);
                if (n2 != null) {
                    String g2 = n2.g();
                    if (g2 != null) {
                        if (g2.length() > 0) {
                            z = true;
                        }
                        if (z) {
                            JSONObject jSONObject = new JSONObject(g2);
                            c.clear();
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                                if (jSONObject2 != null) {
                                    if (jSONObject2.optBoolean("is_deprecated_event")) {
                                        Set<String> set = f2046d;
                                        l.c(next, "key");
                                        set.add(next);
                                    } else {
                                        JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                                        l.c(next, "key");
                                        C0032a aVar = new C0032a(next, new ArrayList());
                                        if (optJSONArray != null) {
                                            o0 o0Var = o0.a;
                                            aVar.c(o0.k(optJSONArray));
                                        }
                                        c.add(aVar);
                                    }
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

    public static final void c(Map<String, String> map, String str) {
        Class<a> cls = a.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                l.d(map, "parameters");
                l.d(str, "eventName");
                if (b) {
                    ArrayList<String> arrayList = new ArrayList<>(map.keySet());
                    for (C0032a aVar : new ArrayList(c)) {
                        if (l.a(aVar.b(), str)) {
                            for (String str2 : arrayList) {
                                if (aVar.a().contains(str2)) {
                                    map.remove(str2);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    public static final void d(List<v> list) {
        Class<a> cls = a.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                l.d(list, "events");
                if (b) {
                    Iterator<v> it = list.iterator();
                    while (it.hasNext()) {
                        if (f2046d.contains(it.next().f())) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }
}
