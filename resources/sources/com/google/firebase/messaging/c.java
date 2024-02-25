package com.google.firebase.messaging;

import android.content.Intent;
import f.e.a.c.g.j;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ k0 f2722e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Intent f2723f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ j f2724g;

    public /* synthetic */ c(k0 k0Var, Intent intent, j jVar) {
        this.f2722e = k0Var;
        this.f2723f = intent;
        this.f2724g = jVar;
    }

    public final void run() {
        this.f2722e.d(this.f2723f, this.f2724g);
    }
}
