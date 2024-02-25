package com.android.billingclient.api;

import java.util.concurrent.Callable;

public final /* synthetic */ class o1 implements Callable {
    public final /* synthetic */ e a;
    public final /* synthetic */ i b;
    public final /* synthetic */ j c;

    public /* synthetic */ o1(e eVar, i iVar, j jVar) {
        this.a = eVar;
        this.b = iVar;
        this.c = jVar;
    }

    public final Object call() {
        this.a.M(this.b, this.c);
        return null;
    }
}
