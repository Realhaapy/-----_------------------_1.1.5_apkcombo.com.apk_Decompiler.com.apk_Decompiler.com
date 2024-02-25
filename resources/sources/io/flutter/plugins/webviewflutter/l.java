package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public final /* synthetic */ class l implements BasicMessageChannel.Reply {
    public final /* synthetic */ GeneratedAndroidWebView.JavaScriptChannelFlutterApi.Reply a;

    public /* synthetic */ l(GeneratedAndroidWebView.JavaScriptChannelFlutterApi.Reply reply) {
        this.a = reply;
    }

    public final void reply(Object obj) {
        this.a.reply(null);
    }
}
