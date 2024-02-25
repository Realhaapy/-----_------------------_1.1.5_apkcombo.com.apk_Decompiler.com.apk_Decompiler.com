package com.google.firebase.remoteconfig;

import java.util.concurrent.Callable;

public final /* synthetic */ class a implements Callable {
    public final /* synthetic */ m a;
    public final /* synthetic */ s b;

    public /* synthetic */ a(m mVar, s sVar) {
        this.a = mVar;
        this.b = sVar;
    }

    public final Object call() {
        return this.a.q(this.b);
    }
}
