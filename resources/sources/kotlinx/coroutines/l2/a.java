package kotlinx.coroutines.l2;

import kotlinx.coroutines.internal.h;
import m.m;
import m.n;
import m.s;
import m.v.d;
import m.y.c.l;
import m.y.c.p;

public final class a {
    public static final /* synthetic */ void a(d dVar, Throwable th) {
        b(dVar, th);
        throw null;
    }

    private static final void b(d<?> dVar, Throwable th) {
        m.a aVar = m.f5014e;
        Object a = n.a(th);
        m.a(a);
        dVar.resumeWith(a);
        throw th;
    }

    public static final void c(d<? super s> dVar, d<?> dVar2) {
        try {
            d<? super s> b = c.b(dVar);
            m.a aVar = m.f5014e;
            s sVar = s.a;
            m.a(sVar);
            h.c(b, sVar, (l) null, 2, (Object) null);
        } catch (Throwable th) {
            a(dVar2, th);
            throw null;
        }
    }

    public static final <R, T> void d(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r2, d<? super T> dVar, l<? super Throwable, s> lVar) {
        try {
            d<s> b = c.b(c.a(pVar, r2, dVar));
            m.a aVar = m.f5014e;
            s sVar = s.a;
            m.a(sVar);
            h.b(b, sVar, lVar);
        } catch (Throwable th) {
            a(dVar, th);
            throw null;
        }
    }

    public static /* synthetic */ void e(p pVar, Object obj, d dVar, l lVar, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        d(pVar, obj, dVar, lVar);
    }
}
