package io.flutter.plugins.firebase.core;

import f.e.a.c.g.j;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseCorePlugin f4731e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.h f4732f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ j f4733g;

    public /* synthetic */ h(FlutterFirebaseCorePlugin flutterFirebaseCorePlugin, com.google.firebase.h hVar, j jVar) {
        this.f4731e = flutterFirebaseCorePlugin;
        this.f4732f = hVar;
        this.f4733g = jVar;
    }

    public final void run() {
        this.f4731e.c(this.f4732f, this.f4733g);
    }
}
