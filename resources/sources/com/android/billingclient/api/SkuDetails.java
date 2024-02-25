package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

@Deprecated
public class SkuDetails {
    private final String a;
    private final JSONObject b;

    public SkuDetails(String str) {
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        } else if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public String a() {
        return this.b.optString("description");
    }

    public String b() {
        return this.b.optString("freeTrialPeriod");
    }

    public String c() {
        return this.b.optString("introductoryPrice");
    }

    public long d() {
        return this.b.optLong("introductoryPriceAmountMicros");
    }

    public int e() {
        return this.b.optInt("introductoryPriceCycles");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuDetails)) {
            return false;
        }
        return TextUtils.equals(this.a, ((SkuDetails) obj).a);
    }

    public String f() {
        return this.b.optString("introductoryPricePeriod");
    }

    public String g() {
        return this.b.has("original_price") ? this.b.optString("original_price") : i();
    }

    public long h() {
        return this.b.has("original_price_micros") ? this.b.optLong("original_price_micros") : j();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String i() {
        return this.b.optString("price");
    }

    public long j() {
        return this.b.optLong("price_amount_micros");
    }

    public String k() {
        return this.b.optString("price_currency_code");
    }

    public String l() {
        return this.b.optString("productId");
    }

    public String m() {
        return this.b.optString("subscriptionPeriod");
    }

    public String n() {
        return this.b.optString("title");
    }

    public String o() {
        return this.b.optString("type");
    }

    public int p() {
        return this.b.optInt("offer_type");
    }

    public String q() {
        return this.b.optString("offer_id");
    }

    public String r() {
        String optString = this.b.optString("offerIdToken");
        return optString.isEmpty() ? this.b.optString("offer_id_token") : optString;
    }

    public final String s() {
        return this.b.optString("packageName");
    }

    public String t() {
        return this.b.optString("serializedDocid");
    }

    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.a));
    }

    /* access modifiers changed from: package-private */
    public final String u() {
        return this.b.optString("skuDetailsToken");
    }
}
