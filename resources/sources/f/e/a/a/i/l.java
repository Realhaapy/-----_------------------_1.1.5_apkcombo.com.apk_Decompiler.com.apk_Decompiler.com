package f.e.a.a.i;

import f.e.a.a.i.w.b.b;
import f.e.a.a.i.w.b.d;
import java.util.concurrent.Executor;

public final class l implements b<Executor> {

    private static final class a {
        /* access modifiers changed from: private */
        public static final l a = new l();
    }

    public static l a() {
        return a.a;
    }

    public static Executor b() {
        Executor a2 = k.a();
        d.c(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    /* renamed from: c */
    public Executor get() {
        return b();
    }
}
