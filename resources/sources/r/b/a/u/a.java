package r.b.a.u;

import java.io.Serializable;
import r.b.a.h;
import r.b.a.u.b;
import r.b.a.x.d;
import r.b.a.x.f;
import r.b.a.x.l;

abstract class a<D extends b> extends b implements d, f, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    /* renamed from: r.b.a.u.a$a  reason: collision with other inner class name */
    static /* synthetic */ class C0154a {
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
                r.b.a.x.b r1 = r.b.a.x.b.DAYS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                r.b.a.x.b r1 = r.b.a.x.b.WEEKS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                r.b.a.x.b r1 = r.b.a.x.b.MONTHS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                r.b.a.x.b r1 = r.b.a.x.b.YEARS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                r.b.a.x.b r1 = r.b.a.x.b.DECADES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                r.b.a.x.b r1 = r.b.a.x.b.CENTURIES     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                r.b.a.x.b r1 = r.b.a.x.b.MILLENNIA     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r.b.a.u.a.C0154a.<clinit>():void");
        }
    }

    a() {
    }

    /* renamed from: G */
    public a<D> s(long j2, l lVar) {
        if (!(lVar instanceof r.b.a.x.b)) {
            return (a) x().d(lVar.c(this, j2));
        }
        switch (C0154a.a[((r.b.a.x.b) lVar).ordinal()]) {
            case 1:
                return H(j2);
            case 2:
                return H(r.b.a.w.d.l(j2, 7));
            case 3:
                return I(j2);
            case 4:
                return J(j2);
            case 5:
                return J(r.b.a.w.d.l(j2, 10));
            case 6:
                return J(r.b.a.w.d.l(j2, 100));
            case 7:
                return J(r.b.a.w.d.l(j2, 1000));
            default:
                throw new r.b.a.b(lVar + " not valid for chronology " + x().l());
        }
    }

    /* access modifiers changed from: package-private */
    public abstract a<D> H(long j2);

    /* access modifiers changed from: package-private */
    public abstract a<D> I(long j2);

    /* access modifiers changed from: package-private */
    public abstract a<D> J(long j2);

    public c<?> v(h hVar) {
        return d.I(this, hVar);
    }
}
