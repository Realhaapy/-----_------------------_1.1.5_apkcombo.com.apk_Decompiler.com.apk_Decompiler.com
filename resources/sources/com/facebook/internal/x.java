package com.facebook.internal;

import com.facebook.f0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import m.p;
import m.y.d.g;
import org.json.JSONArray;
import org.json.JSONObject;

public final class x {

    /* renamed from: g  reason: collision with root package name */
    public static final a f1541g = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static x f1542h;
    private final Map<Integer, Set<Integer>> a;
    private final Map<Integer, Set<Integer>> b;
    private final Map<Integer, Set<Integer>> c;

    /* renamed from: d  reason: collision with root package name */
    private final String f1543d;

    /* renamed from: e  reason: collision with root package name */
    private final String f1544e;

    /* renamed from: f  reason: collision with root package name */
    private final String f1545f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final x c() {
            return new x((Map<Integer, ? extends Set<Integer>>) null, a0.e(p.a(2, null), p.a(4, null), p.a(9, null), p.a(17, null), p.a(341, null)), a0.e(p.a(102, null), p.a(190, null), p.a(412, null)), (String) null, (String) null, (String) null);
        }

        private final Map<Integer, Set<Integer>> d(JSONObject jSONObject) {
            int optInt;
            HashSet hashSet;
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray.length() == 0) {
                return null;
            }
            HashMap hashMap = new HashMap();
            int length = optJSONArray.length();
            if (length > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (!(optJSONObject == null || (optInt = optJSONObject.optInt("code")) == 0)) {
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                        if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                            hashSet = null;
                        } else {
                            hashSet = new HashSet();
                            int length2 = optJSONArray2.length();
                            if (length2 > 0) {
                                int i4 = 0;
                                while (true) {
                                    int i5 = i4 + 1;
                                    int optInt2 = optJSONArray2.optInt(i4);
                                    if (optInt2 != 0) {
                                        hashSet.add(Integer.valueOf(optInt2));
                                    }
                                    if (i5 >= length2) {
                                        break;
                                    }
                                    i4 = i5;
                                }
                            }
                        }
                        hashMap.put(Integer.valueOf(optInt), hashSet);
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return hashMap;
        }

        public final x a(JSONArray jSONArray) {
            String str;
            String str2;
            String str3;
            Map<Integer, Set<Integer>> map;
            Map<Integer, Set<Integer>> map2;
            Map<Integer, Set<Integer>> map3;
            String optString;
            JSONArray jSONArray2 = jSONArray;
            if (jSONArray2 == null) {
                return null;
            }
            int i2 = 0;
            int length = jSONArray.length();
            if (length > 0) {
                Map<Integer, Set<Integer>> map4 = null;
                Map<Integer, Set<Integer>> map5 = null;
                Map<Integer, Set<Integer>> map6 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                while (true) {
                    int i3 = i2 + 1;
                    JSONObject optJSONObject = jSONArray2.optJSONObject(i2);
                    if (!(optJSONObject == null || (optString = optJSONObject.optString("name")) == null)) {
                        if (p.l(optString, "other", true)) {
                            str4 = optJSONObject.optString("recovery_message", (String) null);
                            map4 = d(optJSONObject);
                        } else if (p.l(optString, "transient", true)) {
                            str5 = optJSONObject.optString("recovery_message", (String) null);
                            map5 = d(optJSONObject);
                        } else if (p.l(optString, "login_recoverable", true)) {
                            str6 = optJSONObject.optString("recovery_message", (String) null);
                            map6 = d(optJSONObject);
                        }
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
                map3 = map4;
                map2 = map5;
                map = map6;
                str3 = str4;
                str2 = str5;
                str = str6;
            } else {
                map3 = null;
                map2 = null;
                map = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            return new x(map3, map2, map, str3, str2, str);
        }

        public final synchronized x b() {
            x a;
            if (x.f1542h == null) {
                x.f1542h = c();
            }
            a = x.f1542h;
            if (a == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            }
            return a;
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f0.a.values().length];
            iArr[f0.a.OTHER.ordinal()] = 1;
            iArr[f0.a.LOGIN_RECOVERABLE.ordinal()] = 2;
            iArr[f0.a.TRANSIENT.ordinal()] = 3;
            a = iArr;
        }
    }

    public x(Map<Integer, ? extends Set<Integer>> map, Map<Integer, ? extends Set<Integer>> map2, Map<Integer, ? extends Set<Integer>> map3, String str, String str2, String str3) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.f1543d = str;
        this.f1544e = str2;
        this.f1545f = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0065, code lost:
        r2 = r1.b.get(java.lang.Integer.valueOf(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.f0.a c(int r2, int r3, boolean r4) {
        /*
            r1 = this;
            if (r4 == 0) goto L_0x0005
            com.facebook.f0$a r2 = com.facebook.f0.a.TRANSIENT
            return r2
        L_0x0005:
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r4 = r1.a
            if (r4 == 0) goto L_0x002e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r4 = r4.containsKey(r0)
            if (r4 == 0) goto L_0x002e
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r4 = r1.a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r4 = r4.get(r0)
            java.util.Set r4 = (java.util.Set) r4
            if (r4 == 0) goto L_0x002b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L_0x002e
        L_0x002b:
            com.facebook.f0$a r2 = com.facebook.f0.a.OTHER
            return r2
        L_0x002e:
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r4 = r1.c
            if (r4 == 0) goto L_0x0057
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r4 = r4.containsKey(r0)
            if (r4 == 0) goto L_0x0057
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r4 = r1.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r4 = r4.get(r0)
            java.util.Set r4 = (java.util.Set) r4
            if (r4 == 0) goto L_0x0054
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L_0x0057
        L_0x0054:
            com.facebook.f0$a r2 = com.facebook.f0.a.LOGIN_RECOVERABLE
            return r2
        L_0x0057:
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r4 = r1.b
            if (r4 == 0) goto L_0x0080
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r4 = r4.containsKey(r0)
            if (r4 == 0) goto L_0x0080
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r4 = r1.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r4.get(r2)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L_0x007d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x0080
        L_0x007d:
            com.facebook.f0$a r2 = com.facebook.f0.a.TRANSIENT
            return r2
        L_0x0080:
            com.facebook.f0$a r2 = com.facebook.f0.a.OTHER
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.x.c(int, int, boolean):com.facebook.f0$a");
    }

    public final String d(f0.a aVar) {
        int i2 = aVar == null ? -1 : b.a[aVar.ordinal()];
        if (i2 == 1) {
            return this.f1543d;
        }
        if (i2 == 2) {
            return this.f1545f;
        }
        if (i2 != 3) {
            return null;
        }
        return this.f1544e;
    }
}
