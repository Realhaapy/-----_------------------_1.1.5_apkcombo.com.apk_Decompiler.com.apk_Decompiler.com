package r.b.a.u;

import r.b.a.b;
import r.b.a.x.a;
import r.b.a.x.d;
import r.b.a.x.i;
import r.b.a.x.j;
import r.b.a.x.k;
import r.b.a.x.m;

public enum n implements i {
    BCE,
    CE;

    public static n a(int i2) {
        if (i2 == 0) {
            return BCE;
        }
        if (i2 == 1) {
            return CE;
        }
        throw new b("Invalid era: " + i2);
    }

    public r.b.a.x.n d(i iVar) {
        if (iVar == a.ERA) {
            return iVar.k();
        }
        if (!(iVar instanceof a)) {
            return iVar.h(this);
        }
        throw new m("Unsupported field: " + iVar);
    }

    public <R> R f(k<R> kVar) {
        if (kVar == j.e()) {
            return r.b.a.x.b.ERAS;
        }
        if (kVar == j.a() || kVar == j.f() || kVar == j.g() || kVar == j.d() || kVar == j.b() || kVar == j.c()) {
            return null;
        }
        return kVar.a(this);
    }

    public int getValue() {
        return ordinal();
    }

    public boolean j(i iVar) {
        return iVar instanceof a ? iVar == a.ERA : iVar != null && iVar.c(this);
    }

    public int l(i iVar) {
        return iVar == a.ERA ? getValue() : d(iVar).a(n(iVar), iVar);
    }

    public long n(i iVar) {
        if (iVar == a.ERA) {
            return (long) getValue();
        }
        if (!(iVar instanceof a)) {
            return iVar.f(this);
        }
        throw new m("Unsupported field: " + iVar);
    }

    public d t(d dVar) {
        return dVar.k(a.ERA, (long) getValue());
    }
}
