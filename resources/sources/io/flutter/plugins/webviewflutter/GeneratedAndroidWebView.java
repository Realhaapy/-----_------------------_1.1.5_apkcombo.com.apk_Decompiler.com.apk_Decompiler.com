package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAndroidWebView {

    public interface CookieManagerHostApi {
        void clearCookies(Result<Boolean> result);

        void setCookie(String str, String str2);
    }

    private static class CookieManagerHostApiCodec extends StandardMessageCodec {
        public static final CookieManagerHostApiCodec INSTANCE = new CookieManagerHostApiCodec();

        private CookieManagerHostApiCodec() {
        }
    }

    public static class DownloadListenerFlutterApi {
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t);
        }

        public DownloadListenerFlutterApi(BinaryMessenger binaryMessenger2) {
            this.binaryMessenger = binaryMessenger2;
        }

        static MessageCodec<Object> getCodec() {
            return DownloadListenerFlutterApiCodec.INSTANCE;
        }

        public void dispose(Long l2, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.DownloadListenerFlutterApi.dispose", getCodec()).send(new ArrayList(Arrays.asList(new Long[]{l2})), new f(reply));
        }

        public void onDownloadStart(Long l2, String str, String str2, String str3, String str4, Long l3, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.DownloadListenerFlutterApi.onDownloadStart", getCodec()).send(new ArrayList(Arrays.asList(new Serializable[]{l2, str, str2, str3, str4, l3})), new g(reply));
        }
    }

    private static class DownloadListenerFlutterApiCodec extends StandardMessageCodec {
        public static final DownloadListenerFlutterApiCodec INSTANCE = new DownloadListenerFlutterApiCodec();

        private DownloadListenerFlutterApiCodec() {
        }
    }

    public interface DownloadListenerHostApi {
        void create(Long l2);
    }

    private static class DownloadListenerHostApiCodec extends StandardMessageCodec {
        public static final DownloadListenerHostApiCodec INSTANCE = new DownloadListenerHostApiCodec();

        private DownloadListenerHostApiCodec() {
        }
    }

    public interface FlutterAssetManagerHostApi {
        String getAssetFilePathByName(String str);

        List<String> list(String str);
    }

    private static class FlutterAssetManagerHostApiCodec extends StandardMessageCodec {
        public static final FlutterAssetManagerHostApiCodec INSTANCE = new FlutterAssetManagerHostApiCodec();

        private FlutterAssetManagerHostApiCodec() {
        }
    }

    public static class JavaScriptChannelFlutterApi {
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t);
        }

        public JavaScriptChannelFlutterApi(BinaryMessenger binaryMessenger2) {
            this.binaryMessenger = binaryMessenger2;
        }

        static MessageCodec<Object> getCodec() {
            return JavaScriptChannelFlutterApiCodec.INSTANCE;
        }

        public void dispose(Long l2, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.JavaScriptChannelFlutterApi.dispose", getCodec()).send(new ArrayList(Arrays.asList(new Long[]{l2})), new l(reply));
        }

        public void postMessage(Long l2, String str, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.JavaScriptChannelFlutterApi.postMessage", getCodec()).send(new ArrayList(Arrays.asList(new Serializable[]{l2, str})), new k(reply));
        }
    }

    private static class JavaScriptChannelFlutterApiCodec extends StandardMessageCodec {
        public static final JavaScriptChannelFlutterApiCodec INSTANCE = new JavaScriptChannelFlutterApiCodec();

        private JavaScriptChannelFlutterApiCodec() {
        }
    }

    public interface JavaScriptChannelHostApi {
        void create(Long l2, String str);
    }

    private static class JavaScriptChannelHostApiCodec extends StandardMessageCodec {
        public static final JavaScriptChannelHostApiCodec INSTANCE = new JavaScriptChannelHostApiCodec();

        private JavaScriptChannelHostApiCodec() {
        }
    }

    public interface Result<T> {
        void error(Throwable th);

        void success(T t);
    }

    public static class WebChromeClientFlutterApi {
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t);
        }

        public WebChromeClientFlutterApi(BinaryMessenger binaryMessenger2) {
            this.binaryMessenger = binaryMessenger2;
        }

        static MessageCodec<Object> getCodec() {
            return WebChromeClientFlutterApiCodec.INSTANCE;
        }

        public void dispose(Long l2, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebChromeClientFlutterApi.dispose", getCodec()).send(new ArrayList(Arrays.asList(new Long[]{l2})), new o(reply));
        }

        public void onProgressChanged(Long l2, Long l3, Long l4, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebChromeClientFlutterApi.onProgressChanged", getCodec()).send(new ArrayList(Arrays.asList(new Long[]{l2, l3, l4})), new n(reply));
        }
    }

    private static class WebChromeClientFlutterApiCodec extends StandardMessageCodec {
        public static final WebChromeClientFlutterApiCodec INSTANCE = new WebChromeClientFlutterApiCodec();

        private WebChromeClientFlutterApiCodec() {
        }
    }

    public interface WebChromeClientHostApi {
        void create(Long l2, Long l3);
    }

    private static class WebChromeClientHostApiCodec extends StandardMessageCodec {
        public static final WebChromeClientHostApiCodec INSTANCE = new WebChromeClientHostApiCodec();

        private WebChromeClientHostApiCodec() {
        }
    }

    public static class WebResourceErrorData {
        private String description;
        private Long errorCode;

        static WebResourceErrorData fromMap(Map<String, Object> map) {
            Long l2;
            WebResourceErrorData webResourceErrorData = new WebResourceErrorData();
            Object obj = map.get("errorCode");
            if (obj == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            webResourceErrorData.errorCode = l2;
            webResourceErrorData.description = (String) map.get("description");
            return webResourceErrorData;
        }

        public String getDescription() {
            return this.description;
        }

        public Long getErrorCode() {
            return this.errorCode;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setErrorCode(Long l2) {
            this.errorCode = l2;
        }

        /* access modifiers changed from: package-private */
        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("errorCode", this.errorCode);
            hashMap.put("description", this.description);
            return hashMap;
        }
    }

    public static class WebResourceRequestData {
        private Boolean hasGesture;
        private Boolean isForMainFrame;
        private Boolean isRedirect;
        private String method;
        private Map<String, String> requestHeaders;
        private String url;

        static WebResourceRequestData fromMap(Map<String, Object> map) {
            WebResourceRequestData webResourceRequestData = new WebResourceRequestData();
            webResourceRequestData.url = (String) map.get("url");
            webResourceRequestData.isForMainFrame = (Boolean) map.get("isForMainFrame");
            webResourceRequestData.isRedirect = (Boolean) map.get("isRedirect");
            webResourceRequestData.hasGesture = (Boolean) map.get("hasGesture");
            webResourceRequestData.method = (String) map.get("method");
            webResourceRequestData.requestHeaders = (Map) map.get("requestHeaders");
            return webResourceRequestData;
        }

        public Boolean getHasGesture() {
            return this.hasGesture;
        }

        public Boolean getIsForMainFrame() {
            return this.isForMainFrame;
        }

        public Boolean getIsRedirect() {
            return this.isRedirect;
        }

        public String getMethod() {
            return this.method;
        }

        public Map<String, String> getRequestHeaders() {
            return this.requestHeaders;
        }

        public String getUrl() {
            return this.url;
        }

        public void setHasGesture(Boolean bool) {
            this.hasGesture = bool;
        }

        public void setIsForMainFrame(Boolean bool) {
            this.isForMainFrame = bool;
        }

        public void setIsRedirect(Boolean bool) {
            this.isRedirect = bool;
        }

        public void setMethod(String str) {
            this.method = str;
        }

        public void setRequestHeaders(Map<String, String> map) {
            this.requestHeaders = map;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        /* access modifiers changed from: package-private */
        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("url", this.url);
            hashMap.put("isForMainFrame", this.isForMainFrame);
            hashMap.put("isRedirect", this.isRedirect);
            hashMap.put("hasGesture", this.hasGesture);
            hashMap.put("method", this.method);
            hashMap.put("requestHeaders", this.requestHeaders);
            return hashMap;
        }
    }

    public interface WebSettingsHostApi {
        void create(Long l2, Long l3);

        void dispose(Long l2);

        void setAllowFileAccess(Long l2, Boolean bool);

        void setBuiltInZoomControls(Long l2, Boolean bool);

        void setDisplayZoomControls(Long l2, Boolean bool);

        void setDomStorageEnabled(Long l2, Boolean bool);

        void setJavaScriptCanOpenWindowsAutomatically(Long l2, Boolean bool);

        void setJavaScriptEnabled(Long l2, Boolean bool);

        void setLoadWithOverviewMode(Long l2, Boolean bool);

        void setMediaPlaybackRequiresUserGesture(Long l2, Boolean bool);

        void setSupportMultipleWindows(Long l2, Boolean bool);

        void setSupportZoom(Long l2, Boolean bool);

        void setUseWideViewPort(Long l2, Boolean bool);

        void setUserAgentString(Long l2, String str);
    }

    private static class WebSettingsHostApiCodec extends StandardMessageCodec {
        public static final WebSettingsHostApiCodec INSTANCE = new WebSettingsHostApiCodec();

        private WebSettingsHostApiCodec() {
        }
    }

    public interface WebStorageHostApi {
        void create(Long l2);

        void deleteAllData(Long l2);
    }

    private static class WebStorageHostApiCodec extends StandardMessageCodec {
        public static final WebStorageHostApiCodec INSTANCE = new WebStorageHostApiCodec();

        private WebStorageHostApiCodec() {
        }
    }

    public static class WebViewClientFlutterApi {
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t);
        }

        public WebViewClientFlutterApi(BinaryMessenger binaryMessenger2) {
            this.binaryMessenger = binaryMessenger2;
        }

        static MessageCodec<Object> getCodec() {
            return WebViewClientFlutterApiCodec.INSTANCE;
        }

        public void dispose(Long l2, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebViewClientFlutterApi.dispose", getCodec()).send(new ArrayList(Arrays.asList(new Long[]{l2})), new n0(reply));
        }

        public void onPageFinished(Long l2, Long l3, String str, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebViewClientFlutterApi.onPageFinished", getCodec()).send(new ArrayList(Arrays.asList(new Serializable[]{l2, l3, str})), new i0(reply));
        }

        public void onPageStarted(Long l2, Long l3, String str, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebViewClientFlutterApi.onPageStarted", getCodec()).send(new ArrayList(Arrays.asList(new Serializable[]{l2, l3, str})), new l0(reply));
        }

        public void onReceivedError(Long l2, Long l3, Long l4, String str, String str2, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebViewClientFlutterApi.onReceivedError", getCodec()).send(new ArrayList(Arrays.asList(new Serializable[]{l2, l3, l4, str, str2})), new k0(reply));
        }

        public void onReceivedRequestError(Long l2, Long l3, WebResourceRequestData webResourceRequestData, WebResourceErrorData webResourceErrorData, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebViewClientFlutterApi.onReceivedRequestError", getCodec()).send(new ArrayList(Arrays.asList(new Object[]{l2, l3, webResourceRequestData, webResourceErrorData})), new m0(reply));
        }

        public void requestLoading(Long l2, Long l3, WebResourceRequestData webResourceRequestData, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebViewClientFlutterApi.requestLoading", getCodec()).send(new ArrayList(Arrays.asList(new Object[]{l2, l3, webResourceRequestData})), new h0(reply));
        }

        public void urlLoading(Long l2, Long l3, String str, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebViewClientFlutterApi.urlLoading", getCodec()).send(new ArrayList(Arrays.asList(new Serializable[]{l2, l3, str})), new j0(reply));
        }
    }

    private static class WebViewClientFlutterApiCodec extends StandardMessageCodec {
        public static final WebViewClientFlutterApiCodec INSTANCE = new WebViewClientFlutterApiCodec();

        private WebViewClientFlutterApiCodec() {
        }

        /* access modifiers changed from: protected */
        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            return b != Byte.MIN_VALUE ? b != -127 ? super.readValueOfType(b, byteBuffer) : WebResourceRequestData.fromMap((Map) readValue(byteBuffer)) : WebResourceErrorData.fromMap((Map) readValue(byteBuffer));
        }

        /* access modifiers changed from: protected */
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            Map<String, Object> map;
            if (obj instanceof WebResourceErrorData) {
                byteArrayOutputStream.write(128);
                map = ((WebResourceErrorData) obj).toMap();
            } else if (obj instanceof WebResourceRequestData) {
                byteArrayOutputStream.write(129);
                map = ((WebResourceRequestData) obj).toMap();
            } else {
                super.writeValue(byteArrayOutputStream, obj);
                return;
            }
            writeValue(byteArrayOutputStream, map);
        }
    }

    public interface WebViewClientHostApi {
        void create(Long l2, Boolean bool);
    }

    private static class WebViewClientHostApiCodec extends StandardMessageCodec {
        public static final WebViewClientHostApiCodec INSTANCE = new WebViewClientHostApiCodec();

        private WebViewClientHostApiCodec() {
        }
    }

    public interface WebViewHostApi {
        void addJavaScriptChannel(Long l2, Long l3);

        Boolean canGoBack(Long l2);

        Boolean canGoForward(Long l2);

        void clearCache(Long l2, Boolean bool);

        void create(Long l2, Boolean bool);

        void dispose(Long l2);

        void evaluateJavascript(Long l2, String str, Result<String> result);

        Long getScrollX(Long l2);

        Long getScrollY(Long l2);

        String getTitle(Long l2);

        String getUrl(Long l2);

        void goBack(Long l2);

        void goForward(Long l2);

        void loadData(Long l2, String str, String str2, String str3);

        void loadDataWithBaseUrl(Long l2, String str, String str2, String str3, String str4, String str5);

        void loadUrl(Long l2, String str, Map<String, String> map);

        void postUrl(Long l2, String str, byte[] bArr);

        void reload(Long l2);

        void removeJavaScriptChannel(Long l2, Long l3);

        void scrollBy(Long l2, Long l3, Long l4);

        void scrollTo(Long l2, Long l3, Long l4);

        void setBackgroundColor(Long l2, Long l3);

        void setDownloadListener(Long l2, Long l3);

        void setWebChromeClient(Long l2, Long l3);

        void setWebContentsDebuggingEnabled(Boolean bool);

        void setWebViewClient(Long l2, Long l3);
    }

    private static class WebViewHostApiCodec extends StandardMessageCodec {
        public static final WebViewHostApiCodec INSTANCE = new WebViewHostApiCodec();

        private WebViewHostApiCodec() {
        }
    }

    /* access modifiers changed from: private */
    public static Map<String, Object> wrapError(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", (Object) null);
        return hashMap;
    }
}
