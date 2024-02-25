package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public final /* synthetic */ class x implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ GeneratedAndroidWebView.WebSettingsHostApi a;

    public /* synthetic */ x(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi) {
        this.a = webSettingsHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        o2.f(this.a, obj, reply);
    }
}
