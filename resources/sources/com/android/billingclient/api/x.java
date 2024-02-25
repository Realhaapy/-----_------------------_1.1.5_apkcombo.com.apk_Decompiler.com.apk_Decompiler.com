package com.android.billingclient.api;

import java.util.concurrent.Callable;

public final /* synthetic */ class x implements Callable {
    public final /* synthetic */ e a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ x(e eVar, String str, String str2) {
        this.a = eVar;
        this.b = str;
        this.c = str2;
    }

    public final Object call() {
        return this.a.E(this.b, this.c);
    }
}
