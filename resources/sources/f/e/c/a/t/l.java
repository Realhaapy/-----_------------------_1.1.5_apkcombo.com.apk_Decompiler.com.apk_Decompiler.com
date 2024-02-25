package f.e.c.a.t;

import f.e.c.a.a0.u;
import f.e.c.a.a0.w;
import f.e.c.a.a0.y;
import f.e.c.a.h;
import f.e.c.a.r;
import f.e.c.a.y.k0;
import f.e.c.a.y.l0;
import f.e.c.a.y.y;
import f.e.c.a.z.a.i;
import f.e.c.a.z.a.q;
import java.security.GeneralSecurityException;

public class l extends h<k0> {

    class a extends h.b<f.e.c.a.a, k0> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public f.e.c.a.a a(k0 k0Var) {
            return new y(k0Var.Q().w());
        }
    }

    class b extends h.a<l0, k0> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public k0 a(l0 l0Var) {
            k0.b S = k0.S();
            S.A(l.this.j());
            S.z(i.k(u.c(32)));
            return (k0) S.a();
        }

        /* renamed from: f */
        public l0 c(i iVar) {
            return l0.O(iVar, q.b());
        }

        /* renamed from: g */
        public void d(l0 l0Var) {
        }
    }

    l() {
        super(k0.class, new a(f.e.c.a.a.class));
    }

    public static void l(boolean z) {
        r.q(new l(), z);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public h.a<l0, k0> e() {
        return new b(l0.class);
    }

    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public k0 g(i iVar) {
        return k0.T(iVar, q.b());
    }

    /* renamed from: m */
    public void i(k0 k0Var) {
        w.c(k0Var.R(), j());
        if (k0Var.Q().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
