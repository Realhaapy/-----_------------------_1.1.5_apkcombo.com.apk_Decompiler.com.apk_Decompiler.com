package f.e.a.c.g;

import java.util.concurrent.Executor;

final class c0<TResult> implements f0<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    public f<? super TResult> c;

    public c0(Executor executor, f<? super TResult> fVar) {
        this.a = executor;
        this.c = fVar;
    }

    public final void c(i<TResult> iVar) {
        if (iVar.m()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new b0(this, iVar));
                }
            }
        }
    }
}
