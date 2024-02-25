package f.e.c.a.z.a;

import f.e.c.a.z.a.b0;
import f.e.c.a.z.a.e0;
import f.e.c.a.z.a.s0;
import f.e.c.a.z.a.u1;
import f.e.c.a.z.a.v.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class v<T extends b<T>> {

    /* renamed from: d  reason: collision with root package name */
    private static final v f4204d = new v(true);
    private final k1<T, Object> a;
    private boolean b;
    private boolean c;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012f */
        static {
            /*
                f.e.c.a.z.a.u1$b[] r0 = f.e.c.a.z.a.u1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                f.e.c.a.z.a.u1$b r2 = f.e.c.a.z.a.u1.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                f.e.c.a.z.a.u1$b r3 = f.e.c.a.z.a.u1.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0028 }
                f.e.c.a.z.a.u1$b r4 = f.e.c.a.z.a.u1.b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0033 }
                f.e.c.a.z.a.u1$b r5 = f.e.c.a.z.a.u1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = b     // Catch:{ NoSuchFieldError -> 0x003e }
                f.e.c.a.z.a.u1$b r6 = f.e.c.a.z.a.u1.b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = b     // Catch:{ NoSuchFieldError -> 0x0049 }
                f.e.c.a.z.a.u1$b r7 = f.e.c.a.z.a.u1.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = b     // Catch:{ NoSuchFieldError -> 0x0054 }
                f.e.c.a.z.a.u1$b r8 = f.e.c.a.z.a.u1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = b     // Catch:{ NoSuchFieldError -> 0x0060 }
                f.e.c.a.z.a.u1$b r9 = f.e.c.a.z.a.u1.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x006c }
                f.e.c.a.z.a.u1$b r10 = f.e.c.a.z.a.u1.b.GROUP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x0078 }
                f.e.c.a.z.a.u1$b r10 = f.e.c.a.z.a.u1.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x0084 }
                f.e.c.a.z.a.u1$b r10 = f.e.c.a.z.a.u1.b.STRING     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x0090 }
                f.e.c.a.z.a.u1$b r10 = f.e.c.a.z.a.u1.b.BYTES     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x009c }
                f.e.c.a.z.a.u1$b r10 = f.e.c.a.z.a.u1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                f.e.c.a.z.a.u1$b r10 = f.e.c.a.z.a.u1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                f.e.c.a.z.a.u1$b r10 = f.e.c.a.z.a.u1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                f.e.c.a.z.a.u1$b r10 = f.e.c.a.z.a.u1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x00cc }
                f.e.c.a.z.a.u1$b r10 = f.e.c.a.z.a.u1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                f.e.c.a.z.a.u1$b r10 = f.e.c.a.z.a.u1.b.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                f.e.c.a.z.a.u1$c[] r9 = f.e.c.a.z.a.u1.c.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                a = r9
                f.e.c.a.z.a.u1$c r10 = f.e.c.a.z.a.u1.c.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                f.e.c.a.z.a.u1$c r9 = f.e.c.a.z.a.u1.c.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00fd }
                f.e.c.a.z.a.u1$c r1 = f.e.c.a.z.a.u1.c.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0107 }
                f.e.c.a.z.a.u1$c r1 = f.e.c.a.z.a.u1.c.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0111 }
                f.e.c.a.z.a.u1$c r1 = f.e.c.a.z.a.u1.c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x011b }
                f.e.c.a.z.a.u1$c r1 = f.e.c.a.z.a.u1.c.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0125 }
                f.e.c.a.z.a.u1$c r1 = f.e.c.a.z.a.u1.c.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x012f }
                f.e.c.a.z.a.u1$c r1 = f.e.c.a.z.a.u1.c.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0139 }
                f.e.c.a.z.a.u1$c r1 = f.e.c.a.z.a.u1.c.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.z.a.v.a.<clinit>():void");
        }
    }

    public interface b<T extends b<T>> extends Comparable<T> {
        int b();

        boolean e();

        u1.b i();

        s0.a p(s0.a aVar, s0 s0Var);

        u1.c q();

        boolean r();
    }

    private v() {
        this.a = k1.q(16);
    }

    private v(k1<T, Object> k1Var) {
        this.a = k1Var;
        t();
    }

    private v(boolean z) {
        this(k1.q(0));
        t();
    }

    static void A(l lVar, u1.b bVar, Object obj) {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                lVar.o0(((Double) obj).doubleValue());
                return;
            case 2:
                lVar.w0(((Float) obj).floatValue());
                return;
            case 3:
                lVar.E0(((Long) obj).longValue());
                return;
            case 4:
                lVar.X0(((Long) obj).longValue());
                return;
            case 5:
                lVar.C0(((Integer) obj).intValue());
                return;
            case 6:
                lVar.u0(((Long) obj).longValue());
                return;
            case 7:
                lVar.s0(((Integer) obj).intValue());
                return;
            case 8:
                lVar.i0(((Boolean) obj).booleanValue());
                return;
            case 9:
                lVar.z0((s0) obj);
                return;
            case 10:
                lVar.G0((s0) obj);
                return;
            case 11:
                if (!(obj instanceof i)) {
                    lVar.S0((String) obj);
                    return;
                }
                break;
            case 12:
                if (!(obj instanceof i)) {
                    lVar.j0((byte[]) obj);
                    return;
                }
                break;
            case 13:
                lVar.V0(((Integer) obj).intValue());
                return;
            case 14:
                lVar.K0(((Integer) obj).intValue());
                return;
            case 15:
                lVar.M0(((Long) obj).longValue());
                return;
            case 16:
                lVar.O0(((Integer) obj).intValue());
                return;
            case 17:
                lVar.Q0(((Long) obj).longValue());
                return;
            case 18:
                lVar.q0(obj instanceof b0.c ? ((b0.c) obj).b() : ((Integer) obj).intValue());
                return;
            default:
                return;
        }
        lVar.m0((i) obj);
    }

    private static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int d(u1.b bVar, int i2, Object obj) {
        int U = l.U(i2);
        if (bVar == u1.b.GROUP) {
            U *= 2;
        }
        return U + e(bVar, obj);
    }

    static int e(u1.b bVar, Object obj) {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                return l.j(((Double) obj).doubleValue());
            case 2:
                return l.r(((Float) obj).floatValue());
            case 3:
                return l.y(((Long) obj).longValue());
            case 4:
                return l.Y(((Long) obj).longValue());
            case 5:
                return l.w(((Integer) obj).intValue());
            case 6:
                return l.p(((Long) obj).longValue());
            case 7:
                return l.n(((Integer) obj).intValue());
            case 8:
                return l.e(((Boolean) obj).booleanValue());
            case 9:
                return l.t((s0) obj);
            case 10:
                return obj instanceof e0 ? l.B((e0) obj) : l.G((s0) obj);
            case 11:
                return obj instanceof i ? l.h((i) obj) : l.T((String) obj);
            case 12:
                return obj instanceof i ? l.h((i) obj) : l.f((byte[]) obj);
            case 13:
                return l.W(((Integer) obj).intValue());
            case 14:
                return l.L(((Integer) obj).intValue());
            case 15:
                return l.N(((Long) obj).longValue());
            case 16:
                return l.P(((Integer) obj).intValue());
            case 17:
                return l.R(((Long) obj).longValue());
            case 18:
                return obj instanceof b0.c ? l.l(((b0.c) obj).b()) : l.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        u1.b i2 = bVar.i();
        int b2 = bVar.b();
        if (!bVar.e()) {
            return d(i2, b2, obj);
        }
        int i3 = 0;
        List<Object> list = (List) obj;
        if (bVar.r()) {
            for (Object e2 : list) {
                i3 += e(i2, e2);
            }
            return l.U(b2) + i3 + l.J(i3);
        }
        for (Object d2 : list) {
            i3 += d(i2, b2, d2);
        }
        return i3;
    }

    public static <T extends b<T>> v<T> h() {
        return f4204d;
    }

    private int k(Map.Entry<T, Object> entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.q() != u1.c.MESSAGE || bVar.e() || bVar.r()) {
            return f(bVar, value);
        }
        boolean z = value instanceof e0;
        int b2 = ((b) entry.getKey()).b();
        return z ? l.z(b2, (e0) value) : l.D(b2, (s0) value);
    }

    static int m(u1.b bVar, boolean z) {
        if (z) {
            return 2;
        }
        return bVar.c();
    }

    private static <T extends b<T>> boolean q(Map.Entry<T, Object> entry) {
        b bVar = (b) entry.getKey();
        if (bVar.q() == u1.c.MESSAGE) {
            boolean e2 = bVar.e();
            Object value = entry.getValue();
            if (e2) {
                for (s0 l2 : (List) value) {
                    if (!l2.l()) {
                        return false;
                    }
                }
            } else if (value instanceof s0) {
                if (!((s0) value).l()) {
                    return false;
                }
            } else if (value instanceof e0) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    private static boolean r(u1.b bVar, Object obj) {
        b0.a(obj);
        switch (a.a[bVar.a().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof i) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof b0.c);
            case 9:
                return (obj instanceof s0) || (obj instanceof e0);
            default:
                return false;
        }
    }

    private void v(Map.Entry<T, Object> entry) {
        Object obj;
        k1<T, Object> k1Var;
        Object i2;
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof e0) {
            value = ((e0) value).f();
        }
        if (bVar.e()) {
            Object i3 = i(bVar);
            if (i3 == null) {
                i3 = new ArrayList();
            }
            for (Object c2 : (List) value) {
                ((List) i3).add(c(c2));
            }
            this.a.put(bVar, i3);
            return;
        }
        if (bVar.q() != u1.c.MESSAGE || (i2 = i(bVar)) == null) {
            k1Var = this.a;
            obj = c(value);
        } else {
            obj = bVar.p(((s0) i2).e(), (s0) value).a();
            k1Var = this.a;
        }
        k1Var.put(bVar, obj);
    }

    public static <T extends b<T>> v<T> w() {
        return new v<>();
    }

    private void y(u1.b bVar, Object obj) {
        if (!r(bVar, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    static void z(l lVar, u1.b bVar, int i2, Object obj) {
        if (bVar == u1.b.GROUP) {
            lVar.x0(i2, (s0) obj);
            return;
        }
        lVar.T0(i2, m(bVar, false));
        A(lVar, bVar, obj);
    }

    public void a(T t, Object obj) {
        List list;
        if (t.e()) {
            y(t.i(), obj);
            Object i2 = i(t);
            if (i2 == null) {
                list = new ArrayList();
                this.a.put(t, list);
            } else {
                list = (List) i2;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public v<T> clone() {
        v<T> w = w();
        for (int i2 = 0; i2 < this.a.k(); i2++) {
            Map.Entry<T, Object> j2 = this.a.j(i2);
            w.x((b) j2.getKey(), j2.getValue());
        }
        for (Map.Entry next : this.a.m()) {
            w.x((b) next.getKey(), next.getValue());
        }
        w.c = this.c;
        return w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        return this.a.equals(((v) obj).a);
    }

    /* access modifiers changed from: package-private */
    public Iterator<Map.Entry<T, Object>> g() {
        return this.c ? new e0.c(this.a.h().iterator()) : this.a.h().iterator();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public Object i(T t) {
        Object obj = this.a.get(t);
        return obj instanceof e0 ? ((e0) obj).f() : obj;
    }

    public int j() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.k(); i3++) {
            i2 += k(this.a.j(i3));
        }
        for (Map.Entry<T, Object> k2 : this.a.m()) {
            i2 += k(k2);
        }
        return i2;
    }

    public int l() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.k(); i3++) {
            Map.Entry<T, Object> j2 = this.a.j(i3);
            i2 += f((b) j2.getKey(), j2.getValue());
        }
        for (Map.Entry next : this.a.m()) {
            i2 += f((b) next.getKey(), next.getValue());
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return this.a.isEmpty();
    }

    public boolean o() {
        return this.b;
    }

    public boolean p() {
        for (int i2 = 0; i2 < this.a.k(); i2++) {
            if (!q(this.a.j(i2))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> q2 : this.a.m()) {
            if (!q(q2)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> s() {
        return this.c ? new e0.c(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    public void t() {
        if (!this.b) {
            this.a.p();
            this.b = true;
        }
    }

    public void u(v<T> vVar) {
        for (int i2 = 0; i2 < vVar.a.k(); i2++) {
            v(vVar.a.j(i2));
        }
        for (Map.Entry<T, Object> v : vVar.a.m()) {
            v(v);
        }
    }

    public void x(T t, Object obj) {
        if (!t.e()) {
            y(t.i(), obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object y : arrayList) {
                y(t.i(), y);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof e0) {
            this.c = true;
        }
        this.a.put(t, obj);
    }
}
