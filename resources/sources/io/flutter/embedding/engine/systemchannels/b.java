package io.flutter.embedding.engine.systemchannels;

import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
import io.flutter.plugin.common.MethodChannel;

public final /* synthetic */ class b implements PlatformViewsChannel.PlatformViewBufferResized {
    public final /* synthetic */ MethodChannel.Result a;

    public /* synthetic */ b(MethodChannel.Result result) {
        this.a = result;
    }

    public final void run(PlatformViewsChannel.PlatformViewBufferSize platformViewBufferSize) {
        PlatformViewsChannel.AnonymousClass1.a(this.a, platformViewBufferSize);
    }
}
