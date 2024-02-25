package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

public final /* synthetic */ class d implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ d(Context context, Intent intent) {
        this.a = context;
        this.b = intent;
    }

    public final Object call() {
        return Integer.valueOf(a1.b().g(this.a, this.b));
    }
}
