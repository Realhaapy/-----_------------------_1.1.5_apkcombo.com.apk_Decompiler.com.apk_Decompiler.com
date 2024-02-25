package q;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class a extends t {

    /* renamed from: h  reason: collision with root package name */
    private static final long f5465h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f5466i;

    /* renamed from: j  reason: collision with root package name */
    static a f5467j;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5468e;

    /* renamed from: f  reason: collision with root package name */
    private a f5469f;

    /* renamed from: g  reason: collision with root package name */
    private long f5470g;

    /* renamed from: q.a$a  reason: collision with other inner class name */
    class C0152a implements r {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ r f5471e;

        C0152a(r rVar) {
            this.f5471e = rVar;
        }

        public void close() {
            a.this.k();
            try {
                this.f5471e.close();
                a.this.m(true);
            } catch (IOException e2) {
                throw a.this.l(e2);
            } catch (Throwable th) {
                a.this.m(false);
                throw th;
            }
        }

        public t d() {
            return a.this;
        }

        public void flush() {
            a.this.k();
            try {
                this.f5471e.flush();
                a.this.m(true);
            } catch (IOException e2) {
                throw a.this.l(e2);
            } catch (Throwable th) {
                a.this.m(false);
                throw th;
            }
        }

        public void h(c cVar, long j2) {
            u.b(cVar.f5477f, 0, j2);
            while (true) {
                long j3 = 0;
                if (j2 > 0) {
                    o oVar = cVar.f5476e;
                    while (true) {
                        if (j3 >= 65536) {
                            break;
                        }
                        j3 += (long) (oVar.c - oVar.b);
                        if (j3 >= j2) {
                            j3 = j2;
                            break;
                        }
                        oVar = oVar.f5508f;
                    }
                    a.this.k();
                    try {
                        this.f5471e.h(cVar, j3);
                        j2 -= j3;
                        a.this.m(true);
                    } catch (IOException e2) {
                        throw a.this.l(e2);
                    } catch (Throwable th) {
                        a.this.m(false);
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f5471e + ")";
        }
    }

    class b implements s {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ s f5473e;

        b(s sVar) {
            this.f5473e = sVar;
        }

        public long F(c cVar, long j2) {
            a.this.k();
            try {
                long F = this.f5473e.F(cVar, j2);
                a.this.m(true);
                return F;
            } catch (IOException e2) {
                throw a.this.l(e2);
            } catch (Throwable th) {
                a.this.m(false);
                throw th;
            }
        }

        public void close() {
            try {
                this.f5473e.close();
                a.this.m(true);
            } catch (IOException e2) {
                throw a.this.l(e2);
            } catch (Throwable th) {
                a.this.m(false);
                throw th;
            }
        }

        public t d() {
            return a.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f5473e + ")";
        }
    }

    private static final class c extends Thread {
        c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.t();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<q.a> r0 = q.a.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                q.a r1 = q.a.i()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                q.a r2 = q.a.f5467j     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                q.a.f5467j = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.t()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: q.a.c.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f5465h = millis;
        f5466i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    static a i() {
        Class<a> cls = a.class;
        a aVar = f5467j.f5469f;
        long nanoTime = System.nanoTime();
        if (aVar == null) {
            cls.wait(f5465h);
            if (f5467j.f5469f != null || System.nanoTime() - nanoTime < f5466i) {
                return null;
            }
            return f5467j;
        }
        long p2 = aVar.p(nanoTime);
        if (p2 > 0) {
            long j2 = p2 / 1000000;
            cls.wait(j2, (int) (p2 - (1000000 * j2)));
            return null;
        }
        f5467j.f5469f = aVar.f5469f;
        aVar.f5469f = null;
        return aVar;
    }

    private static synchronized boolean j(a aVar) {
        boolean z;
        synchronized (a.class) {
            a aVar2 = f5467j;
            while (true) {
                if (aVar2 == null) {
                    z = true;
                    break;
                }
                a aVar3 = aVar2.f5469f;
                if (aVar3 == aVar) {
                    aVar2.f5469f = aVar.f5469f;
                    aVar.f5469f = null;
                    z = false;
                    break;
                }
                aVar2 = aVar3;
            }
        }
        return z;
    }

    private long p(long j2) {
        return this.f5470g - j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0050 A[EDGE_INSN: B:33:0x0050->B:22:0x0050 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void q(q.a r6, long r7, boolean r9) {
        /*
            java.lang.Class<q.a> r0 = q.a.class
            monitor-enter(r0)
            q.a r1 = f5467j     // Catch:{ all -> 0x0065 }
            if (r1 != 0) goto L_0x0016
            q.a r1 = new q.a     // Catch:{ all -> 0x0065 }
            r1.<init>()     // Catch:{ all -> 0x0065 }
            f5467j = r1     // Catch:{ all -> 0x0065 }
            q.a$c r1 = new q.a$c     // Catch:{ all -> 0x0065 }
            r1.<init>()     // Catch:{ all -> 0x0065 }
            r1.start()     // Catch:{ all -> 0x0065 }
        L_0x0016:
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0065 }
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x002f
            if (r9 == 0) goto L_0x002f
            long r3 = r6.c()     // Catch:{ all -> 0x0065 }
            long r3 = r3 - r1
            long r7 = java.lang.Math.min(r7, r3)     // Catch:{ all -> 0x0065 }
        L_0x002b:
            long r7 = r7 + r1
            r6.f5470g = r7     // Catch:{ all -> 0x0065 }
            goto L_0x003a
        L_0x002f:
            if (r5 == 0) goto L_0x0032
            goto L_0x002b
        L_0x0032:
            if (r9 == 0) goto L_0x005f
            long r7 = r6.c()     // Catch:{ all -> 0x0065 }
            r6.f5470g = r7     // Catch:{ all -> 0x0065 }
        L_0x003a:
            long r7 = r6.p(r1)     // Catch:{ all -> 0x0065 }
            q.a r9 = f5467j     // Catch:{ all -> 0x0065 }
        L_0x0040:
            q.a r3 = r9.f5469f     // Catch:{ all -> 0x0065 }
            if (r3 == 0) goto L_0x0050
            long r3 = r3.p(r1)     // Catch:{ all -> 0x0065 }
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x004d
            goto L_0x0050
        L_0x004d:
            q.a r9 = r9.f5469f     // Catch:{ all -> 0x0065 }
            goto L_0x0040
        L_0x0050:
            q.a r7 = r9.f5469f     // Catch:{ all -> 0x0065 }
            r6.f5469f = r7     // Catch:{ all -> 0x0065 }
            r9.f5469f = r6     // Catch:{ all -> 0x0065 }
            q.a r6 = f5467j     // Catch:{ all -> 0x0065 }
            if (r9 != r6) goto L_0x005d
            r0.notify()     // Catch:{ all -> 0x0065 }
        L_0x005d:
            monitor-exit(r0)
            return
        L_0x005f:
            java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch:{ all -> 0x0065 }
            r6.<init>()     // Catch:{ all -> 0x0065 }
            throw r6     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q.a.q(q.a, long, boolean):void");
    }

    public final void k() {
        if (!this.f5468e) {
            long h2 = h();
            boolean e2 = e();
            if (h2 != 0 || e2) {
                this.f5468e = true;
                q(this, h2, e2);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    /* access modifiers changed from: package-private */
    public final IOException l(IOException iOException) {
        return !n() ? iOException : o(iOException);
    }

    /* access modifiers changed from: package-private */
    public final void m(boolean z) {
        if (n() && z) {
            throw o((IOException) null);
        }
    }

    public final boolean n() {
        if (!this.f5468e) {
            return false;
        }
        this.f5468e = false;
        return j(this);
    }

    /* access modifiers changed from: protected */
    public IOException o(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final r r(r rVar) {
        return new C0152a(rVar);
    }

    public final s s(s sVar) {
        return new b(sVar);
    }

    /* access modifiers changed from: protected */
    public void t() {
    }
}
