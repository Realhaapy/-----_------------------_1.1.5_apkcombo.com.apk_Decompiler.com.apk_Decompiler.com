package io.flutter.plugins.firebase.messaging;

import android.os.Handler;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.loader.FlutterLoader;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseMessagingBackgroundExecutor f4737e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ FlutterLoader f4738f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Handler f4739g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterShellArgs f4740h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ long f4741i;

    public /* synthetic */ a(FlutterFirebaseMessagingBackgroundExecutor flutterFirebaseMessagingBackgroundExecutor, FlutterLoader flutterLoader, Handler handler, FlutterShellArgs flutterShellArgs, long j2) {
        this.f4737e = flutterFirebaseMessagingBackgroundExecutor;
        this.f4738f = flutterLoader;
        this.f4739g = handler;
        this.f4740h = flutterShellArgs;
        this.f4741i = j2;
    }

    public final void run() {
        this.f4737e.d(this.f4738f, this.f4739g, this.f4740h, this.f4741i);
    }
}
