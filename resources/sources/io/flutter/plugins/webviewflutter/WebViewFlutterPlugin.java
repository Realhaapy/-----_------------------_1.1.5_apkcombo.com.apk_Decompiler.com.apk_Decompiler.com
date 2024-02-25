package io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.platform.PlatformViewRegistry;
import io.flutter.plugins.webviewflutter.DownloadListenerHostApiImpl;
import io.flutter.plugins.webviewflutter.FlutterAssetManager;
import io.flutter.plugins.webviewflutter.JavaScriptChannelHostApiImpl;
import io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl;
import io.flutter.plugins.webviewflutter.WebSettingsHostApiImpl;
import io.flutter.plugins.webviewflutter.WebStorageHostApiImpl;
import io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl;
import io.flutter.plugins.webviewflutter.WebViewHostApiImpl;

public class WebViewFlutterPlugin implements FlutterPlugin, ActivityAware {
    private JavaScriptChannelHostApiImpl javaScriptChannelHostApi;
    private FlutterPlugin.FlutterPluginBinding pluginBinding;
    private WebViewHostApiImpl webViewHostApi;

    public static void registerWith(PluginRegistry.Registrar registrar) {
        new WebViewFlutterPlugin().setUp(registrar.messenger(), registrar.platformViewRegistry(), registrar.activity(), registrar.view(), new FlutterAssetManager.RegistrarFlutterAssetManager(registrar.context().getAssets(), registrar));
    }

    private void setUp(BinaryMessenger binaryMessenger, PlatformViewRegistry platformViewRegistry, Context context, View view, FlutterAssetManager flutterAssetManager) {
        InstanceManager instanceManager = new InstanceManager();
        platformViewRegistry.registerViewFactory("plugins.flutter.io/webview", new FlutterWebViewFactory(instanceManager));
        this.webViewHostApi = new WebViewHostApiImpl(instanceManager, new WebViewHostApiImpl.WebViewProxy(), context, view);
        this.javaScriptChannelHostApi = new JavaScriptChannelHostApiImpl(instanceManager, new JavaScriptChannelHostApiImpl.JavaScriptChannelCreator(), new JavaScriptChannelFlutterApiImpl(binaryMessenger, instanceManager), new Handler(context.getMainLooper()));
        r2.B(binaryMessenger, this.webViewHostApi);
        m2.c(binaryMessenger, this.javaScriptChannelHostApi);
        q2.c(binaryMessenger, new WebViewClientHostApiImpl(instanceManager, new WebViewClientHostApiImpl.WebViewClientCreator(), new WebViewClientFlutterApiImpl(binaryMessenger, instanceManager)));
        n2.c(binaryMessenger, new WebChromeClientHostApiImpl(instanceManager, new WebChromeClientHostApiImpl.WebChromeClientCreator(), new WebChromeClientFlutterApiImpl(binaryMessenger, instanceManager)));
        k2.c(binaryMessenger, new DownloadListenerHostApiImpl(instanceManager, new DownloadListenerHostApiImpl.DownloadListenerCreator(), new DownloadListenerFlutterApiImpl(binaryMessenger, instanceManager)));
        o2.p(binaryMessenger, new WebSettingsHostApiImpl(instanceManager, new WebSettingsHostApiImpl.WebSettingsCreator()));
        l2.d(binaryMessenger, new FlutterAssetManagerHostApiImpl(flutterAssetManager));
        j2.d(binaryMessenger, new CookieManagerHostApiImpl());
        p2.d(binaryMessenger, new WebStorageHostApiImpl(instanceManager, new WebStorageHostApiImpl.WebStorageCreator()));
    }

    private void updateContext(Context context) {
        this.webViewHostApi.setContext(context);
        this.javaScriptChannelHostApi.setPlatformThreadHandler(new Handler(context.getMainLooper()));
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        updateContext(activityPluginBinding.getActivity());
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.pluginBinding = flutterPluginBinding;
        setUp(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getPlatformViewRegistry(), flutterPluginBinding.getApplicationContext(), (View) null, new FlutterAssetManager.PluginBindingFlutterAssetManager(flutterPluginBinding.getApplicationContext().getAssets(), flutterPluginBinding.getFlutterAssets()));
    }

    public void onDetachedFromActivity() {
        updateContext(this.pluginBinding.getApplicationContext());
    }

    public void onDetachedFromActivityForConfigChanges() {
        updateContext(this.pluginBinding.getApplicationContext());
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        updateContext(activityPluginBinding.getActivity());
    }
}
