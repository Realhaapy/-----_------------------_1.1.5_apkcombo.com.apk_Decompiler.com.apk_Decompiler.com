package f.e.a.c.g;

import java.util.concurrent.Executor;

final class a0<TResult> implements f0<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    public e c;

    public a0(Executor executor, e eVar) {
        this.a = executor;
        this.c = eVar;
    }

    public final void c(i<TResult> iVar) {
        if (!iVar.m() && !iVar.k()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new z(this, iVar));
                }
            }
        }
    }
}
