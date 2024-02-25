package com.android.billingclient.api;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.billingclient.api.h;
import f.e.a.c.d.d.b0;
import f.e.a.c.d.d.k;
import f.e.a.c.d.d.n;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;

class e extends d {
    /* access modifiers changed from: private */
    public volatile int a;
    private final String b;
    private final Handler c;

    /* renamed from: d  reason: collision with root package name */
    private volatile k1 f1276d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Context f1277e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public volatile n f1278f;

    /* renamed from: g  reason: collision with root package name */
    private volatile i0 f1279g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f1280h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public boolean f1281i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public int f1282j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public boolean f1283k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public boolean f1284l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public boolean f1285m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f1286n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public boolean f1287o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public boolean f1288p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f1289q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public boolean f1290r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public boolean f1291s;
    private boolean t;
    private boolean u;
    private ExecutorService v;

    private e(Context context, boolean z, p pVar, String str, String str2, f1 f1Var) {
        this.a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.f1282j = 0;
        this.b = str;
        n(context, pVar, z, (f1) null);
    }

    e(String str, boolean z, Context context, p pVar, f1 f1Var) {
        this(context, z, pVar, w(), (String) null, (f1) null);
    }

    e(String str, boolean z, Context context, t0 t0Var) {
        this.a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.f1282j = 0;
        this.b = w();
        Context applicationContext = context.getApplicationContext();
        this.f1277e = applicationContext;
        this.f1276d = new k1(applicationContext, (t0) null);
        this.t = z;
    }

    private final void A(String str, o oVar) {
        h v2;
        if (!f()) {
            v2 = q0.f1315m;
        } else if (TextUtils.isEmpty(str)) {
            k.m("BillingClient", "Please provide a valid product type.");
            v2 = q0.f1309g;
        } else {
            if (x(new c0(this, str, oVar), 30000, new y(oVar), t()) == null) {
                v2 = v();
            } else {
                return;
            }
        }
        oVar.onQueryPurchasesResponse(v2, b0.s());
    }

    static /* bridge */ /* synthetic */ j0 H(e eVar, String str) {
        k.l("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle g2 = k.g(eVar.f1285m, eVar.t, eVar.b);
        String str2 = null;
        while (eVar.f1283k) {
            try {
                Bundle y = eVar.f1278f.y(6, eVar.f1277e.getPackageName(), str, str2, g2);
                h a2 = v0.a(y, "BillingClient", "getPurchaseHistory()");
                if (a2 != q0.f1314l) {
                    return new j0(a2, (List) null);
                }
                ArrayList<String> stringArrayList = y.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = y.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = y.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i2 = 0;
                while (i2 < stringArrayList2.size()) {
                    String str3 = stringArrayList2.get(i2);
                    String str4 = stringArrayList3.get(i2);
                    k.l("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i2))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.d())) {
                            k.m("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchaseHistoryRecord);
                        i2++;
                    } catch (JSONException e2) {
                        k.n("BillingClient", "Got an exception trying to decode the purchase!", e2);
                        return new j0(q0.f1312j, (List) null);
                    }
                }
                str2 = y.getString("INAPP_CONTINUATION_TOKEN");
                k.l("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    return new j0(q0.f1314l, arrayList);
                }
            } catch (RemoteException e3) {
                k.n("BillingClient", "Got exception trying to get purchase history, try to reconnect", e3);
                return new j0(q0.f1315m, (List) null);
            }
        }
        k.m("BillingClient", "getPurchaseHistory is not supported on current device");
        return new j0(q0.f1319q, (List) null);
    }

    static /* bridge */ /* synthetic */ u0 J(e eVar, String str) {
        k.l("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle g2 = k.g(eVar.f1285m, eVar.t, eVar.b);
        String str2 = null;
        do {
            try {
                Bundle P = eVar.f1285m ? eVar.f1278f.P(9, eVar.f1277e.getPackageName(), str, str2, g2) : eVar.f1278f.L(3, eVar.f1277e.getPackageName(), str, str2);
                h a2 = v0.a(P, "BillingClient", "getPurchase()");
                if (a2 != q0.f1314l) {
                    return new u0(a2, (List) null);
                }
                ArrayList<String> stringArrayList = P.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = P.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = P.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i2 = 0;
                while (i2 < stringArrayList2.size()) {
                    String str3 = stringArrayList2.get(i2);
                    String str4 = stringArrayList3.get(i2);
                    k.l("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i2))));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.h())) {
                            k.m("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchase);
                        i2++;
                    } catch (JSONException e2) {
                        k.n("BillingClient", "Got an exception trying to decode the purchase!", e2);
                        return new u0(q0.f1312j, (List) null);
                    }
                }
                str2 = P.getString("INAPP_CONTINUATION_TOKEN");
                k.l("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
            } catch (Exception e3) {
                k.n("BillingClient", "Got exception trying to get purchasesm try to reconnect", e3);
                return new u0(q0.f1315m, (List) null);
            }
        } while (!TextUtils.isEmpty(str2));
        return new u0(q0.f1314l, arrayList);
    }

    private void n(Context context, p pVar, boolean z, f1 f1Var) {
        Context applicationContext = context.getApplicationContext();
        this.f1277e = applicationContext;
        this.f1276d = new k1(applicationContext, pVar, f1Var);
        this.t = z;
        this.u = f1Var != null;
    }

    /* access modifiers changed from: private */
    public final Handler t() {
        return Looper.myLooper() == null ? this.c : new Handler(Looper.myLooper());
    }

    private final h u(h hVar) {
        if (Thread.interrupted()) {
            return hVar;
        }
        this.c.post(new a0(this, hVar));
        return hVar;
    }

    /* access modifiers changed from: private */
    public final h v() {
        return (this.a == 0 || this.a == 3) ? q0.f1315m : q0.f1312j;
    }

    @SuppressLint({"PrivateApi"})
    private static String w() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get((Object) null);
        } catch (Exception unused) {
            return "5.0.0";
        }
    }

    /* access modifiers changed from: private */
    public final Future x(Callable callable, long j2, Runnable runnable, Handler handler) {
        long j3 = (long) (((double) j2) * 0.95d);
        if (this.v == null) {
            this.v = Executors.newFixedThreadPool(k.a, new e0(this));
        }
        try {
            Future submit = this.v.submit(callable);
            handler.postDelayed(new z(submit, runnable), j3);
            return submit;
        } catch (Exception e2) {
            k.n("BillingClient", "Async task throws exception!", e2);
            return null;
        }
    }

    private final void y(h hVar, k kVar) {
        if (!Thread.interrupted()) {
            this.c.post(new r1(kVar, hVar));
        }
    }

    private final void z(String str, n nVar) {
        h v2;
        if (!f()) {
            v2 = q0.f1315m;
        } else {
            if (x(new d0(this, str, nVar), 30000, new q1(nVar), t()) == null) {
                v2 = v();
            } else {
                return;
            }
        }
        nVar.onPurchaseHistoryResponse(v2, (List<PurchaseHistoryRecord>) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Bundle D(int i2, String str, String str2, g gVar, Bundle bundle) {
        return this.f1278f.u(i2, this.f1277e.getPackageName(), str, str2, (String) null, bundle);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Bundle E(String str, String str2) {
        return this.f1278f.Q(3, this.f1277e.getPackageName(), str, str2, (String) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Bundle F(String str, Bundle bundle) {
        return this.f1278f.H(8, this.f1277e.getPackageName(), str, "subs", bundle);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object L(b bVar, c cVar) {
        h hVar;
        try {
            Bundle W = this.f1278f.W(9, this.f1277e.getPackageName(), bVar.a(), k.c(bVar, this.b));
            int b2 = k.b(W, "BillingClient");
            String i2 = k.i(W, "BillingClient");
            h.a c2 = h.c();
            c2.c(b2);
            c2.b(i2);
            hVar = c2.a();
        } catch (Exception e2) {
            k.n("BillingClient", "Error acknowledge purchase!", e2);
            hVar = q0.f1315m;
        }
        cVar.onAcknowledgePurchaseResponse(hVar);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object M(i iVar, j jVar) {
        String str;
        int i2;
        String a2 = iVar.a();
        try {
            k.l("BillingClient", "Consuming purchase with token: " + a2);
            if (this.f1285m) {
                Bundle o2 = this.f1278f.o(9, this.f1277e.getPackageName(), a2, k.d(iVar, this.f1285m, this.b));
                i2 = o2.getInt("RESPONSE_CODE");
                str = k.i(o2, "BillingClient");
            } else {
                i2 = this.f1278f.m(3, this.f1277e.getPackageName(), a2);
                str = "";
            }
            h.a c2 = h.c();
            c2.c(i2);
            c2.b(str);
            h a3 = c2.a();
            if (i2 == 0) {
                k.l("BillingClient", "Successfully consumed purchase.");
            } else {
                k.m("BillingClient", "Error consuming purchase with token. Response code: " + i2);
            }
            jVar.onConsumeResponse(a3, a2);
            return null;
        } catch (Exception e2) {
            k.n("BillingClient", "Error consuming purchase!", e2);
            jVar.onConsumeResponse(q0.f1315m, a2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008a, code lost:
        f.e.a.c.d.d.k.m("BillingClient", r0);
        r0 = null;
        r4 = 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object N(java.lang.String r22, java.util.List r23, java.lang.String r24, com.android.billingclient.api.t r25) {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r2 = "BillingClient"
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r3 = r23.size()
            r5 = 0
        L_0x000e:
            r6 = 6
            r7 = 4
            java.lang.String r8 = "Item is unavailable for purchase."
            r9 = 0
            if (r5 >= r3) goto L_0x0106
            int r10 = r5 + 20
            if (r10 <= r3) goto L_0x001b
            r11 = r3
            goto L_0x001c
        L_0x001b:
            r11 = r10
        L_0x001c:
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = r23
            java.util.List r5 = r13.subList(r5, r11)
            r12.<init>(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r11 = r12.size()
            r14 = 0
        L_0x0031:
            if (r14 >= r11) goto L_0x0043
            java.lang.Object r15 = r12.get(r14)
            com.android.billingclient.api.e1 r15 = (com.android.billingclient.api.e1) r15
            java.lang.String r15 = r15.a()
            r5.add(r15)
            int r14 = r14 + 1
            goto L_0x0031
        L_0x0043:
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            java.lang.String r14 = "ITEM_ID_LIST"
            r11.putStringArrayList(r14, r5)
            java.lang.String r5 = r1.b
            java.lang.String r14 = "playBillingLibraryVersion"
            r11.putString(r14, r5)
            boolean r5 = r1.f1286n     // Catch:{ Exception -> 0x00fb }
            if (r5 == 0) goto L_0x0077
            f.e.a.c.d.d.n r15 = r1.f1278f     // Catch:{ Exception -> 0x00fb }
            r16 = 10
            android.content.Context r5 = r1.f1277e     // Catch:{ Exception -> 0x00fb }
            java.lang.String r17 = r5.getPackageName()     // Catch:{ Exception -> 0x00fb }
            int r5 = r1.f1282j     // Catch:{ Exception -> 0x00fb }
            boolean r14 = r1.t     // Catch:{ Exception -> 0x00fb }
            java.lang.String r4 = r1.b     // Catch:{ Exception -> 0x00fb }
            android.os.Bundle r20 = f.e.a.c.d.d.k.e(r5, r14, r4, r9, r12)     // Catch:{ Exception -> 0x00fb }
            r18 = r22
            r19 = r11
            android.os.Bundle r4 = r15.k(r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x00fb }
            r14 = r22
            goto L_0x0086
        L_0x0077:
            f.e.a.c.d.d.n r4 = r1.f1278f     // Catch:{ Exception -> 0x00fb }
            r5 = 3
            android.content.Context r12 = r1.f1277e     // Catch:{ Exception -> 0x00fb }
            java.lang.String r12 = r12.getPackageName()     // Catch:{ Exception -> 0x00fb }
            r14 = r22
            android.os.Bundle r4 = r4.x(r5, r12, r14, r11)     // Catch:{ Exception -> 0x00fb }
        L_0x0086:
            if (r4 != 0) goto L_0x0091
            java.lang.String r0 = "querySkuDetailsAsync got null sku details list"
        L_0x008a:
            f.e.a.c.d.d.k.m(r2, r0)
            r0 = r9
            r4 = 4
            goto L_0x0109
        L_0x0091:
            java.lang.String r5 = "DETAILS_LIST"
            boolean r11 = r4.containsKey(r5)
            if (r11 != 0) goto L_0x00c0
            int r3 = f.e.a.c.d.d.k.b(r4, r2)
            java.lang.String r8 = f.e.a.c.d.d.k.i(r4, r2)
            if (r3 == 0) goto L_0x00b9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "getSkuDetails() failed. Response code: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            f.e.a.c.d.d.k.m(r2, r4)
            r4 = r3
            goto L_0x0109
        L_0x00b9:
            java.lang.String r3 = "getSkuDetails() returned a bundle with neither an error nor a detail list."
            f.e.a.c.d.d.k.m(r2, r3)
        L_0x00be:
            r4 = 6
            goto L_0x0109
        L_0x00c0:
            java.util.ArrayList r4 = r4.getStringArrayList(r5)
            if (r4 != 0) goto L_0x00c9
            java.lang.String r0 = "querySkuDetailsAsync got null response list"
            goto L_0x008a
        L_0x00c9:
            r5 = 0
        L_0x00ca:
            int r7 = r4.size()
            if (r5 >= r7) goto L_0x00f8
            java.lang.Object r7 = r4.get(r5)
            java.lang.String r7 = (java.lang.String) r7
            com.android.billingclient.api.SkuDetails r8 = new com.android.billingclient.api.SkuDetails     // Catch:{ JSONException -> 0x00ee }
            r8.<init>(r7)     // Catch:{ JSONException -> 0x00ee }
            java.lang.String r7 = r8.toString()
            java.lang.String r11 = "Got sku details: "
            java.lang.String r7 = r11.concat(r7)
            f.e.a.c.d.d.k.l(r2, r7)
            r0.add(r8)
            int r5 = r5 + 1
            goto L_0x00ca
        L_0x00ee:
            r0 = move-exception
            java.lang.String r3 = "Got a JSON exception trying to decode SkuDetails."
            f.e.a.c.d.d.k.n(r2, r3, r0)
            java.lang.String r8 = "Error trying to decode SkuDetails."
            r0 = r9
            goto L_0x00be
        L_0x00f8:
            r5 = r10
            goto L_0x000e
        L_0x00fb:
            r0 = move-exception
            java.lang.String r3 = "querySkuDetailsAsync got a remote exception (try to reconnect)."
            f.e.a.c.d.d.k.n(r2, r3, r0)
            r4 = -1
            java.lang.String r8 = "Service connection is disconnected."
            r0 = r9
            goto L_0x0109
        L_0x0106:
            java.lang.String r8 = ""
            r4 = 0
        L_0x0109:
            com.android.billingclient.api.h$a r2 = com.android.billingclient.api.h.c()
            r2.c(r4)
            r2.b(r8)
            com.android.billingclient.api.h r2 = r2.a()
            r3 = r25
            r3.onSkuDetailsResponse(r2, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.e.N(java.lang.String, java.util.List, java.lang.String, com.android.billingclient.api.t):java.lang.Object");
    }

    public final void a(b bVar, c cVar) {
        h v2;
        if (!f()) {
            v2 = q0.f1315m;
        } else if (TextUtils.isEmpty(bVar.a())) {
            k.m("BillingClient", "Please provide a valid purchase token.");
            v2 = q0.f1311i;
        } else if (!this.f1285m) {
            v2 = q0.b;
        } else {
            if (x(new s1(this, bVar, cVar), 30000, new t1(cVar), t()) == null) {
                v2 = v();
            } else {
                return;
            }
        }
        cVar.onAcknowledgePurchaseResponse(v2);
    }

    public final void b(i iVar, j jVar) {
        h v2;
        if (!f()) {
            v2 = q0.f1315m;
        } else {
            if (x(new o1(this, iVar, jVar), 30000, new p1(jVar, iVar), t()) == null) {
                v2 = v();
            } else {
                return;
            }
        }
        jVar.onConsumeResponse(v2, iVar.a());
    }

    public final void c() {
        try {
            this.f1276d.d();
            if (this.f1279g != null) {
                this.f1279g.c();
            }
            if (!(this.f1279g == null || this.f1278f == null)) {
                k.l("BillingClient", "Unbinding from service.");
                this.f1277e.unbindService(this.f1279g);
                this.f1279g = null;
            }
            this.f1278f = null;
            ExecutorService executorService = this.v;
            if (executorService != null) {
                executorService.shutdownNow();
                this.v = null;
            }
        } catch (Exception e2) {
            k.n("BillingClient", "There was an exception while ending connection!", e2);
        } finally {
            this.a = 3;
        }
    }

    public final int d() {
        return this.a;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.android.billingclient.api.h e(java.lang.String r2) {
        /*
            r1 = this;
            boolean r0 = r1.f()
            if (r0 != 0) goto L_0x0009
            com.android.billingclient.api.h r2 = com.android.billingclient.api.q0.f1315m
            return r2
        L_0x0009:
            int r0 = r2.hashCode()
            switch(r0) {
                case -422092961: goto L_0x0062;
                case 96321: goto L_0x0058;
                case 97314: goto L_0x004e;
                case 98307: goto L_0x0044;
                case 99300: goto L_0x003a;
                case 100293: goto L_0x0030;
                case 101286: goto L_0x0025;
                case 207616302: goto L_0x001b;
                case 1987365622: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x006c
        L_0x0011:
            java.lang.String r0 = "subscriptions"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x006c
            r0 = 0
            goto L_0x006d
        L_0x001b:
            java.lang.String r0 = "priceChangeConfirmation"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x006c
            r0 = 2
            goto L_0x006d
        L_0x0025:
            java.lang.String r0 = "fff"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x006c
            r0 = 8
            goto L_0x006d
        L_0x0030:
            java.lang.String r0 = "eee"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x006c
            r0 = 7
            goto L_0x006d
        L_0x003a:
            java.lang.String r0 = "ddd"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x006c
            r0 = 5
            goto L_0x006d
        L_0x0044:
            java.lang.String r0 = "ccc"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x006c
            r0 = 6
            goto L_0x006d
        L_0x004e:
            java.lang.String r0 = "bbb"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x006c
            r0 = 3
            goto L_0x006d
        L_0x0058:
            java.lang.String r0 = "aaa"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x006c
            r0 = 4
            goto L_0x006d
        L_0x0062:
            java.lang.String r0 = "subscriptionsUpdate"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x006c
            r0 = 1
            goto L_0x006d
        L_0x006c:
            r0 = -1
        L_0x006d:
            switch(r0) {
                case 0: goto L_0x00c8;
                case 1: goto L_0x00be;
                case 2: goto L_0x00b4;
                case 3: goto L_0x00aa;
                case 4: goto L_0x00a0;
                case 5: goto L_0x0096;
                case 6: goto L_0x008c;
                case 7: goto L_0x008c;
                case 8: goto L_0x0082;
                default: goto L_0x0070;
            }
        L_0x0070:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "Unsupported feature: "
            java.lang.String r2 = r0.concat(r2)
            java.lang.String r0 = "BillingClient"
            f.e.a.c.d.d.k.m(r0, r2)
            com.android.billingclient.api.h r2 = com.android.billingclient.api.q0.x
            return r2
        L_0x0082:
            boolean r2 = r1.f1291s
            if (r2 == 0) goto L_0x0089
            com.android.billingclient.api.h r2 = com.android.billingclient.api.q0.f1314l
            goto L_0x008b
        L_0x0089:
            com.android.billingclient.api.h r2 = com.android.billingclient.api.q0.v
        L_0x008b:
            return r2
        L_0x008c:
            boolean r2 = r1.f1290r
            if (r2 == 0) goto L_0x0093
            com.android.billingclient.api.h r2 = com.android.billingclient.api.q0.f1314l
            goto L_0x0095
        L_0x0093:
            com.android.billingclient.api.h r2 = com.android.billingclient.api.q0.t
        L_0x0095:
            return r2
        L_0x0096:
            boolean r2 = r1.f1288p
            if (r2 == 0) goto L_0x009d
            com.android.billingclient.api.h r2 = com.android.billingclient.api.q0.f1314l
            goto L_0x009f
        L_0x009d:
            com.android.billingclient.api.h r2 = com.android.billingclient.api.q0.u
        L_0x009f:
            return r2
        L_0x00a0:
            boolean r2 = r1.f1289q
            if (r2 == 0) goto L_0x00a7
            com.android.billingclient.api.h r2 = com.android.billingclient.api.q0.f1314l
            goto L_0x00a9
        L_0x00a7:
            com.android.billingclient.api.h r2 = com.android.billingclient.api.q0.f1321s
        L_0x00a9:
            return r2
        L_0x00aa:
            boolean r2 = r1.f1287o
            if (r2 == 0) goto L_0x00b1
            com.android.billingclient.api.h r2 = com.android.billingclient.api.q0.f1314l
            goto L_0x00b3
        L_0x00b1:
            com.android.billingclient.api.h r2 = com.android.billingclient.api.q0.w
        L_0x00b3:
            return r2
        L_0x00b4:
            boolean r2 = r1.f1284l
            if (r2 == 0) goto L_0x00bb
            com.android.billingclient.api.h r2 = com.android.billingclient.api.q0.f1314l
            goto L_0x00bd
        L_0x00bb:
            com.android.billingclient.api.h r2 = com.android.billingclient.api.q0.f1320r
        L_0x00bd:
            return r2
        L_0x00be:
            boolean r2 = r1.f1281i
            if (r2 == 0) goto L_0x00c5
            com.android.billingclient.api.h r2 = com.android.billingclient.api.q0.f1314l
            goto L_0x00c7
        L_0x00c5:
            com.android.billingclient.api.h r2 = com.android.billingclient.api.q0.f1318p
        L_0x00c7:
            return r2
        L_0x00c8:
            boolean r2 = r1.f1280h
            if (r2 == 0) goto L_0x00cf
            com.android.billingclient.api.h r2 = com.android.billingclient.api.q0.f1314l
            goto L_0x00d1
        L_0x00cf:
            com.android.billingclient.api.h r2 = com.android.billingclient.api.q0.f1317o
        L_0x00d1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.e.e(java.lang.String):com.android.billingclient.api.h");
    }

    public final boolean f() {
        return (this.a != 2 || this.f1278f == null || this.f1279g == null) ? false : true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.android.billingclient.api.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.android.billingclient.api.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: com.android.billingclient.api.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: com.android.billingclient.api.x} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02f5 A[Catch:{ CancellationException | TimeoutException -> 0x033d, Exception -> 0x0335 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x031b A[Catch:{ CancellationException | TimeoutException -> 0x033d, Exception -> 0x0335 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.android.billingclient.api.h g(android.app.Activity r32, com.android.billingclient.api.g r33) {
        /*
            r31 = this;
            r8 = r31
            r0 = r32
            java.lang.String r1 = "proxyPackageVersion"
            java.lang.String r9 = "BUY_INTENT"
            boolean r2 = r31.f()
            if (r2 != 0) goto L_0x0014
        L_0x000e:
            com.android.billingclient.api.h r0 = com.android.billingclient.api.q0.f1315m
        L_0x0010:
            r8.u(r0)
            return r0
        L_0x0014:
            java.util.ArrayList r2 = r33.f()
            java.util.List r3 = r33.g()
            r4 = 0
            java.lang.Object r5 = f.e.a.c.d.d.g0.a(r2, r4)
            com.android.billingclient.api.SkuDetails r5 = (com.android.billingclient.api.SkuDetails) r5
            java.lang.Object r6 = f.e.a.c.d.d.g0.a(r3, r4)
            com.android.billingclient.api.g$b r6 = (com.android.billingclient.api.g.b) r6
            if (r5 == 0) goto L_0x0349
            java.lang.String r7 = r5.l()
            java.lang.String r10 = r5.o()
            java.lang.String r11 = "subs"
            boolean r11 = r10.equals(r11)
            java.lang.String r12 = "BillingClient"
            if (r11 == 0) goto L_0x004a
            boolean r11 = r8.f1280h
            if (r11 == 0) goto L_0x0042
            goto L_0x004a
        L_0x0042:
            java.lang.String r0 = "Current client doesn't support subscriptions."
            f.e.a.c.d.d.k.m(r12, r0)
            com.android.billingclient.api.h r0 = com.android.billingclient.api.q0.f1317o
            goto L_0x0010
        L_0x004a:
            boolean r11 = r33.p()
            if (r11 == 0) goto L_0x005d
            boolean r11 = r8.f1283k
            if (r11 == 0) goto L_0x0055
            goto L_0x005d
        L_0x0055:
            java.lang.String r0 = "Current client doesn't support extra params for buy intent."
            f.e.a.c.d.d.k.m(r12, r0)
            com.android.billingclient.api.h r0 = com.android.billingclient.api.q0.f1310h
            goto L_0x0010
        L_0x005d:
            int r11 = r2.size()
            r13 = 1
            if (r11 <= r13) goto L_0x0071
            boolean r11 = r8.f1290r
            if (r11 == 0) goto L_0x0069
            goto L_0x0071
        L_0x0069:
            java.lang.String r0 = "Current client doesn't support multi-item purchases."
            f.e.a.c.d.d.k.m(r12, r0)
            com.android.billingclient.api.h r0 = com.android.billingclient.api.q0.t
            goto L_0x0010
        L_0x0071:
            boolean r11 = r3.isEmpty()
            if (r11 != 0) goto L_0x0084
            boolean r11 = r8.f1291s
            if (r11 == 0) goto L_0x007c
            goto L_0x0084
        L_0x007c:
            java.lang.String r0 = "Current client doesn't support purchases with ProductDetails."
            f.e.a.c.d.d.k.m(r12, r0)
            com.android.billingclient.api.h r0 = com.android.billingclient.api.q0.v
            goto L_0x0010
        L_0x0084:
            boolean r11 = r8.f1283k
            if (r11 == 0) goto L_0x02c6
            boolean r11 = r8.f1285m
            boolean r14 = r8.t
            boolean r15 = r8.u
            java.lang.String r4 = r8.b
            r13 = r33
            android.os.Bundle r11 = f.e.a.c.d.d.k.f(r13, r11, r14, r15, r4)
            boolean r4 = r2.isEmpty()
            java.lang.String r14 = "additionalSkuTypes"
            java.lang.String r15 = "additionalSkus"
            java.lang.String r13 = "skuDetailsTokens"
            r17 = r9
            java.lang.String r9 = "SKU_OFFER_ID_TOKEN_LIST"
            if (r4 != 0) goto L_0x01b0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r18 = r10
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r19 = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r20 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r21 = r2.iterator()
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
        L_0x00d1:
            boolean r26 = r21.hasNext()
            if (r26 == 0) goto L_0x013f
            java.lang.Object r26 = r21.next()
            com.android.billingclient.api.SkuDetails r26 = (com.android.billingclient.api.SkuDetails) r26
            java.lang.String r27 = r26.u()
            boolean r27 = r27.isEmpty()
            if (r27 != 0) goto L_0x00f1
            r27 = r12
            java.lang.String r12 = r26.u()
            r4.add(r12)
            goto L_0x00f3
        L_0x00f1:
            r27 = r12
        L_0x00f3:
            java.lang.String r12 = r26.r()
            r28 = r6
            java.lang.String r6 = r26.q()
            int r29 = r26.p()
            r30 = r5
            java.lang.String r5 = r26.t()
            r0.add(r12)
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            r16 = 1
            r12 = r12 ^ 1
            r22 = r22 | r12
            r10.add(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            r6 = r6 ^ 1
            r23 = r23 | r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r29)
            r7.add(r6)
            if (r29 == 0) goto L_0x012a
            r6 = 1
            goto L_0x012b
        L_0x012a:
            r6 = 0
        L_0x012b:
            r24 = r24 | r6
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            r6 = r6 ^ 1
            r25 = r25 | r6
            r1.add(r5)
            r12 = r27
            r6 = r28
            r5 = r30
            goto L_0x00d1
        L_0x013f:
            r30 = r5
            r28 = r6
            r27 = r12
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x014e
            r11.putStringArrayList(r13, r4)
        L_0x014e:
            if (r22 == 0) goto L_0x0153
            r11.putStringArrayList(r9, r0)
        L_0x0153:
            if (r23 == 0) goto L_0x015a
            java.lang.String r0 = "SKU_OFFER_ID_LIST"
            r11.putStringArrayList(r0, r10)
        L_0x015a:
            if (r24 == 0) goto L_0x0161
            java.lang.String r0 = "SKU_OFFER_TYPE_LIST"
            r11.putIntegerArrayList(r0, r7)
        L_0x0161:
            if (r25 == 0) goto L_0x0168
            java.lang.String r0 = "SKU_SERIALIZED_DOCID_LIST"
            r11.putStringArrayList(r0, r1)
        L_0x0168:
            int r0 = r2.size()
            r1 = 1
            if (r0 <= r1) goto L_0x01fb
            java.util.ArrayList r0 = new java.util.ArrayList
            int r4 = r2.size()
            int r4 = r4 + -1
            r0.<init>(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r2.size()
            int r5 = r5 + -1
            r4.<init>(r5)
            r5 = 1
        L_0x0186:
            int r6 = r2.size()
            if (r5 >= r6) goto L_0x01a9
            java.lang.Object r6 = r2.get(r5)
            com.android.billingclient.api.SkuDetails r6 = (com.android.billingclient.api.SkuDetails) r6
            java.lang.String r6 = r6.l()
            r0.add(r6)
            java.lang.Object r6 = r2.get(r5)
            com.android.billingclient.api.SkuDetails r6 = (com.android.billingclient.api.SkuDetails) r6
            java.lang.String r6 = r6.o()
            r4.add(r6)
            int r5 = r5 + 1
            goto L_0x0186
        L_0x01a9:
            r11.putStringArrayList(r15, r0)
            r11.putStringArrayList(r14, r4)
            goto L_0x01fb
        L_0x01b0:
            r20 = r1
            r30 = r5
            r28 = r6
            r19 = r7
            r18 = r10
            r27 = r12
            r1 = 1
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r3.size()
            int r2 = r2 + -1
            r0.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = r3.size()
            int r4 = r4 + -1
            r2.<init>(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r3.size()
            if (r6 > 0) goto L_0x02b6
            r11.putStringArrayList(r9, r5)
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x01ef
            r11.putStringArrayList(r13, r4)
        L_0x01ef:
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L_0x01fb
            r11.putStringArrayList(r15, r0)
            r11.putStringArrayList(r14, r2)
        L_0x01fb:
            boolean r0 = r11.containsKey(r9)
            if (r0 == 0) goto L_0x020a
            boolean r0 = r8.f1288p
            if (r0 == 0) goto L_0x0206
            goto L_0x020a
        L_0x0206:
            com.android.billingclient.api.h r0 = com.android.billingclient.api.q0.u
            goto L_0x0010
        L_0x020a:
            if (r30 == 0) goto L_0x0222
            java.lang.String r0 = r30.s()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0222
            java.lang.String r0 = r30.s()
            java.lang.String r2 = "skuPackageName"
            r11.putString(r2, r0)
            r0 = 0
            r13 = 1
            goto L_0x0226
        L_0x0222:
            if (r28 != 0) goto L_0x02ad
            r0 = 0
            r13 = 0
        L_0x0226:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0231
            java.lang.String r1 = "accountName"
            r11.putString(r1, r0)
        L_0x0231:
            android.content.Intent r0 = r32.getIntent()
            if (r0 != 0) goto L_0x023f
            java.lang.String r0 = "Activity's intent is null."
            r9 = r27
            f.e.a.c.d.d.k.m(r9, r0)
            goto L_0x0270
        L_0x023f:
            r9 = r27
            java.lang.String r1 = "PROXY_PACKAGE"
            java.lang.String r2 = r0.getStringExtra(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0270
            java.lang.String r0 = r0.getStringExtra(r1)
            java.lang.String r1 = "proxyPackage"
            r11.putString(r1, r0)
            android.content.Context r1 = r8.f1277e     // Catch:{ NameNotFoundException -> 0x0269 }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0269 }
            r2 = 0
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x0269 }
            java.lang.String r0 = r0.versionName     // Catch:{ NameNotFoundException -> 0x0269 }
            r1 = r20
            r11.putString(r1, r0)     // Catch:{ NameNotFoundException -> 0x026b }
            goto L_0x0270
        L_0x0269:
            r1 = r20
        L_0x026b:
            java.lang.String r0 = "package not found"
            r11.putString(r1, r0)
        L_0x0270:
            boolean r0 = r8.f1291s
            if (r0 == 0) goto L_0x027f
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x027f
            r0 = 17
            r3 = 17
            goto L_0x0295
        L_0x027f:
            boolean r0 = r8.f1289q
            if (r0 == 0) goto L_0x028a
            if (r13 == 0) goto L_0x028a
            r0 = 15
            r3 = 15
            goto L_0x0295
        L_0x028a:
            boolean r0 = r8.f1285m
            if (r0 == 0) goto L_0x0293
            r0 = 9
            r3 = 9
            goto L_0x0295
        L_0x0293:
            r0 = 6
            r3 = 6
        L_0x0295:
            com.android.billingclient.api.w r0 = new com.android.billingclient.api.w
            r1 = r0
            r2 = r31
            r4 = r19
            r5 = r18
            r6 = r33
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r3 = 5000(0x1388, double:2.4703E-320)
            r5 = 0
            android.os.Handler r6 = r8.c
            r1 = r31
            r2 = r0
            goto L_0x02dd
        L_0x02ad:
            com.android.billingclient.api.m r0 = r28.a()
            r0.c()
            r0 = 0
            throw r0
        L_0x02b6:
            r0 = 0
            r1 = 0
            java.lang.Object r1 = r3.get(r1)
            com.android.billingclient.api.g$b r1 = (com.android.billingclient.api.g.b) r1
            com.android.billingclient.api.m r1 = r1.a()
            r1.d()
            throw r0
        L_0x02c6:
            r19 = r7
            r17 = r9
            r18 = r10
            r9 = r12
            com.android.billingclient.api.x r2 = new com.android.billingclient.api.x
            r1 = r18
            r0 = r19
            r2.<init>(r8, r0, r1)
            r3 = 5000(0x1388, double:2.4703E-320)
            r5 = 0
            android.os.Handler r6 = r8.c
            r1 = r31
        L_0x02dd:
            java.util.concurrent.Future r0 = r1.x(r2, r3, r5, r6)
            r1 = 5000(0x1388, double:2.4703E-320)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ TimeoutException -> 0x033f, CancellationException -> 0x033d, Exception -> 0x0335 }
            java.lang.Object r0 = r0.get(r1, r3)     // Catch:{ TimeoutException -> 0x033f, CancellationException -> 0x033d, Exception -> 0x0335 }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ TimeoutException -> 0x033f, CancellationException -> 0x033d, Exception -> 0x0335 }
            int r1 = f.e.a.c.d.d.k.b(r0, r9)     // Catch:{ TimeoutException -> 0x033f, CancellationException -> 0x033d, Exception -> 0x0335 }
            java.lang.String r2 = f.e.a.c.d.d.k.i(r0, r9)     // Catch:{ TimeoutException -> 0x033f, CancellationException -> 0x033d, Exception -> 0x0335 }
            if (r1 == 0) goto L_0x031b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ TimeoutException -> 0x033f, CancellationException -> 0x033d, Exception -> 0x0335 }
            r0.<init>()     // Catch:{ TimeoutException -> 0x033f, CancellationException -> 0x033d, Exception -> 0x0335 }
            java.lang.String r3 = "Unable to buy item, Error response code: "
            r0.append(r3)     // Catch:{ TimeoutException -> 0x033f, CancellationException -> 0x033d, Exception -> 0x0335 }
            r0.append(r1)     // Catch:{ TimeoutException -> 0x033f, CancellationException -> 0x033d, Exception -> 0x0335 }
            java.lang.String r0 = r0.toString()     // Catch:{ TimeoutException -> 0x033f, CancellationException -> 0x033d, Exception -> 0x0335 }
            f.e.a.c.d.d.k.m(r9, r0)     // Catch:{ TimeoutException -> 0x033f, CancellationException -> 0x033d, Exception -> 0x0335 }
            com.android.billingclient.api.h$a r0 = com.android.billingclient.api.h.c()     // Catch:{ TimeoutException -> 0x033f, CancellationException -> 0x033d, Exception -> 0x0335 }
            r0.c(r1)     // Catch:{ TimeoutException -> 0x033f, CancellationException -> 0x033d, Exception -> 0x0335 }
            r0.b(r2)     // Catch:{ TimeoutException -> 0x033f, CancellationException -> 0x033d, Exception -> 0x0335 }
            com.android.billingclient.api.h r0 = r0.a()     // Catch:{ TimeoutException -> 0x033f, CancellationException -> 0x033d, Exception -> 0x0335 }
            r8.u(r0)     // Catch:{ TimeoutException -> 0x033f, CancellationException -> 0x033d, Exception -> 0x0335 }
            return r0
        L_0x031b:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ TimeoutException -> 0x033f, CancellationException -> 0x033d, Exception -> 0x0335 }
            java.lang.Class<com.android.billingclient.api.ProxyBillingActivity> r2 = com.android.billingclient.api.ProxyBillingActivity.class
            r3 = r32
            r1.<init>(r3, r2)     // Catch:{ TimeoutException -> 0x033f, CancellationException -> 0x033d, Exception -> 0x0335 }
            r2 = r17
            android.os.Parcelable r0 = r0.getParcelable(r2)     // Catch:{ TimeoutException -> 0x033f, CancellationException -> 0x033d, Exception -> 0x0335 }
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch:{ TimeoutException -> 0x033f, CancellationException -> 0x033d, Exception -> 0x0335 }
            r1.putExtra(r2, r0)     // Catch:{ TimeoutException -> 0x033f, CancellationException -> 0x033d, Exception -> 0x0335 }
            r3.startActivity(r1)     // Catch:{ TimeoutException -> 0x033f, CancellationException -> 0x033d, Exception -> 0x0335 }
            com.android.billingclient.api.h r0 = com.android.billingclient.api.q0.f1314l
            return r0
        L_0x0335:
            r0 = move-exception
            java.lang.String r1 = "Exception while launching billing flow. Try to reconnect"
            f.e.a.c.d.d.k.n(r9, r1, r0)
            goto L_0x000e
        L_0x033d:
            r0 = move-exception
            goto L_0x0340
        L_0x033f:
            r0 = move-exception
        L_0x0340:
            java.lang.String r1 = "Time out while launching billing flow. Try to reconnect"
            f.e.a.c.d.d.k.n(r9, r1, r0)
            com.android.billingclient.api.h r0 = com.android.billingclient.api.q0.f1316n
            goto L_0x0010
        L_0x0349:
            r28 = r6
            com.android.billingclient.api.m r0 = r28.a()
            r0.a()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.e.g(android.app.Activity, com.android.billingclient.api.g):com.android.billingclient.api.h");
    }

    public void h(Activity activity, l lVar, k kVar) {
        h hVar;
        String l2;
        if (f()) {
            if (lVar == null || lVar.b() == null || (l2 = lVar.b().l()) == null) {
                k.m("BillingClient", "Please fix the input params. priceChangeFlowParams must contain valid sku.");
                hVar = q0.f1313k;
                y(hVar, kVar);
            } else if (!this.f1284l) {
                k.m("BillingClient", "Current client doesn't support price change confirmation flow.");
                hVar = q0.f1320r;
                y(hVar, kVar);
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("playBillingLibraryVersion", this.b);
                bundle.putBoolean("subs_price_change", true);
                try {
                    Bundle bundle2 = (Bundle) x(new n1(this, l2, bundle), 5000, (Runnable) null, this.c).get(5000, TimeUnit.MILLISECONDS);
                    int b2 = k.b(bundle2, "BillingClient");
                    String i2 = k.i(bundle2, "BillingClient");
                    h.a c2 = h.c();
                    c2.c(b2);
                    c2.b(i2);
                    h a2 = c2.a();
                    if (b2 != 0) {
                        k.m("BillingClient", "Unable to launch price change flow, error response code: " + b2);
                        y(a2, kVar);
                        return;
                    }
                    b0 b0Var = new b0(this, this.c, kVar);
                    Intent intent = new Intent(activity, ProxyBillingActivity.class);
                    intent.putExtra("SUBS_MANAGEMENT_INTENT", (PendingIntent) bundle2.getParcelable("SUBS_MANAGEMENT_INTENT"));
                    intent.putExtra("result_receiver", b0Var);
                    activity.startActivity(intent);
                    return;
                } catch (CancellationException | TimeoutException e2) {
                    k.n("BillingClient", "Time out while launching Price Change Flow for sku: " + l2 + "; try to reconnect", e2);
                    hVar = q0.f1316n;
                } catch (Exception e3) {
                    k.n("BillingClient", "Exception caught while launching Price Change Flow for sku: " + l2 + "; try to reconnect", e3);
                }
            }
        }
        hVar = q0.f1315m;
        y(hVar, kVar);
    }

    public void j(q qVar, n nVar) {
        z(qVar.b(), nVar);
    }

    public void k(r rVar, o oVar) {
        A(rVar.b(), oVar);
    }

    public final void l(s sVar, t tVar) {
        h hVar;
        if (!f()) {
            hVar = q0.f1315m;
        } else {
            String a2 = sVar.a();
            List<String> b2 = sVar.b();
            if (TextUtils.isEmpty(a2)) {
                k.m("BillingClient", "Please fix the input params. SKU type can't be empty.");
                hVar = q0.f1308f;
            } else if (b2 != null) {
                ArrayList arrayList = new ArrayList();
                for (String a3 : b2) {
                    c1 c1Var = new c1((b1) null);
                    c1Var.a(a3);
                    arrayList.add(c1Var.b());
                }
                if (x(new m1(this, a2, arrayList, (String) null, tVar), 30000, new v(tVar), t()) == null) {
                    hVar = v();
                } else {
                    return;
                }
            } else {
                k.m("BillingClient", "Please fix the input params. The list of SKUs can't be empty - set SKU list or SkuWithOffer list.");
                hVar = q0.f1307e;
            }
        }
        tVar.onSkuDetailsResponse(hVar, (List<SkuDetails>) null);
    }

    public final void m(f fVar) {
        ServiceInfo serviceInfo;
        String str;
        if (f()) {
            k.l("BillingClient", "Service connection is valid. No need to re-initialize.");
            fVar.onBillingSetupFinished(q0.f1314l);
        } else if (this.a == 1) {
            k.m("BillingClient", "Client is already in the process of connecting to billing service.");
            fVar.onBillingSetupFinished(q0.f1306d);
        } else if (this.a == 3) {
            k.m("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            fVar.onBillingSetupFinished(q0.f1315m);
        } else {
            this.a = 1;
            this.f1276d.e();
            k.l("BillingClient", "Starting in-app billing setup.");
            this.f1279g = new i0(this, fVar, (h0) null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.f1277e.getPackageManager().queryIntentServices(intent, 0);
            if (!(queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null)) {
                String str2 = serviceInfo.packageName;
                String str3 = serviceInfo.name;
                if (!"com.android.vending".equals(str2) || str3 == null) {
                    str = "The device doesn't have valid Play Store.";
                } else {
                    ComponentName componentName = new ComponentName(str2, str3);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.b);
                    if (this.f1277e.bindService(intent2, this.f1279g, 1)) {
                        k.l("BillingClient", "Service was bonded successfully.");
                        return;
                    }
                    str = "Connection to Billing service is blocked.";
                }
                k.m("BillingClient", str);
            }
            this.a = 0;
            k.l("BillingClient", "Billing service unavailable on device.");
            fVar.onBillingSetupFinished(q0.c);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void s(h hVar) {
        if (this.f1276d.c() != null) {
            this.f1276d.c().onPurchasesUpdated(hVar, (List<Purchase>) null);
            return;
        }
        this.f1276d.b();
        k.m("BillingClient", "No valid listener is set in BroadcastManager");
    }
}
