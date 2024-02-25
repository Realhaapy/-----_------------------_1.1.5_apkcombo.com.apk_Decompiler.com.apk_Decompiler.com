package m;

import m.y.d.l;

public final class e implements Comparable<e> {

    /* renamed from: i  reason: collision with root package name */
    public static final e f5007i = f.a();

    /* renamed from: e  reason: collision with root package name */
    private final int f5008e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5009f;

    /* renamed from: g  reason: collision with root package name */
    private final int f5010g;

    /* renamed from: h  reason: collision with root package name */
    private final int f5011h;

    public e(int i2, int i3, int i4) {
        this.f5008e = i2;
        this.f5009f = i3;
        this.f5010g = i4;
        this.f5011h = c(i2, i3, i4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        if ((r7 >= 0 && r7 < 256) != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int c(int r5, int r6, int r7) {
        /*
            r4 = this;
            r0 = 256(0x100, float:3.59E-43)
            r1 = 1
            r2 = 0
            if (r5 < 0) goto L_0x000a
            if (r5 >= r0) goto L_0x000a
            r3 = 1
            goto L_0x000b
        L_0x000a:
            r3 = 0
        L_0x000b:
            if (r3 == 0) goto L_0x0020
            if (r6 < 0) goto L_0x0013
            if (r6 >= r0) goto L_0x0013
            r3 = 1
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            if (r3 == 0) goto L_0x0020
            if (r7 < 0) goto L_0x001c
            if (r7 >= r0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            int r5 = r5 << 16
            int r6 = r6 << 8
            int r5 = r5 + r6
            int r5 = r5 + r7
            return r5
        L_0x002a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Version components are out of range: "
            r0.append(r1)
            r0.append(r5)
            r5 = 46
            r0.append(r5)
            r0.append(r6)
            r0.append(r5)
            r0.append(r7)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m.e.c(int, int, int):int");
    }

    /* renamed from: a */
    public int compareTo(e eVar) {
        l.d(eVar, "other");
        return this.f5011h - eVar.f5011h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        e eVar = obj instanceof e ? (e) obj : null;
        return eVar != null && this.f5011h == eVar.f5011h;
    }

    public int hashCode() {
        return this.f5011h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5008e);
        sb.append('.');
        sb.append(this.f5009f);
        sb.append('.');
        sb.append(this.f5010g);
        return sb.toString();
    }
}
