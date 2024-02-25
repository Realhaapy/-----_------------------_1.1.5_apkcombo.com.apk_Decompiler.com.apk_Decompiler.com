package r.b.a.u;

import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import r.b.a.h;
import r.b.a.q;
import r.b.a.r;
import r.b.a.u.b;
import r.b.a.x.f;
import r.b.a.x.i;
import r.b.a.x.l;
import r.b.a.x.n;

final class d<D extends b> extends c<D> implements r.b.a.x.d, f, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* renamed from: e  reason: collision with root package name */
    private final D f5589e;

    /* renamed from: f  reason: collision with root package name */
    private final h f5590f;

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
            throw new UnsupportedOperationException("Method not decompiled: r.b.a.u.d.a.<clinit>():void");
        }
    }

    private d(D d2, h hVar) {
        r.b.a.w.d.i(d2, "date");
        r.b.a.w.d.i(hVar, "time");
        this.f5589e = d2;
        this.f5590f = hVar;
    }

    static <R extends b> d<R> I(R r2, h hVar) {
        return new d<>(r2, hVar);
    }

    private d<D> K(long j2) {
        return R(this.f5589e.s(j2, r.b.a.x.b.DAYS), this.f5590f);
    }

    private d<D> L(long j2) {
        return P(this.f5589e, j2, 0, 0, 0);
    }

    private d<D> M(long j2) {
        return P(this.f5589e, 0, j2, 0, 0);
    }

    private d<D> N(long j2) {
        return P(this.f5589e, 0, 0, 0, j2);
    }

    private d<D> P(D d2, long j2, long j3, long j4, long j5) {
        h H;
        D d3 = d2;
        if ((j2 | j3 | j4 | j5) == 0) {
            H = this.f5590f;
        } else {
            long Q = this.f5590f.Q();
            long j6 = (j5 % 86400000000000L) + ((j4 % 86400) * 1000000000) + ((j3 % 1440) * 60000000000L) + ((j2 % 24) * 3600000000000L) + Q;
            long e2 = (j5 / 86400000000000L) + (j4 / 86400) + (j3 / 1440) + (j2 / 24) + r.b.a.w.d.e(j6, 86400000000000L);
            long h2 = r.b.a.w.d.h(j6, 86400000000000L);
            H = h2 == Q ? this.f5590f : h.H(h2);
            d3 = d3.s(e2, r.b.a.x.b.DAYS);
        }
        return R(d3, H);
    }

    static c<?> Q(ObjectInput objectInput) {
        return ((b) objectInput.readObject()).v((h) objectInput.readObject());
    }

    private d<D> R(r.b.a.x.d dVar, h hVar) {
        D d2 = this.f5589e;
        return (d2 == dVar && this.f5590f == hVar) ? this : new d<>(d2.x().d(dVar), hVar);
    }

    private Object writeReplace() {
        return new u((byte) 12, this);
    }

    public D E() {
        return this.f5589e;
    }

    public h F() {
        return this.f5590f;
    }

    /* renamed from: J */
    public d<D> s(long j2, l lVar) {
        if (!(lVar instanceof r.b.a.x.b)) {
            return this.f5589e.x().f(lVar.c(this, j2));
        }
        switch (a.a[((r.b.a.x.b) lVar).ordinal()]) {
            case 1:
                return N(j2);
            case 2:
                return K(j2 / 86400000000L).N((j2 % 86400000000L) * 1000);
            case 3:
                return K(j2 / 86400000).N((j2 % 86400000) * 1000000);
            case 4:
                return O(j2);
            case 5:
                return M(j2);
            case 6:
                return L(j2);
            case 7:
                return K(j2 / 256).L((j2 % 256) * 12);
            default:
                return R(this.f5589e.s(j2, lVar), this.f5590f);
        }
    }

    /* access modifiers changed from: package-private */
    public d<D> O(long j2) {
        return P(this.f5589e, 0, 0, j2, 0);
    }

    /* renamed from: S */
    public d<D> h(f fVar) {
        return fVar instanceof b ? R((b) fVar, this.f5590f) : fVar instanceof h ? R(this.f5589e, (h) fVar) : fVar instanceof d ? this.f5589e.x().f((d) fVar) : this.f5589e.x().f((d) fVar.t(this));
    }

    /* renamed from: T */
    public d<D> k(i iVar, long j2) {
        return iVar instanceof r.b.a.x.a ? iVar.g() ? R(this.f5589e, this.f5590f.k(iVar, j2)) : R(this.f5589e.k(iVar, j2), this.f5590f) : this.f5589e.x().f(iVar.d(this, j2));
    }

    public n d(i iVar) {
        return iVar instanceof r.b.a.x.a ? iVar.g() ? this.f5590f.d(iVar) : this.f5589e.d(iVar) : iVar.h(this);
    }

    public boolean j(i iVar) {
        return iVar instanceof r.b.a.x.a ? iVar.a() || iVar.g() : iVar != null && iVar.c(this);
    }

    public int l(i iVar) {
        return iVar instanceof r.b.a.x.a ? iVar.g() ? this.f5590f.l(iVar) : this.f5589e.l(iVar) : d(iVar).a(n(iVar), iVar);
    }

    public long n(i iVar) {
        return iVar instanceof r.b.a.x.a ? iVar.g() ? this.f5590f.n(iVar) : this.f5589e.n(iVar) : iVar.f(this);
    }

    public f<D> v(q qVar) {
        return g.K(this, qVar, (r) null);
    }

    /* access modifiers changed from: package-private */
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f5589e);
        objectOutput.writeObject(this.f5590f);
    }
}
