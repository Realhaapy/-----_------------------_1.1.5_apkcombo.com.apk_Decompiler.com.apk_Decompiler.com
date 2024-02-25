package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.internal.e;
import m.v.g;

public final class f1 extends e1 {

    /* renamed from: f  reason: collision with root package name */
    private final Executor f4791f;

    public f1(Executor executor) {
        this.f4791f = executor;
        e.a(W());
    }

    private final void V(g gVar, RejectedExecutionException rejectedExecutionException) {
        r1.c(gVar, d1.a("The task was rejected", rejectedExecutionException));
    }

    public void T(g gVar, Runnable runnable) {
        try {
            Executor W = W();
            d a = e.a();
            W.execute(a == null ? runnable : a.h(runnable));
        } catch (RejectedExecutionException e2) {
            d a2 = e.a();
            if (a2 != null) {
                a2.e();
            }
            V(gVar, e2);
            v0.b().T(gVar, runnable);
        }
    }

    public Executor W() {
        return this.f4791f;
    }

    public void close() {
        Executor W = W();
        ExecutorService executorService = W instanceof ExecutorService ? (ExecutorService) W : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof f1) && ((f1) obj).W() == W();
    }

    public int hashCode() {
        return System.identityHashCode(W());
    }

    public String toString() {
        return W().toString();
    }
}
