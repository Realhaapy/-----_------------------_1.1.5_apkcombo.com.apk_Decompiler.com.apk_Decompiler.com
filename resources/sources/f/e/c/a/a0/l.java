package f.e.c.a.a0;

import f.e.c.a.a;
import f.e.c.a.o;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class l implements a {
    private final p a;
    private final o b;
    private final int c;

    public l(p pVar, o oVar, int i2) {
        this.a = pVar;
        this.b = oVar;
        this.c = i2;
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a2 = this.a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return g.a(a2, this.b.b(g.a(bArr2, a2, copyOf)));
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i2 = this.c;
        if (length >= i2) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i2);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.c, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
            this.b.a(copyOfRange2, g.a(bArr2, copyOfRange, copyOf));
            return this.a.b(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
