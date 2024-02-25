package io.flutter.plugins.inapppurchase;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;

public class InAppPurchasePlugin implements FlutterPlugin, ActivityAware {
    static final String PROXY_PACKAGE_KEY = "PROXY_PACKAGE";
    static final String PROXY_VALUE = "io.flutter.plugins.inapppurchase";
    private MethodCallHandlerImpl methodCallHandler;
    private MethodChannel methodChannel;

    static final class MethodNames {
        static final String ACKNOWLEDGE_PURCHASE = "BillingClient#(AcknowledgePurchaseParams params, (AcknowledgePurchaseParams, AcknowledgePurchaseResponseListener)";
        static final String CONSUME_PURCHASE_ASYNC = "BillingClient#consumeAsync(String, ConsumeResponseListener)";
        static final String END_CONNECTION = "BillingClient#endConnection()";
        static final String GET_CONNECTION_STATE = "BillingClient#getConnectionState()";
        static final String IS_FEATURE_SUPPORTED = "BillingClient#isFeatureSupported(String)";
        static final String IS_READY = "BillingClient#isReady()";
        static final String LAUNCH_BILLING_FLOW = "BillingClient#launchBillingFlow(Activity, BillingFlowParams)";
        static final String LAUNCH_PRICE_CHANGE_CONFIRMATION_FLOW = "BillingClient#launchPriceChangeConfirmationFlow (Activity, PriceChangeFlowParams, PriceChangeConfirmationListener)";
        static final String ON_DISCONNECT = "BillingClientStateListener#onBillingServiceDisconnected()";
        static final String ON_PURCHASES_UPDATED = "PurchasesUpdatedListener#onPurchasesUpdated(int, List<Purchase>)";
        static final String QUERY_PURCHASES = "BillingClient#queryPurchases(String)";
        static final String QUERY_PURCHASES_ASYNC = "BillingClient#queryPurchasesAsync(String)";
        static final String QUERY_PURCHASE_HISTORY_ASYNC = "BillingClient#queryPurchaseHistoryAsync(String, PurchaseHistoryResponseListener)";
        static final String QUERY_SKU_DETAILS = "BillingClient#querySkuDetailsAsync(SkuDetailsParams, SkuDetailsResponseListener)";
        static final String START_CONNECTION = "BillingClient#startConnection(BillingClientStateListener)";

        private MethodNames() {
        }
    }

    public static void registerWith(PluginRegistry.Registrar registrar) {
        InAppPurchasePlugin inAppPurchasePlugin = new InAppPurchasePlugin();
        registrar.activity().getIntent().putExtra(PROXY_PACKAGE_KEY, "io.flutter.plugins.inapppurchase");
        ((Application) registrar.context().getApplicationContext()).registerActivityLifecycleCallbacks(inAppPurchasePlugin.methodCallHandler);
    }

    private void setupMethodChannel(Activity activity, BinaryMessenger binaryMessenger, Context context) {
        this.methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/in_app_purchase");
        MethodCallHandlerImpl methodCallHandlerImpl = new MethodCallHandlerImpl(activity, context, this.methodChannel, new BillingClientFactoryImpl());
        this.methodCallHandler = methodCallHandlerImpl;
        this.methodChannel.setMethodCallHandler(methodCallHandlerImpl);
    }

    private void teardownMethodChannel() {
        this.methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.methodChannel = null;
        this.methodCallHandler = null;
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.getActivity().getIntent().putExtra(PROXY_PACKAGE_KEY, "io.flutter.plugins.inapppurchase");
        this.methodCallHandler.setActivity(activityPluginBinding.getActivity());
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        setupMethodChannel((Activity) null, flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    public void onDetachedFromActivity() {
        this.methodCallHandler.setActivity((Activity) null);
        this.methodCallHandler.onDetachedFromActivity();
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.methodCallHandler.setActivity((Activity) null);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        teardownMethodChannel();
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }

    /* access modifiers changed from: package-private */
    public void setMethodCallHandler(MethodCallHandlerImpl methodCallHandlerImpl) {
        this.methodCallHandler = methodCallHandlerImpl;
    }
}
