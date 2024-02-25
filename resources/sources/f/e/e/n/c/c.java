package f.e.e.n.c;

import f.e.e.h;
import f.e.e.n.b.b;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public final class c {
    private static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                f.e.e.n.b.b[] r0 = f.e.e.n.b.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                f.e.e.n.b.b r1 = f.e.e.n.b.b.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.e.e.n.b.b r1 = f.e.e.n.b.b.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                f.e.e.n.b.b r1 = f.e.e.n.b.b.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                f.e.e.n.b.b r1 = f.e.e.n.b.b.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.e.n.c.c.a.<clinit>():void");
        }
    }

    static void a(String str, f.e.e.j.a aVar, String str2) {
        try {
            for (byte e2 : str.getBytes(str2)) {
                aVar.e(e2, 8);
            }
        } catch (UnsupportedEncodingException e3) {
            throw new h((Throwable) e3);
        }
    }

    static void b(CharSequence charSequence, f.e.e.j.a aVar) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            int p2 = p(charSequence.charAt(i2));
            if (p2 != -1) {
                int i3 = i2 + 1;
                if (i3 < length) {
                    int p3 = p(charSequence.charAt(i3));
                    if (p3 != -1) {
                        aVar.e((p2 * 45) + p3, 11);
                        i2 += 2;
                    } else {
                        throw new h();
                    }
                } else {
                    aVar.e(p2, 6);
                    i2 = i3;
                }
            } else {
                throw new h();
            }
        }
    }

    static void c(String str, b bVar, f.e.e.j.a aVar, String str2) {
        int i2 = a.a[bVar.ordinal()];
        if (i2 == 1) {
            h(str, aVar);
        } else if (i2 == 2) {
            b(str, aVar);
        } else if (i2 == 3) {
            a(str, aVar, str2);
        } else if (i2 == 4) {
            e(str, aVar);
        } else {
            throw new h("Invalid mode: ".concat(String.valueOf(bVar)));
        }
    }

    private static void d(f.e.e.j.c cVar, f.e.e.j.a aVar) {
        aVar.e(b.ECI.a(), 4);
        aVar.e(cVar.c(), 8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035 A[LOOP:0: B:4:0x0008->B:17:0x0035, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void e(java.lang.String r6, f.e.e.j.a r7) {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x004d }
            int r0 = r6.length
            r1 = 0
        L_0x0008:
            if (r1 >= r0) goto L_0x004c
            byte r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            byte r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L_0x0024
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L_0x0024
        L_0x0022:
            int r2 = r2 - r3
            goto L_0x0033
        L_0x0024:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L_0x0032
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L_0x0032
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L_0x0022
        L_0x0032:
            r2 = -1
        L_0x0033:
            if (r2 == r4) goto L_0x0044
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.e(r3, r2)
            int r1 = r1 + 2
            goto L_0x0008
        L_0x0044:
            f.e.e.h r6 = new f.e.e.h
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x004c:
            return
        L_0x004d:
            r6 = move-exception
            f.e.e.h r7 = new f.e.e.h
            r7.<init>((java.lang.Throwable) r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.e.n.c.c.e(java.lang.String, f.e.e.j.a):void");
    }

    static void f(int i2, f.e.e.n.b.c cVar, b bVar, f.e.e.j.a aVar) {
        int c = bVar.c(cVar);
        int i3 = 1 << c;
        if (i2 < i3) {
            aVar.e(i2, c);
            return;
        }
        throw new h(i2 + " is bigger than " + (i3 - 1));
    }

    static void g(b bVar, f.e.e.j.a aVar) {
        aVar.e(bVar.a(), 4);
    }

    static void h(CharSequence charSequence, f.e.e.j.a aVar) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            int charAt = charSequence.charAt(i2) - '0';
            int i3 = i2 + 2;
            if (i3 < length) {
                aVar.e((charAt * 100) + ((charSequence.charAt(i2 + 1) - '0') * 10) + (charSequence.charAt(i3) - '0'), 10);
                i2 += 3;
            } else {
                i2++;
                if (i2 < length) {
                    aVar.e((charAt * 10) + (charSequence.charAt(i2) - '0'), 7);
                    i2 = i3;
                } else {
                    aVar.e(charAt, 4);
                }
            }
        }
    }

    private static int i(b bVar, f.e.e.j.a aVar, f.e.e.j.a aVar2, f.e.e.n.b.c cVar) {
        return aVar.j() + bVar.c(cVar) + aVar2.j();
    }

    private static int j(b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    private static int k(f.e.e.j.a aVar, f.e.e.n.b.a aVar2, f.e.e.n.b.c cVar, b bVar) {
        int i2 = Integer.MAX_VALUE;
        int i3 = -1;
        for (int i4 = 0; i4 < 8; i4++) {
            e.a(aVar, aVar2, cVar, i4, bVar);
            int j2 = j(bVar);
            if (j2 < i2) {
                i3 = i4;
                i2 = j2;
            }
        }
        return i3;
    }

    private static b l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && s(str)) {
            return b.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else if (p(charAt) == -1) {
                return b.BYTE;
            } else {
                z = true;
            }
        }
        return z ? b.ALPHANUMERIC : z2 ? b.NUMERIC : b.BYTE;
    }

    private static f.e.e.n.b.c m(int i2, f.e.e.n.b.a aVar) {
        for (int i3 = 1; i3 <= 40; i3++) {
            f.e.e.n.b.c e2 = f.e.e.n.b.c.e(i3);
            if (v(i2, e2, aVar)) {
                return e2;
            }
        }
        throw new h("Data too big");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static f.e.e.n.c.f n(java.lang.String r7, f.e.e.n.b.a r8, java.util.Map<f.e.e.c, ?> r9) {
        /*
            r0 = 1
            r1 = 0
            if (r9 == 0) goto L_0x000e
            f.e.e.c r2 = f.e.e.c.CHARACTER_SET
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L_0x000e
            r2 = 1
            goto L_0x000f
        L_0x000e:
            r2 = 0
        L_0x000f:
            if (r2 == 0) goto L_0x001c
            f.e.e.c r3 = f.e.e.c.CHARACTER_SET
            java.lang.Object r3 = r9.get(r3)
            java.lang.String r3 = r3.toString()
            goto L_0x001e
        L_0x001c:
            java.lang.String r3 = "ISO-8859-1"
        L_0x001e:
            f.e.e.n.b.b r4 = l(r7, r3)
            f.e.e.j.a r5 = new f.e.e.j.a
            r5.<init>()
            f.e.e.n.b.b r6 = f.e.e.n.b.b.BYTE
            if (r4 != r6) goto L_0x0036
            if (r2 == 0) goto L_0x0036
            f.e.e.j.c r2 = f.e.e.j.c.a(r3)
            if (r2 == 0) goto L_0x0036
            d(r2, r5)
        L_0x0036:
            if (r9 == 0) goto L_0x0041
            f.e.e.c r2 = f.e.e.c.GS1_FORMAT
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            if (r0 == 0) goto L_0x005d
            f.e.e.c r0 = f.e.e.c.GS1_FORMAT
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = r0.toString()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x005d
            f.e.e.n.b.b r0 = f.e.e.n.b.b.FNC1_FIRST_POSITION
            g(r0, r5)
        L_0x005d:
            g(r4, r5)
            f.e.e.j.a r0 = new f.e.e.j.a
            r0.<init>()
            c(r7, r4, r0, r3)
            if (r9 == 0) goto L_0x0095
            f.e.e.c r1 = f.e.e.c.QR_VERSION
            boolean r2 = r9.containsKey(r1)
            if (r2 == 0) goto L_0x0095
            java.lang.Object r9 = r9.get(r1)
            java.lang.String r9 = r9.toString()
            int r9 = java.lang.Integer.parseInt(r9)
            f.e.e.n.b.c r9 = f.e.e.n.b.c.e(r9)
            int r1 = i(r4, r5, r0, r9)
            boolean r1 = v(r1, r9, r8)
            if (r1 == 0) goto L_0x008d
            goto L_0x0099
        L_0x008d:
            f.e.e.h r7 = new f.e.e.h
            java.lang.String r8 = "Data too big for requested version"
            r7.<init>((java.lang.String) r8)
            throw r7
        L_0x0095:
            f.e.e.n.b.c r9 = t(r8, r4, r5, r0)
        L_0x0099:
            f.e.e.j.a r1 = new f.e.e.j.a
            r1.<init>()
            r1.d(r5)
            if (r4 != r6) goto L_0x00a8
            int r7 = r0.k()
            goto L_0x00ac
        L_0x00a8:
            int r7 = r7.length()
        L_0x00ac:
            f(r7, r9, r4, r1)
            r1.d(r0)
            f.e.e.n.b.c$b r7 = r9.c(r8)
            int r0 = r9.d()
            int r2 = r7.d()
            int r0 = r0 - r2
            u(r0, r1)
            int r2 = r9.d()
            int r7 = r7.c()
            f.e.e.j.a r7 = r(r1, r2, r0, r7)
            f.e.e.n.c.f r0 = new f.e.e.n.c.f
            r0.<init>()
            r0.c(r8)
            r0.f(r4)
            r0.g(r9)
            int r1 = r9.b()
            f.e.e.n.c.b r2 = new f.e.e.n.c.b
            r2.<init>(r1, r1)
            int r1 = k(r7, r8, r9, r2)
            r0.d(r1)
            f.e.e.n.c.e.a(r7, r8, r9, r1, r2)
            r0.e(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.e.n.c.c.n(java.lang.String, f.e.e.n.b.a, java.util.Map):f.e.e.n.c.f");
    }

    static byte[] o(byte[] bArr, int i2) {
        int length = bArr.length;
        int[] iArr = new int[(length + i2)];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = bArr[i3] & 255;
        }
        new f.e.e.j.d.c(f.e.e.j.d.a.f4491k).b(iArr, i2);
        byte[] bArr2 = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4] = (byte) iArr[length + i4];
        }
        return bArr2;
    }

    static int p(int i2) {
        int[] iArr = a;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    static void q(int i2, int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        if (i5 < i4) {
            int i6 = i2 % i4;
            int i7 = i4 - i6;
            int i8 = i2 / i4;
            int i9 = i8 + 1;
            int i10 = i3 / i4;
            int i11 = i10 + 1;
            int i12 = i8 - i10;
            int i13 = i9 - i11;
            if (i12 != i13) {
                throw new h("EC bytes mismatch");
            } else if (i4 != i7 + i6) {
                throw new h("RS blocks mismatch");
            } else if (i2 != ((i10 + i12) * i7) + ((i11 + i13) * i6)) {
                throw new h("Total bytes mismatch");
            } else if (i5 < i7) {
                iArr[0] = i10;
                iArr2[0] = i12;
            } else {
                iArr[0] = i11;
                iArr2[0] = i13;
            }
        } else {
            throw new h("Block ID too large");
        }
    }

    static f.e.e.j.a r(f.e.e.j.a aVar, int i2, int i3, int i4) {
        int i5 = i2;
        int i6 = i3;
        int i7 = i4;
        if (aVar.k() == i6) {
            ArrayList<a> arrayList = new ArrayList<>(i7);
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                q(i2, i3, i4, i11, iArr, iArr2);
                int i12 = iArr[0];
                byte[] bArr = new byte[i12];
                aVar.m(i8 << 3, bArr, 0, i12);
                byte[] o2 = o(bArr, iArr2[0]);
                arrayList.add(new a(bArr, o2));
                i9 = Math.max(i9, i12);
                i10 = Math.max(i10, o2.length);
                i8 += iArr[0];
            }
            if (i6 == i8) {
                f.e.e.j.a aVar2 = new f.e.e.j.a();
                for (int i13 = 0; i13 < i9; i13++) {
                    for (a a2 : arrayList) {
                        byte[] a3 = a2.a();
                        if (i13 < a3.length) {
                            aVar2.e(a3[i13], 8);
                        }
                    }
                }
                for (int i14 = 0; i14 < i10; i14++) {
                    for (a b : arrayList) {
                        byte[] b2 = b.b();
                        if (i14 < b2.length) {
                            aVar2.e(b2[i14], 8);
                        }
                    }
                }
                if (i5 == aVar2.k()) {
                    return aVar2;
                }
                throw new h("Interleaving error: " + i5 + " and " + aVar2.k() + " differ.");
            }
            throw new h("Data bytes does not match offset");
        }
        throw new h("Number of bits and data bytes does not match");
    }

    private static boolean s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i2 = 0; i2 < length; i2 += 2) {
                byte b = bytes[i2] & 255;
                if ((b < 129 || b > 159) && (b < 224 || b > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static f.e.e.n.b.c t(f.e.e.n.b.a aVar, b bVar, f.e.e.j.a aVar2, f.e.e.j.a aVar3) {
        return m(i(bVar, aVar2, aVar3, m(i(bVar, aVar2, aVar3, f.e.e.n.b.c.e(1)), aVar)), aVar);
    }

    static void u(int i2, f.e.e.j.a aVar) {
        int i3 = i2 << 3;
        if (aVar.j() <= i3) {
            for (int i4 = 0; i4 < 4 && aVar.j() < i3; i4++) {
                aVar.b(false);
            }
            int j2 = aVar.j() & 7;
            if (j2 > 0) {
                while (j2 < 8) {
                    aVar.b(false);
                    j2++;
                }
            }
            int k2 = i2 - aVar.k();
            for (int i5 = 0; i5 < k2; i5++) {
                aVar.e((i5 & 1) == 0 ? 236 : 17, 8);
            }
            if (aVar.j() != i3) {
                throw new h("Bits size does not equal capacity");
            }
            return;
        }
        throw new h("data bits cannot fit in the QR Code" + aVar.j() + " > " + i3);
    }

    private static boolean v(int i2, f.e.e.n.b.c cVar, f.e.e.n.b.a aVar) {
        return cVar.d() - cVar.c(aVar).d() >= (i2 + 7) / 8;
    }
}
