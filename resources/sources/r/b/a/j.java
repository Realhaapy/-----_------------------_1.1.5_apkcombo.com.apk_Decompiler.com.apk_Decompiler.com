package r.b.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import r.b.a.u.h;
import r.b.a.u.m;
import r.b.a.w.c;
import r.b.a.w.d;
import r.b.a.x.e;
import r.b.a.x.f;
import r.b.a.x.i;
import r.b.a.x.k;
import r.b.a.x.n;

public final class j extends c implements e, f, Comparable<j>, Serializable {
    private static final long serialVersionUID = -939150713474957432L;

    /* renamed from: e  reason: collision with root package name */
    private final int f5561e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5562f;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                r.b.a.x.a[] r0 = r.b.a.x.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                r.b.a.x.a r1 = r.b.a.x.a.DAY_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                r.b.a.x.a r1 = r.b.a.x.a.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r.b.a.j.a.<clinit>():void");
        }
    }

    static {
        r.b.a.v.c cVar = new r.b.a.v.c();
        cVar.f("--");
        cVar.k(r.b.a.x.a.MONTH_OF_YEAR, 2);
        cVar.e('-');
        cVar.k(r.b.a.x.a.DAY_OF_MONTH, 2);
        cVar.s();
    }

    private j(int i2, int i3) {
        this.f5561e = i2;
        this.f5562f = i3;
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static j w(int i2, int i3) {
        return x(i.u(i2), i3);
    }

    private Object writeReplace() {
        return new n((byte) 64, this);
    }

    public static j x(i iVar, int i2) {
        d.i(iVar, "month");
        r.b.a.x.a.DAY_OF_MONTH.m((long) i2);
        if (i2 <= iVar.g()) {
            return new j(iVar.getValue(), i2);
        }
        throw new b("Illegal value for DayOfMonth field, value " + i2 + " is not valid for month " + iVar.name());
    }

    static j y(DataInput dataInput) {
        return w(dataInput.readByte(), dataInput.readByte());
    }

    public n d(i iVar) {
        return iVar == r.b.a.x.a.MONTH_OF_YEAR ? iVar.k() : iVar == r.b.a.x.a.DAY_OF_MONTH ? n.j(1, (long) v().o(), (long) v().g()) : super.d(iVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f5561e == jVar.f5561e && this.f5562f == jVar.f5562f;
    }

    public <R> R f(k<R> kVar) {
        return kVar == r.b.a.x.j.a() ? m.f5618g : super.f(kVar);
    }

    public int hashCode() {
        return (this.f5561e << 6) + this.f5562f;
    }

    public boolean j(i iVar) {
        return iVar instanceof r.b.a.x.a ? iVar == r.b.a.x.a.MONTH_OF_YEAR || iVar == r.b.a.x.a.DAY_OF_MONTH : iVar != null && iVar.c(this);
    }

    public int l(i iVar) {
        return d(iVar).a(n(iVar), iVar);
    }

    public long n(i iVar) {
        int i2;
        if (!(iVar instanceof r.b.a.x.a)) {
            return iVar.f(this);
        }
        int i3 = a.a[((r.b.a.x.a) iVar).ordinal()];
        if (i3 == 1) {
            i2 = this.f5562f;
        } else if (i3 == 2) {
            i2 = this.f5561e;
        } else {
            throw new r.b.a.x.m("Unsupported field: " + iVar);
        }
        return (long) i2;
    }

    public r.b.a.x.d t(r.b.a.x.d dVar) {
        if (h.j(dVar).equals(m.f5618g)) {
            r.b.a.x.d k2 = dVar.k(r.b.a.x.a.MONTH_OF_YEAR, (long) this.f5561e);
            r.b.a.x.a aVar = r.b.a.x.a.DAY_OF_MONTH;
            return k2.k(aVar, Math.min(k2.d(aVar).c(), (long) this.f5562f));
        }
        throw new b("Adjustment only supported on ISO date-time");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        sb.append(this.f5561e < 10 ? "0" : "");
        sb.append(this.f5561e);
        sb.append(this.f5562f < 10 ? "-0" : "-");
        sb.append(this.f5562f);
        return sb.toString();
    }

    /* renamed from: u */
    public int compareTo(j jVar) {
        int i2 = this.f5561e - jVar.f5561e;
        return i2 == 0 ? this.f5562f - jVar.f5562f : i2;
    }

    public i v() {
        return i.u(this.f5561e);
    }

    /* access modifiers changed from: package-private */
    public void z(DataOutput dataOutput) {
        dataOutput.writeByte(this.f5561e);
        dataOutput.writeByte(this.f5562f);
    }
}
