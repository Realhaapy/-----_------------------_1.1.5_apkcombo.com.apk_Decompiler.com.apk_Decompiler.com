package f.e.d.y;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public final class h<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: l  reason: collision with root package name */
    private static final Comparator<Comparable> f4353l = new a();

    /* renamed from: e  reason: collision with root package name */
    Comparator<? super K> f4354e;

    /* renamed from: f  reason: collision with root package name */
    e<K, V> f4355f;

    /* renamed from: g  reason: collision with root package name */
    int f4356g;

    /* renamed from: h  reason: collision with root package name */
    int f4357h;

    /* renamed from: i  reason: collision with root package name */
    final e<K, V> f4358i;

    /* renamed from: j  reason: collision with root package name */
    private h<K, V>.defpackage.b f4359j;

    /* renamed from: k  reason: collision with root package name */
    private h<K, V>.defpackage.c f4360k;

    class a implements Comparator<Comparable> {
        a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    class b extends AbstractSet<Map.Entry<K, V>> {

        class a extends h<K, V>.d<Map.Entry<K, V>> {
            a(b bVar) {
                super();
            }

            /* renamed from: c */
            public Map.Entry<K, V> next() {
                return b();
            }
        }

        b() {
        }

        public void clear() {
            h.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && h.this.c((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        public boolean remove(Object obj) {
            e c;
            if (!(obj instanceof Map.Entry) || (c = h.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            h.this.f(c, true);
            return true;
        }

        public int size() {
            return h.this.f4356g;
        }
    }

    final class c extends AbstractSet<K> {

        class a extends h<K, V>.d<K> {
            a(c cVar) {
                super();
            }

            public K next() {
                return b().f4372j;
            }
        }

        c() {
        }

        public void clear() {
            h.this.clear();
        }

        public boolean contains(Object obj) {
            return h.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new a(this);
        }

        public boolean remove(Object obj) {
            return h.this.g(obj) != null;
        }

        public int size() {
            return h.this.f4356g;
        }
    }

    private abstract class d<T> implements Iterator<T> {

        /* renamed from: e  reason: collision with root package name */
        e<K, V> f4363e;

        /* renamed from: f  reason: collision with root package name */
        e<K, V> f4364f = null;

        /* renamed from: g  reason: collision with root package name */
        int f4365g;

        d() {
            this.f4363e = h.this.f4358i.f4370h;
            this.f4365g = h.this.f4357h;
        }

        /* access modifiers changed from: package-private */
        public final e<K, V> b() {
            e<K, V> eVar = this.f4363e;
            h hVar = h.this;
            if (eVar == hVar.f4358i) {
                throw new NoSuchElementException();
            } else if (hVar.f4357h == this.f4365g) {
                this.f4363e = eVar.f4370h;
                this.f4364f = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f4363e != h.this.f4358i;
        }

        public final void remove() {
            e<K, V> eVar = this.f4364f;
            if (eVar != null) {
                h.this.f(eVar, true);
                this.f4364f = null;
                this.f4365g = h.this.f4357h;
                return;
            }
            throw new IllegalStateException();
        }
    }

    static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: e  reason: collision with root package name */
        e<K, V> f4367e;

        /* renamed from: f  reason: collision with root package name */
        e<K, V> f4368f;

        /* renamed from: g  reason: collision with root package name */
        e<K, V> f4369g;

        /* renamed from: h  reason: collision with root package name */
        e<K, V> f4370h;

        /* renamed from: i  reason: collision with root package name */
        e<K, V> f4371i;

        /* renamed from: j  reason: collision with root package name */
        final K f4372j;

        /* renamed from: k  reason: collision with root package name */
        V f4373k;

        /* renamed from: l  reason: collision with root package name */
        int f4374l;

        e() {
            this.f4372j = null;
            this.f4371i = this;
            this.f4370h = this;
        }

        e(e<K, V> eVar, K k2, e<K, V> eVar2, e<K, V> eVar3) {
            this.f4367e = eVar;
            this.f4372j = k2;
            this.f4374l = 1;
            this.f4370h = eVar2;
            this.f4371i = eVar3;
            eVar3.f4370h = this;
            eVar2.f4371i = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f4368f; eVar2 != null; eVar2 = eVar2.f4368f) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f4369g; eVar2 != null; eVar2 = eVar2.f4369g) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x002e
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f4372j
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x002e
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x002e
            L_0x001c:
                V r0 = r3.f4373k
                java.lang.Object r4 = r4.getValue()
                if (r0 != 0) goto L_0x0027
                if (r4 != 0) goto L_0x002e
                goto L_0x002d
            L_0x0027:
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x002e
            L_0x002d:
                r1 = 1
            L_0x002e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.d.y.h.e.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f4372j;
        }

        public V getValue() {
            return this.f4373k;
        }

        public int hashCode() {
            K k2 = this.f4372j;
            int i2 = 0;
            int hashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f4373k;
            if (v != null) {
                i2 = v.hashCode();
            }
            return hashCode ^ i2;
        }

        public V setValue(V v) {
            V v2 = this.f4373k;
            this.f4373k = v;
            return v2;
        }

        public String toString() {
            return this.f4372j + "=" + this.f4373k;
        }
    }

    static {
        Class<h> cls = h.class;
    }

    public h() {
        this(f4353l);
    }

    public h(Comparator<? super K> comparator) {
        this.f4356g = 0;
        this.f4357h = 0;
        this.f4358i = new e<>();
        this.f4354e = comparator == null ? f4353l : comparator;
    }

    private boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void e(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f4368f;
            e<K, V> eVar3 = eVar.f4369g;
            int i2 = 0;
            int i3 = eVar2 != null ? eVar2.f4374l : 0;
            int i4 = eVar3 != null ? eVar3.f4374l : 0;
            int i5 = i3 - i4;
            if (i5 == -2) {
                e<K, V> eVar4 = eVar3.f4368f;
                e<K, V> eVar5 = eVar3.f4369g;
                int i6 = eVar5 != null ? eVar5.f4374l : 0;
                if (eVar4 != null) {
                    i2 = eVar4.f4374l;
                }
                int i7 = i2 - i6;
                if (i7 != -1 && (i7 != 0 || z)) {
                    j(eVar3);
                }
                i(eVar);
                if (z) {
                    return;
                }
            } else if (i5 == 2) {
                e<K, V> eVar6 = eVar2.f4368f;
                e<K, V> eVar7 = eVar2.f4369g;
                int i8 = eVar7 != null ? eVar7.f4374l : 0;
                if (eVar6 != null) {
                    i2 = eVar6.f4374l;
                }
                int i9 = i2 - i8;
                if (i9 != 1 && (i9 != 0 || z)) {
                    i(eVar2);
                }
                j(eVar);
                if (z) {
                    return;
                }
            } else if (i5 == 0) {
                eVar.f4374l = i3 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f4374l = Math.max(i3, i4) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f4367e;
        }
    }

    private void h(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f4367e;
        eVar.f4367e = null;
        if (eVar2 != null) {
            eVar2.f4367e = eVar3;
        }
        if (eVar3 == null) {
            this.f4355f = eVar2;
        } else if (eVar3.f4368f == eVar) {
            eVar3.f4368f = eVar2;
        } else {
            eVar3.f4369g = eVar2;
        }
    }

    private void i(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f4368f;
        e<K, V> eVar3 = eVar.f4369g;
        e<K, V> eVar4 = eVar3.f4368f;
        e<K, V> eVar5 = eVar3.f4369g;
        eVar.f4369g = eVar4;
        if (eVar4 != null) {
            eVar4.f4367e = eVar;
        }
        h(eVar, eVar3);
        eVar3.f4368f = eVar;
        eVar.f4367e = eVar3;
        int i2 = 0;
        int max = Math.max(eVar2 != null ? eVar2.f4374l : 0, eVar4 != null ? eVar4.f4374l : 0) + 1;
        eVar.f4374l = max;
        if (eVar5 != null) {
            i2 = eVar5.f4374l;
        }
        eVar3.f4374l = Math.max(max, i2) + 1;
    }

    private void j(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f4368f;
        e<K, V> eVar3 = eVar.f4369g;
        e<K, V> eVar4 = eVar2.f4368f;
        e<K, V> eVar5 = eVar2.f4369g;
        eVar.f4368f = eVar5;
        if (eVar5 != null) {
            eVar5.f4367e = eVar;
        }
        h(eVar, eVar2);
        eVar2.f4369g = eVar;
        eVar.f4367e = eVar2;
        int i2 = 0;
        int max = Math.max(eVar3 != null ? eVar3.f4374l : 0, eVar5 != null ? eVar5.f4374l : 0) + 1;
        eVar.f4374l = max;
        if (eVar4 != null) {
            i2 = eVar4.f4374l;
        }
        eVar2.f4374l = Math.max(max, i2) + 1;
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    /* access modifiers changed from: package-private */
    public e<K, V> b(K k2, boolean z) {
        int i2;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f4354e;
        e<K, V> eVar2 = this.f4355f;
        if (eVar2 != null) {
            Comparable comparable = comparator == f4353l ? (Comparable) k2 : null;
            while (true) {
                K k3 = eVar2.f4372j;
                i2 = comparable != null ? comparable.compareTo(k3) : comparator.compare(k2, k3);
                if (i2 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i2 < 0 ? eVar2.f4368f : eVar2.f4369g;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i2 = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.f4358i;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k2, eVar4, eVar4.f4371i);
            if (i2 < 0) {
                eVar2.f4368f = eVar;
            } else {
                eVar2.f4369g = eVar;
            }
            e(eVar2, true);
        } else if (comparator != f4353l || (k2 instanceof Comparable)) {
            eVar = new e<>(eVar2, k2, eVar4, eVar4.f4371i);
            this.f4355f = eVar;
        } else {
            throw new ClassCastException(k2.getClass().getName() + " is not Comparable");
        }
        this.f4356g++;
        this.f4357h++;
        return eVar;
    }

    /* access modifiers changed from: package-private */
    public e<K, V> c(Map.Entry<?, ?> entry) {
        e<K, V> d2 = d(entry.getKey());
        if (d2 != null && a(d2.f4373k, entry.getValue())) {
            return d2;
        }
        return null;
    }

    public void clear() {
        this.f4355f = null;
        this.f4356g = 0;
        this.f4357h++;
        e<K, V> eVar = this.f4358i;
        eVar.f4371i = eVar;
        eVar.f4370h = eVar;
    }

    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    /* access modifiers changed from: package-private */
    public e<K, V> d(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        h<K, V>.defpackage.b bVar = this.f4359j;
        if (bVar != null) {
            return bVar;
        }
        h<K, V>.defpackage.b bVar2 = new b();
        this.f4359j = bVar2;
        return bVar2;
    }

    /* access modifiers changed from: package-private */
    public void f(e<K, V> eVar, boolean z) {
        int i2;
        if (z) {
            e<K, V> eVar2 = eVar.f4371i;
            eVar2.f4370h = eVar.f4370h;
            eVar.f4370h.f4371i = eVar2;
        }
        e<K, V> eVar3 = eVar.f4368f;
        e<K, V> eVar4 = eVar.f4369g;
        e<K, V> eVar5 = eVar.f4367e;
        int i3 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                h(eVar, eVar3);
                eVar.f4368f = null;
            } else if (eVar4 != null) {
                h(eVar, eVar4);
                eVar.f4369g = null;
            } else {
                h(eVar, (e<K, V>) null);
            }
            e(eVar5, false);
            this.f4356g--;
            this.f4357h++;
            return;
        }
        e<K, V> b2 = eVar3.f4374l > eVar4.f4374l ? eVar3.b() : eVar4.a();
        f(b2, false);
        e<K, V> eVar6 = eVar.f4368f;
        if (eVar6 != null) {
            i2 = eVar6.f4374l;
            b2.f4368f = eVar6;
            eVar6.f4367e = b2;
            eVar.f4368f = null;
        } else {
            i2 = 0;
        }
        e<K, V> eVar7 = eVar.f4369g;
        if (eVar7 != null) {
            i3 = eVar7.f4374l;
            b2.f4369g = eVar7;
            eVar7.f4367e = b2;
            eVar.f4369g = null;
        }
        b2.f4374l = Math.max(i2, i3) + 1;
        h(eVar, b2);
    }

    /* access modifiers changed from: package-private */
    public e<K, V> g(Object obj) {
        e<K, V> d2 = d(obj);
        if (d2 != null) {
            f(d2, true);
        }
        return d2;
    }

    public V get(Object obj) {
        e d2 = d(obj);
        if (d2 != null) {
            return d2.f4373k;
        }
        return null;
    }

    public Set<K> keySet() {
        h<K, V>.defpackage.c cVar = this.f4360k;
        if (cVar != null) {
            return cVar;
        }
        h<K, V>.defpackage.c cVar2 = new c();
        this.f4360k = cVar2;
        return cVar2;
    }

    public V put(K k2, V v) {
        Objects.requireNonNull(k2, "key == null");
        e b2 = b(k2, true);
        V v2 = b2.f4373k;
        b2.f4373k = v;
        return v2;
    }

    public V remove(Object obj) {
        e g2 = g(obj);
        if (g2 != null) {
            return g2.f4373k;
        }
        return null;
    }

    public int size() {
        return this.f4356g;
    }
}
