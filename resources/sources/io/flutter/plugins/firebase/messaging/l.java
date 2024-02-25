package io.flutter.plugins.firebase.messaging;

import f.e.a.c.g.j;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseMessagingPlugin f4761e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f4762f;

    public /* synthetic */ l(FlutterFirebaseMessagingPlugin flutterFirebaseMessagingPlugin, j jVar) {
        this.f4761e = flutterFirebaseMessagingPlugin;
        this.f4762f = jVar;
    }

    public final void run() {
        this.f4761e.d(this.f4762f);
    }
}
