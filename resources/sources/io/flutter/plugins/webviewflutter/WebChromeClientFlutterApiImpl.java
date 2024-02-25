package io.flutter.plugins.webviewflutter;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public class WebChromeClientFlutterApiImpl extends GeneratedAndroidWebView.WebChromeClientFlutterApi {
    private final InstanceManager instanceManager;

    public WebChromeClientFlutterApiImpl(BinaryMessenger binaryMessenger, InstanceManager instanceManager2) {
        super(binaryMessenger);
        this.instanceManager = instanceManager2;
    }

    public void dispose(WebChromeClient webChromeClient, GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<Void> reply) {
        Long removeInstance = this.instanceManager.removeInstance(webChromeClient);
        if (removeInstance != null) {
            dispose(removeInstance, reply);
        } else {
            reply.reply(null);
        }
    }

    public void onProgressChanged(WebChromeClient webChromeClient, WebView webView, Long l2, GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<Void> reply) {
        super.onProgressChanged(this.instanceManager.getInstanceId(webChromeClient), this.instanceManager.getInstanceId(webView), l2, reply);
    }
}
