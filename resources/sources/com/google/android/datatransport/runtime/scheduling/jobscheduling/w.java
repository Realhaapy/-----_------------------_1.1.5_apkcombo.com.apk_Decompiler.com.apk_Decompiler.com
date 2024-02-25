package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import f.e.a.a.i.a0.j.j0;
import f.e.a.a.i.b0.b;
import f.e.a.a.i.p;
import java.util.concurrent.Executor;

public class w {
    private final Executor a;
    private final j0 b;
    private final y c;

    /* renamed from: d  reason: collision with root package name */
    private final b f2350d;

    w(Executor executor, j0 j0Var, y yVar, b bVar) {
        this.a = executor;
        this.b = j0Var;
        this.c = yVar;
        this.f2350d = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Object c() {
        for (p a2 : this.b.x()) {
            this.c.a(a2, 1);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void e() {
        this.f2350d.a(new m(this));
    }

    public void a() {
        this.a.execute(new n(this));
    }
}
