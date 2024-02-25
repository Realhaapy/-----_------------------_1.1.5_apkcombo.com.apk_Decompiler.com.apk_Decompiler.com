package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.a;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.n;
import e.e.b;

public final class r extends d1 {

    /* renamed from: j  reason: collision with root package name */
    private final b<b<?>> f2468j = new b<>();

    /* renamed from: k  reason: collision with root package name */
    private final e f2469k;

    r(g gVar, e eVar, d dVar) {
        super(gVar, dVar);
        this.f2469k = eVar;
        this.f2398e.a("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, e eVar, b<?> bVar) {
        g c = LifecycleCallback.c(activity);
        r rVar = (r) c.b("ConnectionlessLifecycleHelper", r.class);
        if (rVar == null) {
            rVar = new r(c, eVar, d.k());
        }
        n.i(bVar, "ApiKey cannot be null");
        rVar.f2468j.add(bVar);
        eVar.c(rVar);
    }

    private final void v() {
        if (!this.f2468j.isEmpty()) {
            this.f2469k.c(this);
        }
    }

    public final void h() {
        super.h();
        v();
    }

    public final void j() {
        super.j();
        v();
    }

    public final void k() {
        super.k();
        this.f2469k.d(this);
    }

    /* access modifiers changed from: protected */
    public final void m(a aVar, int i2) {
        this.f2469k.F(aVar, i2);
    }

    /* access modifiers changed from: protected */
    public final void n() {
        this.f2469k.a();
    }

    /* access modifiers changed from: package-private */
    public final b<b<?>> t() {
        return this.f2468j;
    }
}
