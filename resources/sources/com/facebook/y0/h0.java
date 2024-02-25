package com.facebook.y0;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m.y.d.l;

public final class h0 implements Serializable {
    private static final long serialVersionUID = 20160629001L;

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<t, List<v>> f1839e;

    public static final class a implements Serializable {
        private static final long serialVersionUID = 20160629001L;

        /* renamed from: e  reason: collision with root package name */
        private final HashMap<t, List<v>> f1840e;

        public a(HashMap<t, List<v>> hashMap) {
            l.d(hashMap, "proxyEvents");
            this.f1840e = hashMap;
        }

        private final Object readResolve() {
            return new h0(this.f1840e);
        }
    }

    public h0() {
        this.f1839e = new HashMap<>();
    }

    public h0(HashMap<t, List<v>> hashMap) {
        l.d(hashMap, "appEventMap");
        HashMap<t, List<v>> hashMap2 = new HashMap<>();
        this.f1839e = hashMap2;
        hashMap2.putAll(hashMap);
    }

    private final Object writeReplace() {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return null;
        }
        try {
            return new a(this.f1839e);
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return null;
        }
    }

    public final void a(t tVar, List<v> list) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                l.d(tVar, "accessTokenAppIdPair");
                l.d(list, "appEvents");
                if (!this.f1839e.containsKey(tVar)) {
                    this.f1839e.put(tVar, r.F(list));
                    return;
                }
                List list2 = this.f1839e.get(tVar);
                if (list2 != null) {
                    list2.addAll(list);
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public final Set<Map.Entry<t, List<v>>> b() {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return null;
        }
        try {
            Set<Map.Entry<t, List<v>>> entrySet = this.f1839e.entrySet();
            l.c(entrySet, "events.entries");
            return entrySet;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return null;
        }
    }
}
