package r.b.a.u;

import r.b.a.x.a;
import r.b.a.x.d;
import r.b.a.x.f;
import r.b.a.x.h;
import r.b.a.x.i;
import r.b.a.x.j;
import r.b.a.x.k;
import r.b.a.x.l;

public abstract class b extends r.b.a.w.b implements d, f, Comparable<b> {
    /* renamed from: A */
    public b m(long j2, l lVar) {
        return x().d(super.m(j2, lVar));
    }

    /* renamed from: B */
    public abstract b s(long j2, l lVar);

    public b C(h hVar) {
        return x().d(super.u(hVar));
    }

    public long D() {
        return n(a.EPOCH_DAY);
    }

    /* renamed from: E */
    public b h(f fVar) {
        return x().d(super.h(fVar));
    }

    /* renamed from: F */
    public abstract b k(i iVar, long j2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && compareTo((b) obj) == 0;
    }

    public <R> R f(k<R> kVar) {
        if (kVar == j.a()) {
            return x();
        }
        if (kVar == j.e()) {
            return r.b.a.x.b.DAYS;
        }
        if (kVar == j.b()) {
            return r.b.a.f.b0(D());
        }
        if (kVar == j.c() || kVar == j.f() || kVar == j.g() || kVar == j.d()) {
            return null;
        }
        return super.f(kVar);
    }

    public int hashCode() {
        long D = D();
        return x().hashCode() ^ ((int) (D ^ (D >>> 32)));
    }

    public boolean j(i iVar) {
        return iVar instanceof a ? iVar.a() : iVar != null && iVar.c(this);
    }

    public d t(d dVar) {
        return dVar.k(a.EPOCH_DAY, D());
    }

    public String toString() {
        long n2 = n(a.YEAR_OF_ERA);
        long n3 = n(a.MONTH_OF_YEAR);
        long n4 = n(a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(x().toString());
        sb.append(" ");
        sb.append(y());
        sb.append(" ");
        sb.append(n2);
        String str = "-0";
        sb.append(n3 < 10 ? str : "-");
        sb.append(n3);
        if (n4 >= 10) {
            str = "-";
        }
        sb.append(str);
        sb.append(n4);
        return sb.toString();
    }

    public c<?> v(r.b.a.h hVar) {
        return d.I(this, hVar);
    }

    /* renamed from: w */
    public int compareTo(b bVar) {
        int b = r.b.a.w.d.b(D(), bVar.D());
        return b == 0 ? x().compareTo(bVar.x()) : b;
    }

    public abstract h x();

    public i y() {
        return x().h(l(a.ERA));
    }

    public boolean z(b bVar) {
        return D() < bVar.D();
    }
}
