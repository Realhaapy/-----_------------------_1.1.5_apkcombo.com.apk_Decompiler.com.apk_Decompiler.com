package f.e.e.l;

import f.e.e.a;
import f.e.e.c;
import f.e.e.j.b;
import java.util.Map;

public final class l extends n {
    private static final int[] a = {1, 1, 1, 1};
    private static final int[] b = {3, 1, 1};
    private static final int[][] c = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    public b a(String str, a aVar, int i2, int i3, Map<c, ?> map) {
        if (aVar == a.ITF) {
            return super.a(str, aVar, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(aVar)));
    }

    public boolean[] c(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        } else if (length <= 80) {
            boolean[] zArr = new boolean[((length * 9) + 9)];
            int b2 = n.b(zArr, 0, a, true);
            for (int i2 = 0; i2 < length; i2 += 2) {
                int digit = Character.digit(str.charAt(i2), 10);
                int digit2 = Character.digit(str.charAt(i2 + 1), 10);
                int[] iArr = new int[10];
                for (int i3 = 0; i3 < 5; i3++) {
                    int i4 = i3 * 2;
                    int[][] iArr2 = c;
                    iArr[i4] = iArr2[digit][i3];
                    iArr[i4 + 1] = iArr2[digit2][i3];
                }
                b2 += n.b(zArr, b2, iArr, true);
            }
            n.b(zArr, b2, b, true);
            return zArr;
        } else {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
    }
}
