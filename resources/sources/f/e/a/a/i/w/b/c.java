package f.e.a.a.i.w.b;

import f.e.a.a.i.w.a;

public final class c<T> implements b<T>, a<T> {
    private final T a;

    private c(T t) {
        this.a = t;
    }

    public static <T> b<T> a(T t) {
        d.c(t, "instance cannot be null");
        return new c(t);
    }

    public T get() {
        return this.a;
    }
}
