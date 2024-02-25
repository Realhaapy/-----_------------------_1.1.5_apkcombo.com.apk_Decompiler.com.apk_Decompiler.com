package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.android.billingclient.api.h;
import f.e.a.c.d.d.k;

final class b0 extends ResultReceiver {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k f1275e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    b0(e eVar, Handler handler, k kVar) {
        super(handler);
        this.f1275e = kVar;
    }

    public final void onReceiveResult(int i2, Bundle bundle) {
        h.a c = h.c();
        c.c(i2);
        c.b(k.i(bundle, "BillingClient"));
        this.f1275e.a(c.a());
    }
}
