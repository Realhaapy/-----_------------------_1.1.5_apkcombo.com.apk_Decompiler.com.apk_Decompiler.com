package f.e.c.a.z.a;

import f.e.c.a.z.a.s0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

public final class b0 {
    static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    public interface a extends i<Boolean> {
    }

    public interface b extends i<Double> {
    }

    public interface c {
        int b();
    }

    public interface d<T extends c> {
        T a(int i2);
    }

    public interface e {
        boolean a(int i2);
    }

    public interface f extends i<Float> {
    }

    public interface g extends i<Integer> {
    }

    public interface h extends i<Long> {
    }

    public interface i<E> extends List<E>, RandomAccess {
        void a();

        i<E> b(int i2);

        boolean g();
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        j.f(bArr);
    }

    static <T> T a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    static <T> T b(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static int c(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i2, int i3) {
        int i4 = i(i3, bArr, i2, i3);
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public static int f(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return t1.m(bArr);
    }

    static Object h(Object obj, Object obj2) {
        s0.a e2 = ((s0) obj).e();
        e2.g((s0) obj2);
        return e2.o();
    }

    static int i(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, a);
    }
}
