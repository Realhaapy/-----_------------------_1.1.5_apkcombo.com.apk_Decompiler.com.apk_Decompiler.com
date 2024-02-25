package f.e.c.a.t;

import f.e.c.a.a0.j;
import f.e.c.a.a0.u;
import f.e.c.a.a0.w;
import f.e.c.a.h;
import f.e.c.a.y.r;
import f.e.c.a.y.s;
import f.e.c.a.y.y;
import f.e.c.a.z.a.i;
import f.e.c.a.z.a.q;
import java.security.GeneralSecurityException;

public class h extends f.e.c.a.h<r> {

    class a extends h.b<f.e.c.a.a, r> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public f.e.c.a.a a(r rVar) {
            return new j(rVar.Q().w());
        }
    }

    class b extends h.a<s, r> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public r a(s sVar) {
            r.b S = r.S();
            S.A(h.this.j());
            S.z(i.k(u.c(32)));
            return (r) S.a();
        }

        /* renamed from: f */
        public s c(i iVar) {
            return s.O(iVar, q.b());
        }

        /* renamed from: g */
        public void d(s sVar) {
        }
    }

    h() {
        super(r.class, new a(f.e.c.a.a.class));
    }

    public static void l(boolean z) {
        f.e.c.a.r.q(new h(), z);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public h.a<s, r> e() {
        return new b(s.class);
    }

    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public r g(i iVar) {
        return r.T(iVar, q.b());
    }

    /* renamed from: m */
    public void i(r rVar) {
        w.c(rVar.R(), j());
        if (rVar.Q().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
