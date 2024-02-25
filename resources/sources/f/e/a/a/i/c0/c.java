package f.e.a.a.i.c0;

import f.e.a.a.i.w.b.b;
import f.e.a.a.i.w.b.d;

public final class c implements b<a> {

    private static final class a {
        /* access modifiers changed from: private */
        public static final c a = new c();
    }

    public static c a() {
        return a.a;
    }

    public static a b() {
        a a2 = b.a();
        d.c(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    /* renamed from: c */
    public a get() {
        return b();
    }
}
