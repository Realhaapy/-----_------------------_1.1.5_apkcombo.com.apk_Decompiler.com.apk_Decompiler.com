package f.e.c.a.t;

import f.e.c.a.a0.w;
import f.e.c.a.h;
import f.e.c.a.n;
import f.e.c.a.r;
import f.e.c.a.y.g0;
import f.e.c.a.y.h0;
import f.e.c.a.y.y;
import f.e.c.a.z.a.i;
import f.e.c.a.z.a.q;

public class k extends h<g0> {

    class a extends h.b<f.e.c.a.a, g0> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public f.e.c.a.a a(g0 g0Var) {
            String Q = g0Var.Q().Q();
            return new j(g0Var.Q().P(), n.a(Q).b(Q));
        }
    }

    class b extends h.a<h0, g0> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public g0 a(h0 h0Var) {
            g0.b S = g0.S();
            S.z(h0Var);
            S.A(k.this.j());
            return (g0) S.a();
        }

        /* renamed from: f */
        public h0 c(i iVar) {
            return h0.R(iVar, q.b());
        }

        /* renamed from: g */
        public void d(h0 h0Var) {
        }
    }

    k() {
        super(g0.class, new a(f.e.c.a.a.class));
    }

    public static void l(boolean z) {
        r.q(new k(), z);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    public h.a<h0, g0> e() {
        return new b(h0.class);
    }

    public y.c f() {
        return y.c.REMOTE;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public g0 g(i iVar) {
        return g0.T(iVar, q.b());
    }

    /* renamed from: m */
    public void i(g0 g0Var) {
        w.c(g0Var.R(), j());
    }
}
