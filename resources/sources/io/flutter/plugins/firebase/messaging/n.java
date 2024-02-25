package io.flutter.plugins.firebase.messaging;

import f.e.a.c.g.j;
import java.util.Map;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Map f4765e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f4766f;

    public /* synthetic */ n(Map map, j jVar) {
        this.f4765e = map;
        this.f4766f = jVar;
    }

    public final void run() {
        FlutterFirebaseMessagingPlugin.p(this.f4765e, this.f4766f);
    }
}
