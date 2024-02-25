package m.y.d;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class a<T> implements Iterator<T>, m.y.d.u.a {

    /* renamed from: e  reason: collision with root package name */
    private final T[] f5050e;

    /* renamed from: f  reason: collision with root package name */
    private int f5051f;

    public a(T[] tArr) {
        l.d(tArr, "array");
        this.f5050e = tArr;
    }

    public boolean hasNext() {
        return this.f5051f < this.f5050e.length;
    }

    public T next() {
        try {
            T[] tArr = this.f5050e;
            int i2 = this.f5051f;
            this.f5051f = i2 + 1;
            return tArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f5051f--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
