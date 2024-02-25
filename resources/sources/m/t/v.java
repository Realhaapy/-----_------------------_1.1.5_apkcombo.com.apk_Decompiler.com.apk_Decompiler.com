package m.t;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import m.y.d.f;
import m.y.d.l;
import m.y.d.u.a;

public final class v implements Set, Serializable, a {

    /* renamed from: e  reason: collision with root package name */
    public static final v f5024e = new v();
    private static final long serialVersionUID = 3406603774387020532L;

    private v() {
    }

    private final Object readResolve() {
        return f5024e;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        h((Void) obj);
        throw null;
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return i((Void) obj);
    }

    public boolean containsAll(Collection collection) {
        l.d(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public boolean h(Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int hashCode() {
        return 0;
    }

    public boolean i(Void voidR) {
        l.d(voidR, "element");
        return false;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return s.f5021e;
    }

    public int j() {
        return 0;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return j();
    }

    public Object[] toArray() {
        return f.a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        l.d(tArr, "array");
        return f.b(this, tArr);
    }

    public String toString() {
        return "[]";
    }
}
