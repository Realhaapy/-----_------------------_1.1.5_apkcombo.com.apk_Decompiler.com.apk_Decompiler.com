package com.google.firebase.messaging;

import f.e.a.c.g.j;

public final /* synthetic */ class r implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f2822e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f2823f;

    public /* synthetic */ r(FirebaseMessaging firebaseMessaging, j jVar) {
        this.f2822e = firebaseMessaging;
        this.f2823f = jVar;
    }

    public final void run() {
        this.f2822e.y(this.f2823f);
    }
}
