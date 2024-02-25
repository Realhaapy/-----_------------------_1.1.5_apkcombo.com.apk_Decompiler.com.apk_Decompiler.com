package f.e.b.b.a;

import f.e.b.a.a;
import f.e.b.a.b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class c extends d {

    private static final class a<V> implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final Future<V> f3993e;

        /* renamed from: f  reason: collision with root package name */
        final b<? super V> f3994f;

        a(Future<V> future, b<? super V> bVar) {
            this.f3993e = future;
            this.f3994f = bVar;
        }

        public void run() {
            try {
                this.f3994f.onSuccess(c.b(this.f3993e));
            } catch (ExecutionException e2) {
                this.f3994f.onFailure(e2.getCause());
            } catch (Error | RuntimeException e3) {
                this.f3994f.onFailure(e3);
            }
        }

        public String toString() {
            a.b a = f.e.b.a.a.a(this);
            a.c(this.f3994f);
            return a.toString();
        }
    }

    public static <V> void a(e<V> eVar, b<? super V> bVar, Executor executor) {
        b.b(bVar);
        eVar.a(new a(eVar, bVar), executor);
    }

    public static <V> V b(Future<V> future) {
        b.d(future.isDone(), "Future was expected to be done: %s", future);
        return h.a(future);
    }
}
