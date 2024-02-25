package kotlinx.coroutines;

import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.internal.g;
import m.m;
import m.n;
import m.s;
import m.v.d;

public final class t0 {
    public static final <T> void a(s0<? super T> s0Var, int i2) {
        boolean z = true;
        if (o0.a()) {
            if (!(i2 != -1)) {
                throw new AssertionError();
            }
        }
        d<? super T> c = s0Var.c();
        if (i2 != 4) {
            z = false;
        }
        if (z || !(c instanceof g) || b(i2) != b(s0Var.f4941g)) {
            d(s0Var, c, z);
            return;
        }
        f0 f0Var = ((g) c).f4808h;
        m.v.g context = c.getContext();
        if (f0Var.U(context)) {
            f0Var.T(context, s0Var);
        } else {
            e(s0Var);
        }
    }

    public static final boolean b(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static final boolean c(int i2) {
        return i2 == 2;
    }

    public static final <T> void d(s0<? super T> s0Var, d<? super T> dVar, boolean z) {
        Object obj;
        Object l2 = s0Var.l();
        Throwable e2 = s0Var.e(l2);
        if (e2 != null) {
            m.a aVar = m.f5014e;
            obj = n.a(e2);
        } else {
            m.a aVar2 = m.f5014e;
            obj = s0Var.g(l2);
        }
        m.a(obj);
        if (z) {
            g gVar = (g) dVar;
            d<T> dVar2 = gVar.f4809i;
            Object obj2 = gVar.f4811k;
            m.v.g context = dVar2.getContext();
            Object c = d0.c(context, obj2);
            g2<?> e3 = c != d0.a ? e0.e(dVar2, context, c) : null;
            try {
                gVar.f4809i.resumeWith(obj);
                s sVar = s.a;
            } finally {
                if (e3 == null || e3.x0()) {
                    d0.a(context, c);
                }
            }
        } else {
            dVar.resumeWith(obj);
        }
    }

    private static final void e(s0<?> s0Var) {
        y0 a = e2.a.a();
        if (a.b0()) {
            a.X(s0Var);
            return;
        }
        a.Z(true);
        try {
            d(s0Var, s0Var.c(), true);
            do {
            } while (a.d0());
        } catch (Throwable th) {
            a.V(true);
            throw th;
        }
        a.V(true);
    }
}
