package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public final /* synthetic */ class a0 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ GeneratedAndroidWebView.WebSettingsHostApi a;

    public /* synthetic */ a0(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi) {
        this.a = webSettingsHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        o2.j(this.a, obj, reply);
    }
}
