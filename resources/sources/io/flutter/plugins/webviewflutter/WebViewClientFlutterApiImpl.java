package io.flutter.plugins.webviewflutter;

import android.annotation.SuppressLint;
import android.os.Build;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.b;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public class WebViewClientFlutterApiImpl extends GeneratedAndroidWebView.WebViewClientFlutterApi {
    private final InstanceManager instanceManager;

    public WebViewClientFlutterApiImpl(BinaryMessenger binaryMessenger, InstanceManager instanceManager2) {
        super(binaryMessenger);
        this.instanceManager = instanceManager2;
    }

    static GeneratedAndroidWebView.WebResourceErrorData createWebResourceErrorData(WebResourceError webResourceError) {
        GeneratedAndroidWebView.WebResourceErrorData webResourceErrorData = new GeneratedAndroidWebView.WebResourceErrorData();
        webResourceErrorData.setErrorCode(Long.valueOf((long) webResourceError.getErrorCode()));
        webResourceErrorData.setDescription(webResourceError.getDescription().toString());
        return webResourceErrorData;
    }

    @SuppressLint({"RequiresFeature"})
    static GeneratedAndroidWebView.WebResourceErrorData createWebResourceErrorData(b bVar) {
        GeneratedAndroidWebView.WebResourceErrorData webResourceErrorData = new GeneratedAndroidWebView.WebResourceErrorData();
        webResourceErrorData.setErrorCode(Long.valueOf((long) bVar.b()));
        webResourceErrorData.setDescription(bVar.a().toString());
        return webResourceErrorData;
    }

    static GeneratedAndroidWebView.WebResourceRequestData createWebResourceRequestData(WebResourceRequest webResourceRequest) {
        GeneratedAndroidWebView.WebResourceRequestData webResourceRequestData = new GeneratedAndroidWebView.WebResourceRequestData();
        webResourceRequestData.setUrl(webResourceRequest.getUrl().toString());
        webResourceRequestData.setIsForMainFrame(Boolean.valueOf(webResourceRequest.isForMainFrame()));
        if (Build.VERSION.SDK_INT >= 24) {
            webResourceRequestData.setIsRedirect(Boolean.valueOf(webResourceRequest.isRedirect()));
        }
        webResourceRequestData.setHasGesture(Boolean.valueOf(webResourceRequest.hasGesture()));
        webResourceRequestData.setMethod(webResourceRequest.getMethod());
        webResourceRequestData.setRequestHeaders(webResourceRequest.getRequestHeaders());
        return webResourceRequestData;
    }

    public void dispose(WebViewClient webViewClient, GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        Long removeInstance = this.instanceManager.removeInstance(webViewClient);
        if (removeInstance != null) {
            dispose(removeInstance, reply);
        } else {
            reply.reply(null);
        }
    }

    public void onPageFinished(WebViewClient webViewClient, WebView webView, String str, GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        onPageFinished(this.instanceManager.getInstanceId(webViewClient), this.instanceManager.getInstanceId(webView), str, reply);
    }

    public void onPageStarted(WebViewClient webViewClient, WebView webView, String str, GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        onPageStarted(this.instanceManager.getInstanceId(webViewClient), this.instanceManager.getInstanceId(webView), str, reply);
    }

    public void onReceivedError(WebViewClient webViewClient, WebView webView, Long l2, String str, String str2, GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        onReceivedError(this.instanceManager.getInstanceId(webViewClient), this.instanceManager.getInstanceId(webView), l2, str, str2, reply);
    }

    public void onReceivedRequestError(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError, GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        onReceivedRequestError(this.instanceManager.getInstanceId(webViewClient), this.instanceManager.getInstanceId(webView), createWebResourceRequestData(webResourceRequest), createWebResourceErrorData(webResourceError), reply);
    }

    public void onReceivedRequestError(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, b bVar, GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        onReceivedRequestError(this.instanceManager.getInstanceId(webViewClient), this.instanceManager.getInstanceId(webView), createWebResourceRequestData(webResourceRequest), createWebResourceErrorData(bVar), reply);
    }

    public void requestLoading(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        requestLoading(this.instanceManager.getInstanceId(webViewClient), this.instanceManager.getInstanceId(webView), createWebResourceRequestData(webResourceRequest), reply);
    }

    public void urlLoading(WebViewClient webViewClient, WebView webView, String str, GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        urlLoading(this.instanceManager.getInstanceId(webViewClient), this.instanceManager.getInstanceId(webView), str, reply);
    }
}
