package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.ArrayList;
import java.util.HashMap;

public final /* synthetic */ class m2 {
    public static MessageCodec<Object> a() {
        return GeneratedAndroidWebView.JavaScriptChannelHostApiCodec.INSTANCE;
    }

    public static /* synthetic */ void b(GeneratedAndroidWebView.JavaScriptChannelHostApi javaScriptChannelHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                String str = (String) arrayList.get(1);
                if (str != null) {
                    javaScriptChannelHostApi.create(Long.valueOf(number.longValue()), str);
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("channelNameArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }

    public static void c(BinaryMessenger binaryMessenger, GeneratedAndroidWebView.JavaScriptChannelHostApi javaScriptChannelHostApi) {
        new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.JavaScriptChannelHostApi.create", a()).setMessageHandler(javaScriptChannelHostApi != null ? new m(javaScriptChannelHostApi) : null);
    }
}
