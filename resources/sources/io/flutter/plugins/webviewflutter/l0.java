package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public final /* synthetic */ class l0 implements BasicMessageChannel.Reply {
    public final /* synthetic */ GeneratedAndroidWebView.WebViewClientFlutterApi.Reply a;

    public /* synthetic */ l0(GeneratedAndroidWebView.WebViewClientFlutterApi.Reply reply) {
        this.a = reply;
    }

    public final void reply(Object obj) {
        this.a.reply(null);
    }
}
