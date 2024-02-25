package f.e.a.c.g;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class o implements p {
    private final CountDownLatch a = new CountDownLatch(1);

    /* synthetic */ o(n nVar) {
    }

    public final void a(Exception exc) {
        this.a.countDown();
    }

    public final void b() {
        this.a.countDown();
    }

    public final void c() {
        this.a.await();
    }

    public final boolean d(long j2, TimeUnit timeUnit) {
        return this.a.await(j2, timeUnit);
    }

    public final void onSuccess(Object obj) {
        this.a.countDown();
    }
}
