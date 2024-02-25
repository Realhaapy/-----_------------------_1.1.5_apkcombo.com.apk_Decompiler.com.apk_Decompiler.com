package com.facebook.y0;

import android.content.Context;
import com.facebook.g0;
import com.facebook.internal.q;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m.y.d.l;

public final class w {
    private final HashMap<t, i0> a = new HashMap<>();

    private final synchronized i0 e(t tVar) {
        i0 i0Var = this.a.get(tVar);
        if (i0Var == null) {
            g0 g0Var = g0.a;
            Context c = g0.c();
            q e2 = q.f1478f.e(c);
            if (e2 != null) {
                i0Var = new i0(e2, a0.b.d(c));
            }
        }
        if (i0Var == null) {
            return null;
        }
        this.a.put(tVar, i0Var);
        return i0Var;
    }

    public final synchronized void a(t tVar, v vVar) {
        l.d(tVar, "accessTokenAppIdPair");
        l.d(vVar, "appEvent");
        i0 e2 = e(tVar);
        if (e2 != null) {
            e2.a(vVar);
        }
    }

    public final synchronized void b(h0 h0Var) {
        if (h0Var != null) {
            for (Map.Entry next : h0Var.b()) {
                i0 e2 = e((t) next.getKey());
                if (e2 != null) {
                    for (v a2 : (List) next.getValue()) {
                        e2.a(a2);
                    }
                }
            }
        }
    }

    public final synchronized i0 c(t tVar) {
        l.d(tVar, "accessTokenAppIdPair");
        return this.a.get(tVar);
    }

    public final synchronized int d() {
        int i2;
        i2 = 0;
        for (i0 c : this.a.values()) {
            i2 += c.c();
        }
        return i2;
    }

    public final synchronized Set<t> f() {
        Set<t> keySet;
        keySet = this.a.keySet();
        l.c(keySet, "stateMap.keys");
        return keySet;
    }
}
