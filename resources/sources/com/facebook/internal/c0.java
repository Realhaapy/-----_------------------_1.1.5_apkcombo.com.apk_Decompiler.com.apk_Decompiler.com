package com.facebook.internal;

import android.net.Uri;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import m.y.d.g;
import m.y.d.l;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c0 {
    private final boolean a;
    private final int b;
    private final EnumSet<n0> c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f1419d;

    /* renamed from: e  reason: collision with root package name */
    private final x f1420e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f1421f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f1422g;

    /* renamed from: h  reason: collision with root package name */
    private final JSONArray f1423h;

    /* renamed from: i  reason: collision with root package name */
    private final String f1424i;

    /* renamed from: j  reason: collision with root package name */
    private final String f1425j;

    /* renamed from: k  reason: collision with root package name */
    private final String f1426k;

    /* renamed from: l  reason: collision with root package name */
    private final String f1427l;

    public static final class a {
        public static final C0026a c = new C0026a((g) null);
        private final String a;
        private final String b;

        /* renamed from: com.facebook.internal.c0$a$a  reason: collision with other inner class name */
        public static final class C0026a {
            private C0026a() {
            }

            public /* synthetic */ C0026a(g gVar) {
                this();
            }

            private final int[] b(JSONArray jSONArray) {
                if (jSONArray == null) {
                    return null;
                }
                int length = jSONArray.length();
                int[] iArr = new int[length];
                int i2 = 0;
                if (length <= 0) {
                    return iArr;
                }
                while (true) {
                    int i3 = i2 + 1;
                    int i4 = -1;
                    int optInt = jSONArray.optInt(i2, -1);
                    if (optInt == -1) {
                        String optString = jSONArray.optString(i2);
                        o0 o0Var = o0.a;
                        if (!o0.V(optString)) {
                            try {
                                l.c(optString, "versionString");
                                i4 = Integer.parseInt(optString);
                            } catch (NumberFormatException e2) {
                                o0 o0Var2 = o0.a;
                                o0.d0("FacebookSDK", e2);
                            }
                            optInt = i4;
                        }
                    }
                    iArr[i2] = optInt;
                    if (i3 >= length) {
                        return iArr;
                    }
                    i2 = i3;
                }
            }

            public final a a(JSONObject jSONObject) {
                l.d(jSONObject, "dialogConfigJSON");
                String optString = jSONObject.optString("name");
                o0 o0Var = o0.a;
                Uri uri = null;
                if (o0.V(optString)) {
                    return null;
                }
                l.c(optString, "dialogNameWithFeature");
                List U = q.U(optString, new String[]{"|"}, false, 0, 6, (Object) null);
                if (U.size() != 2) {
                    return null;
                }
                String str = (String) r.p(U);
                String str2 = (String) r.w(U);
                if (o0.V(str) || o0.V(str2)) {
                    return null;
                }
                String optString2 = jSONObject.optString("url");
                if (!o0.V(optString2)) {
                    uri = Uri.parse(optString2);
                }
                return new a(str, str2, uri, b(jSONObject.optJSONArray("versions")), (g) null);
            }
        }

        private a(String str, String str2, Uri uri, int[] iArr) {
            this.a = str;
            this.b = str2;
        }

        public /* synthetic */ a(String str, String str2, Uri uri, int[] iArr, g gVar) {
            this(str, str2, uri, iArr);
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }
    }

    public c0(boolean z, String str, boolean z2, int i2, EnumSet<n0> enumSet, Map<String, ? extends Map<String, a>> map, boolean z3, x xVar, String str2, String str3, boolean z4, boolean z5, JSONArray jSONArray, String str4, boolean z6, boolean z7, String str5, String str6, String str7) {
        String str8 = str4;
        String str9 = str;
        l.d(str, "nuxContent");
        l.d(enumSet, "smartLoginOptions");
        Map<String, ? extends Map<String, a>> map2 = map;
        l.d(map, "dialogConfigurations");
        l.d(xVar, "errorClassification");
        String str10 = str2;
        l.d(str2, "smartLoginBookmarkIconURL");
        l.d(str3, "smartLoginMenuIconURL");
        l.d(str8, "sdkUpdateMessage");
        this.a = z;
        this.b = i2;
        this.c = enumSet;
        this.f1419d = z3;
        this.f1420e = xVar;
        this.f1421f = z4;
        this.f1422g = z5;
        this.f1423h = jSONArray;
        this.f1424i = str8;
        this.f1425j = str5;
        this.f1426k = str6;
        this.f1427l = str7;
    }

    public final boolean a() {
        return this.f1419d;
    }

    public final boolean b() {
        return this.f1422g;
    }

    public final x c() {
        return this.f1420e;
    }

    public final JSONArray d() {
        return this.f1423h;
    }

    public final boolean e() {
        return this.f1421f;
    }

    public final String f() {
        return this.f1425j;
    }

    public final String g() {
        return this.f1427l;
    }

    public final String h() {
        return this.f1424i;
    }

    public final int i() {
        return this.b;
    }

    public final EnumSet<n0> j() {
        return this.c;
    }

    public final String k() {
        return this.f1426k;
    }

    public final boolean l() {
        return this.a;
    }
}
