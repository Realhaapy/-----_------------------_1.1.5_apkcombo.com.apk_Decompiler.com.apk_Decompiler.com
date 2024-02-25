package io.flutter.plugins.firebase.messaging;

import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.loader.FlutterLoader;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseMessagingBackgroundExecutor f4742e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ FlutterLoader f4743f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ FlutterShellArgs f4744g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ long f4745h;

    public /* synthetic */ b(FlutterFirebaseMessagingBackgroundExecutor flutterFirebaseMessagingBackgroundExecutor, FlutterLoader flutterLoader, FlutterShellArgs flutterShellArgs, long j2) {
        this.f4742e = flutterFirebaseMessagingBackgroundExecutor;
        this.f4743f = flutterLoader;
        this.f4744g = flutterShellArgs;
        this.f4745h = j2;
    }

    public final void run() {
        this.f4742e.b(this.f4743f, this.f4744g, this.f4745h);
    }
}
