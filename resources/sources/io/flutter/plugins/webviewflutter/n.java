package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public final /* synthetic */ class n implements BasicMessageChannel.Reply {
    public final /* synthetic */ GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply a;

    public /* synthetic */ n(GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply reply) {
        this.a = reply;
    }

    public final void reply(Object obj) {
        this.a.reply(null);
    }
}
