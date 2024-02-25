package p.e0.i;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p.a0;
import p.b0;
import p.e0.f.g;
import p.e0.g.c;
import p.e0.g.e;
import p.e0.g.i;
import p.e0.g.k;
import p.r;
import p.t;
import p.v;
import p.w;
import p.y;
import q.h;
import q.l;
import q.s;

public final class f implements c {

    /* renamed from: f  reason: collision with root package name */
    private static final List<String> f5244f = p.e0.c.s("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: g  reason: collision with root package name */
    private static final List<String> f5245g = p.e0.c.s("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    private final t.a a;
    final g b;
    private final g c;

    /* renamed from: d  reason: collision with root package name */
    private i f5246d;

    /* renamed from: e  reason: collision with root package name */
    private final w f5247e;

    class a extends h {

        /* renamed from: f  reason: collision with root package name */
        boolean f5248f = false;

        /* renamed from: g  reason: collision with root package name */
        long f5249g = 0;

        a(s sVar) {
            super(sVar);
        }

        private void c(IOException iOException) {
            if (!this.f5248f) {
                this.f5248f = true;
                f fVar = f.this;
                fVar.b.r(false, fVar, this.f5249g, iOException);
            }
        }

        public long F(q.c cVar, long j2) {
            try {
                long F = a().F(cVar, j2);
                if (F > 0) {
                    this.f5249g += F;
                }
                return F;
            } catch (IOException e2) {
                c(e2);
                throw e2;
            }
        }

        public void close() {
            super.close();
            c((IOException) null);
        }
    }

    public f(v vVar, t.a aVar, g gVar, g gVar2) {
        this.a = aVar;
        this.b = gVar;
        this.c = gVar2;
        List<w> x = vVar.x();
        w wVar = w.H2_PRIOR_KNOWLEDGE;
        this.f5247e = !x.contains(wVar) ? w.HTTP_2 : wVar;
    }

    public static List<c> g(y yVar) {
        r d2 = yVar.d();
        ArrayList arrayList = new ArrayList(d2.g() + 4);
        arrayList.add(new c(c.f5228f, yVar.f()));
        arrayList.add(new c(c.f5229g, i.c(yVar.h())));
        String c2 = yVar.c("Host");
        if (c2 != null) {
            arrayList.add(new c(c.f5231i, c2));
        }
        arrayList.add(new c(c.f5230h, yVar.h().B()));
        int g2 = d2.g();
        for (int i2 = 0; i2 < g2; i2++) {
            q.f j2 = q.f.j(d2.e(i2).toLowerCase(Locale.US));
            if (!f5244f.contains(j2.A())) {
                arrayList.add(new c(j2, d2.h(i2)));
            }
        }
        return arrayList;
    }

    public static a0.a h(r rVar, w wVar) {
        r.a aVar = new r.a();
        int g2 = rVar.g();
        k kVar = null;
        for (int i2 = 0; i2 < g2; i2++) {
            String e2 = rVar.e(i2);
            String h2 = rVar.h(i2);
            if (e2.equals(":status")) {
                kVar = k.a("HTTP/1.1 " + h2);
            } else if (!f5245g.contains(e2)) {
                p.e0.a.a.b(aVar, e2, h2);
            }
        }
        if (kVar != null) {
            a0.a aVar2 = new a0.a();
            aVar2.n(wVar);
            aVar2.g(kVar.b);
            aVar2.k(kVar.c);
            aVar2.j(aVar.d());
            return aVar2;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public void a() {
        this.f5246d.j().close();
    }

    public void b(y yVar) {
        if (this.f5246d == null) {
            i X = this.c.X(g(yVar), yVar.a() != null);
            this.f5246d = X;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            X.n().g((long) this.a.b(), timeUnit);
            this.f5246d.u().g((long) this.a.c(), timeUnit);
        }
    }

    public b0 c(a0 a0Var) {
        g gVar = this.b;
        gVar.f5171f.q(gVar.f5170e);
        return new p.e0.g.h(a0Var.v("Content-Type"), e.b(a0Var), l.b(new a(this.f5246d.k())));
    }

    public void cancel() {
        i iVar = this.f5246d;
        if (iVar != null) {
            iVar.h(b.CANCEL);
        }
    }

    public void d() {
        this.c.flush();
    }

    public q.r e(y yVar, long j2) {
        return this.f5246d.j();
    }

    public a0.a f(boolean z) {
        a0.a h2 = h(this.f5246d.s(), this.f5247e);
        if (!z || p.e0.a.a.d(h2) != 100) {
            return h2;
        }
        return null;
    }
}
