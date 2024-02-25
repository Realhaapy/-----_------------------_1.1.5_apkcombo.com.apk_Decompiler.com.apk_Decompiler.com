package f.e.a.c.g;

import java.util.concurrent.Executor;

final class w<TResult> implements f0<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    public c c;

    public w(Executor executor, c cVar) {
        this.a = executor;
        this.c = cVar;
    }

    public final void c(i<TResult> iVar) {
        if (iVar.k()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new v(this));
                }
            }
        }
    }
}
