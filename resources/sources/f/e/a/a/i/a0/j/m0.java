package f.e.a.a.i.a0.j;

import f.e.a.a.i.w.b.b;
import f.e.a.a.i.w.b.d;

public final class m0 implements b<String> {

    private static final class a {
        /* access modifiers changed from: private */
        public static final m0 a = new m0();
    }

    public static m0 a() {
        return a.a;
    }

    public static String b() {
        String a2 = l0.a();
        d.c(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    /* renamed from: c */
    public String get() {
        return b();
    }
}
