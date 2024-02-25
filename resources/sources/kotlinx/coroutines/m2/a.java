package kotlinx.coroutines.m2;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.d;
import kotlinx.coroutines.e;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.p0;
import m.s;
import m.y.d.l;

public final class a implements Executor, Closeable {

    /* renamed from: l  reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f4880l = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ AtomicLongFieldUpdater f4881m = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: n  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f4882n = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: o  reason: collision with root package name */
    public static final z f4883o = new z("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;

    /* renamed from: e  reason: collision with root package name */
    public final int f4884e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4885f;

    /* renamed from: g  reason: collision with root package name */
    public final long f4886g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4887h;

    /* renamed from: i  reason: collision with root package name */
    public final d f4888i;

    /* renamed from: j  reason: collision with root package name */
    public final d f4889j;

    /* renamed from: k  reason: collision with root package name */
    public final AtomicReferenceArray<b> f4890k;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: kotlinx.coroutines.m2.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C0142a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            iArr[c.PARKING.ordinal()] = 1;
            iArr[c.BLOCKING.ordinal()] = 2;
            iArr[c.CPU_ACQUIRED.ordinal()] = 3;
            iArr[c.DORMANT.ordinal()] = 4;
            iArr[c.TERMINATED.ordinal()] = 5;
            a = iArr;
        }
    }

    public final class b extends Thread {

        /* renamed from: l  reason: collision with root package name */
        static final /* synthetic */ AtomicIntegerFieldUpdater f4891l = AtomicIntegerFieldUpdater.newUpdater(b.class, "workerCtl");

        /* renamed from: e  reason: collision with root package name */
        public final m f4892e;

        /* renamed from: f  reason: collision with root package name */
        public c f4893f;

        /* renamed from: g  reason: collision with root package name */
        private long f4894g;

        /* renamed from: h  reason: collision with root package name */
        private long f4895h;

        /* renamed from: i  reason: collision with root package name */
        private int f4896i;
        private volatile int indexInArray;

        /* renamed from: j  reason: collision with root package name */
        public boolean f4897j;
        private volatile Object nextParkedWorker;
        volatile /* synthetic */ int workerCtl;

        private b() {
            setDaemon(true);
            this.f4892e = new m();
            this.f4893f = c.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = a.f4883o;
            this.f4896i = m.z.c.f5064e.b();
        }

        public b(int i2) {
            this();
            n(i2);
        }

        private final void a(int i2) {
            if (i2 != 0) {
                a.f4881m.addAndGet(a.this, -2097152);
                c cVar = this.f4893f;
                if (cVar != c.TERMINATED) {
                    if (o0.a()) {
                        if (!(cVar == c.BLOCKING)) {
                            throw new AssertionError();
                        }
                    }
                    this.f4893f = c.DORMANT;
                }
            }
        }

        private final void b(int i2) {
            if (i2 != 0 && r(c.BLOCKING)) {
                a.this.U();
            }
        }

        private final void c(i iVar) {
            int P = iVar.f4921f.P();
            h(P);
            b(P);
            a.this.P(iVar);
            a(P);
        }

        private final i d(boolean z) {
            i l2;
            i l3;
            if (z) {
                boolean z2 = j(a.this.f4884e * 2) == 0;
                if (z2 && (l3 = l()) != null) {
                    return l3;
                }
                i h2 = this.f4892e.h();
                if (h2 != null) {
                    return h2;
                }
                if (!z2 && (l2 = l()) != null) {
                    return l2;
                }
            } else {
                i l4 = l();
                if (l4 != null) {
                    return l4;
                }
            }
            return s(false);
        }

        private final void h(int i2) {
            this.f4894g = 0;
            if (this.f4893f == c.PARKING) {
                if (o0.a()) {
                    boolean z = true;
                    if (i2 != 1) {
                        z = false;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
                this.f4893f = c.BLOCKING;
            }
        }

        private final boolean i() {
            return this.nextParkedWorker != a.f4883o;
        }

        private final void k() {
            if (this.f4894g == 0) {
                this.f4894g = System.nanoTime() + a.this.f4886g;
            }
            LockSupport.parkNanos(a.this.f4886g);
            if (System.nanoTime() - this.f4894g >= 0) {
                this.f4894g = 0;
                t();
            }
        }

        private final i l() {
            d dVar;
            if (j(2) == 0) {
                i iVar = (i) a.this.f4888i.d();
                if (iVar != null) {
                    return iVar;
                }
                dVar = a.this.f4889j;
            } else {
                i iVar2 = (i) a.this.f4889j.d();
                if (iVar2 != null) {
                    return iVar2;
                }
                dVar = a.this.f4888i;
            }
            return (i) dVar.d();
        }

        private final void m() {
            loop0:
            while (true) {
                boolean z = false;
                while (!a.this.B() && this.f4893f != c.TERMINATED) {
                    i e2 = e(this.f4897j);
                    if (e2 != null) {
                        this.f4895h = 0;
                        c(e2);
                    } else {
                        this.f4897j = false;
                        if (this.f4895h == 0) {
                            q();
                        } else if (!z) {
                            z = true;
                        } else {
                            r(c.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f4895h);
                            this.f4895h = 0;
                        }
                    }
                }
            }
            r(c.TERMINATED);
        }

        private final boolean p() {
            boolean z;
            if (this.f4893f != c.CPU_ACQUIRED) {
                a aVar = a.this;
                while (true) {
                    long j2 = aVar.controlState;
                    if (((int) ((9223367638808264704L & j2) >> 42)) != 0) {
                        if (a.f4881m.compareAndSet(aVar, j2, j2 - 4398046511104L)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
                this.f4893f = c.CPU_ACQUIRED;
            }
            return true;
        }

        private final void q() {
            if (!i()) {
                a.this.L(this);
                return;
            }
            if (o0.a()) {
                if (!(this.f4892e.f() == 0)) {
                    throw new AssertionError();
                }
            }
            this.workerCtl = -1;
            while (i() && this.workerCtl == -1 && !a.this.B() && this.f4893f != c.TERMINATED) {
                r(c.PARKING);
                Thread.interrupted();
                k();
            }
        }

        private final i s(boolean z) {
            if (o0.a()) {
                if (!(this.f4892e.f() == 0)) {
                    throw new AssertionError();
                }
            }
            int i2 = (int) (a.this.controlState & 2097151);
            if (i2 < 2) {
                return null;
            }
            int j2 = j(i2);
            a aVar = a.this;
            long j3 = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                j2++;
                if (j2 > i2) {
                    j2 = 1;
                }
                b bVar = aVar.f4890k.get(j2);
                if (!(bVar == null || bVar == this)) {
                    if (o0.a()) {
                        if (!(this.f4892e.f() == 0)) {
                            throw new AssertionError();
                        }
                    }
                    m mVar = this.f4892e;
                    m mVar2 = bVar.f4892e;
                    long k2 = z ? mVar.k(mVar2) : mVar.l(mVar2);
                    if (k2 == -1) {
                        return this.f4892e.h();
                    }
                    if (k2 > 0) {
                        j3 = Math.min(j3, k2);
                    }
                }
            }
            if (j3 == Long.MAX_VALUE) {
                j3 = 0;
            }
            this.f4895h = j3;
            return null;
        }

        private final void t() {
            a aVar = a.this;
            synchronized (aVar.f4890k) {
                if (!aVar.B()) {
                    if (((int) (aVar.controlState & 2097151)) > aVar.f4884e) {
                        if (f4891l.compareAndSet(this, -1, 1)) {
                            int f2 = f();
                            n(0);
                            aVar.O(this, f2, 0);
                            int andDecrement = (int) (a.f4881m.getAndDecrement(aVar) & 2097151);
                            if (andDecrement != f2) {
                                b bVar = aVar.f4890k.get(andDecrement);
                                l.b(bVar);
                                b bVar2 = bVar;
                                aVar.f4890k.set(f2, bVar2);
                                bVar2.n(f2);
                                aVar.O(bVar2, andDecrement, f2);
                            }
                            aVar.f4890k.set(andDecrement, (Object) null);
                            s sVar = s.a;
                            this.f4893f = c.TERMINATED;
                        }
                    }
                }
            }
        }

        public final i e(boolean z) {
            i iVar;
            if (p()) {
                return d(z);
            }
            if (!z || (iVar = this.f4892e.h()) == null) {
                iVar = (i) a.this.f4889j.d();
            }
            return iVar == null ? s(true) : iVar;
        }

        public final int f() {
            return this.indexInArray;
        }

        public final Object g() {
            return this.nextParkedWorker;
        }

        public final int j(int i2) {
            int i3 = this.f4896i;
            int i4 = i3 ^ (i3 << 13);
            int i5 = i4 ^ (i4 >> 17);
            int i6 = i5 ^ (i5 << 5);
            this.f4896i = i6;
            int i7 = i2 - 1;
            return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
        }

        public final void n(int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f4887h);
            sb.append("-worker-");
            sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
            setName(sb.toString());
            this.indexInArray = i2;
        }

        public final void o(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean r(c cVar) {
            c cVar2 = this.f4893f;
            boolean z = cVar2 == c.CPU_ACQUIRED;
            if (z) {
                a.f4881m.addAndGet(a.this, 4398046511104L);
            }
            if (cVar2 != cVar) {
                this.f4893f = cVar;
            }
            return z;
        }

        public void run() {
            m();
        }
    }

    public enum c {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i2, int i3, long j2, String str) {
        this.f4884e = i2;
        this.f4885f = i3;
        this.f4886g = j2;
        this.f4887h = str;
        if (i2 >= 1) {
            if (i3 >= i2) {
                if (i3 <= 2097150) {
                    if (j2 > 0) {
                        this.f4888i = new d();
                        this.f4889j = new d();
                        this.parkedWorkersStack = 0;
                        this.f4890k = new AtomicReferenceArray<>(i3 + 1);
                        this.controlState = ((long) i2) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i3 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i3 + " should be greater than or equals to core pool size " + i2).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i2 + " should be at least 1").toString());
    }

    private final int E(b bVar) {
        int f2;
        do {
            Object g2 = bVar.g();
            if (g2 == f4883o) {
                return -1;
            }
            if (g2 == null) {
                return 0;
            }
            bVar = (b) g2;
            f2 = bVar.f();
        } while (f2 == 0);
        return f2;
    }

    private final b J() {
        while (true) {
            long j2 = this.parkedWorkersStack;
            b bVar = this.f4890k.get((int) (2097151 & j2));
            if (bVar == null) {
                return null;
            }
            long j3 = (2097152 + j2) & -2097152;
            int E = E(bVar);
            if (E >= 0) {
                if (f4880l.compareAndSet(this, j2, ((long) E) | j3)) {
                    bVar.o(f4883o);
                    return bVar;
                }
            }
        }
    }

    private final void T(boolean z) {
        long addAndGet = f4881m.addAndGet(this, 2097152);
        if (!z && !Y() && !W(addAndGet)) {
            Y();
        }
    }

    private final i V(b bVar, i iVar, boolean z) {
        if (bVar == null || bVar.f4893f == c.TERMINATED) {
            return iVar;
        }
        if (iVar.f4921f.P() == 0 && bVar.f4893f == c.BLOCKING) {
            return iVar;
        }
        bVar.f4897j = true;
        return bVar.f4892e.a(iVar, z);
    }

    private final boolean W(long j2) {
        if (f.a(((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21)), 0) < this.f4884e) {
            int c2 = c();
            if (c2 == 1 && this.f4884e > 1) {
                c();
            }
            if (c2 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean X(a aVar, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = aVar.controlState;
        }
        return aVar.W(j2);
    }

    private final boolean Y() {
        b J;
        do {
            J = J();
            if (J == null) {
                return false;
            }
        } while (!b.f4891l.compareAndSet(J, -1, 0));
        LockSupport.unpark(J);
        return true;
    }

    private final boolean a(i iVar) {
        boolean z = true;
        if (iVar.f4921f.P() != 1) {
            z = false;
        }
        return (z ? this.f4889j : this.f4888i).a(iVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int c() {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.m2.a$b> r0 = r10.f4890k
            monitor-enter(r0)
            boolean r1 = r10.B()     // Catch:{ all -> 0x007a }
            if (r1 == 0) goto L_0x000c
            r1 = -1
        L_0x000a:
            monitor-exit(r0)
            return r1
        L_0x000c:
            long r1 = r10.controlState     // Catch:{ all -> 0x007a }
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r1 & r3
            int r6 = (int) r5     // Catch:{ all -> 0x007a }
            r7 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r7
            r5 = 21
            long r1 = r1 >> r5
            int r2 = (int) r1     // Catch:{ all -> 0x007a }
            int r1 = r6 - r2
            r2 = 0
            int r1 = m.a0.f.a(r1, r2)     // Catch:{ all -> 0x007a }
            int r5 = r10.f4884e     // Catch:{ all -> 0x007a }
            if (r1 < r5) goto L_0x002b
            monitor-exit(r0)
            return r2
        L_0x002b:
            int r5 = r10.f4885f     // Catch:{ all -> 0x007a }
            if (r6 < r5) goto L_0x0031
            monitor-exit(r0)
            return r2
        L_0x0031:
            long r5 = r10.controlState     // Catch:{ all -> 0x007a }
            long r5 = r5 & r3
            int r6 = (int) r5     // Catch:{ all -> 0x007a }
            r5 = 1
            int r6 = r6 + r5
            if (r6 <= 0) goto L_0x0043
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.m2.a$b> r7 = r10.f4890k     // Catch:{ all -> 0x007a }
            java.lang.Object r7 = r7.get(r6)     // Catch:{ all -> 0x007a }
            if (r7 != 0) goto L_0x0043
            r7 = 1
            goto L_0x0044
        L_0x0043:
            r7 = 0
        L_0x0044:
            if (r7 == 0) goto L_0x006e
            kotlinx.coroutines.m2.a$b r7 = new kotlinx.coroutines.m2.a$b     // Catch:{ all -> 0x007a }
            r7.<init>(r6)     // Catch:{ all -> 0x007a }
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.m2.a$b> r8 = r10.f4890k     // Catch:{ all -> 0x007a }
            r8.set(r6, r7)     // Catch:{ all -> 0x007a }
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = f4881m     // Catch:{ all -> 0x007a }
            long r8 = r8.incrementAndGet(r10)     // Catch:{ all -> 0x007a }
            long r3 = r3 & r8
            int r4 = (int) r3     // Catch:{ all -> 0x007a }
            if (r6 != r4) goto L_0x005b
            r2 = 1
        L_0x005b:
            if (r2 == 0) goto L_0x0062
            r7.start()     // Catch:{ all -> 0x007a }
            int r1 = r1 + r5
            goto L_0x000a
        L_0x0062:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007a }
            r2.<init>(r1)     // Catch:{ all -> 0x007a }
            throw r2     // Catch:{ all -> 0x007a }
        L_0x006e:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007a }
            r2.<init>(r1)     // Catch:{ all -> 0x007a }
            throw r2     // Catch:{ all -> 0x007a }
        L_0x007a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.m2.a.c():int");
    }

    private final b o() {
        Thread currentThread = Thread.currentThread();
        b bVar = currentThread instanceof b ? (b) currentThread : null;
        if (bVar != null && l.a(a.this, this)) {
            return bVar;
        }
        return null;
    }

    public static /* synthetic */ void z(a aVar, Runnable runnable, j jVar, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            jVar = g.f4918e;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        aVar.v(runnable, jVar, z);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    public final boolean B() {
        return this._isTerminated;
    }

    public final boolean L(b bVar) {
        long j2;
        long j3;
        int f2;
        if (bVar.g() != f4883o) {
            return false;
        }
        do {
            j2 = this.parkedWorkersStack;
            int i2 = (int) (2097151 & j2);
            j3 = (2097152 + j2) & -2097152;
            f2 = bVar.f();
            if (o0.a()) {
                if (!(f2 != 0)) {
                    throw new AssertionError();
                }
            }
            bVar.o(this.f4890k.get(i2));
        } while (!f4880l.compareAndSet(this, j2, ((long) f2) | j3));
        return true;
    }

    public final void O(b bVar, int i2, int i3) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & -2097152;
            if (i4 == i2) {
                i4 = i3 == 0 ? E(bVar) : i3;
            }
            if (i4 >= 0) {
                if (f4880l.compareAndSet(this, j2, j3 | ((long) i4))) {
                    return;
                }
            }
        }
    }

    public final void P(i iVar) {
        d a;
        try {
            iVar.run();
            a = e.a();
            if (a == null) {
                return;
            }
        } catch (Throwable th) {
            d a2 = e.a();
            if (a2 != null) {
                a2.e();
            }
            throw th;
        }
        a.e();
    }

    public final void S(long j2) {
        int i2;
        boolean z = false;
        if (f4882n.compareAndSet(this, 0, 1)) {
            b o2 = o();
            synchronized (this.f4890k) {
                i2 = (int) (this.controlState & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    int i4 = i3 + 1;
                    b bVar = this.f4890k.get(i3);
                    l.b(bVar);
                    b bVar2 = bVar;
                    if (bVar2 != o2) {
                        while (bVar2.isAlive()) {
                            LockSupport.unpark(bVar2);
                            bVar2.join(j2);
                        }
                        c cVar = bVar2.f4893f;
                        if (o0.a()) {
                            if (!(cVar == c.TERMINATED)) {
                                throw new AssertionError();
                            }
                        }
                        bVar2.f4892e.g(this.f4889j);
                    }
                    if (i3 == i2) {
                        break;
                    }
                    i3 = i4;
                }
            }
            this.f4889j.b();
            this.f4888i.b();
            while (true) {
                i e2 = o2 == null ? null : o2.e(true);
                if (e2 == null && (e2 = (i) this.f4888i.d()) == null && (e2 = (i) this.f4889j.d()) == null) {
                    break;
                }
                P(e2);
            }
            if (o2 != null) {
                o2.r(c.TERMINATED);
            }
            if (o0.a()) {
                if (((int) ((this.controlState & 9223367638808264704L) >> 42)) == this.f4884e) {
                    z = true;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            this.parkedWorkersStack = 0;
            this.controlState = 0;
        }
    }

    public final void U() {
        if (!Y() && !X(this, 0, 1, (Object) null)) {
            Y();
        }
    }

    public void close() {
        S(10000);
    }

    public void execute(Runnable runnable) {
        z(this, runnable, (j) null, false, 6, (Object) null);
    }

    public final i g(Runnable runnable, j jVar) {
        long a = l.f4924e.a();
        if (!(runnable instanceof i)) {
            return new k(runnable, a, jVar);
        }
        i iVar = (i) runnable;
        iVar.f4920e = a;
        iVar.f4921f = jVar;
        return iVar;
    }

    public String toString() {
        int i2;
        int i3;
        int i4;
        int i5;
        char c2;
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        int length = this.f4890k.length();
        int i6 = 0;
        if (1 < length) {
            i4 = 0;
            int i7 = 0;
            i3 = 0;
            i2 = 0;
            int i8 = 1;
            while (true) {
                int i9 = i8 + 1;
                b bVar = this.f4890k.get(i8);
                if (bVar != null) {
                    int f2 = bVar.f4892e.f();
                    int i10 = C0142a.a[bVar.f4893f.ordinal()];
                    if (i10 != 1) {
                        if (i10 == 2) {
                            i4++;
                            sb = new StringBuilder();
                            sb.append(f2);
                            c2 = 'b';
                        } else if (i10 == 3) {
                            i7++;
                            sb = new StringBuilder();
                            sb.append(f2);
                            c2 = 'c';
                        } else if (i10 == 4) {
                            i3++;
                            if (f2 > 0) {
                                sb = new StringBuilder();
                                sb.append(f2);
                                c2 = 'd';
                            }
                        } else if (i10 == 5) {
                            i2++;
                        }
                        sb.append(c2);
                        arrayList.add(sb.toString());
                    } else {
                        i6++;
                    }
                }
                if (i9 >= length) {
                    break;
                }
                i8 = i9;
            }
            i5 = i6;
            i6 = i7;
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
            i2 = 0;
        }
        long j2 = this.controlState;
        return this.f4887h + '@' + p0.b(this) + "[Pool Size {core = " + this.f4884e + ", max = " + this.f4885f + "}, Worker States {CPU = " + i6 + ", blocking = " + i4 + ", parked = " + i5 + ", dormant = " + i3 + ", terminated = " + i2 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f4888i.c() + ", global blocking queue size = " + this.f4889j.c() + ", Control State {created workers= " + ((int) (2097151 & j2)) + ", blocking tasks = " + ((int) ((4398044413952L & j2) >> 21)) + ", CPUs acquired = " + (this.f4884e - ((int) ((9223367638808264704L & j2) >> 42))) + "}]";
    }

    public final void v(Runnable runnable, j jVar, boolean z) {
        d a = e.a();
        if (a != null) {
            a.d();
        }
        i g2 = g(runnable, jVar);
        b o2 = o();
        i V = V(o2, g2, z);
        if (V == null || a(V)) {
            boolean z2 = z && o2 != null;
            if (g2.f4921f.P() != 0) {
                T(z2);
            } else if (!z2) {
                U();
            }
        } else {
            throw new RejectedExecutionException(l.j(this.f4887h, " was terminated"));
        }
    }
}
