package com.android.billingclient.api;

import java.util.concurrent.Callable;

public final /* synthetic */ class s1 implements Callable {
    public final /* synthetic */ e a;
    public final /* synthetic */ b b;
    public final /* synthetic */ c c;

    public /* synthetic */ s1(e eVar, b bVar, c cVar) {
        this.a = eVar;
        this.b = bVar;
        this.c = cVar;
    }

    public final Object call() {
        this.a.L(this.b, this.c);
        return null;
    }
}
