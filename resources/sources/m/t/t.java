package m.t;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import m.y.d.f;
import m.y.d.l;
import m.y.d.u.a;

public final class t implements List, Serializable, RandomAccess, a {

    /* renamed from: e  reason: collision with root package name */
    public static final t f5022e = new t();
    private static final long serialVersionUID = -7390468764508069838L;

    private t() {
    }

    private final Object readResolve() {
        return f5022e;
    }

    public /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        h(i2, (Void) obj);
        throw null;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        i((Void) obj);
        throw null;
    }

    public boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
        return j((Void) obj);
    }

    public boolean containsAll(Collection collection) {
        l.d(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public /* bridge */ /* synthetic */ Object get(int i2) {
        k(i2);
        throw null;
    }

    public void h(int i2, Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int hashCode() {
        return 1;
    }

    public boolean i(Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return m((Void) obj);
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return s.f5021e;
    }

    public boolean j(Void voidR) {
        l.d(voidR, "element");
        return false;
    }

    public Void k(int i2) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i2 + '.');
    }

    public int l() {
        return 0;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return n((Void) obj);
    }

    public ListIterator listIterator() {
        return s.f5021e;
    }

    public ListIterator listIterator(int i2) {
        if (i2 == 0) {
            return s.f5021e;
        }
        throw new IndexOutOfBoundsException(l.j("Index: ", Integer.valueOf(i2)));
    }

    public int m(Void voidR) {
        l.d(voidR, "element");
        return -1;
    }

    public int n(Void voidR) {
        l.d(voidR, "element");
        return -1;
    }

    public Void o(int i2, Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        o(i2, (Void) obj);
        throw null;
    }

    public final /* bridge */ int size() {
        return l();
    }

    public List subList(int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3);
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
