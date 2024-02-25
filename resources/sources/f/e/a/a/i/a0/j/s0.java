package f.e.a.a.i.a0.j;

import f.e.a.a.i.w.b.b;
import l.a.a;

public final class s0 implements b<r0> {
    private final a<f.e.a.a.i.c0.a> a;
    private final a<f.e.a.a.i.c0.a> b;
    private final a<k0> c;

    /* renamed from: d  reason: collision with root package name */
    private final a<t0> f3774d;

    /* renamed from: e  reason: collision with root package name */
    private final a<String> f3775e;

    public s0(a<f.e.a.a.i.c0.a> aVar, a<f.e.a.a.i.c0.a> aVar2, a<k0> aVar3, a<t0> aVar4, a<String> aVar5) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f3774d = aVar4;
        this.f3775e = aVar5;
    }

    public static s0 a(a<f.e.a.a.i.c0.a> aVar, a<f.e.a.a.i.c0.a> aVar2, a<k0> aVar3, a<t0> aVar4, a<String> aVar5) {
        return new s0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static r0 c(f.e.a.a.i.c0.a aVar, f.e.a.a.i.c0.a aVar2, Object obj, Object obj2, f.e.a.a.i.w.a<String> aVar3) {
        return new r0(aVar, aVar2, (k0) obj, (t0) obj2, aVar3);
    }

    /* renamed from: b */
    public r0 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.f3774d.get(), f.e.a.a.i.w.b.a.a(this.f3775e));
    }
}
