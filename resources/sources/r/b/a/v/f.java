package r.b.a.v;

import java.util.Locale;
import r.b.a.q;
import r.b.a.r;
import r.b.a.u.b;
import r.b.a.u.h;
import r.b.a.u.m;
import r.b.a.w.c;
import r.b.a.w.d;
import r.b.a.x.e;
import r.b.a.x.i;
import r.b.a.x.j;
import r.b.a.x.k;
import r.b.a.x.n;

final class f {
    private e a;
    private Locale b;
    private h c;

    /* renamed from: d  reason: collision with root package name */
    private int f5721d;

    class a extends c {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f5722e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f5723f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f5724g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ q f5725h;

        a(b bVar, e eVar, h hVar, q qVar) {
            this.f5722e = bVar;
            this.f5723f = eVar;
            this.f5724g = hVar;
            this.f5725h = qVar;
        }

        public n d(i iVar) {
            return (this.f5722e == null || !iVar.a()) ? this.f5723f.d(iVar) : this.f5722e.d(iVar);
        }

        public <R> R f(k<R> kVar) {
            return kVar == j.a() ? this.f5724g : kVar == j.g() ? this.f5725h : kVar == j.e() ? this.f5723f.f(kVar) : kVar.a(this);
        }

        public boolean j(i iVar) {
            return (this.f5722e == null || !iVar.a()) ? this.f5723f.j(iVar) : this.f5722e.j(iVar);
        }

        public long n(i iVar) {
            return ((this.f5722e == null || !iVar.a()) ? this.f5723f : this.f5722e).n(iVar);
        }
    }

    f(e eVar, b bVar) {
        this.a = a(eVar, bVar);
        this.b = bVar.f();
        this.c = bVar.e();
    }

    private static e a(e eVar, b bVar) {
        h d2 = bVar.d();
        q g2 = bVar.g();
        if (d2 == null && g2 == null) {
            return eVar;
        }
        h hVar = (h) eVar.f(j.a());
        q qVar = (q) eVar.f(j.g());
        b bVar2 = null;
        if (d.c(hVar, d2)) {
            d2 = null;
        }
        if (d.c(qVar, g2)) {
            g2 = null;
        }
        if (d2 == null && g2 == null) {
            return eVar;
        }
        h hVar2 = d2 != null ? d2 : hVar;
        if (g2 != null) {
            qVar = g2;
        }
        if (g2 != null) {
            if (eVar.j(r.b.a.x.a.INSTANT_SECONDS)) {
                if (hVar2 == null) {
                    hVar2 = m.f5618g;
                }
                return hVar2.w(r.b.a.e.w(eVar), g2);
            }
            q g3 = g2.g();
            r rVar = (r) eVar.f(j.d());
            if ((g3 instanceof r) && rVar != null && !g3.equals(rVar)) {
                throw new r.b.a.b("Invalid override zone for temporal: " + g2 + " " + eVar);
            }
        }
        if (d2 != null) {
            if (eVar.j(r.b.a.x.a.EPOCH_DAY)) {
                bVar2 = hVar2.c(eVar);
            } else if (!(d2 == m.f5618g && hVar == null)) {
                r.b.a.x.a[] values = r.b.a.x.a.values();
                int length = values.length;
                int i2 = 0;
                while (i2 < length) {
                    r.b.a.x.a aVar = values[i2];
                    if (!aVar.a() || !eVar.j(aVar)) {
                        i2++;
                    } else {
                        throw new r.b.a.b("Invalid override chronology for temporal: " + d2 + " " + eVar);
                    }
                }
            }
        }
        return new a(bVar2, eVar, hVar2, qVar);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f5721d--;
    }

    /* access modifiers changed from: package-private */
    public Locale c() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public h d() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public e e() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public Long f(i iVar) {
        try {
            return Long.valueOf(this.a.n(iVar));
        } catch (r.b.a.b e2) {
            if (this.f5721d > 0) {
                return null;
            }
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    public <R> R g(k<R> kVar) {
        R f2 = this.a.f(kVar);
        if (f2 != null || this.f5721d != 0) {
            return f2;
        }
        throw new r.b.a.b("Unable to extract value: " + this.a.getClass());
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.f5721d++;
    }

    public String toString() {
        return this.a.toString();
    }
}
