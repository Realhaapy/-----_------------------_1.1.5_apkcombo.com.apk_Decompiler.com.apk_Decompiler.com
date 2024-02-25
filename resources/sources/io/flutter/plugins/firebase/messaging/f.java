package io.flutter.plugins.firebase.messaging;

import f.e.a.c.g.j;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseMessagingPlugin f4751e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f4752f;

    public /* synthetic */ f(FlutterFirebaseMessagingPlugin flutterFirebaseMessagingPlugin, j jVar) {
        this.f4751e = flutterFirebaseMessagingPlugin;
        this.f4752f = jVar;
    }

    public final void run() {
        this.f4751e.i(this.f4752f);
    }
}
