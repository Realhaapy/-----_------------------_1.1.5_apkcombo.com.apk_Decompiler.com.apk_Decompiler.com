package e.b.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: e  reason: collision with root package name */
    c<K, V> f3198e;

    /* renamed from: f  reason: collision with root package name */
    private c<K, V> f3199f;

    /* renamed from: g  reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f3200g = new WeakHashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private int f3201h = 0;

    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f3205h;
        }

        /* access modifiers changed from: package-private */
        public c<K, V> d(c<K, V> cVar) {
            return cVar.f3204g;
        }
    }

    /* renamed from: e.b.a.b.b$b  reason: collision with other inner class name */
    private static class C0064b<K, V> extends e<K, V> {
        C0064b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f3204g;
        }

        /* access modifiers changed from: package-private */
        public c<K, V> d(c<K, V> cVar) {
            return cVar.f3205h;
        }
    }

    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: e  reason: collision with root package name */
        final K f3202e;

        /* renamed from: f  reason: collision with root package name */
        final V f3203f;

        /* renamed from: g  reason: collision with root package name */
        c<K, V> f3204g;

        /* renamed from: h  reason: collision with root package name */
        c<K, V> f3205h;

        c(K k2, V v) {
            this.f3202e = k2;
            this.f3203f = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f3202e.equals(cVar.f3202e) && this.f3203f.equals(cVar.f3203f);
        }

        public K getKey() {
            return this.f3202e;
        }

        public V getValue() {
            return this.f3203f;
        }

        public int hashCode() {
            return this.f3202e.hashCode() ^ this.f3203f.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f3202e + "=" + this.f3203f;
        }
    }

    private class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: e  reason: collision with root package name */
        private c<K, V> f3206e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f3207f = true;

        d() {
        }

        public void b(c<K, V> cVar) {
            c<K, V> cVar2 = this.f3206e;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f3205h;
                this.f3206e = cVar3;
                this.f3207f = cVar3 == null;
            }
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f3207f) {
                this.f3207f = false;
                cVar = b.this.f3198e;
            } else {
                c<K, V> cVar2 = this.f3206e;
                cVar = cVar2 != null ? cVar2.f3204g : null;
            }
            this.f3206e = cVar;
            return this.f3206e;
        }

        public boolean hasNext() {
            if (this.f3207f) {
                return b.this.f3198e != null;
            }
            c<K, V> cVar = this.f3206e;
            return (cVar == null || cVar.f3204g == null) ? false : true;
        }
    }

    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: e  reason: collision with root package name */
        c<K, V> f3209e;

        /* renamed from: f  reason: collision with root package name */
        c<K, V> f3210f;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f3209e = cVar2;
            this.f3210f = cVar;
        }

        private c<K, V> f() {
            c<K, V> cVar = this.f3210f;
            c<K, V> cVar2 = this.f3209e;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        public void b(c<K, V> cVar) {
            if (this.f3209e == cVar && cVar == this.f3210f) {
                this.f3210f = null;
                this.f3209e = null;
            }
            c<K, V> cVar2 = this.f3209e;
            if (cVar2 == cVar) {
                this.f3209e = c(cVar2);
            }
            if (this.f3210f == cVar) {
                this.f3210f = f();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract c<K, V> c(c<K, V> cVar);

        /* access modifiers changed from: package-private */
        public abstract c<K, V> d(c<K, V> cVar);

        /* renamed from: e */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f3210f;
            this.f3210f = f();
            return cVar;
        }

        public boolean hasNext() {
            return this.f3210f != null;
        }
    }

    interface f<K, V> {
        void b(c<K, V> cVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public Iterator<Map.Entry<K, V>> h() {
        C0064b bVar = new C0064b(this.f3199f, this.f3198e);
        this.f3200g.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((Map.Entry) it.next()).hashCode();
        }
        return i2;
    }

    public Map.Entry<K, V> i() {
        return this.f3198e;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f3198e, this.f3199f);
        this.f3200g.put(aVar, Boolean.FALSE);
        return aVar;
    }

    /* access modifiers changed from: protected */
    public c<K, V> j(K k2) {
        c<K, V> cVar = this.f3198e;
        while (cVar != null && !cVar.f3202e.equals(k2)) {
            cVar = cVar.f3204g;
        }
        return cVar;
    }

    public b<K, V>.d k() {
        b<K, V>.d dVar = new d();
        this.f3200g.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> l() {
        return this.f3199f;
    }

    /* access modifiers changed from: protected */
    public c<K, V> m(K k2, V v) {
        c<K, V> cVar = new c<>(k2, v);
        this.f3201h++;
        c<K, V> cVar2 = this.f3199f;
        if (cVar2 == null) {
            this.f3198e = cVar;
        } else {
            cVar2.f3204g = cVar;
            cVar.f3205h = cVar2;
        }
        this.f3199f = cVar;
        return cVar;
    }

    public V n(K k2, V v) {
        c j2 = j(k2);
        if (j2 != null) {
            return j2.f3203f;
        }
        m(k2, v);
        return null;
    }

    public V o(K k2) {
        c j2 = j(k2);
        if (j2 == null) {
            return null;
        }
        this.f3201h--;
        if (!this.f3200g.isEmpty()) {
            for (f<K, V> b : this.f3200g.keySet()) {
                b.b(j2);
            }
        }
        c<K, V> cVar = j2.f3205h;
        c<K, V> cVar2 = j2.f3204g;
        if (cVar != null) {
            cVar.f3204g = cVar2;
        } else {
            this.f3198e = cVar2;
        }
        c<K, V> cVar3 = j2.f3204g;
        if (cVar3 != null) {
            cVar3.f3205h = cVar;
        } else {
            this.f3199f = cVar;
        }
        j2.f3204g = null;
        j2.f3205h = null;
        return j2.f3203f;
    }

    public int size() {
        return this.f3201h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
