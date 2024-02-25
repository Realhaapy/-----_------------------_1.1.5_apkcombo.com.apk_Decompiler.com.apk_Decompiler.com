package f.e.a.a.i.w.b;

public final class a<T> implements l.a.a<T>, f.e.a.a.i.w.a<T> {
    private static final Object c = new Object();
    private volatile l.a.a<T> a;
    private volatile Object b = c;

    private a(l.a.a<T> aVar) {
        this.a = aVar;
    }

    public static <P extends l.a.a<T>, T> f.e.a.a.i.w.a<T> a(P p2) {
        if (p2 instanceof f.e.a.a.i.w.a) {
            return (f.e.a.a.i.w.a) p2;
        }
        d.b(p2);
        return new a((l.a.a) p2);
    }

    public static <P extends l.a.a<T>, T> l.a.a<T> b(P p2) {
        d.b(p2);
        return p2 instanceof a ? p2 : new a(p2);
    }

    public static Object c(Object obj, Object obj2) {
        if (!(obj != c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t = this.b;
        T t2 = c;
        if (t == t2) {
            synchronized (this) {
                t = this.b;
                if (t == t2) {
                    t = this.a.get();
                    c(this.b, t);
                    this.b = t;
                    this.a = null;
                }
            }
        }
        return t;
    }
}
