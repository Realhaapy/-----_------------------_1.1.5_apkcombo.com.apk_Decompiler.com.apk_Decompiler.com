package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public final /* synthetic */ class f implements BasicMessageChannel.Reply {
    public final /* synthetic */ GeneratedAndroidWebView.DownloadListenerFlutterApi.Reply a;

    public /* synthetic */ f(GeneratedAndroidWebView.DownloadListenerFlutterApi.Reply reply) {
        this.a = reply;
    }

    public final void reply(Object obj) {
        this.a.reply(null);
    }
}
