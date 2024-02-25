package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.ArrayList;
import java.util.HashMap;

public final /* synthetic */ class q2 {
    public static MessageCodec<Object> a() {
        return GeneratedAndroidWebView.WebViewClientHostApiCodec.INSTANCE;
    }

    public static /* synthetic */ void b(GeneratedAndroidWebView.WebViewClientHostApi webViewClientHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    webViewClientHostApi.create(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("shouldOverrideUrlLoadingArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }

    public static void c(BinaryMessenger binaryMessenger, GeneratedAndroidWebView.WebViewClientHostApi webViewClientHostApi) {
        new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewClientHostApi.create", a()).setMessageHandler(webViewClientHostApi != null ? new o0(webViewClientHostApi) : null);
    }
}
