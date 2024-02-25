package e.e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

abstract class f<K, V> {
    f<K, V>.defpackage.b a;
    f<K, V>.defpackage.c b;
    f<K, V>.e c;

    final class a<T> implements Iterator<T> {

        /* renamed from: e  reason: collision with root package name */
        final int f3266e;

        /* renamed from: f  reason: collision with root package name */
        int f3267f;

        /* renamed from: g  reason: collision with root package name */
        int f3268g;

        /* renamed from: h  reason: collision with root package name */
        boolean f3269h = false;

        a(int i2) {
            this.f3266e = i2;
            this.f3267f = f.this.d();
        }

        public boolean hasNext() {
            return this.f3268g < this.f3267f;
        }

        public T next() {
            if (hasNext()) {
                T b = f.this.b(this.f3268g, this.f3266e);
                this.f3268g++;
                this.f3269h = true;
                return b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f3269h) {
                int i2 = this.f3268g - 1;
                this.f3268g = i2;
                this.f3267f--;
                this.f3269h = false;
                f.this.h(i2);
                return;
            }
            throw new IllegalStateException();
        }
    }

    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            h((Map.Entry) obj);
            throw null;
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d2 = f.this.d();
            for (Map.Entry entry : collection) {
                f.this.g(entry.getKey(), entry.getValue());
            }
            return d2 != f.this.d();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e2 = f.this.e(entry.getKey());
            if (e2 < 0) {
                return false;
            }
            return c.c(f.this.b(e2, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return f.k(this, obj);
        }

        public boolean h(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public int hashCode() {
            int i2 = 0;
            for (int d2 = f.this.d() - 1; d2 >= 0; d2--) {
                Object b = f.this.b(d2, 0);
                Object b2 = f.this.b(d2, 1);
                i2 += (b == null ? 0 : b.hashCode()) ^ (b2 == null ? 0 : b2.hashCode());
            }
            return i2;
        }

        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    final class c implements Set<K> {
        c() {
        }

        public boolean add(K k2) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            return f.this.e(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return f.j(f.this.c(), collection);
        }

        public boolean equals(Object obj) {
            return f.k(this, obj);
        }

        public int hashCode() {
            int i2 = 0;
            for (int d2 = f.this.d() - 1; d2 >= 0; d2--) {
                Object b = f.this.b(d2, 0);
                i2 += b == null ? 0 : b.hashCode();
            }
            return i2;
        }

        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        public Iterator<K> iterator() {
            return new a(0);
        }

        public boolean remove(Object obj) {
            int e2 = f.this.e(obj);
            if (e2 < 0) {
                return false;
            }
            f.this.h(e2);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return f.o(f.this.c(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return f.p(f.this.c(), collection);
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            return f.this.q(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return f.this.r(tArr, 0);
        }
    }

    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: e  reason: collision with root package name */
        int f3273e;

        /* renamed from: f  reason: collision with root package name */
        int f3274f;

        /* renamed from: g  reason: collision with root package name */
        boolean f3275g = false;

        d() {
            this.f3273e = f.this.d() - 1;
            this.f3274f = -1;
        }

        public Map.Entry<K, V> b() {
            if (hasNext()) {
                this.f3274f++;
                this.f3275g = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.f3275g) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return c.c(entry.getKey(), f.this.b(this.f3274f, 0)) && c.c(entry.getValue(), f.this.b(this.f3274f, 1));
            }
        }

        public K getKey() {
            if (this.f3275g) {
                return f.this.b(this.f3274f, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f3275g) {
                return f.this.b(this.f3274f, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f3274f < this.f3273e;
        }

        public int hashCode() {
            if (this.f3275g) {
                int i2 = 0;
                Object b = f.this.b(this.f3274f, 0);
                Object b2 = f.this.b(this.f3274f, 1);
                int hashCode = b == null ? 0 : b.hashCode();
                if (b2 != null) {
                    i2 = b2.hashCode();
                }
                return hashCode ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public /* bridge */ /* synthetic */ Object next() {
            b();
            return this;
        }

        public void remove() {
            if (this.f3275g) {
                f.this.h(this.f3274f);
                this.f3274f--;
                this.f3273e--;
                this.f3275g = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f3275g) {
                return f.this.i(this.f3274f, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class e implements Collection<V> {
        e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            return f.this.f(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        public Iterator<V> iterator() {
            return new a(1);
        }

        public boolean remove(Object obj) {
            int f2 = f.this.f(obj);
            if (f2 < 0) {
                return false;
            }
            f.this.h(f2);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int d2 = f.this.d();
            int i2 = 0;
            boolean z = false;
            while (i2 < d2) {
                if (collection.contains(f.this.b(i2, 1))) {
                    f.this.h(i2);
                    i2--;
                    d2--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int d2 = f.this.d();
            int i2 = 0;
            boolean z = false;
            while (i2 < d2) {
                if (!collection.contains(f.this.b(i2, 1))) {
                    f.this.h(i2);
                    i2--;
                    d2--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            return f.this.q(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return f.this.r(tArr, 1);
        }
    }

    f() {
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract Object b(int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract Map<K, V> c();

    /* access modifiers changed from: protected */
    public abstract int d();

    /* access modifiers changed from: protected */
    public abstract int e(Object obj);

    /* access modifiers changed from: protected */
    public abstract int f(Object obj);

    /* access modifiers changed from: protected */
    public abstract void g(K k2, V v);

    /* access modifiers changed from: protected */
    public abstract void h(int i2);

    /* access modifiers changed from: protected */
    public abstract V i(int i2, V v);

    public Set<Map.Entry<K, V>> l() {
        if (this.a == null) {
            this.a = new b();
        }
        return this.a;
    }

    public Set<K> m() {
        if (this.b == null) {
            this.b = new c();
        }
        return this.b;
    }

    public Collection<V> n() {
        if (this.c == null) {
            this.c = new e();
        }
        return this.c;
    }

    public Object[] q(int i2) {
        int d2 = d();
        Object[] objArr = new Object[d2];
        for (int i3 = 0; i3 < d2; i3++) {
            objArr[i3] = b(i3, i2);
        }
        return objArr;
    }

    public <T> T[] r(T[] tArr, int i2) {
        int d2 = d();
        if (tArr.length < d2) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d2);
        }
        for (int i3 = 0; i3 < d2; i3++) {
            tArr[i3] = b(i3, i2);
        }
        if (tArr.length > d2) {
            tArr[d2] = null;
        }
        return tArr;
    }
}
