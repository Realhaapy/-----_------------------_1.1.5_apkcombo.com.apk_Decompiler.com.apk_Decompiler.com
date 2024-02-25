package f.e.c.a.z.a;

import f.e.c.a.z.a.b0;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class c<E> extends AbstractList<E> implements b0.i<E> {

    /* renamed from: e  reason: collision with root package name */
    private boolean f4071e = true;

    c() {
    }

    public final void a() {
        this.f4071e = false;
    }

    public boolean add(E e2) {
        h();
        return super.add(e2);
    }

    public boolean addAll(int i2, Collection<? extends E> collection) {
        h();
        return super.addAll(i2, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        h();
        return super.addAll(collection);
    }

    public void clear() {
        h();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (!get(i2).equals(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public boolean g() {
        return this.f4071e;
    }

    /* access modifiers changed from: protected */
    public void h() {
        if (!this.f4071e) {
            throw new UnsupportedOperationException();
        }
    }

    public int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = (i2 * 31) + get(i3).hashCode();
        }
        return i2;
    }

    public boolean remove(Object obj) {
        h();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        h();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        h();
        return super.retainAll(collection);
    }
}
