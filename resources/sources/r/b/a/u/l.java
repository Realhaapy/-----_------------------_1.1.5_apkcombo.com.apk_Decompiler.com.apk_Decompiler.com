package r.b.a.u;

import java.io.DataInput;
import java.io.DataOutput;
import r.b.a.b;
import r.b.a.x.a;
import r.b.a.x.d;
import r.b.a.x.i;
import r.b.a.x.j;
import r.b.a.x.k;
import r.b.a.x.m;
import r.b.a.x.n;

public enum l implements i {
    BEFORE_AH,
    AH;

    public static l a(int i2) {
        if (i2 == 0) {
            return BEFORE_AH;
        }
        if (i2 == 1) {
            return AH;
        }
        throw new b("HijrahEra not valid");
    }

    static l g(DataInput dataInput) {
        return a(dataInput.readByte());
    }

    private Object writeReplace() {
        return new u((byte) 4, this);
    }

    /* access modifiers changed from: package-private */
    public int c(int i2) {
        return this == AH ? i2 : 1 - i2;
    }

    public n d(i iVar) {
        if (iVar == a.ERA) {
            return n.i(1, 1);
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

    /* access modifiers changed from: package-private */
    public void o(DataOutput dataOutput) {
        dataOutput.writeByte(getValue());
    }

    public d t(d dVar) {
        return dVar.k(a.ERA, (long) getValue());
    }
}
