package io.flutter.plugins.webviewflutter;

import android.webkit.ValueCallback;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public final /* synthetic */ class i2 implements ValueCallback {
    public final /* synthetic */ GeneratedAndroidWebView.Result a;

    public /* synthetic */ i2(GeneratedAndroidWebView.Result result) {
        this.a = result;
    }

    public final void onReceiveValue(Object obj) {
        this.a.success((Boolean) obj);
    }
}
