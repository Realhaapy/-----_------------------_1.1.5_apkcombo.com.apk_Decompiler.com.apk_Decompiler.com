package f.e.a.c.g;

import java.util.concurrent.Executor;

final class e0<TResult, TContinuationResult> implements f<TContinuationResult>, e, c, f0 {
    private final Executor a;
    /* access modifiers changed from: private */
    public final h<TResult, TContinuationResult> b;
    private final j0<TContinuationResult> c;

    public e0(Executor executor, h<TResult, TContinuationResult> hVar, j0<TContinuationResult> j0Var) {
        this.a = executor;
        this.b = hVar;
        this.c = j0Var;
    }

    public final void a(Exception exc) {
        this.c.p(exc);
    }

    public final void b() {
        this.c.r();
    }

    public final void c(i<TResult> iVar) {
        this.a.execute(new d0(this, iVar));
    }

    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.c.q(tcontinuationresult);
    }
}
