package kotlinx.coroutines.k2.g;

import m.v.g;
import m.y.c.p;

public final class a implements g.b {

    /* renamed from: g  reason: collision with root package name */
    public static final C0141a f4859g = new C0141a((m.y.d.g) null);

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f4860e;

    /* renamed from: f  reason: collision with root package name */
    private final g.c<?> f4861f = f4859g;

    /* renamed from: kotlinx.coroutines.k2.g.a$a  reason: collision with other inner class name */
    public static final class C0141a implements g.c<a> {
        private C0141a() {
        }

        public /* synthetic */ C0141a(m.y.d.g gVar) {
            this();
        }
    }

    public a(Throwable th) {
        this.f4860e = th;
    }

    public <R> R fold(R r2, p<? super R, ? super g.b, ? extends R> pVar) {
        return g.b.a.a(this, r2, pVar);
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        return g.b.a.b(this, cVar);
    }

    public g.c<?> getKey() {
        return this.f4861f;
    }

    public g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    public g plus(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
