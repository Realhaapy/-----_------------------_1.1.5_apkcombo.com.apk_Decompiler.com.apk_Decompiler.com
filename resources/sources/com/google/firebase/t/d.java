package com.google.firebase.t;

import com.google.firebase.components.m;
import com.google.firebase.components.n;
import com.google.firebase.components.t;
import java.util.Iterator;
import java.util.Set;

public class d implements i {
    private final String a;
    private final e b;

    d(Set<g> set, e eVar) {
        this.a = d(set);
        this.b = eVar;
    }

    public static m<i> b() {
        m.b<i> a2 = m.a(i.class);
        a2.b(t.k(g.class));
        a2.f(a.a);
        return a2.d();
    }

    static /* synthetic */ i c(n nVar) {
        return new d(nVar.a(g.class), e.a());
    }

    private static String d(Set<g> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<g> it = set.iterator();
        while (it.hasNext()) {
            g next = it.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public String a() {
        if (this.b.b().isEmpty()) {
            return this.a;
        }
        return this.a + ' ' + d(this.b.b());
    }
}
