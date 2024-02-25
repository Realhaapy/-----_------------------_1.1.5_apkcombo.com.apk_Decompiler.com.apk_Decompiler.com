package com.android.billingclient.api;

import f.e.a.c.d.d.k;
import java.util.concurrent.Future;

public final /* synthetic */ class z implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Future f1331e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Runnable f1332f;

    public /* synthetic */ z(Future future, Runnable runnable) {
        this.f1331e = future;
        this.f1332f = runnable;
    }

    public final void run() {
        Future future = this.f1331e;
        Runnable runnable = this.f1332f;
        if (!future.isDone() && !future.isCancelled()) {
            future.cancel(true);
            k.m("BillingClient", "Async task is taking too long, cancel it!");
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
