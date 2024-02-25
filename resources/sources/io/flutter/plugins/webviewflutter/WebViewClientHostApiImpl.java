package io.flutter.plugins.webviewflutter;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.KeyEvent;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebViewClientCompat;
import androidx.webkit.b;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public class WebViewClientHostApiImpl implements GeneratedAndroidWebView.WebViewClientHostApi {
    private final WebViewClientFlutterApiImpl flutterApi;
    private final InstanceManager instanceManager;
    private final WebViewClientCreator webViewClientCreator;

    public interface ReleasableWebViewClient extends Releasable {
    }

    public static class WebViewClientCompatImpl extends WebViewClientCompat implements ReleasableWebViewClient {
        private WebViewClientFlutterApiImpl flutterApi;
        private final boolean shouldOverrideUrlLoading;

        public WebViewClientCompatImpl(WebViewClientFlutterApiImpl webViewClientFlutterApiImpl, boolean z) {
            this.shouldOverrideUrlLoading = z;
            this.flutterApi = webViewClientFlutterApiImpl;
        }

        static /* synthetic */ void a(Void voidR) {
        }

        static /* synthetic */ void b(Void voidR) {
        }

        static /* synthetic */ void c(Void voidR) {
        }

        static /* synthetic */ void d(Void voidR) {
        }

        static /* synthetic */ void e(Void voidR) {
        }

        static /* synthetic */ void f(Void voidR) {
        }

        static /* synthetic */ void g(Void voidR) {
        }

        public void onPageFinished(WebView webView, String str) {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.onPageFinished(this, webView, str, u1.a);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.onPageStarted(this, webView, str, w1.a);
            }
        }

        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.onReceivedError(this, webView, Long.valueOf((long) i2), str, str2, x1.a);
            }
        }

        @SuppressLint({"RequiresFeature"})
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, b bVar) {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.onReceivedRequestError((WebViewClient) this, webView, webResourceRequest, bVar, (GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void>) y1.a);
            }
        }

        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        }

        public void release() {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.dispose(this, z1.a);
            }
            this.flutterApi = null;
        }

        @TargetApi(21)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.requestLoading(this, webView, webResourceRequest, v1.a);
            }
            return this.shouldOverrideUrlLoading;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.urlLoading(this, webView, str, a2.a);
            }
            return this.shouldOverrideUrlLoading;
        }
    }

    public static class WebViewClientCreator {
        public WebViewClient createWebViewClient(WebViewClientFlutterApiImpl webViewClientFlutterApiImpl, boolean z) {
            return Build.VERSION.SDK_INT >= 24 ? new WebViewClientImpl(webViewClientFlutterApiImpl, z) : new WebViewClientCompatImpl(webViewClientFlutterApiImpl, z);
        }
    }

    public static class WebViewClientImpl extends WebViewClient implements ReleasableWebViewClient {
        private WebViewClientFlutterApiImpl flutterApi;
        private final boolean shouldOverrideUrlLoading;

        public WebViewClientImpl(WebViewClientFlutterApiImpl webViewClientFlutterApiImpl, boolean z) {
            this.shouldOverrideUrlLoading = z;
            this.flutterApi = webViewClientFlutterApiImpl;
        }

        static /* synthetic */ void a(Void voidR) {
        }

        static /* synthetic */ void b(Void voidR) {
        }

        static /* synthetic */ void c(Void voidR) {
        }

        static /* synthetic */ void d(Void voidR) {
        }

        static /* synthetic */ void e(Void voidR) {
        }

        static /* synthetic */ void f(Void voidR) {
        }

        static /* synthetic */ void g(Void voidR) {
        }

        public void onPageFinished(WebView webView, String str) {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.onPageFinished(this, webView, str, c2.a);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.onPageStarted(this, webView, str, b2.a);
            }
        }

        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.onReceivedError(this, webView, Long.valueOf((long) i2), str, str2, f2.a);
            }
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.onReceivedRequestError((WebViewClient) this, webView, webResourceRequest, webResourceError, (GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void>) e2.a);
            }
        }

        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        }

        public void release() {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.dispose(this, h2.a);
            }
            this.flutterApi = null;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.requestLoading(this, webView, webResourceRequest, d2.a);
            }
            return this.shouldOverrideUrlLoading;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WebViewClientFlutterApiImpl webViewClientFlutterApiImpl = this.flutterApi;
            if (webViewClientFlutterApiImpl != null) {
                webViewClientFlutterApiImpl.urlLoading(this, webView, str, g2.a);
            }
            return this.shouldOverrideUrlLoading;
        }
    }

    public WebViewClientHostApiImpl(InstanceManager instanceManager2, WebViewClientCreator webViewClientCreator2, WebViewClientFlutterApiImpl webViewClientFlutterApiImpl) {
        this.instanceManager = instanceManager2;
        this.webViewClientCreator = webViewClientCreator2;
        this.flutterApi = webViewClientFlutterApiImpl;
    }

    public void create(Long l2, Boolean bool) {
        this.instanceManager.addInstance(this.webViewClientCreator.createWebViewClient(this.flutterApi, bool.booleanValue()), l2.longValue());
    }
}
