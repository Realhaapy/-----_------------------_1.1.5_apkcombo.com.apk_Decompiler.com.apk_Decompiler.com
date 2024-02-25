package com.google.android.gms.common.api.internal;

final class j1 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f2450e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f2451f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ k1 f2452g;

    j1(k1 k1Var, LifecycleCallback lifecycleCallback, String str) {
        this.f2452g = k1Var;
        this.f2450e = lifecycleCallback;
        this.f2451f = str;
    }

    public final void run() {
        k1 k1Var = this.f2452g;
        if (k1Var.f2457f > 0) {
            this.f2450e.f(k1Var.f2458g != null ? k1Var.f2458g.getBundle(this.f2451f) : null);
        }
        if (this.f2452g.f2457f >= 2) {
            this.f2450e.j();
        }
        if (this.f2452g.f2457f >= 3) {
            this.f2450e.h();
        }
        if (this.f2452g.f2457f >= 4) {
            this.f2450e.k();
        }
        if (this.f2452g.f2457f >= 5) {
            this.f2450e.g();
        }
    }
}
