package kotlinx.coroutines;

public final class e2 {
    public static final e2 a = new e2();
    private static final ThreadLocal<y0> b = new ThreadLocal<>();

    private e2() {
    }

    public final y0 a() {
        ThreadLocal<y0> threadLocal = b;
        y0 y0Var = threadLocal.get();
        if (y0Var != null) {
            return y0Var;
        }
        y0 a2 = b1.a();
        threadLocal.set(a2);
        return a2;
    }

    public final void b() {
        b.set((Object) null);
    }

    public final void c(y0 y0Var) {
        b.set(y0Var);
    }
}
