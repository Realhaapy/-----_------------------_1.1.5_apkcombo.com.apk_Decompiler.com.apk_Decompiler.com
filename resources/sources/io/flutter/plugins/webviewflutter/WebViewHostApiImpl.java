package io.flutter.plugins.webviewflutter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.f;
import io.flutter.plugins.webviewflutter.DownloadListenerHostApiImpl;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl;
import io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WebViewHostApiImpl implements GeneratedAndroidWebView.WebViewHostApi {
    private static final String nullStringIdentifier = "<null-value>";
    private final View containerView;
    private Context context;
    private final InstanceManager instanceManager;
    private final WebViewProxy webViewProxy;

    @SuppressLint({"ViewConstructor"})
    public static class InputAwareWebViewPlatformView extends InputAwareWebView implements PlatformView, Releasable {
        private final ReleasableValue<DownloadListenerHostApiImpl.DownloadListenerImpl> currentDownloadListener = new ReleasableValue<>();
        private final ReleasableValue<WebChromeClientHostApiImpl.WebChromeClientImpl> currentWebChromeClient = new ReleasableValue<>();
        private final ReleasableValue<WebViewClientHostApiImpl.ReleasableWebViewClient> currentWebViewClient = new ReleasableValue<>();
        private final Map<String, ReleasableValue<JavaScriptChannel>> javaScriptInterfaces = new HashMap();

        public InputAwareWebViewPlatformView(Context context, View view) {
            super(context, view);
        }

        @SuppressLint({"JavascriptInterface"})
        public void addJavascriptInterface(Object obj, String str) {
            super.addJavascriptInterface(obj, str);
            if (obj instanceof JavaScriptChannel) {
                ReleasableValue releasableValue = this.javaScriptInterfaces.get(str);
                if (!(releasableValue == null || releasableValue.get() == obj)) {
                    releasableValue.release();
                }
                this.javaScriptInterfaces.put(str, new ReleasableValue((JavaScriptChannel) obj));
            }
        }

        public /* bridge */ /* synthetic */ boolean checkInputConnectionProxy(View view) {
            return super.checkInputConnectionProxy(view);
        }

        public /* bridge */ /* synthetic */ void clearFocus() {
            super.clearFocus();
        }

        public void dispose() {
            super.dispose();
            destroy();
        }

        public View getView() {
            return this;
        }

        public void onFlutterViewAttached(View view) {
            setContainerView(view);
        }

        public void onFlutterViewDetached() {
            setContainerView((View) null);
        }

        public void onInputConnectionLocked() {
            lockInputConnection();
        }

        public void onInputConnectionUnlocked() {
            unlockInputConnection();
        }

        public void release() {
            this.currentWebViewClient.release();
            this.currentDownloadListener.release();
            this.currentWebChromeClient.release();
            for (ReleasableValue<JavaScriptChannel> release : this.javaScriptInterfaces.values()) {
                release.release();
            }
            this.javaScriptInterfaces.clear();
        }

        public void removeJavascriptInterface(String str) {
            super.removeJavascriptInterface(str);
            this.javaScriptInterfaces.get(str).release();
            this.javaScriptInterfaces.remove(str);
        }

        public void setDownloadListener(DownloadListener downloadListener) {
            super.setDownloadListener(downloadListener);
            this.currentDownloadListener.set((DownloadListenerHostApiImpl.DownloadListenerImpl) downloadListener);
        }

        public void setWebChromeClient(WebChromeClient webChromeClient) {
            super.setWebChromeClient(webChromeClient);
            this.currentWebChromeClient.set((WebChromeClientHostApiImpl.WebChromeClientImpl) webChromeClient);
        }

        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.currentWebViewClient.set((WebViewClientHostApiImpl.ReleasableWebViewClient) webViewClient);
            WebChromeClientHostApiImpl.WebChromeClientImpl webChromeClientImpl = this.currentWebChromeClient.get();
            if (webChromeClientImpl != null) {
                webChromeClientImpl.setWebViewClient(webViewClient);
            }
        }
    }

    private static class ReleasableValue<T extends Releasable> {
        private T value;

        ReleasableValue() {
        }

        ReleasableValue(T t) {
            this.value = t;
        }

        /* access modifiers changed from: package-private */
        public T get() {
            return this.value;
        }

        /* access modifiers changed from: package-private */
        public void release() {
            T t = this.value;
            if (t != null) {
                t.release();
            }
            this.value = null;
        }

        /* access modifiers changed from: package-private */
        public void set(T t) {
            release();
            this.value = t;
        }
    }

    public static class WebViewPlatformView extends WebView implements PlatformView, Releasable {
        private final ReleasableValue<DownloadListenerHostApiImpl.DownloadListenerImpl> currentDownloadListener = new ReleasableValue<>();
        private final ReleasableValue<WebChromeClientHostApiImpl.WebChromeClientImpl> currentWebChromeClient = new ReleasableValue<>();
        private final ReleasableValue<WebViewClientHostApiImpl.ReleasableWebViewClient> currentWebViewClient = new ReleasableValue<>();
        private final Map<String, ReleasableValue<JavaScriptChannel>> javaScriptInterfaces = new HashMap();

        public WebViewPlatformView(Context context) {
            super(context);
        }

        @SuppressLint({"JavascriptInterface"})
        public void addJavascriptInterface(Object obj, String str) {
            super.addJavascriptInterface(obj, str);
            if (obj instanceof JavaScriptChannel) {
                ReleasableValue releasableValue = this.javaScriptInterfaces.get(str);
                if (!(releasableValue == null || releasableValue.get() == obj)) {
                    releasableValue.release();
                }
                this.javaScriptInterfaces.put(str, new ReleasableValue((JavaScriptChannel) obj));
            }
        }

        public void dispose() {
            destroy();
        }

        public View getView() {
            return this;
        }

        public /* synthetic */ void onFlutterViewAttached(View view) {
            f.$default$onFlutterViewAttached(this, view);
        }

        public /* synthetic */ void onFlutterViewDetached() {
            f.$default$onFlutterViewDetached(this);
        }

        public /* synthetic */ void onInputConnectionLocked() {
            f.$default$onInputConnectionLocked(this);
        }

        public /* synthetic */ void onInputConnectionUnlocked() {
            f.$default$onInputConnectionUnlocked(this);
        }

        public void release() {
            this.currentWebViewClient.release();
            this.currentDownloadListener.release();
            this.currentWebChromeClient.release();
            for (ReleasableValue<JavaScriptChannel> release : this.javaScriptInterfaces.values()) {
                release.release();
            }
            this.javaScriptInterfaces.clear();
        }

        public void removeJavascriptInterface(String str) {
            super.removeJavascriptInterface(str);
            this.javaScriptInterfaces.get(str).release();
            this.javaScriptInterfaces.remove(str);
        }

        public void setDownloadListener(DownloadListener downloadListener) {
            super.setDownloadListener(downloadListener);
            this.currentDownloadListener.set((DownloadListenerHostApiImpl.DownloadListenerImpl) downloadListener);
        }

        public void setWebChromeClient(WebChromeClient webChromeClient) {
            super.setWebChromeClient(webChromeClient);
            this.currentWebChromeClient.set((WebChromeClientHostApiImpl.WebChromeClientImpl) webChromeClient);
        }

        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.currentWebViewClient.set((WebViewClientHostApiImpl.ReleasableWebViewClient) webViewClient);
            WebChromeClientHostApiImpl.WebChromeClientImpl webChromeClientImpl = this.currentWebChromeClient.get();
            if (webChromeClientImpl != null) {
                webChromeClientImpl.setWebViewClient(webViewClient);
            }
        }
    }

    public static class WebViewProxy {
        public InputAwareWebViewPlatformView createInputAwareWebView(Context context, View view) {
            return new InputAwareWebViewPlatformView(context, view);
        }

        public WebViewPlatformView createWebView(Context context) {
            return new WebViewPlatformView(context);
        }

        public void setWebContentsDebuggingEnabled(boolean z) {
            WebView.setWebContentsDebuggingEnabled(z);
        }
    }

    public WebViewHostApiImpl(InstanceManager instanceManager2, WebViewProxy webViewProxy2, Context context2, View view) {
        this.instanceManager = instanceManager2;
        this.webViewProxy = webViewProxy2;
        this.context = context2;
        this.containerView = view;
    }

    private static String parseNullStringIdentifier(String str) {
        if (str.equals(nullStringIdentifier)) {
            return null;
        }
        return str;
    }

    public void addJavaScriptChannel(Long l2, Long l3) {
        JavaScriptChannel javaScriptChannel = (JavaScriptChannel) this.instanceManager.getInstance(l3.longValue());
        ((WebView) this.instanceManager.getInstance(l2.longValue())).addJavascriptInterface(javaScriptChannel, javaScriptChannel.javaScriptChannelName);
    }

    public Boolean canGoBack(Long l2) {
        return Boolean.valueOf(((WebView) this.instanceManager.getInstance(l2.longValue())).canGoBack());
    }

    public Boolean canGoForward(Long l2) {
        return Boolean.valueOf(((WebView) this.instanceManager.getInstance(l2.longValue())).canGoForward());
    }

    public void clearCache(Long l2, Boolean bool) {
        ((WebView) this.instanceManager.getInstance(l2.longValue())).clearCache(bool.booleanValue());
    }

    public void create(Long l2, Boolean bool) {
        DisplayListenerProxy displayListenerProxy = new DisplayListenerProxy();
        DisplayManager displayManager = (DisplayManager) this.context.getSystemService("display");
        displayListenerProxy.onPreWebViewInitialization(displayManager);
        Object createWebView = bool.booleanValue() ? this.webViewProxy.createWebView(this.context) : this.webViewProxy.createInputAwareWebView(this.context, this.containerView);
        displayListenerProxy.onPostWebViewInitialization(displayManager);
        this.instanceManager.addInstance(createWebView, l2.longValue());
    }

    public void dispose(Long l2) {
        WebView webView = (WebView) this.instanceManager.getInstance(l2.longValue());
        if (webView != null) {
            ((Releasable) webView).release();
            this.instanceManager.removeInstance(webView);
        }
    }

    public void evaluateJavascript(Long l2, String str, GeneratedAndroidWebView.Result<String> result) {
        Objects.requireNonNull(result);
        ((WebView) this.instanceManager.getInstance(l2.longValue())).evaluateJavascript(str, new a(result));
    }

    public Long getScrollX(Long l2) {
        return Long.valueOf((long) ((WebView) this.instanceManager.getInstance(l2.longValue())).getScrollX());
    }

    public Long getScrollY(Long l2) {
        return Long.valueOf((long) ((WebView) this.instanceManager.getInstance(l2.longValue())).getScrollY());
    }

    public String getTitle(Long l2) {
        String title = ((WebView) this.instanceManager.getInstance(l2.longValue())).getTitle();
        return title != null ? title : nullStringIdentifier;
    }

    public String getUrl(Long l2) {
        String url = ((WebView) this.instanceManager.getInstance(l2.longValue())).getUrl();
        return url != null ? url : nullStringIdentifier;
    }

    public void goBack(Long l2) {
        ((WebView) this.instanceManager.getInstance(l2.longValue())).goBack();
    }

    public void goForward(Long l2) {
        ((WebView) this.instanceManager.getInstance(l2.longValue())).goForward();
    }

    public void loadData(Long l2, String str, String str2, String str3) {
        ((WebView) this.instanceManager.getInstance(l2.longValue())).loadData(str, parseNullStringIdentifier(str2), parseNullStringIdentifier(str3));
    }

    public void loadDataWithBaseUrl(Long l2, String str, String str2, String str3, String str4, String str5) {
        ((WebView) this.instanceManager.getInstance(l2.longValue())).loadDataWithBaseURL(parseNullStringIdentifier(str), str2, parseNullStringIdentifier(str3), parseNullStringIdentifier(str4), parseNullStringIdentifier(str5));
    }

    public void loadUrl(Long l2, String str, Map<String, String> map) {
        ((WebView) this.instanceManager.getInstance(l2.longValue())).loadUrl(str, map);
    }

    public void postUrl(Long l2, String str, byte[] bArr) {
        ((WebView) this.instanceManager.getInstance(l2.longValue())).postUrl(str, bArr);
    }

    public void reload(Long l2) {
        ((WebView) this.instanceManager.getInstance(l2.longValue())).reload();
    }

    public void removeJavaScriptChannel(Long l2, Long l3) {
        ((WebView) this.instanceManager.getInstance(l2.longValue())).removeJavascriptInterface(((JavaScriptChannel) this.instanceManager.getInstance(l3.longValue())).javaScriptChannelName);
    }

    public void scrollBy(Long l2, Long l3, Long l4) {
        ((WebView) this.instanceManager.getInstance(l2.longValue())).scrollBy(l3.intValue(), l4.intValue());
    }

    public void scrollTo(Long l2, Long l3, Long l4) {
        ((WebView) this.instanceManager.getInstance(l2.longValue())).scrollTo(l3.intValue(), l4.intValue());
    }

    public void setBackgroundColor(Long l2, Long l3) {
        ((WebView) this.instanceManager.getInstance(l2.longValue())).setBackgroundColor(l3.intValue());
    }

    public void setContext(Context context2) {
        this.context = context2;
    }

    public void setDownloadListener(Long l2, Long l3) {
        ((WebView) this.instanceManager.getInstance(l2.longValue())).setDownloadListener((DownloadListener) this.instanceManager.getInstance(l3.longValue()));
    }

    public void setWebChromeClient(Long l2, Long l3) {
        ((WebView) this.instanceManager.getInstance(l2.longValue())).setWebChromeClient((WebChromeClient) this.instanceManager.getInstance(l3.longValue()));
    }

    public void setWebContentsDebuggingEnabled(Boolean bool) {
        this.webViewProxy.setWebContentsDebuggingEnabled(bool.booleanValue());
    }

    public void setWebViewClient(Long l2, Long l3) {
        ((WebView) this.instanceManager.getInstance(l2.longValue())).setWebViewClient((WebViewClient) this.instanceManager.getInstance(l3.longValue()));
    }
}
