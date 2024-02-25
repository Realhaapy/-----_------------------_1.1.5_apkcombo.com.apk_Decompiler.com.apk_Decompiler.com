package r.b.a.u;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Serializable;
import r.b.a.f;
import r.b.a.w.d;
import r.b.a.x.h;
import r.b.a.x.i;
import r.b.a.x.l;
import r.b.a.x.m;
import r.b.a.x.n;

public final class s extends a<s> implements Serializable {
    private static final long serialVersionUID = 1300372329181994526L;

    /* renamed from: e  reason: collision with root package name */
    private final f f5640e;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
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
                r.b.a.x.a r1 = r.b.a.x.a.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                r.b.a.x.a r1 = r.b.a.x.a.ALIGNED_WEEK_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                r.b.a.x.a r1 = r.b.a.x.a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                r.b.a.x.a r1 = r.b.a.x.a.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                r.b.a.x.a r1 = r.b.a.x.a.YEAR     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                r.b.a.x.a r1 = r.b.a.x.a.ERA     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r.b.a.u.s.a.<clinit>():void");
        }
    }

    s(f fVar) {
        d.i(fVar, "date");
        this.f5640e = fVar;
    }

    private long M() {
        return ((((long) N()) * 12) + ((long) this.f5640e.Q())) - 1;
    }

    private int N() {
        return this.f5640e.S() - 1911;
    }

    static b U(DataInput dataInput) {
        return r.f5639g.x(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private s V(f fVar) {
        return fVar.equals(this.f5640e) ? this : new s(fVar);
    }

    private Object writeReplace() {
        return new u((byte) 5, this);
    }

    public long D() {
        return this.f5640e.D();
    }

    /* renamed from: K */
    public r x() {
        return r.f5639g;
    }

    /* renamed from: L */
    public t y() {
        return (t) super.y();
    }

    /* renamed from: O */
    public s m(long j2, l lVar) {
        return (s) super.m(j2, lVar);
    }

    /* renamed from: P */
    public s s(long j2, l lVar) {
        return (s) super.s(j2, lVar);
    }

    /* renamed from: Q */
    public s C(h hVar) {
        return (s) super.C(hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public s H(long j2) {
        return V(this.f5640e.f0(j2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public s I(long j2) {
        return V(this.f5640e.g0(j2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public s J(long j2) {
        return V(this.f5640e.i0(j2));
    }

    /* renamed from: W */
    public s h(r.b.a.x.f fVar) {
        return (s) super.h(fVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r2 != 7) goto L_0x0053;
     */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r.b.a.u.s k(r.b.a.x.i r8, long r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof r.b.a.x.a
            if (r0 == 0) goto L_0x0094
            r0 = r8
            r.b.a.x.a r0 = (r.b.a.x.a) r0
            long r1 = r7.n(r0)
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x0010
            return r7
        L_0x0010:
            int[] r1 = r.b.a.u.s.a.a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            r3 = 7
            r4 = 6
            r5 = 4
            if (r2 == r5) goto L_0x003a
            r6 = 5
            if (r2 == r6) goto L_0x0025
            if (r2 == r4) goto L_0x003a
            if (r2 == r3) goto L_0x003a
            goto L_0x0053
        L_0x0025:
            r.b.a.u.r r8 = r7.x()
            r.b.a.x.n r8 = r8.A(r0)
            r8.b(r9, r0)
            long r0 = r7.M()
            long r9 = r9 - r0
            r.b.a.u.s r8 = r7.I(r9)
            return r8
        L_0x003a:
            r.b.a.u.r r2 = r7.x()
            r.b.a.x.n r2 = r2.A(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r5) goto L_0x007d
            if (r0 == r4) goto L_0x0070
            if (r0 == r3) goto L_0x005e
        L_0x0053:
            r.b.a.f r0 = r7.f5640e
            r.b.a.f r8 = r0.k(r8, r9)
            r.b.a.u.s r8 = r7.V(r8)
            return r8
        L_0x005e:
            r.b.a.f r8 = r7.f5640e
            int r9 = r7.N()
            int r1 = r1 - r9
            int r1 = r1 + 1911
            r.b.a.f r8 = r8.q0(r1)
            r.b.a.u.s r8 = r7.V(r8)
            return r8
        L_0x0070:
            r.b.a.f r8 = r7.f5640e
            int r2 = r2 + 1911
            r.b.a.f r8 = r8.q0(r2)
            r.b.a.u.s r8 = r7.V(r8)
            return r8
        L_0x007d:
            r.b.a.f r8 = r7.f5640e
            int r9 = r7.N()
            if (r9 < r1) goto L_0x0088
            int r2 = r2 + 1911
            goto L_0x008b
        L_0x0088:
            int r1 = r1 - r2
            int r2 = r1 + 1911
        L_0x008b:
            r.b.a.f r8 = r8.q0(r2)
            r.b.a.u.s r8 = r7.V(r8)
            return r8
        L_0x0094:
            r.b.a.x.d r8 = r8.d(r7, r9)
            r.b.a.u.s r8 = (r.b.a.u.s) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r.b.a.u.s.k(r.b.a.x.i, long):r.b.a.u.s");
    }

    /* access modifiers changed from: package-private */
    public void Y(DataOutput dataOutput) {
        dataOutput.writeInt(l(r.b.a.x.a.YEAR));
        dataOutput.writeByte(l(r.b.a.x.a.MONTH_OF_YEAR));
        dataOutput.writeByte(l(r.b.a.x.a.DAY_OF_MONTH));
    }

    public n d(i iVar) {
        if (!(iVar instanceof r.b.a.x.a)) {
            return iVar.h(this);
        }
        if (j(iVar)) {
            r.b.a.x.a aVar = (r.b.a.x.a) iVar;
            int i2 = a.a[aVar.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                return this.f5640e.d(iVar);
            }
            if (i2 != 4) {
                return x().A(aVar);
            }
            n k2 = r.b.a.x.a.YEAR.k();
            return n.i(1, N() <= 0 ? (-k2.d()) + 1 + 1911 : k2.c() - 1911);
        }
        throw new m("Unsupported field: " + iVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            return this.f5640e.equals(((s) obj).f5640e);
        }
        return false;
    }

    public int hashCode() {
        return x().l().hashCode() ^ this.f5640e.hashCode();
    }

    public long n(i iVar) {
        if (!(iVar instanceof r.b.a.x.a)) {
            return iVar.f(this);
        }
        int i2 = a.a[((r.b.a.x.a) iVar).ordinal()];
        int i3 = 1;
        if (i2 == 4) {
            int N = N();
            if (N < 1) {
                N = 1 - N;
            }
            return (long) N;
        } else if (i2 == 5) {
            return M();
        } else {
            if (i2 == 6) {
                return (long) N();
            }
            if (i2 != 7) {
                return this.f5640e.n(iVar);
            }
            if (N() < 1) {
                i3 = 0;
            }
            return (long) i3;
        }
    }

    public final c<s> v(r.b.a.h hVar) {
        return super.v(hVar);
    }
}
