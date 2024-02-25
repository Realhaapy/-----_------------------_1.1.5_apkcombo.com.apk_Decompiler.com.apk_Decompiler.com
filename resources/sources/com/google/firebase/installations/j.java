package com.google.firebase.installations;

import com.google.firebase.installations.l;
import com.google.firebase.installations.q.d;

class j implements n {
    private final o a;
    private final f.e.a.c.g.j<l> b;

    public j(o oVar, f.e.a.c.g.j<l> jVar) {
        this.a = oVar;
        this.b = jVar;
    }

    public boolean a(Exception exc) {
        this.b.d(exc);
        return true;
    }

    public boolean b(d dVar) {
        if (!dVar.k() || this.a.f(dVar)) {
            return false;
        }
        f.e.a.c.g.j<l> jVar = this.b;
        l.a a2 = l.a();
        a2.b(dVar.b());
        a2.d(dVar.c());
        a2.c(dVar.h());
        jVar.c(a2.a());
        return true;
    }
}
