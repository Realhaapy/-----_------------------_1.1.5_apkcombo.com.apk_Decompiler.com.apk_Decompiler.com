package com.facebook.internal;

import java.util.concurrent.Callable;

public final /* synthetic */ class i implements Callable {
    public final /* synthetic */ h0 a;
    public final /* synthetic */ Callable b;

    public /* synthetic */ i(h0 h0Var, Callable callable) {
        this.a = h0Var;
        this.b = callable;
    }

    public final Object call() {
        return h0.a(this.a, this.b);
    }
}
