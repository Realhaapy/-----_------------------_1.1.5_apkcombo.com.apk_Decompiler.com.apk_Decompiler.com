package io.flutter.plugins.inapppurchase;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.h;
import com.android.billingclient.api.p;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.List;

class PluginPurchaseListener implements p {
    private final MethodChannel channel;

    PluginPurchaseListener(MethodChannel methodChannel) {
        this.channel = methodChannel;
    }

    public void onPurchasesUpdated(h hVar, List<Purchase> list) {
        HashMap hashMap = new HashMap();
        hashMap.put("billingResult", Translator.fromBillingResult(hVar));
        hashMap.put("responseCode", Integer.valueOf(hVar.b()));
        hashMap.put("purchasesList", Translator.fromPurchasesList(list));
        this.channel.invokeMethod("PurchasesUpdatedListener#onPurchasesUpdated(int, List<Purchase>)", hashMap);
    }
}
