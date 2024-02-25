package io.flutter.embedding.engine.loader;

import android.content.Context;
import android.os.Handler;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FlutterLoader f4701e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f4702f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String[] f4703g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Handler f4704h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Runnable f4705i;

    public /* synthetic */ b(FlutterLoader flutterLoader, Context context, String[] strArr, Handler handler, Runnable runnable) {
        this.f4701e = flutterLoader;
        this.f4702f = context;
        this.f4703g = strArr;
        this.f4704h = handler;
        this.f4705i = runnable;
    }

    public final void run() {
        this.f4701e.d(this.f4702f, this.f4703g, this.f4704h, this.f4705i);
    }
}
