package m;

import java.io.Serializable;

public final class d<T> implements g<T>, Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final T f4991e;

    public d(T t) {
        this.f4991e = t;
    }

    public T getValue() {
        return this.f4991e;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
