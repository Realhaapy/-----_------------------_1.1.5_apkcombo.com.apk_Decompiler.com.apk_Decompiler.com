package io.flutter.plugins.firebase.core;

import com.google.firebase.h;
import f.e.a.c.g.j;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ h f4734e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f4735f;

    public /* synthetic */ i(h hVar, j jVar) {
        this.f4734e = hVar;
        this.f4735f = jVar;
    }

    public final void run() {
        FlutterFirebasePluginRegistry.b(this.f4734e, this.f4735f);
    }
}
