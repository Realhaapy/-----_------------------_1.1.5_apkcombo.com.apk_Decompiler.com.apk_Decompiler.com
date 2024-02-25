package r.b.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import r.b.a.w.c;
import r.b.a.x.b;
import r.b.a.x.d;
import r.b.a.x.f;
import r.b.a.x.i;
import r.b.a.x.j;
import r.b.a.x.k;
import r.b.a.x.l;
import r.b.a.x.m;
import r.b.a.x.n;

public final class e extends c implements d, f, Comparable<e>, Serializable {

    /* renamed from: g  reason: collision with root package name */
    public static final e f5527g = new e(0, 0);
    private static final long serialVersionUID = -665713676816604388L;

    /* renamed from: e  reason: collision with root package name */
    private final long f5528e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5529f;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0085 */
        static {
            /*
                r.b.a.x.b[] r0 = r.b.a.x.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                r.b.a.x.b r2 = r.b.a.x.b.NANOS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                r.b.a.x.b r3 = r.b.a.x.b.MICROS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0028 }
                r.b.a.x.b r4 = r.b.a.x.b.MILLIS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0033 }
                r.b.a.x.b r5 = r.b.a.x.b.SECONDS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x003e }
                r.b.a.x.b r5 = r.b.a.x.b.MINUTES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r6 = 5
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0049 }
                r.b.a.x.b r5 = r.b.a.x.b.HOURS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6 = 6
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0054 }
                r.b.a.x.b r5 = r.b.a.x.b.HALF_DAYS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r6 = 7
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0060 }
                r.b.a.x.b r5 = r.b.a.x.b.DAYS     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r6 = 8
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r.b.a.x.a[] r4 = r.b.a.x.a.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                a = r4
                r.b.a.x.a r5 = r.b.a.x.a.NANO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x007b }
                r.b.a.x.a r4 = r.b.a.x.a.MICRO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x007b }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0085 }
                r.b.a.x.a r1 = r.b.a.x.a.MILLI_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x008f }
                r.b.a.x.a r1 = r.b.a.x.a.INSTANT_SECONDS     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r.b.a.e.a.<clinit>():void");
        }
    }

    static {
        C(-31557014167219200L, 0);
        C(31556889864403199L, 999999999);
    }

    private e(long j2, int i2) {
        this.f5528e = j2;
        this.f5529f = i2;
    }

    public static e A(long j2) {
        return v(r.b.a.w.d.e(j2, 1000), r.b.a.w.d.g(j2, 1000) * 1000000);
    }

    public static e B(long j2) {
        return v(j2, 0);
    }

    public static e C(long j2, long j3) {
        return v(r.b.a.w.d.k(j2, r.b.a.w.d.e(j3, 1000000000)), r.b.a.w.d.g(j3, 1000000000));
    }

    private e D(long j2, long j3) {
        if ((j2 | j3) == 0) {
            return this;
        }
        return C(r.b.a.w.d.k(r.b.a.w.d.k(this.f5528e, j2), j3 / 1000000000), ((long) this.f5529f) + (j3 % 1000000000));
    }

    static e I(DataInput dataInput) {
        return C(dataInput.readLong(), (long) dataInput.readInt());
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private static e v(long j2, int i2) {
        if ((((long) i2) | j2) == 0) {
            return f5527g;
        }
        if (j2 >= -31557014167219200L && j2 <= 31556889864403199L) {
            return new e(j2, i2);
        }
        throw new b("Instant exceeds minimum or maximum instant");
    }

    public static e w(r.b.a.x.e eVar) {
        try {
            return C(eVar.n(r.b.a.x.a.INSTANT_SECONDS), (long) eVar.l(r.b.a.x.a.NANO_OF_SECOND));
        } catch (b e2) {
            throw new b("Unable to obtain Instant from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName(), e2);
        }
    }

    private Object writeReplace() {
        return new n((byte) 2, this);
    }

    /* renamed from: E */
    public e s(long j2, l lVar) {
        if (!(lVar instanceof b)) {
            return (e) lVar.c(this, j2);
        }
        switch (a.b[((b) lVar).ordinal()]) {
            case 1:
                return G(j2);
            case 2:
                return D(j2 / 1000000, (j2 % 1000000) * 1000);
            case 3:
                return F(j2);
            case 4:
                return H(j2);
            case 5:
                return H(r.b.a.w.d.l(j2, 60));
            case 6:
                return H(r.b.a.w.d.l(j2, 3600));
            case 7:
                return H(r.b.a.w.d.l(j2, 43200));
            case 8:
                return H(r.b.a.w.d.l(j2, 86400));
            default:
                throw new m("Unsupported unit: " + lVar);
        }
    }

    public e F(long j2) {
        return D(j2 / 1000, (j2 % 1000) * 1000000);
    }

    public e G(long j2) {
        return D(0, j2);
    }

    public e H(long j2) {
        return D(j2, 0);
    }

    public long J() {
        long j2 = this.f5528e;
        return j2 >= 0 ? r.b.a.w.d.k(r.b.a.w.d.m(j2, 1000), (long) (this.f5529f / 1000000)) : r.b.a.w.d.o(r.b.a.w.d.m(j2 + 1, 1000), 1000 - ((long) (this.f5529f / 1000000)));
    }

    /* renamed from: K */
    public e h(f fVar) {
        return (e) fVar.t(this);
    }

    /* renamed from: L */
    public e k(i iVar, long j2) {
        if (!(iVar instanceof r.b.a.x.a)) {
            return (e) iVar.d(this, j2);
        }
        r.b.a.x.a aVar = (r.b.a.x.a) iVar;
        aVar.m(j2);
        int i2 = a.a[aVar.ordinal()];
        if (i2 == 1) {
            return j2 != ((long) this.f5529f) ? v(this.f5528e, (int) j2) : this;
        }
        if (i2 == 2) {
            int i3 = ((int) j2) * 1000;
            return i3 != this.f5529f ? v(this.f5528e, i3) : this;
        } else if (i2 == 3) {
            int i4 = ((int) j2) * 1000000;
            return i4 != this.f5529f ? v(this.f5528e, i4) : this;
        } else if (i2 == 4) {
            return j2 != this.f5528e ? v(j2, this.f5529f) : this;
        } else {
            throw new m("Unsupported field: " + iVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void M(DataOutput dataOutput) {
        dataOutput.writeLong(this.f5528e);
        dataOutput.writeInt(this.f5529f);
    }

    public n d(i iVar) {
        return super.d(iVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f5528e == eVar.f5528e && this.f5529f == eVar.f5529f;
    }

    public <R> R f(k<R> kVar) {
        if (kVar == j.e()) {
            return b.NANOS;
        }
        if (kVar == j.b() || kVar == j.c() || kVar == j.a() || kVar == j.g() || kVar == j.f() || kVar == j.d()) {
            return null;
        }
        return kVar.a(this);
    }

    public int hashCode() {
        long j2 = this.f5528e;
        return ((int) (j2 ^ (j2 >>> 32))) + (this.f5529f * 51);
    }

    public boolean j(i iVar) {
        return iVar instanceof r.b.a.x.a ? iVar == r.b.a.x.a.INSTANT_SECONDS || iVar == r.b.a.x.a.NANO_OF_SECOND || iVar == r.b.a.x.a.MICRO_OF_SECOND || iVar == r.b.a.x.a.MILLI_OF_SECOND : iVar != null && iVar.c(this);
    }

    public int l(i iVar) {
        if (!(iVar instanceof r.b.a.x.a)) {
            return d(iVar).a(iVar.f(this), iVar);
        }
        int i2 = a.a[((r.b.a.x.a) iVar).ordinal()];
        if (i2 == 1) {
            return this.f5529f;
        }
        if (i2 == 2) {
            return this.f5529f / 1000;
        }
        if (i2 == 3) {
            return this.f5529f / 1000000;
        }
        throw new m("Unsupported field: " + iVar);
    }

    public long n(i iVar) {
        int i2;
        if (!(iVar instanceof r.b.a.x.a)) {
            return iVar.f(this);
        }
        int i3 = a.a[((r.b.a.x.a) iVar).ordinal()];
        if (i3 == 1) {
            i2 = this.f5529f;
        } else if (i3 == 2) {
            i2 = this.f5529f / 1000;
        } else if (i3 == 3) {
            i2 = this.f5529f / 1000000;
        } else if (i3 == 4) {
            return this.f5528e;
        } else {
            throw new m("Unsupported field: " + iVar);
        }
        return (long) i2;
    }

    public d t(d dVar) {
        return dVar.k(r.b.a.x.a.INSTANT_SECONDS, this.f5528e).k(r.b.a.x.a.NANO_OF_SECOND, (long) this.f5529f);
    }

    public String toString() {
        return r.b.a.v.b.f5665l.b(this);
    }

    /* renamed from: u */
    public int compareTo(e eVar) {
        int b = r.b.a.w.d.b(this.f5528e, eVar.f5528e);
        return b != 0 ? b : this.f5529f - eVar.f5529f;
    }

    public long x() {
        return this.f5528e;
    }

    public int y() {
        return this.f5529f;
    }

    /* renamed from: z */
    public e m(long j2, l lVar) {
        return j2 == Long.MIN_VALUE ? s(Long.MAX_VALUE, lVar).s(1, lVar) : s(-j2, lVar);
    }
}
