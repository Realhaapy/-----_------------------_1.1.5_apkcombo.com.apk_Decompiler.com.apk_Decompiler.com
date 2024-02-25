package f.e.a.c.g;

import java.util.concurrent.Callable;

final class k0 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ j0 f3960e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Callable f3961f;

    k0(j0 j0Var, Callable callable) {
        this.f3960e = j0Var;
        this.f3961f = callable;
    }

    public final void run() {
        try {
            this.f3960e.q(this.f3961f.call());
        } catch (Exception e2) {
            this.f3960e.p(e2);
        } catch (Throwable th) {
            this.f3960e.p(new RuntimeException(th));
        }
    }
}
