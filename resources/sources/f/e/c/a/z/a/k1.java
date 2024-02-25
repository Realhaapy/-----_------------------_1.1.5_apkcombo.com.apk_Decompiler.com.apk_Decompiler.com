package f.e.c.a.z.a;

import f.e.c.a.z.a.v;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class k1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: e  reason: collision with root package name */
    private final int f4129e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public List<k1<K, V>.e> f4130f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public Map<K, V> f4131g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4132h;

    /* renamed from: i  reason: collision with root package name */
    private volatile k1<K, V>.g f4133i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public Map<K, V> f4134j;

    /* renamed from: k  reason: collision with root package name */
    private volatile k1<K, V>.defpackage.c f4135k;

    class a extends k1<FieldDescriptorType, Object> {
        a(int i2) {
            super(i2, (a) null);
        }

        public void p() {
            if (!o()) {
                for (int i2 = 0; i2 < k(); i2++) {
                    Map.Entry j2 = j(i2);
                    if (((v.b) j2.getKey()).e()) {
                        j2.setValue(Collections.unmodifiableList((List) j2.getValue()));
                    }
                }
                for (Map.Entry entry : m()) {
                    if (((v.b) entry.getKey()).e()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            k1.super.p();
        }
    }

    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: e  reason: collision with root package name */
        private int f4136e;

        /* renamed from: f  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f4137f;

        private b() {
            this.f4136e = k1.this.f4130f.size();
        }

        /* synthetic */ b(k1 k1Var, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.f4137f == null) {
                this.f4137f = k1.this.f4134j.entrySet().iterator();
            }
            return this.f4137f;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            Object obj;
            if (b().hasNext()) {
                obj = b().next();
            } else {
                List b = k1.this.f4130f;
                int i2 = this.f4136e - 1;
                this.f4136e = i2;
                obj = b.get(i2);
            }
            return (Map.Entry) obj;
        }

        public boolean hasNext() {
            int i2 = this.f4136e;
            return (i2 > 0 && i2 <= k1.this.f4130f.size()) || b().hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private class c extends k1<K, V>.g {
        private c() {
            super(k1.this, (a) null);
        }

        /* synthetic */ c(k1 k1Var, a aVar) {
            this();
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(k1.this, (a) null);
        }
    }

    private static class d {
        /* access modifiers changed from: private */
        public static final Iterator<Object> a = new a();
        private static final Iterable<Object> b = new b();

        class a implements Iterator<Object> {
            a() {
            }

            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        class b implements Iterable<Object> {
            b() {
            }

            public Iterator<Object> iterator() {
                return d.a;
            }
        }

        static <T> Iterable<T> b() {
            return b;
        }
    }

    private class e implements Map.Entry<K, V>, Comparable<k1<K, V>.e> {

        /* renamed from: e  reason: collision with root package name */
        private final K f4140e;

        /* renamed from: f  reason: collision with root package name */
        private V f4141f;

        e(K k2, V v) {
            this.f4140e = k2;
            this.f4141f = v;
        }

        e(k1 k1Var, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean c(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        /* renamed from: a */
        public int compareTo(k1<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        /* renamed from: d */
        public K getKey() {
            return this.f4140e;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return c(this.f4140e, entry.getKey()) && c(this.f4141f, entry.getValue());
        }

        public V getValue() {
            return this.f4141f;
        }

        public int hashCode() {
            K k2 = this.f4140e;
            int i2 = 0;
            int hashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f4141f;
            if (v != null) {
                i2 = v.hashCode();
            }
            return hashCode ^ i2;
        }

        public V setValue(V v) {
            k1.this.g();
            V v2 = this.f4141f;
            this.f4141f = v;
            return v2;
        }

        public String toString() {
            return this.f4140e + "=" + this.f4141f;
        }
    }

    private class f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: e  reason: collision with root package name */
        private int f4143e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f4144f;

        /* renamed from: g  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f4145g;

        private f() {
            this.f4143e = -1;
        }

        /* synthetic */ f(k1 k1Var, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.f4145g == null) {
                this.f4145g = k1.this.f4131g.entrySet().iterator();
            }
            return this.f4145g;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            this.f4144f = true;
            int i2 = this.f4143e + 1;
            this.f4143e = i2;
            return (Map.Entry) (i2 < k1.this.f4130f.size() ? k1.this.f4130f.get(this.f4143e) : b().next());
        }

        public boolean hasNext() {
            if (this.f4143e + 1 >= k1.this.f4130f.size()) {
                return !k1.this.f4131g.isEmpty() && b().hasNext();
            }
            return true;
        }

        public void remove() {
            if (this.f4144f) {
                this.f4144f = false;
                k1.this.g();
                if (this.f4143e < k1.this.f4130f.size()) {
                    k1 k1Var = k1.this;
                    int i2 = this.f4143e;
                    this.f4143e = i2 - 1;
                    Object unused = k1Var.s(i2);
                    return;
                }
                b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    private class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        /* synthetic */ g(k1 k1Var, a aVar) {
            this();
        }

        public void clear() {
            k1.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = k1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        /* renamed from: h */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            k1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(k1.this, (a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            k1.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return k1.this.size();
        }
    }

    private k1(int i2) {
        this.f4129e = i2;
        this.f4130f = Collections.emptyList();
        this.f4131g = Collections.emptyMap();
        this.f4134j = Collections.emptyMap();
    }

    /* synthetic */ k1(int i2, a aVar) {
        this(i2);
    }

    private int f(K k2) {
        int size = this.f4130f.size() - 1;
        if (size >= 0) {
            int compareTo = k2.compareTo(this.f4130f.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int compareTo2 = k2.compareTo(this.f4130f.get(i3).getKey());
            if (compareTo2 < 0) {
                size = i3 - 1;
            } else if (compareTo2 <= 0) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    /* access modifiers changed from: private */
    public void g() {
        if (this.f4132h) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        g();
        if (this.f4130f.isEmpty() && !(this.f4130f instanceof ArrayList)) {
            this.f4130f = new ArrayList(this.f4129e);
        }
    }

    private SortedMap<K, V> n() {
        g();
        if (this.f4131g.isEmpty() && !(this.f4131g instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f4131g = treeMap;
            this.f4134j = treeMap.descendingMap();
        }
        return (SortedMap) this.f4131g;
    }

    static <FieldDescriptorType extends v.b<FieldDescriptorType>> k1<FieldDescriptorType, Object> q(int i2) {
        return new a(i2);
    }

    /* access modifiers changed from: private */
    public V s(int i2) {
        g();
        V value = this.f4130f.remove(i2).getValue();
        if (!this.f4131g.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            this.f4130f.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public void clear() {
        g();
        if (!this.f4130f.isEmpty()) {
            this.f4130f.clear();
        }
        if (!this.f4131g.isEmpty()) {
            this.f4131g.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f4131g.containsKey(comparable);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f4133i == null) {
            this.f4133i = new g(this, (a) null);
        }
        return this.f4133i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return super.equals(obj);
        }
        k1 k1Var = (k1) obj;
        int size = size();
        if (size != k1Var.size()) {
            return false;
        }
        int k2 = k();
        if (k2 != k1Var.k()) {
            return entrySet().equals(k1Var.entrySet());
        }
        for (int i2 = 0; i2 < k2; i2++) {
            if (!j(i2).equals(k1Var.j(i2))) {
                return false;
            }
        }
        if (k2 != size) {
            return this.f4131g.equals(k1Var.f4131g);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f2 = f(comparable);
        return f2 >= 0 ? this.f4130f.get(f2).getValue() : this.f4131g.get(comparable);
    }

    /* access modifiers changed from: package-private */
    public Set<Map.Entry<K, V>> h() {
        if (this.f4135k == null) {
            this.f4135k = new c(this, (a) null);
        }
        return this.f4135k;
    }

    public int hashCode() {
        int k2 = k();
        int i2 = 0;
        for (int i3 = 0; i3 < k2; i3++) {
            i2 += this.f4130f.get(i3).hashCode();
        }
        return l() > 0 ? i2 + this.f4131g.hashCode() : i2;
    }

    public Map.Entry<K, V> j(int i2) {
        return this.f4130f.get(i2);
    }

    public int k() {
        return this.f4130f.size();
    }

    public int l() {
        return this.f4131g.size();
    }

    public Iterable<Map.Entry<K, V>> m() {
        return this.f4131g.isEmpty() ? d.b() : this.f4131g.entrySet();
    }

    public boolean o() {
        return this.f4132h;
    }

    public void p() {
        if (!this.f4132h) {
            this.f4131g = this.f4131g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f4131g);
            this.f4134j = this.f4134j.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f4134j);
            this.f4132h = true;
        }
    }

    /* renamed from: r */
    public V put(K k2, V v) {
        g();
        int f2 = f(k2);
        if (f2 >= 0) {
            return this.f4130f.get(f2).setValue(v);
        }
        i();
        int i2 = -(f2 + 1);
        if (i2 >= this.f4129e) {
            return n().put(k2, v);
        }
        int size = this.f4130f.size();
        int i3 = this.f4129e;
        if (size == i3) {
            e remove = this.f4130f.remove(i3 - 1);
            n().put(remove.getKey(), remove.getValue());
        }
        this.f4130f.add(i2, new e(k2, v));
        return null;
    }

    public V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f2 = f(comparable);
        if (f2 >= 0) {
            return s(f2);
        }
        if (this.f4131g.isEmpty()) {
            return null;
        }
        return this.f4131g.remove(comparable);
    }

    public int size() {
        return this.f4130f.size() + this.f4131g.size();
    }
}
