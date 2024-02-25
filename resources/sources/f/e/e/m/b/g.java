package f.e.e.m.b;

import f.e.e.h;
import f.e.e.j.c;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

final class g {
    private static final byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};
    private static final byte[] b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};
    private static final byte[] c;

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f4537d = new byte[128];

    /* renamed from: e  reason: collision with root package name */
    private static final Charset f4538e = StandardCharsets.ISO_8859_1;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                f.e.e.m.b.c[] r0 = f.e.e.m.b.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                f.e.e.m.b.c r1 = f.e.e.m.b.c.TEXT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.e.e.m.b.c r1 = f.e.e.m.b.c.BYTE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                f.e.e.m.b.c r1 = f.e.e.m.b.c.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.e.m.b.g.a.<clinit>():void");
        }
    }

    static {
        byte[] bArr = new byte[128];
        c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr2 = a;
            if (i3 >= bArr2.length) {
                break;
            }
            byte b2 = bArr2[i3];
            if (b2 > 0) {
                c[b2] = (byte) i3;
            }
            i3++;
        }
        Arrays.fill(f4537d, (byte) -1);
        while (true) {
            byte[] bArr3 = b;
            if (i2 < bArr3.length) {
                byte b3 = bArr3[i2];
                if (b3 > 0) {
                    f4537d[b3] = (byte) i2;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(java.lang.String r5, int r6, java.nio.charset.Charset r7) {
        /*
            java.nio.charset.CharsetEncoder r7 = r7.newEncoder()
            int r0 = r5.length()
            r1 = r6
        L_0x0009:
            if (r1 >= r0) goto L_0x0057
            char r2 = r5.charAt(r1)
            r3 = 0
        L_0x0010:
            r4 = 13
            if (r3 >= r4) goto L_0x0025
            boolean r2 = k(r2)
            if (r2 == 0) goto L_0x0025
            int r3 = r3 + 1
            int r2 = r1 + r3
            if (r2 >= r0) goto L_0x0025
            char r2 = r5.charAt(r2)
            goto L_0x0010
        L_0x0025:
            if (r3 < r4) goto L_0x0029
            int r1 = r1 - r6
            return r1
        L_0x0029:
            char r2 = r5.charAt(r1)
            boolean r3 = r7.canEncode(r2)
            if (r3 == 0) goto L_0x0036
            int r1 = r1 + 1
            goto L_0x0009
        L_0x0036:
            f.e.e.h r5 = new f.e.e.h
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Non-encodable character detected: "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r7 = " (Unicode: "
            r6.append(r7)
            r6.append(r2)
            r7 = 41
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>((java.lang.String) r6)
            throw r5
        L_0x0057:
            int r1 = r1 - r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.e.m.b.g.a(java.lang.String, int, java.nio.charset.Charset):int");
    }

    private static int b(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        if (i2 < length) {
            loop0:
            while (true) {
                char charAt = charSequence.charAt(i2);
                while (true) {
                    if (!k(charAt) || i2 >= length) {
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

    private static int c(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = i2;
        while (i3 < length) {
            char charAt = charSequence.charAt(i3);
            int i4 = 0;
            while (i4 < 13 && k(charAt) && i3 < length) {
                i4++;
                i3++;
                if (i3 < length) {
                    charAt = charSequence.charAt(i3);
                }
            }
            if (i4 < 13) {
                if (i4 <= 0) {
                    if (!n(charSequence.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
            } else {
                return (i3 - i2) - i4;
            }
        }
        return i3 - i2;
    }

    private static void d(byte[] bArr, int i2, int i3, int i4, StringBuilder sb) {
        int i5;
        sb.append((i3 == 1 && i4 == 0) ? 913 : i3 % 6 == 0 ? (char) 924 : 901);
        if (i3 >= 6) {
            char[] cArr = new char[5];
            i5 = i2;
            while ((i2 + i3) - i5 >= 6) {
                long j2 = 0;
                for (int i6 = 0; i6 < 6; i6++) {
                    j2 = (j2 << 8) + ((long) (bArr[i5 + i6] & 255));
                }
                for (int i7 = 0; i7 < 5; i7++) {
                    cArr[i7] = (char) ((int) (j2 % 900));
                    j2 /= 900;
                }
                for (int i8 = 4; i8 >= 0; i8--) {
                    sb.append(cArr[i8]);
                }
                i5 += 6;
            }
        } else {
            i5 = i2;
        }
        while (i5 < i2 + i3) {
            sb.append((char) (bArr[i5] & 255));
            i5++;
        }
    }

    static String e(String str, c cVar, Charset charset) {
        c a2;
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = f4538e;
        } else if (!f4538e.equals(charset) && (a2 = c.a(charset.name())) != null) {
            h(a2.c(), sb);
        }
        int length = str.length();
        int i2 = a.a[cVar.ordinal()];
        if (i2 == 1) {
            g(str, 0, length, sb, 0);
        } else if (i2 == 2) {
            byte[] bytes = str.getBytes(charset);
            d(bytes, 0, bytes.length, 1, sb);
        } else if (i2 != 3) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < length) {
                int b2 = b(str, i3);
                if (b2 >= 13) {
                    sb.append(902);
                    f(str, i3, b2, sb);
                    i3 += b2;
                    i4 = 0;
                    i5 = 2;
                } else {
                    int c2 = c(str, i3);
                    if (c2 >= 5 || b2 == length) {
                        if (i5 != 0) {
                            sb.append(900);
                            i4 = 0;
                            i5 = 0;
                        }
                        i4 = g(str, i3, c2, sb, i4);
                        i3 += c2;
                    } else {
                        int a3 = a(str, i3, charset);
                        if (a3 == 0) {
                            a3 = 1;
                        }
                        int i6 = a3 + i3;
                        byte[] bytes2 = str.substring(i3, i6).getBytes(charset);
                        if (bytes2.length == 1 && i5 == 0) {
                            d(bytes2, 0, 1, 0, sb);
                        } else {
                            d(bytes2, 0, bytes2.length, i5, sb);
                            i4 = 0;
                            i5 = 1;
                        }
                        i3 = i6;
                    }
                }
            }
        } else {
            sb.append(902);
            f(str, 0, length, sb);
        }
        return sb.toString();
    }

    private static void f(String str, int i2, int i3, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i3 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900);
        BigInteger valueOf2 = BigInteger.valueOf(0);
        int i4 = 0;
        while (i4 < i3) {
            sb2.setLength(0);
            int min = Math.min(44, i3 - i4);
            StringBuilder sb3 = new StringBuilder("1");
            int i5 = i2 + i4;
            sb3.append(str.substring(i5, i5 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i4 += min;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a0, code lost:
        if (r10 == ' ') goto L_0x00a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cf A[EDGE_INSN: B:66:0x00cf->B:51:0x00cf ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0011 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int g(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = r20
            r8 = 0
        L_0x0011:
            int r9 = r17 + r8
            char r10 = r0.charAt(r9)
            r11 = 26
            r12 = 32
            r13 = 28
            r14 = 27
            r15 = 29
            if (r7 == 0) goto L_0x009a
            if (r7 == r6) goto L_0x0075
            if (r7 == r4) goto L_0x0037
            boolean r9 = m(r10)
            if (r9 == 0) goto L_0x0032
            byte[] r9 = f4537d
            byte r9 = r9[r10]
            goto L_0x0041
        L_0x0032:
            r3.append(r15)
        L_0x0035:
            r7 = 0
            goto L_0x0011
        L_0x0037:
            boolean r11 = l(r10)
            if (r11 == 0) goto L_0x0047
            byte[] r9 = c
            byte r9 = r9[r10]
        L_0x0041:
            char r9 = (char) r9
        L_0x0042:
            r3.append(r9)
            goto L_0x00cb
        L_0x0047:
            boolean r11 = j(r10)
            if (r11 == 0) goto L_0x0051
            r3.append(r13)
            goto L_0x0035
        L_0x0051:
            boolean r11 = i(r10)
            if (r11 == 0) goto L_0x0058
            goto L_0x00b0
        L_0x0058:
            int r9 = r9 + 1
            if (r9 >= r1) goto L_0x006d
            char r9 = r0.charAt(r9)
            boolean r9 = m(r9)
            if (r9 == 0) goto L_0x006d
            r7 = 3
            r9 = 25
            r3.append(r9)
            goto L_0x0011
        L_0x006d:
            r3.append(r15)
            byte[] r9 = f4537d
            byte r9 = r9[r10]
            goto L_0x0041
        L_0x0075:
            boolean r9 = i(r10)
            if (r9 == 0) goto L_0x0081
            if (r10 != r12) goto L_0x007e
            goto L_0x00a2
        L_0x007e:
            int r10 = r10 + -97
            goto L_0x00a8
        L_0x0081:
            boolean r9 = j(r10)
            if (r9 == 0) goto L_0x008b
            r3.append(r14)
            goto L_0x00a6
        L_0x008b:
            boolean r9 = l(r10)
            if (r9 == 0) goto L_0x0092
            goto L_0x00bc
        L_0x0092:
            r3.append(r15)
            byte[] r9 = f4537d
            byte r9 = r9[r10]
            goto L_0x0041
        L_0x009a:
            boolean r9 = j(r10)
            if (r9 == 0) goto L_0x00aa
            if (r10 != r12) goto L_0x00a6
        L_0x00a2:
            r3.append(r11)
            goto L_0x00cb
        L_0x00a6:
            int r10 = r10 + -65
        L_0x00a8:
            char r9 = (char) r10
            goto L_0x0042
        L_0x00aa:
            boolean r9 = i(r10)
            if (r9 == 0) goto L_0x00b6
        L_0x00b0:
            r3.append(r14)
            r7 = 1
            goto L_0x0011
        L_0x00b6:
            boolean r9 = l(r10)
            if (r9 == 0) goto L_0x00c2
        L_0x00bc:
            r3.append(r13)
            r7 = 2
            goto L_0x0011
        L_0x00c2:
            r3.append(r15)
            byte[] r9 = f4537d
            byte r9 = r9[r10]
            goto L_0x0041
        L_0x00cb:
            int r8 = r8 + 1
            if (r8 < r1) goto L_0x0011
            int r0 = r3.length()
            r1 = 0
            r8 = 0
        L_0x00d5:
            if (r1 >= r0) goto L_0x00f3
            int r9 = r1 % 2
            if (r9 == 0) goto L_0x00dd
            r9 = 1
            goto L_0x00de
        L_0x00dd:
            r9 = 0
        L_0x00de:
            if (r9 == 0) goto L_0x00ec
            int r8 = r8 * 30
            char r9 = r3.charAt(r1)
            int r8 = r8 + r9
            char r8 = (char) r8
            r2.append(r8)
            goto L_0x00f0
        L_0x00ec:
            char r8 = r3.charAt(r1)
        L_0x00f0:
            int r1 = r1 + 1
            goto L_0x00d5
        L_0x00f3:
            int r0 = r0 % r4
            if (r0 == 0) goto L_0x00fd
            int r8 = r8 * 30
            int r8 = r8 + r15
            char r0 = (char) r8
            r2.append(r0)
        L_0x00fd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.e.m.b.g.g(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    private static void h(int i2, StringBuilder sb) {
        char c2;
        if (i2 >= 0 && i2 < 900) {
            sb.append(927);
        } else if (i2 < 810900) {
            sb.append(926);
            sb.append((char) ((i2 / 900) - 1));
            i2 %= 900;
        } else if (i2 < 811800) {
            sb.append(925);
            c2 = (char) (810900 - i2);
            sb.append(c2);
        } else {
            throw new h("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i2)));
        }
        c2 = (char) i2;
        sb.append(c2);
    }

    private static boolean i(char c2) {
        if (c2 != ' ') {
            return c2 >= 'a' && c2 <= 'z';
        }
        return true;
    }

    private static boolean j(char c2) {
        if (c2 != ' ') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }

    private static boolean k(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    private static boolean l(char c2) {
        return c[c2] != -1;
    }

    private static boolean m(char c2) {
        return f4537d[c2] != -1;
    }

    private static boolean n(char c2) {
        if (c2 == 9 || c2 == 10 || c2 == 13) {
            return true;
        }
        return c2 >= ' ' && c2 <= '~';
    }
}
