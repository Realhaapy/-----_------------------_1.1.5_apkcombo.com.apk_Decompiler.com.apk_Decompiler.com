package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.c;
import f.e.a.c.g.j;

public final class x0 extends t0<Boolean> {
    public final h<?> c;

    public x0(h<?> hVar, j<Boolean> jVar) {
        super(4, jVar);
        this.c = hVar;
    }

    public final /* bridge */ /* synthetic */ void d(q qVar, boolean z) {
    }

    public final boolean f(z<?> zVar) {
        m0 m0Var = zVar.x().get(this.c);
        if (m0Var == null) {
            return false;
        }
        m0Var.a.d();
        throw null;
    }

    public final c[] g(z<?> zVar) {
        m0 m0Var = zVar.x().get(this.c);
        if (m0Var == null) {
            return null;
        }
        return m0Var.a.b();
    }

    public final void h(z<?> zVar) {
        m0 remove = zVar.x().remove(this.c);
        if (remove != null) {
            remove.b.a(zVar.v(), this.b);
            remove.a.a();
            return;
        }
        this.b.e(Boolean.FALSE);
    }
}
