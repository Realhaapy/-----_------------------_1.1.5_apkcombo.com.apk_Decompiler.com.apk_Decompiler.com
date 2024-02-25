package r.b.a.u;

import r.b.a.e;
import r.b.a.h;
import r.b.a.q;
import r.b.a.r;
import r.b.a.u.b;
import r.b.a.x.d;
import r.b.a.x.i;
import r.b.a.x.j;
import r.b.a.x.k;
import r.b.a.x.l;
import r.b.a.x.m;
import r.b.a.x.n;

public abstract class f<D extends b> extends r.b.a.w.b implements d, Comparable<f<?>> {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                r.b.a.x.a[] r0 = r.b.a.x.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                r.b.a.x.a r1 = r.b.a.x.a.INSTANT_SECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                r.b.a.x.a r1 = r.b.a.x.a.OFFSET_SECONDS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r.b.a.u.f.a.<clinit>():void");
        }
    }

    /* renamed from: A */
    public abstract f<D> s(long j2, l lVar);

    public long B() {
        return ((D().D() * 86400) + ((long) F().R())) - ((long) w().y());
    }

    public e C() {
        return e.C(B(), (long) F().B());
    }

    public D D() {
        return E().E();
    }

    public abstract c<D> E();

    public h F() {
        return E().F();
    }

    /* renamed from: G */
    public f<D> h(r.b.a.x.f fVar) {
        return D().x().g(super.h(fVar));
    }

    /* renamed from: H */
    public abstract f<D> k(i iVar, long j2);

    public abstract f<D> I(q qVar);

    public n d(i iVar) {
        return iVar instanceof r.b.a.x.a ? (iVar == r.b.a.x.a.INSTANT_SECONDS || iVar == r.b.a.x.a.OFFSET_SECONDS) ? iVar.k() : E().d(iVar) : iVar.h(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && compareTo((f) obj) == 0;
    }

    public <R> R f(k<R> kVar) {
        return (kVar == j.g() || kVar == j.f()) ? x() : kVar == j.a() ? D().x() : kVar == j.e() ? r.b.a.x.b.NANOS : kVar == j.d() ? w() : kVar == j.b() ? r.b.a.f.b0(D().D()) : kVar == j.c() ? F() : super.f(kVar);
    }

    public int hashCode() {
        return (E().hashCode() ^ w().hashCode()) ^ Integer.rotateLeft(x().hashCode(), 3);
    }

    public int l(i iVar) {
        if (!(iVar instanceof r.b.a.x.a)) {
            return super.l(iVar);
        }
        int i2 = a.a[((r.b.a.x.a) iVar).ordinal()];
        if (i2 != 1) {
            return i2 != 2 ? E().l(iVar) : w().y();
        }
        throw new m("Field too large for an int: " + iVar);
    }

    public long n(i iVar) {
        if (!(iVar instanceof r.b.a.x.a)) {
            return iVar.f(this);
        }
        int i2 = a.a[((r.b.a.x.a) iVar).ordinal()];
        return i2 != 1 ? i2 != 2 ? E().n(iVar) : (long) w().y() : B();
    }

    public String toString() {
        String str = E().toString() + w().toString();
        if (w() == x()) {
            return str;
        }
        return str + '[' + x().toString() + ']';
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [r.b.a.u.f<?>, r.b.a.u.f] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(r.b.a.u.f<?> r5) {
        /*
            r4 = this;
            long r0 = r4.B()
            long r2 = r5.B()
            int r0 = r.b.a.w.d.b(r0, r2)
            if (r0 != 0) goto L_0x0059
            r.b.a.h r0 = r4.F()
            int r0 = r0.B()
            r.b.a.h r1 = r5.F()
            int r1 = r1.B()
            int r0 = r0 - r1
            if (r0 != 0) goto L_0x0059
            r.b.a.u.c r0 = r4.E()
            r.b.a.u.c r1 = r5.E()
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0059
            r.b.a.q r0 = r4.x()
            java.lang.String r0 = r0.a()
            r.b.a.q r1 = r5.x()
            java.lang.String r1 = r1.a()
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0059
            r.b.a.u.b r0 = r4.D()
            r.b.a.u.h r0 = r0.x()
            r.b.a.u.b r5 = r5.D()
            r.b.a.u.h r5 = r5.x()
            int r0 = r0.compareTo(r5)
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r.b.a.u.f.compareTo(r.b.a.u.f):int");
    }

    public abstract r w();

    public abstract q x();

    public boolean y(f<?> fVar) {
        int i2 = (B() > fVar.B() ? 1 : (B() == fVar.B() ? 0 : -1));
        return i2 < 0 || (i2 == 0 && F().B() < fVar.F().B());
    }

    /* renamed from: z */
    public f<D> m(long j2, l lVar) {
        return D().x().g(super.m(j2, lVar));
    }
}
