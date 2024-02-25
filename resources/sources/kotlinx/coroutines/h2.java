package kotlinx.coroutines;

import m.v.g;
import m.y.c.p;

final class h2 implements g.b, g.c<h2> {

    /* renamed from: e  reason: collision with root package name */
    public static final h2 f4797e = new h2();

    private h2() {
    }

    public <R> R fold(R r2, p<? super R, ? super g.b, ? extends R> pVar) {
        return g.b.a.a(this, r2, pVar);
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        return g.b.a.b(this, cVar);
    }

    public g.c<?> getKey() {
        return this;
    }

    public g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    public g plus(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
