package com.android.billingclient.api;

import android.os.Bundle;
import java.util.concurrent.Callable;

public final /* synthetic */ class n1 implements Callable {
    public final /* synthetic */ e a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ n1(e eVar, String str, Bundle bundle) {
        this.a = eVar;
        this.b = str;
        this.c = bundle;
    }

    public final Object call() {
        return this.a.F(this.b, this.c);
    }
}
