package f.e.c.a.u;

import f.e.c.a.a0.g;
import f.e.c.a.d;
import f.e.c.a.p;
import f.e.c.a.q;
import f.e.c.a.r;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

public class c implements q<d, d> {
    /* access modifiers changed from: private */
    public static final Logger a = Logger.getLogger(c.class.getName());

    private static class a implements d {
        private p<d> a;

        public a(p<d> pVar) {
            this.a = pVar;
        }

        public byte[] a(byte[] bArr, byte[] bArr2) {
            return g.a(this.a.b().a(), this.a.b().c().a(bArr, bArr2));
        }

        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (p.b c : this.a.c(copyOfRange)) {
                    try {
                        return ((d) c.c()).b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e2) {
                        Logger d2 = c.a;
                        d2.info("ciphertext prefix matches a key, but cannot decrypt: " + e2.toString());
                    }
                }
            }
            for (p.b c2 : this.a.e()) {
                try {
                    return ((d) c2.c()).b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    c() {
    }

    public static void e() {
        r.r(new c());
    }

    public Class<d> a() {
        return d.class;
    }

    public Class<d> c() {
        return d.class;
    }

    /* renamed from: f */
    public d b(p<d> pVar) {
        return new a(pVar);
    }
}
