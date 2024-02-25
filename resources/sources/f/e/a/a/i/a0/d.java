package f.e.a.a.i.a0;

import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.y;
import f.e.a.a.i.a0.j.j0;
import f.e.a.a.i.w.b.b;
import java.util.concurrent.Executor;
import l.a.a;

public final class d implements b<c> {
    private final a<Executor> a;
    private final a<e> b;
    private final a<y> c;

    /* renamed from: d  reason: collision with root package name */
    private final a<j0> f3759d;

    /* renamed from: e  reason: collision with root package name */
    private final a<f.e.a.a.i.b0.b> f3760e;

    public d(a<Executor> aVar, a<e> aVar2, a<y> aVar3, a<j0> aVar4, a<f.e.a.a.i.b0.b> aVar5) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f3759d = aVar4;
        this.f3760e = aVar5;
    }

    public static d a(a<Executor> aVar, a<e> aVar2, a<y> aVar3, a<j0> aVar4, a<f.e.a.a.i.b0.b> aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, e eVar, y yVar, j0 j0Var, f.e.a.a.i.b0.b bVar) {
        return new c(executor, eVar, yVar, j0Var, bVar);
    }

    /* renamed from: b */
    public c get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.f3759d.get(), this.f3760e.get());
    }
}
