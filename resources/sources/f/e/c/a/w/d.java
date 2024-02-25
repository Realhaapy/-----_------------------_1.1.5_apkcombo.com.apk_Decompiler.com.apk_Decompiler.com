package f.e.c.a.w;

import f.e.c.a.a0.g;
import f.e.c.a.o;
import f.e.c.a.p;
import f.e.c.a.q;
import f.e.c.a.r;
import f.e.c.a.y.i0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

class d implements q<o, o> {
    /* access modifiers changed from: private */
    public static final Logger a = Logger.getLogger(d.class.getName());

    private static class b implements o {
        private final p<o> a;
        private final byte[] b;

        private b(p<o> pVar) {
            this.b = new byte[]{0};
            this.a = pVar;
        }

        public void a(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (p.b next : this.a.c(copyOf)) {
                    try {
                        if (next.b().equals(i0.LEGACY)) {
                            ((o) next.c()).a(copyOfRange, g.a(bArr2, this.b));
                            return;
                        }
                        ((o) next.c()).a(copyOfRange, bArr2);
                        return;
                    } catch (GeneralSecurityException e2) {
                        Logger d2 = d.a;
                        d2.info("tag prefix matches a key, but cannot verify: " + e2);
                    }
                }
                for (p.b c : this.a.e()) {
                    try {
                        ((o) c.c()).a(bArr, bArr2);
                        return;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                throw new GeneralSecurityException("invalid MAC");
            }
            throw new GeneralSecurityException("tag too short");
        }

        public byte[] b(byte[] bArr) {
            if (this.a.b().b().equals(i0.LEGACY)) {
                return g.a(this.a.b().a(), this.a.b().c().b(g.a(bArr, this.b)));
            }
            return g.a(this.a.b().a(), this.a.b().c().b(bArr));
        }
    }

    d() {
    }

    public static void e() {
        r.r(new d());
    }

    public Class<o> a() {
        return o.class;
    }

    public Class<o> c() {
        return o.class;
    }

    /* renamed from: f */
    public o b(p<o> pVar) {
        return new b(pVar);
    }
}
