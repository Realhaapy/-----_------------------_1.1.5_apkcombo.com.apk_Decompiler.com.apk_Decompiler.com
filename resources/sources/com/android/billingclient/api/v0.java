package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.h;
import f.e.a.c.d.d.k;
import java.util.ArrayList;

final class v0 {
    static h a(Bundle bundle, String str, String str2) {
        String format;
        h hVar = q0.f1312j;
        if (bundle == null) {
            format = String.format("%s got null owned items list", new Object[]{str2});
        } else {
            int b = k.b(bundle, "BillingClient");
            String i2 = k.i(bundle, "BillingClient");
            h.a c = h.c();
            c.c(b);
            c.b(i2);
            h a = c.a();
            if (b != 0) {
                k.m("BillingClient", String.format("%s failed. Response code: %s", new Object[]{str2, Integer.valueOf(b)}));
                return a;
            } else if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                format = String.format("Bundle returned from %s doesn't contain required fields.", new Object[]{str2});
            } else {
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                if (stringArrayList == null) {
                    format = String.format("Bundle returned from %s contains null SKUs list.", new Object[]{str2});
                } else if (stringArrayList2 == null) {
                    format = String.format("Bundle returned from %s contains null purchases list.", new Object[]{str2});
                } else if (stringArrayList3 != null) {
                    return q0.f1314l;
                } else {
                    format = String.format("Bundle returned from %s contains null signatures list.", new Object[]{str2});
                }
            }
        }
        k.m("BillingClient", format);
        return hVar;
    }
}
