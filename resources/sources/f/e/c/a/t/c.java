package f.e.c.a.t;

import f.e.c.a.a0.l;
import f.e.c.a.a0.p;
import f.e.c.a.a0.w;
import f.e.c.a.h;
import f.e.c.a.o;
import f.e.c.a.r;
import f.e.c.a.y.d;
import f.e.c.a.y.e;
import f.e.c.a.y.y;
import f.e.c.a.z.a.i;
import f.e.c.a.z.a.q;

public final class c extends h<d> {

    class a extends h.b<f.e.c.a.a, d> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public f.e.c.a.a a(d dVar) {
            return new l((p) new d().d(dVar.R(), p.class), (o) new f.e.c.a.w.b().d(dVar.S(), o.class), dVar.S().T().Q());
        }
    }

    class b extends h.a<e, d> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public d a(e eVar) {
            d.b U = d.U();
            U.z(new d().e().a(eVar.O()));
            U.A(new f.e.c.a.w.b().e().a(eVar.P()));
            U.B(c.this.j());
            return (d) U.a();
        }

        /* renamed from: f */
        public e c(i iVar) {
            return e.Q(iVar, q.b());
        }

        /* renamed from: g */
        public void d(e eVar) {
            new d().e().d(eVar.O());
            new f.e.c.a.w.b().e().d(eVar.P());
            w.a(eVar.O().P());
        }
    }

    c() {
        super(d.class, new a(f.e.c.a.a.class));
    }

    public static void l(boolean z) {
        r.q(new c(), z);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public h.a<e, d> e() {
        return new b(e.class);
    }

    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public d g(i iVar) {
        return d.V(iVar, q.b());
    }

    /* renamed from: m */
    public void i(d dVar) {
        w.c(dVar.T(), j());
        new d().i(dVar.R());
        new f.e.c.a.w.b().i(dVar.S());
    }
}
