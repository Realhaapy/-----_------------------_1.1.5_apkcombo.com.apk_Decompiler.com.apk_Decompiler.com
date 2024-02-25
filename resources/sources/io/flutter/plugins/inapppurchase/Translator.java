package io.flutter.plugins.inapppurchase;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.a;
import com.android.billingclient.api.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;

class Translator {
    Translator() {
    }

    static String currencySymbolFromCode(String str) {
        return Currency.getInstance(str).getSymbol();
    }

    static HashMap<String, Object> fromBillingResult(h hVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("responseCode", Integer.valueOf(hVar.b()));
        hashMap.put("debugMessage", hVar.a());
        return hashMap;
    }

    static HashMap<String, Object> fromPurchase(Purchase purchase) {
        HashMap<String, Object> hashMap = new HashMap<>();
        ArrayList<String> k2 = purchase.k();
        hashMap.put("orderId", purchase.c());
        hashMap.put("packageName", purchase.e());
        hashMap.put("purchaseTime", Long.valueOf(purchase.g()));
        hashMap.put("purchaseToken", purchase.h());
        hashMap.put("signature", purchase.j());
        hashMap.put("skus", k2);
        hashMap.put("isAutoRenewing", Boolean.valueOf(purchase.m()));
        hashMap.put("originalJson", purchase.d());
        hashMap.put("developerPayload", purchase.b());
        hashMap.put("isAcknowledged", Boolean.valueOf(purchase.l()));
        hashMap.put("purchaseState", Integer.valueOf(purchase.f()));
        hashMap.put("quantity", Integer.valueOf(purchase.i()));
        a a = purchase.a();
        if (a != null) {
            hashMap.put("obfuscatedAccountId", a.a());
            hashMap.put("obfuscatedProfileId", a.b());
        }
        return hashMap;
    }

    static HashMap<String, Object> fromPurchaseHistoryRecord(PurchaseHistoryRecord purchaseHistoryRecord) {
        HashMap<String, Object> hashMap = new HashMap<>();
        ArrayList<String> g2 = purchaseHistoryRecord.g();
        hashMap.put("purchaseTime", Long.valueOf(purchaseHistoryRecord.c()));
        hashMap.put("purchaseToken", purchaseHistoryRecord.d());
        hashMap.put("signature", purchaseHistoryRecord.f());
        hashMap.put("skus", g2);
        hashMap.put("developerPayload", purchaseHistoryRecord.a());
        hashMap.put("originalJson", purchaseHistoryRecord.b());
        hashMap.put("quantity", Integer.valueOf(purchaseHistoryRecord.e()));
        return hashMap;
    }

    static List<HashMap<String, Object>> fromPurchaseHistoryRecordList(List<PurchaseHistoryRecord> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (PurchaseHistoryRecord fromPurchaseHistoryRecord : list) {
            arrayList.add(fromPurchaseHistoryRecord(fromPurchaseHistoryRecord));
        }
        return arrayList;
    }

    static List<HashMap<String, Object>> fromPurchasesList(List<Purchase> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Purchase fromPurchase : list) {
            arrayList.add(fromPurchase(fromPurchase));
        }
        return arrayList;
    }

    static HashMap<String, Object> fromSkuDetail(SkuDetails skuDetails) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("title", skuDetails.n());
        hashMap.put("description", skuDetails.a());
        hashMap.put("freeTrialPeriod", skuDetails.b());
        hashMap.put("introductoryPrice", skuDetails.c());
        hashMap.put("introductoryPriceAmountMicros", Long.valueOf(skuDetails.d()));
        hashMap.put("introductoryPriceCycles", Integer.valueOf(skuDetails.e()));
        hashMap.put("introductoryPricePeriod", skuDetails.f());
        hashMap.put("price", skuDetails.i());
        hashMap.put("priceAmountMicros", Long.valueOf(skuDetails.j()));
        hashMap.put("priceCurrencyCode", skuDetails.k());
        hashMap.put("priceCurrencySymbol", currencySymbolFromCode(skuDetails.k()));
        hashMap.put("sku", skuDetails.l());
        hashMap.put("type", skuDetails.o());
        hashMap.put("subscriptionPeriod", skuDetails.m());
        hashMap.put("originalPrice", skuDetails.g());
        hashMap.put("originalPriceAmountMicros", Long.valueOf(skuDetails.h()));
        return hashMap;
    }

    static List<HashMap<String, Object>> fromSkuDetailsList(List<SkuDetails> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (SkuDetails fromSkuDetail : list) {
            arrayList.add(fromSkuDetail(fromSkuDetail));
        }
        return arrayList;
    }
}
