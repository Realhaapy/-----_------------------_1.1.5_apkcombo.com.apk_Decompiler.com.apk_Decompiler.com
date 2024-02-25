package r.b.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import r.b.a.u.m;
import r.b.a.w.b;
import r.b.a.x.d;
import r.b.a.x.f;
import r.b.a.x.i;
import r.b.a.x.j;
import r.b.a.x.l;
import r.b.a.x.n;

public final class k extends b implements d, f, Comparable<k>, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;

    /* renamed from: e  reason: collision with root package name */
    private final g f5563e;

    /* renamed from: f  reason: collision with root package name */
    private final r f5564f;

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
            throw new UnsupportedOperationException("Method not decompiled: r.b.a.k.a.<clinit>():void");
        }
    }

    static {
        g.f5535g.I(r.f5580k);
        g.f5536h.I(r.f5579j);
    }

    private k(g gVar, r rVar) {
        r.b.a.w.d.i(gVar, "dateTime");
        this.f5563e = gVar;
        r.b.a.w.d.i(rVar, "offset");
        this.f5564f = rVar;
    }

    public static k A(e eVar, q qVar) {
        r.b.a.w.d.i(eVar, "instant");
        r.b.a.w.d.i(qVar, "zone");
        r a2 = qVar.c().a(eVar);
        return new k(g.X(eVar.x(), eVar.y(), a2), a2);
    }

    static k C(DataInput dataInput) {
        return z(g.i0(dataInput), r.D(dataInput));
    }

    private k H(g gVar, r rVar) {
        return (this.f5563e != gVar || !this.f5564f.equals(rVar)) ? new k(gVar, rVar) : this;
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 69, this);
    }

    public static k z(g gVar, r rVar) {
        return new k(gVar, rVar);
    }

    /* renamed from: B */
    public k s(long j2, l lVar) {
        return lVar instanceof r.b.a.x.b ? H(this.f5563e.s(j2, lVar), this.f5564f) : (k) lVar.c(this, j2);
    }

    public long D() {
        return this.f5563e.C(this.f5564f);
    }

    public f E() {
        return this.f5563e.E();
    }

    public g F() {
        return this.f5563e;
    }

    public h G() {
        return this.f5563e.F();
    }

    /* renamed from: I */
    public k h(f fVar) {
        return ((fVar instanceof f) || (fVar instanceof h) || (fVar instanceof g)) ? H(this.f5563e.h(fVar), this.f5564f) : fVar instanceof e ? A((e) fVar, this.f5564f) : fVar instanceof r ? H(this.f5563e, (r) fVar) : fVar instanceof k ? (k) fVar : (k) fVar.t(this);
    }

    /* renamed from: J */
    public k k(i iVar, long j2) {
        if (!(iVar instanceof r.b.a.x.a)) {
            return (k) iVar.d(this, j2);
        }
        r.b.a.x.a aVar = (r.b.a.x.a) iVar;
        int i2 = a.a[aVar.ordinal()];
        return i2 != 1 ? i2 != 2 ? H(this.f5563e.k(iVar, j2), this.f5564f) : H(this.f5563e, r.B(aVar.l(j2))) : A(e.C(j2, (long) w()), this.f5564f);
    }

    /* access modifiers changed from: package-private */
    public void K(DataOutput dataOutput) {
        this.f5563e.n0(dataOutput);
        this.f5564f.G(dataOutput);
    }

    public n d(i iVar) {
        return iVar instanceof r.b.a.x.a ? (iVar == r.b.a.x.a.INSTANT_SECONDS || iVar == r.b.a.x.a.OFFSET_SECONDS) ? iVar.k() : this.f5563e.d(iVar) : iVar.h(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f5563e.equals(kVar.f5563e) && this.f5564f.equals(kVar.f5564f);
    }

    public <R> R f(r.b.a.x.k<R> kVar) {
        if (kVar == j.a()) {
            return m.f5618g;
        }
        if (kVar == j.e()) {
            return r.b.a.x.b.NANOS;
        }
        if (kVar == j.d() || kVar == j.f()) {
            return x();
        }
        if (kVar == j.b()) {
            return E();
        }
        if (kVar == j.c()) {
            return G();
        }
        if (kVar == j.g()) {
            return null;
        }
        return super.f(kVar);
    }

    public int hashCode() {
        return this.f5563e.hashCode() ^ this.f5564f.hashCode();
    }

    public boolean j(i iVar) {
        return (iVar instanceof r.b.a.x.a) || (iVar != null && iVar.c(this));
    }

    public int l(i iVar) {
        if (!(iVar instanceof r.b.a.x.a)) {
            return super.l(iVar);
        }
        int i2 = a.a[((r.b.a.x.a) iVar).ordinal()];
        if (i2 != 1) {
            return i2 != 2 ? this.f5563e.l(iVar) : x().y();
        }
        throw new b("Field too large for an int: " + iVar);
    }

    public long n(i iVar) {
        if (!(iVar instanceof r.b.a.x.a)) {
            return iVar.f(this);
        }
        int i2 = a.a[((r.b.a.x.a) iVar).ordinal()];
        return i2 != 1 ? i2 != 2 ? this.f5563e.n(iVar) : (long) x().y() : D();
    }

    public d t(d dVar) {
        return dVar.k(r.b.a.x.a.EPOCH_DAY, E().D()).k(r.b.a.x.a.NANO_OF_DAY, G().Q()).k(r.b.a.x.a.OFFSET_SECONDS, (long) x().y());
    }

    public String toString() {
        return this.f5563e.toString() + this.f5564f.toString();
    }

    /* renamed from: v */
    public int compareTo(k kVar) {
        if (x().equals(kVar.x())) {
            return F().compareTo(kVar.F());
        }
        int b = r.b.a.w.d.b(D(), kVar.D());
        if (b != 0) {
            return b;
        }
        int B = G().B() - kVar.G().B();
        return B == 0 ? F().compareTo(kVar.F()) : B;
    }

    public int w() {
        return this.f5563e.R();
    }

    public r x() {
        return this.f5564f;
    }

    /* renamed from: y */
    public k m(long j2, l lVar) {
        return j2 == Long.MIN_VALUE ? s(Long.MAX_VALUE, lVar).s(1, lVar) : s(-j2, lVar);
    }
}
