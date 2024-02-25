package f.e.c.a.z.a;

import f.e.c.a.z.a.b0;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class m0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: f  reason: collision with root package name */
    private static final m0 f4155f;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4156e = true;

    static {
        m0 m0Var = new m0();
        f4155f = m0Var;
        m0Var.l();
    }

    private m0() {
    }

    private m0(Map<K, V> map) {
        super(map);
    }

    static <K, V> int b(Map<K, V> map) {
        int i2 = 0;
        for (Map.Entry next : map.entrySet()) {
            i2 += d(next.getValue()) ^ d(next.getKey());
        }
        return i2;
    }

    private static int d(Object obj) {
        if (obj instanceof byte[]) {
            return b0.d((byte[]) obj);
        }
        if (!(obj instanceof b0.c)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private static void e(Map<?, ?> map) {
        for (Object next : map.keySet()) {
            b0.a(next);
            b0.a(map.get(next));
        }
    }

    public static <K, V> m0<K, V> f() {
        return f4155f;
    }

    private void h() {
        if (!k()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean i(Object obj, Object obj2) {
        return (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) ? obj.equals(obj2) : Arrays.equals((byte[]) obj, (byte[]) obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <K, V> boolean j(java.util.Map<K, V> r4, java.util.Map<K, V> r5) {
        /*
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.size()
            int r2 = r5.size()
            r3 = 0
            if (r1 == r2) goto L_0x0010
            return r3
        L_0x0010:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0018:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 != 0) goto L_0x002f
            return r3
        L_0x002f:
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = i(r2, r1)
            if (r1 != 0) goto L_0x0018
            return r3
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.z.a.m0.j(java.util.Map, java.util.Map):boolean");
    }

    public void clear() {
        h();
        super.clear();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && j(this, (Map) obj);
    }

    public int hashCode() {
        return b(this);
    }

    public boolean k() {
        return this.f4156e;
    }

    public void l() {
        this.f4156e = false;
    }

    public void m(m0<K, V> m0Var) {
        h();
        if (!m0Var.isEmpty()) {
            putAll(m0Var);
        }
    }

    public m0<K, V> n() {
        return isEmpty() ? new m0<>() : new m0<>(this);
    }

    public V put(K k2, V v) {
        h();
        b0.a(k2);
        b0.a(v);
        return super.put(k2, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        h();
        e(map);
        super.putAll(map);
    }

    public V remove(Object obj) {
        h();
        return super.remove(obj);
    }
}
