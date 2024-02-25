package p;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p.e0.c;
import p.e0.f.d;
import p.e0.f.g;

public final class j {

    /* renamed from: g  reason: collision with root package name */
    private static final Executor f5372g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), c.E("OkHttp ConnectionPool", true));
    private final int a;
    private final long b;
    private final Runnable c;

    /* renamed from: d  reason: collision with root package name */
    private final Deque<p.e0.f.c> f5373d;

    /* renamed from: e  reason: collision with root package name */
    final d f5374e;

    /* renamed from: f  reason: collision with root package name */
    boolean f5375f;

    class a implements Runnable {
        a() {
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
            L_0x0000:
                p.j r0 = p.j.this
                long r1 = java.lang.System.nanoTime()
                long r0 = r0.a(r1)
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x0011
                return
            L_0x0011:
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L_0x0000
                r2 = 1000000(0xf4240, double:4.940656E-318)
                long r4 = r0 / r2
                long r2 = r2 * r4
                long r0 = r0 - r2
                p.j r2 = p.j.this
                monitor-enter(r2)
                p.j r3 = p.j.this     // Catch:{ InterruptedException -> 0x002b }
                int r1 = (int) r0     // Catch:{ InterruptedException -> 0x002b }
                r3.wait(r4, r1)     // Catch:{ InterruptedException -> 0x002b }
                goto L_0x002b
            L_0x0029:
                r0 = move-exception
                goto L_0x002d
            L_0x002b:
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                goto L_0x0000
            L_0x002d:
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p.j.a.run():void");
        }
    }

    public j() {
        this(5, 5, TimeUnit.MINUTES);
    }

    public j(int i2, long j2, TimeUnit timeUnit) {
        this.c = new a();
        this.f5373d = new ArrayDeque();
        this.f5374e = new d();
        this.a = i2;
        this.b = timeUnit.toNanos(j2);
        if (j2 <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: " + j2);
        }
    }

    private int e(p.e0.f.c cVar, long j2) {
        List<Reference<g>> list = cVar.f5160n;
        int i2 = 0;
        while (i2 < list.size()) {
            Reference reference = list.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                p.e0.j.g.l().t("A connection to " + cVar.p().a().l() + " was leaked. Did you forget to close a response body?", ((g.a) reference).a);
                list.remove(i2);
                cVar.f5157k = true;
                if (list.isEmpty()) {
                    cVar.f5161o = j2 - this.b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* access modifiers changed from: package-private */
    public long a(long j2) {
        synchronized (this) {
            p.e0.f.c cVar = null;
            long j3 = Long.MIN_VALUE;
            int i2 = 0;
            int i3 = 0;
            for (p.e0.f.c next : this.f5373d) {
                if (e(next, j2) > 0) {
                    i3++;
                } else {
                    i2++;
                    long j4 = j2 - next.f5161o;
                    if (j4 > j3) {
                        cVar = next;
                        j3 = j4;
                    }
                }
            }
            long j5 = this.b;
            if (j3 < j5) {
                if (i2 <= this.a) {
                    if (i2 > 0) {
                        long j6 = j5 - j3;
                        return j6;
                    } else if (i3 > 0) {
                        return j5;
                    } else {
                        this.f5375f = false;
                        return -1;
                    }
                }
            }
            this.f5373d.remove(cVar);
            c.f(cVar.q());
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(p.e0.f.c cVar) {
        if (cVar.f5157k || this.a == 0) {
            this.f5373d.remove(cVar);
            return true;
        }
        notifyAll();
        return false;
    }

    /* access modifiers changed from: package-private */
    public Socket c(a aVar, g gVar) {
        for (p.e0.f.c next : this.f5373d) {
            if (next.l(aVar, (c0) null) && next.n() && next != gVar.d()) {
                return gVar.m(next);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public p.e0.f.c d(a aVar, g gVar, c0 c0Var) {
        for (p.e0.f.c next : this.f5373d) {
            if (next.l(aVar, c0Var)) {
                gVar.a(next, true);
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void f(p.e0.f.c cVar) {
        if (!this.f5375f) {
            this.f5375f = true;
            f5372g.execute(this.c);
        }
        this.f5373d.add(cVar);
    }
}
