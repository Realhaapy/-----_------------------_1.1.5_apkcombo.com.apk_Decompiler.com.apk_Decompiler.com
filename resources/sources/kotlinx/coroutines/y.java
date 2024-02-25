package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m.y.d.g;

public class y {
    private static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(y.class, "_handled");
    private volatile /* synthetic */ int _handled;
    public final Throwable a;

    public y(Throwable th, boolean z) {
        this.a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Throwable th, boolean z, int i2, g gVar) {
        this(th, (i2 & 2) != 0 ? false : z);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    public final boolean a() {
        return this._handled;
    }

    public final boolean b() {
        return b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return p0.a(this) + '[' + this.a + ']';
    }
}
