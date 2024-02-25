package f.e.a.a.i.a0.j;

import android.content.Context;
import f.e.a.a.i.w.b.b;
import l.a.a;

public final class u0 implements b<t0> {
    private final a<Context> a;
    private final a<String> b;
    private final a<Integer> c;

    public u0(a<Context> aVar, a<String> aVar2, a<Integer> aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public static u0 a(a<Context> aVar, a<String> aVar2, a<Integer> aVar3) {
        return new u0(aVar, aVar2, aVar3);
    }

    public static t0 c(Context context, String str, int i2) {
        return new t0(context, str, i2);
    }

    /* renamed from: b */
    public t0 get() {
        return c(this.a.get(), this.b.get(), this.c.get().intValue());
    }
}
