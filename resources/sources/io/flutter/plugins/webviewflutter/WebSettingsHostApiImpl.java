package io.flutter.plugins.webviewflutter;

import android.webkit.WebSettings;
import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public class WebSettingsHostApiImpl implements GeneratedAndroidWebView.WebSettingsHostApi {
    private final InstanceManager instanceManager;
    private final WebSettingsCreator webSettingsCreator;

    public static class WebSettingsCreator {
        public WebSettings createWebSettings(WebView webView) {
            return webView.getSettings();
        }
    }

    public WebSettingsHostApiImpl(InstanceManager instanceManager2, WebSettingsCreator webSettingsCreator2) {
        this.instanceManager = instanceManager2;
        this.webSettingsCreator = webSettingsCreator2;
    }

    public void create(Long l2, Long l3) {
        this.instanceManager.addInstance(this.webSettingsCreator.createWebSettings((WebView) this.instanceManager.getInstance(l3.longValue())), l2.longValue());
    }

    public void dispose(Long l2) {
        this.instanceManager.removeInstanceWithId(l2.longValue());
    }

    public void setAllowFileAccess(Long l2, Boolean bool) {
        ((WebSettings) this.instanceManager.getInstance(l2.longValue())).setAllowFileAccess(bool.booleanValue());
    }

    public void setBuiltInZoomControls(Long l2, Boolean bool) {
        ((WebSettings) this.instanceManager.getInstance(l2.longValue())).setBuiltInZoomControls(bool.booleanValue());
    }

    public void setDisplayZoomControls(Long l2, Boolean bool) {
        ((WebSettings) this.instanceManager.getInstance(l2.longValue())).setDisplayZoomControls(bool.booleanValue());
    }

    public void setDomStorageEnabled(Long l2, Boolean bool) {
        ((WebSettings) this.instanceManager.getInstance(l2.longValue())).setDomStorageEnabled(bool.booleanValue());
    }

    public void setJavaScriptCanOpenWindowsAutomatically(Long l2, Boolean bool) {
        ((WebSettings) this.instanceManager.getInstance(l2.longValue())).setJavaScriptCanOpenWindowsAutomatically(bool.booleanValue());
    }

    public void setJavaScriptEnabled(Long l2, Boolean bool) {
        ((WebSettings) this.instanceManager.getInstance(l2.longValue())).setJavaScriptEnabled(bool.booleanValue());
    }

    public void setLoadWithOverviewMode(Long l2, Boolean bool) {
        ((WebSettings) this.instanceManager.getInstance(l2.longValue())).setLoadWithOverviewMode(bool.booleanValue());
    }

    public void setMediaPlaybackRequiresUserGesture(Long l2, Boolean bool) {
        ((WebSettings) this.instanceManager.getInstance(l2.longValue())).setMediaPlaybackRequiresUserGesture(bool.booleanValue());
    }

    public void setSupportMultipleWindows(Long l2, Boolean bool) {
        ((WebSettings) this.instanceManager.getInstance(l2.longValue())).setSupportMultipleWindows(bool.booleanValue());
    }

    public void setSupportZoom(Long l2, Boolean bool) {
        ((WebSettings) this.instanceManager.getInstance(l2.longValue())).setSupportZoom(bool.booleanValue());
    }

    public void setUseWideViewPort(Long l2, Boolean bool) {
        ((WebSettings) this.instanceManager.getInstance(l2.longValue())).setUseWideViewPort(bool.booleanValue());
    }

    public void setUserAgentString(Long l2, String str) {
        ((WebSettings) this.instanceManager.getInstance(l2.longValue())).setUserAgentString(str);
    }
}
