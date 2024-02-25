package f.e.a.c.g;

import com.google.android.gms.common.internal.n;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

final class j0<TResult> extends i<TResult> {
    private final Object a = new Object();
    private final g0<TResult> b = new g0<>();
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f3957d;

    /* renamed from: e  reason: collision with root package name */
    private TResult f3958e;

    /* renamed from: f  reason: collision with root package name */
    private Exception f3959f;

    j0() {
    }

    private final void u() {
        n.k(this.c, "Task is not yet complete");
    }

    private final void v() {
        if (this.f3957d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void w() {
        if (this.c) {
            throw b.a(this);
        }
    }

    private final void x() {
        synchronized (this.a) {
            if (this.c) {
                this.b.b(this);
            }
        }
    }

    public final i<TResult> a(Executor executor, c cVar) {
        this.b.a(new w(executor, cVar));
        x();
        return this;
    }

    public final i<TResult> b(d<TResult> dVar) {
        this.b.a(new y(k.a, dVar));
        x();
        return this;
    }

    public final i<TResult> c(Executor executor, d<TResult> dVar) {
        this.b.a(new y(executor, dVar));
        x();
        return this;
    }

    public final i<TResult> d(Executor executor, e eVar) {
        this.b.a(new a0(executor, eVar));
        x();
        return this;
    }

    public final i<TResult> e(Executor executor, f<? super TResult> fVar) {
        this.b.a(new c0(executor, fVar));
        x();
        return this;
    }

    public final <TContinuationResult> i<TContinuationResult> f(Executor executor, a<TResult, TContinuationResult> aVar) {
        j0 j0Var = new j0();
        this.b.a(new s(executor, aVar, j0Var));
        x();
        return j0Var;
    }

    public final <TContinuationResult> i<TContinuationResult> g(Executor executor, a<TResult, i<TContinuationResult>> aVar) {
        j0 j0Var = new j0();
        this.b.a(new u(executor, aVar, j0Var));
        x();
        return j0Var;
    }

    public final Exception h() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f3959f;
        }
        return exc;
    }

    public final TResult i() {
        TResult tresult;
        synchronized (this.a) {
            u();
            v();
            Exception exc = this.f3959f;
            if (exc == null) {
                tresult = this.f3958e;
            } else {
                throw new g(exc);
            }
        }
        return tresult;
    }

    public final <X extends Throwable> TResult j(Class<X> cls) {
        TResult tresult;
        synchronized (this.a) {
            u();
            v();
            if (!cls.isInstance(this.f3959f)) {
                Exception exc = this.f3959f;
                if (exc == null) {
                    tresult = this.f3958e;
                } else {
                    throw new g(exc);
                }
            } else {
                throw ((Throwable) cls.cast(this.f3959f));
            }
        }
        return tresult;
    }

    public final boolean k() {
        return this.f3957d;
    }

    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public final boolean m() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && !this.f3957d && this.f3959f == null) {
                z = true;
            }
        }
        return z;
    }

    public final <TContinuationResult> i<TContinuationResult> n(h<TResult, TContinuationResult> hVar) {
        Executor executor = k.a;
        j0 j0Var = new j0();
        this.b.a(new e0(executor, hVar, j0Var));
        x();
        return j0Var;
    }

    public final <TContinuationResult> i<TContinuationResult> o(Executor executor, h<TResult, TContinuationResult> hVar) {
        j0 j0Var = new j0();
        this.b.a(new e0(executor, hVar, j0Var));
        x();
        return j0Var;
    }

    public final void p(Exception exc) {
        n.i(exc, "Exception must not be null");
        synchronized (this.a) {
            w();
            this.c = true;
            this.f3959f = exc;
        }
        this.b.b(this);
    }

    public final void q(TResult tresult) {
        synchronized (this.a) {
            w();
            this.c = true;
            this.f3958e = tresult;
        }
        this.b.b(this);
    }

    public final boolean r() {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.f3957d = true;
            this.b.b(this);
            return true;
        }
    }

    public final boolean s(Exception exc) {
        n.i(exc, "Exception must not be null");
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.f3959f = exc;
            this.b.b(this);
            return true;
        }
    }

    public final boolean t(TResult tresult) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.f3958e = tresult;
            this.b.b(this);
            return true;
        }
    }
}
