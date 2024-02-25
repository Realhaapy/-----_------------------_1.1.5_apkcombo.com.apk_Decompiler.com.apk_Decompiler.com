package m.v;

import m.m;
import m.s;
import m.y.c.p;
import m.y.d.l;

public final class f {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r2, d<? super T> dVar) {
        l.d(pVar, "<this>");
        l.d(dVar, "completion");
        d<s> b = c.b(c.a(pVar, r2, dVar));
        m.a aVar = m.f5014e;
        s sVar = s.a;
        m.a(sVar);
        b.resumeWith(sVar);
    }
}
