package f.e.e.k.b;

final class n extends c {
    n() {
    }

    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.i()) {
                break;
            }
            char c = hVar.c();
            hVar.f4499f++;
            c(c, sb);
            if (sb.length() % 3 == 0) {
                c.g(hVar, sb);
                if (j.n(hVar.d(), hVar.f4499f, e()) != e()) {
                    hVar.o(0);
                    break;
                }
            }
        }
        f(hVar, sb);
    }

    /* access modifiers changed from: package-private */
    public int c(char c, StringBuilder sb) {
        char c2;
        int i2;
        if (c == 13) {
            c2 = 0;
        } else if (c == ' ') {
            c2 = 3;
        } else if (c == '*') {
            sb.append(1);
            return 1;
        } else if (c != '>') {
            if (c >= '0' && c <= '9') {
                i2 = (c - '0') + 4;
            } else if (c < 'A' || c > 'Z') {
                j.e(c);
                throw null;
            } else {
                i2 = (c - 'A') + 14;
            }
            c2 = (char) i2;
        } else {
            c2 = 2;
        }
        sb.append(c2);
        return 1;
    }

    public int e() {
        return 3;
    }

    /* access modifiers changed from: package-private */
    public void f(h hVar, StringBuilder sb) {
        hVar.p();
        int a = hVar.g().a() - hVar.a();
        hVar.f4499f -= sb.length();
        if (hVar.f() > 1 || a > 1 || hVar.f() != a) {
            hVar.r(254);
        }
        if (hVar.e() < 0) {
            hVar.o(0);
        }
    }
}
