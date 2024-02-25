package io.flutter.embedding.engine.loader;

import android.content.Context;
import android.os.Handler;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FlutterLoader f4706e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f4707f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String[] f4708g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Handler f4709h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Runnable f4710i;

    public /* synthetic */ c(FlutterLoader flutterLoader, Context context, String[] strArr, Handler handler, Runnable runnable) {
        this.f4706e = flutterLoader;
        this.f4707f = context;
        this.f4708g = strArr;
        this.f4709h = handler;
        this.f4710i = runnable;
    }

    public final void run() {
        this.f4706e.b(this.f4707f, this.f4708g, this.f4709h, this.f4710i);
    }
}
