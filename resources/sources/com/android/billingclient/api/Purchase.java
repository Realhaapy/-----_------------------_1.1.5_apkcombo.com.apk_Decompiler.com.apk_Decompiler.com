package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class Purchase {
    private final String a;
    private final String b;
    private final JSONObject c;

    public Purchase(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = new JSONObject(str);
    }

    private final ArrayList n() {
        ArrayList arrayList = new ArrayList();
        if (this.c.has("productIds")) {
            JSONArray optJSONArray = this.c.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    arrayList.add(optJSONArray.optString(i2));
                }
            }
        } else if (this.c.has("productId")) {
            arrayList.add(this.c.optString("productId"));
        }
        return arrayList;
    }

    public a a() {
        String optString = this.c.optString("obfuscatedAccountId");
        String optString2 = this.c.optString("obfuscatedProfileId");
        if (optString == null && optString2 == null) {
            return null;
        }
        return new a(optString, optString2);
    }

    public String b() {
        return this.c.optString("developerPayload");
    }

    public String c() {
        return this.c.optString("orderId");
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.c.optString("packageName");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.a, purchase.d()) && TextUtils.equals(this.b, purchase.j());
    }

    public int f() {
        return this.c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public long g() {
        return this.c.optLong("purchaseTime");
    }

    public String h() {
        JSONObject jSONObject = this.c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public int i() {
        return this.c.optInt("quantity", 1);
    }

    public String j() {
        return this.b;
    }

    @Deprecated
    public ArrayList<String> k() {
        return n();
    }

    public boolean l() {
        return this.c.optBoolean("acknowledged", true);
    }

    public boolean m() {
        return this.c.optBoolean("autoRenewing");
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.a));
    }
}
