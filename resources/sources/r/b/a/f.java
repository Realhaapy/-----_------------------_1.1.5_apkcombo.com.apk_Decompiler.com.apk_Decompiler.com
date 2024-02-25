package r.b.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import r.b.a.u.b;
import r.b.a.u.m;
import r.b.a.x.d;
import r.b.a.x.e;
import r.b.a.x.h;
import r.b.a.x.i;
import r.b.a.x.j;
import r.b.a.x.k;
import r.b.a.x.l;
import r.b.a.x.n;

public final class f extends b implements d, r.b.a.x.f, Serializable {

    /* renamed from: h  reason: collision with root package name */
    public static final f f5530h = Z(-999999999, 1, 1);

    /* renamed from: i  reason: collision with root package name */
    public static final f f5531i = Z(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* renamed from: e  reason: collision with root package name */
    private final int f5532e;

    /* renamed from: f  reason: collision with root package name */
    private final short f5533f;

    /* renamed from: g  reason: collision with root package name */
    private final short f5534g;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(49:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(52:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0085 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00b7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00c3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00cf */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00db */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e7 */
        static {
            /*
                r.b.a.x.b[] r0 = r.b.a.x.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                r.b.a.x.b r2 = r.b.a.x.b.DAYS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                r.b.a.x.b r3 = r.b.a.x.b.WEEKS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0028 }
                r.b.a.x.b r4 = r.b.a.x.b.MONTHS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0033 }
                r.b.a.x.b r5 = r.b.a.x.b.YEARS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = b     // Catch:{ NoSuchFieldError -> 0x003e }
                r.b.a.x.b r6 = r.b.a.x.b.DECADES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = b     // Catch:{ NoSuchFieldError -> 0x0049 }
                r.b.a.x.b r7 = r.b.a.x.b.CENTURIES     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = b     // Catch:{ NoSuchFieldError -> 0x0054 }
                r.b.a.x.b r8 = r.b.a.x.b.MILLENNIA     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = b     // Catch:{ NoSuchFieldError -> 0x0060 }
                r.b.a.x.b r9 = r.b.a.x.b.ERAS     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r.b.a.x.a[] r8 = r.b.a.x.a.values()
                int r8 = r8.length
                int[] r8 = new int[r8]
                a = r8
                r.b.a.x.a r9 = r.b.a.x.a.DAY_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r8[r9] = r1     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x007b }
                r.b.a.x.a r8 = r.b.a.x.a.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x007b }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r1[r8] = r0     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0085 }
                r.b.a.x.a r1 = r.b.a.x.a.ALIGNED_WEEK_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x008f }
                r.b.a.x.a r1 = r.b.a.x.a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0099 }
                r.b.a.x.a r1 = r.b.a.x.a.DAY_OF_WEEK     // Catch:{ NoSuchFieldError -> 0x0099 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00a3 }
                r.b.a.x.a r1 = r.b.a.x.a.ALIGNED_DAY_OF_WEEK_IN_MONTH     // Catch:{ NoSuchFieldError -> 0x00a3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a3 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x00a3 }
            L_0x00a3:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00ad }
                r.b.a.x.a r1 = r.b.a.x.a.ALIGNED_DAY_OF_WEEK_IN_YEAR     // Catch:{ NoSuchFieldError -> 0x00ad }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ad }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x00ad }
            L_0x00ad:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00b7 }
                r.b.a.x.a r1 = r.b.a.x.a.EPOCH_DAY     // Catch:{ NoSuchFieldError -> 0x00b7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b7 }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x00b7 }
            L_0x00b7:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00c3 }
                r.b.a.x.a r1 = r.b.a.x.a.ALIGNED_WEEK_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x00c3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c3 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c3 }
            L_0x00c3:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00cf }
                r.b.a.x.a r1 = r.b.a.x.a.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x00cf }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cf }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cf }
            L_0x00cf:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00db }
                r.b.a.x.a r1 = r.b.a.x.a.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x00db }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00db }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00db }
            L_0x00db:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00e7 }
                r.b.a.x.a r1 = r.b.a.x.a.YEAR     // Catch:{ NoSuchFieldError -> 0x00e7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e7 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e7 }
            L_0x00e7:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r.b.a.x.a r1 = r.b.a.x.a.ERA     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r.b.a.f.a.<clinit>():void");
        }
    }

    private f(int i2, int i3, int i4) {
        this.f5532e = i2;
        this.f5533f = (short) i3;
        this.f5534g = (short) i4;
    }

    private static f I(int i2, i iVar, int i3) {
        if (i3 <= 28 || i3 <= iVar.c(m.f5618g.z((long) i2))) {
            return new f(i2, iVar.getValue(), i3);
        }
        if (i3 == 29) {
            throw new b("Invalid date 'February 29' as '" + i2 + "' is not a leap year");
        }
        throw new b("Invalid date '" + iVar.name() + " " + i3 + "'");
    }

    public static f J(e eVar) {
        f fVar = (f) eVar.f(j.b());
        if (fVar != null) {
            return fVar;
        }
        throw new b("Unable to obtain LocalDate from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    private int K(i iVar) {
        switch (a.a[((r.b.a.x.a) iVar).ordinal()]) {
            case 1:
                return this.f5534g;
            case 2:
                return O();
            case 3:
                return ((this.f5534g - 1) / 7) + 1;
            case 4:
                int i2 = this.f5532e;
                return i2 >= 1 ? i2 : 1 - i2;
            case 5:
                return N().getValue();
            case 6:
                return ((this.f5534g - 1) % 7) + 1;
            case 7:
                return ((O() - 1) % 7) + 1;
            case 8:
                throw new b("Field too large for an int: " + iVar);
            case 9:
                return ((O() - 1) / 7) + 1;
            case 10:
                return this.f5533f;
            case 11:
                throw new b("Field too large for an int: " + iVar);
            case 12:
                return this.f5532e;
            case 13:
                return this.f5532e >= 1 ? 1 : 0;
            default:
                throw new r.b.a.x.m("Unsupported field: " + iVar);
        }
    }

    private long R() {
        return (((long) this.f5532e) * 12) + ((long) (this.f5533f - 1));
    }

    public static f Z(int i2, int i3, int i4) {
        r.b.a.x.a.YEAR.m((long) i2);
        r.b.a.x.a.MONTH_OF_YEAR.m((long) i3);
        r.b.a.x.a.DAY_OF_MONTH.m((long) i4);
        return I(i2, i.u(i3), i4);
    }

    public static f a0(int i2, i iVar, int i3) {
        r.b.a.x.a.YEAR.m((long) i2);
        r.b.a.w.d.i(iVar, "month");
        r.b.a.x.a.DAY_OF_MONTH.m((long) i3);
        return I(i2, iVar, i3);
    }

    public static f b0(long j2) {
        long j3;
        long j4 = j2;
        r.b.a.x.a.EPOCH_DAY.m(j4);
        long j5 = (j4 + 719528) - 60;
        if (j5 < 0) {
            long j6 = ((j5 + 1) / 146097) - 1;
            j3 = j6 * 400;
            j5 += (-j6) * 146097;
        } else {
            j3 = 0;
        }
        long j7 = ((j5 * 400) + 591) / 146097;
        long j8 = j5 - ((((j7 * 365) + (j7 / 4)) - (j7 / 100)) + (j7 / 400));
        if (j8 < 0) {
            j7--;
            j8 = j5 - ((((365 * j7) + (j7 / 4)) - (j7 / 100)) + (j7 / 400));
        }
        int i2 = (int) j8;
        int i3 = ((i2 * 5) + 2) / 153;
        return new f(r.b.a.x.a.YEAR.l(j7 + j3 + ((long) (i3 / 10))), ((i3 + 2) % 12) + 1, (i2 - (((i3 * 306) + 5) / 10)) + 1);
    }

    public static f c0(int i2, int i3) {
        long j2 = (long) i2;
        r.b.a.x.a.YEAR.m(j2);
        r.b.a.x.a.DAY_OF_YEAR.m((long) i3);
        boolean z = m.f5618g.z(j2);
        if (i3 != 366 || z) {
            i u = i.u(((i3 - 1) / 31) + 1);
            if (i3 > (u.a(z) + u.c(z)) - 1) {
                u = u.v(1);
            }
            return I(i2, u, (i3 - u.a(z)) + 1);
        }
        throw new b("Invalid date 'DayOfYear 366' as '" + i2 + "' is not a leap year");
    }

    static f j0(DataInput dataInput) {
        return Z(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private static f k0(int i2, int i3, int i4) {
        int i5;
        if (i3 != 2) {
            if (i3 == 4 || i3 == 6 || i3 == 9 || i3 == 11) {
                i5 = 30;
            }
            return Z(i2, i3, i4);
        }
        i5 = m.f5618g.z((long) i2) ? 29 : 28;
        i4 = Math.min(i4, i5);
        return Z(i2, i3, i4);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 3, this);
    }

    public long D() {
        long j2 = (long) this.f5532e;
        long j3 = (long) this.f5533f;
        long j4 = (365 * j2) + 0;
        long j5 = (j2 >= 0 ? j4 + (((3 + j2) / 4) - ((99 + j2) / 100)) + ((j2 + 399) / 400) : j4 - (((j2 / -4) - (j2 / -100)) + (j2 / -400))) + (((367 * j3) - 362) / 12) + ((long) (this.f5534g - 1));
        if (j3 > 2) {
            j5--;
            if (!T()) {
                j5--;
            }
        }
        return j5 - 719528;
    }

    /* renamed from: G */
    public g v(h hVar) {
        return g.W(this, hVar);
    }

    /* access modifiers changed from: package-private */
    public int H(f fVar) {
        int i2 = this.f5532e - fVar.f5532e;
        if (i2 != 0) {
            return i2;
        }
        int i3 = this.f5533f - fVar.f5533f;
        return i3 == 0 ? this.f5534g - fVar.f5534g : i3;
    }

    /* renamed from: L */
    public m x() {
        return m.f5618g;
    }

    public int M() {
        return this.f5534g;
    }

    public c N() {
        return c.a(r.b.a.w.d.g(D() + 3, 7) + 1);
    }

    public int O() {
        return (P().a(T()) + this.f5534g) - 1;
    }

    public i P() {
        return i.u(this.f5533f);
    }

    public int Q() {
        return this.f5533f;
    }

    public int S() {
        return this.f5532e;
    }

    public boolean T() {
        return m.f5618g.z((long) this.f5532e);
    }

    public int U() {
        short s2 = this.f5533f;
        return s2 != 2 ? (s2 == 4 || s2 == 6 || s2 == 9 || s2 == 11) ? 30 : 31 : T() ? 29 : 28;
    }

    public int V() {
        return T() ? 366 : 365;
    }

    /* renamed from: W */
    public f m(long j2, l lVar) {
        return j2 == Long.MIN_VALUE ? s(Long.MAX_VALUE, lVar).s(1, lVar) : s(-j2, lVar);
    }

    public f X(long j2) {
        return j2 == Long.MIN_VALUE ? f0(Long.MAX_VALUE).f0(1) : f0(-j2);
    }

    public f Y(long j2) {
        return j2 == Long.MIN_VALUE ? i0(Long.MAX_VALUE).i0(1) : i0(-j2);
    }

    public n d(i iVar) {
        int U;
        if (!(iVar instanceof r.b.a.x.a)) {
            return iVar.h(this);
        }
        r.b.a.x.a aVar = (r.b.a.x.a) iVar;
        if (aVar.a()) {
            int i2 = a.a[aVar.ordinal()];
            if (i2 == 1) {
                U = U();
            } else if (i2 == 2) {
                U = V();
            } else if (i2 == 3) {
                return n.i(1, (P() != i.FEBRUARY || T()) ? 5 : 4);
            } else if (i2 != 4) {
                return iVar.k();
            } else {
                return n.i(1, S() <= 0 ? 1000000000 : 999999999);
            }
            return n.i(1, (long) U);
        }
        throw new r.b.a.x.m("Unsupported field: " + iVar);
    }

    /* renamed from: d0 */
    public f s(long j2, l lVar) {
        if (!(lVar instanceof r.b.a.x.b)) {
            return (f) lVar.c(this, j2);
        }
        switch (a.b[((r.b.a.x.b) lVar).ordinal()]) {
            case 1:
                return f0(j2);
            case 2:
                return h0(j2);
            case 3:
                return g0(j2);
            case 4:
                return i0(j2);
            case 5:
                return i0(r.b.a.w.d.l(j2, 10));
            case 6:
                return i0(r.b.a.w.d.l(j2, 100));
            case 7:
                return i0(r.b.a.w.d.l(j2, 1000));
            case 8:
                r.b.a.x.a aVar = r.b.a.x.a.ERA;
                return k(aVar, r.b.a.w.d.k(n(aVar), j2));
            default:
                throw new r.b.a.x.m("Unsupported unit: " + lVar);
        }
    }

    /* renamed from: e0 */
    public f C(h hVar) {
        return (f) hVar.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && H((f) obj) == 0;
    }

    public <R> R f(k<R> kVar) {
        return kVar == j.b() ? this : super.f(kVar);
    }

    public f f0(long j2) {
        return j2 == 0 ? this : b0(r.b.a.w.d.k(D(), j2));
    }

    public f g0(long j2) {
        if (j2 == 0) {
            return this;
        }
        long j3 = (((long) this.f5532e) * 12) + ((long) (this.f5533f - 1)) + j2;
        return k0(r.b.a.x.a.YEAR.l(r.b.a.w.d.e(j3, 12)), r.b.a.w.d.g(j3, 12) + 1, this.f5534g);
    }

    public f h0(long j2) {
        return f0(r.b.a.w.d.l(j2, 7));
    }

    public int hashCode() {
        int i2 = this.f5532e;
        return (((i2 << 11) + (this.f5533f << 6)) + this.f5534g) ^ (i2 & -2048);
    }

    public f i0(long j2) {
        return j2 == 0 ? this : k0(r.b.a.x.a.YEAR.l(((long) this.f5532e) + j2), this.f5533f, this.f5534g);
    }

    public boolean j(i iVar) {
        return super.j(iVar);
    }

    public int l(i iVar) {
        return iVar instanceof r.b.a.x.a ? K(iVar) : super.l(iVar);
    }

    /* renamed from: l0 */
    public f h(r.b.a.x.f fVar) {
        return fVar instanceof f ? (f) fVar : (f) fVar.t(this);
    }

    /* renamed from: m0 */
    public f k(i iVar, long j2) {
        if (!(iVar instanceof r.b.a.x.a)) {
            return (f) iVar.d(this, j2);
        }
        r.b.a.x.a aVar = (r.b.a.x.a) iVar;
        aVar.m(j2);
        switch (a.a[aVar.ordinal()]) {
            case 1:
                return n0((int) j2);
            case 2:
                return o0((int) j2);
            case 3:
                return h0(j2 - n(r.b.a.x.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.f5532e < 1) {
                    j2 = 1 - j2;
                }
                return q0((int) j2);
            case 5:
                return f0(j2 - ((long) N().getValue()));
            case 6:
                return f0(j2 - n(r.b.a.x.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return f0(j2 - n(r.b.a.x.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return b0(j2);
            case 9:
                return h0(j2 - n(r.b.a.x.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                return p0((int) j2);
            case 11:
                return g0(j2 - n(r.b.a.x.a.PROLEPTIC_MONTH));
            case 12:
                return q0((int) j2);
            case 13:
                return n(r.b.a.x.a.ERA) == j2 ? this : q0(1 - this.f5532e);
            default:
                throw new r.b.a.x.m("Unsupported field: " + iVar);
        }
    }

    public long n(i iVar) {
        return iVar instanceof r.b.a.x.a ? iVar == r.b.a.x.a.EPOCH_DAY ? D() : iVar == r.b.a.x.a.PROLEPTIC_MONTH ? R() : (long) K(iVar) : iVar.f(this);
    }

    public f n0(int i2) {
        return this.f5534g == i2 ? this : Z(this.f5532e, this.f5533f, i2);
    }

    public f o0(int i2) {
        return O() == i2 ? this : c0(this.f5532e, i2);
    }

    public f p0(int i2) {
        if (this.f5533f == i2) {
            return this;
        }
        r.b.a.x.a.MONTH_OF_YEAR.m((long) i2);
        return k0(this.f5532e, i2, this.f5534g);
    }

    public f q0(int i2) {
        if (this.f5532e == i2) {
            return this;
        }
        r.b.a.x.a.YEAR.m((long) i2);
        return k0(i2, this.f5533f, this.f5534g);
    }

    /* access modifiers changed from: package-private */
    public void r0(DataOutput dataOutput) {
        dataOutput.writeInt(this.f5532e);
        dataOutput.writeByte(this.f5533f);
        dataOutput.writeByte(this.f5534g);
    }

    public d t(d dVar) {
        return super.t(dVar);
    }

    public String toString() {
        int i2;
        int i3 = this.f5532e;
        short s2 = this.f5533f;
        short s3 = this.f5534g;
        int abs = Math.abs(i3);
        StringBuilder sb = new StringBuilder(10);
        if (abs < 1000) {
            if (i3 < 0) {
                sb.append(i3 - 10000);
                i2 = 1;
            } else {
                sb.append(i3 + 10000);
                i2 = 0;
            }
            sb.deleteCharAt(i2);
        } else {
            if (i3 > 9999) {
                sb.append('+');
            }
            sb.append(i3);
        }
        String str = "-0";
        sb.append(s2 < 10 ? str : "-");
        sb.append(s2);
        if (s3 >= 10) {
            str = "-";
        }
        sb.append(str);
        sb.append(s3);
        return sb.toString();
    }

    /* renamed from: w */
    public int compareTo(b bVar) {
        return bVar instanceof f ? H((f) bVar) : super.compareTo(bVar);
    }

    public r.b.a.u.i y() {
        return super.y();
    }

    public boolean z(b bVar) {
        return bVar instanceof f ? H((f) bVar) < 0 : super.z(bVar);
    }
}
