package f.e.a.c.g;

import java.util.concurrent.Executor;

final class u<TResult, TContinuationResult> implements f<TContinuationResult>, e, c, f0 {
    private final Executor a;
    /* access modifiers changed from: private */
    public final a<TResult, i<TContinuationResult>> b;
    /* access modifiers changed from: private */
    public final j0<TContinuationResult> c;

    public u(Executor executor, a<TResult, i<TContinuationResult>> aVar, j0<TContinuationResult> j0Var) {
        this.a = executor;
        this.b = aVar;
        this.c = j0Var;
    }

    public final void a(Exception exc) {
        this.c.p(exc);
    }

    public final void b() {
        this.c.r();
    }

    public final void c(i<TResult> iVar) {
        this.a.execute(new t(this, iVar));
    }

    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.c.q(tcontinuationresult);
    }
}
