package p;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import p.e0.g.c;
import p.e0.g.j;
import p.e0.j.g;

final class x implements e {

    /* renamed from: e  reason: collision with root package name */
    final v f5449e;

    /* renamed from: f  reason: collision with root package name */
    final j f5450f;

    /* renamed from: g  reason: collision with root package name */
    final q.a f5451g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public p f5452h;

    /* renamed from: i  reason: collision with root package name */
    final y f5453i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f5454j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5455k;

    class a extends q.a {
        a() {
        }

        /* access modifiers changed from: protected */
        public void t() {
            x.this.d();
        }
    }

    final class b extends p.e0.b {

        /* renamed from: f  reason: collision with root package name */
        private final f f5457f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ x f5458g;

        static {
            Class<x> cls = x.class;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0030 A[Catch:{ IOException -> 0x004e, all -> 0x0026, all -> 0x008d }] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0059 A[Catch:{ IOException -> 0x004e, all -> 0x0026, all -> 0x008d }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0079 A[Catch:{ IOException -> 0x004e, all -> 0x0026, all -> 0x008d }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void k() {
            /*
                r5 = this;
                p.x r0 = r5.f5458g
                q.a r0 = r0.f5451g
                r0.k()
                r0 = 0
                p.x r1 = r5.f5458g     // Catch:{ IOException -> 0x004e, all -> 0x0026 }
                p.a0 r0 = r1.h()     // Catch:{ IOException -> 0x004e, all -> 0x0026 }
                r1 = 1
                p.f r2 = r5.f5457f     // Catch:{ IOException -> 0x0024, all -> 0x0022 }
                p.x r3 = r5.f5458g     // Catch:{ IOException -> 0x0024, all -> 0x0022 }
                r2.a(r3, r0)     // Catch:{ IOException -> 0x0024, all -> 0x0022 }
            L_0x0016:
                p.x r0 = r5.f5458g
                p.v r0 = r0.f5449e
                p.n r0 = r0.k()
                r0.e(r5)
                goto L_0x008c
            L_0x0022:
                r0 = move-exception
                goto L_0x0029
            L_0x0024:
                r0 = move-exception
                goto L_0x0051
            L_0x0026:
                r1 = move-exception
                r0 = r1
                r1 = 0
            L_0x0029:
                p.x r2 = r5.f5458g     // Catch:{ all -> 0x008d }
                r2.d()     // Catch:{ all -> 0x008d }
                if (r1 != 0) goto L_0x004d
                java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x008d }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008d }
                r2.<init>()     // Catch:{ all -> 0x008d }
                java.lang.String r3 = "canceled due to "
                r2.append(r3)     // Catch:{ all -> 0x008d }
                r2.append(r0)     // Catch:{ all -> 0x008d }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x008d }
                r1.<init>(r2)     // Catch:{ all -> 0x008d }
                p.f r2 = r5.f5457f     // Catch:{ all -> 0x008d }
                p.x r3 = r5.f5458g     // Catch:{ all -> 0x008d }
                r2.b(r3, r1)     // Catch:{ all -> 0x008d }
            L_0x004d:
                throw r0     // Catch:{ all -> 0x008d }
            L_0x004e:
                r1 = move-exception
                r0 = r1
                r1 = 0
            L_0x0051:
                p.x r2 = r5.f5458g     // Catch:{ all -> 0x008d }
                java.io.IOException r0 = r2.l(r0)     // Catch:{ all -> 0x008d }
                if (r1 == 0) goto L_0x0079
                p.e0.j.g r1 = p.e0.j.g.l()     // Catch:{ all -> 0x008d }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x008d }
                r3.<init>()     // Catch:{ all -> 0x008d }
                java.lang.String r4 = "Callback failure for "
                r3.append(r4)     // Catch:{ all -> 0x008d }
                p.x r4 = r5.f5458g     // Catch:{ all -> 0x008d }
                java.lang.String r4 = r4.m()     // Catch:{ all -> 0x008d }
                r3.append(r4)     // Catch:{ all -> 0x008d }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x008d }
                r1.s(r2, r3, r0)     // Catch:{ all -> 0x008d }
                goto L_0x0016
            L_0x0079:
                p.x r1 = r5.f5458g     // Catch:{ all -> 0x008d }
                p.p r1 = r1.f5452h     // Catch:{ all -> 0x008d }
                p.x r2 = r5.f5458g     // Catch:{ all -> 0x008d }
                r1.b(r2, r0)     // Catch:{ all -> 0x008d }
                p.f r1 = r5.f5457f     // Catch:{ all -> 0x008d }
                p.x r2 = r5.f5458g     // Catch:{ all -> 0x008d }
                r1.b(r2, r0)     // Catch:{ all -> 0x008d }
                goto L_0x0016
            L_0x008c:
                return
            L_0x008d:
                r0 = move-exception
                p.x r1 = r5.f5458g
                p.v r1 = r1.f5449e
                p.n r1 = r1.k()
                r1.e(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p.x.b.k():void");
        }

        /* access modifiers changed from: package-private */
        public void l(ExecutorService executorService) {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e2) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e2);
                this.f5458g.f5452h.b(this.f5458g, interruptedIOException);
                this.f5457f.b(this.f5458g, interruptedIOException);
                this.f5458g.f5449e.k().e(this);
            } catch (Throwable th) {
                this.f5458g.f5449e.k().e(this);
                throw th;
            }
        }

        /* access modifiers changed from: package-private */
        public x m() {
            return this.f5458g;
        }

        /* access modifiers changed from: package-private */
        public String n() {
            return this.f5458g.f5453i.h().l();
        }
    }

    private x(v vVar, y yVar, boolean z) {
        this.f5449e = vVar;
        this.f5453i = yVar;
        this.f5454j = z;
        this.f5450f = new j(vVar, z);
        a aVar = new a();
        this.f5451g = aVar;
        aVar.g((long) vVar.d(), TimeUnit.MILLISECONDS);
    }

    private void e() {
        this.f5450f.k(g.l().o("response.body().close()"));
    }

    static x j(v vVar, y yVar, boolean z) {
        x xVar = new x(vVar, yVar, z);
        xVar.f5452h = vVar.m().a(xVar);
        return xVar;
    }

    public a0 c() {
        synchronized (this) {
            if (!this.f5455k) {
                this.f5455k = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        e();
        this.f5451g.k();
        this.f5452h.c(this);
        try {
            this.f5449e.k().b(this);
            a0 h2 = h();
            if (h2 != null) {
                this.f5449e.k().f(this);
                return h2;
            }
            throw new IOException("Canceled");
        } catch (IOException e2) {
            IOException l2 = l(e2);
            this.f5452h.b(this, l2);
            throw l2;
        } catch (Throwable th) {
            this.f5449e.k().f(this);
            throw th;
        }
    }

    public void d() {
        this.f5450f.b();
    }

    /* renamed from: f */
    public x clone() {
        return j(this.f5449e, this.f5453i, this.f5454j);
    }

    /* access modifiers changed from: package-private */
    public a0 h() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f5449e.r());
        arrayList.add(this.f5450f);
        arrayList.add(new p.e0.g.a(this.f5449e.j()));
        arrayList.add(new p.e0.e.a(this.f5449e.s()));
        arrayList.add(new p.e0.f.a(this.f5449e));
        if (!this.f5454j) {
            arrayList.addAll(this.f5449e.t());
        }
        arrayList.add(new p.e0.g.b(this.f5454j));
        a0 d2 = new p.e0.g.g(arrayList, (p.e0.f.g) null, (c) null, (p.e0.f.c) null, 0, this.f5453i, this, this.f5452h, this.f5449e.f(), this.f5449e.B(), this.f5449e.F()).d(this.f5453i);
        if (!this.f5450f.e()) {
            return d2;
        }
        p.e0.c.e(d2);
        throw new IOException("Canceled");
    }

    public boolean i() {
        return this.f5450f.e();
    }

    /* access modifiers changed from: package-private */
    public String k() {
        return this.f5453i.h().z();
    }

    /* access modifiers changed from: package-private */
    public IOException l(IOException iOException) {
        if (!this.f5451g.n()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* access modifiers changed from: package-private */
    public String m() {
        StringBuilder sb = new StringBuilder();
        sb.append(i() ? "canceled " : "");
        sb.append(this.f5454j ? "web socket" : "call");
        sb.append(" to ");
        sb.append(k());
        return sb.toString();
    }
}
