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

public final class p extends c implements d, f, Comparable<p>, Serializable {
    private static final long serialVersionUID = 4183400860270640070L;

    /* renamed from: e  reason: collision with root package name */
    private final int f5574e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5575f;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|(2:19|20)|21|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0078 */
        static {
            /*
                r.b.a.x.b[] r0 = r.b.a.x.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                r.b.a.x.b r2 = r.b.a.x.b.MONTHS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                r.b.a.x.b r3 = r.b.a.x.b.YEARS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0028 }
                r.b.a.x.b r4 = r.b.a.x.b.DECADES     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0033 }
                r.b.a.x.b r5 = r.b.a.x.b.CENTURIES     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = b     // Catch:{ NoSuchFieldError -> 0x003e }
                r.b.a.x.b r6 = r.b.a.x.b.MILLENNIA     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r5 = b     // Catch:{ NoSuchFieldError -> 0x0049 }
                r.b.a.x.b r6 = r.b.a.x.b.ERAS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r7 = 6
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r.b.a.x.a[] r5 = r.b.a.x.a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                a = r5
                r.b.a.x.a r6 = r.b.a.x.a.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x005a }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0064 }
                r.b.a.x.a r5 = r.b.a.x.a.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006e }
                r.b.a.x.a r1 = r.b.a.x.a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0078 }
                r.b.a.x.a r1 = r.b.a.x.a.YEAR     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0082 }
                r.b.a.x.a r1 = r.b.a.x.a.ERA     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r.b.a.p.a.<clinit>():void");
        }
    }

    static {
        r.b.a.v.c cVar = new r.b.a.v.c();
        cVar.l(r.b.a.x.a.YEAR, 4, 10, j.EXCEEDS_PAD);
        cVar.e('-');
        cVar.k(r.b.a.x.a.MONTH_OF_YEAR, 2);
        cVar.s();
    }

    private p(int i2, int i3) {
        this.f5574e = i2;
        this.f5575f = i3;
    }

    static p C(DataInput dataInput) {
        return y(dataInput.readInt(), dataInput.readByte());
    }

    private p D(int i2, int i3) {
        return (this.f5574e == i2 && this.f5575f == i3) ? this : new p(i2, i3);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private long v() {
        return (((long) this.f5574e) * 12) + ((long) (this.f5575f - 1));
    }

    private Object writeReplace() {
        return new n((byte) 68, this);
    }

    public static p y(int i2, int i3) {
        r.b.a.x.a.YEAR.m((long) i2);
        r.b.a.x.a.MONTH_OF_YEAR.m((long) i3);
        return new p(i2, i3);
    }

    public p A(long j2) {
        if (j2 == 0) {
            return this;
        }
        long j3 = (((long) this.f5574e) * 12) + ((long) (this.f5575f - 1)) + j2;
        return D(r.b.a.x.a.YEAR.l(r.b.a.w.d.e(j3, 12)), r.b.a.w.d.g(j3, 12) + 1);
    }

    public p B(long j2) {
        return j2 == 0 ? this : D(r.b.a.x.a.YEAR.l(((long) this.f5574e) + j2), this.f5575f);
    }

    /* renamed from: E */
    public p h(f fVar) {
        return (p) fVar.t(this);
    }

    /* renamed from: F */
    public p k(i iVar, long j2) {
        if (!(iVar instanceof r.b.a.x.a)) {
            return (p) iVar.d(this, j2);
        }
        r.b.a.x.a aVar = (r.b.a.x.a) iVar;
        aVar.m(j2);
        int i2 = a.a[aVar.ordinal()];
        if (i2 == 1) {
            return G((int) j2);
        }
        if (i2 == 2) {
            return A(j2 - n(r.b.a.x.a.PROLEPTIC_MONTH));
        }
        if (i2 == 3) {
            if (this.f5574e < 1) {
                j2 = 1 - j2;
            }
            return H((int) j2);
        } else if (i2 == 4) {
            return H((int) j2);
        } else {
            if (i2 == 5) {
                return n(r.b.a.x.a.ERA) == j2 ? this : H(1 - this.f5574e);
            }
            throw new m("Unsupported field: " + iVar);
        }
    }

    public p G(int i2) {
        r.b.a.x.a.MONTH_OF_YEAR.m((long) i2);
        return D(this.f5574e, i2);
    }

    public p H(int i2) {
        r.b.a.x.a.YEAR.m((long) i2);
        return D(i2, this.f5575f);
    }

    /* access modifiers changed from: package-private */
    public void I(DataOutput dataOutput) {
        dataOutput.writeInt(this.f5574e);
        dataOutput.writeByte(this.f5575f);
    }

    public n d(i iVar) {
        if (iVar != r.b.a.x.a.YEAR_OF_ERA) {
            return super.d(iVar);
        }
        return n.i(1, w() <= 0 ? 1000000000 : 999999999);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f5574e == pVar.f5574e && this.f5575f == pVar.f5575f;
    }

    public <R> R f(k<R> kVar) {
        if (kVar == r.b.a.x.j.a()) {
            return r.b.a.u.m.f5618g;
        }
        if (kVar == r.b.a.x.j.e()) {
            return b.MONTHS;
        }
        if (kVar == r.b.a.x.j.b() || kVar == r.b.a.x.j.c() || kVar == r.b.a.x.j.f() || kVar == r.b.a.x.j.g() || kVar == r.b.a.x.j.d()) {
            return null;
        }
        return super.f(kVar);
    }

    public int hashCode() {
        return this.f5574e ^ (this.f5575f << 27);
    }

    public boolean j(i iVar) {
        return iVar instanceof r.b.a.x.a ? iVar == r.b.a.x.a.YEAR || iVar == r.b.a.x.a.MONTH_OF_YEAR || iVar == r.b.a.x.a.PROLEPTIC_MONTH || iVar == r.b.a.x.a.YEAR_OF_ERA || iVar == r.b.a.x.a.ERA : iVar != null && iVar.c(this);
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
        int i4 = 1;
        if (i3 == 1) {
            i2 = this.f5575f;
        } else if (i3 == 2) {
            return v();
        } else {
            if (i3 == 3) {
                int i5 = this.f5574e;
                if (i5 < 1) {
                    i5 = 1 - i5;
                }
                return (long) i5;
            } else if (i3 == 4) {
                i2 = this.f5574e;
            } else if (i3 == 5) {
                if (this.f5574e < 1) {
                    i4 = 0;
                }
                return (long) i4;
            } else {
                throw new m("Unsupported field: " + iVar);
            }
        }
        return (long) i2;
    }

    public d t(d dVar) {
        if (h.j(dVar).equals(r.b.a.u.m.f5618g)) {
            return dVar.k(r.b.a.x.a.PROLEPTIC_MONTH, v());
        }
        throw new b("Adjustment only supported on ISO date-time");
    }

    public String toString() {
        int i2;
        int abs = Math.abs(this.f5574e);
        StringBuilder sb = new StringBuilder(9);
        if (abs < 1000) {
            int i3 = this.f5574e;
            if (i3 < 0) {
                sb.append(i3 - 10000);
                i2 = 1;
            } else {
                sb.append(i3 + 10000);
                i2 = 0;
            }
            sb.deleteCharAt(i2);
        } else {
            sb.append(this.f5574e);
        }
        sb.append(this.f5575f < 10 ? "-0" : "-");
        sb.append(this.f5575f);
        return sb.toString();
    }

    /* renamed from: u */
    public int compareTo(p pVar) {
        int i2 = this.f5574e - pVar.f5574e;
        return i2 == 0 ? this.f5575f - pVar.f5575f : i2;
    }

    public int w() {
        return this.f5574e;
    }

    /* renamed from: x */
    public p m(long j2, l lVar) {
        return j2 == Long.MIN_VALUE ? s(Long.MAX_VALUE, lVar).s(1, lVar) : s(-j2, lVar);
    }

    /* renamed from: z */
    public p s(long j2, l lVar) {
        if (!(lVar instanceof b)) {
            return (p) lVar.c(this, j2);
        }
        switch (a.b[((b) lVar).ordinal()]) {
            case 1:
                return A(j2);
            case 2:
                return B(j2);
            case 3:
                return B(r.b.a.w.d.l(j2, 10));
            case 4:
                return B(r.b.a.w.d.l(j2, 100));
            case 5:
                return B(r.b.a.w.d.l(j2, 1000));
            case 6:
                r.b.a.x.a aVar = r.b.a.x.a.ERA;
                return k(aVar, r.b.a.w.d.k(n(aVar), j2));
            default:
                throw new m("Unsupported unit: " + lVar);
        }
    }
}
