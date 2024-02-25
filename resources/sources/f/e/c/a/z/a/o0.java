package f.e.c.a.z.a;

import f.e.c.a.z.a.l0;
import java.util.Map;

class o0 implements n0 {
    o0() {
    }

    private static <K, V> int i(int i2, Object obj, Object obj2) {
        m0 m0Var = (m0) obj;
        l0 l0Var = (l0) obj2;
        int i3 = 0;
        if (m0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : m0Var.entrySet()) {
            i3 += l0Var.a(i2, entry.getKey(), entry.getValue());
        }
        return i3;
    }

    private static <K, V> m0<K, V> j(Object obj, Object obj2) {
        m0<K, V> m0Var = (m0) obj;
        m0 m0Var2 = (m0) obj2;
        if (!m0Var2.isEmpty()) {
            if (!m0Var.k()) {
                m0Var = m0Var.n();
            }
            m0Var.m(m0Var2);
        }
        return m0Var;
    }

    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    public Object b(Object obj) {
        return m0.f().n();
    }

    public int c(int i2, Object obj, Object obj2) {
        return i(i2, obj, obj2);
    }

    public boolean d(Object obj) {
        return !((m0) obj).k();
    }

    public Object e(Object obj) {
        ((m0) obj).l();
        return obj;
    }

    public l0.a<?, ?> f(Object obj) {
        return ((l0) obj).c();
    }

    public Map<?, ?> g(Object obj) {
        return (m0) obj;
    }

    public Map<?, ?> h(Object obj) {
        return (m0) obj;
    }
}
