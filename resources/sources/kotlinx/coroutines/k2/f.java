package kotlinx.coroutines.k2;

import m.s;
import m.v.d;
import m.y.c.p;

final class f<T> extends a<T> {
    private final p<c<? super T>, d<? super s>, Object> a;

    public f(p<? super c<? super T>, ? super d<? super s>, ? extends Object> pVar) {
        this.a = pVar;
    }

    public Object b(c<? super T> cVar, d<? super s> dVar) {
        Object invoke = this.a.invoke(cVar, dVar);
        return invoke == d.c() ? invoke : s.a;
    }
}
