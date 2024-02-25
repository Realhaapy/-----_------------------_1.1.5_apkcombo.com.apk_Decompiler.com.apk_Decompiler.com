package io.flutter.plugin.platform;

import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
import io.flutter.plugin.platform.PlatformViewsController;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ PlatformViewsController.AnonymousClass1 f4711e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VirtualDisplayController f4712f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ PlatformViewsChannel.PlatformViewBufferResized f4713g;

    public /* synthetic */ b(PlatformViewsController.AnonymousClass1 r1, VirtualDisplayController virtualDisplayController, PlatformViewsChannel.PlatformViewBufferResized platformViewBufferResized) {
        this.f4711e = r1;
        this.f4712f = virtualDisplayController;
        this.f4713g = platformViewBufferResized;
    }

    public final void run() {
        this.f4711e.f(this.f4712f, this.f4713g);
    }
}
