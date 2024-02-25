package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public final /* synthetic */ class k implements BasicMessageChannel.Reply {
    public final /* synthetic */ GeneratedAndroidWebView.JavaScriptChannelFlutterApi.Reply a;

    public /* synthetic */ k(GeneratedAndroidWebView.JavaScriptChannelFlutterApi.Reply reply) {
        this.a = reply;
    }

    public final void reply(Object obj) {
        this.a.reply(null);
    }
}
