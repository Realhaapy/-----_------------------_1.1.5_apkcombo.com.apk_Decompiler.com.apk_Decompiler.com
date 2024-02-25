package f.e.e.k.b;

class c implements g {
    c() {
    }

    private int b(h hVar, StringBuilder sb, StringBuilder sb2, int i2) {
        int length = sb.length();
        sb.delete(length - i2, length);
        hVar.f4499f--;
        int c = c(hVar.c(), sb2);
        hVar.k();
        return c;
    }

    private static String d(CharSequence charSequence, int i2) {
        int charAt = (charSequence.charAt(i2) * 1600) + (charSequence.charAt(i2 + 1) * '(') + charSequence.charAt(i2 + 2) + 1;
        return new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)});
    }

    static void g(h hVar, StringBuilder sb) {
        hVar.s(d(sb, 0));
        sb.delete(0, 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0055, code lost:
        if (r2 != 1) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0057, code lost:
        if (r1 > 3) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0046, code lost:
        if (r2 > 2) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(f.e.e.k.b.h r9) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x0005:
            boolean r1 = r9.i()
            if (r1 == 0) goto L_0x0079
            char r1 = r9.c()
            int r2 = r9.f4499f
            r3 = 1
            int r2 = r2 + r3
            r9.f4499f = r2
            int r1 = r8.c(r1, r0)
            int r2 = r0.length()
            r4 = 3
            int r2 = r2 / r4
            int r2 = r2 << r3
            int r5 = r9.a()
            int r5 = r5 + r2
            r9.q(r5)
            f.e.e.k.b.k r2 = r9.g()
            int r2 = r2.a()
            int r2 = r2 - r5
            boolean r5 = r9.i()
            if (r5 != 0) goto L_0x005a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r6 = r0.length()
            int r6 = r6 % r4
            r7 = 2
            if (r6 != r7) goto L_0x004c
            if (r2 < r7) goto L_0x0048
            if (r2 <= r7) goto L_0x004c
        L_0x0048:
            int r1 = r8.b(r9, r0, r5, r1)
        L_0x004c:
            int r6 = r0.length()
            int r6 = r6 % r4
            if (r6 != r3) goto L_0x0079
            if (r1 > r4) goto L_0x0057
            if (r2 != r3) goto L_0x0048
        L_0x0057:
            if (r1 <= r4) goto L_0x0079
            goto L_0x0048
        L_0x005a:
            int r1 = r0.length()
            int r1 = r1 % r4
            if (r1 != 0) goto L_0x0005
            java.lang.String r1 = r9.d()
            int r2 = r9.f4499f
            int r3 = r8.e()
            int r1 = f.e.e.k.b.j.n(r1, r2, r3)
            int r2 = r8.e()
            if (r1 == r2) goto L_0x0005
            r1 = 0
            r9.o(r1)
        L_0x0079:
            r8.f(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.e.k.b.c.a(f.e.e.k.b.h):void");
    }

    /* access modifiers changed from: package-private */
    public int c(char c, StringBuilder sb) {
        int i2;
        int i3;
        char c2;
        if (c == ' ') {
            c2 = 3;
        } else {
            if (c >= '0' && c <= '9') {
                i3 = (c - '0') + 4;
            } else if (c < 'A' || c > 'Z') {
                if (c < ' ') {
                    sb.append(0);
                } else {
                    char c3 = '!';
                    if (c >= '!' && c <= '/') {
                        sb.append(1);
                    } else if (c >= ':' && c <= '@') {
                        sb.append(1);
                        i2 = (c - ':') + 15;
                        c = (char) i2;
                    } else if (c < '[' || c > '_') {
                        c3 = '`';
                        if (c < '`' || c > 127) {
                            sb.append("\u0001\u001e");
                            return c((char) (c - 128), sb) + 2;
                        }
                        sb.append(2);
                    } else {
                        sb.append(1);
                        i2 = (c - '[') + 22;
                        c = (char) i2;
                    }
                    i2 = c - c3;
                    c = (char) i2;
                }
                sb.append(c);
                return 2;
            } else {
                i3 = (c - 'A') + 14;
            }
            c2 = (char) i3;
        }
        sb.append(c2);
        return 1;
    }

    public int e() {
        return 1;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (r8.i() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r8.i() != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(f.e.e.k.b.h r8, java.lang.StringBuilder r9) {
        /*
            r7 = this;
            int r0 = r9.length()
            r1 = 3
            int r0 = r0 / r1
            r2 = 1
            int r0 = r0 << r2
            int r3 = r9.length()
            int r3 = r3 % r1
            int r4 = r8.a()
            int r4 = r4 + r0
            r8.q(r4)
            f.e.e.k.b.k r0 = r8.g()
            int r0 = r0.a()
            int r0 = r0 - r4
            r4 = 0
            r5 = 254(0xfe, float:3.56E-43)
            r6 = 2
            if (r3 != r6) goto L_0x003b
            r9.append(r4)
        L_0x0027:
            int r0 = r9.length()
            if (r0 < r1) goto L_0x0031
            g(r8, r9)
            goto L_0x0027
        L_0x0031:
            boolean r9 = r8.i()
            if (r9 == 0) goto L_0x006d
        L_0x0037:
            r8.r(r5)
            goto L_0x006d
        L_0x003b:
            if (r0 != r2) goto L_0x0058
            if (r3 != r2) goto L_0x0058
        L_0x003f:
            int r0 = r9.length()
            if (r0 < r1) goto L_0x0049
            g(r8, r9)
            goto L_0x003f
        L_0x0049:
            boolean r9 = r8.i()
            if (r9 == 0) goto L_0x0052
            r8.r(r5)
        L_0x0052:
            int r9 = r8.f4499f
            int r9 = r9 - r2
            r8.f4499f = r9
            goto L_0x006d
        L_0x0058:
            if (r3 != 0) goto L_0x0071
        L_0x005a:
            int r2 = r9.length()
            if (r2 < r1) goto L_0x0064
            g(r8, r9)
            goto L_0x005a
        L_0x0064:
            if (r0 > 0) goto L_0x0037
            boolean r9 = r8.i()
            if (r9 == 0) goto L_0x006d
            goto L_0x0037
        L_0x006d:
            r8.o(r4)
            return
        L_0x0071:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Unexpected case. Please report!"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.e.k.b.c.f(f.e.e.k.b.h, java.lang.StringBuilder):void");
    }
}
