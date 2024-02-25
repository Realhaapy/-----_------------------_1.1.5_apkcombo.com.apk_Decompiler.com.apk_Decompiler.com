package com.android.billingclient.api;

import java.util.List;

public final /* synthetic */ class v implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ t f1326e;

    public /* synthetic */ v(t tVar) {
        this.f1326e = tVar;
    }

    public final void run() {
        this.f1326e.onSkuDetailsResponse(q0.f1316n, (List<SkuDetails>) null);
    }
}
