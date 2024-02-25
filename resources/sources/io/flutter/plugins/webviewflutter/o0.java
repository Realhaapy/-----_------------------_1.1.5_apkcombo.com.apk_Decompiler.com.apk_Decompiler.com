package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public final /* synthetic */ class o0 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ GeneratedAndroidWebView.WebViewClientHostApi a;

    public /* synthetic */ o0(GeneratedAndroidWebView.WebViewClientHostApi webViewClientHostApi) {
        this.a = webViewClientHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        q2.b(this.a, obj, reply);
    }
}
