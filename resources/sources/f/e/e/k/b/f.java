package f.e.e.k.b;

final class f implements g {
    f() {
    }

    private static void b(char c, StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
        } else if (c < '@' || c > '^') {
            j.e(c);
            throw null;
        } else {
            sb.append((char) (c - '@'));
        }
    }

    private static String c(CharSequence charSequence, int i2) {
        int length = charSequence.length() - i2;
        if (length != 0) {
            char charAt = charSequence.charAt(i2);
            char c = 0;
            char charAt2 = length >= 2 ? charSequence.charAt(i2 + 1) : 0;
            char charAt3 = length >= 3 ? charSequence.charAt(i2 + 2) : 0;
            if (length >= 4) {
                c = charSequence.charAt(i2 + 3);
            }
            int i3 = (charAt << 18) + (charAt2 << 12) + (charAt3 << 6) + c;
            char c2 = (char) ((i3 >> 8) & 255);
            char c3 = (char) (i3 & 255);
            StringBuilder sb = new StringBuilder(3);
            sb.append((char) ((i3 >> 16) & 255));
            if (length >= 2) {
                sb.append(c2);
            }
            if (length >= 3) {
                sb.append(c3);
            }
            return sb.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    private static void e(h hVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length != 0) {
                boolean z = true;
                if (length == 1) {
                    hVar.p();
                    int a = hVar.g().a() - hVar.a();
                    int f2 = hVar.f();
                    if (f2 > a) {
                        hVar.q(hVar.a() + 1);
                        a = hVar.g().a() - hVar.a();
                    }
                    if (f2 <= a && a <= 2) {
                        hVar.o(0);
                        return;
                    }
                }
                if (length <= 4) {
                    int i2 = length - 1;
                    String c = c(charSequence, 0);
                    if (!(!hVar.i()) || i2 > 2) {
                        z = false;
                    }
                    if (i2 <= 2) {
                        hVar.q(hVar.a() + i2);
                        if (hVar.g().a() - hVar.a() >= 3) {
                            hVar.q(hVar.a() + c.length());
                            z = false;
                        }
                    }
                    if (z) {
                        hVar.k();
                        hVar.f4499f -= i2;
                    } else {
                        hVar.s(c);
                    }
                    hVar.o(0);
                    return;
                }
                throw new IllegalStateException("Count must not exceed 4");
            }
        } finally {
            hVar.o(0);
        }
    }

    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.i()) {
                break;
            }
            b(hVar.c(), sb);
            hVar.f4499f++;
            if (sb.length() >= 4) {
                hVar.s(c(sb, 0));
                sb.delete(0, 4);
                if (j.n(hVar.d(), hVar.f4499f, d()) != d()) {
                    hVar.o(0);
                    break;
                }
            }
        }
        sb.append(31);
        e(hVar, sb);
    }

    public int d() {
        return 4;
    }
}
