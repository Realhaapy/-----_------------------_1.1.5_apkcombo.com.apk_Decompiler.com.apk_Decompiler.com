package f.e.c.a.t.m;

import f.e.c.a.a0.m;
import f.e.c.a.a0.u;
import f.e.c.a.a0.v;
import f.e.c.a.a0.w;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class a implements f.e.c.a.a {
    private static final ThreadLocal<Cipher> b = new C0115a();
    private final SecretKey a;

    /* renamed from: f.e.c.a.t.m.a$a  reason: collision with other inner class name */
    class C0115a extends ThreadLocal<Cipher> {
        C0115a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return m.f4020f.a("AES/GCM-SIV/NoPadding");
            } catch (GeneralSecurityException e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    public a(byte[] bArr) {
        w.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
    }

    private static AlgorithmParameterSpec c(byte[] bArr) {
        return d(bArr, 0, bArr.length);
    }

    private static AlgorithmParameterSpec d(byte[] bArr, int i2, int i3) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, i2, i3);
        } catch (ClassNotFoundException unused) {
            if (v.b()) {
                return new IvParameterSpec(bArr, i2, i3);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            byte[] c = u.c(12);
            System.arraycopy(c, 0, bArr3, 0, 12);
            AlgorithmParameterSpec c2 = c(c);
            ThreadLocal<Cipher> threadLocal = b;
            threadLocal.get().init(1, this.a, c2);
            if (!(bArr2 == null || bArr2.length == 0)) {
                threadLocal.get().updateAAD(bArr2);
            }
            int doFinal = threadLocal.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - bArr.length)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            AlgorithmParameterSpec d2 = d(bArr, 0, 12);
            ThreadLocal<Cipher> threadLocal = b;
            threadLocal.get().init(2, this.a, d2);
            if (!(bArr2 == null || bArr2.length == 0)) {
                threadLocal.get().updateAAD(bArr2);
            }
            return threadLocal.get().doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
