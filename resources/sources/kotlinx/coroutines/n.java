package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.n1;
import m.s;
import m.v.d;
import m.v.g;
import m.v.j.a.e;
import m.y.c.l;

public class n<T> extends s0<T> implements m<T>, e {

    /* renamed from: k  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f4927k = AtomicIntegerFieldUpdater.newUpdater(n.class, "_decision");

    /* renamed from: l  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4928l = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: h  reason: collision with root package name */
    private final d<T> f4929h;

    /* renamed from: i  reason: collision with root package name */
    private final g f4930i;

    /* renamed from: j  reason: collision with root package name */
    private w0 f4931j;

    public n(d<? super T> dVar, int i2) {
        super(i2);
        this.f4929h = dVar;
        if (o0.a()) {
            if (!(i2 != -1)) {
                throw new AssertionError();
            }
        }
        this.f4930i = dVar.getContext();
        this._decision = 0;
        this._state = f.f4788e;
    }

    private final boolean A() {
        return t0.c(this.f4941g) && ((kotlinx.coroutines.internal.g) this.f4929h).p();
    }

    private final k B(l<? super Throwable, s> lVar) {
        return lVar instanceof k ? (k) lVar : new k1(lVar);
    }

    private final void C(l<? super Throwable, s> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    private final void F() {
        d<T> dVar = this.f4929h;
        Throwable th = null;
        kotlinx.coroutines.internal.g gVar = dVar instanceof kotlinx.coroutines.internal.g ? (kotlinx.coroutines.internal.g) dVar : null;
        if (gVar != null) {
            th = gVar.s(this);
        }
        if (th != null) {
            s();
            q(th);
        }
    }

    private final void H(Object obj, int i2, l<? super Throwable, s> lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof a2) {
            } else {
                if (obj2 instanceof q) {
                    q qVar = (q) obj2;
                    if (qVar.c()) {
                        if (lVar != null) {
                            p(lVar, qVar.a);
                            return;
                        }
                        return;
                    }
                }
                m(obj);
                throw null;
            }
        } while (!f4928l.compareAndSet(this, obj2, J((a2) obj2, obj, i2, lVar, (Object) null)));
        t();
        u(i2);
    }

    static /* synthetic */ void I(n nVar, Object obj, int i2, l lVar, int i3, Object obj2) {
        if (obj2 == null) {
            if ((i3 & 4) != 0) {
                lVar = null;
            }
            nVar.H(obj, i2, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    private final Object J(a2 a2Var, Object obj, int i2, l<? super Throwable, s> lVar, Object obj2) {
        if (obj instanceof y) {
            boolean z = true;
            if (o0.a()) {
                if (!(obj2 == null)) {
                    throw new AssertionError();
                }
            }
            if (!o0.a()) {
                return obj;
            }
            if (lVar != null) {
                z = false;
            }
            if (z) {
                return obj;
            }
            throw new AssertionError();
        } else if (!t0.b(i2) && obj2 == null) {
            return obj;
        } else {
            if (lVar == null && ((!(a2Var instanceof k) || (a2Var instanceof g)) && obj2 == null)) {
                return obj;
            }
            return new x(obj, a2Var instanceof k ? (k) a2Var : null, lVar, obj2, (Throwable) null, 16, (m.y.d.g) null);
        }
    }

    private final boolean K() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f4927k.compareAndSet(this, 0, 2));
        return true;
    }

    private final z L(Object obj, Object obj2, l<? super Throwable, s> lVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof a2) {
            } else if (!(obj3 instanceof x) || obj2 == null) {
                return null;
            } else {
                x xVar = (x) obj3;
                if (xVar.f4961d != obj2) {
                    return null;
                }
                if (!o0.a() || m.y.d.l.a(xVar.a, obj)) {
                    return o.a;
                }
                throw new AssertionError();
            }
        } while (!f4928l.compareAndSet(this, obj3, J((a2) obj3, obj, this.f4941g, lVar, obj2)));
        t();
        return o.a;
    }

    private final boolean M() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f4927k.compareAndSet(this, 0, 1));
        return true;
    }

    private final Void m(Object obj) {
        throw new IllegalStateException(m.y.d.l.j("Already resumed, but proposed with update ", obj).toString());
    }

    private final void n(l<? super Throwable, s> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            h0.a(getContext(), new b0(m.y.d.l.j("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    private final boolean r(Throwable th) {
        if (!A()) {
            return false;
        }
        return ((kotlinx.coroutines.internal.g) this.f4929h).q(th);
    }

    private final void t() {
        if (!A()) {
            s();
        }
    }

    private final void u(int i2) {
        if (!K()) {
            t0.a(this, i2);
        }
    }

    private final String y() {
        Object x = x();
        return x instanceof a2 ? "Active" : x instanceof q ? "Cancelled" : "Completed";
    }

    private final w0 z() {
        n1 n1Var = (n1) getContext().get(n1.f4932d);
        if (n1Var == null) {
            return null;
        }
        w0 d2 = n1.a.d(n1Var, true, false, new r(this), 2, (Object) null);
        this.f4931j = d2;
        return d2;
    }

    /* access modifiers changed from: protected */
    public String D() {
        return "CancellableContinuation";
    }

    public final void E(Throwable th) {
        if (!r(th)) {
            q(th);
            t();
        }
    }

    public final boolean G() {
        if (o0.a()) {
            if (!(this.f4941g == 2)) {
                throw new AssertionError();
            }
        }
        if (o0.a()) {
            if (!(this.f4931j != z1.f4972e)) {
                throw new AssertionError();
            }
        }
        Object obj = this._state;
        if (o0.a() && !(!(obj instanceof a2))) {
            throw new AssertionError();
        } else if (!(obj instanceof x) || ((x) obj).f4961d == null) {
            this._decision = 0;
            this._state = f.f4788e;
            return true;
        } else {
            s();
            return false;
        }
    }

    public void a(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof a2) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof y)) {
                if (obj2 instanceof x) {
                    x xVar = (x) obj2;
                    if (!xVar.c()) {
                        if (f4928l.compareAndSet(this, obj2, x.b(xVar, (Object) null, (k) null, (l) null, (Object) null, th, 15, (Object) null))) {
                            xVar.d(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (f4928l.compareAndSet(this, obj2, new x(obj2, (k) null, (l) null, (Object) null, th, 14, (m.y.d.g) null))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public Object b(T t, Object obj, l<? super Throwable, s> lVar) {
        return L(t, obj, lVar);
    }

    public final d<T> c() {
        return this.f4929h;
    }

    public Object d(T t, Object obj) {
        return L(t, obj, (l<? super Throwable, s>) null);
    }

    public Throwable e(Object obj) {
        Throwable e2 = super.e(obj);
        if (e2 == null) {
            return null;
        }
        d c = c();
        return (!o0.d() || !(c instanceof e)) ? e2 : y.j(e2, (e) c);
    }

    public void f(T t, l<? super Throwable, s> lVar) {
        H(t, this.f4941g, lVar);
    }

    public <T> T g(Object obj) {
        return obj instanceof x ? ((x) obj).a : obj;
    }

    public e getCallerFrame() {
        d<T> dVar = this.f4929h;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public g getContext() {
        return this.f4930i;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public void h(l<? super Throwable, s> lVar) {
        k B = B(lVar);
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof f)) {
                Throwable th = null;
                if (!(obj instanceof k)) {
                    boolean z = obj instanceof y;
                    if (z) {
                        y yVar = (y) obj;
                        if (!yVar.b()) {
                            C(lVar, obj);
                            throw null;
                        } else if (obj instanceof q) {
                            if (!z) {
                                yVar = null;
                            }
                            if (yVar != null) {
                                th = yVar.a;
                            }
                            n(lVar, th);
                            return;
                        } else {
                            return;
                        }
                    } else if (obj instanceof x) {
                        x xVar = (x) obj;
                        if (xVar.b != null) {
                            C(lVar, obj);
                            throw null;
                        } else if (!(B instanceof g)) {
                            if (xVar.c()) {
                                n(lVar, xVar.f4962e);
                                return;
                            }
                            if (f4928l.compareAndSet(this, obj, x.b(xVar, (Object) null, B, (l) null, (Object) null, (Throwable) null, 29, (Object) null))) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (!(B instanceof g)) {
                        if (f4928l.compareAndSet(this, obj, new x(obj, B, (l) null, (Object) null, (Throwable) null, 28, (m.y.d.g) null))) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    C(lVar, obj);
                    throw null;
                }
            } else if (f4928l.compareAndSet(this, obj, B)) {
                return;
            }
        }
    }

    public Object i(Throwable th) {
        return L(new y(th, false, 2, (m.y.d.g) null), (Object) null, (l<? super Throwable, s>) null);
    }

    public void j(Object obj) {
        if (o0.a()) {
            if (!(obj == o.a)) {
                throw new AssertionError();
            }
        }
        u(this.f4941g);
    }

    public Object l() {
        return x();
    }

    public final void o(k kVar, Throwable th) {
        try {
            kVar.a(th);
        } catch (Throwable th2) {
            h0.a(getContext(), new b0(m.y.d.l.j("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    public final void p(l<? super Throwable, s> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            h0.a(getContext(), new b0(m.y.d.l.j("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    public boolean q(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof a2)) {
                return false;
            }
            z = obj instanceof k;
        } while (!f4928l.compareAndSet(this, obj, new q(this, th, z)));
        k kVar = z ? (k) obj : null;
        if (kVar != null) {
            o(kVar, th);
        }
        t();
        u(this.f4941g);
        return true;
    }

    public void resumeWith(Object obj) {
        I(this, c0.c(obj, this), this.f4941g, (l) null, 4, (Object) null);
    }

    public final void s() {
        w0 w0Var = this.f4931j;
        if (w0Var != null) {
            w0Var.dispose();
            this.f4931j = z1.f4972e;
        }
    }

    public String toString() {
        return D() + '(' + p0.c(this.f4929h) + "){" + y() + "}@" + p0.b(this);
    }

    public Throwable v(n1 n1Var) {
        return n1Var.E();
    }

    public final Object w() {
        n1 n1Var;
        boolean A = A();
        if (M()) {
            if (this.f4931j == null) {
                z();
            }
            if (A) {
                F();
            }
            return d.c();
        }
        if (A) {
            F();
        }
        Object x = x();
        if (x instanceof y) {
            Throwable th = ((y) x).a;
            if (o0.d()) {
                th = y.j(th, this);
            }
            throw th;
        } else if (!t0.b(this.f4941g) || (n1Var = (n1) getContext().get(n1.f4932d)) == null || n1Var.a()) {
            return g(x);
        } else {
            Throwable E = n1Var.E();
            a(x, E);
            if (o0.d()) {
                E = y.j(E, this);
            }
            throw E;
        }
    }

    public final Object x() {
        return this._state;
    }
}
