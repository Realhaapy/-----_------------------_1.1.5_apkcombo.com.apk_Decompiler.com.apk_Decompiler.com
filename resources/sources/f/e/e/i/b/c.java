package f.e.e.i.b;

import f.e.e.j.a;
import f.e.e.j.b;

public final class c {
    private static final int[] a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int[] a(a aVar, int i2, int i3) {
        int[] iArr = new int[i3];
        int j2 = aVar.j() / i2;
        for (int i4 = 0; i4 < j2; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 |= aVar.i((i4 * i2) + i6) ? 1 << ((i2 - i6) - 1) : 0;
            }
            iArr[i4] = i5;
        }
        return iArr;
    }

    private static void b(b bVar, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4 += 2) {
            int i5 = i2 - i4;
            int i6 = i5;
            while (true) {
                int i7 = i2 + i4;
                if (i6 > i7) {
                    break;
                }
                bVar.j(i6, i5);
                bVar.j(i6, i7);
                bVar.j(i5, i6);
                bVar.j(i7, i6);
                i6++;
            }
        }
        int i8 = i2 - i3;
        bVar.j(i8, i8);
        int i9 = i8 + 1;
        bVar.j(i9, i8);
        bVar.j(i8, i9);
        int i10 = i2 + i3;
        bVar.j(i10, i8);
        bVar.j(i10, i9);
        bVar.j(i10, i10 - 1);
    }

    private static void c(b bVar, boolean z, int i2, a aVar) {
        int i3 = i2 / 2;
        int i4 = 0;
        if (z) {
            while (i4 < 7) {
                int i5 = (i3 - 3) + i4;
                if (aVar.i(i4)) {
                    bVar.j(i5, i3 - 5);
                }
                if (aVar.i(i4 + 7)) {
                    bVar.j(i3 + 5, i5);
                }
                if (aVar.i(20 - i4)) {
                    bVar.j(i5, i3 + 5);
                }
                if (aVar.i(27 - i4)) {
                    bVar.j(i3 - 5, i5);
                }
                i4++;
            }
            return;
        }
        while (i4 < 10) {
            int i6 = (i3 - 5) + i4 + (i4 / 5);
            if (aVar.i(i4)) {
                bVar.j(i6, i3 - 7);
            }
            if (aVar.i(i4 + 10)) {
                bVar.j(i3 + 7, i6);
            }
            if (aVar.i(29 - i4)) {
                bVar.j(i6, i3 + 7);
            }
            if (aVar.i(39 - i4)) {
                bVar.j(i3 - 7, i6);
            }
            i4++;
        }
    }

    public static a d(byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        boolean z;
        a aVar;
        int i7;
        a a2 = new d(bArr).a();
        int i8 = 11;
        int j2 = ((a2.j() * i2) / 100) + 11;
        int j3 = a2.j() + j2;
        int i9 = 32;
        int i10 = 0;
        int i11 = 1;
        if (i3 != 0) {
            z = i3 < 0;
            i5 = Math.abs(i3);
            if (z) {
                i9 = 4;
            }
            if (i5 <= i9) {
                i6 = i(i5, z);
                i4 = a[i5];
                int i12 = i6 - (i6 % i4);
                aVar = h(a2, i4);
                if (aVar.j() + j2 > i12) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                } else if (z && aVar.j() > (i4 << 6)) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            } else {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", new Object[]{Integer.valueOf(i3)}));
            }
        } else {
            a aVar2 = null;
            int i13 = 0;
            int i14 = 0;
            while (i13 <= 32) {
                boolean z2 = i13 <= 3;
                int i15 = z2 ? i13 + 1 : i13;
                int i16 = i(i15, z2);
                if (j3 <= i16) {
                    if (aVar2 == null || i14 != a[i15]) {
                        int i17 = a[i15];
                        i14 = i17;
                        aVar2 = h(a2, i17);
                    }
                    int i18 = i16 - (i16 % i14);
                    if ((!z2 || aVar2.j() <= (i14 << 6)) && aVar2.j() + j2 <= i18) {
                        aVar = aVar2;
                        i4 = i14;
                        z = z2;
                        i5 = i15;
                        i6 = i16;
                    }
                }
                i13++;
                i10 = 0;
                i11 = 1;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        a e2 = e(aVar, i6, i4);
        int j4 = aVar.j() / i4;
        a f2 = f(z, i5, j4);
        if (!z) {
            i8 = 14;
        }
        int i19 = i8 + (i5 << 2);
        int[] iArr = new int[i19];
        int i20 = 2;
        if (z) {
            for (int i21 = 0; i21 < i19; i21++) {
                iArr[i21] = i21;
            }
            i7 = i19;
        } else {
            int i22 = i19 / 2;
            i7 = i19 + 1 + (((i22 - 1) / 15) * 2);
            int i23 = i7 / 2;
            for (int i24 = 0; i24 < i22; i24++) {
                int i25 = (i24 / 15) + i24;
                iArr[(i22 - i24) - i11] = (i23 - i25) - 1;
                iArr[i22 + i24] = i25 + i23 + i11;
            }
        }
        b bVar = new b(i7);
        int i26 = 0;
        int i27 = 0;
        while (i26 < i5) {
            int i28 = ((i5 - i26) << i20) + (z ? 9 : 12);
            int i29 = 0;
            while (i29 < i28) {
                int i30 = i29 << 1;
                while (i10 < i20) {
                    if (e2.i(i27 + i30 + i10)) {
                        int i31 = i26 << 1;
                        bVar.j(iArr[i31 + i10], iArr[i31 + i29]);
                    }
                    if (e2.i((i28 << 1) + i27 + i30 + i10)) {
                        int i32 = i26 << 1;
                        bVar.j(iArr[i32 + i29], iArr[((i19 - 1) - i32) - i10]);
                    }
                    if (e2.i((i28 << 2) + i27 + i30 + i10)) {
                        int i33 = (i19 - 1) - (i26 << 1);
                        bVar.j(iArr[i33 - i10], iArr[i33 - i29]);
                    }
                    if (e2.i((i28 * 6) + i27 + i30 + i10)) {
                        int i34 = i26 << 1;
                        bVar.j(iArr[((i19 - 1) - i34) - i29], iArr[i34 + i10]);
                    }
                    i10++;
                    i20 = 2;
                }
                i29++;
                i10 = 0;
                i20 = 2;
            }
            i27 += i28 << 3;
            i26++;
            i10 = 0;
            i20 = 2;
        }
        c(bVar, z, i7, f2);
        int i35 = i7 / 2;
        if (z) {
            b(bVar, i35, 5);
        } else {
            b(bVar, i35, 7);
            int i36 = 0;
            int i37 = 0;
            while (i37 < (i19 / 2) - 1) {
                for (int i38 = i35 & 1; i38 < i7; i38 += 2) {
                    int i39 = i35 - i36;
                    bVar.j(i39, i38);
                    int i40 = i35 + i36;
                    bVar.j(i40, i38);
                    bVar.j(i38, i39);
                    bVar.j(i38, i40);
                }
                i37 += 15;
                i36 += 16;
            }
        }
        a aVar3 = new a();
        aVar3.c(z);
        aVar3.f(i7);
        aVar3.d(i5);
        aVar3.b(j4);
        aVar3.e(bVar);
        return aVar3;
    }

    private static a e(a aVar, int i2, int i3) {
        f.e.e.j.d.c cVar = new f.e.e.j.d.c(g(i3));
        int i4 = i2 / i3;
        int[] a2 = a(aVar, i3, i4);
        cVar.b(a2, i4 - (aVar.j() / i3));
        a aVar2 = new a();
        aVar2.e(0, i2 % i3);
        for (int e2 : a2) {
            aVar2.e(e2, i3);
        }
        return aVar2;
    }

    static a f(boolean z, int i2, int i3) {
        int i4;
        a aVar = new a();
        int i5 = i2 - 1;
        if (z) {
            aVar.e(i5, 2);
            aVar.e(i3 - 1, 6);
            i4 = 28;
        } else {
            aVar.e(i5, 5);
            aVar.e(i3 - 1, 11);
            i4 = 40;
        }
        return e(aVar, i4, 4);
    }

    private static f.e.e.j.d.a g(int i2) {
        if (i2 == 4) {
            return f.e.e.j.d.a.f4490j;
        }
        if (i2 == 6) {
            return f.e.e.j.d.a.f4489i;
        }
        if (i2 == 8) {
            return f.e.e.j.d.a.f4492l;
        }
        if (i2 == 10) {
            return f.e.e.j.d.a.f4488h;
        }
        if (i2 == 12) {
            return f.e.e.j.d.a.f4487g;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i2)));
    }

    static a h(a aVar, int i2) {
        a aVar2 = new a();
        int j2 = aVar.j();
        int i3 = (1 << i2) - 2;
        int i4 = 0;
        while (i4 < j2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = i4 + i6;
                if (i7 >= j2 || aVar.i(i7)) {
                    i5 |= 1 << ((i2 - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 != i3) {
                if (i8 == 0) {
                    i8 = i5 | 1;
                } else {
                    aVar2.e(i5, i2);
                    i4 += i2;
                }
            }
            aVar2.e(i8, i2);
            i4--;
            i4 += i2;
        }
        return aVar2;
    }

    private static int i(int i2, boolean z) {
        return ((z ? 88 : 112) + (i2 << 4)) * i2;
    }
}
