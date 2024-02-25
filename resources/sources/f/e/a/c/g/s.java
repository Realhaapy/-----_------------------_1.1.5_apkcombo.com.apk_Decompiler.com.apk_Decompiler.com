package f.e.a.c.g;

import java.util.concurrent.Executor;

final class s<TResult, TContinuationResult> implements f0<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final a<TResult, TContinuationResult> b;
    /* access modifiers changed from: private */
    public final j0<TContinuationResult> c;

    public s(Executor executor, a<TResult, TContinuationResult> aVar, j0<TContinuationResult> j0Var) {
        this.a = executor;
        this.b = aVar;
        this.c = j0Var;
    }

    public final void c(i<TResult> iVar) {
        this.a.execute(new r(this, iVar));
    }
}
