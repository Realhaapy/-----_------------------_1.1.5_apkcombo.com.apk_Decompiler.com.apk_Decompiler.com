package m.t;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m.l;

class a0 extends z {
    public static final <K, V> Map<K, V> d() {
        return u.f5023e;
    }

    public static <K, V> HashMap<K, V> e(l<? extends K, ? extends V>... lVarArr) {
        m.y.d.l.d(lVarArr, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(z.a(lVarArr.length));
        i(hashMap, lVarArr);
        return hashMap;
    }

    public static <K, V> Map<K, V> f(l<? extends K, ? extends V>... lVarArr) {
        m.y.d.l.d(lVarArr, "pairs");
        if (lVarArr.length <= 0) {
            return d();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(z.a(lVarArr.length));
        m(lVarArr, linkedHashMap);
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> g(Map<K, ? extends V> map) {
        m.y.d.l.d(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : z.c(map) : d();
    }

    public static final <K, V> void h(Map<? super K, ? super V> map, Iterable<? extends l<? extends K, ? extends V>> iterable) {
        m.y.d.l.d(map, "<this>");
        m.y.d.l.d(iterable, "pairs");
        for (l lVar : iterable) {
            map.put(lVar.a(), lVar.b());
        }
    }

    public static final <K, V> void i(Map<? super K, ? super V> map, l<? extends K, ? extends V>[] lVarArr) {
        m.y.d.l.d(map, "<this>");
        m.y.d.l.d(lVarArr, "pairs");
        int length = lVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            l<? extends K, ? extends V> lVar = lVarArr[i2];
            i2++;
            map.put(lVar.a(), lVar.b());
        }
    }

    public static <K, V> Map<K, V> j(Iterable<? extends l<? extends K, ? extends V>> iterable) {
        m.y.d.l.d(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return d();
            }
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(z.a(collection.size()));
                k(iterable, linkedHashMap);
                return linkedHashMap;
            }
            return z.b((l) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        k(iterable, linkedHashMap2);
        return g(linkedHashMap2);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M k(Iterable<? extends l<? extends K, ? extends V>> iterable, M m2) {
        m.y.d.l.d(iterable, "<this>");
        m.y.d.l.d(m2, "destination");
        h(m2, iterable);
        return m2;
    }

    public static <K, V> Map<K, V> l(Map<? extends K, ? extends V> map) {
        m.y.d.l.d(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? n(map) : z.c(map) : d();
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M m(l<? extends K, ? extends V>[] lVarArr, M m2) {
        m.y.d.l.d(lVarArr, "<this>");
        m.y.d.l.d(m2, "destination");
        i(m2, lVarArr);
        return m2;
    }

    public static <K, V> Map<K, V> n(Map<? extends K, ? extends V> map) {
        m.y.d.l.d(map, "<this>");
        return new LinkedHashMap(map);
    }
}
