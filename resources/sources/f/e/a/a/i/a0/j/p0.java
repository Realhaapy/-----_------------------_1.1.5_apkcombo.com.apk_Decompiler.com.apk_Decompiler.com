package f.e.a.a.i.a0.j;

import f.e.a.a.i.w.b.b;
import f.e.a.a.i.w.b.d;

public final class p0 implements b<k0> {

    private static final class a {
        /* access modifiers changed from: private */
        public static final p0 a = new p0();
    }

    public static p0 a() {
        return a.a;
    }

    public static k0 c() {
        k0 d2 = l0.d();
        d.c(d2, "Cannot return null from a non-@Nullable @Provides method");
        return d2;
    }

    /* renamed from: b */
    public k0 get() {
        return c();
    }
}
