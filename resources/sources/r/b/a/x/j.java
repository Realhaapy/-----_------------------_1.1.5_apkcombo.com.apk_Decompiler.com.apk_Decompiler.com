package r.b.a.x;

import r.b.a.q;
import r.b.a.r;
import r.b.a.u.h;

public final class j {
    static final k<q> a = new a();
    static final k<h> b = new b();
    static final k<l> c = new c();

    /* renamed from: d  reason: collision with root package name */
    static final k<q> f5787d = new d();

    /* renamed from: e  reason: collision with root package name */
    static final k<r> f5788e = new e();

    /* renamed from: f  reason: collision with root package name */
    static final k<r.b.a.f> f5789f = new f();

    /* renamed from: g  reason: collision with root package name */
    static final k<r.b.a.h> f5790g = new g();

    class a implements k<q> {
        a() {
        }

        /* renamed from: b */
        public q a(e eVar) {
            return (q) eVar.f(this);
        }
    }

    class b implements k<h> {
        b() {
        }

        /* renamed from: b */
        public h a(e eVar) {
            return (h) eVar.f(this);
        }
    }

    class c implements k<l> {
        c() {
        }

        /* renamed from: b */
        public l a(e eVar) {
            return (l) eVar.f(this);
        }
    }

    class d implements k<q> {
        d() {
        }

        /* renamed from: b */
        public q a(e eVar) {
            q qVar = (q) eVar.f(j.a);
            return qVar != null ? qVar : (q) eVar.f(j.f5788e);
        }
    }

    class e implements k<r> {
        e() {
        }

        /* renamed from: b */
        public r a(e eVar) {
            a aVar = a.OFFSET_SECONDS;
            if (eVar.j(aVar)) {
                return r.B(eVar.l(aVar));
            }
            return null;
        }
    }

    class f implements k<r.b.a.f> {
        f() {
        }

        /* renamed from: b */
        public r.b.a.f a(e eVar) {
            a aVar = a.EPOCH_DAY;
            if (eVar.j(aVar)) {
                return r.b.a.f.b0(eVar.n(aVar));
            }
            return null;
        }
    }

    class g implements k<r.b.a.h> {
        g() {
        }

        /* renamed from: b */
        public r.b.a.h a(e eVar) {
            a aVar = a.NANO_OF_DAY;
            if (eVar.j(aVar)) {
                return r.b.a.h.H(eVar.n(aVar));
            }
            return null;
        }
    }

    public static final k<h> a() {
        return b;
    }

    public static final k<r.b.a.f> b() {
        return f5789f;
    }

    public static final k<r.b.a.h> c() {
        return f5790g;
    }

    public static final k<r> d() {
        return f5788e;
    }

    public static final k<l> e() {
        return c;
    }

    public static final k<q> f() {
        return f5787d;
    }

    public static final k<q> g() {
        return a;
    }
}
