package f.e.a.a.i.a0.j;

import android.content.Context;
import f.e.a.a.i.w.b.b;
import f.e.a.a.i.w.b.d;
import l.a.a;

public final class n0 implements b<String> {
    private final a<Context> a;

    public n0(a<Context> aVar) {
        this.a = aVar;
    }

    public static n0 a(a<Context> aVar) {
        return new n0(aVar);
    }

    public static String c(Context context) {
        String b = l0.b(context);
        d.c(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    /* renamed from: b */
    public String get() {
        return c(this.a.get());
    }
}
