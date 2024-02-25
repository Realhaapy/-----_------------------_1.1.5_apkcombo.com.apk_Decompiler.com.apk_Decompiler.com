package m.v;

import java.io.Serializable;
import m.v.g;
import m.y.c.p;
import m.y.d.l;

public final class h implements g, Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final h f5035e = new h();
    private static final long serialVersionUID = 0;

    private h() {
    }

    private final Object readResolve() {
        return f5035e;
    }

    public <R> R fold(R r2, p<? super R, ? super g.b, ? extends R> pVar) {
        l.d(pVar, "operation");
        return r2;
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        l.d(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public g minusKey(g.c<?> cVar) {
        l.d(cVar, "key");
        return this;
    }

    public g plus(g gVar) {
        l.d(gVar, "context");
        return gVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
