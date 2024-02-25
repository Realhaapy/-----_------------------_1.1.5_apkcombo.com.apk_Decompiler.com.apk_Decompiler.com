package com.google.firebase.messaging;

import android.content.Intent;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ n0 f2753e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Intent f2754f;

    public /* synthetic */ h(n0 n0Var, Intent intent) {
        this.f2753e = n0Var;
        this.f2754f = intent;
    }

    public final void run() {
        this.f2753e.b(this.f2754f);
    }
}
