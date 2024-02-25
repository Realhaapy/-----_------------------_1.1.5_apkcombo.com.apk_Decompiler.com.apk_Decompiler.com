package r.b.a.u;

import java.io.Serializable;
import r.b.a.f;
import r.b.a.q;
import r.b.a.x.e;
import r.b.a.x.n;

public final class r extends h implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    public static final r f5639g = new r();
    private static final long serialVersionUID = 1039765215346859963L;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                r.b.a.x.a[] r0 = r.b.a.x.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                r.b.a.x.a r1 = r.b.a.x.a.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x0012 }
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
                r.b.a.x.a r1 = r.b.a.x.a.YEAR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r.b.a.u.r.a.<clinit>():void");
        }
    }

    private r() {
    }

    private Object readResolve() {
        return f5639g;
    }

    public n A(r.b.a.x.a aVar) {
        int i2 = a.a[aVar.ordinal()];
        if (i2 == 1) {
            n k2 = r.b.a.x.a.PROLEPTIC_MONTH.k();
            return n.i(k2.d() - 22932, k2.c() - 22932);
        } else if (i2 == 2) {
            n k3 = r.b.a.x.a.YEAR.k();
            return n.j(1, k3.c() - 1911, (-k3.d()) + 1 + 1911);
        } else if (i2 != 3) {
            return aVar.k();
        } else {
            n k4 = r.b.a.x.a.YEAR.k();
            return n.i(k4.d() - 1911, k4.c() - 1911);
        }
    }

    public String k() {
        return "roc";
    }

    public String l() {
        return "Minguo";
    }

    public c<s> n(e eVar) {
        return super.n(eVar);
    }

    public f<s> w(r.b.a.e eVar, q qVar) {
        return super.w(eVar, qVar);
    }

    public s x(int i2, int i3, int i4) {
        return new s(f.Z(i2 + 1911, i3, i4));
    }

    /* renamed from: y */
    public s c(e eVar) {
        return eVar instanceof s ? (s) eVar : new s(f.J(eVar));
    }

    /* renamed from: z */
    public t h(int i2) {
        return t.a(i2);
    }
}
