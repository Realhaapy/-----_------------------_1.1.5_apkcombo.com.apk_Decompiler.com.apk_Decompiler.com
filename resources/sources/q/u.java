package q;

import java.nio.charset.Charset;

final class u {
    public static final Charset a = Charset.forName("UTF-8");

    public static boolean a(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static void b(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", new Object[]{Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)}));
        }
    }

    public static int c(int i2) {
        return ((i2 & 255) << 24) | ((-16777216 & i2) >>> 24) | ((16711680 & i2) >>> 8) | ((65280 & i2) << 8);
    }

    public static short d(short s2) {
        short s3 = s2 & 65535;
        return (short) (((s3 & 255) << 8) | ((65280 & s3) >>> 8));
    }

    public static void e(Throwable th) {
        f(th);
        throw null;
    }

    private static <T extends Throwable> void f(Throwable th) {
        throw th;
    }
}
