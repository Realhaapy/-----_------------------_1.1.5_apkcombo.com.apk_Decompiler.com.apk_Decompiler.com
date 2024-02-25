package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import f.e.a.a.i.a0.j.j0;
import f.e.a.a.i.w.b.b;
import java.util.concurrent.Executor;
import l.a.a;

public final class x implements b<w> {
    private final a<Executor> a;
    private final a<j0> b;
    private final a<y> c;

    /* renamed from: d  reason: collision with root package name */
    private final a<f.e.a.a.i.b0.b> f2351d;

    public x(a<Executor> aVar, a<j0> aVar2, a<y> aVar3, a<f.e.a.a.i.b0.b> aVar4) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f2351d = aVar4;
    }

    public static x a(a<Executor> aVar, a<j0> aVar2, a<y> aVar3, a<f.e.a.a.i.b0.b> aVar4) {
        return new x(aVar, aVar2, aVar3, aVar4);
    }

    public static w c(Executor executor, j0 j0Var, y yVar, f.e.a.a.i.b0.b bVar) {
        return new w(executor, j0Var, yVar, bVar);
    }

    /* renamed from: b */
    public w get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.f2351d.get());
    }
}
