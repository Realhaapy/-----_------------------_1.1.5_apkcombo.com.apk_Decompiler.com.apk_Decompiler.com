package f.e.c.a.t;

import f.e.c.a.a0.w;
import f.e.c.a.h;
import f.e.c.a.n;
import f.e.c.a.r;
import f.e.c.a.y.e0;
import f.e.c.a.y.f0;
import f.e.c.a.y.y;
import f.e.c.a.z.a.q;

public class i extends h<e0> {

    class a extends h.b<f.e.c.a.a, e0> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public f.e.c.a.a a(e0 e0Var) {
            String P = e0Var.Q().P();
            return n.a(P).b(P);
        }
    }

    class b extends h.a<f0, e0> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public e0 a(f0 f0Var) {
            e0.b S = e0.S();
            S.z(f0Var);
            S.A(i.this.j());
            return (e0) S.a();
        }

        /* renamed from: f */
        public f0 c(f.e.c.a.z.a.i iVar) {
            return f0.Q(iVar, q.b());
        }

        /* renamed from: g */
        public void d(f0 f0Var) {
        }
    }

    i() {
        super(e0.class, new a(f.e.c.a.a.class));
    }

    public static void l(boolean z) {
        r.q(new i(), z);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    public h.a<f0, e0> e() {
        return new b(f0.class);
    }

    public y.c f() {
        return y.c.REMOTE;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public e0 g(f.e.c.a.z.a.i iVar) {
        return e0.T(iVar, q.b());
    }

    /* renamed from: m */
    public void i(e0 e0Var) {
        w.c(e0Var.R(), j());
    }
}
