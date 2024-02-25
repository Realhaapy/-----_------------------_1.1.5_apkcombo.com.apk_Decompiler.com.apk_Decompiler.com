package f.e.e.l;

import f.e.e.a;
import f.e.e.c;
import f.e.e.j.b;
import java.util.Map;

public class h extends n {
    private static int f(boolean[] zArr, int i2, int[] iArr) {
        int length = iArr.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = i2 + 1;
            zArr[i2] = iArr[i3] != 0;
            i3++;
            i2 = i4;
        }
        return 9;
    }

    private static int g(String str, int i2) {
        int i3 = 0;
        int i4 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        return i3 % 47;
    }

    private static void h(int i2, int[] iArr) {
        for (int i3 = 0; i3 < 9; i3++) {
            int i4 = 1;
            if (((1 << (8 - i3)) & i2) == 0) {
                i4 = 0;
            }
            iArr[i3] = i4;
        }
    }

    public b a(String str, a aVar, int i2, int i3, Map<c, ?> map) {
        if (aVar == a.CODE_93) {
            return super.a(str, aVar, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(aVar)));
    }

    public boolean[] c(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            h(g.a[47], iArr);
            boolean[] zArr = new boolean[(((str.length() + 2 + 2) * 9) + 1)];
            int f2 = f(zArr, 0, iArr);
            for (int i2 = 0; i2 < length; i2++) {
                h(g.a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i2))], iArr);
                f2 += f(zArr, f2, iArr);
            }
            int g2 = g(str, 20);
            int[] iArr2 = g.a;
            h(iArr2[g2], iArr);
            int f3 = f2 + f(zArr, f2, iArr);
            h(iArr2[g(str + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(g2), 15)], iArr);
            int f4 = f3 + f(zArr, f3, iArr);
            h(iArr2[47], iArr);
            zArr[f4 + f(zArr, f4, iArr)] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
