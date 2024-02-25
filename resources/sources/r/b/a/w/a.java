package r.b.a.w;

import r.b.a.u.i;
import r.b.a.x.b;
import r.b.a.x.d;
import r.b.a.x.j;
import r.b.a.x.k;
import r.b.a.x.m;

public abstract class a extends c implements i {
    public <R> R f(k<R> kVar) {
        if (kVar == j.e()) {
            return b.ERAS;
        }
        if (kVar == j.a() || kVar == j.f() || kVar == j.g() || kVar == j.d() || kVar == j.b() || kVar == j.c()) {
            return null;
        }
        return kVar.a(this);
    }

    public boolean j(r.b.a.x.i iVar) {
        return iVar instanceof r.b.a.x.a ? iVar == r.b.a.x.a.ERA : iVar != null && iVar.c(this);
    }

    public int l(r.b.a.x.i iVar) {
        return iVar == r.b.a.x.a.ERA ? getValue() : d(iVar).a(n(iVar), iVar);
    }

    public long n(r.b.a.x.i iVar) {
        if (iVar == r.b.a.x.a.ERA) {
            return (long) getValue();
        }
        if (!(iVar instanceof r.b.a.x.a)) {
            return iVar.f(this);
        }
        throw new m("Unsupported field: " + iVar);
    }

    public d t(d dVar) {
        return dVar.k(r.b.a.x.a.ERA, (long) getValue());
    }
}
