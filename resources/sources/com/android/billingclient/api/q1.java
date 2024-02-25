package com.android.billingclient.api;

import java.util.List;

public final /* synthetic */ class q1 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ n f1322e;

    public /* synthetic */ q1(n nVar) {
        this.f1322e = nVar;
    }

    public final void run() {
        this.f1322e.onPurchaseHistoryResponse(q0.f1316n, (List<PurchaseHistoryRecord>) null);
    }
}
