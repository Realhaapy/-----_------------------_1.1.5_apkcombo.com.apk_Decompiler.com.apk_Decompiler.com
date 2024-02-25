package p.e0.i;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import p.e0.i.c;
import p.r;
import q.e;
import q.s;
import q.t;

public final class i {
    long a = 0;
    long b;
    final int c;

    /* renamed from: d  reason: collision with root package name */
    final g f5317d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Deque<r> f5318e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public c.a f5319f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5320g;

    /* renamed from: h  reason: collision with root package name */
    private final b f5321h;

    /* renamed from: i  reason: collision with root package name */
    final a f5322i;

    /* renamed from: j  reason: collision with root package name */
    final c f5323j;

    /* renamed from: k  reason: collision with root package name */
    final c f5324k;

    /* renamed from: l  reason: collision with root package name */
    b f5325l;

    final class a implements q.r {

        /* renamed from: e  reason: collision with root package name */
        private final q.c f5326e = new q.c();

        /* renamed from: f  reason: collision with root package name */
        boolean f5327f;

        /* renamed from: g  reason: collision with root package name */
        boolean f5328g;

        a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r1.f5324k.u();
            r11.f5329h.e();
            r9 = java.lang.Math.min(r11.f5329h.b, r11.f5326e.X());
            r1 = r11.f5329h;
            r1.b -= r9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void a(boolean r12) {
            /*
                r11 = this;
                p.e0.i.i r0 = p.e0.i.i.this
                monitor-enter(r0)
                p.e0.i.i r1 = p.e0.i.i.this     // Catch:{ all -> 0x007f }
                p.e0.i.i$c r1 = r1.f5324k     // Catch:{ all -> 0x007f }
                r1.k()     // Catch:{ all -> 0x007f }
            L_0x000a:
                p.e0.i.i r1 = p.e0.i.i.this     // Catch:{ all -> 0x0076 }
                long r2 = r1.b     // Catch:{ all -> 0x0076 }
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 > 0) goto L_0x0024
                boolean r2 = r11.f5328g     // Catch:{ all -> 0x0076 }
                if (r2 != 0) goto L_0x0024
                boolean r2 = r11.f5327f     // Catch:{ all -> 0x0076 }
                if (r2 != 0) goto L_0x0024
                p.e0.i.b r2 = r1.f5325l     // Catch:{ all -> 0x0076 }
                if (r2 != 0) goto L_0x0024
                r1.t()     // Catch:{ all -> 0x0076 }
                goto L_0x000a
            L_0x0024:
                p.e0.i.i$c r1 = r1.f5324k     // Catch:{ all -> 0x007f }
                r1.u()     // Catch:{ all -> 0x007f }
                p.e0.i.i r1 = p.e0.i.i.this     // Catch:{ all -> 0x007f }
                r1.e()     // Catch:{ all -> 0x007f }
                p.e0.i.i r1 = p.e0.i.i.this     // Catch:{ all -> 0x007f }
                long r1 = r1.b     // Catch:{ all -> 0x007f }
                q.c r3 = r11.f5326e     // Catch:{ all -> 0x007f }
                long r3 = r3.X()     // Catch:{ all -> 0x007f }
                long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x007f }
                p.e0.i.i r1 = p.e0.i.i.this     // Catch:{ all -> 0x007f }
                long r2 = r1.b     // Catch:{ all -> 0x007f }
                long r2 = r2 - r9
                r1.b = r2     // Catch:{ all -> 0x007f }
                monitor-exit(r0)     // Catch:{ all -> 0x007f }
                p.e0.i.i$c r0 = r1.f5324k
                r0.k()
                p.e0.i.i r0 = p.e0.i.i.this     // Catch:{ all -> 0x006d }
                p.e0.i.g r5 = r0.f5317d     // Catch:{ all -> 0x006d }
                int r6 = r0.c     // Catch:{ all -> 0x006d }
                if (r12 == 0) goto L_0x005e
                q.c r12 = r11.f5326e     // Catch:{ all -> 0x006d }
                long r0 = r12.X()     // Catch:{ all -> 0x006d }
                int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r12 != 0) goto L_0x005e
                r12 = 1
                r7 = 1
                goto L_0x0060
            L_0x005e:
                r12 = 0
                r7 = 0
            L_0x0060:
                q.c r8 = r11.f5326e     // Catch:{ all -> 0x006d }
                r5.k0(r6, r7, r8, r9)     // Catch:{ all -> 0x006d }
                p.e0.i.i r12 = p.e0.i.i.this
                p.e0.i.i$c r12 = r12.f5324k
                r12.u()
                return
            L_0x006d:
                r12 = move-exception
                p.e0.i.i r0 = p.e0.i.i.this
                p.e0.i.i$c r0 = r0.f5324k
                r0.u()
                throw r12
            L_0x0076:
                r12 = move-exception
                p.e0.i.i r1 = p.e0.i.i.this     // Catch:{ all -> 0x007f }
                p.e0.i.i$c r1 = r1.f5324k     // Catch:{ all -> 0x007f }
                r1.u()     // Catch:{ all -> 0x007f }
                throw r12     // Catch:{ all -> 0x007f }
            L_0x007f:
                r12 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x007f }
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: p.e0.i.i.a.a(boolean):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
            if (r8.f5326e.X() <= 0) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r8.f5326e.X() <= 0) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            r0 = r8.f5329h;
            r0.f5317d.k0(r0.c, true, (q.c) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
            r2 = r8.f5329h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r8.f5327f = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
            r8.f5329h.f5317d.flush();
            r8.f5329h.d();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.f5329h.f5322i.f5328g != false) goto L_0x003a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r8 = this;
                p.e0.i.i r0 = p.e0.i.i.this
                monitor-enter(r0)
                boolean r1 = r8.f5327f     // Catch:{ all -> 0x0050 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                p.e0.i.i r0 = p.e0.i.i.this
                p.e0.i.i$a r0 = r0.f5322i
                boolean r0 = r0.f5328g
                r1 = 1
                if (r0 != 0) goto L_0x003a
                q.c r0 = r8.f5326e
                long r2 = r0.X()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x002d
            L_0x001f:
                q.c r0 = r8.f5326e
                long r2 = r0.X()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x003a
                r8.a(r1)
                goto L_0x001f
            L_0x002d:
                p.e0.i.i r0 = p.e0.i.i.this
                p.e0.i.g r2 = r0.f5317d
                int r3 = r0.c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.k0(r3, r4, r5, r6)
            L_0x003a:
                p.e0.i.i r2 = p.e0.i.i.this
                monitor-enter(r2)
                r8.f5327f = r1     // Catch:{ all -> 0x004d }
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                p.e0.i.i r0 = p.e0.i.i.this
                p.e0.i.g r0 = r0.f5317d
                r0.flush()
                p.e0.i.i r0 = p.e0.i.i.this
                r0.d()
                return
            L_0x004d:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                throw r0
            L_0x0050:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p.e0.i.i.a.close():void");
        }

        public t d() {
            return i.this.f5324k;
        }

        public void flush() {
            synchronized (i.this) {
                i.this.e();
            }
            while (this.f5326e.X() > 0) {
                a(false);
                i.this.f5317d.flush();
            }
        }

        public void h(q.c cVar, long j2) {
            this.f5326e.h(cVar, j2);
            while (this.f5326e.X() >= 16384) {
                a(false);
            }
        }
    }

    private final class b implements s {

        /* renamed from: e  reason: collision with root package name */
        private final q.c f5330e = new q.c();

        /* renamed from: f  reason: collision with root package name */
        private final q.c f5331f = new q.c();

        /* renamed from: g  reason: collision with root package name */
        private final long f5332g;

        /* renamed from: h  reason: collision with root package name */
        boolean f5333h;

        /* renamed from: i  reason: collision with root package name */
        boolean f5334i;

        b(long j2) {
            this.f5332g = j2;
        }

        private void c(long j2) {
            i.this.f5317d.j0(j2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: p.r} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long F(q.c r17, long r18) {
            /*
                r16 = this;
                r1 = r16
                r2 = r18
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 < 0) goto L_0x00e0
            L_0x000a:
                p.e0.i.i r6 = p.e0.i.i.this
                monitor-enter(r6)
                p.e0.i.i r0 = p.e0.i.i.this     // Catch:{ all -> 0x00dd }
                p.e0.i.i$c r0 = r0.f5323j     // Catch:{ all -> 0x00dd }
                r0.k()     // Catch:{ all -> 0x00dd }
                p.e0.i.i r0 = p.e0.i.i.this     // Catch:{ all -> 0x00d4 }
                p.e0.i.b r7 = r0.f5325l     // Catch:{ all -> 0x00d4 }
                if (r7 == 0) goto L_0x001b
                goto L_0x001c
            L_0x001b:
                r7 = 0
            L_0x001c:
                boolean r9 = r1.f5333h     // Catch:{ all -> 0x00d4 }
                if (r9 != 0) goto L_0x00cc
                java.util.Deque r0 = r0.f5318e     // Catch:{ all -> 0x00d4 }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00d4 }
                if (r0 != 0) goto L_0x0049
                p.e0.i.i r0 = p.e0.i.i.this     // Catch:{ all -> 0x00d4 }
                p.e0.i.c$a r0 = r0.f5319f     // Catch:{ all -> 0x00d4 }
                if (r0 == 0) goto L_0x0049
                p.e0.i.i r0 = p.e0.i.i.this     // Catch:{ all -> 0x00d4 }
                java.util.Deque r0 = r0.f5318e     // Catch:{ all -> 0x00d4 }
                java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x00d4 }
                r8 = r0
                p.r r8 = (p.r) r8     // Catch:{ all -> 0x00d4 }
                p.e0.i.i r0 = p.e0.i.i.this     // Catch:{ all -> 0x00d4 }
                p.e0.i.c$a r0 = r0.f5319f     // Catch:{ all -> 0x00d4 }
                r13 = r17
                r10 = r0
                goto L_0x00a6
            L_0x0049:
                q.c r0 = r1.f5331f     // Catch:{ all -> 0x00d4 }
                long r11 = r0.X()     // Catch:{ all -> 0x00d4 }
                int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x008d
                q.c r0 = r1.f5331f     // Catch:{ all -> 0x00d4 }
                long r11 = r0.X()     // Catch:{ all -> 0x00d4 }
                long r11 = java.lang.Math.min(r2, r11)     // Catch:{ all -> 0x00d4 }
                r13 = r17
                long r11 = r0.F(r13, r11)     // Catch:{ all -> 0x00d4 }
                p.e0.i.i r0 = p.e0.i.i.this     // Catch:{ all -> 0x00d4 }
                long r14 = r0.a     // Catch:{ all -> 0x00d4 }
                long r14 = r14 + r11
                r0.a = r14     // Catch:{ all -> 0x00d4 }
                if (r7 != 0) goto L_0x008a
                p.e0.i.g r0 = r0.f5317d     // Catch:{ all -> 0x00d4 }
                p.e0.i.m r0 = r0.w     // Catch:{ all -> 0x00d4 }
                int r0 = r0.d()     // Catch:{ all -> 0x00d4 }
                int r0 = r0 / 2
                long r8 = (long) r0     // Catch:{ all -> 0x00d4 }
                int r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
                if (r0 < 0) goto L_0x008a
                p.e0.i.i r0 = p.e0.i.i.this     // Catch:{ all -> 0x00d4 }
                p.e0.i.g r8 = r0.f5317d     // Catch:{ all -> 0x00d4 }
                int r9 = r0.c     // Catch:{ all -> 0x00d4 }
                long r14 = r0.a     // Catch:{ all -> 0x00d4 }
                r8.o0(r9, r14)     // Catch:{ all -> 0x00d4 }
                p.e0.i.i r0 = p.e0.i.i.this     // Catch:{ all -> 0x00d4 }
                r0.a = r4     // Catch:{ all -> 0x00d4 }
            L_0x008a:
                r8 = 0
                r10 = 0
                goto L_0x00a8
            L_0x008d:
                r13 = r17
                boolean r0 = r1.f5334i     // Catch:{ all -> 0x00d4 }
                if (r0 != 0) goto L_0x00a4
                if (r7 != 0) goto L_0x00a4
                p.e0.i.i r0 = p.e0.i.i.this     // Catch:{ all -> 0x00d4 }
                r0.t()     // Catch:{ all -> 0x00d4 }
                p.e0.i.i r0 = p.e0.i.i.this     // Catch:{ all -> 0x00dd }
                p.e0.i.i$c r0 = r0.f5323j     // Catch:{ all -> 0x00dd }
                r0.u()     // Catch:{ all -> 0x00dd }
                monitor-exit(r6)     // Catch:{ all -> 0x00dd }
                goto L_0x000a
            L_0x00a4:
                r8 = 0
                r10 = 0
            L_0x00a6:
                r11 = -1
            L_0x00a8:
                p.e0.i.i r0 = p.e0.i.i.this     // Catch:{ all -> 0x00dd }
                p.e0.i.i$c r0 = r0.f5323j     // Catch:{ all -> 0x00dd }
                r0.u()     // Catch:{ all -> 0x00dd }
                monitor-exit(r6)     // Catch:{ all -> 0x00dd }
                if (r8 == 0) goto L_0x00b9
                if (r10 == 0) goto L_0x00b9
                r10.a(r8)
                goto L_0x000a
            L_0x00b9:
                r2 = -1
                int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r0 == 0) goto L_0x00c3
                r1.c(r11)
                return r11
            L_0x00c3:
                if (r7 != 0) goto L_0x00c6
                return r2
            L_0x00c6:
                p.e0.i.n r0 = new p.e0.i.n
                r0.<init>(r7)
                throw r0
            L_0x00cc:
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00d4 }
                java.lang.String r2 = "stream closed"
                r0.<init>(r2)     // Catch:{ all -> 0x00d4 }
                throw r0     // Catch:{ all -> 0x00d4 }
            L_0x00d4:
                r0 = move-exception
                p.e0.i.i r2 = p.e0.i.i.this     // Catch:{ all -> 0x00dd }
                p.e0.i.i$c r2 = r2.f5323j     // Catch:{ all -> 0x00dd }
                r2.u()     // Catch:{ all -> 0x00dd }
                throw r0     // Catch:{ all -> 0x00dd }
            L_0x00dd:
                r0 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x00dd }
                throw r0
            L_0x00e0:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "byteCount < 0: "
                r4.append(r5)
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                r0.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p.e0.i.i.b.F(q.c, long):long");
        }

        /* access modifiers changed from: package-private */
        public void a(e eVar, long j2) {
            boolean z;
            boolean z2;
            boolean z3;
            long j3;
            while (j2 > 0) {
                synchronized (i.this) {
                    z = this.f5334i;
                    z2 = true;
                    z3 = this.f5331f.X() + j2 > this.f5332g;
                }
                if (z3) {
                    eVar.skip(j2);
                    i.this.h(b.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    eVar.skip(j2);
                    return;
                } else {
                    long F = eVar.F(this.f5330e, j2);
                    if (F != -1) {
                        j2 -= F;
                        synchronized (i.this) {
                            if (this.f5333h) {
                                j3 = this.f5330e.X();
                                this.f5330e.v();
                            } else {
                                if (this.f5331f.X() != 0) {
                                    z2 = false;
                                }
                                this.f5331f.e0(this.f5330e);
                                if (z2) {
                                    i.this.notifyAll();
                                }
                                j3 = 0;
                            }
                        }
                        if (j3 > 0) {
                            c(j3);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        public void close() {
            long X;
            c.a aVar;
            ArrayList<r> arrayList;
            synchronized (i.this) {
                this.f5333h = true;
                X = this.f5331f.X();
                this.f5331f.v();
                aVar = null;
                if (i.this.f5318e.isEmpty() || i.this.f5319f == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(i.this.f5318e);
                    i.this.f5318e.clear();
                    ArrayList arrayList3 = arrayList2;
                    aVar = i.this.f5319f;
                    arrayList = arrayList3;
                }
                i.this.notifyAll();
            }
            if (X > 0) {
                c(X);
            }
            i.this.d();
            if (aVar != null) {
                for (r a : arrayList) {
                    aVar.a(a);
                }
            }
        }

        public t d() {
            return i.this.f5323j;
        }
    }

    class c extends q.a {
        c() {
        }

        /* access modifiers changed from: protected */
        public IOException o(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        public void t() {
            i.this.h(b.CANCEL);
            i.this.f5317d.f0();
        }

        public void u() {
            if (n()) {
                throw o((IOException) null);
            }
        }
    }

    i(int i2, g gVar, boolean z, boolean z2, r rVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f5318e = arrayDeque;
        this.f5323j = new c();
        this.f5324k = new c();
        this.f5325l = null;
        Objects.requireNonNull(gVar, "connection == null");
        this.c = i2;
        this.f5317d = gVar;
        this.b = (long) gVar.x.d();
        b bVar = new b((long) gVar.w.d());
        this.f5321h = bVar;
        a aVar = new a();
        this.f5322i = aVar;
        bVar.f5334i = z2;
        aVar.f5328g = z;
        if (rVar != null) {
            arrayDeque.add(rVar);
        }
        if (l() && rVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        } else if (!l() && rVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    private boolean g(b bVar) {
        synchronized (this) {
            if (this.f5325l != null) {
                return false;
            }
            if (this.f5321h.f5334i && this.f5322i.f5328g) {
                return false;
            }
            this.f5325l = bVar;
            notifyAll();
            this.f5317d.e0(this.c);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void c(long j2) {
        this.b += j2;
        if (j2 > 0) {
            notifyAll();
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        boolean z;
        boolean m2;
        synchronized (this) {
            b bVar = this.f5321h;
            if (!bVar.f5334i && bVar.f5333h) {
                a aVar = this.f5322i;
                if (aVar.f5328g || aVar.f5327f) {
                    z = true;
                    m2 = m();
                }
            }
            z = false;
            m2 = m();
        }
        if (z) {
            f(b.CANCEL);
        } else if (!m2) {
            this.f5317d.e0(this.c);
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        a aVar = this.f5322i;
        if (aVar.f5327f) {
            throw new IOException("stream closed");
        } else if (aVar.f5328g) {
            throw new IOException("stream finished");
        } else if (this.f5325l != null) {
            throw new n(this.f5325l);
        }
    }

    public void f(b bVar) {
        if (g(bVar)) {
            this.f5317d.m0(this.c, bVar);
        }
    }

    public void h(b bVar) {
        if (g(bVar)) {
            this.f5317d.n0(this.c, bVar);
        }
    }

    public int i() {
        return this.c;
    }

    public q.r j() {
        synchronized (this) {
            if (!this.f5320g) {
                if (!l()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f5322i;
    }

    public s k() {
        return this.f5321h;
    }

    public boolean l() {
        return this.f5317d.f5251e == ((this.c & 1) == 1);
    }

    public synchronized boolean m() {
        if (this.f5325l != null) {
            return false;
        }
        b bVar = this.f5321h;
        if (bVar.f5334i || bVar.f5333h) {
            a aVar = this.f5322i;
            if ((aVar.f5328g || aVar.f5327f) && this.f5320g) {
                return false;
            }
        }
        return true;
    }

    public t n() {
        return this.f5323j;
    }

    /* access modifiers changed from: package-private */
    public void o(e eVar, int i2) {
        this.f5321h.a(eVar, (long) i2);
    }

    /* access modifiers changed from: package-private */
    public void p() {
        boolean m2;
        synchronized (this) {
            this.f5321h.f5334i = true;
            m2 = m();
            notifyAll();
        }
        if (!m2) {
            this.f5317d.e0(this.c);
        }
    }

    /* access modifiers changed from: package-private */
    public void q(List<c> list) {
        boolean m2;
        synchronized (this) {
            this.f5320g = true;
            this.f5318e.add(p.e0.c.F(list));
            m2 = m();
            notifyAll();
        }
        if (!m2) {
            this.f5317d.e0(this.c);
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void r(b bVar) {
        if (this.f5325l == null) {
            this.f5325l = bVar;
            notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        r2.f5323j.u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p.r s() {
        /*
            r2 = this;
            monitor-enter(r2)
            p.e0.i.i$c r0 = r2.f5323j     // Catch:{ all -> 0x003c }
            r0.k()     // Catch:{ all -> 0x003c }
        L_0x0006:
            java.util.Deque<p.r> r0 = r2.f5318e     // Catch:{ all -> 0x0035 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0016
            p.e0.i.b r0 = r2.f5325l     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0016
            r2.t()     // Catch:{ all -> 0x0035 }
            goto L_0x0006
        L_0x0016:
            p.e0.i.i$c r0 = r2.f5323j     // Catch:{ all -> 0x003c }
            r0.u()     // Catch:{ all -> 0x003c }
            java.util.Deque<p.r> r0 = r2.f5318e     // Catch:{ all -> 0x003c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x002d
            java.util.Deque<p.r> r0 = r2.f5318e     // Catch:{ all -> 0x003c }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x003c }
            p.r r0 = (p.r) r0     // Catch:{ all -> 0x003c }
            monitor-exit(r2)
            return r0
        L_0x002d:
            p.e0.i.n r0 = new p.e0.i.n     // Catch:{ all -> 0x003c }
            p.e0.i.b r1 = r2.f5325l     // Catch:{ all -> 0x003c }
            r0.<init>(r1)     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x0035:
            r0 = move-exception
            p.e0.i.i$c r1 = r2.f5323j     // Catch:{ all -> 0x003c }
            r1.u()     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e0.i.i.s():p.r");
    }

    /* access modifiers changed from: package-private */
    public void t() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public t u() {
        return this.f5324k;
    }
}
