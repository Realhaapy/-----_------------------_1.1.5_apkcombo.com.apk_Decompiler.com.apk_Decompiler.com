package m.d0;

import m.y.d.l;

class p extends o {
    public static final boolean j(String str, String str2, boolean z) {
        l.d(str, "<this>");
        l.d(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return n(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean k(String str, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return j(str, str2, z);
    }

    public static boolean l(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "<this>"
            m.y.d.l.d(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            m.a0.c r0 = m.d0.q.y(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0020
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r4 = 1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001e
            r3 = r0
            m.t.w r3 = (m.t.w) r3
            int r3 = r3.b()
            char r3 = r4.charAt(r3)
            boolean r3 = m.d0.b.c(r3)
            if (r3 != 0) goto L_0x0024
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m.d0.p.m(java.lang.CharSequence):boolean");
    }

    public static final boolean n(String str, int i2, String str2, int i3, int i4, boolean z) {
        l.d(str, "<this>");
        l.d(str2, "other");
        return !z ? str.regionMatches(i2, str2, i3, i4) : str.regionMatches(z, i2, str2, i3, i4);
    }

    public static final String o(String str, char c, char c2, boolean z) {
        String sb;
        String str2;
        l.d(str, "<this>");
        if (!z) {
            sb = str.replace(c, c2);
            str2 = "this as java.lang.String…replace(oldChar, newChar)";
        } else {
            StringBuilder sb2 = new StringBuilder(str.length());
            int i2 = 0;
            while (i2 < str.length()) {
                char charAt = str.charAt(i2);
                i2++;
                if (c.e(charAt, c, z)) {
                    charAt = c2;
                }
                sb2.append(charAt);
            }
            sb = sb2.toString();
            str2 = "StringBuilder(capacity).…builderAction).toString()";
        }
        l.c(sb, str2);
        return sb;
    }

    public static final String p(String str, String str2, String str3, boolean z) {
        l.d(str, "<this>");
        l.d(str2, "oldValue");
        l.d(str3, "newValue");
        int i2 = 0;
        int B = q.B(str, str2, 0, z);
        if (B < 0) {
            return str;
        }
        int length = str2.length();
        int a = f.a(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append(str, i2, B);
                sb.append(str3);
                i2 = B + length;
                if (B >= str.length() || (B = q.B(str, str2, B + a, z)) <= 0) {
                    sb.append(str, i2, str.length());
                    String sb2 = sb.toString();
                    l.c(sb2, "stringBuilder.append(this, i, length).toString()");
                }
                sb.append(str, i2, B);
                sb.append(str3);
                i2 = B + length;
                break;
            } while ((B = q.B(str, str2, B + a, z)) <= 0);
            sb.append(str, i2, str.length());
            String sb22 = sb.toString();
            l.c(sb22, "stringBuilder.append(this, i, length).toString()");
            return sb22;
        }
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String q(String str, char c, char c2, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return o(str, c, c2, z);
    }

    public static /* synthetic */ String r(String str, String str2, String str3, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return p(str, str2, str3, z);
    }

    public static final boolean s(String str, String str2, boolean z) {
        l.d(str, "<this>");
        l.d(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return n(str, 0, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean t(String str, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return s(str, str2, z);
    }
}
