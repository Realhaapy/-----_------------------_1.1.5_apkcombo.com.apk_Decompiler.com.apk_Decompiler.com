package f.e.c.a.a0;

import java.security.SecureRandom;

public final class u {
    private static final ThreadLocal<SecureRandom> a = new a();

    class a extends ThreadLocal<SecureRandom> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public SecureRandom initialValue() {
            return u.b();
        }
    }

    /* access modifiers changed from: private */
    public static SecureRandom b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] c(int i2) {
        byte[] bArr = new byte[i2];
        a.get().nextBytes(bArr);
        return bArr;
    }
}
