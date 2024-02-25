package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.z0;

public abstract class a1 extends y0 {
    /* access modifiers changed from: protected */
    public abstract Thread f0();

    /* access modifiers changed from: protected */
    public final void g0(long j2, z0.a aVar) {
        if (o0.a()) {
            if (!(this != q0.f4936k)) {
                throw new AssertionError();
            }
        }
        q0.f4936k.s0(j2, aVar);
    }

    /* access modifiers changed from: protected */
    public final void h0() {
        Thread f0 = f0();
        if (Thread.currentThread() != f0) {
            d a = e.a();
            if (a == null) {
                LockSupport.unpark(f0);
            } else {
                a.f(f0);
            }
        }
    }
}
