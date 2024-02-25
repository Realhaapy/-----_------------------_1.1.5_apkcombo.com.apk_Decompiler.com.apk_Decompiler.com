package com.android.billingclient.api;

public final /* synthetic */ class p1 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ j f1304e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ i f1305f;

    public /* synthetic */ p1(j jVar, i iVar) {
        this.f1304e = jVar;
        this.f1305f = iVar;
    }

    public final void run() {
        this.f1304e.onConsumeResponse(q0.f1316n, this.f1305f.a());
    }
}
