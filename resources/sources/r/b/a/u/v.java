package r.b.a.u;

import java.io.Serializable;
import java.util.HashMap;
import r.b.a.f;
import r.b.a.q;
import r.b.a.x.e;
import r.b.a.x.n;

public final class v extends h implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    public static final v f5646g = new v();

    /* renamed from: h  reason: collision with root package name */
    private static final HashMap<String, String[]> f5647h;

    /* renamed from: i  reason: collision with root package name */
    private static final HashMap<String, String[]> f5648i;

    /* renamed from: j  reason: collision with root package name */
    private static final HashMap<String, String[]> f5649j;
    private static final long serialVersionUID = 2775954514031616474L;

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
            throw new UnsupportedOperationException("Method not decompiled: r.b.a.u.v.a.<clinit>():void");
        }
    }

    static {
        HashMap<String, String[]> hashMap = new HashMap<>();
        f5647h = hashMap;
        HashMap<String, String[]> hashMap2 = new HashMap<>();
        f5648i = hashMap2;
        HashMap<String, String[]> hashMap3 = new HashMap<>();
        f5649j = hashMap3;
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private v() {
    }

    private Object readResolve() {
        return f5646g;
    }

    public n A(r.b.a.x.a aVar) {
        int i2 = a.a[aVar.ordinal()];
        if (i2 == 1) {
            n k2 = r.b.a.x.a.PROLEPTIC_MONTH.k();
            return n.i(k2.d() + 6516, k2.c() + 6516);
        } else if (i2 == 2) {
            n k3 = r.b.a.x.a.YEAR.k();
            return n.j(1, 1 + (-(k3.d() + 543)), k3.c() + 543);
        } else if (i2 != 3) {
            return aVar.k();
        } else {
            n k4 = r.b.a.x.a.YEAR.k();
            return n.i(k4.d() + 543, k4.c() + 543);
        }
    }

    public String k() {
        return "buddhist";
    }

    public String l() {
        return "ThaiBuddhist";
    }

    public c<w> n(e eVar) {
        return super.n(eVar);
    }

    public f<w> w(r.b.a.e eVar, q qVar) {
        return super.w(eVar, qVar);
    }

    public w x(int i2, int i3, int i4) {
        return new w(f.Z(i2 - 543, i3, i4));
    }

    /* renamed from: y */
    public w c(e eVar) {
        return eVar instanceof w ? (w) eVar : new w(f.J(eVar));
    }

    /* renamed from: z */
    public x h(int i2) {
        return x.a(i2);
    }
}
