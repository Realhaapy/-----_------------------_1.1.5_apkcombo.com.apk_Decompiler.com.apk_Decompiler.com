package kotlinx.coroutines;

import m.v.b;
import m.v.d;
import m.v.e;
import m.v.g;
import m.y.c.l;
import m.y.d.g;
import m.y.d.m;

public abstract class f0 extends m.v.a implements e {

    /* renamed from: e  reason: collision with root package name */
    public static final a f4789e = new a((g) null);

    public static final class a extends b<e, f0> {

        /* renamed from: kotlinx.coroutines.f0$a$a  reason: collision with other inner class name */
        static final class C0138a extends m implements l<g.b, f0> {

            /* renamed from: e  reason: collision with root package name */
            public static final C0138a f4790e = new C0138a();

            C0138a() {
                super(1);
            }

            /* renamed from: a */
            public final f0 invoke(g.b bVar) {
                if (bVar instanceof f0) {
                    return (f0) bVar;
                }
                return null;
            }
        }

        private a() {
            super(e.b, C0138a.f4790e);
        }

        public /* synthetic */ a(m.y.d.g gVar) {
            this();
        }
    }

    public f0() {
        super(e.b);
    }

    public abstract void T(m.v.g gVar, Runnable runnable);

    public boolean U(m.v.g gVar) {
        return true;
    }

    public final void c(d<?> dVar) {
        ((kotlinx.coroutines.internal.g) dVar).r();
    }

    public final <T> d<T> g(d<? super T> dVar) {
        return new kotlinx.coroutines.internal.g(this, dVar);
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        return e.a.a(this, cVar);
    }

    public m.v.g minusKey(g.c<?> cVar) {
        return e.a.b(this, cVar);
    }

    public String toString() {
        return p0.a(this) + '@' + p0.b(this);
    }
}
