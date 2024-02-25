package com.facebook.y0.k0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import m.y.d.g;
import m.y.d.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {

    /* renamed from: d  reason: collision with root package name */
    public static final a f1854d = new a((g) null);

    /* renamed from: e  reason: collision with root package name */
    private static final Set<e> f1855e = new CopyOnWriteArraySet();
    private final String a;
    private final String b;
    private final List<String> c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final void a(JSONObject jSONObject) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("k");
                    String optString2 = optJSONObject.optString("v");
                    l.c(optString, "k");
                    if (!(optString.length() == 0)) {
                        Set a = e.a();
                        l.c(next, "key");
                        List U = q.U(optString, new String[]{","}, false, 0, 6, (Object) null);
                        l.c(optString2, "v");
                        a.add(new e(next, U, optString2, (g) null));
                    }
                }
            }
        }

        public final Set<String> b() {
            HashSet hashSet = new HashSet();
            for (e c : e.a()) {
                hashSet.add(c.c());
            }
            return hashSet;
        }

        public final Set<e> c() {
            return new HashSet(e.a());
        }

        public final void d(String str) {
            l.d(str, "rulesFromServer");
            try {
                e.a().clear();
                a(new JSONObject(str));
            } catch (JSONException unused) {
            }
        }
    }

    private e(String str, List<String> list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public /* synthetic */ e(String str, List list, String str2, g gVar) {
        this(str, list, str2);
    }

    public static final /* synthetic */ Set a() {
        Class<e> cls = e.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return f1855e;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public final List<String> b() {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return null;
        }
        try {
            return new ArrayList(this.c);
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return null;
        }
    }

    public final String c() {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return null;
        }
        try {
            return this.a;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return null;
        }
    }

    public final String d() {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return null;
        }
        try {
            return this.b;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return null;
        }
    }
}
