package f.e.e.k.b;

import java.util.Arrays;

public final class j {
    public static int a(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        if (i2 < length) {
            loop0:
            while (true) {
                char charAt = charSequence.charAt(i2);
                while (true) {
                    if (!f(charAt) || i2 >= length) {
                        break loop0;
                    }
                    i3++;
                    i2++;
                    if (i2 < length) {
                    }
                }
            }
        }
        return i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b8 A[LOOP:1: B:25:0x00b2->B:27:0x00b8, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(java.lang.String r7, f.e.e.k.b.l r8, f.e.e.b r9, f.e.e.b r10) {
        /*
            r0 = 6
            f.e.e.k.b.g[] r0 = new f.e.e.k.b.g[r0]
            f.e.e.k.b.a r1 = new f.e.e.k.b.a
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            f.e.e.k.b.c r1 = new f.e.e.k.b.c
            r1.<init>()
            r3 = 1
            r0[r3] = r1
            f.e.e.k.b.m r1 = new f.e.e.k.b.m
            r1.<init>()
            r4 = 2
            r0[r4] = r1
            f.e.e.k.b.n r1 = new f.e.e.k.b.n
            r1.<init>()
            r5 = 3
            r0[r5] = r1
            f.e.e.k.b.f r1 = new f.e.e.k.b.f
            r1.<init>()
            r5 = 4
            r0[r5] = r1
            f.e.e.k.b.b r1 = new f.e.e.k.b.b
            r1.<init>()
            r6 = 5
            r0[r6] = r1
            f.e.e.k.b.h r1 = new f.e.e.k.b.h
            r1.<init>(r7)
            r1.n(r8)
            r1.l(r9, r10)
            java.lang.String r8 = "[)>\u001e05\u001d"
            boolean r8 = r7.startsWith(r8)
            java.lang.String r9 = "\u001e\u0004"
            if (r8 == 0) goto L_0x005d
            boolean r8 = r7.endsWith(r9)
            if (r8 == 0) goto L_0x005d
            r7 = 236(0xec, float:3.31E-43)
        L_0x0050:
            r1.r(r7)
            r1.m(r4)
            int r7 = r1.f4499f
            int r7 = r7 + 7
            r1.f4499f = r7
            goto L_0x006e
        L_0x005d:
            java.lang.String r8 = "[)>\u001e06\u001d"
            boolean r8 = r7.startsWith(r8)
            if (r8 == 0) goto L_0x006e
            boolean r7 = r7.endsWith(r9)
            if (r7 == 0) goto L_0x006e
            r7 = 237(0xed, float:3.32E-43)
            goto L_0x0050
        L_0x006e:
            boolean r7 = r1.i()
            if (r7 == 0) goto L_0x0087
            r7 = r0[r2]
            r7.a(r1)
            int r7 = r1.e()
            if (r7 < 0) goto L_0x006e
            int r2 = r1.e()
            r1.j()
            goto L_0x006e
        L_0x0087:
            int r7 = r1.a()
            r1.p()
            f.e.e.k.b.k r8 = r1.g()
            int r8 = r8.a()
            if (r7 >= r8) goto L_0x00a3
            if (r2 == 0) goto L_0x00a3
            if (r2 == r6) goto L_0x00a3
            if (r2 == r5) goto L_0x00a3
            r7 = 254(0xfe, float:3.56E-43)
            r1.r(r7)
        L_0x00a3:
            java.lang.StringBuilder r7 = r1.b()
            int r9 = r7.length()
            r10 = 129(0x81, float:1.81E-43)
            if (r9 >= r8) goto L_0x00b2
            r7.append(r10)
        L_0x00b2:
            int r9 = r7.length()
            if (r9 >= r8) goto L_0x00c5
            int r9 = r7.length()
            int r9 = r9 + r3
            char r9 = o(r10, r9)
            r7.append(r9)
            goto L_0x00b2
        L_0x00c5:
            java.lang.StringBuilder r7 = r1.b()
            java.lang.String r7 = r7.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.e.k.b.j.b(java.lang.String, f.e.e.k.b.l, f.e.e.b, f.e.e.b):java.lang.String");
    }

    private static int c(float[] fArr, int[] iArr, int i2, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i3 = 0; i3 < 6; i3++) {
            iArr[i3] = (int) Math.ceil((double) fArr[i3]);
            int i4 = iArr[i3];
            if (i2 > i4) {
                Arrays.fill(bArr, (byte) 0);
                i2 = i4;
            }
            if (i2 == i4) {
                bArr[i3] = (byte) (bArr[i3] + 1);
            }
        }
        return i2;
    }

    private static int d(byte[] bArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 += bArr[i3];
        }
        return i2;
    }

    static void e(char c) {
        String hexString = Integer.toHexString(c);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    static boolean f(char c) {
        return c >= '0' && c <= '9';
    }

    static boolean g(char c) {
        return c >= 128 && c <= 255;
    }

    private static boolean h(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    private static boolean i(char c) {
        return c >= ' ' && c <= '^';
    }

    private static boolean j(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    private static boolean k(char c) {
        if (m(c) || c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    private static boolean l(char c) {
        return false;
    }

    private static boolean m(char c) {
        return c == 13 || c == '*' || c == '>';
    }

    static int n(CharSequence charSequence, int i2, int i3) {
        char c;
        CharSequence charSequence2 = charSequence;
        int i4 = i2;
        if (i4 >= charSequence.length()) {
            return i3;
        }
        float[] fArr = new float[6];
        if (i3 == 0) {
            // fill-array-data instruction
            fArr[0] = 0;
            fArr[1] = 1065353216;
            fArr[2] = 1065353216;
            fArr[3] = 1065353216;
            fArr[4] = 1065353216;
            fArr[5] = 1067450368;
        } else {
            // fill-array-data instruction
            fArr[0] = 1065353216;
            fArr[1] = 1073741824;
            fArr[2] = 1073741824;
            fArr[3] = 1073741824;
            fArr[4] = 1073741824;
            fArr[5] = 1074790400;
            fArr[i3] = 0.0f;
        }
        int i5 = 0;
        while (true) {
            int i6 = i4 + i5;
            if (i6 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int c2 = c(fArr, iArr, Integer.MAX_VALUE, bArr);
                int d2 = d(bArr);
                if (iArr[0] == c2) {
                    return 0;
                }
                if (d2 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (d2 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (d2 != 1 || bArr[2] <= 0) {
                    return (d2 != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char charAt = charSequence2.charAt(i6);
            i5++;
            if (f(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (g(charAt)) {
                fArr[0] = (float) Math.ceil((double) fArr[0]);
                fArr[0] = fArr[0] + 2.0f;
            } else {
                fArr[0] = (float) Math.ceil((double) fArr[0]);
                fArr[0] = fArr[0] + 1.0f;
            }
            if (h(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (j(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (k(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (i(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (g(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (l(charAt)) {
                c = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i5 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                c(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int d3 = d(bArr2);
                if (iArr2[0] < iArr2[c] && iArr2[0] < iArr2[1] && iArr2[0] < iArr2[2] && iArr2[0] < iArr2[3] && iArr2[0] < iArr2[4]) {
                    return 0;
                }
                if (iArr2[5] < iArr2[0] || bArr2[1] + bArr2[2] + bArr2[3] + bArr2[4] == 0) {
                    return 5;
                }
                if (d3 == 1 && bArr2[4] > 0) {
                    return 4;
                }
                if (d3 == 1 && bArr2[2] > 0) {
                    return 2;
                }
                if (d3 == 1 && bArr2[3] > 0) {
                    return 3;
                }
                if (iArr2[1] + 1 < iArr2[0] && iArr2[1] + 1 < iArr2[5] && iArr2[1] + 1 < iArr2[4] && iArr2[1] + 1 < iArr2[2]) {
                    if (iArr2[1] < iArr2[3]) {
                        return 1;
                    }
                    if (iArr2[1] == iArr2[3]) {
                        int i7 = i4 + i5 + 1;
                        while (i7 < charSequence.length()) {
                            char charAt2 = charSequence2.charAt(i7);
                            if (!m(charAt2)) {
                                if (!k(charAt2)) {
                                    break;
                                }
                                i7++;
                            } else {
                                return 3;
                            }
                        }
                        return 1;
                    }
                }
            }
        }
    }

    private static char o(char c, int i2) {
        int i3 = c + ((i2 * 149) % 253) + 1;
        if (i3 > 254) {
            i3 -= 254;
        }
        return (char) i3;
    }
}
