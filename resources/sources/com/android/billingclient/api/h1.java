package com.android.billingclient.api;

import java.util.Arrays;
import org.json.JSONObject;

public final class h1 {
    private final String a;
    private final String b;

    /* synthetic */ h1(JSONObject jSONObject, g1 g1Var) {
        this.a = jSONObject.optString("productId");
        this.b = jSONObject.optString("productType");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.a.equals(h1Var.a) && this.b.equals(h1Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return String.format("{id: %s, type: %s}", new Object[]{this.a, this.b});
    }
}
