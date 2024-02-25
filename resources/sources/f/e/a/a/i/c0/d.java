package f.e.a.a.i.c0;

import f.e.a.a.i.w.b.b;

public final class d implements b<a> {

    private static final class a {
        /* access modifiers changed from: private */
        public static final d a = new d();
    }

    public static d a() {
        return a.a;
    }

    public static a c() {
        a b = b.b();
        f.e.a.a.i.w.b.d.c(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    /* renamed from: b */
    public a get() {
        return c();
    }
}
