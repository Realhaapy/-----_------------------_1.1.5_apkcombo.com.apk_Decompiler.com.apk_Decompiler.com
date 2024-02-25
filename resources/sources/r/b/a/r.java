package r.b.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import r.b.a.x.a;
import r.b.a.x.d;
import r.b.a.x.e;
import r.b.a.x.f;
import r.b.a.x.i;
import r.b.a.x.j;
import r.b.a.x.k;
import r.b.a.x.m;
import r.b.a.x.n;

public final class r extends q implements e, f, Comparable<r>, Serializable {

    /* renamed from: g  reason: collision with root package name */
    private static final ConcurrentMap<Integer, r> f5576g = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: h  reason: collision with root package name */
    private static final ConcurrentMap<String, r> f5577h = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: i  reason: collision with root package name */
    public static final r f5578i = B(0);

    /* renamed from: j  reason: collision with root package name */
    public static final r f5579j = B(-64800);

    /* renamed from: k  reason: collision with root package name */
    public static final r f5580k = B(64800);
    private static final long serialVersionUID = 2357656521762053153L;

    /* renamed from: e  reason: collision with root package name */
    private final int f5581e;

    /* renamed from: f  reason: collision with root package name */
    private final transient String f5582f;

    private r(int i2) {
        this.f5581e = i2;
        this.f5582f = w(i2);
    }

    public static r A(int i2, int i3, int i4) {
        F(i2, i3, i4);
        return B(E(i2, i3, i4));
    }

    public static r B(int i2) {
        if (Math.abs(i2) > 64800) {
            throw new b("Zone offset not in valid range: -18:00 to +18:00");
        } else if (i2 % 900 != 0) {
            return new r(i2);
        } else {
            Integer valueOf = Integer.valueOf(i2);
            ConcurrentMap<Integer, r> concurrentMap = f5576g;
            r rVar = (r) concurrentMap.get(valueOf);
            if (rVar != null) {
                return rVar;
            }
            concurrentMap.putIfAbsent(valueOf, new r(i2));
            r rVar2 = (r) concurrentMap.get(valueOf);
            f5577h.putIfAbsent(rVar2.a(), rVar2);
            return rVar2;
        }
    }

    private static int C(CharSequence charSequence, int i2, boolean z) {
        if (!z || charSequence.charAt(i2 - 1) == ':') {
            char charAt = charSequence.charAt(i2);
            char charAt2 = charSequence.charAt(i2 + 1);
            if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
                return ((charAt - '0') * 10) + (charAt2 - '0');
            }
            throw new b("Invalid ID for ZoneOffset, non numeric characters found: " + charSequence);
        }
        throw new b("Invalid ID for ZoneOffset, colon not found when expected: " + charSequence);
    }

    static r D(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? B(dataInput.readInt()) : B(readByte * 900);
    }

    private static int E(int i2, int i3, int i4) {
        return (i2 * 3600) + (i3 * 60) + i4;
    }

    private static void F(int i2, int i3, int i4) {
        if (i2 < -18 || i2 > 18) {
            throw new b("Zone offset hours not in valid range: value " + i2 + " is not in the range -18 to 18");
        }
        if (i2 > 0) {
            if (i3 < 0 || i4 < 0) {
                throw new b("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i2 < 0) {
            if (i3 > 0 || i4 > 0) {
                throw new b("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i3 > 0 && i4 < 0) || (i3 < 0 && i4 > 0)) {
            throw new b("Zone offset minutes and seconds must have the same sign");
        }
        if (Math.abs(i3) > 59) {
            throw new b("Zone offset minutes not in valid range: abs(value) " + Math.abs(i3) + " is not in the range 0 to 59");
        } else if (Math.abs(i4) > 59) {
            throw new b("Zone offset seconds not in valid range: abs(value) " + Math.abs(i4) + " is not in the range 0 to 59");
        } else if (Math.abs(i2) != 18) {
        } else {
            if (Math.abs(i3) > 0 || Math.abs(i4) > 0) {
                throw new b("Zone offset not in valid range: -18:00 to +18:00");
            }
        }
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private static String w(int i2) {
        if (i2 == 0) {
            return "Z";
        }
        int abs = Math.abs(i2);
        StringBuilder sb = new StringBuilder();
        int i3 = abs / 3600;
        int i4 = (abs / 60) % 60;
        sb.append(i2 < 0 ? "-" : "+");
        sb.append(i3 < 10 ? "0" : "");
        sb.append(i3);
        String str = ":0";
        sb.append(i4 < 10 ? str : ":");
        sb.append(i4);
        int i5 = abs % 60;
        if (i5 != 0) {
            if (i5 >= 10) {
                str = ":";
            }
            sb.append(str);
            sb.append(i5);
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new n((byte) 8, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static r.b.a.r z(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            r.b.a.w.d.i(r7, r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, r.b.a.r> r0 = f5577h
            java.lang.Object r0 = r0.get(r7)
            r.b.a.r r0 = (r.b.a.r) r0
            if (r0 == 0) goto L_0x0010
            return r0
        L_0x0010:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x006d
            r1 = 3
            if (r0 == r1) goto L_0x0089
            r4 = 5
            if (r0 == r4) goto L_0x0064
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L_0x005b
            r5 = 7
            if (r0 == r5) goto L_0x004e
            r1 = 9
            if (r0 != r1) goto L_0x0037
            int r0 = C(r7, r2, r3)
            int r1 = C(r7, r6, r2)
            int r2 = C(r7, r5, r2)
            goto L_0x008f
        L_0x0037:
            r.b.a.b r0 = new r.b.a.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid ID for ZoneOffset, invalid format: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L_0x004e:
            int r0 = C(r7, r2, r3)
            int r1 = C(r7, r1, r3)
            int r2 = C(r7, r4, r3)
            goto L_0x008f
        L_0x005b:
            int r0 = C(r7, r2, r3)
            int r1 = C(r7, r6, r2)
            goto L_0x008e
        L_0x0064:
            int r0 = C(r7, r2, r3)
            int r1 = C(r7, r1, r3)
            goto L_0x008e
        L_0x006d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r7.charAt(r3)
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            char r7 = r7.charAt(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
        L_0x0089:
            int r0 = C(r7, r2, r3)
            r1 = 0
        L_0x008e:
            r2 = 0
        L_0x008f:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L_0x00b3
            if (r3 != r5) goto L_0x009c
            goto L_0x00b3
        L_0x009c:
            r.b.a.b r0 = new r.b.a.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L_0x00b3:
            if (r3 != r5) goto L_0x00bd
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            r.b.a.r r7 = A(r7, r0, r1)
            return r7
        L_0x00bd:
            r.b.a.r r7 = A(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r.b.a.r.z(java.lang.String):r.b.a.r");
    }

    /* access modifiers changed from: package-private */
    public void G(DataOutput dataOutput) {
        int i2 = this.f5581e;
        int i3 = i2 % 900 == 0 ? i2 / 900 : 127;
        dataOutput.writeByte(i3);
        if (i3 == 127) {
            dataOutput.writeInt(i2);
        }
    }

    public String a() {
        return this.f5582f;
    }

    public r.b.a.y.f c() {
        return r.b.a.y.f.f(this);
    }

    public n d(i iVar) {
        if (iVar == a.OFFSET_SECONDS) {
            return iVar.k();
        }
        if (!(iVar instanceof a)) {
            return iVar.h(this);
        }
        throw new m("Unsupported field: " + iVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f5581e == ((r) obj).f5581e;
    }

    public <R> R f(k<R> kVar) {
        if (kVar == j.d() || kVar == j.f()) {
            return this;
        }
        if (kVar == j.b() || kVar == j.c() || kVar == j.e() || kVar == j.a() || kVar == j.g()) {
            return null;
        }
        return kVar.a(this);
    }

    public int hashCode() {
        return this.f5581e;
    }

    public boolean j(i iVar) {
        return iVar instanceof a ? iVar == a.OFFSET_SECONDS : iVar != null && iVar.c(this);
    }

    public int l(i iVar) {
        if (iVar == a.OFFSET_SECONDS) {
            return this.f5581e;
        }
        if (!(iVar instanceof a)) {
            return d(iVar).a(n(iVar), iVar);
        }
        throw new m("Unsupported field: " + iVar);
    }

    public long n(i iVar) {
        if (iVar == a.OFFSET_SECONDS) {
            return (long) this.f5581e;
        }
        if (!(iVar instanceof a)) {
            return iVar.f(this);
        }
        throw new b("Unsupported field: " + iVar);
    }

    public d t(d dVar) {
        return dVar.k(a.OFFSET_SECONDS, (long) this.f5581e);
    }

    public String toString() {
        return this.f5582f;
    }

    /* access modifiers changed from: package-private */
    public void v(DataOutput dataOutput) {
        dataOutput.writeByte(8);
        G(dataOutput);
    }

    /* renamed from: x */
    public int compareTo(r rVar) {
        return rVar.f5581e - this.f5581e;
    }

    public int y() {
        return this.f5581e;
    }
}
