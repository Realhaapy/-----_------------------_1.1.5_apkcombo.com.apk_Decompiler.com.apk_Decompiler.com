package r.b.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import r.b.a.w.c;
import r.b.a.x.b;
import r.b.a.x.d;
import r.b.a.x.e;
import r.b.a.x.f;
import r.b.a.x.i;
import r.b.a.x.j;
import r.b.a.x.k;
import r.b.a.x.l;
import r.b.a.x.m;
import r.b.a.x.n;

public final class h extends c implements d, f, Comparable<h>, Serializable {

    /* renamed from: i  reason: collision with root package name */
    public static final h f5540i;

    /* renamed from: j  reason: collision with root package name */
    public static final h f5541j = new h(23, 59, 59, 999999999);

    /* renamed from: k  reason: collision with root package name */
    private static final h[] f5542k = new h[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* renamed from: e  reason: collision with root package name */
    private final byte f5543e;

    /* renamed from: f  reason: collision with root package name */
    private final byte f5544f;

    /* renamed from: g  reason: collision with root package name */
    private final byte f5545g;

    /* renamed from: h  reason: collision with root package name */
    private final int f5546h;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|(3:57|58|60)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(50:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(52:0|1|2|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(53:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x008d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0097 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00a1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00dd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00f5 */
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
                r4 = 5
                int[] r5 = b     // Catch:{ NoSuchFieldError -> 0x003e }
                r.b.a.x.b r6 = r.b.a.x.b.MINUTES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = b     // Catch:{ NoSuchFieldError -> 0x0049 }
                r.b.a.x.b r7 = r.b.a.x.b.HOURS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = b     // Catch:{ NoSuchFieldError -> 0x0054 }
                r.b.a.x.b r8 = r.b.a.x.b.HALF_DAYS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r.b.a.x.a[] r7 = r.b.a.x.a.values()
                int r7 = r7.length
                int[] r7 = new int[r7]
                a = r7
                r.b.a.x.a r8 = r.b.a.x.a.NANO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r7[r8] = r1     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x006f }
                r.b.a.x.a r7 = r.b.a.x.a.NANO_OF_DAY     // Catch:{ NoSuchFieldError -> 0x006f }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r1[r7] = r0     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0079 }
                r.b.a.x.a r1 = r.b.a.x.a.MICRO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0083 }
                r.b.a.x.a r1 = r.b.a.x.a.MICRO_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x008d }
                r.b.a.x.a r1 = r.b.a.x.a.MILLI_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0097 }
                r.b.a.x.a r1 = r.b.a.x.a.MILLI_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0097 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0097 }
            L_0x0097:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00a1 }
                r.b.a.x.a r1 = r.b.a.x.a.SECOND_OF_MINUTE     // Catch:{ NoSuchFieldError -> 0x00a1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a1 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x00a1 }
            L_0x00a1:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00ad }
                r.b.a.x.a r1 = r.b.a.x.a.SECOND_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00ad }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ad }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00ad }
            L_0x00ad:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00b9 }
                r.b.a.x.a r1 = r.b.a.x.a.MINUTE_OF_HOUR     // Catch:{ NoSuchFieldError -> 0x00b9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b9 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b9 }
            L_0x00b9:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00c5 }
                r.b.a.x.a r1 = r.b.a.x.a.MINUTE_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00c5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c5 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c5 }
            L_0x00c5:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00d1 }
                r.b.a.x.a r1 = r.b.a.x.a.HOUR_OF_AMPM     // Catch:{ NoSuchFieldError -> 0x00d1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d1 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d1 }
            L_0x00d1:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00dd }
                r.b.a.x.a r1 = r.b.a.x.a.CLOCK_HOUR_OF_AMPM     // Catch:{ NoSuchFieldError -> 0x00dd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dd }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00dd }
            L_0x00dd:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r.b.a.x.a r1 = r.b.a.x.a.HOUR_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00f5 }
                r.b.a.x.a r1 = r.b.a.x.a.CLOCK_HOUR_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00f5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f5 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f5 }
            L_0x00f5:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0101 }
                r.b.a.x.a r1 = r.b.a.x.a.AMPM_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0101 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0101 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0101 }
            L_0x0101:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r.b.a.h.a.<clinit>():void");
        }
    }

    static {
        int i2 = 0;
        while (true) {
            h[] hVarArr = f5542k;
            if (i2 < hVarArr.length) {
                hVarArr[i2] = new h(i2, 0, 0, 0);
                i2++;
            } else {
                h hVar = hVarArr[0];
                h hVar2 = hVarArr[12];
                f5540i = hVarArr[0];
                return;
            }
        }
    }

    private h(int i2, int i3, int i4, int i5) {
        this.f5543e = (byte) i2;
        this.f5544f = (byte) i3;
        this.f5545g = (byte) i4;
        this.f5546h = i5;
    }

    public static h E(int i2, int i3) {
        r.b.a.x.a.HOUR_OF_DAY.m((long) i2);
        if (i3 == 0) {
            return f5542k[i2];
        }
        r.b.a.x.a.MINUTE_OF_HOUR.m((long) i3);
        return new h(i2, i3, 0, 0);
    }

    public static h F(int i2, int i3, int i4) {
        r.b.a.x.a.HOUR_OF_DAY.m((long) i2);
        if ((i3 | i4) == 0) {
            return f5542k[i2];
        }
        r.b.a.x.a.MINUTE_OF_HOUR.m((long) i3);
        r.b.a.x.a.SECOND_OF_MINUTE.m((long) i4);
        return new h(i2, i3, i4, 0);
    }

    public static h G(int i2, int i3, int i4, int i5) {
        r.b.a.x.a.HOUR_OF_DAY.m((long) i2);
        r.b.a.x.a.MINUTE_OF_HOUR.m((long) i3);
        r.b.a.x.a.SECOND_OF_MINUTE.m((long) i4);
        r.b.a.x.a.NANO_OF_SECOND.m((long) i5);
        return w(i2, i3, i4, i5);
    }

    public static h H(long j2) {
        r.b.a.x.a.NANO_OF_DAY.m(j2);
        int i2 = (int) (j2 / 3600000000000L);
        long j3 = j2 - (((long) i2) * 3600000000000L);
        int i3 = (int) (j3 / 60000000000L);
        long j4 = j3 - (((long) i3) * 60000000000L);
        int i4 = (int) (j4 / 1000000000);
        return w(i2, i3, i4, (int) (j4 - (((long) i4) * 1000000000)));
    }

    public static h I(long j2) {
        r.b.a.x.a.SECOND_OF_DAY.m(j2);
        int i2 = (int) (j2 / 3600);
        long j3 = j2 - ((long) (i2 * 3600));
        int i3 = (int) (j3 / 60);
        return w(i2, i3, (int) (j3 - ((long) (i3 * 60))), 0);
    }

    static h J(long j2, int i2) {
        r.b.a.x.a.SECOND_OF_DAY.m(j2);
        r.b.a.x.a.NANO_OF_SECOND.m((long) i2);
        int i3 = (int) (j2 / 3600);
        long j3 = j2 - ((long) (i3 * 3600));
        int i4 = (int) (j3 / 60);
        return w(i3, i4, (int) (j3 - ((long) (i4 * 60))), i2);
    }

    static h P(DataInput dataInput) {
        byte b;
        int i2;
        int readByte = dataInput.readByte();
        byte b2 = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            b = 0;
        } else {
            byte readByte2 = dataInput.readByte();
            if (readByte2 < 0) {
                int i3 = ~readByte2;
                i2 = 0;
                b2 = i3;
                b = 0;
            } else {
                byte readByte3 = dataInput.readByte();
                if (readByte3 < 0) {
                    b = ~readByte3;
                    b2 = readByte2;
                } else {
                    int readInt = dataInput.readInt();
                    b = readByte3;
                    byte b3 = readByte2;
                    i2 = readInt;
                    b2 = b3;
                }
            }
            return G(readByte, b2, b, i2);
        }
        i2 = 0;
        return G(readByte, b2, b, i2);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private static h w(int i2, int i3, int i4, int i5) {
        return ((i3 | i4) | i5) == 0 ? f5542k[i2] : new h(i2, i3, i4, i5);
    }

    private Object writeReplace() {
        return new n((byte) 5, this);
    }

    public static h x(e eVar) {
        h hVar = (h) eVar.f(j.c());
        if (hVar != null) {
            return hVar;
        }
        throw new b("Unable to obtain LocalTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    private int y(i iVar) {
        switch (a.a[((r.b.a.x.a) iVar).ordinal()]) {
            case 1:
                return this.f5546h;
            case 2:
                throw new b("Field too large for an int: " + iVar);
            case 3:
                return this.f5546h / 1000;
            case 4:
                throw new b("Field too large for an int: " + iVar);
            case 5:
                return this.f5546h / 1000000;
            case 6:
                return (int) (Q() / 1000000);
            case 7:
                return this.f5545g;
            case 8:
                return R();
            case 9:
                return this.f5544f;
            case 10:
                return (this.f5543e * 60) + this.f5544f;
            case 11:
                return this.f5543e % 12;
            case 12:
                int i2 = this.f5543e % 12;
                if (i2 % 12 == 0) {
                    return 12;
                }
                return i2;
            case 13:
                return this.f5543e;
            case 14:
                byte b = this.f5543e;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.f5543e / 12;
            default:
                throw new m("Unsupported field: " + iVar);
        }
    }

    public int A() {
        return this.f5544f;
    }

    public int B() {
        return this.f5546h;
    }

    public int C() {
        return this.f5545g;
    }

    /* renamed from: D */
    public h m(long j2, l lVar) {
        return j2 == Long.MIN_VALUE ? s(Long.MAX_VALUE, lVar).s(1, lVar) : s(-j2, lVar);
    }

    /* renamed from: K */
    public h s(long j2, l lVar) {
        if (!(lVar instanceof b)) {
            return (h) lVar.c(this, j2);
        }
        switch (a.b[((b) lVar).ordinal()]) {
            case 1:
                return N(j2);
            case 2:
                return N((j2 % 86400000000L) * 1000);
            case 3:
                return N((j2 % 86400000) * 1000000);
            case 4:
                return O(j2);
            case 5:
                return M(j2);
            case 6:
                return L(j2);
            case 7:
                return L((j2 % 2) * 12);
            default:
                throw new m("Unsupported unit: " + lVar);
        }
    }

    public h L(long j2) {
        return j2 == 0 ? this : w(((((int) (j2 % 24)) + this.f5543e) + 24) % 24, this.f5544f, this.f5545g, this.f5546h);
    }

    public h M(long j2) {
        if (j2 == 0) {
            return this;
        }
        int i2 = (this.f5543e * 60) + this.f5544f;
        int i3 = ((((int) (j2 % 1440)) + i2) + 1440) % 1440;
        return i2 == i3 ? this : w(i3 / 60, i3 % 60, this.f5545g, this.f5546h);
    }

    public h N(long j2) {
        if (j2 == 0) {
            return this;
        }
        long Q = Q();
        long j3 = (((j2 % 86400000000000L) + Q) + 86400000000000L) % 86400000000000L;
        return Q == j3 ? this : w((int) (j3 / 3600000000000L), (int) ((j3 / 60000000000L) % 60), (int) ((j3 / 1000000000) % 60), (int) (j3 % 1000000000));
    }

    public h O(long j2) {
        if (j2 == 0) {
            return this;
        }
        int i2 = (this.f5543e * 3600) + (this.f5544f * 60) + this.f5545g;
        int i3 = ((((int) (j2 % 86400)) + i2) + 86400) % 86400;
        return i2 == i3 ? this : w(i3 / 3600, (i3 / 60) % 60, i3 % 60, this.f5546h);
    }

    public long Q() {
        return (((long) this.f5543e) * 3600000000000L) + (((long) this.f5544f) * 60000000000L) + (((long) this.f5545g) * 1000000000) + ((long) this.f5546h);
    }

    public int R() {
        return (this.f5543e * 3600) + (this.f5544f * 60) + this.f5545g;
    }

    /* renamed from: S */
    public h h(f fVar) {
        return fVar instanceof h ? (h) fVar : (h) fVar.t(this);
    }

    /* renamed from: T */
    public h k(i iVar, long j2) {
        if (!(iVar instanceof r.b.a.x.a)) {
            return (h) iVar.d(this, j2);
        }
        r.b.a.x.a aVar = (r.b.a.x.a) iVar;
        aVar.m(j2);
        switch (a.a[aVar.ordinal()]) {
            case 1:
                return W((int) j2);
            case 2:
                return H(j2);
            case 3:
                return W(((int) j2) * 1000);
            case 4:
                return H(j2 * 1000);
            case 5:
                return W(((int) j2) * 1000000);
            case 6:
                return H(j2 * 1000000);
            case 7:
                return X((int) j2);
            case 8:
                return O(j2 - ((long) R()));
            case 9:
                return V((int) j2);
            case 10:
                return M(j2 - ((long) ((this.f5543e * 60) + this.f5544f)));
            case 11:
                return L(j2 - ((long) (this.f5543e % 12)));
            case 12:
                if (j2 == 12) {
                    j2 = 0;
                }
                return L(j2 - ((long) (this.f5543e % 12)));
            case 13:
                return U((int) j2);
            case 14:
                if (j2 == 24) {
                    j2 = 0;
                }
                return U((int) j2);
            case 15:
                return L((j2 - ((long) (this.f5543e / 12))) * 12);
            default:
                throw new m("Unsupported field: " + iVar);
        }
    }

    public h U(int i2) {
        if (this.f5543e == i2) {
            return this;
        }
        r.b.a.x.a.HOUR_OF_DAY.m((long) i2);
        return w(i2, this.f5544f, this.f5545g, this.f5546h);
    }

    public h V(int i2) {
        if (this.f5544f == i2) {
            return this;
        }
        r.b.a.x.a.MINUTE_OF_HOUR.m((long) i2);
        return w(this.f5543e, i2, this.f5545g, this.f5546h);
    }

    public h W(int i2) {
        if (this.f5546h == i2) {
            return this;
        }
        r.b.a.x.a.NANO_OF_SECOND.m((long) i2);
        return w(this.f5543e, this.f5544f, this.f5545g, i2);
    }

    public h X(int i2) {
        if (this.f5545g == i2) {
            return this;
        }
        r.b.a.x.a.SECOND_OF_MINUTE.m((long) i2);
        return w(this.f5543e, this.f5544f, i2, this.f5546h);
    }

    /* access modifiers changed from: package-private */
    public void Y(DataOutput dataOutput) {
        byte b;
        if (this.f5546h == 0) {
            if (this.f5545g != 0) {
                dataOutput.writeByte(this.f5543e);
                dataOutput.writeByte(this.f5544f);
                b = this.f5545g;
            } else if (this.f5544f == 0) {
                b = this.f5543e;
            } else {
                dataOutput.writeByte(this.f5543e);
                b = this.f5544f;
            }
            dataOutput.writeByte(~b);
            return;
        }
        dataOutput.writeByte(this.f5543e);
        dataOutput.writeByte(this.f5544f);
        dataOutput.writeByte(this.f5545g);
        dataOutput.writeInt(this.f5546h);
    }

    public n d(i iVar) {
        return super.d(iVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f5543e == hVar.f5543e && this.f5544f == hVar.f5544f && this.f5545g == hVar.f5545g && this.f5546h == hVar.f5546h;
    }

    public <R> R f(k<R> kVar) {
        if (kVar == j.e()) {
            return b.NANOS;
        }
        if (kVar == j.c()) {
            return this;
        }
        if (kVar == j.a() || kVar == j.g() || kVar == j.f() || kVar == j.d() || kVar == j.b()) {
            return null;
        }
        return kVar.a(this);
    }

    public int hashCode() {
        long Q = Q();
        return (int) (Q ^ (Q >>> 32));
    }

    public boolean j(i iVar) {
        return iVar instanceof r.b.a.x.a ? iVar.g() : iVar != null && iVar.c(this);
    }

    public int l(i iVar) {
        return iVar instanceof r.b.a.x.a ? y(iVar) : super.l(iVar);
    }

    public long n(i iVar) {
        return iVar instanceof r.b.a.x.a ? iVar == r.b.a.x.a.NANO_OF_DAY ? Q() : iVar == r.b.a.x.a.MICRO_OF_DAY ? Q() / 1000 : (long) y(iVar) : iVar.f(this);
    }

    public d t(d dVar) {
        return dVar.k(r.b.a.x.a.NANO_OF_DAY, Q());
    }

    public String toString() {
        int i2;
        StringBuilder sb = new StringBuilder(18);
        byte b = this.f5543e;
        byte b2 = this.f5544f;
        byte b3 = this.f5545g;
        int i3 = this.f5546h;
        sb.append(b < 10 ? "0" : "");
        sb.append(b);
        String str = ":0";
        sb.append(b2 < 10 ? str : ":");
        sb.append(b2);
        if (b3 > 0 || i3 > 0) {
            if (b3 >= 10) {
                str = ":";
            }
            sb.append(str);
            sb.append(b3);
            if (i3 > 0) {
                sb.append('.');
                int i4 = 1000000;
                if (i3 % 1000000 == 0) {
                    i2 = (i3 / 1000000) + 1000;
                } else {
                    if (i3 % 1000 == 0) {
                        i3 /= 1000;
                    } else {
                        i4 = 1000000000;
                    }
                    i2 = i3 + i4;
                }
                sb.append(Integer.toString(i2).substring(1));
            }
        }
        return sb.toString();
    }

    public l u(r rVar) {
        return l.x(this, rVar);
    }

    /* renamed from: v */
    public int compareTo(h hVar) {
        int a2 = r.b.a.w.d.a(this.f5543e, hVar.f5543e);
        if (a2 != 0) {
            return a2;
        }
        int a3 = r.b.a.w.d.a(this.f5544f, hVar.f5544f);
        if (a3 != 0) {
            return a3;
        }
        int a4 = r.b.a.w.d.a(this.f5545g, hVar.f5545g);
        return a4 == 0 ? r.b.a.w.d.a(this.f5546h, hVar.f5546h) : a4;
    }

    public int z() {
        return this.f5543e;
    }
}
