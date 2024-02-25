package kotlinx.coroutines;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.e0;
import kotlinx.coroutines.internal.f0;
import kotlinx.coroutines.internal.q;
import m.v.g;
import m.y.d.l;

public abstract class z0 extends a1 {

    /* renamed from: i  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4967i;

    /* renamed from: j  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4968j;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;
    private volatile /* synthetic */ Object _queue = null;

    public static abstract class a implements Runnable, Comparable<a>, w0, f0 {

        /* renamed from: e  reason: collision with root package name */
        public long f4969e;

        /* renamed from: f  reason: collision with root package name */
        private Object f4970f;

        /* renamed from: g  reason: collision with root package name */
        private int f4971g;

        public void a(int i2) {
            this.f4971g = i2;
        }

        public void c(e0<?> e0Var) {
            if (this.f4970f != c1.a) {
                this.f4970f = e0Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public int d() {
            return this.f4971g;
        }

        public final synchronized void dispose() {
            Object obj = this.f4970f;
            if (obj != c1.a) {
                b bVar = obj instanceof b ? (b) obj : null;
                if (bVar != null) {
                    bVar.g(this);
                }
                this.f4970f = c1.a;
            }
        }

        public e0<?> g() {
            Object obj = this.f4970f;
            if (obj instanceof e0) {
                return (e0) obj;
            }
            return null;
        }

        /* renamed from: h */
        public int compareTo(a aVar) {
            int i2 = ((this.f4969e - aVar.f4969e) > 0 ? 1 : ((this.f4969e - aVar.f4969e) == 0 ? 0 : -1));
            if (i2 > 0) {
                return 1;
            }
            return i2 < 0 ? -1 : 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0046, code lost:
            r8 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
            return r8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0040  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized int j(long r8, kotlinx.coroutines.z0.b r10, kotlinx.coroutines.z0 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7.f4970f     // Catch:{ all -> 0x004b }
                kotlinx.coroutines.internal.z r1 = kotlinx.coroutines.c1.a     // Catch:{ all -> 0x004b }
                if (r0 != r1) goto L_0x000c
                r8 = 2
            L_0x000a:
                monitor-exit(r7)
                return r8
            L_0x000c:
                monitor-enter(r10)     // Catch:{ all -> 0x004b }
                kotlinx.coroutines.internal.f0 r0 = r10.b()     // Catch:{ all -> 0x0048 }
                kotlinx.coroutines.z0$a r0 = (kotlinx.coroutines.z0.a) r0     // Catch:{ all -> 0x0048 }
                boolean r11 = r11.n0()     // Catch:{ all -> 0x0048 }
                if (r11 == 0) goto L_0x001d
                r8 = 1
                monitor-exit(r10)     // Catch:{ all -> 0x004b }
                monitor-exit(r7)
                return r8
            L_0x001d:
                r1 = 0
                if (r0 != 0) goto L_0x0024
            L_0x0021:
                r10.b = r8     // Catch:{ all -> 0x0048 }
                goto L_0x0037
            L_0x0024:
                long r3 = r0.f4969e     // Catch:{ all -> 0x0048 }
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L_0x002d
                goto L_0x002e
            L_0x002d:
                r8 = r3
            L_0x002e:
                long r3 = r10.b     // Catch:{ all -> 0x0048 }
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L_0x0037
                goto L_0x0021
            L_0x0037:
                long r8 = r7.f4969e     // Catch:{ all -> 0x0048 }
                long r3 = r10.b     // Catch:{ all -> 0x0048 }
                long r8 = r8 - r3
                int r11 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r11 >= 0) goto L_0x0042
                r7.f4969e = r3     // Catch:{ all -> 0x0048 }
            L_0x0042:
                r10.a(r7)     // Catch:{ all -> 0x0048 }
                monitor-exit(r10)     // Catch:{ all -> 0x004b }
                r8 = 0
                goto L_0x000a
            L_0x0048:
                r8 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x004b }
                throw r8     // Catch:{ all -> 0x004b }
            L_0x004b:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.z0.a.j(long, kotlinx.coroutines.z0$b, kotlinx.coroutines.z0):int");
        }

        public final boolean k(long j2) {
            return j2 - this.f4969e >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f4969e + ']';
        }
    }

    public static final class b extends e0<a> {
        public long b;

        public b(long j2) {
            this.b = j2;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<z0> cls2 = z0.class;
        f4967i = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f4968j = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    private final void j0() {
        if (!o0.a() || n0()) {
            while (true) {
                Object obj = this._queue;
                if (obj == null) {
                    if (f4967i.compareAndSet(this, (Object) null, c1.b)) {
                        return;
                    }
                } else if (obj instanceof q) {
                    ((q) obj).d();
                    return;
                } else if (obj != c1.b) {
                    q qVar = new q(8, true);
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    qVar.a((Runnable) obj);
                    if (f4967i.compareAndSet(this, obj, qVar)) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    private final Runnable k0() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof q) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                q qVar = (q) obj;
                Object j2 = qVar.j();
                if (j2 != q.f4825h) {
                    return (Runnable) j2;
                }
                f4967i.compareAndSet(this, obj, qVar.i());
            } else if (obj == c1.b) {
                return null;
            } else {
                if (f4967i.compareAndSet(this, obj, (Object) null)) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean m0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (n0()) {
                return false;
            }
            if (obj == null) {
                if (f4967i.compareAndSet(this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof q) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                q qVar = (q) obj;
                int a2 = qVar.a(runnable);
                if (a2 == 0) {
                    return true;
                }
                if (a2 == 1) {
                    f4967i.compareAndSet(this, obj, qVar.i());
                } else if (a2 == 2) {
                    return false;
                }
            } else if (obj == c1.b) {
                return false;
            } else {
                q qVar2 = new q(8, true);
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                qVar2.a((Runnable) obj);
                qVar2.a(runnable);
                if (f4967i.compareAndSet(this, obj, qVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    /* access modifiers changed from: private */
    public final boolean n0() {
        return this._isCompleted;
    }

    private final void q0() {
        d a2 = e.a();
        long nanoTime = a2 == null ? System.nanoTime() : a2.a();
        while (true) {
            b bVar = (b) this._delayed;
            a aVar = bVar == null ? null : (a) bVar.i();
            if (aVar != null) {
                g0(nanoTime, aVar);
            } else {
                return;
            }
        }
    }

    private final int t0(long j2, a aVar) {
        if (n0()) {
            return 1;
        }
        b bVar = (b) this._delayed;
        if (bVar == null) {
            f4968j.compareAndSet(this, (Object) null, new b(j2));
            Object obj = this._delayed;
            l.b(obj);
            bVar = (b) obj;
        }
        return aVar.j(j2, bVar, this);
    }

    private final void u0(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    private final boolean v0(a aVar) {
        b bVar = (b) this._delayed;
        return (bVar == null ? null : (a) bVar.e()) == aVar;
    }

    public final void T(g gVar, Runnable runnable) {
        l0(runnable);
    }

    /* access modifiers changed from: protected */
    public long Y() {
        if (super.Y() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof q)) {
                return obj == c1.b ? Long.MAX_VALUE : 0;
            }
            if (!((q) obj).g()) {
                return 0;
            }
        }
        b bVar = (b) this._delayed;
        a aVar = bVar == null ? null : (a) bVar.e();
        if (aVar == null) {
            return Long.MAX_VALUE;
        }
        long j2 = aVar.f4969e;
        d a2 = e.a();
        return f.b(j2 - (a2 == null ? System.nanoTime() : a2.a()), 0);
    }

    /* access modifiers changed from: protected */
    public void e0() {
        e2.a.b();
        u0(true);
        j0();
        do {
        } while (p0() <= 0);
        q0();
    }

    public final void l0(Runnable runnable) {
        if (m0(runnable)) {
            h0();
        } else {
            q0.f4936k.l0(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public boolean o0() {
        if (!c0()) {
            return false;
        }
        b bVar = (b) this._delayed;
        if (bVar != null && !bVar.d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            return obj instanceof q ? ((q) obj).g() : obj == c1.b;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long p0() {
        /*
            r9 = this;
            boolean r0 = r9.d0()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r9._delayed
            kotlinx.coroutines.z0$b r0 = (kotlinx.coroutines.z0.b) r0
            if (r0 == 0) goto L_0x004d
            boolean r3 = r0.d()
            if (r3 != 0) goto L_0x004d
            kotlinx.coroutines.d r3 = kotlinx.coroutines.e.a()
            if (r3 != 0) goto L_0x0020
            long r3 = java.lang.System.nanoTime()
            goto L_0x0024
        L_0x0020:
            long r3 = r3.a()
        L_0x0024:
            monitor-enter(r0)
            kotlinx.coroutines.internal.f0 r5 = r0.b()     // Catch:{ all -> 0x004a }
            r6 = 0
            if (r5 != 0) goto L_0x002e
        L_0x002c:
            monitor-exit(r0)
            goto L_0x0045
        L_0x002e:
            kotlinx.coroutines.z0$a r5 = (kotlinx.coroutines.z0.a) r5     // Catch:{ all -> 0x004a }
            boolean r7 = r5.k(r3)     // Catch:{ all -> 0x004a }
            r8 = 0
            if (r7 == 0) goto L_0x003c
            boolean r5 = r9.m0(r5)     // Catch:{ all -> 0x004a }
            goto L_0x003d
        L_0x003c:
            r5 = 0
        L_0x003d:
            if (r5 == 0) goto L_0x002c
            kotlinx.coroutines.internal.f0 r5 = r0.h(r8)     // Catch:{ all -> 0x004a }
            r6 = r5
            goto L_0x002c
        L_0x0045:
            kotlinx.coroutines.z0$a r6 = (kotlinx.coroutines.z0.a) r6
            if (r6 != 0) goto L_0x0024
            goto L_0x004d
        L_0x004a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x004d:
            java.lang.Runnable r0 = r9.k0()
            if (r0 == 0) goto L_0x0057
            r0.run()
            return r1
        L_0x0057:
            long r0 = r9.Y()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.z0.p0():long");
    }

    /* access modifiers changed from: protected */
    public final void r0() {
        this._queue = null;
        this._delayed = null;
    }

    public final void s0(long j2, a aVar) {
        int t0 = t0(j2, aVar);
        if (t0 != 0) {
            if (t0 == 1) {
                g0(j2, aVar);
            } else if (t0 != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (v0(aVar)) {
            h0();
        }
    }
}
