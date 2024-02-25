package f.e.c.a.a0;

import io.flutter.embedding.android.KeyboardMap;
import java.security.GeneralSecurityException;
import java.util.Arrays;

class q {
    static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            int i2 = 0;
            long c = c(bArr3, 0, 0) & 67108863;
            int i3 = 3;
            long c2 = c(bArr3, 3, 2) & 67108611;
            long c3 = c(bArr3, 6, 4) & 67092735;
            long c4 = c(bArr3, 9, 6) & 66076671;
            long c5 = c(bArr3, 12, 8) & 1048575;
            long j2 = c2 * 5;
            long j3 = c3 * 5;
            long j4 = c4 * 5;
            long j5 = c5 * 5;
            byte[] bArr5 = new byte[17];
            long j6 = 0;
            long j7 = 0;
            long j8 = 0;
            long j9 = 0;
            long j10 = 0;
            int i4 = 0;
            while (i4 < bArr4.length) {
                b(bArr5, bArr4, i4);
                long c6 = j10 + c(bArr5, i2, i2);
                long c7 = j6 + c(bArr5, i3, 2);
                long c8 = j7 + c(bArr5, 6, 4);
                long c9 = j8 + c(bArr5, 9, 6);
                long c10 = j9 + (c(bArr5, 12, 8) | ((long) (bArr5[16] << 24)));
                long j11 = (c6 * c) + (c7 * j5) + (c8 * j4) + (c9 * j3) + (c10 * j2);
                long j12 = (c6 * c2) + (c7 * c) + (c8 * j5) + (c9 * j4) + (c10 * j3) + (j11 >> 26);
                long j13 = (c6 * c3) + (c7 * c2) + (c8 * c) + (c9 * j5) + (c10 * j4) + (j12 >> 26);
                long j14 = (c6 * c4) + (c7 * c3) + (c8 * c2) + (c9 * c) + (c10 * j5) + (j13 >> 26);
                long j15 = (c6 * c5) + (c7 * c4) + (c8 * c3) + (c9 * c2) + (c10 * c) + (j14 >> 26);
                long j16 = (j11 & 67108863) + ((j15 >> 26) * 5);
                j6 = (j12 & 67108863) + (j16 >> 26);
                i4 += 16;
                j7 = j13 & 67108863;
                j8 = j14 & 67108863;
                j9 = j15 & 67108863;
                i3 = 3;
                j10 = j16 & 67108863;
                i2 = 0;
            }
            long j17 = j7 + (j6 >> 26);
            long j18 = j17 & 67108863;
            long j19 = j8 + (j17 >> 26);
            long j20 = j19 & 67108863;
            long j21 = j9 + (j19 >> 26);
            long j22 = j21 & 67108863;
            long j23 = j10 + ((j21 >> 26) * 5);
            long j24 = j23 & 67108863;
            long j25 = (j6 & 67108863) + (j23 >> 26);
            long j26 = j24 + 5;
            long j27 = j26 & 67108863;
            long j28 = (j26 >> 26) + j25;
            long j29 = j18 + (j28 >> 26);
            long j30 = j20 + (j29 >> 26);
            long j31 = (j22 + (j30 >> 26)) - 67108864;
            long j32 = j31 >> 63;
            long j33 = j24 & j32;
            long j34 = j25 & j32;
            long j35 = j18 & j32;
            long j36 = j20 & j32;
            long j37 = j22 & j32;
            long j38 = ~j32;
            long j39 = (j28 & 67108863 & j38) | j34;
            long j40 = (j29 & 67108863 & j38) | j35;
            long j41 = (j30 & 67108863 & j38) | j36;
            long j42 = (j33 | (j27 & j38) | (j39 << 26)) & KeyboardMap.kValueMask;
            long j43 = ((j39 >> 6) | (j40 << 20)) & KeyboardMap.kValueMask;
            long j44 = ((j40 >> 12) | (j41 << 14)) & KeyboardMap.kValueMask;
            long j45 = ((j41 >> 18) | (((j31 & j38) | j37) << 8)) & KeyboardMap.kValueMask;
            long d2 = j42 + d(bArr3, 16);
            long j46 = d2 & KeyboardMap.kValueMask;
            long d3 = j43 + d(bArr3, 20) + (d2 >> 32);
            long j47 = d3 & KeyboardMap.kValueMask;
            long d4 = j44 + d(bArr3, 24) + (d3 >> 32);
            long j48 = d4 & KeyboardMap.kValueMask;
            long d5 = (j45 + d(bArr3, 28) + (d4 >> 32)) & KeyboardMap.kValueMask;
            byte[] bArr6 = new byte[16];
            e(bArr6, j46, 0);
            e(bArr6, j47, 4);
            e(bArr6, j48, 8);
            e(bArr6, d5, 12);
            return bArr6;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }

    private static void b(byte[] bArr, byte[] bArr2, int i2) {
        int min = Math.min(16, bArr2.length - i2);
        System.arraycopy(bArr2, i2, bArr, 0, min);
        bArr[min] = 1;
        if (min != 16) {
            Arrays.fill(bArr, min + 1, bArr.length, (byte) 0);
        }
    }

    private static long c(byte[] bArr, int i2, int i3) {
        return (d(bArr, i2) >> i3) & 67108863;
    }

    private static long d(byte[] bArr, int i2) {
        return ((long) (((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16))) & KeyboardMap.kValueMask;
    }

    private static void e(byte[] bArr, long j2, int i2) {
        int i3 = 0;
        while (i3 < 4) {
            bArr[i2 + i3] = (byte) ((int) (255 & j2));
            i3++;
            j2 >>= 8;
        }
    }

    static void f(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!g.b(a(bArr, bArr2), bArr3)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
