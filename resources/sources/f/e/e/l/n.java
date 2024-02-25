package f.e.e.l;

import f.e.e.a;
import f.e.e.c;
import f.e.e.g;
import f.e.e.j.b;
import java.util.Map;

public abstract class n implements g {
    protected static int b(boolean[] zArr, int i2, int[] iArr, boolean z) {
        int i3 = 0;
        for (int i4 : iArr) {
            int i5 = 0;
            while (i5 < i4) {
                zArr[i2] = z;
                i5++;
                i2++;
            }
            i3 += i4;
            z = !z;
        }
        return i3;
    }

    private static b e(boolean[] zArr, int i2, int i3, int i4) {
        int length = zArr.length;
        int i5 = i4 + length;
        int max = Math.max(i2, i5);
        int max2 = Math.max(1, i3);
        int i6 = max / i5;
        int i7 = (max - (length * i6)) / 2;
        b bVar = new b(max, max2);
        int i8 = 0;
        while (i8 < length) {
            if (zArr[i8]) {
                bVar.k(i7, 0, i6, max2);
            }
            i8++;
            i7 += i6;
        }
        return bVar;
    }

    public b a(String str, a aVar, int i2, int i3, Map<c, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i2 + 'x' + i3);
        } else {
            int d2 = d();
            if (map != null) {
                c cVar = c.MARGIN;
                if (map.containsKey(cVar)) {
                    d2 = Integer.parseInt(map.get(cVar).toString());
                }
            }
            return e(c(str), i2, i3, d2);
        }
    }

    public abstract boolean[] c(String str);

    public int d() {
        return 10;
    }
}
