package kotlinx.coroutines.l2;

import kotlinx.coroutines.internal.d0;
import m.m;
import m.n;
import m.v.d;
import m.v.g;
import m.v.j.a.h;
import m.y.c.p;
import m.y.d.t;

public final class b {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r2, d<? super T> dVar) {
        Object obj;
        g context;
        Object c;
        h.a(dVar);
        try {
            context = dVar.getContext();
            c = d0.c(context, (Object) null);
            if (pVar != null) {
                t.b(pVar, 2);
                obj = pVar.invoke(r2, dVar);
                d0.a(context, c);
                if (obj != d.c()) {
                    m.a aVar = m.f5014e;
                    m.a(obj);
                    dVar.resumeWith(obj);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        } catch (Throwable th) {
            m.a aVar2 = m.f5014e;
            obj = n.a(th);
        }
    }
}
