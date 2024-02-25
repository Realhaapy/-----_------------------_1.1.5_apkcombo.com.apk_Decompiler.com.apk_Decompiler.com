package f.e.c.a.t;

import f.e.c.a.a0.u;
import f.e.c.a.a0.w;
import f.e.c.a.h;
import f.e.c.a.r;
import f.e.c.a.y.i;
import f.e.c.a.y.j;
import f.e.c.a.y.y;
import f.e.c.a.z.a.q;
import java.security.GeneralSecurityException;

public final class e extends h<i> {

    class a extends h.b<f.e.c.a.a, i> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public f.e.c.a.a a(i iVar) {
            return new f.e.c.a.a0.b(iVar.R().w(), iVar.S().P());
        }
    }

    class b extends h.a<j, i> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public i a(j jVar) {
            i.b U = i.U();
            U.z(f.e.c.a.z.a.i.k(u.c(jVar.O())));
            U.A(jVar.P());
            U.B(e.this.j());
            return (i) U.a();
        }

        /* renamed from: f */
        public j c(f.e.c.a.z.a.i iVar) {
            return j.Q(iVar, q.b());
        }

        /* renamed from: g */
        public void d(j jVar) {
            w.a(jVar.O());
            if (jVar.P().P() != 12 && jVar.P().P() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    e() {
        super(i.class, new a(f.e.c.a.a.class));
    }

    public static void l(boolean z) {
        r.q(new e(), z);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public h.a<j, i> e() {
        return new b(j.class);
    }

    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public i g(f.e.c.a.z.a.i iVar) {
        return i.V(iVar, q.b());
    }

    /* renamed from: m */
    public void i(i iVar) {
        w.c(iVar.T(), j());
        w.a(iVar.R().size());
        if (iVar.S().P() != 12 && iVar.S().P() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
