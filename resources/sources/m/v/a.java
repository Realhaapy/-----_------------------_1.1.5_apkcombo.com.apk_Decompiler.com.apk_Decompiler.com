package m.v;

import m.v.g;
import m.y.c.p;
import m.y.d.l;

public abstract class a implements g.b {
    private final g.c<?> key;

    public a(g.c<?> cVar) {
        l.d(cVar, "key");
        this.key = cVar;
    }

    public <R> R fold(R r2, p<? super R, ? super g.b, ? extends R> pVar) {
        return g.b.a.a(this, r2, pVar);
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        return g.b.a.b(this, cVar);
    }

    public g.c<?> getKey() {
        return this.key;
    }

    public g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    public g plus(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
