package com.google.firebase.messaging;

import android.content.Context;
import f.e.a.c.g.j;

public final /* synthetic */ class y implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Context f2849e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f2850f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ j f2851g;

    public /* synthetic */ y(Context context, boolean z, j jVar) {
        this.f2849e = context;
        this.f2850f = z;
        this.f2851g = jVar;
    }

    public final void run() {
        u0.c(this.f2849e, this.f2850f, this.f2851g);
    }
}
