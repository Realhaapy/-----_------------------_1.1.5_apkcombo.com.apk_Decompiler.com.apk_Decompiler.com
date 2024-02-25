package io.flutter.plugins.firebase.core;

import f.e.a.c.g.j;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseCorePlugin f4718e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidFirebaseCore.PigeonFirebaseOptions f4719f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f4720g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ j f4721h;

    public /* synthetic */ b(FlutterFirebaseCorePlugin flutterFirebaseCorePlugin, GeneratedAndroidFirebaseCore.PigeonFirebaseOptions pigeonFirebaseOptions, String str, j jVar) {
        this.f4718e = flutterFirebaseCorePlugin;
        this.f4719f = pigeonFirebaseOptions;
        this.f4720g = str;
        this.f4721h = jVar;
    }

    public final void run() {
        this.f4718e.e(this.f4719f, this.f4720g, this.f4721h);
    }
}
