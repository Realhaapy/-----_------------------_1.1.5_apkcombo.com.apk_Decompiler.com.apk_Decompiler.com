package com.google.firebase.remoteconfig.internal;

import java.util.concurrent.Callable;

public final /* synthetic */ class a implements Callable {
    public final /* synthetic */ j a;
    public final /* synthetic */ k b;

    public /* synthetic */ a(j jVar, k kVar) {
        this.a = jVar;
        this.b = kVar;
    }

    public final Object call() {
        return this.a.h(this.b);
    }
}
