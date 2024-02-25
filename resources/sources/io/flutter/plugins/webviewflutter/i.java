package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public final /* synthetic */ class i implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ GeneratedAndroidWebView.FlutterAssetManagerHostApi a;

    public /* synthetic */ i(GeneratedAndroidWebView.FlutterAssetManagerHostApi flutterAssetManagerHostApi) {
        this.a = flutterAssetManagerHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        l2.c(this.a, obj, reply);
    }
}
