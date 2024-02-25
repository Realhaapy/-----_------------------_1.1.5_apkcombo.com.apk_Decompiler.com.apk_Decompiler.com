package kotlinx.coroutines.m2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.o0;

public final class m {
    private static final /* synthetic */ AtomicReferenceFieldUpdater b;
    private static final /* synthetic */ AtomicIntegerFieldUpdater c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f4925d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f4926e;
    private final AtomicReferenceArray<i> a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<m> cls = m.class;
        b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f4925d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f4926e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    public static /* synthetic */ i b(m mVar, i iVar, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return mVar.a(iVar, z);
    }

    private final i c(i iVar) {
        boolean z = true;
        if (iVar.f4921f.P() != 1) {
            z = false;
        }
        if (z) {
            f4926e.incrementAndGet(this);
        }
        if (e() == 127) {
            return iVar;
        }
        int i2 = this.producerIndex & 127;
        while (this.a.get(i2) != null) {
            Thread.yield();
        }
        this.a.lazySet(i2, iVar);
        c.incrementAndGet(this);
        return null;
    }

    private final void d(i iVar) {
        if (iVar != null) {
            boolean z = false;
            if (iVar.f4921f.P() == 1) {
                int decrementAndGet = f4926e.decrementAndGet(this);
                if (o0.a()) {
                    if (decrementAndGet >= 0) {
                        z = true;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    private final i i() {
        i andSet;
        while (true) {
            int i2 = this.consumerIndex;
            if (i2 - this.producerIndex == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (f4925d.compareAndSet(this, i2, i2 + 1) && (andSet = this.a.getAndSet(i3, (Object) null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    private final boolean j(d dVar) {
        i i2 = i();
        if (i2 == null) {
            return false;
        }
        dVar.a(i2);
        return true;
    }

    private final long m(m mVar, boolean z) {
        i iVar;
        do {
            iVar = (i) mVar.lastScheduledTask;
            if (iVar == null) {
                return -2;
            }
            if (z) {
                boolean z2 = true;
                if (iVar.f4921f.P() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2;
                }
            }
            long a2 = l.f4924e.a() - iVar.f4920e;
            long j2 = l.a;
            if (a2 < j2) {
                return j2 - a2;
            }
        } while (!b.compareAndSet(mVar, iVar, (Object) null));
        b(this, iVar, false, 2, (Object) null);
        return -1;
    }

    public final i a(i iVar, boolean z) {
        if (z) {
            return c(iVar);
        }
        i iVar2 = (i) b.getAndSet(this, iVar);
        if (iVar2 == null) {
            return null;
        }
        return c(iVar2);
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int f() {
        return this.lastScheduledTask != null ? e() + 1 : e();
    }

    public final void g(d dVar) {
        i iVar = (i) b.getAndSet(this, (Object) null);
        if (iVar != null) {
            dVar.a(iVar);
        }
        do {
        } while (j(dVar));
    }

    public final i h() {
        i iVar = (i) b.getAndSet(this, (Object) null);
        return iVar == null ? i() : iVar;
    }

    public final long k(m mVar) {
        if (o0.a()) {
            if (!(e() == 0)) {
                throw new AssertionError();
            }
        }
        int i2 = mVar.producerIndex;
        AtomicReferenceArray<i> atomicReferenceArray = mVar.a;
        for (int i3 = mVar.consumerIndex; i3 != i2; i3++) {
            int i4 = i3 & 127;
            if (mVar.blockingTasksInBuffer == 0) {
                break;
            }
            i iVar = atomicReferenceArray.get(i4);
            if (iVar != null) {
                if ((iVar.f4921f.P() == 1) && atomicReferenceArray.compareAndSet(i4, iVar, (Object) null)) {
                    f4926e.decrementAndGet(mVar);
                    b(this, iVar, false, 2, (Object) null);
                    return -1;
                }
            }
        }
        return m(mVar, true);
    }

    public final long l(m mVar) {
        boolean z = true;
        if (o0.a()) {
            if (!(e() == 0)) {
                throw new AssertionError();
            }
        }
        i i2 = mVar.i();
        if (i2 == null) {
            return m(mVar, false);
        }
        i b2 = b(this, i2, false, 2, (Object) null);
        if (!o0.a()) {
            return -1;
        }
        if (b2 != null) {
            z = false;
        }
        if (z) {
            return -1;
        }
        throw new AssertionError();
    }
}
