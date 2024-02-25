package r.b.a;

import java.io.Serializable;
import java.util.regex.Pattern;
import r.b.a.u.e;

public final class m extends e implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public static final m f5567h = new m(0, 0, 0);
    private static final long serialVersionUID = -8290556941213247973L;

    /* renamed from: e  reason: collision with root package name */
    private final int f5568e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5569f;

    /* renamed from: g  reason: collision with root package name */
    private final int f5570g;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
    }

    private m(int i2, int i3, int i4) {
        this.f5568e = i2;
        this.f5569f = i3;
        this.f5570g = i4;
    }

    private static m b(int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? f5567h : new m(i2, i3, i4);
    }

    public static m d(int i2) {
        return b(0, 0, i2);
    }

    private Object readResolve() {
        return ((this.f5568e | this.f5569f) | this.f5570g) == 0 ? f5567h : this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r.b.a.x.d a(r.b.a.x.d r4) {
        /*
            r3 = this;
            java.lang.String r0 = "temporal"
            r.b.a.w.d.i(r4, r0)
            int r0 = r3.f5568e
            if (r0 == 0) goto L_0x0016
            int r1 = r3.f5569f
            if (r1 == 0) goto L_0x0012
            long r0 = r3.e()
            goto L_0x001b
        L_0x0012:
            long r0 = (long) r0
            r.b.a.x.b r2 = r.b.a.x.b.YEARS
            goto L_0x001d
        L_0x0016:
            int r0 = r3.f5569f
            if (r0 == 0) goto L_0x0021
            long r0 = (long) r0
        L_0x001b:
            r.b.a.x.b r2 = r.b.a.x.b.MONTHS
        L_0x001d:
            r.b.a.x.d r4 = r4.s(r0, r2)
        L_0x0021:
            int r0 = r3.f5570g
            if (r0 == 0) goto L_0x002c
            long r0 = (long) r0
            r.b.a.x.b r2 = r.b.a.x.b.DAYS
            r.b.a.x.d r4 = r4.s(r0, r2)
        L_0x002c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: r.b.a.m.a(r.b.a.x.d):r.b.a.x.d");
    }

    public boolean c() {
        return this == f5567h;
    }

    public long e() {
        return (((long) this.f5568e) * 12) + ((long) this.f5569f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f5568e == mVar.f5568e && this.f5569f == mVar.f5569f && this.f5570g == mVar.f5570g;
    }

    public int hashCode() {
        return this.f5568e + Integer.rotateLeft(this.f5569f, 8) + Integer.rotateLeft(this.f5570g, 16);
    }

    public String toString() {
        if (this == f5567h) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('P');
        int i2 = this.f5568e;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('Y');
        }
        int i3 = this.f5569f;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('M');
        }
        int i4 = this.f5570g;
        if (i4 != 0) {
            sb.append(i4);
            sb.append('D');
        }
        return sb.toString();
    }
}
