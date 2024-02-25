package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public final /* synthetic */ class p implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ GeneratedAndroidWebView.WebChromeClientHostApi a;

    public /* synthetic */ p(GeneratedAndroidWebView.WebChromeClientHostApi webChromeClientHostApi) {
        this.a = webChromeClientHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        n2.b(this.a, obj, reply);
    }
}
