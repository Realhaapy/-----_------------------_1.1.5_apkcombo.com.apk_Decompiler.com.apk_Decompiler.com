package r.b.a.w;

import r.b.a.x.a;
import r.b.a.x.e;
import r.b.a.x.i;
import r.b.a.x.j;
import r.b.a.x.k;
import r.b.a.x.m;
import r.b.a.x.n;

public abstract class c implements e {
    public n d(i iVar) {
        if (!(iVar instanceof a)) {
            return iVar.h(this);
        }
        if (j(iVar)) {
            return iVar.k();
        }
        throw new m("Unsupported field: " + iVar);
    }

    public <R> R f(k<R> kVar) {
        if (kVar == j.g() || kVar == j.a() || kVar == j.e()) {
            return null;
        }
        return kVar.a(this);
    }

    public int l(i iVar) {
        return d(iVar).a(n(iVar), iVar);
    }
}
