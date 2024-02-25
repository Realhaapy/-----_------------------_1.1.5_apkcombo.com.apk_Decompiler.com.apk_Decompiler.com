package p.e0.i;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p.e0.i.h;

public final class g implements Closeable {
    /* access modifiers changed from: private */
    public static final ExecutorService C = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), p.e0.c.E("OkHttp Http2Connection", true));
    final l A;
    final Set<Integer> B;

    /* renamed from: e  reason: collision with root package name */
    final boolean f5251e;

    /* renamed from: f  reason: collision with root package name */
    final j f5252f;

    /* renamed from: g  reason: collision with root package name */
    final Map<Integer, i> f5253g = new LinkedHashMap();

    /* renamed from: h  reason: collision with root package name */
    final String f5254h;

    /* renamed from: i  reason: collision with root package name */
    int f5255i;

    /* renamed from: j  reason: collision with root package name */
    int f5256j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public boolean f5257k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final ScheduledExecutorService f5258l;

    /* renamed from: m  reason: collision with root package name */
    private final ExecutorService f5259m;

    /* renamed from: n  reason: collision with root package name */
    final l f5260n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public long f5261o = 0;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public long f5262p = 0;

    /* renamed from: q  reason: collision with root package name */
    private long f5263q = 0;

    /* renamed from: r  reason: collision with root package name */
    private long f5264r = 0;

    /* renamed from: s  reason: collision with root package name */
    private long f5265s = 0;
    private long t = 0;
    long u = 0;
    long v;
    m w = new m();
    final m x;
    final Socket y;
    final j z;

    class a extends p.e0.b {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f5266f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f5267g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, Object[] objArr, int i2, b bVar) {
            super(str, objArr);
            this.f5266f = i2;
            this.f5267g = bVar;
        }

        public void k() {
            try {
                g.this.m0(this.f5266f, this.f5267g);
            } catch (IOException unused) {
                g.this.S();
            }
        }
    }

    class b extends p.e0.b {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f5269f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f5270g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str, Object[] objArr, int i2, long j2) {
            super(str, objArr);
            this.f5269f = i2;
            this.f5270g = j2;
        }

        public void k() {
            try {
                g.this.z.T(this.f5269f, this.f5270g);
            } catch (IOException unused) {
                g.this.S();
            }
        }
    }

    class c extends p.e0.b {
        c(String str, Object... objArr) {
            super(str, objArr);
        }

        public void k() {
            g.this.l0(false, 2, 0);
        }
    }

    class d extends p.e0.b {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f5273f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ List f5274g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String str, Object[] objArr, int i2, List list) {
            super(str, objArr);
            this.f5273f = i2;
            this.f5274g = list;
        }

        public void k() {
            if (g.this.f5260n.a(this.f5273f, this.f5274g)) {
                try {
                    g.this.z.O(this.f5273f, b.CANCEL);
                    synchronized (g.this) {
                        g.this.B.remove(Integer.valueOf(this.f5273f));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    class e extends p.e0.b {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f5276f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ List f5277g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f5278h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(String str, Object[] objArr, int i2, List list, boolean z) {
            super(str, objArr);
            this.f5276f = i2;
            this.f5277g = list;
            this.f5278h = z;
        }

        public void k() {
            boolean b = g.this.f5260n.b(this.f5276f, this.f5277g, this.f5278h);
            if (b) {
                try {
                    g.this.z.O(this.f5276f, b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (b || this.f5278h) {
                synchronized (g.this) {
                    g.this.B.remove(Integer.valueOf(this.f5276f));
                }
            }
        }
    }

    class f extends p.e0.b {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f5280f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ q.c f5281g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f5282h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f5283i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(String str, Object[] objArr, int i2, q.c cVar, int i3, boolean z) {
            super(str, objArr);
            this.f5280f = i2;
            this.f5281g = cVar;
            this.f5282h = i3;
            this.f5283i = z;
        }

        public void k() {
            try {
                boolean d2 = g.this.f5260n.d(this.f5280f, this.f5281g, this.f5282h, this.f5283i);
                if (d2) {
                    g.this.z.O(this.f5280f, b.CANCEL);
                }
                if (d2 || this.f5283i) {
                    synchronized (g.this) {
                        g.this.B.remove(Integer.valueOf(this.f5280f));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: p.e0.i.g$g  reason: collision with other inner class name */
    class C0150g extends p.e0.b {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f5285f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f5286g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0150g(String str, Object[] objArr, int i2, b bVar) {
            super(str, objArr);
            this.f5285f = i2;
            this.f5286g = bVar;
        }

        public void k() {
            g.this.f5260n.c(this.f5285f, this.f5286g);
            synchronized (g.this) {
                g.this.B.remove(Integer.valueOf(this.f5285f));
            }
        }
    }

    public static class h {
        Socket a;
        String b;
        q.e c;

        /* renamed from: d  reason: collision with root package name */
        q.d f5288d;

        /* renamed from: e  reason: collision with root package name */
        j f5289e = j.a;

        /* renamed from: f  reason: collision with root package name */
        l f5290f = l.a;

        /* renamed from: g  reason: collision with root package name */
        boolean f5291g;

        /* renamed from: h  reason: collision with root package name */
        int f5292h;

        public h(boolean z) {
            this.f5291g = z;
        }

        public g a() {
            return new g(this);
        }

        public h b(j jVar) {
            this.f5289e = jVar;
            return this;
        }

        public h c(int i2) {
            this.f5292h = i2;
            return this;
        }

        public h d(Socket socket, String str, q.e eVar, q.d dVar) {
            this.a = socket;
            this.b = str;
            this.c = eVar;
            this.f5288d = dVar;
            return this;
        }
    }

    final class i extends p.e0.b {
        i() {
            super("OkHttp %s ping", g.this.f5254h);
        }

        public void k() {
            boolean z;
            synchronized (g.this) {
                if (g.this.f5262p < g.this.f5261o) {
                    z = true;
                } else {
                    g.v(g.this);
                    z = false;
                }
            }
            g gVar = g.this;
            if (z) {
                gVar.S();
            } else {
                gVar.l0(false, 1, 0);
            }
        }
    }

    public static abstract class j {
        public static final j a = new a();

        class a extends j {
            a() {
            }

            public void b(i iVar) {
                iVar.f(b.REFUSED_STREAM);
            }
        }

        public void a(g gVar) {
        }

        public abstract void b(i iVar);
    }

    final class k extends p.e0.b {

        /* renamed from: f  reason: collision with root package name */
        final boolean f5294f;

        /* renamed from: g  reason: collision with root package name */
        final int f5295g;

        /* renamed from: h  reason: collision with root package name */
        final int f5296h;

        k(boolean z, int i2, int i3) {
            super("OkHttp %s ping %08x%08x", g.this.f5254h, Integer.valueOf(i2), Integer.valueOf(i3));
            this.f5294f = z;
            this.f5295g = i2;
            this.f5296h = i3;
        }

        public void k() {
            g.this.l0(this.f5294f, this.f5295g, this.f5296h);
        }
    }

    class l extends p.e0.b implements h.b {

        /* renamed from: f  reason: collision with root package name */
        final h f5298f;

        class a extends p.e0.b {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ i f5300f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(String str, Object[] objArr, i iVar) {
                super(str, objArr);
                this.f5300f = iVar;
            }

            public void k() {
                try {
                    g.this.f5252f.b(this.f5300f);
                } catch (IOException e2) {
                    p.e0.j.g l2 = p.e0.j.g.l();
                    l2.s(4, "Http2Connection.Listener failure for " + g.this.f5254h, e2);
                    try {
                        this.f5300f.f(b.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        class b extends p.e0.b {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f5302f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ m f5303g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(String str, Object[] objArr, boolean z, m mVar) {
                super(str, objArr);
                this.f5302f = z;
                this.f5303g = mVar;
            }

            public void k() {
                l.this.l(this.f5302f, this.f5303g);
            }
        }

        class c extends p.e0.b {
            c(String str, Object... objArr) {
                super(str, objArr);
            }

            public void k() {
                g gVar = g.this;
                gVar.f5252f.a(gVar);
            }
        }

        l(h hVar) {
            super("OkHttp %s", g.this.f5254h);
            this.f5298f = hVar;
        }

        public void a() {
        }

        public void b(boolean z, m mVar) {
            try {
                g.this.f5258l.execute(new b("OkHttp %s ACK Settings", new Object[]{g.this.f5254h}, z, mVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        public void c(boolean z, int i2, q.e eVar, int i3) {
            if (g.this.d0(i2)) {
                g.this.Y(i2, eVar, i3, z);
                return;
            }
            i T = g.this.T(i2);
            if (T == null) {
                g.this.n0(i2, b.PROTOCOL_ERROR);
                long j2 = (long) i3;
                g.this.j0(j2);
                eVar.skip(j2);
                return;
            }
            T.o(eVar, i3);
            if (z) {
                T.p();
            }
        }

        public void d(boolean z, int i2, int i3) {
            if (z) {
                synchronized (g.this) {
                    if (i2 == 1) {
                        try {
                            g.g(g.this);
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else if (i2 == 2) {
                        g.L(g.this);
                    } else if (i2 == 3) {
                        g.O(g.this);
                        g.this.notifyAll();
                    }
                }
                return;
            }
            try {
                g.this.f5258l.execute(new k(true, i2, i3));
            } catch (RejectedExecutionException unused) {
            }
        }

        public void e(int i2, int i3, int i4, boolean z) {
        }

        public void f(int i2, b bVar) {
            if (g.this.d0(i2)) {
                g.this.c0(i2, bVar);
                return;
            }
            i e0 = g.this.e0(i2);
            if (e0 != null) {
                e0.r(bVar);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
            r0.q(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
            if (r10 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
            r0.p();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void g(boolean r10, int r11, int r12, java.util.List<p.e0.i.c> r13) {
            /*
                r9 = this;
                p.e0.i.g r12 = p.e0.i.g.this
                boolean r12 = r12.d0(r11)
                if (r12 == 0) goto L_0x000e
                p.e0.i.g r12 = p.e0.i.g.this
                r12.a0(r11, r13, r10)
                return
            L_0x000e:
                p.e0.i.g r12 = p.e0.i.g.this
                monitor-enter(r12)
                p.e0.i.g r0 = p.e0.i.g.this     // Catch:{ all -> 0x007b }
                p.e0.i.i r0 = r0.T(r11)     // Catch:{ all -> 0x007b }
                if (r0 != 0) goto L_0x0071
                p.e0.i.g r0 = p.e0.i.g.this     // Catch:{ all -> 0x007b }
                boolean r0 = r0.f5257k     // Catch:{ all -> 0x007b }
                if (r0 == 0) goto L_0x0023
                monitor-exit(r12)     // Catch:{ all -> 0x007b }
                return
            L_0x0023:
                p.e0.i.g r0 = p.e0.i.g.this     // Catch:{ all -> 0x007b }
                int r1 = r0.f5255i     // Catch:{ all -> 0x007b }
                if (r11 > r1) goto L_0x002b
                monitor-exit(r12)     // Catch:{ all -> 0x007b }
                return
            L_0x002b:
                int r1 = r11 % 2
                int r0 = r0.f5256j     // Catch:{ all -> 0x007b }
                r2 = 2
                int r0 = r0 % r2
                if (r1 != r0) goto L_0x0035
                monitor-exit(r12)     // Catch:{ all -> 0x007b }
                return
            L_0x0035:
                p.r r8 = p.e0.c.F(r13)     // Catch:{ all -> 0x007b }
                p.e0.i.i r13 = new p.e0.i.i     // Catch:{ all -> 0x007b }
                p.e0.i.g r5 = p.e0.i.g.this     // Catch:{ all -> 0x007b }
                r6 = 0
                r3 = r13
                r4 = r11
                r7 = r10
                r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x007b }
                p.e0.i.g r10 = p.e0.i.g.this     // Catch:{ all -> 0x007b }
                r10.f5255i = r11     // Catch:{ all -> 0x007b }
                java.util.Map<java.lang.Integer, p.e0.i.i> r10 = r10.f5253g     // Catch:{ all -> 0x007b }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x007b }
                r10.put(r0, r13)     // Catch:{ all -> 0x007b }
                java.util.concurrent.ExecutorService r10 = p.e0.i.g.C     // Catch:{ all -> 0x007b }
                p.e0.i.g$l$a r0 = new p.e0.i.g$l$a     // Catch:{ all -> 0x007b }
                java.lang.String r1 = "OkHttp %s stream %d"
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x007b }
                r3 = 0
                p.e0.i.g r4 = p.e0.i.g.this     // Catch:{ all -> 0x007b }
                java.lang.String r4 = r4.f5254h     // Catch:{ all -> 0x007b }
                r2[r3] = r4     // Catch:{ all -> 0x007b }
                r3 = 1
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x007b }
                r2[r3] = r11     // Catch:{ all -> 0x007b }
                r0.<init>(r1, r2, r13)     // Catch:{ all -> 0x007b }
                r10.execute(r0)     // Catch:{ all -> 0x007b }
                monitor-exit(r12)     // Catch:{ all -> 0x007b }
                return
            L_0x0071:
                monitor-exit(r12)     // Catch:{ all -> 0x007b }
                r0.q(r13)
                if (r10 == 0) goto L_0x007a
                r0.p()
            L_0x007a:
                return
            L_0x007b:
                r10 = move-exception
                monitor-exit(r12)     // Catch:{ all -> 0x007b }
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p.e0.i.g.l.g(boolean, int, int, java.util.List):void");
        }

        public void h(int i2, long j2) {
            g gVar = g.this;
            if (i2 == 0) {
                synchronized (gVar) {
                    g gVar2 = g.this;
                    gVar2.v += j2;
                    gVar2.notifyAll();
                }
                return;
            }
            i T = gVar.T(i2);
            if (T != null) {
                synchronized (T) {
                    T.c(j2);
                }
            }
        }

        public void i(int i2, int i3, List<c> list) {
            g.this.b0(i3, list);
        }

        public void j(int i2, b bVar, q.f fVar) {
            i[] iVarArr;
            fVar.v();
            synchronized (g.this) {
                iVarArr = (i[]) g.this.f5253g.values().toArray(new i[g.this.f5253g.size()]);
                boolean unused = g.this.f5257k = true;
            }
            for (i iVar : iVarArr) {
                if (iVar.i() > i2 && iVar.l()) {
                    iVar.r(b.REFUSED_STREAM);
                    g.this.e0(iVar.i());
                }
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r0 = p.e0.i.b.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r4.f5299g.P(r0, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x002c, code lost:
            r2 = th;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x001f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void k() {
            /*
                r4 = this;
                p.e0.i.b r0 = p.e0.i.b.INTERNAL_ERROR
                p.e0.i.h r1 = r4.f5298f     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                r1.g(r4)     // Catch:{ IOException -> 0x001e, all -> 0x001b }
            L_0x0007:
                p.e0.i.h r1 = r4.f5298f     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                r2 = 0
                boolean r1 = r1.c(r2, r4)     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                if (r1 == 0) goto L_0x0011
                goto L_0x0007
            L_0x0011:
                p.e0.i.b r1 = p.e0.i.b.NO_ERROR     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                p.e0.i.b r0 = p.e0.i.b.CANCEL     // Catch:{ IOException -> 0x001f }
                p.e0.i.g r2 = p.e0.i.g.this     // Catch:{ IOException -> 0x0026 }
                r2.P(r1, r0)     // Catch:{ IOException -> 0x0026 }
                goto L_0x0026
            L_0x001b:
                r2 = move-exception
                r1 = r0
                goto L_0x002d
            L_0x001e:
                r1 = r0
            L_0x001f:
                p.e0.i.b r0 = p.e0.i.b.PROTOCOL_ERROR     // Catch:{ all -> 0x002c }
                p.e0.i.g r1 = p.e0.i.g.this     // Catch:{ IOException -> 0x0026 }
                r1.P(r0, r0)     // Catch:{ IOException -> 0x0026 }
            L_0x0026:
                p.e0.i.h r0 = r4.f5298f
                p.e0.c.e(r0)
                return
            L_0x002c:
                r2 = move-exception
            L_0x002d:
                p.e0.i.g r3 = p.e0.i.g.this     // Catch:{ IOException -> 0x0032 }
                r3.P(r1, r0)     // Catch:{ IOException -> 0x0032 }
            L_0x0032:
                p.e0.i.h r0 = r4.f5298f
                p.e0.c.e(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p.e0.i.g.l.k():void");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:2|3|7|17|18|19|20|21) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0061 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void l(boolean r6, p.e0.i.m r7) {
            /*
                r5 = this;
                p.e0.i.g r0 = p.e0.i.g.this
                p.e0.i.j r0 = r0.z
                monitor-enter(r0)
                p.e0.i.g r1 = p.e0.i.g.this     // Catch:{ all -> 0x0096 }
                monitor-enter(r1)     // Catch:{ all -> 0x0096 }
                p.e0.i.g r2 = p.e0.i.g.this     // Catch:{ all -> 0x0093 }
                p.e0.i.m r2 = r2.x     // Catch:{ all -> 0x0093 }
                int r2 = r2.d()     // Catch:{ all -> 0x0093 }
                if (r6 == 0) goto L_0x0019
                p.e0.i.g r6 = p.e0.i.g.this     // Catch:{ all -> 0x0093 }
                p.e0.i.m r6 = r6.x     // Catch:{ all -> 0x0093 }
                r6.a()     // Catch:{ all -> 0x0093 }
            L_0x0019:
                p.e0.i.g r6 = p.e0.i.g.this     // Catch:{ all -> 0x0093 }
                p.e0.i.m r6 = r6.x     // Catch:{ all -> 0x0093 }
                r6.h(r7)     // Catch:{ all -> 0x0093 }
                p.e0.i.g r6 = p.e0.i.g.this     // Catch:{ all -> 0x0093 }
                p.e0.i.m r6 = r6.x     // Catch:{ all -> 0x0093 }
                int r6 = r6.d()     // Catch:{ all -> 0x0093 }
                r7 = -1
                r3 = 0
                if (r6 == r7) goto L_0x0054
                if (r6 == r2) goto L_0x0054
                int r6 = r6 - r2
                long r6 = (long) r6     // Catch:{ all -> 0x0093 }
                p.e0.i.g r2 = p.e0.i.g.this     // Catch:{ all -> 0x0093 }
                java.util.Map<java.lang.Integer, p.e0.i.i> r2 = r2.f5253g     // Catch:{ all -> 0x0093 }
                boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0093 }
                if (r2 != 0) goto L_0x0056
                p.e0.i.g r2 = p.e0.i.g.this     // Catch:{ all -> 0x0093 }
                java.util.Map<java.lang.Integer, p.e0.i.i> r2 = r2.f5253g     // Catch:{ all -> 0x0093 }
                java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x0093 }
                p.e0.i.g r3 = p.e0.i.g.this     // Catch:{ all -> 0x0093 }
                java.util.Map<java.lang.Integer, p.e0.i.i> r3 = r3.f5253g     // Catch:{ all -> 0x0093 }
                int r3 = r3.size()     // Catch:{ all -> 0x0093 }
                p.e0.i.i[] r3 = new p.e0.i.i[r3]     // Catch:{ all -> 0x0093 }
                java.lang.Object[] r2 = r2.toArray(r3)     // Catch:{ all -> 0x0093 }
                p.e0.i.i[] r2 = (p.e0.i.i[]) r2     // Catch:{ all -> 0x0093 }
                r3 = r2
                goto L_0x0056
            L_0x0054:
                r6 = 0
            L_0x0056:
                monitor-exit(r1)     // Catch:{ all -> 0x0093 }
                p.e0.i.g r1 = p.e0.i.g.this     // Catch:{ IOException -> 0x0061 }
                p.e0.i.j r2 = r1.z     // Catch:{ IOException -> 0x0061 }
                p.e0.i.m r1 = r1.x     // Catch:{ IOException -> 0x0061 }
                r2.a(r1)     // Catch:{ IOException -> 0x0061 }
                goto L_0x0066
            L_0x0061:
                p.e0.i.g r1 = p.e0.i.g.this     // Catch:{ all -> 0x0096 }
                r1.S()     // Catch:{ all -> 0x0096 }
            L_0x0066:
                monitor-exit(r0)     // Catch:{ all -> 0x0096 }
                r0 = 0
                if (r3 == 0) goto L_0x007b
                int r1 = r3.length
                r2 = 0
            L_0x006c:
                if (r2 >= r1) goto L_0x007b
                r4 = r3[r2]
                monitor-enter(r4)
                r4.c(r6)     // Catch:{ all -> 0x0078 }
                monitor-exit(r4)     // Catch:{ all -> 0x0078 }
                int r2 = r2 + 1
                goto L_0x006c
            L_0x0078:
                r6 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0078 }
                throw r6
            L_0x007b:
                java.util.concurrent.ExecutorService r6 = p.e0.i.g.C
                p.e0.i.g$l$c r7 = new p.e0.i.g$l$c
                java.lang.String r1 = "OkHttp %s settings"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                p.e0.i.g r3 = p.e0.i.g.this
                java.lang.String r3 = r3.f5254h
                r2[r0] = r3
                r7.<init>(r1, r2)
                r6.execute(r7)
                return
            L_0x0093:
                r6 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0093 }
                throw r6     // Catch:{ all -> 0x0096 }
            L_0x0096:
                r6 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0096 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p.e0.i.g.l.l(boolean, p.e0.i.m):void");
        }
    }

    static {
        Class<g> cls = g.class;
    }

    g(h hVar) {
        h hVar2 = hVar;
        m mVar = new m();
        this.x = mVar;
        this.B = new LinkedHashSet();
        this.f5260n = hVar2.f5290f;
        boolean z2 = hVar2.f5291g;
        this.f5251e = z2;
        this.f5252f = hVar2.f5289e;
        int i2 = z2 ? 1 : 2;
        this.f5256j = i2;
        if (z2) {
            this.f5256j = i2 + 2;
        }
        if (z2) {
            this.w.i(7, 16777216);
        }
        String str = hVar2.b;
        this.f5254h = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, p.e0.c.E(p.e0.c.p("OkHttp %s Writer", str), false));
        this.f5258l = scheduledThreadPoolExecutor;
        if (hVar2.f5292h != 0) {
            i iVar = new i();
            int i3 = hVar2.f5292h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, (long) i3, (long) i3, TimeUnit.MILLISECONDS);
        }
        this.f5259m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), p.e0.c.E(p.e0.c.p("OkHttp %s Push Observer", str), true));
        mVar.i(7, 65535);
        mVar.i(5, 16384);
        this.v = (long) mVar.d();
        this.y = hVar2.a;
        this.z = new j(hVar2.f5288d, z2);
        this.A = new l(new h(hVar2.c, z2));
    }

    static /* synthetic */ long L(g gVar) {
        long j2 = gVar.f5264r;
        gVar.f5264r = 1 + j2;
        return j2;
    }

    static /* synthetic */ long O(g gVar) {
        long j2 = gVar.f5265s;
        gVar.f5265s = 1 + j2;
        return j2;
    }

    /* access modifiers changed from: private */
    public void S() {
        try {
            b bVar = b.PROTOCOL_ERROR;
            P(bVar, bVar);
        } catch (IOException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p.e0.i.i W(int r11, java.util.List<p.e0.i.c> r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            p.e0.i.j r7 = r10.z
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0076 }
            int r0 = r10.f5256j     // Catch:{ all -> 0x0073 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0013
            p.e0.i.b r0 = p.e0.i.b.REFUSED_STREAM     // Catch:{ all -> 0x0073 }
            r10.g0(r0)     // Catch:{ all -> 0x0073 }
        L_0x0013:
            boolean r0 = r10.f5257k     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x006d
            int r8 = r10.f5256j     // Catch:{ all -> 0x0073 }
            int r0 = r8 + 2
            r10.f5256j = r0     // Catch:{ all -> 0x0073 }
            p.e0.i.i r9 = new p.e0.i.i     // Catch:{ all -> 0x0073 }
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0073 }
            if (r13 == 0) goto L_0x003a
            long r0 = r10.v     // Catch:{ all -> 0x0073 }
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x003a
            long r0 = r9.b     // Catch:{ all -> 0x0073 }
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r13 = 0
            goto L_0x003b
        L_0x003a:
            r13 = 1
        L_0x003b:
            boolean r0 = r9.m()     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x004a
            java.util.Map<java.lang.Integer, p.e0.i.i> r0 = r10.f5253g     // Catch:{ all -> 0x0073 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0073 }
            r0.put(r1, r9)     // Catch:{ all -> 0x0073 }
        L_0x004a:
            monitor-exit(r10)     // Catch:{ all -> 0x0073 }
            if (r11 != 0) goto L_0x0053
            p.e0.i.j r0 = r10.z     // Catch:{ all -> 0x0076 }
            r0.S(r6, r8, r11, r12)     // Catch:{ all -> 0x0076 }
            goto L_0x005c
        L_0x0053:
            boolean r0 = r10.f5251e     // Catch:{ all -> 0x0076 }
            if (r0 != 0) goto L_0x0065
            p.e0.i.j r0 = r10.z     // Catch:{ all -> 0x0076 }
            r0.L(r11, r8, r12)     // Catch:{ all -> 0x0076 }
        L_0x005c:
            monitor-exit(r7)     // Catch:{ all -> 0x0076 }
            if (r13 == 0) goto L_0x0064
            p.e0.i.j r11 = r10.z
            r11.flush()
        L_0x0064:
            return r9
        L_0x0065:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0076 }
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch:{ all -> 0x0076 }
            throw r11     // Catch:{ all -> 0x0076 }
        L_0x006d:
            p.e0.i.a r11 = new p.e0.i.a     // Catch:{ all -> 0x0073 }
            r11.<init>()     // Catch:{ all -> 0x0073 }
            throw r11     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0073 }
            throw r11     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r11 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0076 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e0.i.g.W(int, java.util.List, boolean):p.e0.i.i");
    }

    private synchronized void Z(p.e0.b bVar) {
        if (!this.f5257k) {
            this.f5259m.execute(bVar);
        }
    }

    static /* synthetic */ long g(g gVar) {
        long j2 = gVar.f5262p;
        gVar.f5262p = 1 + j2;
        return j2;
    }

    static /* synthetic */ long v(g gVar) {
        long j2 = gVar.f5261o;
        gVar.f5261o = 1 + j2;
        return j2;
    }

    /* access modifiers changed from: package-private */
    public void P(b bVar, b bVar2) {
        i[] iVarArr = null;
        try {
            g0(bVar);
            e = null;
        } catch (IOException e2) {
            e = e2;
        }
        synchronized (this) {
            if (!this.f5253g.isEmpty()) {
                iVarArr = (i[]) this.f5253g.values().toArray(new i[this.f5253g.size()]);
                this.f5253g.clear();
            }
        }
        if (iVarArr != null) {
            for (i f2 : iVarArr) {
                try {
                    f2.f(bVar2);
                } catch (IOException e3) {
                    if (e != null) {
                        e = e3;
                    }
                }
            }
        }
        try {
            this.z.close();
        } catch (IOException e4) {
            if (e == null) {
                e = e4;
            }
        }
        try {
            this.y.close();
        } catch (IOException e5) {
            e = e5;
        }
        this.f5258l.shutdown();
        this.f5259m.shutdown();
        if (e != null) {
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized i T(int i2) {
        return this.f5253g.get(Integer.valueOf(i2));
    }

    public synchronized boolean U(long j2) {
        if (this.f5257k) {
            return false;
        }
        return this.f5264r >= this.f5263q || j2 < this.t;
    }

    public synchronized int V() {
        return this.x.e(Integer.MAX_VALUE);
    }

    public i X(List<c> list, boolean z2) {
        return W(0, list, z2);
    }

    /* access modifiers changed from: package-private */
    public void Y(int i2, q.e eVar, int i3, boolean z2) {
        q.c cVar = new q.c();
        long j2 = (long) i3;
        eVar.M(j2);
        eVar.F(cVar, j2);
        if (cVar.X() == j2) {
            Z(new f("OkHttp %s Push Data[%s]", new Object[]{this.f5254h, Integer.valueOf(i2)}, i2, cVar, i3, z2));
            return;
        }
        throw new IOException(cVar.X() + " != " + i3);
    }

    /* access modifiers changed from: package-private */
    public void a0(int i2, List<c> list, boolean z2) {
        try {
            Z(new e("OkHttp %s Push Headers[%s]", new Object[]{this.f5254h, Integer.valueOf(i2)}, i2, list, z2));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void b0(int i2, List<c> list) {
        synchronized (this) {
            if (this.B.contains(Integer.valueOf(i2))) {
                n0(i2, b.PROTOCOL_ERROR);
                return;
            }
            this.B.add(Integer.valueOf(i2));
            try {
                Z(new d("OkHttp %s Push Request[%s]", new Object[]{this.f5254h, Integer.valueOf(i2)}, i2, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c0(int i2, b bVar) {
        Z(new C0150g("OkHttp %s Push Reset[%s]", new Object[]{this.f5254h, Integer.valueOf(i2)}, i2, bVar));
    }

    public void close() {
        P(b.NO_ERROR, b.CANCEL);
    }

    /* access modifiers changed from: package-private */
    public boolean d0(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    /* access modifiers changed from: package-private */
    public synchronized i e0(int i2) {
        i remove;
        remove = this.f5253g.remove(Integer.valueOf(i2));
        notifyAll();
        return remove;
    }

    /* access modifiers changed from: package-private */
    public void f0() {
        synchronized (this) {
            long j2 = this.f5264r;
            long j3 = this.f5263q;
            if (j2 >= j3) {
                this.f5263q = j3 + 1;
                this.t = System.nanoTime() + 1000000000;
                try {
                    this.f5258l.execute(new c("OkHttp %s ping", this.f5254h));
                } catch (RejectedExecutionException unused) {
                }
            }
        }
    }

    public void flush() {
        this.z.flush();
    }

    public void g0(b bVar) {
        synchronized (this.z) {
            synchronized (this) {
                if (!this.f5257k) {
                    this.f5257k = true;
                    int i2 = this.f5255i;
                    this.z.z(i2, bVar, p.e0.c.a);
                }
            }
        }
    }

    public void h0() {
        i0(true);
    }

    /* access modifiers changed from: package-private */
    public void i0(boolean z2) {
        if (z2) {
            this.z.c();
            this.z.P(this.w);
            int d2 = this.w.d();
            if (d2 != 65535) {
                this.z.T(0, (long) (d2 - 65535));
            }
        }
        new Thread(this.A).start();
    }

    /* access modifiers changed from: package-private */
    public synchronized void j0(long j2) {
        long j3 = this.u + j2;
        this.u = j3;
        if (j3 >= ((long) (this.w.d() / 2))) {
            o0(0, this.u);
            this.u = 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.z.E());
        r6 = (long) r3;
        r8.v -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0058 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k0(int r9, boolean r10, q.c r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            p.e0.i.j r12 = r8.z
            r12.g(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0067
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.v     // Catch:{ InterruptedException -> 0x0058 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, p.e0.i.i> r3 = r8.f5253g     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0058 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x0058 }
            if (r3 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x0058 }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0058 }
            throw r9     // Catch:{ InterruptedException -> 0x0058 }
        L_0x0030:
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0056 }
            int r4 = (int) r3     // Catch:{ all -> 0x0056 }
            p.e0.i.j r3 = r8.z     // Catch:{ all -> 0x0056 }
            int r3 = r3.E()     // Catch:{ all -> 0x0056 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0056 }
            long r4 = r8.v     // Catch:{ all -> 0x0056 }
            long r6 = (long) r3     // Catch:{ all -> 0x0056 }
            long r4 = r4 - r6
            r8.v = r4     // Catch:{ all -> 0x0056 }
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            long r12 = r12 - r6
            p.e0.i.j r4 = r8.z
            if (r10 == 0) goto L_0x0051
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0051
            r5 = 1
            goto L_0x0052
        L_0x0051:
            r5 = 0
        L_0x0052:
            r4.g(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0056:
            r9 = move-exception
            goto L_0x0065
        L_0x0058:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0056 }
            r9.interrupt()     // Catch:{ all -> 0x0056 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0056 }
            r9.<init>()     // Catch:{ all -> 0x0056 }
            throw r9     // Catch:{ all -> 0x0056 }
        L_0x0065:
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            throw r9
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e0.i.g.k0(int, boolean, q.c, long):void");
    }

    /* access modifiers changed from: package-private */
    public void l0(boolean z2, int i2, int i3) {
        try {
            this.z.J(z2, i2, i3);
        } catch (IOException unused) {
            S();
        }
    }

    /* access modifiers changed from: package-private */
    public void m0(int i2, b bVar) {
        this.z.O(i2, bVar);
    }

    /* access modifiers changed from: package-private */
    public void n0(int i2, b bVar) {
        try {
            this.f5258l.execute(new a("OkHttp %s stream %d", new Object[]{this.f5254h, Integer.valueOf(i2)}, i2, bVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void o0(int i2, long j2) {
        try {
            this.f5258l.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f5254h, Integer.valueOf(i2)}, i2, j2));
        } catch (RejectedExecutionException unused) {
        }
    }
}
