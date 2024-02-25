package r.b.a.u;

import java.io.Serializable;
import r.b.a.f;
import r.b.a.g;
import r.b.a.q;
import r.b.a.t;
import r.b.a.x.e;

public final class m extends h implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    public static final m f5618g = new m();
    private static final long serialVersionUID = -1440403870442975015L;

    private m() {
    }

    private Object readResolve() {
        return f5618g;
    }

    /* renamed from: A */
    public g n(e eVar) {
        return g.L(eVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0084, code lost:
        if (r8.longValue() > 0) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        if (r8.longValue() <= 0) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r.b.a.f B(java.util.Map<r.b.a.x.i, java.lang.Long> r11, r.b.a.v.i r12) {
        /*
            r10 = this;
            r.b.a.x.a r0 = r.b.a.x.a.EPOCH_DAY
            boolean r1 = r11.containsKey(r0)
            if (r1 == 0) goto L_0x0017
            java.lang.Object r11 = r11.remove(r0)
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            r.b.a.f r11 = r.b.a.f.b0(r11)
            return r11
        L_0x0017:
            r.b.a.x.a r0 = r.b.a.x.a.PROLEPTIC_MONTH
            java.lang.Object r1 = r11.remove(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            r2 = 1
            if (r1 == 0) goto L_0x004d
            r.b.a.v.i r3 = r.b.a.v.i.LENIENT
            if (r12 == r3) goto L_0x002d
            long r3 = r1.longValue()
            r0.m(r3)
        L_0x002d:
            r.b.a.x.a r0 = r.b.a.x.a.MONTH_OF_YEAR
            long r3 = r1.longValue()
            r5 = 12
            int r3 = r.b.a.w.d.g(r3, r5)
            int r3 = r3 + r2
            long r3 = (long) r3
            r10.u(r11, r0, r3)
            r.b.a.x.a r0 = r.b.a.x.a.YEAR
            long r3 = r1.longValue()
            r5 = 12
            long r3 = r.b.a.w.d.e(r3, r5)
            r10.u(r11, r0, r3)
        L_0x004d:
            r.b.a.x.a r0 = r.b.a.x.a.YEAR_OF_ERA
            java.lang.Object r1 = r11.remove(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            r3 = 1
            if (r1 == 0) goto L_0x00e3
            r.b.a.v.i r5 = r.b.a.v.i.LENIENT
            if (r12 == r5) goto L_0x0064
            long r5 = r1.longValue()
            r0.m(r5)
        L_0x0064:
            r.b.a.x.a r5 = r.b.a.x.a.ERA
            java.lang.Object r5 = r11.remove(r5)
            java.lang.Long r5 = (java.lang.Long) r5
            r6 = 0
            if (r5 != 0) goto L_0x00a7
            r.b.a.x.a r5 = r.b.a.x.a.YEAR
            java.lang.Object r8 = r11.get(r5)
            java.lang.Long r8 = (java.lang.Long) r8
            r.b.a.v.i r9 = r.b.a.v.i.STRICT
            if (r12 != r9) goto L_0x008b
            if (r8 == 0) goto L_0x0087
            long r8 = r8.longValue()
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0096
            goto L_0x009f
        L_0x0087:
            r11.put(r0, r1)
            goto L_0x00f8
        L_0x008b:
            if (r8 == 0) goto L_0x009f
            long r8 = r8.longValue()
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0096
            goto L_0x009f
        L_0x0096:
            long r0 = r1.longValue()
            long r0 = r.b.a.w.d.o(r3, r0)
            goto L_0x00a3
        L_0x009f:
            long r0 = r1.longValue()
        L_0x00a3:
            r10.u(r11, r5, r0)
            goto L_0x00f8
        L_0x00a7:
            long r8 = r5.longValue()
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00b9
            r.b.a.x.a r0 = r.b.a.x.a.YEAR
            long r5 = r1.longValue()
        L_0x00b5:
            r10.u(r11, r0, r5)
            goto L_0x00f8
        L_0x00b9:
            long r8 = r5.longValue()
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00cc
            r.b.a.x.a r0 = r.b.a.x.a.YEAR
            long r5 = r1.longValue()
            long r5 = r.b.a.w.d.o(r3, r5)
            goto L_0x00b5
        L_0x00cc:
            r.b.a.b r11 = new r.b.a.b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Invalid value for era: "
            r12.append(r0)
            r12.append(r5)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x00e3:
            r.b.a.x.a r0 = r.b.a.x.a.ERA
            boolean r1 = r11.containsKey(r0)
            if (r1 == 0) goto L_0x00f8
            java.lang.Object r1 = r11.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r5 = r1.longValue()
            r0.m(r5)
        L_0x00f8:
            r.b.a.x.a r0 = r.b.a.x.a.YEAR
            boolean r1 = r11.containsKey(r0)
            if (r1 == 0) goto L_0x0429
            r.b.a.x.a r1 = r.b.a.x.a.MONTH_OF_YEAR
            boolean r5 = r11.containsKey(r1)
            java.lang.String r6 = "Strict mode rejected date parsed to a different month"
            if (r5 == 0) goto L_0x02db
            r.b.a.x.a r5 = r.b.a.x.a.DAY_OF_MONTH
            boolean r7 = r11.containsKey(r5)
            if (r7 == 0) goto L_0x018d
            java.lang.Object r3 = r11.remove(r0)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r0 = r0.l(r3)
            java.lang.Object r1 = r11.remove(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            int r1 = r.b.a.w.d.p(r3)
            java.lang.Object r11 = r11.remove(r5)
            java.lang.Long r11 = (java.lang.Long) r11
            long r3 = r11.longValue()
            int r11 = r.b.a.w.d.p(r3)
            r.b.a.v.i r3 = r.b.a.v.i.LENIENT
            if (r12 != r3) goto L_0x0157
            int r12 = r.b.a.w.d.n(r1, r2)
            long r3 = (long) r12
            int r11 = r.b.a.w.d.n(r11, r2)
            long r11 = (long) r11
            r.b.a.f r0 = r.b.a.f.Z(r0, r2, r2)
            r.b.a.f r0 = r0.g0(r3)
            r.b.a.f r11 = r0.f0(r11)
            return r11
        L_0x0157:
            r.b.a.v.i r2 = r.b.a.v.i.SMART
            if (r12 != r2) goto L_0x0188
            long r2 = (long) r11
            r5.m(r2)
            r12 = 4
            if (r1 == r12) goto L_0x017d
            r12 = 6
            if (r1 == r12) goto L_0x017d
            r12 = 9
            if (r1 == r12) goto L_0x017d
            r12 = 11
            if (r1 != r12) goto L_0x016e
            goto L_0x017d
        L_0x016e:
            r12 = 2
            if (r1 != r12) goto L_0x0183
            r.b.a.i r12 = r.b.a.i.FEBRUARY
            long r2 = (long) r0
            boolean r2 = r.b.a.o.v(r2)
            int r12 = r12.c(r2)
            goto L_0x017f
        L_0x017d:
            r12 = 30
        L_0x017f:
            int r11 = java.lang.Math.min(r11, r12)
        L_0x0183:
            r.b.a.f r11 = r.b.a.f.Z(r0, r1, r11)
            return r11
        L_0x0188:
            r.b.a.f r11 = r.b.a.f.Z(r0, r1, r11)
            return r11
        L_0x018d:
            r.b.a.x.a r5 = r.b.a.x.a.ALIGNED_WEEK_OF_MONTH
            boolean r7 = r11.containsKey(r5)
            if (r7 == 0) goto L_0x02db
            r.b.a.x.a r7 = r.b.a.x.a.ALIGNED_DAY_OF_WEEK_IN_MONTH
            boolean r8 = r11.containsKey(r7)
            if (r8 == 0) goto L_0x0234
            java.lang.Object r8 = r11.remove(r0)
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            int r0 = r0.l(r8)
            r.b.a.v.i r8 = r.b.a.v.i.LENIENT
            if (r12 != r8) goto L_0x01ea
            java.lang.Object r12 = r11.remove(r1)
            java.lang.Long r12 = (java.lang.Long) r12
            long r8 = r12.longValue()
            long r8 = r.b.a.w.d.o(r8, r3)
            java.lang.Object r12 = r11.remove(r5)
            java.lang.Long r12 = (java.lang.Long) r12
            long r5 = r12.longValue()
            long r5 = r.b.a.w.d.o(r5, r3)
            java.lang.Object r11 = r11.remove(r7)
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            long r11 = r.b.a.w.d.o(r11, r3)
            r.b.a.f r0 = r.b.a.f.Z(r0, r2, r2)
            r.b.a.f r0 = r0.g0(r8)
            r.b.a.f r0 = r0.h0(r5)
            r.b.a.f r11 = r0.f0(r11)
            return r11
        L_0x01ea:
            java.lang.Object r3 = r11.remove(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = r1.l(r3)
            java.lang.Object r4 = r11.remove(r5)
            java.lang.Long r4 = (java.lang.Long) r4
            long r8 = r4.longValue()
            int r4 = r5.l(r8)
            java.lang.Object r11 = r11.remove(r7)
            java.lang.Long r11 = (java.lang.Long) r11
            long r8 = r11.longValue()
            int r11 = r7.l(r8)
            r.b.a.f r0 = r.b.a.f.Z(r0, r3, r2)
            int r4 = r4 - r2
            int r4 = r4 * 7
            int r11 = r11 - r2
            int r4 = r4 + r11
            long r4 = (long) r4
            r.b.a.f r11 = r0.f0(r4)
            r.b.a.v.i r0 = r.b.a.v.i.STRICT
            if (r12 != r0) goto L_0x0233
            int r12 = r11.l(r1)
            if (r12 != r3) goto L_0x022d
            goto L_0x0233
        L_0x022d:
            r.b.a.b r11 = new r.b.a.b
            r11.<init>(r6)
            throw r11
        L_0x0233:
            return r11
        L_0x0234:
            r.b.a.x.a r7 = r.b.a.x.a.DAY_OF_WEEK
            boolean r8 = r11.containsKey(r7)
            if (r8 == 0) goto L_0x02db
            java.lang.Object r8 = r11.remove(r0)
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            int r0 = r0.l(r8)
            r.b.a.v.i r8 = r.b.a.v.i.LENIENT
            if (r12 != r8) goto L_0x0289
            java.lang.Object r12 = r11.remove(r1)
            java.lang.Long r12 = (java.lang.Long) r12
            long r8 = r12.longValue()
            long r8 = r.b.a.w.d.o(r8, r3)
            java.lang.Object r12 = r11.remove(r5)
            java.lang.Long r12 = (java.lang.Long) r12
            long r5 = r12.longValue()
            long r5 = r.b.a.w.d.o(r5, r3)
            java.lang.Object r11 = r11.remove(r7)
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            long r11 = r.b.a.w.d.o(r11, r3)
            r.b.a.f r0 = r.b.a.f.Z(r0, r2, r2)
            r.b.a.f r0 = r0.g0(r8)
            r.b.a.f r0 = r0.h0(r5)
            r.b.a.f r11 = r0.f0(r11)
            return r11
        L_0x0289:
            java.lang.Object r3 = r11.remove(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = r1.l(r3)
            java.lang.Object r4 = r11.remove(r5)
            java.lang.Long r4 = (java.lang.Long) r4
            long r8 = r4.longValue()
            int r4 = r5.l(r8)
            java.lang.Object r11 = r11.remove(r7)
            java.lang.Long r11 = (java.lang.Long) r11
            long r8 = r11.longValue()
            int r11 = r7.l(r8)
            r.b.a.f r0 = r.b.a.f.Z(r0, r3, r2)
            int r4 = r4 - r2
            long r4 = (long) r4
            r.b.a.f r0 = r0.h0(r4)
            r.b.a.c r11 = r.b.a.c.a(r11)
            r.b.a.x.f r11 = r.b.a.x.g.a(r11)
            r.b.a.f r11 = r0.h(r11)
            r.b.a.v.i r0 = r.b.a.v.i.STRICT
            if (r12 != r0) goto L_0x02da
            int r12 = r11.l(r1)
            if (r12 != r3) goto L_0x02d4
            goto L_0x02da
        L_0x02d4:
            r.b.a.b r11 = new r.b.a.b
            r11.<init>(r6)
            throw r11
        L_0x02da:
            return r11
        L_0x02db:
            r.b.a.x.a r1 = r.b.a.x.a.DAY_OF_YEAR
            boolean r5 = r11.containsKey(r1)
            if (r5 == 0) goto L_0x0319
            java.lang.Object r5 = r11.remove(r0)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r0 = r0.l(r5)
            r.b.a.v.i r5 = r.b.a.v.i.LENIENT
            java.lang.Object r11 = r11.remove(r1)
            java.lang.Long r11 = (java.lang.Long) r11
            if (r12 != r5) goto L_0x030c
            long r11 = r11.longValue()
            long r11 = r.b.a.w.d.o(r11, r3)
            r.b.a.f r0 = r.b.a.f.c0(r0, r2)
            r.b.a.f r11 = r0.f0(r11)
            return r11
        L_0x030c:
            long r11 = r11.longValue()
            int r11 = r1.l(r11)
            r.b.a.f r11 = r.b.a.f.c0(r0, r11)
            return r11
        L_0x0319:
            r.b.a.x.a r1 = r.b.a.x.a.ALIGNED_WEEK_OF_YEAR
            boolean r5 = r11.containsKey(r1)
            if (r5 == 0) goto L_0x0429
            r.b.a.x.a r5 = r.b.a.x.a.ALIGNED_DAY_OF_WEEK_IN_YEAR
            boolean r7 = r11.containsKey(r5)
            if (r7 == 0) goto L_0x03a2
            java.lang.Object r6 = r11.remove(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            int r6 = r0.l(r6)
            r.b.a.v.i r7 = r.b.a.v.i.LENIENT
            if (r12 != r7) goto L_0x0364
            java.lang.Object r12 = r11.remove(r1)
            java.lang.Long r12 = (java.lang.Long) r12
            long r0 = r12.longValue()
            long r0 = r.b.a.w.d.o(r0, r3)
            java.lang.Object r11 = r11.remove(r5)
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            long r11 = r.b.a.w.d.o(r11, r3)
            r.b.a.f r2 = r.b.a.f.Z(r6, r2, r2)
            r.b.a.f r0 = r2.h0(r0)
            r.b.a.f r11 = r0.f0(r11)
            return r11
        L_0x0364:
            java.lang.Object r3 = r11.remove(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r1 = r1.l(r3)
            java.lang.Object r11 = r11.remove(r5)
            java.lang.Long r11 = (java.lang.Long) r11
            long r3 = r11.longValue()
            int r11 = r5.l(r3)
            r.b.a.f r3 = r.b.a.f.Z(r6, r2, r2)
            int r1 = r1 - r2
            int r1 = r1 * 7
            int r11 = r11 - r2
            int r1 = r1 + r11
            long r1 = (long) r1
            r.b.a.f r11 = r3.f0(r1)
            r.b.a.v.i r1 = r.b.a.v.i.STRICT
            if (r12 != r1) goto L_0x03a1
            int r12 = r11.l(r0)
            if (r12 != r6) goto L_0x0399
            goto L_0x03a1
        L_0x0399:
            r.b.a.b r11 = new r.b.a.b
            java.lang.String r12 = "Strict mode rejected date parsed to a different year"
            r11.<init>(r12)
            throw r11
        L_0x03a1:
            return r11
        L_0x03a2:
            r.b.a.x.a r5 = r.b.a.x.a.DAY_OF_WEEK
            boolean r7 = r11.containsKey(r5)
            if (r7 == 0) goto L_0x0429
            java.lang.Object r7 = r11.remove(r0)
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            int r7 = r0.l(r7)
            r.b.a.v.i r8 = r.b.a.v.i.LENIENT
            if (r12 != r8) goto L_0x03e5
            java.lang.Object r12 = r11.remove(r1)
            java.lang.Long r12 = (java.lang.Long) r12
            long r0 = r12.longValue()
            long r0 = r.b.a.w.d.o(r0, r3)
            java.lang.Object r11 = r11.remove(r5)
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            long r11 = r.b.a.w.d.o(r11, r3)
            r.b.a.f r2 = r.b.a.f.Z(r7, r2, r2)
            r.b.a.f r0 = r2.h0(r0)
            r.b.a.f r11 = r0.f0(r11)
            return r11
        L_0x03e5:
            java.lang.Object r3 = r11.remove(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r1 = r1.l(r3)
            java.lang.Object r11 = r11.remove(r5)
            java.lang.Long r11 = (java.lang.Long) r11
            long r3 = r11.longValue()
            int r11 = r5.l(r3)
            r.b.a.f r3 = r.b.a.f.Z(r7, r2, r2)
            int r1 = r1 - r2
            long r1 = (long) r1
            r.b.a.f r1 = r3.h0(r1)
            r.b.a.c r11 = r.b.a.c.a(r11)
            r.b.a.x.f r11 = r.b.a.x.g.a(r11)
            r.b.a.f r11 = r1.h(r11)
            r.b.a.v.i r1 = r.b.a.v.i.STRICT
            if (r12 != r1) goto L_0x0428
            int r12 = r11.l(r0)
            if (r12 != r7) goto L_0x0422
            goto L_0x0428
        L_0x0422:
            r.b.a.b r11 = new r.b.a.b
            r11.<init>(r6)
            throw r11
        L_0x0428:
            return r11
        L_0x0429:
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: r.b.a.u.m.B(java.util.Map, r.b.a.v.i):r.b.a.f");
    }

    /* renamed from: C */
    public t w(r.b.a.e eVar, q qVar) {
        return t.X(eVar, qVar);
    }

    public String k() {
        return "iso8601";
    }

    public String l() {
        return "ISO";
    }

    /* renamed from: x */
    public f c(e eVar) {
        return f.J(eVar);
    }

    /* renamed from: y */
    public n h(int i2) {
        return n.a(i2);
    }

    public boolean z(long j2) {
        return (3 & j2) == 0 && (j2 % 100 != 0 || j2 % 400 == 0);
    }
}
