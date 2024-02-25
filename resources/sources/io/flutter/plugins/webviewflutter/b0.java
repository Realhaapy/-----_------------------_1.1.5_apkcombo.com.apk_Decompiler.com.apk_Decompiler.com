package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public final /* synthetic */ class b0 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ GeneratedAndroidWebView.WebSettingsHostApi a;

    public /* synthetic */ b0(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi) {
        this.a = webSettingsHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        o2.k(this.a, obj, reply);
    }
}
