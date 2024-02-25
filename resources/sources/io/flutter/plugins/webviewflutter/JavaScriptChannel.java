package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;

public class JavaScriptChannel implements Releasable {
    private JavaScriptChannelFlutterApiImpl flutterApi;
    final String javaScriptChannelName;
    private final Handler platformThreadHandler;

    public JavaScriptChannel(JavaScriptChannelFlutterApiImpl javaScriptChannelFlutterApiImpl, String str, Handler handler) {
        this.flutterApi = javaScriptChannelFlutterApiImpl;
        this.javaScriptChannelName = str;
        this.platformThreadHandler = handler;
    }

    static /* synthetic */ void a(Void voidR) {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void c(String str) {
        JavaScriptChannelFlutterApiImpl javaScriptChannelFlutterApiImpl = this.flutterApi;
        if (javaScriptChannelFlutterApiImpl != null) {
            javaScriptChannelFlutterApiImpl.postMessage(this, str, p1.a);
        }
    }

    static /* synthetic */ void d(Void voidR) {
    }

    @JavascriptInterface
    public void postMessage(String str) {
        q1 q1Var = new q1(this, str);
        if (this.platformThreadHandler.getLooper() == Looper.myLooper()) {
            q1Var.run();
        } else {
            this.platformThreadHandler.post(q1Var);
        }
    }

    public void release() {
        JavaScriptChannelFlutterApiImpl javaScriptChannelFlutterApiImpl = this.flutterApi;
        if (javaScriptChannelFlutterApiImpl != null) {
            javaScriptChannelFlutterApiImpl.dispose(this, r1.a);
        }
        this.flutterApi = null;
    }
}
