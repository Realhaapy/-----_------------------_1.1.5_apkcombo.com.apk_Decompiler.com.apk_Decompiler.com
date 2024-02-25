package f.e.e.l;

import f.e.e.a;
import f.e.e.c;
import f.e.e.j.b;
import java.util.Map;

public final class f extends n {
    private static void f(int i2, int[] iArr) {
        for (int i3 = 0; i3 < 9; i3++) {
            int i4 = 1;
            if (((1 << (8 - i3)) & i2) != 0) {
                i4 = 2;
            }
            iArr[i3] = i4;
        }
    }

    private static String g(String str) {
        String str2;
        int i2;
        int i3;
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (charAt != 0) {
                if (charAt != ' ') {
                    if (charAt == '@') {
                        str2 = "%V";
                    } else if (charAt == '`') {
                        str2 = "%W";
                    } else if (!(charAt == '-' || charAt == '.')) {
                        if (charAt <= 26) {
                            sb.append('$');
                            i2 = charAt - 1;
                        } else if (charAt < ' ') {
                            sb.append('%');
                            i2 = charAt - 27;
                        } else if (charAt <= ',' || charAt == '/' || charAt == ':') {
                            sb.append('/');
                            i2 = charAt - '!';
                        } else {
                            if (charAt <= '9') {
                                i3 = (charAt - '0') + 48;
                            } else if (charAt <= '?') {
                                sb.append('%');
                                i3 = (charAt - ';') + 70;
                            } else if (charAt <= 'Z') {
                                i2 = charAt - 'A';
                            } else if (charAt <= '_') {
                                sb.append('%');
                                i3 = (charAt - '[') + 75;
                            } else if (charAt <= 'z') {
                                sb.append('+');
                                i2 = charAt - 'a';
                            } else if (charAt <= 127) {
                                sb.append('%');
                                i3 = (charAt - '{') + 80;
                            } else {
                                throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i4) + "'");
                            }
                            charAt = (char) i3;
                        }
                        i3 = i2 + 65;
                        charAt = (char) i3;
                    }
                }
                sb.append(charAt);
            } else {
                str2 = "%U";
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    public b a(String str, a aVar, int i2, int i3, Map<c, ?> map) {
        if (aVar == a.CODE_39) {
            return super.a(str, aVar, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(aVar)));
    }

    public boolean[] c(String str) {
        int length = str.length();
        if (length <= 80) {
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i2)) < 0) {
                    str = g(str);
                    length = str.length();
                    if (length > 80) {
                        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                    }
                } else {
                    i2++;
                }
            }
            int[] iArr = new int[9];
            int i3 = length + 25;
            for (int i4 = 0; i4 < length; i4++) {
                f(e.a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i4))], iArr);
                for (int i5 = 0; i5 < 9; i5++) {
                    i3 += iArr[i5];
                }
            }
            boolean[] zArr = new boolean[i3];
            f(148, iArr);
            int b = n.b(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int b2 = b + n.b(zArr, b, iArr2, false);
            for (int i6 = 0; i6 < length; i6++) {
                f(e.a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i6))], iArr);
                int b3 = b2 + n.b(zArr, b2, iArr, true);
                b2 = b3 + n.b(zArr, b3, iArr2, false);
            }
            f(148, iArr);
            n.b(zArr, b2, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
