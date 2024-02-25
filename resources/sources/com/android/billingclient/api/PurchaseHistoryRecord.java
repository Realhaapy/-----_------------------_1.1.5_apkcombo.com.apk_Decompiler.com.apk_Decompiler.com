package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class PurchaseHistoryRecord {
    private final String a;
    private final String b;
    private final JSONObject c;

    public PurchaseHistoryRecord(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = new JSONObject(str);
    }

    private final ArrayList h() {
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

    public String a() {
        return this.c.optString("developerPayload");
    }

    public String b() {
        return this.a;
    }

    public long c() {
        return this.c.optLong("purchaseTime");
    }

    public String d() {
        JSONObject jSONObject = this.c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public int e() {
        return this.c.optInt("quantity", 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.a, purchaseHistoryRecord.b()) && TextUtils.equals(this.b, purchaseHistoryRecord.f());
    }

    public String f() {
        return this.b;
    }

    @Deprecated
    public ArrayList<String> g() {
        return h();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.a));
    }
}
