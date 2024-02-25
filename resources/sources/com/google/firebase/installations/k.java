package com.google.firebase.installations;

import com.google.firebase.installations.q.d;
import f.e.a.c.g.j;

class k implements n {
    final j<String> a;

    public k(j<String> jVar) {
        this.a = jVar;
    }

    public boolean a(Exception exc) {
        return false;
    }

    public boolean b(d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.a.e(dVar.d());
        return true;
    }
}
