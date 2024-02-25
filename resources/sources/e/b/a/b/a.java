package e.b.a.b;

import e.b.a.b.b;
import java.util.HashMap;
import java.util.Map;

public class a<K, V> extends b<K, V> {

    /* renamed from: i  reason: collision with root package name */
    private HashMap<K, b.c<K, V>> f3197i = new HashMap<>();

    public boolean contains(K k2) {
        return this.f3197i.containsKey(k2);
    }

    /* access modifiers changed from: protected */
    public b.c<K, V> j(K k2) {
        return this.f3197i.get(k2);
    }

    public V n(K k2, V v) {
        b.c j2 = j(k2);
        if (j2 != null) {
            return j2.f3203f;
        }
        this.f3197i.put(k2, m(k2, v));
        return null;
    }

    public V o(K k2) {
        V o2 = super.o(k2);
        this.f3197i.remove(k2);
        return o2;
    }

    public Map.Entry<K, V> p(K k2) {
        if (contains(k2)) {
            return this.f3197i.get(k2).f3205h;
        }
        return null;
    }
}
