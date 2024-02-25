package f.e.a.a.i.a0;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.t;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.y;
import f.e.a.a.i.a0.j.j0;
import f.e.a.a.i.w.b.b;
import f.e.a.a.i.w.b.d;
import l.a.a;

public final class i implements b<y> {
    private final a<Context> a;
    private final a<j0> b;
    private final a<t> c;

    /* renamed from: d  reason: collision with root package name */
    private final a<f.e.a.a.i.c0.a> f3761d;

    public i(a<Context> aVar, a<j0> aVar2, a<t> aVar3, a<f.e.a.a.i.c0.a> aVar4) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f3761d = aVar4;
    }

    public static i a(a<Context> aVar, a<j0> aVar2, a<t> aVar3, a<f.e.a.a.i.c0.a> aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static y c(Context context, j0 j0Var, t tVar, f.e.a.a.i.c0.a aVar) {
        y a2 = h.a(context, j0Var, tVar, aVar);
        d.c(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    /* renamed from: b */
    public y get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.f3761d.get());
    }
}
