package io.flutter.plugins.inapppurchase;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.b;
import com.android.billingclient.api.c;
import com.android.billingclient.api.d;
import com.android.billingclient.api.f;
import com.android.billingclient.api.g;
import com.android.billingclient.api.h;
import com.android.billingclient.api.i;
import com.android.billingclient.api.j;
import com.android.billingclient.api.l;
import com.android.billingclient.api.n;
import com.android.billingclient.api.o;
import com.android.billingclient.api.q;
import com.android.billingclient.api.r;
import com.android.billingclient.api.s;
import com.android.billingclient.api.t;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.List;

class MethodCallHandlerImpl implements MethodChannel.MethodCallHandler, Application.ActivityLifecycleCallbacks {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String LOAD_SKU_DOC_URL = "https://github.com/flutter/plugins/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale";
    private static final String TAG = "InAppPurchasePlugin";
    private Activity activity;
    private final Context applicationContext;
    private d billingClient;
    private final BillingClientFactory billingClientFactory;
    private HashMap<String, SkuDetails> cachedSkus = new HashMap<>();
    /* access modifiers changed from: private */
    public final MethodChannel methodChannel;

    static {
        Class<MethodCallHandlerImpl> cls = MethodCallHandlerImpl.class;
    }

    MethodCallHandlerImpl(Activity activity2, Context context, MethodChannel methodChannel2, BillingClientFactory billingClientFactory2) {
        this.billingClientFactory = billingClientFactory2;
        this.applicationContext = context;
        this.activity = activity2;
        this.methodChannel = methodChannel2;
    }

    private void acknowledgePurchase(String str, final MethodChannel.Result result) {
        if (!billingClientError(result)) {
            b.a b = b.b();
            b.b(str);
            this.billingClient.a(b.a(), new c() {
                public void onAcknowledgePurchaseResponse(h hVar) {
                    result.success(Translator.fromBillingResult(hVar));
                }
            });
        }
    }

    private boolean billingClientError(MethodChannel.Result result) {
        if (this.billingClient != null) {
            return false;
        }
        result.error("UNAVAILABLE", "BillingClient is unset. Try reconnecting.", (Object) null);
        return true;
    }

    private void consumeAsync(String str, final MethodChannel.Result result) {
        if (!billingClientError(result)) {
            AnonymousClass2 r0 = new j() {
                public void onConsumeResponse(h hVar, String str) {
                    result.success(Translator.fromBillingResult(hVar));
                }
            };
            i.a b = i.b();
            b.b(str);
            this.billingClient.b(b.a(), r0);
        }
    }

    private void endBillingClientConnection() {
        d dVar = this.billingClient;
        if (dVar != null) {
            dVar.c();
            this.billingClient = null;
        }
    }

    private void endConnection(MethodChannel.Result result) {
        endBillingClientConnection();
        result.success((Object) null);
    }

    private void getConnectionState(MethodChannel.Result result) {
        if (!billingClientError(result)) {
            HashMap hashMap = new HashMap();
            hashMap.put("connectionState", Integer.valueOf(this.billingClient.d()));
            result.success(hashMap);
        }
    }

    private void isFeatureSupported(String str, MethodChannel.Result result) {
        if (!billingClientError(result)) {
            result.success(Boolean.valueOf(this.billingClient.e(str).b() == 0));
        }
    }

    private void isReady(MethodChannel.Result result) {
        if (!billingClientError(result)) {
            result.success(Boolean.valueOf(this.billingClient.f()));
        }
    }

    private void launchBillingFlow(String str, String str2, String str3, String str4, String str5, int i2, MethodChannel.Result result) {
        if (!billingClientError(result)) {
            SkuDetails skuDetails = this.cachedSkus.get(str);
            if (skuDetails == null) {
                result.error("NOT_FOUND", String.format("Details for sku %s are not available. It might because skus were not fetched prior to the call. Please fetch the skus first. An example of how to fetch the skus could be found here: %s", new Object[]{str, LOAD_SKU_DOC_URL}), (Object) null);
            } else if (str4 == null && i2 != 0) {
                result.error("IN_APP_PURCHASE_REQUIRE_OLD_SKU", "launchBillingFlow failed because oldSku is null. You must provide a valid oldSku in order to use a proration mode.", (Object) null);
            } else if (str4 != null && !this.cachedSkus.containsKey(str4)) {
                result.error("IN_APP_PURCHASE_INVALID_OLD_SKU", String.format("Details for sku %s are not available. It might because skus were not fetched prior to the call. Please fetch the skus first. An example of how to fetch the skus could be found here: %s", new Object[]{str4, LOAD_SKU_DOC_URL}), (Object) null);
            } else if (this.activity == null) {
                result.error("ACTIVITY_UNAVAILABLE", "Details for sku " + str + " are not available. This method must be run with the app in foreground.", (Object) null);
            } else {
                g.a a = g.a();
                a.d(skuDetails);
                if (str2 != null && !str2.isEmpty()) {
                    a.b(str2);
                }
                if (str3 != null && !str3.isEmpty()) {
                    a.c(str3);
                }
                g.c.a a2 = g.c.a();
                if (!(str4 == null || str4.isEmpty() || str5 == null)) {
                    a2.b(str5);
                    a2.d(i2);
                    a.e(a2.a());
                }
                result.success(Translator.fromBillingResult(this.billingClient.g(this.activity, a.a())));
            }
        }
    }

    private void launchPriceChangeConfirmationFlow(String str, MethodChannel.Result result) {
        if (this.activity == null) {
            result.error("ACTIVITY_UNAVAILABLE", "launchPriceChangeConfirmationFlow is not available. This method must be run with the app in foreground.", (Object) null);
        } else if (!billingClientError(result)) {
            SkuDetails skuDetails = this.cachedSkus.get(str);
            if (skuDetails == null) {
                result.error("NOT_FOUND", String.format("Details for sku %s are not available. It might because skus were not fetched prior to the call. Please fetch the skus first. An example of how to fetch the skus could be found here: %s", new Object[]{str, LOAD_SKU_DOC_URL}), (Object) null);
                return;
            }
            l.a aVar = new l.a();
            aVar.b(skuDetails);
            this.billingClient.h(this.activity, aVar.a(), new a(result));
        }
    }

    private void queryPurchaseHistoryAsync(String str, final MethodChannel.Result result) {
        if (!billingClientError(result)) {
            d dVar = this.billingClient;
            q.a a = q.a();
            a.b(str);
            dVar.j(a.a(), new n() {
                public void onPurchaseHistoryResponse(h hVar, List<PurchaseHistoryRecord> list) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("billingResult", Translator.fromBillingResult(hVar));
                    hashMap.put("purchaseHistoryRecordList", Translator.fromPurchaseHistoryRecordList(list));
                    result.success(hashMap);
                }
            });
        }
    }

    private void queryPurchasesAsync(String str, final MethodChannel.Result result) {
        if (!billingClientError(result)) {
            r.a a = r.a();
            a.b(str);
            this.billingClient.k(a.a(), new o() {
                public void onQueryPurchasesResponse(h hVar, List<Purchase> list) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("responseCode", 0);
                    hashMap.put("billingResult", Translator.fromBillingResult(hVar));
                    hashMap.put("purchasesList", Translator.fromPurchasesList(list));
                    result.success(hashMap);
                }
            });
        }
    }

    private void querySkuDetailsAsync(String str, List<String> list, final MethodChannel.Result result) {
        if (!billingClientError(result)) {
            s.a c = s.c();
            c.c(str);
            c.b(list);
            this.billingClient.l(c.a(), new t() {
                public void onSkuDetailsResponse(h hVar, List<SkuDetails> list) {
                    MethodCallHandlerImpl.this.updateCachedSkus(list);
                    HashMap hashMap = new HashMap();
                    hashMap.put("billingResult", Translator.fromBillingResult(hVar));
                    hashMap.put("skuDetailsList", Translator.fromSkuDetailsList(list));
                    result.success(hashMap);
                }
            });
        }
    }

    private void startConnection(final int i2, final MethodChannel.Result result) {
        if (this.billingClient == null) {
            this.billingClient = this.billingClientFactory.createBillingClient(this.applicationContext, this.methodChannel);
        }
        this.billingClient.m(new f() {
            private boolean alreadyFinished = false;

            public void onBillingServiceDisconnected() {
                HashMap hashMap = new HashMap();
                hashMap.put("handle", Integer.valueOf(i2));
                MethodCallHandlerImpl.this.methodChannel.invokeMethod("BillingClientStateListener#onBillingServiceDisconnected()", hashMap);
            }

            public void onBillingSetupFinished(h hVar) {
                if (this.alreadyFinished) {
                    Log.d(MethodCallHandlerImpl.TAG, "Tried to call onBillingSetupFinished multiple times.");
                    return;
                }
                this.alreadyFinished = true;
                result.success(Translator.fromBillingResult(hVar));
            }
        });
    }

    /* access modifiers changed from: private */
    public void updateCachedSkus(List<SkuDetails> list) {
        if (list != null) {
            for (SkuDetails next : list) {
                this.cachedSkus.put(next.l(), next);
            }
        }
    }

    public void onActivityCreated(Activity activity2, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity2) {
        Context context;
        if (this.activity == activity2 && (context = this.applicationContext) != null) {
            ((Application) context).unregisterActivityLifecycleCallbacks(this);
            endBillingClientConnection();
        }
    }

    public void onActivityPaused(Activity activity2) {
    }

    public void onActivityResumed(Activity activity2) {
    }

    public void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity2) {
    }

    public void onActivityStopped(Activity activity2) {
    }

    /* access modifiers changed from: package-private */
    public void onDetachedFromActivity() {
        endBillingClientConnection();
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2134967352:
                if (str.equals("BillingClient#(AcknowledgePurchaseParams params, (AcknowledgePurchaseParams, AcknowledgePurchaseResponseListener)")) {
                    c = 0;
                    break;
                }
                break;
            case -1785095395:
                if (str.equals("BillingClient#isReady()")) {
                    c = 1;
                    break;
                }
                break;
            case -1308170612:
                if (str.equals("BillingClient#launchBillingFlow(Activity, BillingFlowParams)")) {
                    c = 2;
                    break;
                }
                break;
            case -777997521:
                if (str.equals("BillingClient#isFeatureSupported(String)")) {
                    c = 3;
                    break;
                }
                break;
            case -559727558:
                if (str.equals("BillingClient#queryPurchaseHistoryAsync(String, PurchaseHistoryResponseListener)")) {
                    c = 4;
                    break;
                }
                break;
            case -147687227:
                if (str.equals("BillingClient#startConnection(BillingClientStateListener)")) {
                    c = 5;
                    break;
                }
                break;
            case -122324251:
                if (str.equals("BillingClient#queryPurchasesAsync(String)")) {
                    c = 6;
                    break;
                }
                break;
            case -40639596:
                if (str.equals("BillingClient#querySkuDetailsAsync(SkuDetailsParams, SkuDetailsResponseListener)")) {
                    c = 7;
                    break;
                }
                break;
            case 494138664:
                if (str.equals("BillingClient#consumeAsync(String, ConsumeResponseListener)")) {
                    c = 8;
                    break;
                }
                break;
            case 621918779:
                if (str.equals("BillingClient#getConnectionState()")) {
                    c = 9;
                    break;
                }
                break;
            case 1259193041:
                if (str.equals("BillingClient#launchPriceChangeConfirmationFlow (Activity, PriceChangeFlowParams, PriceChangeConfirmationListener)")) {
                    c = 10;
                    break;
                }
                break;
            case 1792566365:
                if (str.equals("BillingClient#endConnection()")) {
                    c = 11;
                    break;
                }
                break;
            case 1984747959:
                if (str.equals("BillingClient#queryPurchases(String)")) {
                    c = 12;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                acknowledgePurchase((String) methodCall.argument("purchaseToken"), result);
                return;
            case 1:
                isReady(result);
                return;
            case 2:
                launchBillingFlow((String) methodCall.argument("sku"), (String) methodCall.argument("accountId"), (String) methodCall.argument("obfuscatedProfileId"), (String) methodCall.argument("oldSku"), (String) methodCall.argument("purchaseToken"), methodCall.hasArgument("prorationMode") ? ((Integer) methodCall.argument("prorationMode")).intValue() : 0, result);
                return;
            case 3:
                isFeatureSupported((String) methodCall.argument("feature"), result);
                return;
            case 4:
                Log.e("flutter", (String) methodCall.argument("skuType"));
                queryPurchaseHistoryAsync((String) methodCall.argument("skuType"), result);
                return;
            case 5:
                startConnection(((Integer) methodCall.argument("handle")).intValue(), result);
                return;
            case 6:
            case 12:
                queryPurchasesAsync((String) methodCall.argument("skuType"), result);
                return;
            case 7:
                querySkuDetailsAsync((String) methodCall.argument("skuType"), (List) methodCall.argument("skusList"), result);
                return;
            case 8:
                consumeAsync((String) methodCall.argument("purchaseToken"), result);
                return;
            case 9:
                getConnectionState(result);
                return;
            case 10:
                launchPriceChangeConfirmationFlow((String) methodCall.argument("sku"), result);
                return;
            case 11:
                endConnection(result);
                return;
            default:
                result.notImplemented();
                return;
        }
    }

    /* access modifiers changed from: package-private */
    public void setActivity(Activity activity2) {
        this.activity = activity2;
    }
}
