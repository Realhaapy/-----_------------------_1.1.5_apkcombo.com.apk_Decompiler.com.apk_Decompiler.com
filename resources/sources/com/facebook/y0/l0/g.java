package com.facebook.y0.l0;

import com.facebook.internal.i0;
import com.facebook.internal.o0;
import com.facebook.p0;
import com.facebook.y0.l0.d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import m.p;
import m.y.d.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class g {
    public static final g a = new g();
    private static final Map<e, c> b;
    public static final Map<m, b> c;

    /* renamed from: d  reason: collision with root package name */
    public static final Map<String, j> f1885d = a0.f(p.a("fb_mobile_achievement_unlocked", j.UNLOCKED_ACHIEVEMENT), p.a("fb_mobile_activate_app", j.ACTIVATED_APP), p.a("fb_mobile_add_payment_info", j.ADDED_PAYMENT_INFO), p.a("fb_mobile_add_to_cart", j.ADDED_TO_CART), p.a("fb_mobile_add_to_wishlist", j.ADDED_TO_WISHLIST), p.a("fb_mobile_complete_registration", j.COMPLETED_REGISTRATION), p.a("fb_mobile_content_view", j.VIEWED_CONTENT), p.a("fb_mobile_initiated_checkout", j.INITIATED_CHECKOUT), p.a("fb_mobile_level_achieved", j.ACHIEVED_LEVEL), p.a("fb_mobile_purchase", j.PURCHASED), p.a("fb_mobile_rate", j.RATED), p.a("fb_mobile_search", j.SEARCHED), p.a("fb_mobile_spent_credits", j.SPENT_CREDITS), p.a("fb_mobile_tutorial_completion", j.COMPLETED_TUTORIAL));

    public enum a {
        OPTIONS("data_processing_options"),
        COUNTRY("data_processing_options_country"),
        STATE("data_processing_options_state");
        

        /* renamed from: f  reason: collision with root package name */
        public static final C0030a f1886f = null;

        /* renamed from: e  reason: collision with root package name */
        private final String f1891e;

        /* renamed from: com.facebook.y0.l0.g$a$a  reason: collision with other inner class name */
        public static final class C0030a {
            private C0030a() {
            }

            public /* synthetic */ C0030a(m.y.d.g gVar) {
                this();
            }

            public final a a(String str) {
                l.d(str, "rawValue");
                for (a aVar : a.values()) {
                    if (l.a(aVar.c(), str)) {
                        return aVar;
                    }
                }
                return null;
            }
        }

        static {
            f1886f = new C0030a((m.y.d.g) null);
        }

        private a(String str) {
            this.f1891e = str;
        }

        public final String c() {
            return this.f1891e;
        }
    }

    public static final class b {
        private k a;
        private i b;

        public b(k kVar, i iVar) {
            l.d(iVar, "field");
            this.a = kVar;
            this.b = iVar;
        }

        public final i a() {
            return this.b;
        }

        public final k b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public int hashCode() {
            k kVar = this.a;
            return ((kVar == null ? 0 : kVar.hashCode()) * 31) + this.b.hashCode();
        }

        public String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.a + ", field=" + this.b + ')';
        }
    }

    public static final class c {
        private k a;
        private l b;

        public c(k kVar, l lVar) {
            l.d(kVar, "section");
            this.a = kVar;
            this.b = lVar;
        }

        public final l a() {
            return this.b;
        }

        public final k b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            l lVar = this.b;
            return hashCode + (lVar == null ? 0 : lVar.hashCode());
        }

        public String toString() {
            return "SectionFieldMapping(section=" + this.a + ", field=" + this.b + ')';
        }
    }

    public enum d {
        ARRAY,
        BOOL,
        INT;
        

        /* renamed from: e  reason: collision with root package name */
        public static final a f1892e = null;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(m.y.d.g gVar) {
                this();
            }

            public final d a(String str) {
                l.d(str, "rawValue");
                if (l.a(str, e.EXT_INFO.c()) || l.a(str, e.URL_SCHEMES.c()) || l.a(str, m.CONTENT_IDS.c()) || l.a(str, m.CONTENTS.c()) || l.a(str, a.OPTIONS.c())) {
                    return d.ARRAY;
                }
                if (l.a(str, e.ADV_TE.c()) || l.a(str, e.APP_TE.c())) {
                    return d.BOOL;
                }
                if (l.a(str, m.EVENT_TIME.c())) {
                    return d.INT;
                }
                return null;
            }
        }

        static {
            f1892e = new a((m.y.d.g) null);
        }
    }

    public /* synthetic */ class e {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.ARRAY.ordinal()] = 1;
            iArr[d.BOOL.ordinal()] = 2;
            iArr[d.INT.ordinal()] = 3;
            a = iArr;
            int[] iArr2 = new int[k.values().length];
            iArr2[k.APP_DATA.ordinal()] = 1;
            iArr2[k.USER_DATA.ordinal()] = 2;
            b = iArr2;
            int[] iArr3 = new int[d.values().length];
            iArr3[d.MOBILE_APP_INSTALL.ordinal()] = 1;
            iArr3[d.CUSTOM.ordinal()] = 2;
            c = iArr3;
        }
    }

    static {
        e eVar = e.ANON_ID;
        k kVar = k.USER_DATA;
        e eVar2 = e.ADV_TE;
        k kVar2 = k.APP_DATA;
        b = a0.f(p.a(eVar, new c(kVar, l.ANON_ID)), p.a(e.APP_USER_ID, new c(kVar, l.FB_LOGIN_ID)), p.a(e.ADVERTISER_ID, new c(kVar, l.MAD_ID)), p.a(e.PAGE_ID, new c(kVar, l.PAGE_ID)), p.a(e.PAGE_SCOPED_USER_ID, new c(kVar, l.PAGE_SCOPED_USER_ID)), p.a(eVar2, new c(kVar2, l.ADV_TE)), p.a(e.APP_TE, new c(kVar2, l.APP_TE)), p.a(e.CONSIDER_VIEWS, new c(kVar2, l.CONSIDER_VIEWS)), p.a(e.DEVICE_TOKEN, new c(kVar2, l.DEVICE_TOKEN)), p.a(e.EXT_INFO, new c(kVar2, l.EXT_INFO)), p.a(e.INCLUDE_DWELL_DATA, new c(kVar2, l.INCLUDE_DWELL_DATA)), p.a(e.INCLUDE_VIDEO_DATA, new c(kVar2, l.INCLUDE_VIDEO_DATA)), p.a(e.INSTALL_REFERRER, new c(kVar2, l.INSTALL_REFERRER)), p.a(e.INSTALLER_PACKAGE, new c(kVar2, l.INSTALLER_PACKAGE)), p.a(e.RECEIPT_DATA, new c(kVar2, l.RECEIPT_DATA)), p.a(e.URL_SCHEMES, new c(kVar2, l.URL_SCHEMES)), p.a(e.USER_DATA, new c(kVar, (l) null)));
        m mVar = m.VALUE_TO_SUM;
        k kVar3 = k.CUSTOM_DATA;
        c = a0.f(p.a(m.EVENT_TIME, new b((k) null, i.EVENT_TIME)), p.a(m.EVENT_NAME, new b((k) null, i.EVENT_NAME)), p.a(mVar, new b(kVar3, i.VALUE_TO_SUM)), p.a(m.CONTENT_IDS, new b(kVar3, i.CONTENT_IDS)), p.a(m.CONTENTS, new b(kVar3, i.CONTENTS)), p.a(m.CONTENT_TYPE, new b(kVar3, i.CONTENT_TYPE)), p.a(m.CURRENCY, new b(kVar3, i.CURRENCY)), p.a(m.DESCRIPTION, new b(kVar3, i.DESCRIPTION)), p.a(m.LEVEL, new b(kVar3, i.LEVEL)), p.a(m.MAX_RATING_VALUE, new b(kVar3, i.MAX_RATING_VALUE)), p.a(m.NUM_ITEMS, new b(kVar3, i.NUM_ITEMS)), p.a(m.PAYMENT_INFO_AVAILABLE, new b(kVar3, i.PAYMENT_INFO_AVAILABLE)), p.a(m.REGISTRATION_METHOD, new b(kVar3, i.REGISTRATION_METHOD)), p.a(m.SEARCH_STRING, new b(kVar3, i.SEARCH_STRING)), p.a(m.SUCCESS, new b(kVar3, i.SUCCESS)), p.a(m.ORDER_ID, new b(kVar3, i.ORDER_ID)), p.a(m.AD_TYPE, new b(kVar3, i.AD_TYPE)));
    }

    private g() {
    }

    private final List<Map<String, Object>> b(Map<String, ? extends Object> map, List<? extends Map<String, ? extends Object>> list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map putAll : list) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            linkedHashMap.putAll(putAll);
            arrayList.add(linkedHashMap);
        }
        return arrayList;
    }

    private final List<Map<String, Object>> c(Map<String, ? extends Object> map, Object obj) {
        if (obj == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put(i.EVENT_NAME.c(), n.MOBILE_APP_INSTALL.c());
        linkedHashMap.put(i.EVENT_TIME.c(), obj);
        return i.b(linkedHashMap);
    }

    private final d f(Map<String, ? extends Object> map, Map<String, Object> map2, Map<String, Object> map3, ArrayList<Map<String, Object>> arrayList, Map<String, Object> map4) {
        Object obj = map.get(n.EVENT.c());
        d.a aVar = d.f1865e;
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        d a2 = aVar.a((String) obj);
        if (a2 == d.OTHER) {
            return a2;
        }
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            e a3 = e.f1870f.a(str);
            if (a3 != null) {
                a.g(map2, map3, a3, value);
            } else {
                boolean a4 = l.a(str, k.CUSTOM_EVENTS.c());
                boolean z = value instanceof String;
                if (a2 == d.CUSTOM && a4 && z) {
                    ArrayList<Map<String, Object>> k2 = k((String) value);
                    if (k2 != null) {
                        arrayList.addAll(k2);
                    }
                } else if (a.f1886f.a(str) != null) {
                    map4.put(str, value);
                }
            }
        }
        return a2;
    }

    private final void h(Map<String, Object> map, e eVar, Object obj) {
        c cVar = b.get(eVar);
        l a2 = cVar == null ? null : cVar.a();
        if (a2 != null) {
            map.put(a2.c(), obj);
        }
    }

    private final void i(Map<String, Object> map, e eVar, Object obj) {
        if (eVar == e.USER_DATA) {
            try {
                o0 o0Var = o0.a;
                map.putAll(o0.l(new JSONObject((String) obj)));
            } catch (JSONException e2) {
                i0.f1448e.c(p0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", obj, e2);
            }
        } else {
            c cVar = b.get(eVar);
            l a2 = cVar == null ? null : cVar.a();
            if (a2 != null) {
                map.put(a2.c(), obj);
            }
        }
    }

    private final String j(String str) {
        Map<String, j> map = f1885d;
        if (!map.containsKey(str)) {
            return str;
        }
        j jVar = map.get(str);
        return jVar == null ? "" : jVar.c();
    }

    public static final ArrayList<Map<String, Object>> k(String str) {
        Object l2;
        l.d(str, "appEvents");
        ArrayList<Map> arrayList = new ArrayList<>();
        try {
            o0 o0Var = o0.a;
            for (String jSONObject : o0.k(new JSONArray(str))) {
                o0 o0Var2 = o0.a;
                arrayList.add(o0.l(new JSONObject(jSONObject)));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            ArrayList<Map<String, Object>> arrayList2 = new ArrayList<>();
            for (Map map : arrayList) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (String str2 : map.keySet()) {
                    m a2 = m.f1952f.a(str2);
                    b bVar = c.get(a2);
                    if (!(a2 == null || bVar == null)) {
                        k b2 = bVar.b();
                        if (b2 == null) {
                            try {
                                String c2 = bVar.a().c();
                                if (a2 == m.EVENT_NAME && ((String) map.get(str2)) != null) {
                                    g gVar = a;
                                    Object obj = map.get(str2);
                                    if (obj != null) {
                                        l2 = gVar.j((String) obj);
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                } else if (a2 == m.EVENT_TIME && ((Integer) map.get(str2)) != null) {
                                    Object obj2 = map.get(str2);
                                    if (obj2 != null) {
                                        l2 = l(str2, obj2);
                                        if (l2 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                        }
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                }
                                linkedHashMap2.put(c2, l2);
                            } catch (ClassCastException e2) {
                                i0.f1448e.c(p0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", b.b(e2));
                            }
                        } else if (b2 == k.CUSTOM_DATA) {
                            String c3 = bVar.a().c();
                            Object obj3 = map.get(str2);
                            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Any");
                            Object l3 = l(str2, obj3);
                            Objects.requireNonNull(l3, "null cannot be cast to non-null type kotlin.Any");
                            linkedHashMap.put(c3, l3);
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    linkedHashMap2.put(k.CUSTOM_DATA.c(), linkedHashMap);
                }
                arrayList2.add(linkedHashMap2);
            }
            return arrayList2;
        } catch (JSONException e3) {
            i0.f1448e.c(p0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", str, e3);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:28|29) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:25|26|27|30|31|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r5 = com.facebook.internal.o0.a;
        r1 = com.facebook.internal.o0.k(new org.json.JSONArray(r1));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0083 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x008e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object l(java.lang.String r6, java.lang.Object r7) {
        /*
            java.lang.String r0 = "field"
            m.y.d.l.d(r6, r0)
            java.lang.String r0 = "value"
            m.y.d.l.d(r7, r0)
            com.facebook.y0.l0.g$d$a r0 = com.facebook.y0.l0.g.d.f1892e
            com.facebook.y0.l0.g$d r6 = r0.a(r6)
            boolean r0 = r7 instanceof java.lang.String
            r1 = 0
            if (r0 == 0) goto L_0x0019
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x001a
        L_0x0019:
            r0 = r1
        L_0x001a:
            if (r6 == 0) goto L_0x00a8
            if (r0 != 0) goto L_0x0020
            goto L_0x00a8
        L_0x0020:
            int[] r2 = com.facebook.y0.l0.g.e.a
            int r6 = r6.ordinal()
            r6 = r2[r6]
            r2 = 0
            r3 = 2
            r4 = 1
            if (r6 == r4) goto L_0x0057
            if (r6 == r3) goto L_0x0041
            r0 = 3
            if (r6 != r0) goto L_0x003b
            java.lang.String r6 = r7.toString()
            java.lang.Integer r6 = m.d0.o.f(r6)
            return r6
        L_0x003b:
            m.k r6 = new m.k
            r6.<init>()
            throw r6
        L_0x0041:
            java.lang.String r6 = r0.toString()
            java.lang.Integer r6 = m.d0.o.f(r6)
            if (r6 == 0) goto L_0x0056
            int r6 = r6.intValue()
            if (r6 == 0) goto L_0x0052
            r2 = 1
        L_0x0052:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
        L_0x0056:
            return r1
        L_0x0057:
            com.facebook.internal.o0 r6 = com.facebook.internal.o0.a     // Catch:{ JSONException -> 0x0093 }
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0093 }
            r6.<init>(r0)     // Catch:{ JSONException -> 0x0093 }
            java.util.List r6 = com.facebook.internal.o0.k(r6)     // Catch:{ JSONException -> 0x0093 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0093 }
            r0.<init>()     // Catch:{ JSONException -> 0x0093 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ JSONException -> 0x0093 }
        L_0x006b:
            boolean r1 = r6.hasNext()     // Catch:{ JSONException -> 0x0093 }
            if (r1 == 0) goto L_0x0092
            java.lang.Object r1 = r6.next()     // Catch:{ JSONException -> 0x0093 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x0093 }
            com.facebook.internal.o0 r5 = com.facebook.internal.o0.a     // Catch:{ JSONException -> 0x0083 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0083 }
            r5.<init>(r1)     // Catch:{ JSONException -> 0x0083 }
            java.util.Map r1 = com.facebook.internal.o0.l(r5)     // Catch:{ JSONException -> 0x0083 }
            goto L_0x008e
        L_0x0083:
            com.facebook.internal.o0 r5 = com.facebook.internal.o0.a     // Catch:{ JSONException -> 0x008e }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x008e }
            r5.<init>(r1)     // Catch:{ JSONException -> 0x008e }
            java.util.List r1 = com.facebook.internal.o0.k(r5)     // Catch:{ JSONException -> 0x008e }
        L_0x008e:
            r0.add(r1)     // Catch:{ JSONException -> 0x0093 }
            goto L_0x006b
        L_0x0092:
            return r0
        L_0x0093:
            r6 = move-exception
            com.facebook.internal.i0$a r0 = com.facebook.internal.i0.f1448e
            com.facebook.p0 r1 = com.facebook.p0.APP_EVENTS
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r7
            r3[r4] = r6
            java.lang.String r6 = "AppEventsConversionsAPITransformer"
            java.lang.String r7 = "\n transformEvents JSONException: \n%s\n%s"
            r0.c(r1, r6, r7, r3)
            m.s r6 = m.s.a
            return r6
        L_0x00a8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.l0.g.l(java.lang.String, java.lang.Object):java.lang.Object");
    }

    public final List<Map<String, Object>> a(d dVar, Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, List<? extends Map<String, ? extends Object>> list, Object obj) {
        l.d(dVar, "eventType");
        l.d(map, "userData");
        l.d(map2, "appData");
        l.d(map3, "restOfData");
        l.d(list, "customEvents");
        Map<String, Object> d2 = d(map, map2, map3);
        int i2 = e.c[dVar.ordinal()];
        if (i2 == 1) {
            return c(d2, obj);
        }
        if (i2 != 2) {
            return null;
        }
        return b(d2, list);
    }

    public final Map<String, Object> d(Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3) {
        l.d(map, "userData");
        l.d(map2, "appData");
        l.d(map3, "restOfData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(n.ACTION_SOURCE.c(), n.APP.c());
        linkedHashMap.put(k.USER_DATA.c(), map);
        linkedHashMap.put(k.APP_DATA.c(), map2);
        linkedHashMap.putAll(map3);
        return linkedHashMap;
    }

    public final List<Map<String, Object>> e(Map<String, ? extends Object> map) {
        l.d(map, "parameters");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        d f2 = f(map, linkedHashMap, linkedHashMap2, arrayList, linkedHashMap3);
        if (f2 == d.OTHER) {
            return null;
        }
        return a(f2, linkedHashMap, linkedHashMap2, linkedHashMap3, arrayList, map.get(n.INSTALL_EVENT_TIME.c()));
    }

    public final void g(Map<String, Object> map, Map<String, Object> map2, e eVar, Object obj) {
        l.d(map, "userData");
        l.d(map2, "appData");
        l.d(eVar, "field");
        l.d(obj, "value");
        c cVar = b.get(eVar);
        if (cVar != null) {
            int i2 = e.b[cVar.b().ordinal()];
            if (i2 == 1) {
                h(map2, eVar, obj);
            } else if (i2 == 2) {
                i(map, eVar, obj);
            }
        }
    }
}
