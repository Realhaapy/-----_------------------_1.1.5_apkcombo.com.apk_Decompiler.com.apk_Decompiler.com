package f.e.c.a.z.a;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class d1 {
    private static final d1 c = new d1();
    private final i1 a = new k0();
    private final ConcurrentMap<Class<?>, h1<?>> b = new ConcurrentHashMap();

    private d1() {
    }

    public static d1 a() {
        return c;
    }

    public <T> void b(T t, g1 g1Var, q qVar) {
        e(t).d(t, g1Var, qVar);
    }

    public h1<?> c(Class<?> cls, h1<?> h1Var) {
        b0.b(cls, "messageType");
        b0.b(h1Var, "schema");
        return this.b.putIfAbsent(cls, h1Var);
    }

    public <T> h1<T> d(Class<T> cls) {
        b0.b(cls, "messageType");
        h1<T> h1Var = (h1) this.b.get(cls);
        if (h1Var != null) {
            return h1Var;
        }
        h1<T> a2 = this.a.a(cls);
        h1<?> c2 = c(cls, a2);
        return c2 != null ? c2 : a2;
    }

    public <T> h1<T> e(T t) {
        return d(t.getClass());
    }
}
