package r.b.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import r.b.a.u.c;
import r.b.a.x.d;
import r.b.a.x.e;
import r.b.a.x.f;
import r.b.a.x.i;
import r.b.a.x.j;
import r.b.a.x.k;
import r.b.a.x.l;
import r.b.a.x.n;

public final class g extends c<f> implements d, f, Serializable {

    /* renamed from: g  reason: collision with root package name */
    public static final g f5535g = W(f.f5530h, h.f5540i);

    /* renamed from: h  reason: collision with root package name */
    public static final g f5536h = W(f.f5531i, h.f5541j);

    /* renamed from: i  reason: collision with root package name */
    public static final k<g> f5537i = new a();
    private static final long serialVersionUID = 6207766400415563566L;

    /* renamed from: e  reason: collision with root package name */
    private final f f5538e;

    /* renamed from: f  reason: collision with root package name */
    private final h f5539f;

    class a implements k<g> {
        a() {
        }

        /* renamed from: b */
        public g a(e eVar) {
            return g.L(eVar);
        }
    }

    static /* synthetic */ class b {
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
                r.b.a.x.b[] r0 = r.b.a.x.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                r.b.a.x.b r1 = r.b.a.x.b.NANOS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                r.b.a.x.b r1 = r.b.a.x.b.MICROS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                r.b.a.x.b r1 = r.b.a.x.b.MILLIS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                r.b.a.x.b r1 = r.b.a.x.b.SECONDS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                r.b.a.x.b r1 = r.b.a.x.b.MINUTES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                r.b.a.x.b r1 = r.b.a.x.b.HOURS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                r.b.a.x.b r1 = r.b.a.x.b.HALF_DAYS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r.b.a.g.b.<clinit>():void");
        }
    }

    private g(f fVar, h hVar) {
        this.f5538e = fVar;
        this.f5539f = hVar;
    }

    private int K(g gVar) {
        int H = this.f5538e.H(gVar.E());
        return H == 0 ? this.f5539f.compareTo(gVar.F()) : H;
    }

    public static g L(e eVar) {
        if (eVar instanceof g) {
            return (g) eVar;
        }
        if (eVar instanceof t) {
            return ((t) eVar).E();
        }
        try {
            return new g(f.J(eVar), h.x(eVar));
        } catch (b unused) {
            throw new b("Unable to obtain LocalDateTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    public static g V(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return new g(f.Z(i2, i3, i4), h.G(i5, i6, i7, i8));
    }

    public static g W(f fVar, h hVar) {
        r.b.a.w.d.i(fVar, "date");
        r.b.a.w.d.i(hVar, "time");
        return new g(fVar, hVar);
    }

    public static g X(long j2, int i2, r rVar) {
        r.b.a.w.d.i(rVar, "offset");
        long y = j2 + ((long) rVar.y());
        return new g(f.b0(r.b.a.w.d.e(y, 86400)), h.J((long) r.b.a.w.d.g(y, 86400), i2));
    }

    public static g Y(CharSequence charSequence) {
        return Z(charSequence, r.b.a.v.b.f5663j);
    }

    public static g Z(CharSequence charSequence, r.b.a.v.b bVar) {
        r.b.a.w.d.i(bVar, "formatter");
        return (g) bVar.h(charSequence, f5537i);
    }

    private g h0(f fVar, long j2, long j3, long j4, long j5, int i2) {
        h H;
        f fVar2 = fVar;
        if ((j2 | j3 | j4 | j5) == 0) {
            H = this.f5539f;
        } else {
            long j6 = (long) i2;
            long Q = this.f5539f.Q();
            long j7 = (((j5 % 86400000000000L) + ((j4 % 86400) * 1000000000) + ((j3 % 1440) * 60000000000L) + ((j2 % 24) * 3600000000000L)) * j6) + Q;
            long e2 = (((j5 / 86400000000000L) + (j4 / 86400) + (j3 / 1440) + (j2 / 24)) * j6) + r.b.a.w.d.e(j7, 86400000000000L);
            long h2 = r.b.a.w.d.h(j7, 86400000000000L);
            H = h2 == Q ? this.f5539f : h.H(h2);
            fVar2 = fVar2.f0(e2);
        }
        return k0(fVar2, H);
    }

    static g i0(DataInput dataInput) {
        return W(f.j0(dataInput), h.P(dataInput));
    }

    private g k0(f fVar, h hVar) {
        return (this.f5538e == fVar && this.f5539f == hVar) ? this : new g(fVar, hVar);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 4, this);
    }

    public h F() {
        return this.f5539f;
    }

    public k I(r rVar) {
        return k.z(this, rVar);
    }

    /* renamed from: J */
    public t v(q qVar) {
        return t.W(this, qVar);
    }

    public int M() {
        return this.f5538e.M();
    }

    public c N() {
        return this.f5538e.N();
    }

    public int O() {
        return this.f5539f.z();
    }

    public int P() {
        return this.f5539f.A();
    }

    public int Q() {
        return this.f5538e.Q();
    }

    public int R() {
        return this.f5539f.B();
    }

    public int S() {
        return this.f5539f.C();
    }

    public int T() {
        return this.f5538e.S();
    }

    /* renamed from: U */
    public g m(long j2, l lVar) {
        return j2 == Long.MIN_VALUE ? s(Long.MAX_VALUE, lVar).s(1, lVar) : s(-j2, lVar);
    }

    /* renamed from: a0 */
    public g s(long j2, l lVar) {
        if (!(lVar instanceof r.b.a.x.b)) {
            return (g) lVar.c(this, j2);
        }
        switch (b.a[((r.b.a.x.b) lVar).ordinal()]) {
            case 1:
                return e0(j2);
            case 2:
                return b0(j2 / 86400000000L).e0((j2 % 86400000000L) * 1000);
            case 3:
                return b0(j2 / 86400000).e0((j2 % 86400000) * 1000000);
            case 4:
                return f0(j2);
            case 5:
                return d0(j2);
            case 6:
                return c0(j2);
            case 7:
                return b0(j2 / 256).c0((j2 % 256) * 12);
            default:
                return k0(this.f5538e.s(j2, lVar), this.f5539f);
        }
    }

    public g b0(long j2) {
        return k0(this.f5538e.f0(j2), this.f5539f);
    }

    public g c0(long j2) {
        return h0(this.f5538e, j2, 0, 0, 0, 1);
    }

    public n d(i iVar) {
        return iVar instanceof r.b.a.x.a ? iVar.g() ? this.f5539f.d(iVar) : this.f5538e.d(iVar) : iVar.h(this);
    }

    public g d0(long j2) {
        return h0(this.f5538e, 0, j2, 0, 0, 1);
    }

    public g e0(long j2) {
        return h0(this.f5538e, 0, 0, 0, j2, 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f5538e.equals(gVar.f5538e) && this.f5539f.equals(gVar.f5539f);
    }

    public <R> R f(k<R> kVar) {
        return kVar == j.b() ? E() : super.f(kVar);
    }

    public g f0(long j2) {
        return h0(this.f5538e, 0, 0, j2, 0, 1);
    }

    public g g0(long j2) {
        return k0(this.f5538e.h0(j2), this.f5539f);
    }

    public int hashCode() {
        return this.f5538e.hashCode() ^ this.f5539f.hashCode();
    }

    public boolean j(i iVar) {
        return iVar instanceof r.b.a.x.a ? iVar.a() || iVar.g() : iVar != null && iVar.c(this);
    }

    /* renamed from: j0 */
    public f E() {
        return this.f5538e;
    }

    public int l(i iVar) {
        return iVar instanceof r.b.a.x.a ? iVar.g() ? this.f5539f.l(iVar) : this.f5538e.l(iVar) : super.l(iVar);
    }

    /* renamed from: l0 */
    public g h(f fVar) {
        return fVar instanceof f ? k0((f) fVar, this.f5539f) : fVar instanceof h ? k0(this.f5538e, (h) fVar) : fVar instanceof g ? (g) fVar : (g) fVar.t(this);
    }

    /* renamed from: m0 */
    public g k(i iVar, long j2) {
        return iVar instanceof r.b.a.x.a ? iVar.g() ? k0(this.f5538e, this.f5539f.k(iVar, j2)) : k0(this.f5538e.k(iVar, j2), this.f5539f) : (g) iVar.d(this, j2);
    }

    public long n(i iVar) {
        return iVar instanceof r.b.a.x.a ? iVar.g() ? this.f5539f.n(iVar) : this.f5538e.n(iVar) : iVar.f(this);
    }

    /* access modifiers changed from: package-private */
    public void n0(DataOutput dataOutput) {
        this.f5538e.r0(dataOutput);
        this.f5539f.Y(dataOutput);
    }

    public d t(d dVar) {
        return super.t(dVar);
    }

    public String toString() {
        return this.f5538e.toString() + 'T' + this.f5539f.toString();
    }

    /* renamed from: w */
    public int compareTo(c<?> cVar) {
        return cVar instanceof g ? K((g) cVar) : super.compareTo(cVar);
    }

    public boolean y(c<?> cVar) {
        return cVar instanceof g ? K((g) cVar) > 0 : super.y(cVar);
    }

    public boolean z(c<?> cVar) {
        return cVar instanceof g ? K((g) cVar) < 0 : super.z(cVar);
    }
}
