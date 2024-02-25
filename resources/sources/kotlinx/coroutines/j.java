package kotlinx.coroutines;

import m.s;
import m.v.d;
import m.v.g;
import m.v.h;
import m.y.c.p;

final /* synthetic */ class j {
    public static final n1 a(k0 k0Var, g gVar, m0 m0Var, p<? super k0, ? super d<? super s>, ? extends Object> pVar) {
        g c = e0.c(k0Var, gVar);
        c w1Var = m0Var.d() ? new w1(c, pVar) : new c2(c, true);
        w1Var.v0(m0Var, w1Var, pVar);
        return w1Var;
    }

    public static /* synthetic */ n1 b(k0 k0Var, g gVar, m0 m0Var, p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            gVar = h.f5035e;
        }
        if ((i2 & 2) != 0) {
            m0Var = m0.DEFAULT;
        }
        return i.a(k0Var, gVar, m0Var, pVar);
    }
}
