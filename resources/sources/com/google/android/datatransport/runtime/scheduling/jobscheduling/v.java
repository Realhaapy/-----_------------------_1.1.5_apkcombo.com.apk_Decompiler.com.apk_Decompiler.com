package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.e;
import f.e.a.a.i.a0.j.i0;
import f.e.a.a.i.a0.j.j0;
import f.e.a.a.i.w.b.b;
import java.util.concurrent.Executor;
import l.a.a;

public final class v implements b<u> {
    private final a<Context> a;
    private final a<e> b;
    private final a<j0> c;

    /* renamed from: d  reason: collision with root package name */
    private final a<y> f2344d;

    /* renamed from: e  reason: collision with root package name */
    private final a<Executor> f2345e;

    /* renamed from: f  reason: collision with root package name */
    private final a<f.e.a.a.i.b0.b> f2346f;

    /* renamed from: g  reason: collision with root package name */
    private final a<f.e.a.a.i.c0.a> f2347g;

    /* renamed from: h  reason: collision with root package name */
    private final a<f.e.a.a.i.c0.a> f2348h;

    /* renamed from: i  reason: collision with root package name */
    private final a<i0> f2349i;

    public v(a<Context> aVar, a<e> aVar2, a<j0> aVar3, a<y> aVar4, a<Executor> aVar5, a<f.e.a.a.i.b0.b> aVar6, a<f.e.a.a.i.c0.a> aVar7, a<f.e.a.a.i.c0.a> aVar8, a<i0> aVar9) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f2344d = aVar4;
        this.f2345e = aVar5;
        this.f2346f = aVar6;
        this.f2347g = aVar7;
        this.f2348h = aVar8;
        this.f2349i = aVar9;
    }

    public static v a(a<Context> aVar, a<e> aVar2, a<j0> aVar3, a<y> aVar4, a<Executor> aVar5, a<f.e.a.a.i.b0.b> aVar6, a<f.e.a.a.i.c0.a> aVar7, a<f.e.a.a.i.c0.a> aVar8, a<i0> aVar9) {
        return new v(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static u c(Context context, e eVar, j0 j0Var, y yVar, Executor executor, f.e.a.a.i.b0.b bVar, f.e.a.a.i.c0.a aVar, f.e.a.a.i.c0.a aVar2, i0 i0Var) {
        return new u(context, eVar, j0Var, yVar, executor, bVar, aVar, aVar2, i0Var);
    }

    /* renamed from: b */
    public u get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.f2344d.get(), this.f2345e.get(), this.f2346f.get(), this.f2347g.get(), this.f2348h.get(), this.f2349i.get());
    }
}
