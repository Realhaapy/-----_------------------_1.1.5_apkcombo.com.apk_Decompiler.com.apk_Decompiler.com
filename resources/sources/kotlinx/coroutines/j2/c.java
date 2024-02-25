package kotlinx.coroutines.j2;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.j2.i;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.p0;
import m.s;
import m.y.c.l;
import m.y.d.g;

public abstract class c<E> implements t<E> {
    protected final l<E, s> b;
    private final m c = new m();
    private volatile /* synthetic */ Object onCloseHandler = null;

    public static final class a<E> extends s {

        /* renamed from: h  reason: collision with root package name */
        public final E f4841h;

        public a(E e2) {
            this.f4841h = e2;
        }

        public String toString() {
            return "SendBuffered@" + p0.b(this) + '(' + this.f4841h + ')';
        }

        public void x() {
        }

        public Object y() {
            return this.f4841h;
        }

        public z z(o.c cVar) {
            z zVar = kotlinx.coroutines.o.a;
            if (cVar == null) {
                return zVar;
            }
            cVar.d();
            throw null;
        }
    }

    static {
        AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "onCloseHandler");
    }

    public c(l<? super E, s> lVar) {
        this.b = lVar;
    }

    private final int b() {
        m mVar = this.c;
        int i2 = 0;
        for (o oVar = (o) mVar.n(); !m.y.d.l.a(oVar, mVar); oVar = oVar.o()) {
            if (oVar instanceof o) {
                i2++;
            }
        }
        return i2;
    }

    private final String f() {
        o o2 = this.c.o();
        if (o2 == this.c) {
            return "EmptyQueue";
        }
        String oVar = o2 instanceof j ? o2.toString() : o2 instanceof o ? "ReceiveQueued" : o2 instanceof s ? "SendQueued" : m.y.d.l.j("UNEXPECTED:", o2);
        o p2 = this.c.p();
        if (p2 == o2) {
            return oVar;
        }
        String str = oVar + ",queueSize=" + b();
        if (!(p2 instanceof j)) {
            return str;
        }
        return str + ",closedForSend=" + p2;
    }

    private final void g(j<?> jVar) {
        Object b2 = kotlinx.coroutines.internal.l.b((Object) null, 1, (g) null);
        while (true) {
            o p2 = jVar.p();
            o oVar = p2 instanceof o ? (o) p2 : null;
            if (oVar == null) {
                break;
            } else if (!oVar.t()) {
                oVar.q();
            } else {
                b2 = kotlinx.coroutines.internal.l.c(b2, oVar);
            }
        }
        if (b2 != null) {
            if (!(b2 instanceof ArrayList)) {
                ((o) b2).y(jVar);
            } else {
                Objects.requireNonNull(b2, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
                ArrayList arrayList = (ArrayList) b2;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        ((o) arrayList.get(size)).y(jVar);
                        if (i2 < 0) {
                            break;
                        }
                        size = i2;
                    }
                }
            }
        }
        j(jVar);
    }

    private final Throwable h(j<?> jVar) {
        g(jVar);
        return jVar.E();
    }

    public final Object a(E e2) {
        j<?> jVar;
        i.b bVar;
        Object i2 = i(e2);
        if (i2 == b.b) {
            i.b bVar2 = i.a;
            s sVar = s.a;
            bVar2.c(sVar);
            return sVar;
        }
        if (i2 == b.c) {
            jVar = d();
            if (jVar == null) {
                return i.a.b();
            }
            bVar = i.a;
        } else if (i2 instanceof j) {
            bVar = i.a;
            jVar = (j) i2;
        } else {
            throw new IllegalStateException(m.y.d.l.j("trySend returned ", i2).toString());
        }
        return bVar.a(h(jVar));
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "";
    }

    /* access modifiers changed from: protected */
    public final j<?> d() {
        o p2 = this.c.p();
        j<?> jVar = p2 instanceof j ? (j) p2 : null;
        if (jVar == null) {
            return null;
        }
        g(jVar);
        return jVar;
    }

    /* access modifiers changed from: protected */
    public final m e() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public Object i(E e2) {
        q l2;
        z e3;
        do {
            l2 = l();
            if (l2 == null) {
                return b.c;
            }
            e3 = l2.e(e2, (o.c) null);
        } while (e3 == null);
        if (o0.a()) {
            if (!(e3 == kotlinx.coroutines.o.a)) {
                throw new AssertionError();
            }
        }
        l2.b(e2);
        return l2.d();
    }

    /* access modifiers changed from: protected */
    public void j(o oVar) {
    }

    /* access modifiers changed from: protected */
    public final q<?> k(E e2) {
        o p2;
        m mVar = this.c;
        a aVar = new a(e2);
        do {
            p2 = mVar.p();
            if (p2 instanceof q) {
                return (q) p2;
            }
        } while (!p2.i(aVar, mVar));
        return null;
    }

    /* access modifiers changed from: protected */
    public q<E> l() {
        o oVar;
        o u;
        m mVar = this.c;
        while (true) {
            oVar = (o) mVar.n();
            if (oVar != mVar && (oVar instanceof q)) {
                if (((((q) oVar) instanceof j) && !oVar.s()) || (u = oVar.u()) == null) {
                    break;
                }
                u.r();
            }
        }
        oVar = null;
        return (q) oVar;
    }

    /* access modifiers changed from: protected */
    public final s m() {
        o oVar;
        o u;
        m mVar = this.c;
        while (true) {
            oVar = (o) mVar.n();
            if (oVar != mVar && (oVar instanceof s)) {
                if (((((s) oVar) instanceof j) && !oVar.s()) || (u = oVar.u()) == null) {
                    break;
                }
                u.r();
            }
        }
        oVar = null;
        return (s) oVar;
    }

    public String toString() {
        return p0.a(this) + '@' + p0.b(this) + '{' + f() + '}' + c();
    }
}
