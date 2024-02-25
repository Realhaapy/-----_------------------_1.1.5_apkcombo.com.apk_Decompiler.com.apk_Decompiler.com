package io.flutter.plugins.firebase.core;

import f.e.a.c.g.j;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f4715e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Boolean f4716f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ j f4717g;

    public /* synthetic */ a(String str, Boolean bool, j jVar) {
        this.f4715e = str;
        this.f4716f = bool;
        this.f4717g = jVar;
    }

    public final void run() {
        FlutterFirebaseCorePlugin.k(this.f4715e, this.f4716f, this.f4717g);
    }
}
