package io.flutter.plugins.firebase.messaging;

import f.e.a.c.g.j;
import java.util.Map;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Map f4753e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f4754f;

    public /* synthetic */ g(Map map, j jVar) {
        this.f4753e = map;
        this.f4754f = jVar;
    }

    public final void run() {
        FlutterFirebaseMessagingPlugin.l(this.f4753e, this.f4754f);
    }
}
