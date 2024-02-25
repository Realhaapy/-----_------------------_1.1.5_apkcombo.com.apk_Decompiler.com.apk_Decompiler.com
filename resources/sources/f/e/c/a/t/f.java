package f.e.c.a.t;

import f.e.c.a.a0.c;
import f.e.c.a.a0.u;
import f.e.c.a.a0.w;
import f.e.c.a.g;
import f.e.c.a.h;
import f.e.c.a.r;
import f.e.c.a.y.l;
import f.e.c.a.y.m;
import f.e.c.a.y.y;
import f.e.c.a.z.a.i;
import f.e.c.a.z.a.q;

public final class f extends h<l> {

    class a extends h.b<f.e.c.a.a, l> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public f.e.c.a.a a(l lVar) {
            return new c(lVar.Q().w());
        }
    }

    class b extends h.a<m, l> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public l a(m mVar) {
            l.b S = l.S();
            S.z(i.k(u.c(mVar.P())));
            S.A(f.this.l());
            return (l) S.a();
        }

        /* renamed from: f */
        public m c(i iVar) {
            return m.R(iVar, q.b());
        }

        /* renamed from: g */
        public void d(m mVar) {
            w.a(mVar.P());
        }
    }

    f() {
        super(l.class, new a(f.e.c.a.a.class));
    }

    public static final g j() {
        return k(32, g.b.TINK);
    }

    private static g k(int i2, g.b bVar) {
        m.b Q = m.Q();
        Q.z(i2);
        return g.a(new f().c(), ((m) Q.a()).f(), bVar);
    }

    public static void n(boolean z) {
        r.q(new f(), z);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public h.a<m, l> e() {
        return new b(m.class);
    }

    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    /* renamed from: m */
    public l g(i iVar) {
        return l.T(iVar, q.b());
    }

    /* renamed from: o */
    public void i(l lVar) {
        w.c(lVar.R(), l());
        w.a(lVar.Q().size());
    }
}
