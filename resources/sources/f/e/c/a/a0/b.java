package f.e.c.a.a0;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class b implements f.e.c.a.a {

    /* renamed from: e  reason: collision with root package name */
    private static final ThreadLocal<Cipher> f4001e = new a();

    /* renamed from: f  reason: collision with root package name */
    private static final ThreadLocal<Cipher> f4002f = new C0113b();
    private final byte[] a;
    private final byte[] b;
    private final SecretKeySpec c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4003d;

    class a extends ThreadLocal<Cipher> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return m.f4020f.a("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    /* renamed from: f.e.c.a.a0.b$b  reason: collision with other inner class name */
    class C0113b extends ThreadLocal<Cipher> {
        C0113b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return m.f4020f.a("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    public b(byte[] bArr, int i2) {
        if (i2 == 12 || i2 == 16) {
            this.f4003d = i2;
            w.a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.c = secretKeySpec;
            Cipher cipher = f4001e.get();
            cipher.init(1, secretKeySpec);
            byte[] c2 = c(cipher.doFinal(new byte[16]));
            this.a = c2;
            this.b = c(c2);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    private static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i2 = 0;
        int i3 = 0;
        while (i3 < 15) {
            int i4 = i3 + 1;
            bArr2[i3] = (byte) (((bArr[i3] << 1) ^ ((bArr[i4] & 255) >>> 7)) & 255);
            i3 = i4;
        }
        int i5 = bArr[15] << 1;
        if ((bArr[0] & 128) != 0) {
            i2 = 135;
        }
        bArr2[15] = (byte) (i5 ^ i2);
        return bArr2;
    }

    private byte[] d(Cipher cipher, int i2, byte[] bArr, int i3, int i4) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i2;
        if (i4 == 0) {
            return cipher.doFinal(f(bArr2, this.a));
        }
        byte[] doFinal = cipher.doFinal(bArr2);
        int i5 = 0;
        while (i4 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                doFinal[i6] = (byte) (doFinal[i6] ^ bArr[(i3 + i5) + i6]);
            }
            doFinal = cipher.doFinal(doFinal);
            i5 += 16;
        }
        return cipher.doFinal(f(doFinal, e(Arrays.copyOfRange(bArr, i5 + i3, i3 + i4))));
    }

    private byte[] e(byte[] bArr) {
        if (bArr.length == 16) {
            return f(bArr, this.a);
        }
        byte[] copyOf = Arrays.copyOf(this.b, 16);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            copyOf[i2] = (byte) (copyOf[i2] ^ bArr[i2]);
        }
        copyOf[bArr.length] = (byte) (copyOf[bArr.length] ^ 128);
        return copyOf;
    }

    private static byte[] f(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
        }
        return bArr3;
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        int length = bArr3.length;
        int i2 = this.f4003d;
        if (length <= (Integer.MAX_VALUE - i2) - 16) {
            byte[] bArr4 = new byte[(bArr3.length + i2 + 16)];
            byte[] c2 = u.c(i2);
            System.arraycopy(c2, 0, bArr4, 0, this.f4003d);
            Cipher cipher = f4001e.get();
            cipher.init(1, this.c);
            byte[] d2 = d(cipher, 0, c2, 0, c2.length);
            byte[] bArr5 = bArr2 == null ? new byte[0] : bArr2;
            byte[] d3 = d(cipher, 1, bArr5, 0, bArr5.length);
            Cipher cipher2 = f4002f.get();
            cipher2.init(1, this.c, new IvParameterSpec(d2));
            cipher2.doFinal(bArr, 0, bArr3.length, bArr4, this.f4003d);
            byte[] d4 = d(cipher, 2, bArr4, this.f4003d, bArr3.length);
            int length2 = bArr3.length + this.f4003d;
            for (int i3 = 0; i3 < 16; i3++) {
                bArr4[length2 + i3] = (byte) ((d3[i3] ^ d2[i3]) ^ d4[i3]);
            }
            return bArr4;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = (bArr.length - this.f4003d) - 16;
        if (length >= 0) {
            Cipher cipher = f4001e.get();
            cipher.init(1, this.c);
            byte[] d2 = d(cipher, 0, bArr, 0, this.f4003d);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArr3 = bArr2;
            byte[] d3 = d(cipher, 1, bArr3, 0, bArr3.length);
            byte[] d4 = d(cipher, 2, bArr, this.f4003d, length);
            int length2 = bArr.length - 16;
            byte b2 = 0;
            for (int i2 = 0; i2 < 16; i2++) {
                b2 = (byte) (b2 | (((bArr[length2 + i2] ^ d3[i2]) ^ d2[i2]) ^ d4[i2]));
            }
            if (b2 == 0) {
                Cipher cipher2 = f4002f.get();
                cipher2.init(1, this.c, new IvParameterSpec(d2));
                return cipher2.doFinal(bArr, this.f4003d, length);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
