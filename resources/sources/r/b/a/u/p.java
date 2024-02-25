package r.b.a.u;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import r.b.a.b;
import r.b.a.f;
import r.b.a.x.h;
import r.b.a.x.i;
import r.b.a.x.l;
import r.b.a.x.m;
import r.b.a.x.n;

public final class p extends a<p> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    static final f f5627h = f.Z(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* renamed from: e  reason: collision with root package name */
    private final f f5628e;

    /* renamed from: f  reason: collision with root package name */
    private transient q f5629f;

    /* renamed from: g  reason: collision with root package name */
    private transient int f5630g;

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
                r.b.a.x.a r1 = r.b.a.x.a.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                r.b.a.x.a r1 = r.b.a.x.a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                r.b.a.x.a r1 = r.b.a.x.a.ALIGNED_DAY_OF_WEEK_IN_MONTH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                r.b.a.x.a r1 = r.b.a.x.a.ALIGNED_DAY_OF_WEEK_IN_YEAR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                r.b.a.x.a r1 = r.b.a.x.a.ALIGNED_WEEK_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                r.b.a.x.a r1 = r.b.a.x.a.ALIGNED_WEEK_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x0049 }
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
            throw new UnsupportedOperationException("Method not decompiled: r.b.a.u.p.a.<clinit>():void");
        }
    }

    p(f fVar) {
        if (!fVar.z(f5627h)) {
            q v = q.v(fVar);
            this.f5629f = v;
            this.f5630g = fVar.S() - (v.z().S() - 1);
            this.f5628e = fVar;
            return;
        }
        throw new b("Minimum supported date is January 1st Meiji 6");
    }

    private n K(int i2) {
        Calendar instance = Calendar.getInstance(o.f5622g);
        instance.set(0, this.f5629f.getValue() + 2);
        instance.set(this.f5630g, this.f5628e.Q() - 1, this.f5628e.M());
        return n.i((long) instance.getActualMinimum(i2), (long) instance.getActualMaximum(i2));
    }

    private long M() {
        return (long) (this.f5630g == 1 ? (this.f5628e.O() - this.f5629f.z().O()) + 1 : this.f5628e.O());
    }

    static b U(DataInput dataInput) {
        return o.f5623h.x(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private p V(f fVar) {
        return fVar.equals(this.f5628e) ? this : new p(fVar);
    }

    private p Y(int i2) {
        return Z(y(), i2);
    }

    private p Z(q qVar, int i2) {
        return V(this.f5628e.q0(o.f5623h.A(qVar, i2)));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        q v = q.v(this.f5628e);
        this.f5629f = v;
        this.f5630g = this.f5628e.S() - (v.z().S() - 1);
    }

    private Object writeReplace() {
        return new u((byte) 1, this);
    }

    public long D() {
        return this.f5628e.D();
    }

    /* renamed from: L */
    public o x() {
        return o.f5623h;
    }

    /* renamed from: N */
    public q y() {
        return this.f5629f;
    }

    /* renamed from: O */
    public p m(long j2, l lVar) {
        return (p) super.m(j2, lVar);
    }

    /* renamed from: P */
    public p s(long j2, l lVar) {
        return (p) super.s(j2, lVar);
    }

    /* renamed from: Q */
    public p C(h hVar) {
        return (p) super.C(hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public p H(long j2) {
        return V(this.f5628e.f0(j2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public p I(long j2) {
        return V(this.f5628e.g0(j2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public p J(long j2) {
        return V(this.f5628e.i0(j2));
    }

    /* renamed from: W */
    public p h(r.b.a.x.f fVar) {
        return (p) super.h(fVar);
    }

    /* renamed from: X */
    public p k(i iVar, long j2) {
        if (!(iVar instanceof r.b.a.x.a)) {
            return (p) iVar.d(this, j2);
        }
        r.b.a.x.a aVar = (r.b.a.x.a) iVar;
        if (n(aVar) == j2) {
            return this;
        }
        int[] iArr = a.a;
        int i2 = iArr[aVar.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 7) {
            int a2 = x().B(aVar).a(j2, aVar);
            int i3 = iArr[aVar.ordinal()];
            if (i3 == 1) {
                return V(this.f5628e.f0(((long) a2) - M()));
            }
            if (i3 == 2) {
                return Y(a2);
            }
            if (i3 == 7) {
                return Z(q.w(a2), this.f5630g);
            }
        }
        return V(this.f5628e.k(iVar, j2));
    }

    /* access modifiers changed from: package-private */
    public void a0(DataOutput dataOutput) {
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
            return i2 != 1 ? i2 != 2 ? x().B(aVar) : K(1) : K(6);
        }
        throw new m("Unsupported field: " + iVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return this.f5628e.equals(((p) obj).f5628e);
        }
        return false;
    }

    public int hashCode() {
        return x().l().hashCode() ^ this.f5628e.hashCode();
    }

    public boolean j(i iVar) {
        if (iVar == r.b.a.x.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || iVar == r.b.a.x.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || iVar == r.b.a.x.a.ALIGNED_WEEK_OF_MONTH || iVar == r.b.a.x.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return super.j(iVar);
    }

    public long n(i iVar) {
        if (!(iVar instanceof r.b.a.x.a)) {
            return iVar.f(this);
        }
        switch (a.a[((r.b.a.x.a) iVar).ordinal()]) {
            case 1:
                return M();
            case 2:
                return (long) this.f5630g;
            case 3:
            case 4:
            case 5:
            case 6:
                throw new m("Unsupported field: " + iVar);
            case 7:
                return (long) this.f5629f.getValue();
            default:
                return this.f5628e.n(iVar);
        }
    }

    public final c<p> v(r.b.a.h hVar) {
        return super.v(hVar);
    }
}
