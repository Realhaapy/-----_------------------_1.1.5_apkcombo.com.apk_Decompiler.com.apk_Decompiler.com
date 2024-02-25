package r.b.a;

import r.b.a.x.a;
import r.b.a.x.b;
import r.b.a.x.d;
import r.b.a.x.e;
import r.b.a.x.f;
import r.b.a.x.i;
import r.b.a.x.j;
import r.b.a.x.k;
import r.b.a.x.m;
import r.b.a.x.n;

public enum c implements e, f {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    

    /* renamed from: l  reason: collision with root package name */
    private static final c[] f5522l = null;

    static {
        f5522l = values();
    }

    public static c a(int i2) {
        if (i2 >= 1 && i2 <= 7) {
            return f5522l[i2 - 1];
        }
        throw new b("Invalid value for DayOfWeek: " + i2);
    }

    public n d(i iVar) {
        if (iVar == a.DAY_OF_WEEK) {
            return iVar.k();
        }
        if (!(iVar instanceof a)) {
            return iVar.h(this);
        }
        throw new m("Unsupported field: " + iVar);
    }

    public <R> R f(k<R> kVar) {
        if (kVar == j.e()) {
            return b.DAYS;
        }
        if (kVar == j.b() || kVar == j.c() || kVar == j.a() || kVar == j.f() || kVar == j.g() || kVar == j.d()) {
            return null;
        }
        return kVar.a(this);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    public boolean j(i iVar) {
        return iVar instanceof a ? iVar == a.DAY_OF_WEEK : iVar != null && iVar.c(this);
    }

    public int l(i iVar) {
        return iVar == a.DAY_OF_WEEK ? getValue() : d(iVar).a(n(iVar), iVar);
    }

    public long n(i iVar) {
        if (iVar == a.DAY_OF_WEEK) {
            return (long) getValue();
        }
        if (!(iVar instanceof a)) {
            return iVar.f(this);
        }
        throw new m("Unsupported field: " + iVar);
    }

    public d t(d dVar) {
        return dVar.k(a.DAY_OF_WEEK, (long) getValue());
    }
}
