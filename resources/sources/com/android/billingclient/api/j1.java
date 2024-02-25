package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import f.e.a.c.d.d.b0;
import f.e.a.c.d.d.k;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class j1 extends BroadcastReceiver {
    /* access modifiers changed from: private */
    public final p a;
    /* access modifiers changed from: private */
    public final t0 b;
    private final f1 c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1301d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k1 f1302e;

    /* synthetic */ j1(k1 k1Var, p pVar, f1 f1Var, i1 i1Var) {
        this.f1302e = k1Var;
        this.a = pVar;
        this.c = f1Var;
        this.b = null;
    }

    /* synthetic */ j1(k1 k1Var, t0 t0Var, i1 i1Var) {
        this.f1302e = k1Var;
        this.a = null;
        this.c = null;
        this.b = null;
    }

    public final void c(Context context, IntentFilter intentFilter) {
        if (!this.f1301d) {
            context.registerReceiver(this.f1302e.b, intentFilter);
            this.f1301d = true;
        }
    }

    public final void d(Context context) {
        if (this.f1301d) {
            context.unregisterReceiver(this.f1302e.b);
            this.f1301d = false;
            return;
        }
        k.m("BillingBroadcastManager", "Receiver is not registered.");
    }

    public final void onReceive(Context context, Intent intent) {
        h h2 = k.h(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            this.a.onPurchasesUpdated(h2, k.k(intent.getExtras()));
        } else if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            Bundle extras = intent.getExtras();
            if (h2.b() != 0) {
                this.a.onPurchasesUpdated(h2, b0.s());
            } else if (this.c == null) {
                k.m("BillingBroadcastManager", "AlternativeBillingListener is null.");
                this.a.onPurchasesUpdated(q0.f1312j, b0.s());
            } else if (extras == null) {
                k.m("BillingBroadcastManager", "Bundle is null.");
                this.a.onPurchasesUpdated(q0.f1312j, b0.s());
            } else {
                String string = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    try {
                        JSONArray optJSONArray = new JSONObject(string).optJSONArray("products");
                        ArrayList arrayList = new ArrayList();
                        if (optJSONArray != null) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                                if (optJSONObject != null) {
                                    arrayList.add(new h1(optJSONObject, (g1) null));
                                }
                            }
                        }
                        this.c.a();
                    } catch (JSONException unused) {
                        k.m("BillingBroadcastManager", String.format("Error when parsing invalid alternative choice data: [%s]", new Object[]{string}));
                        this.a.onPurchasesUpdated(q0.f1312j, b0.s());
                    }
                } else {
                    k.m("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                    this.a.onPurchasesUpdated(q0.f1312j, b0.s());
                }
            }
        }
    }
}
