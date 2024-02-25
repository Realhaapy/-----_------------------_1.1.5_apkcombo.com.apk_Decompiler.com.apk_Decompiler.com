package kotlinx.coroutines;

import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.internal.x;
import m.s;
import m.v.d;
import m.v.g;

public final class g2<T> extends x<T> {

    /* renamed from: h  reason: collision with root package name */
    private g f4793h;

    /* renamed from: i  reason: collision with root package name */
    private Object f4794i;

    /* access modifiers changed from: protected */
    public void s0(Object obj) {
        g gVar = this.f4793h;
        g2<?> g2Var = null;
        if (gVar != null) {
            d0.a(gVar, this.f4794i);
            this.f4793h = g2Var;
            this.f4794i = g2Var;
        }
        Object a = c0.a(obj, this.f4832g);
        d<T> dVar = this.f4832g;
        g context = dVar.getContext();
        Object c = d0.c(context, g2Var);
        if (c != d0.a) {
            g2Var = e0.e(dVar, context, c);
        }
        try {
            this.f4832g.resumeWith(a);
            s sVar = s.a;
        } finally {
            if (g2Var == null || g2Var.x0()) {
                d0.a(context, c);
            }
        }
    }

    public final boolean x0() {
        if (this.f4793h == null) {
            return false;
        }
        this.f4793h = null;
        this.f4794i = null;
        return true;
    }

    public final void y0(g gVar, Object obj) {
        this.f4793h = gVar;
        this.f4794i = obj;
    }
}
