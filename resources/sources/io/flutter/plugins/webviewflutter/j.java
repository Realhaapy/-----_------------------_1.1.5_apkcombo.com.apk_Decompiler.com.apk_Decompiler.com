package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public final /* synthetic */ class j implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ GeneratedAndroidWebView.FlutterAssetManagerHostApi a;

    public /* synthetic */ j(GeneratedAndroidWebView.FlutterAssetManagerHostApi flutterAssetManagerHostApi) {
        this.a = flutterAssetManagerHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        l2.b(this.a, obj, reply);
    }
}
