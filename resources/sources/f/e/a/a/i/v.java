package f.e.a.a.i;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.u;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.w;
import f.e.a.a.i.a0.e;
import f.e.a.a.i.w.b.b;
import l.a.a;

public final class v implements b<t> {
    private final a<f.e.a.a.i.c0.a> a;
    private final a<f.e.a.a.i.c0.a> b;
    private final a<e> c;

    /* renamed from: d  reason: collision with root package name */
    private final a<u> f3817d;

    /* renamed from: e  reason: collision with root package name */
    private final a<w> f3818e;

    public v(a<f.e.a.a.i.c0.a> aVar, a<f.e.a.a.i.c0.a> aVar2, a<e> aVar3, a<u> aVar4, a<w> aVar5) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f3817d = aVar4;
        this.f3818e = aVar5;
    }

    public static v a(a<f.e.a.a.i.c0.a> aVar, a<f.e.a.a.i.c0.a> aVar2, a<e> aVar3, a<u> aVar4, a<w> aVar5) {
        return new v(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static t c(f.e.a.a.i.c0.a aVar, f.e.a.a.i.c0.a aVar2, e eVar, u uVar, w wVar) {
        return new t(aVar, aVar2, eVar, uVar, wVar);
    }

    /* renamed from: b */
    public t get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.f3817d.get(), this.f3818e.get());
    }
}
