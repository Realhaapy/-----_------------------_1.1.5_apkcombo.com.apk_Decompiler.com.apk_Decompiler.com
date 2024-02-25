package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public final /* synthetic */ class m implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ GeneratedAndroidWebView.JavaScriptChannelHostApi a;

    public /* synthetic */ m(GeneratedAndroidWebView.JavaScriptChannelHostApi javaScriptChannelHostApi) {
        this.a = javaScriptChannelHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        m2.b(this.a, obj, reply);
    }
}
