package io.flutter.plugins.firebase.messaging;

import f.e.a.c.g.d;
import f.e.a.c.g.i;
import io.flutter.plugin.common.MethodChannel;

public final /* synthetic */ class h implements d {
    public final /* synthetic */ FlutterFirebaseMessagingPlugin a;
    public final /* synthetic */ MethodChannel.Result b;

    public /* synthetic */ h(FlutterFirebaseMessagingPlugin flutterFirebaseMessagingPlugin, MethodChannel.Result result) {
        this.a = flutterFirebaseMessagingPlugin;
        this.b = result;
    }

    public final void a(i iVar) {
        this.a.k(this.b, iVar);
    }
}
