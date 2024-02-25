package kotlinx.coroutines.j2;

import kotlinx.coroutines.g;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.internal.u;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.m;
import kotlinx.coroutines.n;
import kotlinx.coroutines.o;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.p;
import kotlinx.coroutines.p0;
import m.m;
import m.s;
import m.v.j.a.h;
import m.y.c.l;

public abstract class a<E> extends c<E> implements f<E> {

    /* renamed from: kotlinx.coroutines.j2.a$a  reason: collision with other inner class name */
    private static final class C0139a<E> implements g<E> {
        public final a<E> a;
        private Object b = b.f4840d;

        public C0139a(a<E> aVar) {
            this.a = aVar;
        }

        private final boolean c(Object obj) {
            if (!(obj instanceof j)) {
                return true;
            }
            j jVar = (j) obj;
            if (jVar.f4851h == null) {
                return false;
            }
            throw y.k(jVar.D());
        }

        private final Object d(m.v.d<? super Boolean> dVar) {
            Object obj;
            n<? super Boolean> a2 = p.a(c.b(dVar));
            b bVar = new b(this, a2);
            while (true) {
                if (this.a.p(bVar)) {
                    this.a.w(a2, bVar);
                    break;
                }
                Object v = this.a.v();
                e(v);
                if (v instanceof j) {
                    j jVar = (j) v;
                    if (jVar.f4851h == null) {
                        obj = m.v.j.a.b.a(false);
                        m.a aVar = m.f5014e;
                    } else {
                        Throwable D = jVar.D();
                        m.a aVar2 = m.f5014e;
                        obj = m.n.a(D);
                    }
                    m.a(obj);
                    a2.resumeWith(obj);
                } else if (v != b.f4840d) {
                    Boolean a3 = m.v.j.a.b.a(true);
                    l<E, s> lVar = this.a.b;
                    a2.f(a3, lVar == null ? null : u.a(lVar, v, a2.getContext()));
                }
            }
            Object w = a2.w();
            if (w == d.c()) {
                h.c(dVar);
            }
            return w;
        }

        public Object a(m.v.d<? super Boolean> dVar) {
            Object b2 = b();
            z zVar = b.f4840d;
            if (b2 == zVar) {
                e(this.a.v());
                if (b() == zVar) {
                    return d(dVar);
                }
            }
            return m.v.j.a.b.a(c(b()));
        }

        public final Object b() {
            return this.b;
        }

        public final void e(Object obj) {
            this.b = obj;
        }

        public E next() {
            E e2 = this.b;
            if (!(e2 instanceof j)) {
                E e3 = b.f4840d;
                if (e2 != e3) {
                    this.b = e3;
                    return e2;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            throw y.k(((j) e2).D());
        }
    }

    private static class b<E> extends o<E> {

        /* renamed from: h  reason: collision with root package name */
        public final C0139a<E> f4835h;

        /* renamed from: i  reason: collision with root package name */
        public final kotlinx.coroutines.m<Boolean> f4836i;

        public b(C0139a<E> aVar, kotlinx.coroutines.m<? super Boolean> mVar) {
            this.f4835h = aVar;
            this.f4836i = mVar;
        }

        public void b(E e2) {
            this.f4835h.e(e2);
            this.f4836i.j(o.a);
        }

        public z e(E e2, o.c cVar) {
            Object b = this.f4836i.b(Boolean.TRUE, cVar == null ? null : cVar.a, z(e2));
            if (b == null) {
                return null;
            }
            if (o0.a()) {
                if (!(b == kotlinx.coroutines.o.a)) {
                    throw new AssertionError();
                }
            }
            if (cVar == null) {
                return kotlinx.coroutines.o.a;
            }
            cVar.d();
            throw null;
        }

        public String toString() {
            return m.y.d.l.j("ReceiveHasNext@", p0.b(this));
        }

        public void y(j<?> jVar) {
            Object a = jVar.f4851h == null ? m.a.a(this.f4836i, Boolean.FALSE, (Object) null, 2, (Object) null) : this.f4836i.i(jVar.D());
            if (a != null) {
                this.f4835h.e(jVar);
                this.f4836i.j(a);
            }
        }

        public l<Throwable, s> z(E e2) {
            l<E, s> lVar = this.f4835h.a.b;
            if (lVar == null) {
                return null;
            }
            return u.a(lVar, e2, this.f4836i.getContext());
        }
    }

    private final class c extends g {

        /* renamed from: e  reason: collision with root package name */
        private final o<?> f4837e;

        public c(o<?> oVar) {
            this.f4837e = oVar;
        }

        public void a(Throwable th) {
            if (this.f4837e.t()) {
                a.this.t();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return s.a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f4837e + ']';
        }
    }

    public static final class d extends o.b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f4839d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(kotlinx.coroutines.internal.o oVar, a aVar) {
            super(oVar);
            this.f4839d = aVar;
        }

        /* renamed from: i */
        public Object g(kotlinx.coroutines.internal.o oVar) {
            if (this.f4839d.s()) {
                return null;
            }
            return kotlinx.coroutines.internal.n.a();
        }
    }

    public a(l<? super E, s> lVar) {
        super(lVar);
    }

    /* access modifiers changed from: private */
    public final boolean p(o<? super E> oVar) {
        boolean q2 = q(oVar);
        if (q2) {
            u();
        }
        return q2;
    }

    /* access modifiers changed from: private */
    public final void w(kotlinx.coroutines.m<?> mVar, o<?> oVar) {
        mVar.h(new c(oVar));
    }

    public final g<E> iterator() {
        return new C0139a(this);
    }

    /* access modifiers changed from: protected */
    public q<E> l() {
        q<E> l2 = super.l();
        if (l2 != null && !(l2 instanceof j)) {
            t();
        }
        return l2;
    }

    /* access modifiers changed from: protected */
    public boolean q(o<? super E> oVar) {
        int w;
        kotlinx.coroutines.internal.o p2;
        if (r()) {
            kotlinx.coroutines.internal.m e2 = e();
            do {
                p2 = e2.p();
                if (!(!(p2 instanceof s))) {
                    return false;
                }
            } while (!p2.i(oVar, e2));
        } else {
            kotlinx.coroutines.internal.m e3 = e();
            d dVar = new d(oVar, this);
            do {
                kotlinx.coroutines.internal.o p3 = e3.p();
                if (!(!(p3 instanceof s))) {
                    return false;
                }
                w = p3.w(oVar, e3, dVar);
                if (w != 1) {
                }
            } while (w != 2);
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract boolean r();

    /* access modifiers changed from: protected */
    public abstract boolean s();

    /* access modifiers changed from: protected */
    public void t() {
    }

    /* access modifiers changed from: protected */
    public void u() {
    }

    /* access modifiers changed from: protected */
    public Object v() {
        while (true) {
            s m2 = m();
            if (m2 == null) {
                return b.f4840d;
            }
            z z = m2.z((o.c) null);
            if (z != null) {
                if (o0.a()) {
                    if (!(z == kotlinx.coroutines.o.a)) {
                        throw new AssertionError();
                    }
                }
                m2.x();
                return m2.y();
            }
            m2.A();
        }
    }
}
