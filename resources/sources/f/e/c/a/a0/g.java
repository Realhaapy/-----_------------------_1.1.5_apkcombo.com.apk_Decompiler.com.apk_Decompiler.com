package f.e.c.a.a0;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class g {
    public static byte[] a(byte[]... bArr) {
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte[] bArr2 = bArr[i2];
            if (i3 <= Integer.MAX_VALUE - bArr2.length) {
                i3 += bArr2.length;
                i2++;
            } else {
                throw new GeneralSecurityException("exceeded size limit");
            }
        }
        byte[] bArr3 = new byte[i3];
        int i4 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i4, bArr4.length);
            i4 += bArr4.length;
        }
        return bArr3;
    }

    public static final boolean b(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        byte b = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            b |= bArr[i2] ^ bArr2[i2];
        }
        return b == 0;
    }

    public static final void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i2) {
        if (i2 < 0 || byteBuffer2.remaining() < i2 || byteBuffer3.remaining() < i2 || byteBuffer.remaining() < i2) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final byte[] d(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        if (i4 < 0 || bArr.length - i4 < i2 || bArr2.length - i4 < i3) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr3[i5] = (byte) (bArr[i5 + i2] ^ bArr2[i5 + i3]);
        }
        return bArr3;
    }

    public static final byte[] e(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return d(bArr, 0, bArr2, 0, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final byte[] f(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= bArr2.length) {
            int length = bArr.length - bArr2.length;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                int i3 = length + i2;
                copyOf[i3] = (byte) (copyOf[i3] ^ bArr2[i2]);
            }
            return copyOf;
        }
        throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
    }
}
