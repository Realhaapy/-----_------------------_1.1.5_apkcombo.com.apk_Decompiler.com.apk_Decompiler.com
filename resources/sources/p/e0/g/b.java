package p.e0.g;

import java.net.ProtocolException;
import p.a0;
import p.b0;
import p.t;
import p.y;
import q.c;
import q.d;
import q.g;
import q.l;
import q.r;

public final class b implements t {
    private final boolean a;

    static final class a extends g {

        /* renamed from: f  reason: collision with root package name */
        long f5180f;

        a(r rVar) {
            super(rVar);
        }

        public void h(c cVar, long j2) {
            super.h(cVar, j2);
            this.f5180f += j2;
        }
    }

    public b(boolean z) {
        this.a = z;
    }

    public a0 a(t.a aVar) {
        a0.a aVar2;
        b0 b0Var;
        g gVar = (g) aVar;
        c i2 = gVar.i();
        p.e0.f.g k2 = gVar.k();
        p.e0.f.c cVar = (p.e0.f.c) gVar.g();
        y e2 = gVar.e();
        long currentTimeMillis = System.currentTimeMillis();
        gVar.h().o(gVar.f());
        i2.b(e2);
        gVar.h().n(gVar.f(), e2);
        a0.a aVar3 = null;
        if (f.b(e2.f()) && e2.a() != null) {
            if ("100-continue".equalsIgnoreCase(e2.c("Expect"))) {
                i2.d();
                gVar.h().s(gVar.f());
                aVar3 = i2.f(true);
            }
            if (aVar3 == null) {
                gVar.h().m(gVar.f());
                a aVar4 = new a(i2.e(e2, e2.a().a()));
                d a2 = l.a(aVar4);
                e2.a().e(a2);
                a2.close();
                gVar.h().l(gVar.f(), aVar4.f5180f);
            } else if (!cVar.n()) {
                k2.j();
            }
        }
        i2.a();
        if (aVar3 == null) {
            gVar.h().s(gVar.f());
            aVar3 = i2.f(false);
        }
        aVar3.p(e2);
        aVar3.h(k2.d().k());
        aVar3.q(currentTimeMillis);
        aVar3.o(System.currentTimeMillis());
        a0 c = aVar3.c();
        int g2 = c.g();
        if (g2 == 100) {
            a0.a f2 = i2.f(false);
            f2.p(e2);
            f2.h(k2.d().k());
            f2.q(currentTimeMillis);
            f2.o(System.currentTimeMillis());
            c = f2.c();
            g2 = c.g();
        }
        gVar.h().r(gVar.f(), c);
        if (!this.a || g2 != 101) {
            aVar2 = c.E();
            b0Var = i2.c(c);
        } else {
            aVar2 = c.E();
            b0Var = p.e0.c.c;
        }
        aVar2.b(b0Var);
        a0 c2 = aVar2.c();
        if ("close".equalsIgnoreCase(c2.O().c("Connection")) || "close".equalsIgnoreCase(c2.v("Connection"))) {
            k2.j();
        }
        if ((g2 != 204 && g2 != 205) || c2.a().a() <= 0) {
            return c2;
        }
        throw new ProtocolException("HTTP " + g2 + " had non-zero Content-Length: " + c2.a().a());
    }
}
