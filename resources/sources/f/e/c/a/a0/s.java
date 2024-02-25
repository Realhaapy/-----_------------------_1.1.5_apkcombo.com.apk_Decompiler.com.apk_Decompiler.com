package f.e.c.a.a0;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

public final class s implements f.e.c.a.x.a {
    private final ThreadLocal<Mac> a;
    /* access modifiers changed from: private */
    public final String b;
    /* access modifiers changed from: private */
    public final Key c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4022d;

    class a extends ThreadLocal<Mac> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Mac initialValue() {
            try {
                Mac a2 = m.f4021g.a(s.this.b);
                a2.init(s.this.c);
                return a2;
            } catch (GeneralSecurityException e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    public s(String str, Key key) {
        int i2;
        a aVar = new a();
        this.a = aVar;
        this.b = str;
        this.c = key;
        if (key.getEncoded().length >= 16) {
            str.hashCode();
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1823053428:
                    if (str.equals("HMACSHA1")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 392315118:
                    if (str.equals("HMACSHA256")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 392316170:
                    if (str.equals("HMACSHA384")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 392317873:
                    if (str.equals("HMACSHA512")) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    i2 = 20;
                    break;
                case 1:
                    i2 = 32;
                    break;
                case 2:
                    i2 = 48;
                    break;
                case 3:
                    i2 = 64;
                    break;
                default:
                    throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
            }
            this.f4022d = i2;
            aVar.get();
            return;
        }
        throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
    }

    public byte[] a(byte[] bArr, int i2) {
        if (i2 <= this.f4022d) {
            this.a.get().update(bArr);
            return Arrays.copyOf(this.a.get().doFinal(), i2);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
