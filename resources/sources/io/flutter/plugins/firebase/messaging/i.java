package io.flutter.plugins.firebase.messaging;

import f.e.a.c.g.j;
import java.util.Map;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseMessagingPlugin f4755e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Map f4756f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ j f4757g;

    public /* synthetic */ i(FlutterFirebaseMessagingPlugin flutterFirebaseMessagingPlugin, Map map, j jVar) {
        this.f4755e = flutterFirebaseMessagingPlugin;
        this.f4756f = map;
        this.f4757g = jVar;
    }

    public final void run() {
        this.f4755e.n(this.f4756f, this.f4757g);
    }
}
