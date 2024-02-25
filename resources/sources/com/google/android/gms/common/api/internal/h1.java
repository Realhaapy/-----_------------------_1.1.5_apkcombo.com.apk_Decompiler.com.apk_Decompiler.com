package com.google.android.gms.common.api.internal;

final class h1 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f2434e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f2435f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ i1 f2436g;

    h1(i1 i1Var, LifecycleCallback lifecycleCallback, String str) {
        this.f2436g = i1Var;
        this.f2434e = lifecycleCallback;
        this.f2435f = str;
    }

    public final void run() {
        i1 i1Var = this.f2436g;
        if (i1Var.f2447f > 0) {
            this.f2434e.f(i1Var.f2448g != null ? i1Var.f2448g.getBundle(this.f2435f) : null);
        }
        if (this.f2436g.f2447f >= 2) {
            this.f2434e.j();
        }
        if (this.f2436g.f2447f >= 3) {
            this.f2434e.h();
        }
        if (this.f2436g.f2447f >= 4) {
            this.f2434e.k();
        }
        if (this.f2436g.f2447f >= 5) {
            this.f2434e.g();
        }
    }
}
