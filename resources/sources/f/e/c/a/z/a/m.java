package f.e.c.a.z.a;

import f.e.c.a.z.a.l0;
import f.e.c.a.z.a.v1;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

final class m implements v1 {
    private final l a;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                f.e.c.a.z.a.u1$b[] r0 = f.e.c.a.z.a.u1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.INT32     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0060 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.INT64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006c }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0078 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0084 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0090 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.STRING     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.z.a.m.a.<clinit>():void");
        }
    }

    private m(l lVar) {
        b0.b(lVar, "output");
        l lVar2 = lVar;
        this.a = lVar2;
        lVar2.a = this;
    }

    public static m P(l lVar) {
        m mVar = lVar.a;
        return mVar != null ? mVar : new m(lVar);
    }

    private <V> void Q(int i2, boolean z, V v, l0.a<Boolean, V> aVar) {
        this.a.T0(i2, 2);
        this.a.V0(l0.b(aVar, Boolean.valueOf(z), v));
        l0.d(this.a, aVar, Boolean.valueOf(z), v);
    }

    private <V> void R(int i2, l0.a<Integer, V> aVar, Map<Integer, V> map) {
        int size = map.size();
        int[] iArr = new int[size];
        int i3 = 0;
        for (Integer intValue : map.keySet()) {
            iArr[i3] = intValue.intValue();
            i3++;
        }
        Arrays.sort(iArr);
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = iArr[i4];
            V v = map.get(Integer.valueOf(i5));
            this.a.T0(i2, 2);
            this.a.V0(l0.b(aVar, Integer.valueOf(i5), v));
            l0.d(this.a, aVar, Integer.valueOf(i5), v);
        }
    }

    private <V> void S(int i2, l0.a<Long, V> aVar, Map<Long, V> map) {
        int size = map.size();
        long[] jArr = new long[size];
        int i3 = 0;
        for (Long longValue : map.keySet()) {
            jArr[i3] = longValue.longValue();
            i3++;
        }
        Arrays.sort(jArr);
        for (int i4 = 0; i4 < size; i4++) {
            long j2 = jArr[i4];
            V v = map.get(Long.valueOf(j2));
            this.a.T0(i2, 2);
            this.a.V0(l0.b(aVar, Long.valueOf(j2), v));
            l0.d(this.a, aVar, Long.valueOf(j2), v);
        }
    }

    private <K, V> void T(int i2, l0.a<K, V> aVar, Map<K, V> map) {
        switch (a.a[aVar.a.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    Q(i2, false, v, aVar);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    Q(i2, true, v2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i2, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i2, aVar, map);
                return;
            case 12:
                U(i2, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.a);
        }
    }

    private <V> void U(int i2, l0.a<String, V> aVar, Map<String, V> map) {
        int size = map.size();
        String[] strArr = new String[size];
        int i3 = 0;
        for (String str : map.keySet()) {
            strArr[i3] = str;
            i3++;
        }
        Arrays.sort(strArr);
        for (int i4 = 0; i4 < size; i4++) {
            String str2 = strArr[i4];
            V v = map.get(str2);
            this.a.T0(i2, 2);
            this.a.V0(l0.b(aVar, str2, v));
            l0.d(this.a, aVar, str2, v);
        }
    }

    private void V(int i2, Object obj) {
        if (obj instanceof String) {
            this.a.R0(i2, (String) obj);
        } else {
            this.a.l0(i2, (i) obj);
        }
    }

    public v1.a A() {
        return v1.a.ASCENDING;
    }

    public void B(int i2, long j2) {
        this.a.P0(i2, j2);
    }

    public void C(int i2, float f2) {
        this.a.v0(i2, f2);
    }

    public void D(int i2, List<String> list) {
        int i3 = 0;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            while (i3 < list.size()) {
                V(i2, h0Var.e(i3));
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.R0(i2, list.get(i3));
            i3++;
        }
    }

    public void E(int i2) {
        this.a.T0(i2, 4);
    }

    public void F(int i2, String str) {
        this.a.R0(i2, str);
    }

    public void G(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.P(list.get(i5).intValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.O0(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.N0(i2, list.get(i3).intValue());
            i3++;
        }
    }

    public void H(int i2, long j2) {
        this.a.W0(i2, j2);
    }

    public void I(int i2, int i3) {
        this.a.p0(i2, i3);
    }

    public void J(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.y(list.get(i5).longValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.E0(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.D0(i2, list.get(i3).longValue());
            i3++;
        }
    }

    public void K(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.l(list.get(i5).intValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.q0(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.p0(i2, list.get(i3).intValue());
            i3++;
        }
    }

    public void L(int i2, List<Double> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.j(list.get(i5).doubleValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.o0(list.get(i3).doubleValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.n0(i2, list.get(i3).doubleValue());
            i3++;
        }
    }

    public void M(int i2, Object obj, h1 h1Var) {
        this.a.y0(i2, (s0) obj, h1Var);
    }

    public void N(int i2, int i3) {
        this.a.N0(i2, i3);
    }

    public void O(int i2, List<i> list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.a.l0(i2, list.get(i3));
        }
    }

    public void a(int i2, List<?> list, h1 h1Var) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            M(i2, list.get(i3), h1Var);
        }
    }

    public void b(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.w(list.get(i5).intValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.C0(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.B0(i2, list.get(i3).intValue());
            i3++;
        }
    }

    public void c(int i2, List<Float> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.r(list.get(i5).floatValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.w0(list.get(i3).floatValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.v0(i2, list.get(i3).floatValue());
            i3++;
        }
    }

    public void d(int i2, long j2) {
        this.a.D0(i2, j2);
    }

    public void e(int i2, boolean z) {
        this.a.h0(i2, z);
    }

    public void f(int i2, int i3) {
        this.a.U0(i2, i3);
    }

    public void g(int i2, List<?> list, h1 h1Var) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            s(i2, list.get(i3), h1Var);
        }
    }

    public final void h(int i2, Object obj) {
        if (obj instanceof i) {
            this.a.I0(i2, (i) obj);
        } else {
            this.a.H0(i2, (s0) obj);
        }
    }

    public void i(int i2, int i3) {
        this.a.J0(i2, i3);
    }

    public void j(int i2) {
        this.a.T0(i2, 3);
    }

    public void k(int i2, int i3) {
        this.a.B0(i2, i3);
    }

    public void l(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.p(list.get(i5).longValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.u0(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.t0(i2, list.get(i3).longValue());
            i3++;
        }
    }

    public void m(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.L(list.get(i5).intValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.K0(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.J0(i2, list.get(i3).intValue());
            i3++;
        }
    }

    public void n(int i2, int i3) {
        this.a.r0(i2, i3);
    }

    public void o(int i2, double d2) {
        this.a.n0(i2, d2);
    }

    public void p(int i2, long j2) {
        this.a.L0(i2, j2);
    }

    public void q(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.N(list.get(i5).longValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.M0(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.L0(i2, list.get(i3).longValue());
            i3++;
        }
    }

    public void r(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.n(list.get(i5).intValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.s0(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.r0(i2, list.get(i3).intValue());
            i3++;
        }
    }

    public void s(int i2, Object obj, h1 h1Var) {
        this.a.F0(i2, (s0) obj, h1Var);
    }

    public void t(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.Y(list.get(i5).longValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.X0(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.W0(i2, list.get(i3).longValue());
            i3++;
        }
    }

    public void u(int i2, List<Boolean> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.e(list.get(i5).booleanValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.i0(list.get(i3).booleanValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.h0(i2, list.get(i3).booleanValue());
            i3++;
        }
    }

    public void v(int i2, i iVar) {
        this.a.l0(i2, iVar);
    }

    public void w(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.W(list.get(i5).intValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.V0(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.U0(i2, list.get(i3).intValue());
            i3++;
        }
    }

    public <K, V> void x(int i2, l0.a<K, V> aVar, Map<K, V> map) {
        if (this.a.c0()) {
            T(i2, aVar, map);
            return;
        }
        for (Map.Entry next : map.entrySet()) {
            this.a.T0(i2, 2);
            this.a.V0(l0.b(aVar, next.getKey(), next.getValue()));
            l0.d(this.a, aVar, next.getKey(), next.getValue());
        }
    }

    public void y(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.R(list.get(i5).longValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.Q0(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.P0(i2, list.get(i3).longValue());
            i3++;
        }
    }

    public void z(int i2, long j2) {
        this.a.t0(i2, j2);
    }
}
