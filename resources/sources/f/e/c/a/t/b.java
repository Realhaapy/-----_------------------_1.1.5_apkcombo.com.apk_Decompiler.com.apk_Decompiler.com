package f.e.c.a.t;

import f.e.c.a.a0.g;
import f.e.c.a.p;
import f.e.c.a.q;
import f.e.c.a.r;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

public class b implements q<f.e.c.a.a, f.e.c.a.a> {
    /* access modifiers changed from: private */
    public static final Logger a = Logger.getLogger(b.class.getName());

    /* renamed from: f.e.c.a.t.b$b  reason: collision with other inner class name */
    private static class C0114b implements f.e.c.a.a {
        private final p<f.e.c.a.a> a;

        private C0114b(p<f.e.c.a.a> pVar) {
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
                        return ((f.e.c.a.a) c.c()).b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e2) {
                        Logger d2 = b.a;
                        d2.info("ciphertext prefix matches a key, but cannot decrypt: " + e2.toString());
                    }
                }
            }
            for (p.b c2 : this.a.e()) {
                try {
                    return ((f.e.c.a.a) c2.c()).b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    b() {
    }

    public static void e() {
        r.r(new b());
    }

    public Class<f.e.c.a.a> a() {
        return f.e.c.a.a.class;
    }

    public Class<f.e.c.a.a> c() {
        return f.e.c.a.a.class;
    }

    /* renamed from: f */
    public f.e.c.a.a b(p<f.e.c.a.a> pVar) {
        return new C0114b(pVar);
    }
}
