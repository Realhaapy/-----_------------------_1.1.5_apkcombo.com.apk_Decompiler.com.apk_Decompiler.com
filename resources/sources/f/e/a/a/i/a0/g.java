package f.e.a.a.i.a0;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.t;
import f.e.a.a.i.w.b.b;
import f.e.a.a.i.w.b.d;
import l.a.a;

public final class g implements b<t> {
    private final a<f.e.a.a.i.c0.a> a;

    public g(a<f.e.a.a.i.c0.a> aVar) {
        this.a = aVar;
    }

    public static t a(f.e.a.a.i.c0.a aVar) {
        t a2 = f.a(aVar);
        d.c(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public static g b(a<f.e.a.a.i.c0.a> aVar) {
        return new g(aVar);
    }

    /* renamed from: c */
    public t get() {
        return a(this.a.get());
    }
}
