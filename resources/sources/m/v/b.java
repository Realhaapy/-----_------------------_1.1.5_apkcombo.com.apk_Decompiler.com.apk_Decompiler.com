package m.v;

import m.v.g;
import m.v.g.b;
import m.y.c.l;

public abstract class b<B extends g.b, E extends B> implements g.c<E> {

    /* renamed from: e  reason: collision with root package name */
    private final l<g.b, E> f5025e;

    /* renamed from: f  reason: collision with root package name */
    private final g.c<?> f5026f;

    public b(g.c<B> cVar, l<? super g.b, ? extends E> lVar) {
        m.y.d.l.d(cVar, "baseKey");
        m.y.d.l.d(lVar, "safeCast");
        this.f5025e = lVar;
        this.f5026f = cVar instanceof b ? ((b) cVar).f5026f : cVar;
    }

    public final boolean a(g.c<?> cVar) {
        m.y.d.l.d(cVar, "key");
        return cVar == this || this.f5026f == cVar;
    }

    public final E b(g.b bVar) {
        m.y.d.l.d(bVar, "element");
        return (g.b) this.f5025e.invoke(bVar);
    }
}
