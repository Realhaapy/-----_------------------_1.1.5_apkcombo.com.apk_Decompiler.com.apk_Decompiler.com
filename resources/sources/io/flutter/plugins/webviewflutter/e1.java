package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public final /* synthetic */ class e1 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ GeneratedAndroidWebView.WebViewHostApi a;

    public /* synthetic */ e1(GeneratedAndroidWebView.WebViewHostApi webViewHostApi) {
        this.a = webViewHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        r2.z(this.a, obj, reply);
    }
}
