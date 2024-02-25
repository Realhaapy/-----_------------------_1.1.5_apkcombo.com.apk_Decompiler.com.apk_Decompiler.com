package com.facebook.y0.o0;

import android.content.SharedPreferences;
import com.facebook.g0;
import com.facebook.internal.s0.n.a;
import com.facebook.y0.q0.i;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import m.y.d.l;
import org.json.JSONObject;

public final class j {
    public static final j a = new j();
    private static SharedPreferences b;
    private static final Set<String> c = new CopyOnWriteArraySet();

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, Long> f2078d = new ConcurrentHashMap();

    private j() {
    }

    public static final boolean d() {
        Class<j> cls = j.class;
        if (a.d(cls)) {
            return false;
        }
        try {
            a.g();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences != null) {
                long j2 = sharedPreferences.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0);
                if (j2 != 0 && currentTimeMillis - j2 < ((long) 86400)) {
                    return false;
                }
                SharedPreferences sharedPreferences2 = b;
                if (sharedPreferences2 != null) {
                    sharedPreferences2.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", currentTimeMillis).apply();
                    return true;
                }
                l.n("sharedPreferences");
                throw null;
            }
            l.n("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            a.b(th, cls);
            return false;
        }
    }

    public static final void e(Map<String, JSONObject> map, Map<String, ? extends JSONObject> map2) {
        Class<j> cls = j.class;
        if (!a.d(cls)) {
            try {
                l.d(map, "purchaseDetailsMap");
                l.d(map2, "skuDetailsMap");
                j jVar = a;
                jVar.g();
                jVar.f(jVar.c(jVar.a(map), map2));
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    private final void f(Map<String, String> map) {
        if (!a.d(this)) {
            try {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    String str2 = (String) next.getValue();
                    if (!(str == null || str2 == null)) {
                        i iVar = i.a;
                        i.f(str, str2, false);
                    }
                }
            } catch (Throwable th) {
                a.b(th, this);
            }
        }
    }

    private final void g() {
        if (!a.d(this)) {
            try {
                g0 g0Var = g0.a;
                SharedPreferences sharedPreferences = g0.c().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
                SharedPreferences sharedPreferences2 = g0.c().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
                if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
                    sharedPreferences.edit().clear().apply();
                    sharedPreferences2.edit().clear().apply();
                }
                SharedPreferences sharedPreferences3 = g0.c().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
                l.c(sharedPreferences3, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
                b = sharedPreferences3;
                Set<String> set = c;
                if (sharedPreferences3 != null) {
                    Collection stringSet = sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
                    if (stringSet == null) {
                        stringSet = new HashSet();
                    }
                    set.addAll(stringSet);
                    for (String U : set) {
                        List U2 = q.U(U, new String[]{";"}, false, 2, 2, (Object) null);
                        f2078d.put(U2.get(0), Long.valueOf(Long.parseLong((String) U2.get(1))));
                    }
                    b();
                    return;
                }
                l.n("sharedPreferences");
                throw null;
            } catch (Throwable th) {
                a.b(th, this);
            }
        }
    }

    public final Map<String, JSONObject> a(Map<String, JSONObject> map) {
        if (a.d(this)) {
            return null;
        }
        try {
            l.d(map, "purchaseDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            for (Map.Entry next : a0.l(map).entrySet()) {
                String str = (String) next.getKey();
                JSONObject jSONObject = (JSONObject) next.getValue();
                try {
                    if (jSONObject.has("purchaseToken")) {
                        String string = jSONObject.getString("purchaseToken");
                        if (f2078d.containsKey(string)) {
                            map.remove(str);
                        } else {
                            Set<String> set = c;
                            set.add(string + ';' + currentTimeMillis);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putStringSet("PURCHASE_DETAILS_SET", c).apply();
                return new HashMap(map);
            }
            l.n("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            a.b(th, this);
            return null;
        }
    }

    public final void b() {
        SharedPreferences.Editor putLong;
        if (!a.d(this)) {
            try {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                SharedPreferences sharedPreferences = b;
                if (sharedPreferences != null) {
                    long j2 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0);
                    if (j2 == 0) {
                        SharedPreferences sharedPreferences2 = b;
                        if (sharedPreferences2 != null) {
                            putLong = sharedPreferences2.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis);
                        } else {
                            l.n("sharedPreferences");
                            throw null;
                        }
                    } else if (currentTimeMillis - j2 > 604800) {
                        for (Map.Entry next : a0.l(f2078d).entrySet()) {
                            String str = (String) next.getKey();
                            long longValue = ((Number) next.getValue()).longValue();
                            if (currentTimeMillis - longValue > 86400) {
                                Set<String> set = c;
                                set.remove(str + ';' + longValue);
                                f2078d.remove(str);
                            }
                        }
                        SharedPreferences sharedPreferences3 = b;
                        if (sharedPreferences3 != null) {
                            putLong = sharedPreferences3.edit().putStringSet("PURCHASE_DETAILS_SET", c).putLong("LAST_CLEARED_TIME", currentTimeMillis);
                        } else {
                            l.n("sharedPreferences");
                            throw null;
                        }
                    } else {
                        return;
                    }
                    putLong.apply();
                    return;
                }
                l.n("sharedPreferences");
                throw null;
            } catch (Throwable th) {
                a.b(th, this);
            }
        }
    }

    public final Map<String, String> c(Map<String, ? extends JSONObject> map, Map<String, ? extends JSONObject> map2) {
        Map<String, ? extends JSONObject> map3 = map2;
        if (a.d(this)) {
            return null;
        }
        try {
            l.d(map, "purchaseDetailsMap");
            l.d(map3, "skuDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : map.entrySet()) {
                JSONObject jSONObject = (JSONObject) next.getValue();
                JSONObject jSONObject2 = (JSONObject) map3.get((String) next.getKey());
                if (jSONObject != null && jSONObject.has("purchaseTime")) {
                    try {
                        if (currentTimeMillis - (jSONObject.getLong("purchaseTime") / 1000) <= 86400) {
                            if (jSONObject2 != null) {
                                String jSONObject3 = jSONObject.toString();
                                l.c(jSONObject3, "purchaseDetail.toString()");
                                String jSONObject4 = jSONObject2.toString();
                                l.c(jSONObject4, "skuDetail.toString()");
                                linkedHashMap.put(jSONObject3, jSONObject4);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            a.b(th, this);
            return null;
        }
    }
}
