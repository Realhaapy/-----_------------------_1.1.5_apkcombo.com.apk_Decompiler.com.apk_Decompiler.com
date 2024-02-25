package com.facebook.y0.q0;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.internal.b0;
import com.facebook.internal.c0;
import com.facebook.internal.d0;
import com.facebook.y0.a0;
import com.facebook.y0.g0;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import m.y.d.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class i {
    public static final i a = new i();
    private static final String b = "com.facebook.y0.q0.i";
    private static final g0 c = new g0(com.facebook.g0.c());

    private static final class a {
        private BigDecimal a;
        private Currency b;
        private Bundle c;

        public a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            l.d(bigDecimal, "purchaseAmount");
            l.d(currency, "currency");
            l.d(bundle, "param");
            this.a = bigDecimal;
            this.b = currency;
            this.c = bundle;
        }

        public final Currency a() {
            return this.b;
        }

        public final Bundle b() {
            return this.c;
        }

        public final BigDecimal c() {
            return this.a;
        }
    }

    static {
        com.facebook.g0 g0Var = com.facebook.g0.a;
    }

    private i() {
    }

    private final a a(String str, String str2) {
        return b(str, str2, new HashMap());
    }

    private final a b(String str, String str2, Map<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            boolean z = true;
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
            String optString = jSONObject2.optString("type");
            bundle.putCharSequence("fb_iap_product_type", optString);
            if (l.a(optString, "subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String optString2 = jSONObject2.optString("introductoryPriceCycles");
                l.c(optString2, "introductoryPriceCycles");
                if (optString2.length() != 0) {
                    z = false;
                }
                if (!z) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", optString2);
                }
            }
            for (Map.Entry next : map.entrySet()) {
                bundle.putCharSequence((String) next.getKey(), (String) next.getValue());
            }
            BigDecimal bigDecimal = new BigDecimal(((double) jSONObject2.getLong("price_amount_micros")) / 1000000.0d);
            Currency instance = Currency.getInstance(jSONObject2.getString("price_currency_code"));
            l.c(instance, "getInstance(skuDetailsJSON.getString(\"price_currency_code\"))");
            return new a(bigDecimal, instance, bundle);
        } catch (JSONException e2) {
            Log.e(b, "Error parsing in-app subscription data.", e2);
            return null;
        }
    }

    public static final boolean c() {
        com.facebook.g0 g0Var = com.facebook.g0.a;
        String d2 = com.facebook.g0.d();
        d0 d0Var = d0.a;
        c0 c2 = d0.c(d2);
        return c2 != null && com.facebook.g0.g() && c2.e();
    }

    public static final void d() {
        com.facebook.g0 g0Var = com.facebook.g0.a;
        Context c2 = com.facebook.g0.c();
        String d2 = com.facebook.g0.d();
        if (!com.facebook.g0.g()) {
            return;
        }
        if (c2 instanceof Application) {
            a0.b.a((Application) c2, d2);
        } else {
            Log.w(b, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
        }
    }

    public static final void e(String str, long j2) {
        com.facebook.g0 g0Var = com.facebook.g0.a;
        Context c2 = com.facebook.g0.c();
        String d2 = com.facebook.g0.d();
        d0 d0Var = d0.a;
        c0 n2 = d0.n(d2, false);
        if (n2 != null && n2.a() && j2 > 0) {
            g0 g0Var2 = new g0(c2);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_aa_time_spent_view_name", str);
            g0Var2.c("fb_aa_time_spent_on_view", (double) j2, bundle);
        }
    }

    public static final void f(String str, String str2, boolean z) {
        a a2;
        l.d(str, "purchase");
        l.d(str2, "skuDetails");
        i iVar = a;
        if (c() && (a2 = iVar.a(str, str2)) != null) {
            boolean z2 = false;
            if (z) {
                b0 b0Var = b0.a;
                com.facebook.g0 g0Var = com.facebook.g0.a;
                if (b0.b("app_events_if_auto_log_subs", com.facebook.g0.d(), false)) {
                    z2 = true;
                }
            }
            if (z2) {
                c.i(com.facebook.y0.o0.i.a.m(str2) ? "StartTrial" : "Subscribe", a2.c(), a2.a(), a2.b());
            } else {
                c.j(a2.c(), a2.a(), a2.b());
            }
        }
    }
}
