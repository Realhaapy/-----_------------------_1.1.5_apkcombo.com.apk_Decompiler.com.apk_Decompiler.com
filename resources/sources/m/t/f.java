package m.t;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import m.y.d.l;

class f extends e {
    public static <T> boolean i(T[] tArr, T t) {
        l.d(tArr, "<this>");
        return l(tArr, t) >= 0;
    }

    public static <T> T j(T[] tArr) {
        l.d(tArr, "<this>");
        if (!(tArr.length == 0)) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int k(int[] iArr) {
        l.d(iArr, "<this>");
        return iArr.length - 1;
    }

    public static final <T> int l(T[] tArr, T t) {
        l.d(tArr, "<this>");
        int i2 = 0;
        if (t == null) {
            int length = tArr.length;
            while (i2 < length) {
                int i3 = i2 + 1;
                if (tArr[i2] == null) {
                    return i2;
                }
                i2 = i3;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i2 < length2) {
            int i4 = i2 + 1;
            if (l.a(t, tArr[i2])) {
                return i2;
            }
            i2 = i4;
        }
        return -1;
    }

    public static char m(char[] cArr) {
        l.d(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static <T> T n(T[] tArr) {
        l.d(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final <T> T[] o(T[] tArr, Comparator<? super T> comparator) {
        l.d(tArr, "<this>");
        l.d(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] copyOf = Arrays.copyOf(tArr, tArr.length);
        l.c(copyOf, "copyOf(this, size)");
        e.h(copyOf, comparator);
        return copyOf;
    }

    public static <T> List<T> p(T[] tArr, Comparator<? super T> comparator) {
        l.d(tArr, "<this>");
        l.d(comparator, "comparator");
        return e.a(o(tArr, comparator));
    }

    public static final <T, C extends Collection<? super T>> C q(T[] tArr, C c) {
        l.d(tArr, "<this>");
        l.d(c, "destination");
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            c.add(t);
        }
        return c;
    }

    public static <T> HashSet<T> r(T[] tArr) {
        l.d(tArr, "<this>");
        HashSet<T> hashSet = new HashSet<>(z.a(tArr.length));
        q(tArr, hashSet);
        return hashSet;
    }

    public static <T> List<T> s(T[] tArr) {
        l.d(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? t(tArr) : i.b(tArr[0]) : j.e();
    }

    public static final <T> List<T> t(T[] tArr) {
        l.d(tArr, "<this>");
        return new ArrayList(j.d(tArr));
    }

    public static final <T> Set<T> u(T[] tArr) {
        l.d(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return e0.b();
        }
        if (length == 1) {
            return d0.a(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(z.a(tArr.length));
        q(tArr, linkedHashSet);
        return linkedHashSet;
    }
}
