package com.android.billingclient.api;

import f.e.a.c.d.d.b0;
import java.util.concurrent.Callable;

final class c0 implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ o b;
    final /* synthetic */ e c;

    c0(e eVar, String str, o oVar) {
        this.c = eVar;
        this.a = str;
        this.b = oVar;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        u0 J = e.J(this.c, this.a);
        if (J.b() != null) {
            this.b.onQueryPurchasesResponse(J.a(), J.b());
            return null;
        }
        this.b.onQueryPurchasesResponse(J.a(), b0.s());
        return null;
    }
}
