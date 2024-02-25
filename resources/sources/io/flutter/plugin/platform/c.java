package io.flutter.plugin.platform;

import android.view.View;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
import io.flutter.plugin.platform.PlatformViewsController;

public final /* synthetic */ class c implements View.OnFocusChangeListener {
    public final /* synthetic */ PlatformViewsController.AnonymousClass1 a;
    public final /* synthetic */ PlatformViewsChannel.PlatformViewCreationRequest b;

    public /* synthetic */ c(PlatformViewsController.AnonymousClass1 r1, PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
        this.a = r1;
        this.b = platformViewCreationRequest;
    }

    public final void onFocusChange(View view, boolean z) {
        this.a.b(this.b, view, z);
    }
}
