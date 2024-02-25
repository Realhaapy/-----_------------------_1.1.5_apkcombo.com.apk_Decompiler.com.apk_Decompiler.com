package com.android.billingclient.api;

import java.util.concurrent.Callable;

final class d0 implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ n b;
    final /* synthetic */ e c;

    d0(e eVar, String str, n nVar) {
        this.c = eVar;
        this.a = str;
        this.b = nVar;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        j0 H = e.H(this.c, this.a);
        this.b.onPurchaseHistoryResponse(H.a(), H.b());
        return null;
    }
}
