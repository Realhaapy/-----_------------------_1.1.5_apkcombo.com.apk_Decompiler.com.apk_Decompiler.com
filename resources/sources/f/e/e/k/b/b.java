package f.e.e.k.b;

final class b implements g {
    b() {
    }

    private static char c(char c, int i2) {
        int i3 = c + ((i2 * 149) % 255) + 1;
        return i3 <= 255 ? (char) i3 : (char) (i3 - 256);
    }

    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(0);
        while (true) {
            if (!hVar.i()) {
                break;
            }
            sb.append(hVar.c());
            hVar.f4499f++;
            if (j.n(hVar.d(), hVar.f4499f, b()) != b()) {
                hVar.o(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int a = hVar.a() + length + 1;
        hVar.q(a);
        boolean z = hVar.g().a() - a > 0;
        if (hVar.i() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length2 = sb.length();
        for (int i2 = 0; i2 < length2; i2++) {
            hVar.r(c(sb.charAt(i2), hVar.a() + 1));
        }
    }

    public int b() {
        return 5;
    }
}