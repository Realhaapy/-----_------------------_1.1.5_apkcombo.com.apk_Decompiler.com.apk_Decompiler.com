package m.t;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import m.y.d.l;

class e extends d {
    public static <T> List<T> a(T[] tArr) {
        l.d(tArr, "<this>");
        List<T> a = g.a(tArr);
        l.c(a, "asList(this)");
        return a;
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        l.d(bArr, "<this>");
        l.d(bArr2, "destination");
        System.arraycopy(bArr, i3, bArr2, i2, i4 - i3);
        return bArr2;
    }

    public static final <T> T[] c(T[] tArr, T[] tArr2, int i2, int i3, int i4) {
        l.d(tArr, "<this>");
        l.d(tArr2, "destination");
        System.arraycopy(tArr, i3, tArr2, i2, i4 - i3);
        return tArr2;
    }

    public static /* synthetic */ Object[] d(Object[] objArr, Object[] objArr2, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = objArr.length;
        }
        c(objArr, objArr2, i2, i3, i4);
        return objArr2;
    }

    public static <T> void e(T[] tArr, T t, int i2, int i3) {
        l.d(tArr, "<this>");
        Arrays.fill(tArr, i2, i3, t);
    }

    public static /* synthetic */ void f(Object[] objArr, Object obj, int i2, int i3, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = objArr.length;
        }
        e(objArr, obj, i2, i3);
    }

    public static <T> void g(T[] tArr) {
        l.d(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void h(T[] tArr, Comparator<? super T> comparator) {
        l.d(tArr, "<this>");
        l.d(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
