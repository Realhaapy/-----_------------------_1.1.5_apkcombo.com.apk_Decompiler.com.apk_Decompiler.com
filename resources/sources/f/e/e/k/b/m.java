package f.e.e.k.b;

import e.a.j;

final class m extends c {
    m() {
    }

    /* access modifiers changed from: package-private */
    public int c(char c, StringBuilder sb) {
        int i2;
        int i3;
        char c2;
        if (c == ' ') {
            c2 = 3;
        } else {
            if (c >= '0' && c <= '9') {
                i3 = (c - '0') + 4;
            } else if (c < 'a' || c > 'z') {
                if (c < ' ') {
                    sb.append(0);
                } else {
                    char c3 = '!';
                    if (c >= '!' && c <= '/') {
                        sb.append(1);
                    } else if (c >= ':' && c <= '@') {
                        sb.append(1);
                        i2 = (c - ':') + 15;
                        c = (char) i2;
                    } else if (c < '[' || c > '_') {
                        c3 = '`';
                        if (c == '`') {
                            sb.append(2);
                        } else if (c >= 'A' && c <= 'Z') {
                            sb.append(2);
                            i2 = (c - 'A') + 1;
                            c = (char) i2;
                        } else if (c < '{' || c > 127) {
                            sb.append("\u0001\u001e");
                            return c((char) (c - 128), sb) + 2;
                        } else {
                            sb.append(2);
                            i2 = (c - j.F0) + 27;
                            c = (char) i2;
                        }
                    } else {
                        sb.append(1);
                        i2 = (c - '[') + 22;
                        c = (char) i2;
                    }
                    i2 = c - c3;
                    c = (char) i2;
                }
                sb.append(c);
                return 2;
            } else {
                i3 = (c - 'a') + 14;
            }
            c2 = (char) i3;
        }
        sb.append(c2);
        return 1;
    }

    public int e() {
        return 2;
    }
}
