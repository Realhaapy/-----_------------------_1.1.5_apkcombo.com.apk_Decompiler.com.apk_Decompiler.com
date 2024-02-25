package f.e.c.a.t;

import f.e.c.a.a0.u;
import f.e.c.a.a0.w;
import f.e.c.a.h;
import f.e.c.a.r;
import f.e.c.a.y.n;
import f.e.c.a.y.o;
import f.e.c.a.y.y;
import f.e.c.a.z.a.i;
import f.e.c.a.z.a.q;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public final class g extends h<n> {

    class a extends h.b<f.e.c.a.a, n> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public f.e.c.a.a a(n nVar) {
            return new f.e.c.a.t.m.a(nVar.Q().w());
        }
    }

    class b extends h.a<o, n> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public n a(o oVar) {
            n.b S = n.S();
            S.z(i.k(u.c(oVar.O())));
            S.A(g.this.k());
            return (n) S.a();
        }

        /* renamed from: f */
        public o c(i iVar) {
            return o.P(iVar, q.b());
        }

        /* renamed from: g */
        public void d(o oVar) {
            w.a(oVar.O());
        }
    }

    g() {
        super(n.class, new a(f.e.c.a.a.class));
    }

    private static boolean j() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public static void m(boolean z) {
        if (j()) {
            r.q(new g(), z);
        }
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    public h.a<o, n> e() {
        return new b(o.class);
    }

    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    /* renamed from: l */
    public n g(i iVar) {
        return n.T(iVar, q.b());
    }

    /* renamed from: n */
    public void i(n nVar) {
        w.c(nVar.R(), k());
        w.a(nVar.Q().size());
    }
}
