package q;

final class p {
    static o a;
    static long b;

    private p() {
    }

    static void a(o oVar) {
        if (oVar.f5508f != null || oVar.f5509g != null) {
            throw new IllegalArgumentException();
        } else if (!oVar.f5506d) {
            synchronized (p.class) {
                long j2 = b;
                if (j2 + 8192 <= 65536) {
                    b = j2 + 8192;
                    oVar.f5508f = a;
                    oVar.c = 0;
                    oVar.b = 0;
                    a = oVar;
                }
            }
        }
    }

    static o b() {
        synchronized (p.class) {
            o oVar = a;
            if (oVar == null) {
                return new o();
            }
            a = oVar.f5508f;
            oVar.f5508f = null;
            b -= 8192;
            return oVar;
        }
    }
}
