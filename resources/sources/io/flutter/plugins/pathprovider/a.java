package io.flutter.plugins.pathprovider;

import f.e.b.b.a.f;
import io.flutter.plugins.pathprovider.PathProviderPlugin;
import java.util.concurrent.Callable;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f f4767e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Callable f4768f;

    public /* synthetic */ a(f fVar, Callable callable) {
        this.f4767e = fVar;
        this.f4768f = callable;
    }

    public final void run() {
        PathProviderPlugin.PathProviderPlatformThread.a(this.f4767e, this.f4768f);
    }
}
