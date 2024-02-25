package f.e.c.a.t;

import f.e.c.a.a0.p;
import f.e.c.a.a0.u;
import f.e.c.a.a0.w;
import f.e.c.a.h;
import f.e.c.a.y.f;
import f.e.c.a.y.g;
import f.e.c.a.y.y;
import f.e.c.a.z.a.i;
import f.e.c.a.z.a.q;
import java.security.GeneralSecurityException;

public class d extends h<f> {

    class a extends h.b<p, f> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public p a(f fVar) {
            return new f.e.c.a.a0.a(fVar.S().w(), fVar.T().P());
        }
    }

    class b extends h.a<g, f> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public f a(g gVar) {
            f.b V = f.V();
            V.A(gVar.Q());
            V.z(i.k(u.c(gVar.P())));
            V.B(d.this.k());
            return (f) V.a();
        }

        /* renamed from: f */
        public g c(i iVar) {
            return g.R(iVar, q.b());
        }

        /* renamed from: g */
        public void d(g gVar) {
            w.a(gVar.P());
            d.this.n(gVar.Q());
        }
    }

    d() {
        super(f.class, new a(p.class));
    }

    /* access modifiers changed from: private */
    public void n(f.e.c.a.y.h hVar) {
        if (hVar.P() < 12 || hVar.P() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    public h.a<g, f> e() {
        return new b(g.class);
    }

    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    /* renamed from: l */
    public f g(i iVar) {
        return f.W(iVar, q.b());
    }

    /* renamed from: m */
    public void i(f fVar) {
        w.c(fVar.U(), k());
        w.a(fVar.S().size());
        n(fVar.T());
    }
}
