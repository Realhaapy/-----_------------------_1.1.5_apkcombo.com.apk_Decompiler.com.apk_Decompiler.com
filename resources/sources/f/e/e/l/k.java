package f.e.e.l;

import f.e.e.a;
import f.e.e.c;
import f.e.e.d;
import f.e.e.j.b;
import java.util.Map;

public final class k extends q {
    public b a(String str, a aVar, int i2, int i3, Map<c, ?> map) {
        if (aVar == a.EAN_8) {
            return super.a(str, aVar, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(aVar)));
    }

    public boolean[] c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + p.b(str);
            } catch (d e2) {
                throw new IllegalArgumentException(e2);
            }
        } else if (length == 8) {
            try {
                if (!p.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (d unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[67];
        int b = n.b(zArr, 0, p.a, true) + 0;
        for (int i2 = 0; i2 <= 3; i2++) {
            b += n.b(zArr, b, p.f4521d[Character.digit(str.charAt(i2), 10)], false);
        }
        int b2 = b + n.b(zArr, b, p.b, false);
        for (int i3 = 4; i3 <= 7; i3++) {
            b2 += n.b(zArr, b2, p.f4521d[Character.digit(str.charAt(i3), 10)], true);
        }
        n.b(zArr, b2, p.a, true);
        return zArr;
    }
}
