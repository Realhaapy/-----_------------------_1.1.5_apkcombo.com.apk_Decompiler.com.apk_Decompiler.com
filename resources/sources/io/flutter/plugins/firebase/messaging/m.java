package io.flutter.plugins.firebase.messaging;

import f.e.a.c.g.j;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseMessagingPlugin f4763e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f4764f;

    public /* synthetic */ m(FlutterFirebaseMessagingPlugin flutterFirebaseMessagingPlugin, j jVar) {
        this.f4763e = flutterFirebaseMessagingPlugin;
        this.f4764f = jVar;
    }

    public final void run() {
        this.f4763e.f(this.f4764f);
    }
}
