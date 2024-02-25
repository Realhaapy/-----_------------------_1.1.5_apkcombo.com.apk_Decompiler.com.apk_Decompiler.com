package f.e.c.a.w;

import f.e.c.a.a0.r;
import f.e.c.a.a0.t;
import f.e.c.a.a0.u;
import f.e.c.a.a0.w;
import f.e.c.a.h;
import f.e.c.a.o;
import f.e.c.a.y.a;
import f.e.c.a.y.c;
import f.e.c.a.y.y;
import f.e.c.a.z.a.i;
import f.e.c.a.z.a.q;
import java.security.GeneralSecurityException;

public final class a extends h<f.e.c.a.y.a> {

    /* renamed from: f.e.c.a.w.a$a  reason: collision with other inner class name */
    class C0118a extends h.b<o, f.e.c.a.y.a> {
        C0118a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public o a(f.e.c.a.y.a aVar) {
            return new t(new r(aVar.R().w()), aVar.S().P());
        }
    }

    class b extends h.a<f.e.c.a.y.b, f.e.c.a.y.a> {
        b(a aVar, Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public f.e.c.a.y.a a(f.e.c.a.y.b bVar) {
            a.b U = f.e.c.a.y.a.U();
            U.B(0);
            U.z(i.k(u.c(bVar.O())));
            U.A(bVar.P());
            return (f.e.c.a.y.a) U.a();
        }

        /* renamed from: f */
        public f.e.c.a.y.b c(i iVar) {
            return f.e.c.a.y.b.Q(iVar, q.b());
        }

        /* renamed from: g */
        public void d(f.e.c.a.y.b bVar) {
            a.p(bVar.P());
            a.q(bVar.O());
        }
    }

    a() {
        super(f.e.c.a.y.a.class, new C0118a(o.class));
    }

    public static void n(boolean z) {
        f.e.c.a.r.q(new a(), z);
    }

    /* access modifiers changed from: private */
    public static void p(c cVar) {
        if (cVar.P() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (cVar.P() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* access modifiers changed from: private */
    public static void q(int i2) {
        if (i2 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    public h.a<f.e.c.a.y.b, f.e.c.a.y.a> e() {
        return new b(this, f.e.c.a.y.b.class);
    }

    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    /* renamed from: m */
    public f.e.c.a.y.a g(i iVar) {
        return f.e.c.a.y.a.V(iVar, q.b());
    }

    /* renamed from: o */
    public void i(f.e.c.a.y.a aVar) {
        w.c(aVar.T(), l());
        q(aVar.R().size());
        p(aVar.S());
    }
}
