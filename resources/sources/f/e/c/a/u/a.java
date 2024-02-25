package f.e.c.a.u;

import f.e.c.a.a0.u;
import f.e.c.a.a0.w;
import f.e.c.a.d;
import f.e.c.a.g;
import f.e.c.a.h;
import f.e.c.a.r;
import f.e.c.a.y.p;
import f.e.c.a.y.q;
import f.e.c.a.y.y;
import f.e.c.a.z.a.i;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;

public final class a extends h<p> {

    /* renamed from: f.e.c.a.u.a$a  reason: collision with other inner class name */
    class C0116a extends h.b<d, p> {
        C0116a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public d a(p pVar) {
            return new f.e.c.a.a0.d(pVar.Q().w());
        }
    }

    class b extends h.a<q, p> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public p a(q qVar) {
            p.b S = p.S();
            S.z(i.k(u.c(qVar.P())));
            S.A(a.this.l());
            return (p) S.a();
        }

        /* renamed from: f */
        public q c(i iVar) {
            return q.R(iVar, f.e.c.a.z.a.q.b());
        }

        /* renamed from: g */
        public void d(q qVar) {
            if (qVar.P() != 64) {
                throw new InvalidAlgorithmParameterException("invalid key size: " + qVar.P() + ". Valid keys must have 64 bytes.");
            }
        }
    }

    a() {
        super(p.class, new C0116a(d.class));
    }

    public static final g j() {
        return k(64, g.b.TINK);
    }

    private static g k(int i2, g.b bVar) {
        q.b Q = q.Q();
        Q.z(i2);
        return g.a(new a().c(), ((q) Q.a()).f(), bVar);
    }

    public static void n(boolean z) {
        r.q(new a(), z);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    public h.a<q, p> e() {
        return new b(q.class);
    }

    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    /* renamed from: m */
    public p g(i iVar) {
        return p.T(iVar, f.e.c.a.z.a.q.b());
    }

    /* renamed from: o */
    public void i(p pVar) {
        w.c(pVar.R(), l());
        if (pVar.Q().size() != 64) {
            throw new InvalidKeyException("invalid key size: " + pVar.Q().size() + ". Valid keys must have 64 bytes.");
        }
    }
}
