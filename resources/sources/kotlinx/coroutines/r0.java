package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.h;
import kotlinx.coroutines.internal.x;
import m.y.c.l;

public final class r0<T> extends x<T> {

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f4940h = AtomicIntegerFieldUpdater.newUpdater(r0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    private final boolean x0() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f4940h.compareAndSet(this, 0, 2));
        return true;
    }

    /* access modifiers changed from: protected */
    public void p(Object obj) {
        s0(obj);
    }

    /* access modifiers changed from: protected */
    public void s0(Object obj) {
        if (!x0()) {
            h.c(c.b(this.f4832g), c0.a(obj, this.f4832g), (l) null, 2, (Object) null);
        }
    }
}
