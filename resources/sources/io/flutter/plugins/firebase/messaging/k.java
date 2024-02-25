package io.flutter.plugins.firebase.messaging;

import f.e.a.c.g.j;
import java.util.Map;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Map f4759e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f4760f;

    public /* synthetic */ k(Map map, j jVar) {
        this.f4759e = map;
        this.f4760f = jVar;
    }

    public final void run() {
        FlutterFirebaseMessagingPlugin.o(this.f4759e, this.f4760f);
    }
}
