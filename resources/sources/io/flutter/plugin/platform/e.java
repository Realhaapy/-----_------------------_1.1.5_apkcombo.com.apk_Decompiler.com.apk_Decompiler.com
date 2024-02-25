package io.flutter.plugin.platform;

import android.view.View;

public final /* synthetic */ class e implements View.OnFocusChangeListener {
    public final /* synthetic */ PlatformViewsController a;
    public final /* synthetic */ int b;

    public /* synthetic */ e(PlatformViewsController platformViewsController, int i2) {
        this.a = platformViewsController;
        this.b = i2;
    }

    public final void onFocusChange(View view, boolean z) {
        this.a.b(this.b, view, z);
    }
}
