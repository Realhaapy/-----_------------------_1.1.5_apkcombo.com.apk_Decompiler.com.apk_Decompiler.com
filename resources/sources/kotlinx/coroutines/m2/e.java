package kotlinx.coroutines.m2;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.e1;
import m.v.g;

final class e extends e1 implements j, Executor {

    /* renamed from: k  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f4912k = AtomicIntegerFieldUpdater.newUpdater(e.class, "inFlightTasks");

    /* renamed from: f  reason: collision with root package name */
    private final c f4913f;

    /* renamed from: g  reason: collision with root package name */
    private final int f4914g;

    /* renamed from: h  reason: collision with root package name */
    private final String f4915h;

    /* renamed from: i  reason: collision with root package name */
    private final int f4916i;
    private volatile /* synthetic */ int inFlightTasks = 0;

    /* renamed from: j  reason: collision with root package name */
    private final ConcurrentLinkedQueue<Runnable> f4917j = new ConcurrentLinkedQueue<>();

    public e(c cVar, int i2, String str, int i3) {
        this.f4913f = cVar;
        this.f4914g = i2;
        this.f4915h = str;
        this.f4916i = i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r4 
      PHI: (r4v1 java.lang.Runnable) = (r4v0 java.lang.Runnable), (r4v5 java.lang.Runnable) binds: [B:0:0x0000, B:8:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void V(java.lang.Runnable r4, boolean r5) {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f4912k
            int r1 = r0.incrementAndGet(r3)
            int r2 = r3.f4914g
            if (r1 > r2) goto L_0x0010
            kotlinx.coroutines.m2.c r0 = r3.f4913f
            r0.W(r4, r3, r5)
            return
        L_0x0010:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r1 = r3.f4917j
            r1.add(r4)
            int r4 = r0.decrementAndGet(r3)
            int r0 = r3.f4914g
            if (r4 < r0) goto L_0x001e
            return
        L_0x001e:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r4 = r3.f4917j
            java.lang.Object r4 = r4.poll()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            if (r4 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.m2.e.V(java.lang.Runnable, boolean):void");
    }

    public int P() {
        return this.f4916i;
    }

    public void T(g gVar, Runnable runnable) {
        V(runnable, false);
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    public void execute(Runnable runnable) {
        V(runnable, false);
    }

    public String toString() {
        String str = this.f4915h;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.f4913f + ']';
    }

    public void v() {
        Runnable poll = this.f4917j.poll();
        if (poll != null) {
            this.f4913f.W(poll, this, true);
            return;
        }
        f4912k.decrementAndGet(this);
        Runnable poll2 = this.f4917j.poll();
        if (poll2 != null) {
            V(poll2, true);
        }
    }
}
