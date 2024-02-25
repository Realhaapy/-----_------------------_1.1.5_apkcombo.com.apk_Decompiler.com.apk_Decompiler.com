package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.c0;
import kotlinx.coroutines.e2;
import kotlinx.coroutines.f0;
import kotlinx.coroutines.m;
import kotlinx.coroutines.n;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.y0;
import kotlinx.coroutines.z;
import m.s;
import m.v.d;
import m.v.j.a.e;
import m.y.d.l;

public final class g<T> extends s0<T> implements e, d<T> {

    /* renamed from: l  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4807l = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;

    /* renamed from: h  reason: collision with root package name */
    public final f0 f4808h;

    /* renamed from: i  reason: collision with root package name */
    public final d<T> f4809i;

    /* renamed from: j  reason: collision with root package name */
    public Object f4810j = h.a;

    /* renamed from: k  reason: collision with root package name */
    public final Object f4811k = d0.b(getContext());

    public g(f0 f0Var, d<? super T> dVar) {
        super(-1);
        this.f4808h = f0Var;
        this.f4809i = dVar;
    }

    private final n<?> o() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof n) {
            return (n) obj;
        }
        return null;
    }

    public void a(Object obj, Throwable th) {
        if (obj instanceof z) {
            ((z) obj).b.invoke(th);
        }
    }

    public d<T> c() {
        return this;
    }

    public e getCallerFrame() {
        d<T> dVar = this.f4809i;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public m.v.g getContext() {
        return this.f4809i.getContext();
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public Object l() {
        Object obj = this.f4810j;
        if (o0.a()) {
            if (!(obj != h.a)) {
                throw new AssertionError();
            }
        }
        this.f4810j = h.a;
        return obj;
    }

    public final void m() {
        do {
        } while (this._reusableCancellableContinuation == h.b);
    }

    public final n<T> n() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = h.b;
                return null;
            } else if (obj instanceof n) {
                if (f4807l.compareAndSet(this, obj, h.b)) {
                    return (n) obj;
                }
            } else if (obj != h.b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(l.j("Inconsistent state ", obj).toString());
            }
        }
    }

    public final boolean p() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean q(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            z zVar = h.b;
            if (l.a(obj, zVar)) {
                if (f4807l.compareAndSet(this, zVar, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (f4807l.compareAndSet(this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    public final void r() {
        m();
        n<?> o2 = o();
        if (o2 != null) {
            o2.s();
        }
    }

    public void resumeWith(Object obj) {
        m.v.g context;
        Object c;
        m.v.g context2 = this.f4809i.getContext();
        Object d2 = c0.d(obj, (m.y.c.l) null, 1, (Object) null);
        if (this.f4808h.U(context2)) {
            this.f4810j = d2;
            this.f4941g = 0;
            this.f4808h.T(context2, this);
            return;
        }
        boolean a = o0.a();
        y0 a2 = e2.a.a();
        if (a2.b0()) {
            this.f4810j = d2;
            this.f4941g = 0;
            a2.X(this);
            return;
        }
        a2.Z(true);
        try {
            context = getContext();
            c = d0.c(context, this.f4811k);
            this.f4809i.resumeWith(obj);
            s sVar = s.a;
            d0.a(context, c);
            do {
            } while (a2.d0());
        } catch (Throwable th) {
            try {
                k(th, (Throwable) null);
            } catch (Throwable th2) {
                a2.V(true);
                throw th2;
            }
        }
        a2.V(true);
    }

    public final Throwable s(m<?> mVar) {
        z zVar;
        do {
            Object obj = this._reusableCancellableContinuation;
            zVar = h.b;
            if (obj != zVar) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(l.j("Inconsistent state ", obj).toString());
                } else if (f4807l.compareAndSet(this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!f4807l.compareAndSet(this, zVar, mVar));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f4808h + ", " + p0.c(this.f4809i) + ']';
    }
}
