package m.t;

import java.util.Collection;
import java.util.Iterator;
import m.y.d.b;
import m.y.d.f;
import m.y.d.l;

final class a<T> implements Collection<T>, m.y.d.u.a {

    /* renamed from: e  reason: collision with root package name */
    private final T[] f5019e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f5020f;

    public a(T[] tArr, boolean z) {
        l.d(tArr, "values");
        this.f5019e = tArr;
        this.f5020f = z;
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return f.i(this.f5019e, obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        l.d(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int h() {
        return this.f5019e.length;
    }

    public boolean isEmpty() {
        return this.f5019e.length == 0;
    }

    public Iterator<T> iterator() {
        return b.a(this.f5019e);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return h();
    }

    public final Object[] toArray() {
        return i.a(this.f5019e, this.f5020f);
    }

    public <T> T[] toArray(T[] tArr) {
        l.d(tArr, "array");
        return f.b(this, tArr);
    }
}
