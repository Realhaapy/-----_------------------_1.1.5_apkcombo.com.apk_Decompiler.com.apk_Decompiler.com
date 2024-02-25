package f.e.a.c.d.d;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public abstract class y extends AbstractCollection implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    private static final Object[] f3914e = new Object[0];

    y() {
    }

    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: package-private */
    public int h(Object[] objArr, int i2) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public int i() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int j() {
        throw new UnsupportedOperationException();
    }

    public b0 k() {
        throw null;
    }

    /* renamed from: l */
    public abstract i iterator();

    /* access modifiers changed from: package-private */
    public abstract boolean m();

    /* access modifiers changed from: package-private */
    public Object[] n() {
        return null;
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f3914e);
    }

    public final Object[] toArray(Object[] objArr) {
        Objects.requireNonNull(objArr);
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] n2 = n();
            if (n2 != null) {
                return Arrays.copyOfRange(n2, j(), i(), objArr.getClass());
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (length > size) {
            objArr[size] = null;
        }
        h(objArr, 0);
        return objArr;
    }
}
