package f.e.e.k.b;

final class a implements g {
    a() {
    }

    private static char b(char c, char c2) {
        if (j.f(c) && j.f(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c + c2);
    }

    public void a(h hVar) {
        if (j.a(hVar.d(), hVar.f4499f) >= 2) {
            hVar.r(b(hVar.d().charAt(hVar.f4499f), hVar.d().charAt(hVar.f4499f + 1)));
            hVar.f4499f += 2;
            return;
        }
        char c = hVar.c();
        int n2 = j.n(hVar.d(), hVar.f4499f, c());
        if (n2 != c()) {
            if (n2 == 1) {
                hVar.r(230);
                hVar.o(1);
            } else if (n2 == 2) {
                hVar.r(239);
                hVar.o(2);
            } else if (n2 == 3) {
                hVar.r(238);
                hVar.o(3);
            } else if (n2 == 4) {
                hVar.r(240);
                hVar.o(4);
            } else if (n2 == 5) {
                hVar.r(231);
                hVar.o(5);
            } else {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(n2)));
            }
        } else if (j.g(c)) {
            hVar.r(235);
            hVar.r((char) ((c - 128) + 1));
            hVar.f4499f++;
        } else {
            hVar.r((char) (c + 1));
            hVar.f4499f++;
        }
    }

    public int c() {
        return 0;
    }
}
