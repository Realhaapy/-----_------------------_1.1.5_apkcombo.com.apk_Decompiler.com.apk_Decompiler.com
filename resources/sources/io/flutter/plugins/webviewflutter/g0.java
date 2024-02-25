package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public final /* synthetic */ class g0 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ GeneratedAndroidWebView.WebStorageHostApi a;

    public /* synthetic */ g0(GeneratedAndroidWebView.WebStorageHostApi webStorageHostApi) {
        this.a = webStorageHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        p2.b(this.a, obj, reply);
    }
}
