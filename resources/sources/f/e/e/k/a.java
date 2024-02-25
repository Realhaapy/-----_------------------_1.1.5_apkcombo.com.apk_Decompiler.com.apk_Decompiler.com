package f.e.e.k;

import f.e.e.c;
import f.e.e.g;
import f.e.e.j.b;
import f.e.e.k.b.e;
import f.e.e.k.b.i;
import f.e.e.k.b.j;
import f.e.e.k.b.k;
import f.e.e.k.b.l;
import java.util.Map;

public final class a implements g {
    private static b b(f.e.e.n.c.b bVar, int i2, int i3) {
        b bVar2;
        int e2 = bVar.e();
        int d2 = bVar.d();
        int max = Math.max(i2, e2);
        int max2 = Math.max(i3, d2);
        int min = Math.min(max / e2, max2 / d2);
        int i4 = (max - (e2 * min)) / 2;
        int i5 = (max2 - (d2 * min)) / 2;
        if (i3 < d2 || i2 < e2) {
            bVar2 = new b(e2, d2);
            i4 = 0;
            i5 = 0;
        } else {
            bVar2 = new b(i2, i3);
        }
        bVar2.d();
        int i6 = 0;
        while (i6 < d2) {
            int i7 = i4;
            int i8 = 0;
            while (i8 < e2) {
                if (bVar.b(i8, i6) == 1) {
                    bVar2.k(i7, i5, min, min);
                }
                i8++;
                i7 += min;
            }
            i6++;
            i5 += min;
        }
        return bVar2;
    }

    private static b c(e eVar, k kVar, int i2, int i3) {
        int h2 = kVar.h();
        int g2 = kVar.g();
        f.e.e.n.c.b bVar = new f.e.e.n.c.b(kVar.j(), kVar.i());
        int i4 = 0;
        for (int i5 = 0; i5 < g2; i5++) {
            if (i5 % kVar.f4506e == 0) {
                int i6 = 0;
                for (int i7 = 0; i7 < kVar.j(); i7++) {
                    bVar.g(i6, i4, i7 % 2 == 0);
                    i6++;
                }
                i4++;
            }
            int i8 = 0;
            for (int i9 = 0; i9 < h2; i9++) {
                if (i9 % kVar.f4505d == 0) {
                    bVar.g(i8, i4, true);
                    i8++;
                }
                bVar.g(i8, i4, eVar.e(i9, i5));
                i8++;
                int i10 = kVar.f4505d;
                if (i9 % i10 == i10 - 1) {
                    bVar.g(i8, i4, i5 % 2 == 0);
                    i8++;
                }
            }
            i4++;
            int i11 = kVar.f4506e;
            if (i5 % i11 == i11 - 1) {
                int i12 = 0;
                for (int i13 = 0; i13 < kVar.j(); i13++) {
                    bVar.g(i12, i4, true);
                    i12++;
                }
                i4++;
            }
        }
        return b(bVar, i2, i3);
    }

    public b a(String str, f.e.e.a aVar, int i2, int i3, Map<c, ?> map) {
        f.e.e.b bVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (aVar != f.e.e.a.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(aVar)));
        } else if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i2 + 'x' + i3);
        } else {
            l lVar = l.FORCE_NONE;
            f.e.e.b bVar2 = null;
            if (map != null) {
                l lVar2 = (l) map.get(c.DATA_MATRIX_SHAPE);
                if (lVar2 != null) {
                    lVar = lVar2;
                }
                f.e.e.b bVar3 = (f.e.e.b) map.get(c.MIN_SIZE);
                if (bVar3 == null) {
                    bVar3 = null;
                }
                bVar = (f.e.e.b) map.get(c.MAX_SIZE);
                if (bVar == null) {
                    bVar = null;
                }
                bVar2 = bVar3;
            } else {
                bVar = null;
            }
            String b = j.b(str, lVar, bVar2, bVar);
            k l2 = k.l(b.length(), lVar, bVar2, bVar, true);
            e eVar = new e(i.c(b, l2), l2.h(), l2.g());
            eVar.h();
            return c(eVar, l2, i2, i3);
        }
    }
}
