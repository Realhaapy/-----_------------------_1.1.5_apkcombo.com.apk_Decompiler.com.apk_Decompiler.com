package p.e0.e;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p.a0;
import p.b0;
import p.e0.e.c;
import p.e0.g.f;
import p.e0.g.h;
import p.r;
import p.t;
import p.w;
import p.y;
import q.c;
import q.d;
import q.e;
import q.l;
import q.r;
import q.s;

public final class a implements t {
    final d a;

    /* renamed from: p.e0.e.a$a  reason: collision with other inner class name */
    class C0148a implements s {

        /* renamed from: e  reason: collision with root package name */
        boolean f5136e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f5137f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f5138g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f5139h;

        C0148a(a aVar, e eVar, b bVar, d dVar) {
            this.f5137f = eVar;
            this.f5138g = bVar;
            this.f5139h = dVar;
        }

        public long F(c cVar, long j2) {
            try {
                long F = this.f5137f.F(cVar, j2);
                if (F == -1) {
                    if (!this.f5136e) {
                        this.f5136e = true;
                        this.f5139h.close();
                    }
                    return -1;
                }
                cVar.E(this.f5139h.b(), cVar.X() - F, F);
                this.f5139h.C();
                return F;
            } catch (IOException e2) {
                if (!this.f5136e) {
                    this.f5136e = true;
                    this.f5138g.b();
                }
                throw e2;
            }
        }

        public void close() {
            if (!this.f5136e && !p.e0.c.n(this, 100, TimeUnit.MILLISECONDS)) {
                this.f5136e = true;
                this.f5138g.b();
            }
            this.f5137f.close();
        }

        public q.t d() {
            return this.f5137f.d();
        }
    }

    public a(d dVar) {
        this.a = dVar;
    }

    private a0 b(b bVar, a0 a0Var) {
        r a2;
        if (bVar == null || (a2 = bVar.a()) == null) {
            return a0Var;
        }
        C0148a aVar = new C0148a(this, a0Var.a().o(), bVar, l.a(a2));
        String v = a0Var.v("Content-Type");
        long a3 = a0Var.a().a();
        a0.a E = a0Var.E();
        E.b(new h(v, a3, l.b(aVar)));
        return E.c();
    }

    private static p.r c(p.r rVar, p.r rVar2) {
        r.a aVar = new r.a();
        int g2 = rVar.g();
        for (int i2 = 0; i2 < g2; i2++) {
            String e2 = rVar.e(i2);
            String h2 = rVar.h(i2);
            if ((!"Warning".equalsIgnoreCase(e2) || !h2.startsWith("1")) && (d(e2) || !e(e2) || rVar2.c(e2) == null)) {
                p.e0.a.a.b(aVar, e2, h2);
            }
        }
        int g3 = rVar2.g();
        for (int i3 = 0; i3 < g3; i3++) {
            String e3 = rVar2.e(i3);
            if (!d(e3) && e(e3)) {
                p.e0.a.a.b(aVar, e3, rVar2.h(i3));
            }
        }
        return aVar.d();
    }

    static boolean d(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    static boolean e(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    private static a0 f(a0 a0Var) {
        if (a0Var == null || a0Var.a() == null) {
            return a0Var;
        }
        a0.a E = a0Var.E();
        E.b((b0) null);
        return E.c();
    }

    public a0 a(t.a aVar) {
        d dVar = this.a;
        a0 a2 = dVar != null ? dVar.a(aVar.e()) : null;
        c c = new c.a(System.currentTimeMillis(), aVar.e(), a2).c();
        y yVar = c.a;
        a0 a0Var = c.b;
        d dVar2 = this.a;
        if (dVar2 != null) {
            dVar2.c(c);
        }
        if (a2 != null && a0Var == null) {
            p.e0.c.e(a2.a());
        }
        if (yVar == null && a0Var == null) {
            a0.a aVar2 = new a0.a();
            aVar2.p(aVar.e());
            aVar2.n(w.HTTP_1_1);
            aVar2.g(504);
            aVar2.k("Unsatisfiable Request (only-if-cached)");
            aVar2.b(p.e0.c.c);
            aVar2.q(-1);
            aVar2.o(System.currentTimeMillis());
            return aVar2.c();
        } else if (yVar == null) {
            a0.a E = a0Var.E();
            E.d(f(a0Var));
            return E.c();
        } else {
            try {
                a0 d2 = aVar.d(yVar);
                if (d2 == null && a2 != null) {
                }
                if (a0Var != null) {
                    if (d2.g() == 304) {
                        a0.a E2 = a0Var.E();
                        E2.j(c(a0Var.B(), d2.B()));
                        E2.q(d2.P());
                        E2.o(d2.L());
                        E2.d(f(a0Var));
                        E2.l(f(d2));
                        a0 c2 = E2.c();
                        d2.a().close();
                        this.a.b();
                        this.a.d(a0Var, c2);
                        return c2;
                    }
                    p.e0.c.e(a0Var.a());
                }
                a0.a E3 = d2.E();
                E3.d(f(a0Var));
                E3.l(f(d2));
                a0 c3 = E3.c();
                if (this.a != null) {
                    if (p.e0.g.e.c(c3) && c.a(c3, yVar)) {
                        return b(this.a.f(c3), c3);
                    }
                    if (f.a(yVar.f())) {
                        try {
                            this.a.e(yVar);
                        } catch (IOException unused) {
                        }
                    }
                }
                return c3;
            } finally {
                if (a2 != null) {
                    p.e0.c.e(a2.a());
                }
            }
        }
    }
}
