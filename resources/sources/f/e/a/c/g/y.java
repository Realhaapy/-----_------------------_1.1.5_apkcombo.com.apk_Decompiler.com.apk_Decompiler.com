package f.e.a.c.g;

import java.util.concurrent.Executor;

final class y<TResult> implements f0<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    public d<TResult> c;

    public y(Executor executor, d<TResult> dVar) {
        this.a = executor;
        this.c = dVar;
    }

    public final void c(i<TResult> iVar) {
        synchronized (this.b) {
            if (this.c != null) {
                this.a.execute(new x(this, iVar));
            }
        }
    }
}
