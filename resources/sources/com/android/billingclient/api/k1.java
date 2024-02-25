package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;

final class k1 {
    private final Context a;
    /* access modifiers changed from: private */
    public final j1 b;

    k1(Context context, p pVar, f1 f1Var) {
        this.a = context;
        this.b = new j1(this, pVar, f1Var, (i1) null);
    }

    k1(Context context, t0 t0Var) {
        this.a = context;
        this.b = new j1(this, (t0) null, (i1) null);
    }

    /* access modifiers changed from: package-private */
    public final t0 b() {
        t0 unused = this.b.b;
        return null;
    }

    /* access modifiers changed from: package-private */
    public final p c() {
        return this.b.a;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        this.b.d(this.a);
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        intentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.b.c(this.a, intentFilter);
    }
}
