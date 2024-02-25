package m.d0;

import m.y.d.l;

class o extends n {
    public static Integer f(String str) {
        l.d(str, "<this>");
        return g(str, 10);
    }

    public static final Integer g(String str, int i2) {
        boolean z;
        int i3;
        l.d(str, "<this>");
        b.a(i2);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str.charAt(0);
        int i5 = -2147483647;
        int i6 = 1;
        if (l.e(charAt, 48) >= 0) {
            z = false;
            i6 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i5 = Integer.MIN_VALUE;
                z = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
            }
        }
        int i7 = -59652323;
        while (i6 < length) {
            int i8 = i6 + 1;
            int b = b.b(str.charAt(i6), i2);
            if (b < 0) {
                return null;
            }
            if ((i4 < i7 && (i7 != -59652323 || i4 < (i7 = i5 / i2))) || (i3 = i4 * i2) < i5 + b) {
                return null;
            }
            i4 = i3 - b;
            i6 = i8;
        }
        return z ? Integer.valueOf(i4) : Integer.valueOf(-i4);
    }

    public static Long h(String str) {
        l.d(str, "<this>");
        return i(str, 10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Long i(java.lang.String r18, int r19) {
        /*
            r0 = r18
            r1 = r19
            java.lang.String r2 = "<this>"
            m.y.d.l.d(r0, r2)
            m.d0.b.a(r19)
            int r2 = r18.length()
            r3 = 0
            if (r2 != 0) goto L_0x0014
            return r3
        L_0x0014:
            r4 = 0
            char r5 = r0.charAt(r4)
            r6 = 48
            int r6 = m.y.d.l.e(r5, r6)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 1
            if (r6 >= 0) goto L_0x0039
            if (r2 != r9) goto L_0x002a
            return r3
        L_0x002a:
            r6 = 45
            if (r5 != r6) goto L_0x0032
            r7 = -9223372036854775808
            r4 = 1
            goto L_0x003a
        L_0x0032:
            r6 = 43
            if (r5 != r6) goto L_0x0038
            r4 = 1
            goto L_0x0039
        L_0x0038:
            return r3
        L_0x0039:
            r9 = 0
        L_0x003a:
            r5 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r10 = 0
            r12 = r5
        L_0x0042:
            if (r4 >= r2) goto L_0x0074
            int r14 = r4 + 1
            char r4 = r0.charAt(r4)
            int r4 = m.d0.b.b(r4, r1)
            if (r4 >= 0) goto L_0x0051
            return r3
        L_0x0051:
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 >= 0) goto L_0x0061
            int r15 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r15 != 0) goto L_0x0060
            long r12 = (long) r1
            long r12 = r7 / r12
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 >= 0) goto L_0x0061
        L_0x0060:
            return r3
        L_0x0061:
            long r5 = (long) r1
            long r10 = r10 * r5
            long r4 = (long) r4
            long r16 = r7 + r4
            int r6 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r6 >= 0) goto L_0x006c
            return r3
        L_0x006c:
            long r10 = r10 - r4
            r4 = r14
            r5 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            goto L_0x0042
        L_0x0074:
            if (r9 == 0) goto L_0x007b
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            goto L_0x0080
        L_0x007b:
            long r0 = -r10
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0080:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.d0.o.i(java.lang.String, int):java.lang.Long");
    }
}
