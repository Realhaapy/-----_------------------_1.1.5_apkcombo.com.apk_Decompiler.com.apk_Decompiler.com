package r.b.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.List;
import r.b.a.u.f;
import r.b.a.x.b;
import r.b.a.x.d;
import r.b.a.x.i;
import r.b.a.x.j;
import r.b.a.x.k;
import r.b.a.x.l;
import r.b.a.x.n;

public final class t extends f<f> implements d, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* renamed from: e  reason: collision with root package name */
    private final g f5586e;

    /* renamed from: f  reason: collision with root package name */
    private final r f5587f;

    /* renamed from: g  reason: collision with root package name */
    private final q f5588g;

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
            throw new UnsupportedOperationException("Method not decompiled: r.b.a.t.a.<clinit>():void");
        }
    }

    private t(g gVar, r rVar, q qVar) {
        this.f5586e = gVar;
        this.f5587f = rVar;
        this.f5588g = qVar;
    }

    private static t J(long j2, int i2, q qVar) {
        r a2 = qVar.c().a(e.C(j2, (long) i2));
        return new t(g.X(j2, i2, a2), a2, qVar);
    }

    public static t T(a aVar) {
        r.b.a.w.d.i(aVar, "clock");
        return X(aVar.b(), aVar.a());
    }

    public static t U(q qVar) {
        return T(a.c(qVar));
    }

    public static t V(int i2, int i3, int i4, int i5, int i6, int i7, int i8, q qVar) {
        return a0(g.V(i2, i3, i4, i5, i6, i7, i8), qVar, (r) null);
    }

    public static t W(g gVar, q qVar) {
        return a0(gVar, qVar, (r) null);
    }

    public static t X(e eVar, q qVar) {
        r.b.a.w.d.i(eVar, "instant");
        r.b.a.w.d.i(qVar, "zone");
        return J(eVar.x(), eVar.y(), qVar);
    }

    public static t Y(g gVar, r rVar, q qVar) {
        r.b.a.w.d.i(gVar, "localDateTime");
        r.b.a.w.d.i(rVar, "offset");
        r.b.a.w.d.i(qVar, "zone");
        return J(gVar.C(rVar), gVar.R(), qVar);
    }

    private static t Z(g gVar, r rVar, q qVar) {
        r.b.a.w.d.i(gVar, "localDateTime");
        r.b.a.w.d.i(rVar, "offset");
        r.b.a.w.d.i(qVar, "zone");
        if (!(qVar instanceof r) || rVar.equals(qVar)) {
            return new t(gVar, rVar, qVar);
        }
        throw new IllegalArgumentException("ZoneId must match ZoneOffset");
    }

    public static t a0(g gVar, q qVar, r rVar) {
        Object obj;
        r.b.a.w.d.i(gVar, "localDateTime");
        r.b.a.w.d.i(qVar, "zone");
        if (qVar instanceof r) {
            return new t(gVar, (r) qVar, qVar);
        }
        r.b.a.y.f c = qVar.c();
        List c2 = c.c(gVar);
        if (c2.size() == 1) {
            obj = c2.get(0);
        } else {
            if (c2.size() == 0) {
                r.b.a.y.d b = c.b(gVar);
                gVar = gVar.f0(b.f().f());
                rVar = b.j();
            } else if (rVar == null || !c2.contains(rVar)) {
                obj = c2.get(0);
                r.b.a.w.d.i(obj, "offset");
            }
            return new t(gVar, rVar, qVar);
        }
        rVar = (r) obj;
        return new t(gVar, rVar, qVar);
    }

    static t d0(DataInput dataInput) {
        return Z(g.i0(dataInput), r.D(dataInput), (q) n.a(dataInput));
    }

    private t e0(g gVar) {
        return Y(gVar, this.f5587f, this.f5588g);
    }

    private t f0(g gVar) {
        return a0(gVar, this.f5588g, this.f5587f);
    }

    private t g0(r rVar) {
        return (rVar.equals(this.f5587f) || !this.f5588g.c().e(this.f5586e, rVar)) ? this : new t(this.f5586e, rVar, this.f5588g);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 6, this);
    }

    public h F() {
        return this.f5586e.F();
    }

    public int K() {
        return this.f5586e.M();
    }

    public c L() {
        return this.f5586e.N();
    }

    public int M() {
        return this.f5586e.O();
    }

    public int N() {
        return this.f5586e.P();
    }

    public int O() {
        return this.f5586e.Q();
    }

    public int P() {
        return this.f5586e.R();
    }

    public int Q() {
        return this.f5586e.S();
    }

    public int R() {
        return this.f5586e.T();
    }

    /* renamed from: S */
    public t z(long j2, l lVar) {
        return j2 == Long.MIN_VALUE ? s(Long.MAX_VALUE, lVar).s(1, lVar) : s(-j2, lVar);
    }

    /* renamed from: b0 */
    public t s(long j2, l lVar) {
        return lVar instanceof b ? lVar.a() ? f0(this.f5586e.s(j2, lVar)) : e0(this.f5586e.s(j2, lVar)) : (t) lVar.c(this, j2);
    }

    public t c0(long j2) {
        return f0(this.f5586e.b0(j2));
    }

    public n d(i iVar) {
        return iVar instanceof r.b.a.x.a ? (iVar == r.b.a.x.a.INSTANT_SECONDS || iVar == r.b.a.x.a.OFFSET_SECONDS) ? iVar.k() : this.f5586e.d(iVar) : iVar.h(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f5586e.equals(tVar.f5586e) && this.f5587f.equals(tVar.f5587f) && this.f5588g.equals(tVar.f5588g);
    }

    public <R> R f(k<R> kVar) {
        return kVar == j.b() ? D() : super.f(kVar);
    }

    /* renamed from: h0 */
    public f D() {
        return this.f5586e.E();
    }

    public int hashCode() {
        return (this.f5586e.hashCode() ^ this.f5587f.hashCode()) ^ Integer.rotateLeft(this.f5588g.hashCode(), 3);
    }

    /* renamed from: i0 */
    public g E() {
        return this.f5586e;
    }

    public boolean j(i iVar) {
        return (iVar instanceof r.b.a.x.a) || (iVar != null && iVar.c(this));
    }

    /* renamed from: j0 */
    public t h(r.b.a.x.f fVar) {
        if (fVar instanceof f) {
            return f0(g.W((f) fVar, this.f5586e.F()));
        }
        if (fVar instanceof h) {
            return f0(g.W(this.f5586e.E(), (h) fVar));
        }
        if (fVar instanceof g) {
            return f0((g) fVar);
        }
        if (!(fVar instanceof e)) {
            return fVar instanceof r ? g0((r) fVar) : (t) fVar.t(this);
        }
        e eVar = (e) fVar;
        return J(eVar.x(), eVar.y(), this.f5588g);
    }

    /* renamed from: k0 */
    public t k(i iVar, long j2) {
        if (!(iVar instanceof r.b.a.x.a)) {
            return (t) iVar.d(this, j2);
        }
        r.b.a.x.a aVar = (r.b.a.x.a) iVar;
        int i2 = a.a[aVar.ordinal()];
        return i2 != 1 ? i2 != 2 ? f0(this.f5586e.k(iVar, j2)) : g0(r.B(aVar.l(j2))) : J(j2, P(), this.f5588g);
    }

    public int l(i iVar) {
        if (!(iVar instanceof r.b.a.x.a)) {
            return super.l(iVar);
        }
        int i2 = a.a[((r.b.a.x.a) iVar).ordinal()];
        if (i2 != 1) {
            return i2 != 2 ? this.f5586e.l(iVar) : w().y();
        }
        throw new b("Field too large for an int: " + iVar);
    }

    /* renamed from: l0 */
    public t I(q qVar) {
        r.b.a.w.d.i(qVar, "zone");
        return this.f5588g.equals(qVar) ? this : a0(this.f5586e, qVar, this.f5587f);
    }

    /* access modifiers changed from: package-private */
    public void m0(DataOutput dataOutput) {
        this.f5586e.n0(dataOutput);
        this.f5587f.G(dataOutput);
        this.f5588g.v(dataOutput);
    }

    public long n(i iVar) {
        if (!(iVar instanceof r.b.a.x.a)) {
            return iVar.f(this);
        }
        int i2 = a.a[((r.b.a.x.a) iVar).ordinal()];
        return i2 != 1 ? i2 != 2 ? this.f5586e.n(iVar) : (long) w().y() : B();
    }

    public String toString() {
        String str = this.f5586e.toString() + this.f5587f.toString();
        if (this.f5587f == this.f5588g) {
            return str;
        }
        return str + '[' + this.f5588g.toString() + ']';
    }

    public r w() {
        return this.f5587f;
    }

    public q x() {
        return this.f5588g;
    }
}
