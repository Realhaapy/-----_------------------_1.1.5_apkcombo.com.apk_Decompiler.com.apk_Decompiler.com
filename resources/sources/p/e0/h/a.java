package p.e0.h;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p.a0;
import p.b0;
import p.e0.g.h;
import p.e0.g.k;
import p.r;
import p.v;
import p.y;
import q.i;
import q.l;
import q.r;
import q.s;
import q.t;

public final class a implements p.e0.g.c {
    final v a;
    final p.e0.f.g b;
    final q.e c;

    /* renamed from: d  reason: collision with root package name */
    final q.d f5193d;

    /* renamed from: e  reason: collision with root package name */
    int f5194e = 0;

    /* renamed from: f  reason: collision with root package name */
    private long f5195f = 262144;

    private abstract class b implements s {

        /* renamed from: e  reason: collision with root package name */
        protected final i f5196e;

        /* renamed from: f  reason: collision with root package name */
        protected boolean f5197f;

        /* renamed from: g  reason: collision with root package name */
        protected long f5198g;

        private b() {
            this.f5196e = new i(a.this.c.d());
            this.f5198g = 0;
        }

        public long F(q.c cVar, long j2) {
            try {
                long F = a.this.c.F(cVar, j2);
                if (F > 0) {
                    this.f5198g += F;
                }
                return F;
            } catch (IOException e2) {
                a(false, e2);
                throw e2;
            }
        }

        /* access modifiers changed from: protected */
        public final void a(boolean z, IOException iOException) {
            a aVar = a.this;
            int i2 = aVar.f5194e;
            if (i2 != 6) {
                if (i2 == 5) {
                    aVar.g(this.f5196e);
                    a aVar2 = a.this;
                    aVar2.f5194e = 6;
                    p.e0.f.g gVar = aVar2.b;
                    if (gVar != null) {
                        gVar.r(!z, aVar2, this.f5198g, iOException);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("state: " + a.this.f5194e);
            }
        }

        public t d() {
            return this.f5196e;
        }
    }

    private final class c implements r {

        /* renamed from: e  reason: collision with root package name */
        private final i f5200e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f5201f;

        c() {
            this.f5200e = new i(a.this.f5193d.d());
        }

        public synchronized void close() {
            if (!this.f5201f) {
                this.f5201f = true;
                a.this.f5193d.N("0\r\n\r\n");
                a.this.g(this.f5200e);
                a.this.f5194e = 3;
            }
        }

        public t d() {
            return this.f5200e;
        }

        public synchronized void flush() {
            if (!this.f5201f) {
                a.this.f5193d.flush();
            }
        }

        public void h(q.c cVar, long j2) {
            if (this.f5201f) {
                throw new IllegalStateException("closed");
            } else if (j2 != 0) {
                a.this.f5193d.j(j2);
                a.this.f5193d.N("\r\n");
                a.this.f5193d.h(cVar, j2);
                a.this.f5193d.N("\r\n");
            }
        }
    }

    private class d extends b {

        /* renamed from: i  reason: collision with root package name */
        private final p.s f5203i;

        /* renamed from: j  reason: collision with root package name */
        private long f5204j = -1;

        /* renamed from: k  reason: collision with root package name */
        private boolean f5205k = true;

        d(p.s sVar) {
            super();
            this.f5203i = sVar;
        }

        private void c() {
            if (this.f5204j != -1) {
                a.this.c.p();
            }
            try {
                this.f5204j = a.this.c.R();
                String trim = a.this.c.p().trim();
                if (this.f5204j < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f5204j + trim + "\"");
                } else if (this.f5204j == 0) {
                    this.f5205k = false;
                    p.e0.g.e.e(a.this.a.j(), this.f5203i, a.this.n());
                    a(true, (IOException) null);
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }

        public long F(q.c cVar, long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            } else if (this.f5197f) {
                throw new IllegalStateException("closed");
            } else if (!this.f5205k) {
                return -1;
            } else {
                long j3 = this.f5204j;
                if (j3 == 0 || j3 == -1) {
                    c();
                    if (!this.f5205k) {
                        return -1;
                    }
                }
                long F = super.F(cVar, Math.min(j2, this.f5204j));
                if (F != -1) {
                    this.f5204j -= F;
                    return F;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(false, protocolException);
                throw protocolException;
            }
        }

        public void close() {
            if (!this.f5197f) {
                if (this.f5205k && !p.e0.c.n(this, 100, TimeUnit.MILLISECONDS)) {
                    a(false, (IOException) null);
                }
                this.f5197f = true;
            }
        }
    }

    private final class e implements r {

        /* renamed from: e  reason: collision with root package name */
        private final i f5207e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f5208f;

        /* renamed from: g  reason: collision with root package name */
        private long f5209g;

        e(long j2) {
            this.f5207e = new i(a.this.f5193d.d());
            this.f5209g = j2;
        }

        public void close() {
            if (!this.f5208f) {
                this.f5208f = true;
                if (this.f5209g <= 0) {
                    a.this.g(this.f5207e);
                    a.this.f5194e = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public t d() {
            return this.f5207e;
        }

        public void flush() {
            if (!this.f5208f) {
                a.this.f5193d.flush();
            }
        }

        public void h(q.c cVar, long j2) {
            if (!this.f5208f) {
                p.e0.c.d(cVar.X(), 0, j2);
                if (j2 <= this.f5209g) {
                    a.this.f5193d.h(cVar, j2);
                    this.f5209g -= j2;
                    return;
                }
                throw new ProtocolException("expected " + this.f5209g + " bytes but received " + j2);
            }
            throw new IllegalStateException("closed");
        }
    }

    private class f extends b {

        /* renamed from: i  reason: collision with root package name */
        private long f5211i;

        f(a aVar, long j2) {
            super();
            this.f5211i = j2;
            if (j2 == 0) {
                a(true, (IOException) null);
            }
        }

        public long F(q.c cVar, long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            } else if (!this.f5197f) {
                long j3 = this.f5211i;
                if (j3 == 0) {
                    return -1;
                }
                long F = super.F(cVar, Math.min(j3, j2));
                if (F != -1) {
                    long j4 = this.f5211i - F;
                    this.f5211i = j4;
                    if (j4 == 0) {
                        a(true, (IOException) null);
                    }
                    return F;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(false, protocolException);
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() {
            if (!this.f5197f) {
                if (this.f5211i != 0 && !p.e0.c.n(this, 100, TimeUnit.MILLISECONDS)) {
                    a(false, (IOException) null);
                }
                this.f5197f = true;
            }
        }
    }

    private class g extends b {

        /* renamed from: i  reason: collision with root package name */
        private boolean f5212i;

        g(a aVar) {
            super();
        }

        public long F(q.c cVar, long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            } else if (this.f5197f) {
                throw new IllegalStateException("closed");
            } else if (this.f5212i) {
                return -1;
            } else {
                long F = super.F(cVar, j2);
                if (F != -1) {
                    return F;
                }
                this.f5212i = true;
                a(true, (IOException) null);
                return -1;
            }
        }

        public void close() {
            if (!this.f5197f) {
                if (!this.f5212i) {
                    a(false, (IOException) null);
                }
                this.f5197f = true;
            }
        }
    }

    public a(v vVar, p.e0.f.g gVar, q.e eVar, q.d dVar) {
        this.a = vVar;
        this.b = gVar;
        this.c = eVar;
        this.f5193d = dVar;
    }

    private String m() {
        String G = this.c.G(this.f5195f);
        this.f5195f -= (long) G.length();
        return G;
    }

    public void a() {
        this.f5193d.flush();
    }

    public void b(y yVar) {
        o(yVar.d(), p.e0.g.i.a(yVar, this.b.d().p().b().type()));
    }

    public b0 c(a0 a0Var) {
        p.e0.f.g gVar = this.b;
        gVar.f5171f.q(gVar.f5170e);
        String v = a0Var.v("Content-Type");
        if (!p.e0.g.e.c(a0Var)) {
            return new h(v, 0, l.b(k(0)));
        }
        if ("chunked".equalsIgnoreCase(a0Var.v("Transfer-Encoding"))) {
            return new h(v, -1, l.b(i(a0Var.O().h())));
        }
        long b2 = p.e0.g.e.b(a0Var);
        return b2 != -1 ? new h(v, b2, l.b(k(b2))) : new h(v, -1, l.b(l()));
    }

    public void cancel() {
        p.e0.f.c d2 = this.b.d();
        if (d2 != null) {
            d2.c();
        }
    }

    public void d() {
        this.f5193d.flush();
    }

    public r e(y yVar, long j2) {
        if ("chunked".equalsIgnoreCase(yVar.c("Transfer-Encoding"))) {
            return h();
        }
        if (j2 != -1) {
            return j(j2);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public a0.a f(boolean z) {
        int i2 = this.f5194e;
        if (i2 == 1 || i2 == 3) {
            try {
                k a2 = k.a(m());
                a0.a aVar = new a0.a();
                aVar.n(a2.a);
                aVar.g(a2.b);
                aVar.k(a2.c);
                aVar.j(n());
                if (z && a2.b == 100) {
                    return null;
                }
                if (a2.b == 100) {
                    this.f5194e = 3;
                    return aVar;
                }
                this.f5194e = 4;
                return aVar;
            } catch (EOFException e2) {
                IOException iOException = new IOException("unexpected end of stream on " + this.b);
                iOException.initCause(e2);
                throw iOException;
            }
        } else {
            throw new IllegalStateException("state: " + this.f5194e);
        }
    }

    /* access modifiers changed from: package-private */
    public void g(i iVar) {
        t i2 = iVar.i();
        iVar.j(t.f5512d);
        i2.a();
        i2.b();
    }

    public r h() {
        if (this.f5194e == 1) {
            this.f5194e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f5194e);
    }

    public s i(p.s sVar) {
        if (this.f5194e == 4) {
            this.f5194e = 5;
            return new d(sVar);
        }
        throw new IllegalStateException("state: " + this.f5194e);
    }

    public r j(long j2) {
        if (this.f5194e == 1) {
            this.f5194e = 2;
            return new e(j2);
        }
        throw new IllegalStateException("state: " + this.f5194e);
    }

    public s k(long j2) {
        if (this.f5194e == 4) {
            this.f5194e = 5;
            return new f(this, j2);
        }
        throw new IllegalStateException("state: " + this.f5194e);
    }

    public s l() {
        if (this.f5194e == 4) {
            p.e0.f.g gVar = this.b;
            if (gVar != null) {
                this.f5194e = 5;
                gVar.j();
                return new g(this);
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + this.f5194e);
    }

    public p.r n() {
        r.a aVar = new r.a();
        while (true) {
            String m2 = m();
            if (m2.length() == 0) {
                return aVar.d();
            }
            p.e0.a.a.a(aVar, m2);
        }
    }

    public void o(p.r rVar, String str) {
        if (this.f5194e == 0) {
            this.f5193d.N(str).N("\r\n");
            int g2 = rVar.g();
            for (int i2 = 0; i2 < g2; i2++) {
                this.f5193d.N(rVar.e(i2)).N(": ").N(rVar.h(i2)).N("\r\n");
            }
            this.f5193d.N("\r\n");
            this.f5194e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f5194e);
    }
}
