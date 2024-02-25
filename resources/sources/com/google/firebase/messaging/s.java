package com.google.firebase.messaging;

import f.e.a.c.g.j;

public final /* synthetic */ class s implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f2826e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f2827f;

    public /* synthetic */ s(FirebaseMessaging firebaseMessaging, j jVar) {
        this.f2826e = firebaseMessaging;
        this.f2827f = jVar;
    }

    public final void run() {
        this.f2826e.w(this.f2827f);
    }
}
