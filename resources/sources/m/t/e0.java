package m.t;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import m.y.d.l;

class e0 extends d0 {
    public static <T> Set<T> b() {
        return v.f5024e;
    }

    public static <T> HashSet<T> c(T... tArr) {
        l.d(tArr, "elements");
        HashSet<T> hashSet = new HashSet<>(z.a(tArr.length));
        f.q(tArr, hashSet);
        return hashSet;
    }

    public static <T> Set<T> d(T... tArr) {
        l.d(tArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(z.a(tArr.length));
        f.q(tArr, linkedHashSet);
        return linkedHashSet;
    }

    public static final <T> Set<T> e(Set<? extends T> set) {
        l.d(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : d0.a(set.iterator().next()) : b();
    }

    public static <T> Set<T> f(T... tArr) {
        l.d(tArr, "elements");
        return tArr.length > 0 ? f.u(tArr) : b();
    }
}
