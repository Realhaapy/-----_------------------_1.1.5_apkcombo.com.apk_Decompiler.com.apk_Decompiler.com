package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public final /* synthetic */ class e implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ GeneratedAndroidWebView.CookieManagerHostApi a;

    public /* synthetic */ e(GeneratedAndroidWebView.CookieManagerHostApi cookieManagerHostApi) {
        this.a = cookieManagerHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        j2.c(this.a, obj, reply);
    }
}
