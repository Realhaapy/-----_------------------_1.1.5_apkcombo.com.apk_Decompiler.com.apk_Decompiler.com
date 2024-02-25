package r.b.a.u;

import java.io.Serializable;
import java.util.HashMap;
import r.b.a.b;
import r.b.a.q;
import r.b.a.x.a;
import r.b.a.x.e;
import r.b.a.x.n;

public final class j extends h implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    public static final j f5596g = new j();

    /* renamed from: h  reason: collision with root package name */
    private static final HashMap<String, String[]> f5597h;

    /* renamed from: i  reason: collision with root package name */
    private static final HashMap<String, String[]> f5598i;

    /* renamed from: j  reason: collision with root package name */
    private static final HashMap<String, String[]> f5599j;
    private static final long serialVersionUID = 3127340209035924785L;

    static {
        HashMap<String, String[]> hashMap = new HashMap<>();
        f5597h = hashMap;
        HashMap<String, String[]> hashMap2 = new HashMap<>();
        f5598i = hashMap2;
        HashMap<String, String[]> hashMap3 = new HashMap<>();
        f5599j = hashMap3;
        hashMap.put("en", new String[]{"BH", "HE"});
        hashMap2.put("en", new String[]{"B.H.", "H.E."});
        hashMap3.put("en", new String[]{"Before Hijrah", "Hijrah Era"});
    }

    private j() {
    }

    private Object readResolve() {
        return f5596g;
    }

    public n A(a aVar) {
        return aVar.k();
    }

    public String k() {
        return "islamic-umalqura";
    }

    public String l() {
        return "Hijrah-umalqura";
    }

    public c<k> n(e eVar) {
        return super.n(eVar);
    }

    public f<k> w(r.b.a.e eVar, q qVar) {
        return super.w(eVar, qVar);
    }

    public k x(int i2, int i3, int i4) {
        return k.m0(i2, i3, i4);
    }

    /* renamed from: y */
    public k c(e eVar) {
        return eVar instanceof k ? (k) eVar : k.o0(eVar.n(a.EPOCH_DAY));
    }

    /* renamed from: z */
    public l h(int i2) {
        if (i2 == 0) {
            return l.BEFORE_AH;
        }
        if (i2 == 1) {
            return l.AH;
        }
        throw new b("invalid Hijrah era");
    }
}
