package f.e.e.l;

import f.e.e.a;
import f.e.e.c;
import f.e.e.d;
import f.e.e.j.b;
import java.util.Map;

public final class j extends q {
    public b a(String str, a aVar, int i2, int i3, Map<c, ?> map) {
        if (aVar == a.EAN_13) {
            return super.a(str, aVar, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(aVar)));
    }

    public boolean[] c(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + p.b(str);
            } catch (d e2) {
                throw new IllegalArgumentException(e2);
            }
        } else if (length == 13) {
            try {
                if (!p.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (d unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
        }
        int i2 = i.f4520f[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int b = n.b(zArr, 0, p.a, true) + 0;
        for (int i3 = 1; i3 <= 6; i3++) {
            int digit = Character.digit(str.charAt(i3), 10);
            if (((i2 >> (6 - i3)) & 1) == 1) {
                digit += 10;
            }
            b += n.b(zArr, b, p.f4522e[digit], false);
        }
        int b2 = b + n.b(zArr, b, p.b, false);
        for (int i4 = 7; i4 <= 12; i4++) {
            b2 += n.b(zArr, b2, p.f4521d[Character.digit(str.charAt(i4), 10)], true);
        }
        n.b(zArr, b2, p.a, true);
        return zArr;
    }
}
