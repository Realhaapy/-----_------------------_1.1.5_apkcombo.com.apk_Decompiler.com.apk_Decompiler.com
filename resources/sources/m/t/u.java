package m.t;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import m.y.d.l;
import m.y.d.u.a;

final class u implements Map, Serializable, a {

    /* renamed from: e  reason: collision with root package name */
    public static final u f5023e = new u();
    private static final long serialVersionUID = 8246714829545688274L;

    private u() {
    }

    private final Object readResolve() {
        return f5023e;
    }

    public boolean a(Void voidR) {
        l.d(voidR, "value");
        return false;
    }

    /* renamed from: b */
    public Void get(Object obj) {
        return null;
    }

    public Set<Map.Entry> c() {
        return v.f5024e;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return a((Void) obj);
    }

    public Set<Object> d() {
        return v.f5024e;
    }

    public int e() {
        return 0;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return c();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public Collection f() {
        return t.f5022e;
    }

    public Void g(Object obj, Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Void h(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return d();
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        g(obj, (Void) obj2);
        throw null;
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object remove(Object obj) {
        h(obj);
        throw null;
    }

    public final /* bridge */ int size() {
        return e();
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return f();
    }
}
