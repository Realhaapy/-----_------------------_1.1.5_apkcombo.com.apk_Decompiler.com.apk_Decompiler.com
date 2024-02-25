package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public final /* synthetic */ class h implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ GeneratedAndroidWebView.DownloadListenerHostApi a;

    public /* synthetic */ h(GeneratedAndroidWebView.DownloadListenerHostApi downloadListenerHostApi) {
        this.a = downloadListenerHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        k2.b(this.a, obj, reply);
    }
}
