package p.e0.f;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;
import p.c0;
import p.e;
import p.e0.f.f;
import p.e0.g.c;
import p.j;
import p.p;
import p.t;
import p.v;

public final class g {
    public final p.a a;
    private f.a b;
    private c0 c;

    /* renamed from: d  reason: collision with root package name */
    private final j f5169d;

    /* renamed from: e  reason: collision with root package name */
    public final e f5170e;

    /* renamed from: f  reason: collision with root package name */
    public final p f5171f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f5172g;

    /* renamed from: h  reason: collision with root package name */
    private final f f5173h;

    /* renamed from: i  reason: collision with root package name */
    private int f5174i;

    /* renamed from: j  reason: collision with root package name */
    private c f5175j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5176k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f5177l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f5178m;

    /* renamed from: n  reason: collision with root package name */
    private c f5179n;

    public static final class a extends WeakReference<g> {
        public final Object a;

        a(g gVar, Object obj) {
            super(gVar);
            this.a = obj;
        }
    }

    public g(j jVar, p.a aVar, e eVar, p pVar, Object obj) {
        this.f5169d = jVar;
        this.a = aVar;
        this.f5170e = eVar;
        this.f5171f = pVar;
        this.f5173h = new f(aVar, p(), eVar, pVar);
        this.f5172g = obj;
    }

    private Socket e(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.f5179n = null;
        }
        if (z2) {
            this.f5177l = true;
        }
        c cVar = this.f5175j;
        if (cVar == null) {
            return null;
        }
        if (z) {
            cVar.f5157k = true;
        }
        if (this.f5179n != null) {
            return null;
        }
        if (!this.f5177l && !cVar.f5157k) {
            return null;
        }
        l(cVar);
        if (this.f5175j.f5160n.isEmpty()) {
            this.f5175j.f5161o = System.nanoTime();
            if (p.e0.a.a.e(this.f5169d, this.f5175j)) {
                socket = this.f5175j.q();
                this.f5175j = null;
                return socket;
            }
        }
        socket = null;
        this.f5175j = null;
        return socket;
    }

    private c f(int i2, int i3, int i4, int i5, boolean z) {
        c cVar;
        Socket n2;
        c cVar2;
        Socket socket;
        boolean z2;
        c0 c0Var;
        boolean z3;
        f.a aVar;
        synchronized (this.f5169d) {
            if (this.f5177l) {
                throw new IllegalStateException("released");
            } else if (this.f5179n != null) {
                throw new IllegalStateException("codec != null");
            } else if (!this.f5178m) {
                cVar = this.f5175j;
                n2 = n();
                cVar2 = this.f5175j;
                socket = null;
                if (cVar2 != null) {
                    cVar = null;
                } else {
                    cVar2 = null;
                }
                if (!this.f5176k) {
                    cVar = null;
                }
                if (cVar2 == null) {
                    p.e0.a.a.h(this.f5169d, this.a, this, (c0) null);
                    c cVar3 = this.f5175j;
                    if (cVar3 != null) {
                        cVar2 = cVar3;
                        z2 = true;
                        c0Var = null;
                    } else {
                        c0Var = this.c;
                    }
                } else {
                    c0Var = null;
                }
                z2 = false;
            } else {
                throw new IOException("Canceled");
            }
        }
        p.e0.c.f(n2);
        if (cVar != null) {
            this.f5171f.h(this.f5170e, cVar);
        }
        if (z2) {
            this.f5171f.g(this.f5170e, cVar2);
        }
        if (cVar2 != null) {
            this.c = this.f5175j.p();
            return cVar2;
        }
        if (c0Var != null || ((aVar = this.b) != null && aVar.b())) {
            z3 = false;
        } else {
            this.b = this.f5173h.e();
            z3 = true;
        }
        synchronized (this.f5169d) {
            if (!this.f5178m) {
                if (z3) {
                    List<c0> a2 = this.b.a();
                    int size = a2.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size) {
                            break;
                        }
                        c0 c0Var2 = a2.get(i6);
                        p.e0.a.a.h(this.f5169d, this.a, this, c0Var2);
                        c cVar4 = this.f5175j;
                        if (cVar4 != null) {
                            this.c = c0Var2;
                            cVar2 = cVar4;
                            z2 = true;
                            break;
                        }
                        i6++;
                    }
                }
                if (!z2) {
                    if (c0Var == null) {
                        c0Var = this.b.c();
                    }
                    this.c = c0Var;
                    this.f5174i = 0;
                    cVar2 = new c(this.f5169d, c0Var);
                    a(cVar2, false);
                }
            } else {
                throw new IOException("Canceled");
            }
        }
        if (z2) {
            this.f5171f.g(this.f5170e, cVar2);
            return cVar2;
        }
        cVar2.d(i2, i3, i4, i5, z, this.f5170e, this.f5171f);
        p().a(cVar2.p());
        synchronized (this.f5169d) {
            this.f5176k = true;
            p.e0.a.a.i(this.f5169d, cVar2);
            if (cVar2.n()) {
                socket = p.e0.a.a.f(this.f5169d, this.a, this);
                cVar2 = this.f5175j;
            }
        }
        p.e0.c.f(socket);
        this.f5171f.g(this.f5170e, cVar2);
        return cVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r0.m(r9) != false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p.e0.f.c g(int r4, int r5, int r6, int r7, boolean r8, boolean r9) {
        /*
            r3 = this;
        L_0x0000:
            p.e0.f.c r0 = r3.f(r4, r5, r6, r7, r8)
            p.j r1 = r3.f5169d
            monitor-enter(r1)
            int r2 = r0.f5158l     // Catch:{ all -> 0x001f }
            if (r2 != 0) goto L_0x0013
            boolean r2 = r0.n()     // Catch:{ all -> 0x001f }
            if (r2 != 0) goto L_0x0013
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            return r0
        L_0x0013:
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            boolean r1 = r0.m(r9)
            if (r1 != 0) goto L_0x001e
            r3.j()
            goto L_0x0000
        L_0x001e:
            return r0
        L_0x001f:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e0.f.g.g(int, int, int, int, boolean, boolean):p.e0.f.c");
    }

    private void l(c cVar) {
        int size = cVar.f5160n.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (cVar.f5160n.get(i2).get() == this) {
                cVar.f5160n.remove(i2);
                return;
            }
        }
        throw new IllegalStateException();
    }

    private Socket n() {
        c cVar = this.f5175j;
        if (cVar == null || !cVar.f5157k) {
            return null;
        }
        return e(false, false, true);
    }

    private d p() {
        return p.e0.a.a.j(this.f5169d);
    }

    public void a(c cVar, boolean z) {
        if (this.f5175j == null) {
            this.f5175j = cVar;
            this.f5176k = z;
            cVar.f5160n.add(new a(this, this.f5172g));
            return;
        }
        throw new IllegalStateException();
    }

    public void b() {
        c cVar;
        c cVar2;
        synchronized (this.f5169d) {
            this.f5178m = true;
            cVar = this.f5179n;
            cVar2 = this.f5175j;
        }
        if (cVar != null) {
            cVar.cancel();
        } else if (cVar2 != null) {
            cVar2.c();
        }
    }

    public c c() {
        c cVar;
        synchronized (this.f5169d) {
            cVar = this.f5179n;
        }
        return cVar;
    }

    public synchronized c d() {
        return this.f5175j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean h() {
        /*
            r1 = this;
            p.c0 r0 = r1.c
            if (r0 != 0) goto L_0x0019
            p.e0.f.f$a r0 = r1.b
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x0019
        L_0x000e:
            p.e0.f.f r0 = r1.f5173h
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = 0
            goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e0.f.g.h():boolean");
    }

    public c i(v vVar, t.a aVar, boolean z) {
        try {
            c o2 = g(aVar.a(), aVar.b(), aVar.c(), vVar.w(), vVar.C(), z).o(vVar, aVar, this);
            synchronized (this.f5169d) {
                this.f5179n = o2;
            }
            return o2;
        } catch (IOException e2) {
            throw new e(e2);
        }
    }

    public void j() {
        c cVar;
        Socket e2;
        synchronized (this.f5169d) {
            cVar = this.f5175j;
            e2 = e(true, false, false);
            if (this.f5175j != null) {
                cVar = null;
            }
        }
        p.e0.c.f(e2);
        if (cVar != null) {
            this.f5171f.h(this.f5170e, cVar);
        }
    }

    public void k() {
        c cVar;
        Socket e2;
        synchronized (this.f5169d) {
            cVar = this.f5175j;
            e2 = e(false, true, false);
            if (this.f5175j != null) {
                cVar = null;
            }
        }
        p.e0.c.f(e2);
        if (cVar != null) {
            p.e0.a.a.k(this.f5170e, (IOException) null);
            this.f5171f.h(this.f5170e, cVar);
            this.f5171f.a(this.f5170e);
        }
    }

    public Socket m(c cVar) {
        if (this.f5179n == null && this.f5175j.f5160n.size() == 1) {
            Socket e2 = e(true, false, false);
            this.f5175j = cVar;
            cVar.f5160n.add(this.f5175j.f5160n.get(0));
            return e2;
        }
        throw new IllegalStateException();
    }

    public c0 o() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r7 != p.e0.i.b.f5218k) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q(java.io.IOException r7) {
        /*
            r6 = this;
            p.j r0 = r6.f5169d
            monitor-enter(r0)
            boolean r1 = r7 instanceof p.e0.i.n     // Catch:{ all -> 0x0062 }
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0021
            p.e0.i.n r7 = (p.e0.i.n) r7     // Catch:{ all -> 0x0062 }
            p.e0.i.b r7 = r7.f5345e     // Catch:{ all -> 0x0062 }
            p.e0.i.b r1 = p.e0.i.b.REFUSED_STREAM     // Catch:{ all -> 0x0062 }
            if (r7 != r1) goto L_0x001a
            int r7 = r6.f5174i     // Catch:{ all -> 0x0062 }
            int r7 = r7 + r4
            r6.f5174i = r7     // Catch:{ all -> 0x0062 }
            if (r7 <= r4) goto L_0x0043
            goto L_0x001e
        L_0x001a:
            p.e0.i.b r1 = p.e0.i.b.CANCEL     // Catch:{ all -> 0x0062 }
            if (r7 == r1) goto L_0x0043
        L_0x001e:
            r6.c = r3     // Catch:{ all -> 0x0062 }
            goto L_0x0041
        L_0x0021:
            p.e0.f.c r1 = r6.f5175j     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x0043
            boolean r1 = r1.n()     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x002f
            boolean r1 = r7 instanceof p.e0.i.a     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x0043
        L_0x002f:
            p.e0.f.c r1 = r6.f5175j     // Catch:{ all -> 0x0062 }
            int r1 = r1.f5158l     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x0041
            p.c0 r1 = r6.c     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x001e
            if (r7 == 0) goto L_0x001e
            p.e0.f.f r5 = r6.f5173h     // Catch:{ all -> 0x0062 }
            r5.a(r1, r7)     // Catch:{ all -> 0x0062 }
            goto L_0x001e
        L_0x0041:
            r7 = 1
            goto L_0x0044
        L_0x0043:
            r7 = 0
        L_0x0044:
            p.e0.f.c r1 = r6.f5175j     // Catch:{ all -> 0x0062 }
            java.net.Socket r7 = r6.e(r7, r2, r4)     // Catch:{ all -> 0x0062 }
            p.e0.f.c r2 = r6.f5175j     // Catch:{ all -> 0x0062 }
            if (r2 != 0) goto L_0x0054
            boolean r2 = r6.f5176k     // Catch:{ all -> 0x0062 }
            if (r2 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r3 = r1
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            p.e0.c.f(r7)
            if (r3 == 0) goto L_0x0061
            p.p r7 = r6.f5171f
            p.e r0 = r6.f5170e
            r7.h(r0, r3)
        L_0x0061:
            return
        L_0x0062:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e0.f.g.q(java.io.IOException):void");
    }

    public void r(boolean z, c cVar, long j2, IOException iOException) {
        c cVar2;
        Socket e2;
        boolean z2;
        this.f5171f.p(this.f5170e, j2);
        synchronized (this.f5169d) {
            if (cVar != null) {
                if (cVar == this.f5179n) {
                    if (!z) {
                        this.f5175j.f5158l++;
                    }
                    cVar2 = this.f5175j;
                    e2 = e(z, false, true);
                    if (this.f5175j != null) {
                        cVar2 = null;
                    }
                    z2 = this.f5177l;
                }
            }
            throw new IllegalStateException("expected " + this.f5179n + " but was " + cVar);
        }
        p.e0.c.f(e2);
        if (cVar2 != null) {
            this.f5171f.h(this.f5170e, cVar2);
        }
        if (iOException != null) {
            this.f5171f.b(this.f5170e, p.e0.a.a.k(this.f5170e, iOException));
        } else if (z2) {
            p.e0.a.a.k(this.f5170e, (IOException) null);
            this.f5171f.a(this.f5170e);
        }
    }

    public String toString() {
        c d2 = d();
        return d2 != null ? d2.toString() : this.a.toString();
    }
}
