package f.e.c.a.z.a;

import java.util.Iterator;
import java.util.Map;

public class e0 extends f0 {

    /* renamed from: e  reason: collision with root package name */
    private final s0 f4090e;

    static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: e  reason: collision with root package name */
        private Map.Entry<K, e0> f4091e;

        private b(Map.Entry<K, e0> entry) {
            this.f4091e = entry;
        }

        public e0 a() {
            return this.f4091e.getValue();
        }

        public K getKey() {
            return this.f4091e.getKey();
        }

        public Object getValue() {
            e0 value = this.f4091e.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        public Object setValue(Object obj) {
            if (obj instanceof s0) {
                return this.f4091e.getValue().d((s0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: e  reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f4092e;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f4092e = it;
        }

        /* renamed from: b */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f4092e.next();
            return next.getValue() instanceof e0 ? new b(next) : next;
        }

        public boolean hasNext() {
            return this.f4092e.hasNext();
        }

        public void remove() {
            this.f4092e.remove();
        }
    }

    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public s0 f() {
        return c(this.f4090e);
    }

    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
