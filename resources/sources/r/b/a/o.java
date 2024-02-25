package r.b.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import r.b.a.u.h;
import r.b.a.v.j;
import r.b.a.w.c;
import r.b.a.x.b;
import r.b.a.x.d;
import r.b.a.x.f;
import r.b.a.x.i;
import r.b.a.x.k;
import r.b.a.x.l;
import r.b.a.x.m;
import r.b.a.x.n;

public final class o extends c implements d, f, Comparable<o>, Serializable {
    private static final long serialVersionUID = -23038383694477807L;

    /* renamed from: e  reason: collision with root package name */
    private final int f5573e;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0059 */
        static {
            /*
                r.b.a.x.b[] r0 = r.b.a.x.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                r.b.a.x.b r2 = r.b.a.x.b.YEARS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                r.b.a.x.b r3 = r.b.a.x.b.DECADES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0028 }
                r.b.a.x.b r4 = r.b.a.x.b.CENTURIES     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0033 }
                r.b.a.x.b r4 = r.b.a.x.b.MILLENNIA     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x003e }
                r.b.a.x.b r4 = r.b.a.x.b.ERAS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r.b.a.x.a[] r3 = r.b.a.x.a.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                a = r3
                r.b.a.x.a r4 = r.b.a.x.a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x004f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0059 }
                r.b.a.x.a r3 = r.b.a.x.a.YEAR     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0063 }
                r.b.a.x.a r1 = r.b.a.x.a.ERA     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r.b.a.o.a.<clinit>():void");
        }
    }

    static {
        r.b.a.v.c cVar = new r.b.a.v.c();
        cVar.l(r.b.a.x.a.YEAR, 4, 10, j.EXCEEDS_PAD);
        cVar.s();
    }

    private o(int i2) {
        this.f5573e = i2;
    }

    static o A(DataInput dataInput) {
        return x(dataInput.readInt());
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static boolean v(long j2) {
        return (3 & j2) == 0 && (j2 % 100 != 0 || j2 % 400 == 0);
    }

    private Object writeReplace() {
        return new n((byte) 67, this);
    }

    public static o x(int i2) {
        r.b.a.x.a.YEAR.m((long) i2);
        return new o(i2);
    }

    /* renamed from: B */
    public o h(f fVar) {
        return (o) fVar.t(this);
    }

    /* renamed from: C */
    public o k(i iVar, long j2) {
        if (!(iVar instanceof r.b.a.x.a)) {
            return (o) iVar.d(this, j2);
        }
        r.b.a.x.a aVar = (r.b.a.x.a) iVar;
        aVar.m(j2);
        int i2 = a.a[aVar.ordinal()];
        if (i2 == 1) {
            if (this.f5573e < 1) {
                j2 = 1 - j2;
            }
            return x((int) j2);
        } else if (i2 == 2) {
            return x((int) j2);
        } else {
            if (i2 == 3) {
                return n(r.b.a.x.a.ERA) == j2 ? this : x(1 - this.f5573e);
            }
            throw new m("Unsupported field: " + iVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void D(DataOutput dataOutput) {
        dataOutput.writeInt(this.f5573e);
    }

    public n d(i iVar) {
        if (iVar != r.b.a.x.a.YEAR_OF_ERA) {
            return super.d(iVar);
        }
        return n.i(1, this.f5573e <= 0 ? 1000000000 : 999999999);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.f5573e == ((o) obj).f5573e;
    }

    public <R> R f(k<R> kVar) {
        if (kVar == r.b.a.x.j.a()) {
            return r.b.a.u.m.f5618g;
        }
        if (kVar == r.b.a.x.j.e()) {
            return b.YEARS;
        }
        if (kVar == r.b.a.x.j.b() || kVar == r.b.a.x.j.c() || kVar == r.b.a.x.j.f() || kVar == r.b.a.x.j.g() || kVar == r.b.a.x.j.d()) {
            return null;
        }
        return super.f(kVar);
    }

    public int hashCode() {
        return this.f5573e;
    }

    public boolean j(i iVar) {
        return iVar instanceof r.b.a.x.a ? iVar == r.b.a.x.a.YEAR || iVar == r.b.a.x.a.YEAR_OF_ERA || iVar == r.b.a.x.a.ERA : iVar != null && iVar.c(this);
    }

    public int l(i iVar) {
        return d(iVar).a(n(iVar), iVar);
    }

    public long n(i iVar) {
        if (!(iVar instanceof r.b.a.x.a)) {
            return iVar.f(this);
        }
        int i2 = a.a[((r.b.a.x.a) iVar).ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            int i4 = this.f5573e;
            if (i4 < 1) {
                i4 = 1 - i4;
            }
            return (long) i4;
        } else if (i2 == 2) {
            return (long) this.f5573e;
        } else {
            if (i2 == 3) {
                if (this.f5573e < 1) {
                    i3 = 0;
                }
                return (long) i3;
            }
            throw new m("Unsupported field: " + iVar);
        }
    }

    public d t(d dVar) {
        if (h.j(dVar).equals(r.b.a.u.m.f5618g)) {
            return dVar.k(r.b.a.x.a.YEAR, (long) this.f5573e);
        }
        throw new b("Adjustment only supported on ISO date-time");
    }

    public String toString() {
        return Integer.toString(this.f5573e);
    }

    /* renamed from: u */
    public int compareTo(o oVar) {
        return this.f5573e - oVar.f5573e;
    }

    /* renamed from: w */
    public o m(long j2, l lVar) {
        return j2 == Long.MIN_VALUE ? s(Long.MAX_VALUE, lVar).s(1, lVar) : s(-j2, lVar);
    }

    /* renamed from: y */
    public o s(long j2, l lVar) {
        if (!(lVar instanceof b)) {
            return (o) lVar.c(this, j2);
        }
        int i2 = a.b[((b) lVar).ordinal()];
        if (i2 == 1) {
            return z(j2);
        }
        if (i2 == 2) {
            return z(r.b.a.w.d.l(j2, 10));
        }
        if (i2 == 3) {
            return z(r.b.a.w.d.l(j2, 100));
        }
        if (i2 == 4) {
            return z(r.b.a.w.d.l(j2, 1000));
        }
        if (i2 == 5) {
            r.b.a.x.a aVar = r.b.a.x.a.ERA;
            return k(aVar, r.b.a.w.d.k(n(aVar), j2));
        }
        throw new m("Unsupported unit: " + lVar);
    }

    public o z(long j2) {
        return j2 == 0 ? this : x(r.b.a.x.a.YEAR.l(((long) this.f5573e) + j2));
    }
}
