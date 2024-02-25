package f.e.e.l;

import f.e.e.a;
import f.e.e.c;
import f.e.e.d;
import f.e.e.j.b;
import java.util.Map;

public final class s extends q {
    public b a(String str, a aVar, int i2, int i3, Map<c, ?> map) {
        if (aVar == a.UPC_E) {
            return super.a(str, aVar, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(aVar)));
    }

    public boolean[] c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + p.b(r.c(str));
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
        int digit = Character.digit(str.charAt(0), 10);
        if (digit == 0 || digit == 1) {
            int i2 = r.f4523f[digit][Character.digit(str.charAt(7), 10)];
            boolean[] zArr = new boolean[51];
            int b = n.b(zArr, 0, p.a, true) + 0;
            for (int i3 = 1; i3 <= 6; i3++) {
                int digit2 = Character.digit(str.charAt(i3), 10);
                if (((i2 >> (6 - i3)) & 1) == 1) {
                    digit2 += 10;
                }
                b += n.b(zArr, b, p.f4522e[digit2], false);
            }
            n.b(zArr, b, p.c, false);
            return zArr;
        }
        throw new IllegalArgumentException("Number system must be 0 or 1");
    }
}
