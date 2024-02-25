package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public final /* synthetic */ class d implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ GeneratedAndroidWebView.CookieManagerHostApi a;

    public /* synthetic */ d(GeneratedAndroidWebView.CookieManagerHostApi cookieManagerHostApi) {
        this.a = cookieManagerHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        j2.b(this.a, obj, reply);
    }
}
