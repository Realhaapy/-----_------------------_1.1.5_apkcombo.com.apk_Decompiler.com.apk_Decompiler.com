package com.google.firebase.messaging;

import f.e.a.c.g.j;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f2812e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f2813f;

    public /* synthetic */ n(FirebaseMessaging firebaseMessaging, j jVar) {
        this.f2812e = firebaseMessaging;
        this.f2813f = jVar;
    }

    public final void run() {
        this.f2812e.u(this.f2813f);
    }
}
