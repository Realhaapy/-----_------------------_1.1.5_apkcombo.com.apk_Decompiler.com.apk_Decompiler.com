package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public class JavaScriptChannelHostApiImpl implements GeneratedAndroidWebView.JavaScriptChannelHostApi {
    private final JavaScriptChannelFlutterApiImpl flutterApi;
    private final InstanceManager instanceManager;
    private final JavaScriptChannelCreator javaScriptChannelCreator;
    private Handler platformThreadHandler;

    public static class JavaScriptChannelCreator {
        public JavaScriptChannel createJavaScriptChannel(JavaScriptChannelFlutterApiImpl javaScriptChannelFlutterApiImpl, String str, Handler handler) {
            return new JavaScriptChannel(javaScriptChannelFlutterApiImpl, str, handler);
        }
    }

    public JavaScriptChannelHostApiImpl(InstanceManager instanceManager2, JavaScriptChannelCreator javaScriptChannelCreator2, JavaScriptChannelFlutterApiImpl javaScriptChannelFlutterApiImpl, Handler handler) {
        this.instanceManager = instanceManager2;
        this.javaScriptChannelCreator = javaScriptChannelCreator2;
        this.flutterApi = javaScriptChannelFlutterApiImpl;
        this.platformThreadHandler = handler;
    }

    public void create(Long l2, String str) {
        this.instanceManager.addInstance(this.javaScriptChannelCreator.createJavaScriptChannel(this.flutterApi, str, this.platformThreadHandler), l2.longValue());
    }

    public void setPlatformThreadHandler(Handler handler) {
        this.platformThreadHandler = handler;
    }
}
