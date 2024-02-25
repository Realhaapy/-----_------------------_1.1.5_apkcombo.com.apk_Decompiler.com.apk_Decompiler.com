package f.e.e.l;

import f.e.e.c;
import f.e.e.j.b;
import java.util.ArrayList;
import java.util.Map;

public final class d extends n {

    private enum a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        r5 = r5.charAt(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int f(java.lang.CharSequence r5, int r6, int r7) {
        /*
            f.e.e.l.d$a r0 = g(r5, r6)
            f.e.e.l.d$a r1 = f.e.e.l.d.a.ONE_DIGIT
            r2 = 100
            if (r0 != r1) goto L_0x000b
            return r2
        L_0x000b:
            f.e.e.l.d$a r3 = f.e.e.l.d.a.UNCODABLE
            if (r0 != r3) goto L_0x0027
            int r0 = r5.length()
            if (r6 >= r0) goto L_0x0026
            char r5 = r5.charAt(r6)
            r6 = 32
            r0 = 101(0x65, float:1.42E-43)
            if (r5 < r6) goto L_0x0025
            if (r7 != r0) goto L_0x0026
            r6 = 96
            if (r5 >= r6) goto L_0x0026
        L_0x0025:
            return r0
        L_0x0026:
            return r2
        L_0x0027:
            r4 = 99
            if (r7 != r4) goto L_0x002c
            return r4
        L_0x002c:
            if (r7 != r2) goto L_0x0060
            f.e.e.l.d$a r7 = f.e.e.l.d.a.FNC_1
            if (r0 != r7) goto L_0x0033
            return r2
        L_0x0033:
            int r0 = r6 + 2
            f.e.e.l.d$a r0 = g(r5, r0)
            if (r0 == r3) goto L_0x005f
            if (r0 != r1) goto L_0x003e
            goto L_0x005f
        L_0x003e:
            if (r0 != r7) goto L_0x004c
            int r6 = r6 + 3
            f.e.e.l.d$a r5 = g(r5, r6)
            f.e.e.l.d$a r6 = f.e.e.l.d.a.TWO_DIGITS
            if (r5 != r6) goto L_0x004b
            return r4
        L_0x004b:
            return r2
        L_0x004c:
            int r6 = r6 + 4
        L_0x004e:
            f.e.e.l.d$a r7 = g(r5, r6)
            f.e.e.l.d$a r0 = f.e.e.l.d.a.TWO_DIGITS
            if (r7 != r0) goto L_0x0059
            int r6 = r6 + 2
            goto L_0x004e
        L_0x0059:
            f.e.e.l.d$a r5 = f.e.e.l.d.a.ONE_DIGIT
            if (r7 != r5) goto L_0x005e
            return r2
        L_0x005e:
            return r4
        L_0x005f:
            return r2
        L_0x0060:
            f.e.e.l.d$a r7 = f.e.e.l.d.a.FNC_1
            if (r0 != r7) goto L_0x006a
            int r6 = r6 + 1
            f.e.e.l.d$a r0 = g(r5, r6)
        L_0x006a:
            f.e.e.l.d$a r5 = f.e.e.l.d.a.TWO_DIGITS
            if (r0 != r5) goto L_0x006f
            return r4
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.e.l.d.f(java.lang.CharSequence, int, int):int");
    }

    private static a g(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        if (i2 >= length) {
            return a.UNCODABLE;
        }
        char charAt = charSequence.charAt(i2);
        if (charAt == 241) {
            return a.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return a.UNCODABLE;
        }
        int i3 = i2 + 1;
        if (i3 >= length) {
            return a.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i3);
        return (charAt2 < '0' || charAt2 > '9') ? a.ONE_DIGIT : a.TWO_DIGITS;
    }

    public b a(String str, f.e.e.a aVar, int i2, int i3, Map<c, ?> map) {
        if (aVar == f.e.e.a.CODE_128) {
            return super.a(str, aVar, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(aVar)));
    }

    public boolean[] c(String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            switch (charAt) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (charAt <= 127) {
                        break;
                    } else {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                    }
            }
        }
        ArrayList<int[]> arrayList = new ArrayList<>();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        while (true) {
            int i8 = 103;
            if (i4 < length) {
                int f2 = f(str, i4, i6);
                int i9 = 100;
                if (f2 == i6) {
                    switch (str.charAt(i4)) {
                        case 241:
                            i9 = 102;
                            break;
                        case 242:
                            i9 = 97;
                            break;
                        case 243:
                            i9 = 96;
                            break;
                        case 244:
                            if (i6 == 101) {
                                i9 = 101;
                                break;
                            }
                            break;
                        default:
                            if (i6 != 100) {
                                if (i6 == 101) {
                                    i9 = str.charAt(i4) - ' ';
                                    if (i9 < 0) {
                                        i9 += 96;
                                        break;
                                    }
                                } else {
                                    i9 = Integer.parseInt(str.substring(i4, i4 + 2));
                                    i4++;
                                    break;
                                }
                            } else {
                                i9 = str.charAt(i4) - ' ';
                                break;
                            }
                            break;
                    }
                    i4++;
                } else {
                    if (i6 != 0) {
                        i8 = f2;
                    } else if (f2 == 100) {
                        i8 = 104;
                    } else if (f2 != 101) {
                        i8 = 105;
                    }
                    i9 = i8;
                    i6 = f2;
                }
                arrayList.add(c.a[i9]);
                i5 += i9 * i7;
                if (i4 != 0) {
                    i7++;
                }
            } else {
                int[][] iArr = c.a;
                arrayList.add(iArr[i5 % 103]);
                arrayList.add(iArr[106]);
                int i10 = 0;
                for (int[] iArr2 : arrayList) {
                    for (int i11 : (int[]) r13.next()) {
                        i10 += i11;
                    }
                }
                boolean[] zArr = new boolean[i10];
                for (int[] b : arrayList) {
                    i2 += n.b(zArr, i2, b, true);
                }
                return zArr;
            }
        }
    }
}
