package f.e.a.c.d.d;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class b0 extends y implements List, RandomAccess {

    /* renamed from: f  reason: collision with root package name */
    private static final j f3894f = new z(b.f3891i, 0);

    b0() {
    }

    static b0 p(Object[] objArr) {
        return q(objArr, objArr.length);
    }

    static b0 q(Object[] objArr, int i2) {
        return i2 == 0 ? b.f3891i : new b(objArr, i2);
    }

    public static b0 r(Collection collection) {
        if (collection instanceof y) {
            b0 k2 = ((y) collection).k();
            if (!k2.m()) {
                return k2;
            }
            Object[] array = k2.toArray();
            return q(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        int i2 = 0;
        while (i2 < length) {
            if (array2[i2] != null) {
                i2++;
            } else {
                throw new NullPointerException("at index " + i2);
            }
        }
        return q(array2, length);
    }

    public static b0 s() {
        return b.f3891i;
    }

    @Deprecated
    public final void add(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i2 = 0;
                    while (i2 < size) {
                        if (s.a(get(i2), list.get(i2))) {
                            i2++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!s.a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int h(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i3] = get(i3);
        }
        return size;
    }

    public final int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = (i2 * 31) + get(i3).hashCode();
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (obj.equals(get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Deprecated
    public final b0 k() {
        return this;
    }

    public final i l() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: o */
    public b0 subList(int i2, int i3) {
        t.c(i2, i3, size());
        int i4 = i3 - i2;
        return i4 == size() ? this : i4 == 0 ? b.f3891i : new a0(this, i2, i4);
    }

    @Deprecated
    public final Object remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: t */
    public final j listIterator(int i2) {
        t.b(i2, size(), "index");
        return isEmpty() ? f3894f : new z(this, i2);
    }
}
