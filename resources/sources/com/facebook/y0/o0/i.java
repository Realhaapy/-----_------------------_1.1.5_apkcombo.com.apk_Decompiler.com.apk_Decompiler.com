package com.facebook.y0.o0;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.facebook.g0;
import com.facebook.internal.s0.n.a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m.y.d.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class i {
    public static final i a = new i();
    private static final HashMap<String, Method> b = new HashMap<>();
    private static final HashMap<String, Class<?>> c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private static final String f2075d = g0.c().getPackageName();

    /* renamed from: e  reason: collision with root package name */
    private static final SharedPreferences f2076e = g0.c().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* renamed from: f  reason: collision with root package name */
    private static final SharedPreferences f2077f = g0.c().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    static {
        g0 g0Var = g0.a;
    }

    private i() {
    }

    public static final Object a(Context context, IBinder iBinder) {
        Class<i> cls = i.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(context, "context");
            return a.n(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", (Object) null, new Object[]{iBinder});
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    public static final void b() {
        SharedPreferences.Editor putLong;
        Class<i> cls = i.class;
        if (!a.d(cls)) {
            try {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                SharedPreferences sharedPreferences = f2076e;
                long j2 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0);
                if (j2 == 0) {
                    putLong = sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis);
                } else if (currentTimeMillis - j2 > ((long) 604800)) {
                    putLong = sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis);
                } else {
                    return;
                }
                putLong.apply();
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    private final ArrayList<String> c(ArrayList<String> arrayList) {
        if (a.d(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList2 = new ArrayList<>();
            SharedPreferences.Editor edit = f2077f.edit();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    JSONObject jSONObject = new JSONObject(next);
                    String string = jSONObject.getString("productId");
                    long j2 = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (currentTimeMillis - (j2 / 1000) <= 86400) {
                        if (!l.a(f2077f.getString(string, ""), string2)) {
                            edit.putString(string, string2);
                            arrayList2.add(next);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            edit.apply();
            return arrayList2;
        } catch (Throwable th) {
            a.b(th, this);
            return null;
        }
    }

    private final Class<?> d(Context context, String str) {
        if (a.d(this)) {
            return null;
        }
        try {
            HashMap<String, Class<?>> hashMap = c;
            Class<?> cls = hashMap.get(str);
            if (cls != null) {
                return cls;
            }
            m mVar = m.a;
            Class<?> b2 = m.b(context, str);
            if (b2 != null) {
                hashMap.put(str, b2);
            }
            return b2;
        } catch (Throwable th) {
            a.b(th, this);
            return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.reflect.Method e(java.lang.Class<?> r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r1 = com.facebook.internal.s0.n.a.d(r11)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.HashMap<java.lang.String, java.lang.reflect.Method> r1 = b     // Catch:{ all -> 0x00c0 }
            java.lang.Object r3 = r1.get(r13)     // Catch:{ all -> 0x00c0 }
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch:{ all -> 0x00c0 }
            if (r3 == 0) goto L_0x0015
            return r3
        L_0x0015:
            int r3 = r13.hashCode()     // Catch:{ all -> 0x00c0 }
            r4 = 4
            r5 = 2
            java.lang.String r6 = "TYPE"
            r7 = 3
            r8 = 0
            r9 = 1
            switch(r3) {
                case -1801122596: goto L_0x0086;
                case -1450694211: goto L_0x006f;
                case -1123215065: goto L_0x005f;
                case -594356707: goto L_0x0041;
                case -573310373: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x009f
        L_0x0025:
            java.lang.String r3 = "getSkuDetails"
            boolean r3 = r13.equals(r3)     // Catch:{ all -> 0x00c0 }
            if (r3 != 0) goto L_0x002f
            goto L_0x009f
        L_0x002f:
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch:{ all -> 0x00c0 }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00c0 }
            m.y.d.l.c(r4, r6)     // Catch:{ all -> 0x00c0 }
            r3[r8] = r4     // Catch:{ all -> 0x00c0 }
            r3[r9] = r0     // Catch:{ all -> 0x00c0 }
            r3[r5] = r0     // Catch:{ all -> 0x00c0 }
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r3[r7] = r0     // Catch:{ all -> 0x00c0 }
            goto L_0x00a0
        L_0x0041:
            java.lang.String r3 = "getPurchaseHistory"
            boolean r3 = r13.equals(r3)     // Catch:{ all -> 0x00c0 }
            if (r3 != 0) goto L_0x004a
            goto L_0x009f
        L_0x004a:
            r3 = 5
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ all -> 0x00c0 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00c0 }
            m.y.d.l.c(r10, r6)     // Catch:{ all -> 0x00c0 }
            r3[r8] = r10     // Catch:{ all -> 0x00c0 }
            r3[r9] = r0     // Catch:{ all -> 0x00c0 }
            r3[r5] = r0     // Catch:{ all -> 0x00c0 }
            r3[r7] = r0     // Catch:{ all -> 0x00c0 }
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r3[r4] = r0     // Catch:{ all -> 0x00c0 }
            goto L_0x00a0
        L_0x005f:
            java.lang.String r0 = "asInterface"
            boolean r0 = r13.equals(r0)     // Catch:{ all -> 0x00c0 }
            if (r0 != 0) goto L_0x0068
            goto L_0x009f
        L_0x0068:
            java.lang.Class[] r3 = new java.lang.Class[r9]     // Catch:{ all -> 0x00c0 }
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            r3[r8] = r0     // Catch:{ all -> 0x00c0 }
            goto L_0x00a0
        L_0x006f:
            java.lang.String r3 = "isBillingSupported"
            boolean r3 = r13.equals(r3)     // Catch:{ all -> 0x00c0 }
            if (r3 != 0) goto L_0x0078
            goto L_0x009f
        L_0x0078:
            java.lang.Class[] r3 = new java.lang.Class[r7]     // Catch:{ all -> 0x00c0 }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00c0 }
            m.y.d.l.c(r4, r6)     // Catch:{ all -> 0x00c0 }
            r3[r8] = r4     // Catch:{ all -> 0x00c0 }
            r3[r9] = r0     // Catch:{ all -> 0x00c0 }
            r3[r5] = r0     // Catch:{ all -> 0x00c0 }
            goto L_0x00a0
        L_0x0086:
            java.lang.String r3 = "getPurchases"
            boolean r3 = r13.equals(r3)     // Catch:{ all -> 0x00c0 }
            if (r3 != 0) goto L_0x008f
            goto L_0x009f
        L_0x008f:
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch:{ all -> 0x00c0 }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00c0 }
            m.y.d.l.c(r4, r6)     // Catch:{ all -> 0x00c0 }
            r3[r8] = r4     // Catch:{ all -> 0x00c0 }
            r3[r9] = r0     // Catch:{ all -> 0x00c0 }
            r3[r5] = r0     // Catch:{ all -> 0x00c0 }
            r3[r7] = r0     // Catch:{ all -> 0x00c0 }
            goto L_0x00a0
        L_0x009f:
            r3 = r2
        L_0x00a0:
            if (r3 != 0) goto L_0x00ad
            com.facebook.y0.o0.m r0 = com.facebook.y0.o0.m.a     // Catch:{ all -> 0x00c0 }
            java.lang.Class[] r0 = new java.lang.Class[r9]     // Catch:{ all -> 0x00c0 }
            r0[r8] = r2     // Catch:{ all -> 0x00c0 }
            java.lang.reflect.Method r12 = com.facebook.y0.o0.m.c(r12, r13, r0)     // Catch:{ all -> 0x00c0 }
            goto L_0x00ba
        L_0x00ad:
            com.facebook.y0.o0.m r0 = com.facebook.y0.o0.m.a     // Catch:{ all -> 0x00c0 }
            int r0 = r3.length     // Catch:{ all -> 0x00c0 }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)     // Catch:{ all -> 0x00c0 }
            java.lang.Class[] r0 = (java.lang.Class[]) r0     // Catch:{ all -> 0x00c0 }
            java.lang.reflect.Method r12 = com.facebook.y0.o0.m.c(r12, r13, r0)     // Catch:{ all -> 0x00c0 }
        L_0x00ba:
            if (r12 == 0) goto L_0x00bf
            r1.put(r13, r12)     // Catch:{ all -> 0x00c0 }
        L_0x00bf:
            return r12
        L_0x00c0:
            r12 = move-exception
            com.facebook.internal.s0.n.a.b(r12, r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.o0.i.e(java.lang.Class, java.lang.String):java.lang.reflect.Method");
    }

    private final ArrayList<String> f(Context context, Object obj, String str) {
        if (a.d(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (o(context, obj, str)) {
                String str2 = null;
                int i2 = 0;
                boolean z = false;
                do {
                    Object n2 = n(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, new Object[]{6, f2075d, str, str2, new Bundle()});
                    if (n2 != null) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) n2;
                        if (bundle.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            if (stringArrayList != null) {
                                Iterator<String> it = stringArrayList.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    String next = it.next();
                                    try {
                                        if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                            z = true;
                                            break;
                                        }
                                        arrayList.add(next);
                                        i2++;
                                    } catch (JSONException unused) {
                                    }
                                }
                                str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                                if (i2 >= 30 || str2 == null) {
                                    break;
                                }
                            }
                        }
                    }
                    str2 = null;
                } while (!z);
            }
            return arrayList;
        } catch (Throwable th) {
            a.b(th, this);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r3 = a;
        r4 = r3.d(r6, "com.android.vending.billing.IInAppBillingService");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList<java.lang.String> g(android.content.Context r6, java.lang.Object r7) {
        /*
            java.lang.Class<com.facebook.y0.o0.i> r0 = com.facebook.y0.o0.i.class
            boolean r1 = com.facebook.internal.s0.n.a.d(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = "context"
            m.y.d.l.d(r6, r1)     // Catch:{ all -> 0x0036 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0036 }
            r1.<init>()     // Catch:{ all -> 0x0036 }
            if (r7 != 0) goto L_0x0017
            return r1
        L_0x0017:
            com.facebook.y0.o0.i r3 = a     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = "com.android.vending.billing.IInAppBillingService"
            java.lang.Class r4 = r3.d(r6, r4)     // Catch:{ all -> 0x0036 }
            if (r4 != 0) goto L_0x0022
            return r1
        L_0x0022:
            java.lang.String r5 = "getPurchaseHistory"
            java.lang.reflect.Method r4 = r3.e(r4, r5)     // Catch:{ all -> 0x0036 }
            if (r4 != 0) goto L_0x002b
            return r1
        L_0x002b:
            java.lang.String r1 = "inapp"
            java.util.ArrayList r6 = r3.f(r6, r7, r1)     // Catch:{ all -> 0x0036 }
            java.util.ArrayList r6 = r3.c(r6)     // Catch:{ all -> 0x0036 }
            return r6
        L_0x0036:
            r6 = move-exception
            com.facebook.internal.s0.n.a.b(r6, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.o0.i.g(android.content.Context, java.lang.Object):java.util.ArrayList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062 A[EDGE_INSN: B:27:0x0062->B:21:0x0062 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.ArrayList<java.lang.String> h(android.content.Context r13, java.lang.Object r14, java.lang.String r15) {
        /*
            r12 = this;
            boolean r0 = com.facebook.internal.s0.n.a.d(r12)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0063 }
            r0.<init>()     // Catch:{ all -> 0x0063 }
            if (r14 != 0) goto L_0x0010
            return r0
        L_0x0010:
            boolean r2 = r12.o(r13, r14, r15)     // Catch:{ all -> 0x0063 }
            if (r2 == 0) goto L_0x0062
            r2 = 0
            r3 = r1
            r4 = 0
        L_0x0019:
            r5 = 4
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0063 }
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0063 }
            r11[r2] = r6     // Catch:{ all -> 0x0063 }
            r6 = 1
            java.lang.String r7 = f2075d     // Catch:{ all -> 0x0063 }
            r11[r6] = r7     // Catch:{ all -> 0x0063 }
            r6 = 2
            r11[r6] = r15     // Catch:{ all -> 0x0063 }
            r11[r5] = r3     // Catch:{ all -> 0x0063 }
            java.lang.String r8 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r9 = "getPurchases"
            r6 = r12
            r7 = r13
            r10 = r14
            java.lang.Object r3 = r6.n(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0063 }
            if (r3 == 0) goto L_0x005b
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "RESPONSE_CODE"
            int r5 = r3.getInt(r5)     // Catch:{ all -> 0x0063 }
            if (r5 != 0) goto L_0x005b
            java.lang.String r5 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r5 = r3.getStringArrayList(r5)     // Catch:{ all -> 0x0063 }
            if (r5 == 0) goto L_0x0062
            int r6 = r5.size()     // Catch:{ all -> 0x0063 }
            int r4 = r4 + r6
            r0.addAll(r5)     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r5)     // Catch:{ all -> 0x0063 }
            goto L_0x005c
        L_0x005b:
            r3 = r1
        L_0x005c:
            r5 = 30
            if (r4 >= r5) goto L_0x0062
            if (r3 != 0) goto L_0x0019
        L_0x0062:
            return r0
        L_0x0063:
            r13 = move-exception
            com.facebook.internal.s0.n.a.b(r13, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.o0.i.h(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    public static final ArrayList<String> i(Context context, Object obj) {
        Class<i> cls = i.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(context, "context");
            i iVar = a;
            return iVar.c(iVar.h(context, obj, "inapp"));
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    public static final ArrayList<String> j(Context context, Object obj) {
        Class<i> cls = i.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(context, "context");
            i iVar = a;
            return iVar.c(iVar.h(context, obj, "subs"));
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    public static final Map<String, String> k(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        Class<i> cls = i.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(context, "context");
            l.d(arrayList, "skuList");
            Map<String, String> p2 = a.p(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!p2.containsKey(next)) {
                    arrayList2.add(next);
                }
            }
            p2.putAll(a.l(context, arrayList2, obj, z));
            return p2;
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    private final Map<String, String> l(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        int size;
        if (a.d(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null) {
                if (!arrayList.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                    Object[] objArr = new Object[4];
                    int i2 = 0;
                    objArr[0] = 3;
                    objArr[1] = f2075d;
                    objArr[2] = z ? "subs" : "inapp";
                    objArr[3] = bundle;
                    Object n2 = n(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
                    if (n2 != null) {
                        Bundle bundle2 = (Bundle) n2;
                        if (bundle2.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList != null && arrayList.size() == stringArrayList.size() && arrayList.size() - 1 >= 0) {
                                while (true) {
                                    int i3 = i2 + 1;
                                    String str = arrayList.get(i2);
                                    l.c(str, "skuList[i]");
                                    String str2 = stringArrayList.get(i2);
                                    l.c(str2, "skuDetailsList[i]");
                                    linkedHashMap.put(str, str2);
                                    if (i3 > size) {
                                        break;
                                    }
                                    i2 = i3;
                                }
                            }
                            q(linkedHashMap);
                        }
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            a.b(th, this);
            return null;
        }
    }

    private final Object n(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method e2;
        if (a.d(this)) {
            return null;
        }
        try {
            Class<?> d2 = d(context, str);
            if (d2 == null || (e2 = e(d2, str2)) == null) {
                return null;
            }
            m mVar = m.a;
            return m.e(d2, e2, obj, Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th) {
            a.b(th, this);
            return null;
        }
    }

    private final boolean o(Context context, Object obj, String str) {
        if (a.d(this) || obj == null) {
            return false;
        }
        try {
            Object n2 = n(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f2075d, str});
            return n2 != null && ((Integer) n2).intValue() == 0;
        } catch (Throwable th) {
            a.b(th, this);
            return false;
        }
    }

    private final Map<String, String> p(ArrayList<String> arrayList) {
        if (a.d(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                String string = f2076e.getString(next, (String) null);
                if (string != null) {
                    List U = q.U(string, new String[]{";"}, false, 2, 2, (Object) null);
                    if (currentTimeMillis - Long.parseLong((String) U.get(0)) < 43200) {
                        l.c(next, "sku");
                        linkedHashMap.put(next, U.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            a.b(th, this);
            return null;
        }
    }

    private final void q(Map<String, String> map) {
        if (!a.d(this)) {
            try {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                SharedPreferences.Editor edit = f2076e.edit();
                for (Map.Entry next : map.entrySet()) {
                    edit.putString((String) next.getKey(), currentTimeMillis + ';' + ((String) next.getValue()));
                }
                edit.apply();
            } catch (Throwable th) {
                a.b(th, this);
            }
        }
    }

    public final boolean m(String str) {
        if (a.d(this)) {
            return false;
        }
        try {
            l.d(str, "skuDetail");
            try {
                String optString = new JSONObject(str).optString("freeTrialPeriod");
                if (optString == null) {
                    return false;
                }
                return optString.length() > 0;
            } catch (JSONException unused) {
                return false;
            }
        } catch (Throwable th) {
            a.b(th, this);
            return false;
        }
    }
}
