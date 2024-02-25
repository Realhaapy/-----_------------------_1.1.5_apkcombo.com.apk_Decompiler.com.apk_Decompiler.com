package com.facebook.y0.u0;

import android.util.Patterns;
import com.facebook.internal.s0.n.a;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import m.d0.d;
import m.p;
import m.y.d.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {
    public static final e a = new e();
    private static Map<String, String> b;
    private static Map<String, String> c;

    /* renamed from: d  reason: collision with root package name */
    private static Map<String, String> f2168d;

    /* renamed from: e  reason: collision with root package name */
    private static JSONObject f2169e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f2170f;

    private e() {
    }

    public static final float[] a(JSONObject jSONObject, String str) {
        Class<e> cls = e.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(jSONObject, "viewHierarchy");
            l.d(str, "appName");
            if (!f2170f) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i2 = 0; i2 < 30; i2++) {
                fArr[i2] = 0.0f;
            }
            try {
                String lowerCase = str.toLowerCase();
                l.c(lowerCase, "(this as java.lang.String).toLowerCase()");
                JSONObject jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                String optString = jSONObject.optString("screenname");
                JSONArray jSONArray = new JSONArray();
                e eVar = a;
                eVar.j(jSONObject2, jSONArray);
                eVar.m(fArr, eVar.i(jSONObject2));
                JSONObject b2 = eVar.b(jSONObject2);
                if (b2 == null) {
                    return null;
                }
                l.c(optString, "screenName");
                String jSONObject3 = jSONObject2.toString();
                l.c(jSONObject3, "viewTree.toString()");
                eVar.m(fArr, eVar.h(b2, jSONArray, optString, jSONObject3, lowerCase));
                return fArr;
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    private final JSONObject b(JSONObject jSONObject) {
        if (a.d(this)) {
            return null;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return jSONObject;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray == null) {
                return null;
            }
            int i2 = 0;
            int length = optJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i3 = i2 + 1;
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                    l.c(jSONObject2, "children.getJSONObject(i)");
                    JSONObject b2 = b(jSONObject2);
                    if (b2 != null) {
                        return b2;
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return null;
        } catch (JSONException unused) {
        } catch (Throwable th) {
            a.b(th, this);
        }
    }

    public static final String c(String str, String str2, String str3) {
        Class<e> cls = e.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(str, "buttonText");
            l.d(str2, "activityName");
            l.d(str3, "appName");
            String str4 = str3 + " | " + str2 + ", " + str;
            if (str4 != null) {
                String lowerCase = str4.toLowerCase();
                l.c(lowerCase, "(this as java.lang.String).toLowerCase()");
                return lowerCase;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    public static final void d(File file) {
        Class<e> cls = e.class;
        if (!a.d(cls)) {
            try {
                f2169e = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f2169e = new JSONObject(new String(bArr, d.a));
                try {
                    b = a0.f(p.a("ENGLISH", "1"), p.a("GERMAN", "2"), p.a("SPANISH", "3"), p.a("JAPANESE", "4"));
                    c = a0.f(p.a("VIEW_CONTENT", "0"), p.a("SEARCH", "1"), p.a("ADD_TO_CART", "2"), p.a("ADD_TO_WISHLIST", "3"), p.a("INITIATE_CHECKOUT", "4"), p.a("ADD_PAYMENT_INFO", "5"), p.a("PURCHASE", "6"), p.a("LEAD", "7"), p.a("COMPLETE_REGISTRATION", "8"));
                    f2168d = a0.f(p.a("BUTTON_TEXT", "1"), p.a("PAGE_TITLE", "2"), p.a("RESOLVED_DOCUMENT_LINK", "3"), p.a("BUTTON_ID", "4"));
                    f2170f = true;
                } catch (Throwable th) {
                    a.b(th, cls);
                }
            } catch (Exception unused) {
            }
        }
    }

    private final boolean e(JSONObject jSONObject) {
        if (a.d(this)) {
            return false;
        }
        try {
            return ((jSONObject.optInt("classtypebitmask") & 1) << 5) > 0;
        } catch (Throwable th) {
            a.b(th, this);
            return false;
        }
    }

    public static final boolean f() {
        Class<e> cls = e.class;
        if (a.d(cls)) {
            return false;
        }
        try {
            return f2170f;
        } catch (Throwable th) {
            a.b(th, cls);
            return false;
        }
    }

    private final boolean g(String[] strArr, String[] strArr2) {
        if (a.d(this)) {
            return false;
        }
        try {
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                String str = strArr[i2];
                i2++;
                int length2 = strArr2.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length2) {
                        String str2 = strArr2[i3];
                        i3++;
                        if (q.w(str2, str, false, 2, (Object) null)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            a.b(th, this);
            return false;
        }
    }

    private final float[] h(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        String str4 = str2;
        if (a.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i2 = 0; i2 < 30; i2++) {
                fArr[i2] = 0.0f;
            }
            int length = jSONArray.length();
            fArr[3] = length > 1 ? ((float) length) - 1.0f : 0.0f;
            try {
                int length2 = jSONArray.length();
                if (length2 > 0) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                        l.c(jSONObject2, "siblings.getJSONObject(i)");
                        if (e(jSONObject2)) {
                            fArr[9] = fArr[9] + 1.0f;
                        }
                        if (i4 >= length2) {
                            break;
                        }
                        i3 = i4;
                    }
                }
            } catch (JSONException unused) {
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str5 = str + '|' + str3;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            n(jSONObject, sb2, sb);
            String sb3 = sb.toString();
            l.c(sb3, "hintSB.toString()");
            String sb4 = sb2.toString();
            l.c(sb4, "textSB.toString()");
            fArr[15] = l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr[16] = l("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str5) ? 1.0f : 0.0f;
            fArr[17] = l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", sb3) ? 1.0f : 0.0f;
            fArr[18] = q.w(str4, "password", false, 2, (Object) null) ? 1.0f : 0.0f;
            fArr[19] = k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str4) ? 1.0f : 0.0f;
            fArr[20] = k("(?i)(sign in)|login|signIn", str4) ? 1.0f : 0.0f;
            fArr[21] = k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str4) ? 1.0f : 0.0f;
            fArr[22] = l("ENGLISH", "PURCHASE", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr[24] = l("ENGLISH", "PURCHASE", "PAGE_TITLE", str5) ? 1.0f : 0.0f;
            fArr[25] = k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", sb4) ? 1.0f : 0.0f;
            fArr[27] = k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str5) ? 1.0f : 0.0f;
            fArr[28] = l("ENGLISH", "LEAD", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr[29] = l("ENGLISH", "LEAD", "PAGE_TITLE", str5) ? 1.0f : 0.0f;
            return fArr;
        } catch (Throwable th) {
            a.b(th, this);
            return null;
        }
    }

    private final float[] i(JSONObject jSONObject) {
        if (a.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            int i2 = 0;
            for (int i3 = 0; i3 < 30; i3++) {
                fArr[i3] = 0.0f;
            }
            String optString = jSONObject.optString("text");
            l.c(optString, "node.optString(TEXT_KEY)");
            String lowerCase = optString.toLowerCase();
            l.c(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint");
            l.c(optString2, "node.optString(HINT_KEY)");
            String lowerCase2 = optString2.toLowerCase();
            l.c(lowerCase2, "(this as java.lang.String).toLowerCase()");
            String optString3 = jSONObject.optString("classname");
            l.c(optString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = optString3.toLowerCase();
            l.c(lowerCase3, "(this as java.lang.String).toLowerCase()");
            int optInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (g(new String[]{"$", "amount", "price", "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (g(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (g(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (g(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (optInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (optInt == 3 || optInt == 2) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (q.w(lowerCase3, "checkbox", false, 2, (Object) null)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (g(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (q.w(lowerCase3, "radio", false, 2, (Object) null) && q.w(lowerCase3, "button", false, 2, (Object) null)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                if (length > 0) {
                    while (true) {
                        int i4 = i2 + 1;
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                        l.c(jSONObject2, "childViews.getJSONObject(i)");
                        m(fArr, i(jSONObject2));
                        if (i4 >= length) {
                            break;
                        }
                        i2 = i4;
                    }
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            a.b(th, this);
            return null;
        }
    }

    private final boolean j(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        boolean z2;
        if (a.d(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            int length = optJSONArray.length();
            if (length > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    if (optJSONArray.getJSONObject(i2).optBoolean("is_interacted")) {
                        z2 = true;
                        z = true;
                        break;
                    } else if (i3 >= length) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
            z2 = false;
            z = false;
            JSONArray jSONArray2 = new JSONArray();
            if (z2) {
                int length2 = optJSONArray.length();
                if (length2 > 0) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i4 + 1;
                        jSONArray.put(optJSONArray.getJSONObject(i4));
                        if (i5 >= length2) {
                            break;
                        }
                        i4 = i5;
                    }
                }
            } else {
                int length3 = optJSONArray.length();
                if (length3 > 0) {
                    int i6 = 0;
                    while (true) {
                        int i7 = i6 + 1;
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i6);
                        l.c(jSONObject2, "child");
                        if (j(jSONObject2, jSONArray)) {
                            jSONArray2.put(jSONObject2);
                            z = true;
                        }
                        if (i7 >= length3) {
                            break;
                        }
                        i6 = i7;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            a.b(th, this);
            return false;
        }
    }

    private final boolean k(String str, String str2) {
        if (a.d(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            a.b(th, this);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042 A[Catch:{ all -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0043 A[Catch:{ all -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005c A[Catch:{ all -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005d A[Catch:{ all -> 0x007a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean l(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            boolean r0 = com.facebook.internal.s0.n.a.d(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            org.json.JSONObject r0 = f2169e     // Catch:{ all -> 0x007a }
            r2 = 0
            if (r0 == 0) goto L_0x0074
            java.lang.String r3 = "rulesForLanguage"
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch:{ all -> 0x007a }
            if (r0 != 0) goto L_0x0017
            r5 = r2
            goto L_0x0025
        L_0x0017:
            java.util.Map<java.lang.String, java.lang.String> r3 = b     // Catch:{ all -> 0x007a }
            if (r3 == 0) goto L_0x006e
            java.lang.Object r5 = r3.get(r5)     // Catch:{ all -> 0x007a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x007a }
            org.json.JSONObject r5 = r0.optJSONObject(r5)     // Catch:{ all -> 0x007a }
        L_0x0025:
            if (r5 != 0) goto L_0x0029
        L_0x0027:
            r5 = r2
            goto L_0x0040
        L_0x0029:
            java.lang.String r0 = "rulesForEvent"
            org.json.JSONObject r5 = r5.optJSONObject(r0)     // Catch:{ all -> 0x007a }
            if (r5 != 0) goto L_0x0032
            goto L_0x0027
        L_0x0032:
            java.util.Map<java.lang.String, java.lang.String> r0 = c     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0068
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x007a }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x007a }
            org.json.JSONObject r5 = r5.optJSONObject(r6)     // Catch:{ all -> 0x007a }
        L_0x0040:
            if (r5 != 0) goto L_0x0043
            goto L_0x005a
        L_0x0043:
            java.lang.String r6 = "positiveRules"
            org.json.JSONObject r5 = r5.optJSONObject(r6)     // Catch:{ all -> 0x007a }
            if (r5 != 0) goto L_0x004c
            goto L_0x005a
        L_0x004c:
            java.util.Map<java.lang.String, java.lang.String> r6 = f2168d     // Catch:{ all -> 0x007a }
            if (r6 == 0) goto L_0x0062
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x007a }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x007a }
            java.lang.String r2 = r5.optString(r6)     // Catch:{ all -> 0x007a }
        L_0x005a:
            if (r2 != 0) goto L_0x005d
            goto L_0x0061
        L_0x005d:
            boolean r1 = r4.k(r2, r8)     // Catch:{ all -> 0x007a }
        L_0x0061:
            return r1
        L_0x0062:
            java.lang.String r5 = "textTypeInfo"
            m.y.d.l.n(r5)     // Catch:{ all -> 0x007a }
            throw r2
        L_0x0068:
            java.lang.String r5 = "eventInfo"
            m.y.d.l.n(r5)     // Catch:{ all -> 0x007a }
            throw r2
        L_0x006e:
            java.lang.String r5 = "languageInfo"
            m.y.d.l.n(r5)     // Catch:{ all -> 0x007a }
            throw r2
        L_0x0074:
            java.lang.String r5 = "rules"
            m.y.d.l.n(r5)     // Catch:{ all -> 0x007a }
            throw r2
        L_0x007a:
            r5 = move-exception
            com.facebook.internal.s0.n.a.b(r5, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.u0.e.l(java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    private final void m(float[] fArr, float[] fArr2) {
        if (!a.d(this)) {
            int i2 = 0;
            try {
                int length = fArr.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i3 = i2 + 1;
                        fArr[i2] = fArr[i2] + fArr2[i2];
                        if (i3 <= length) {
                            i2 = i3;
                        } else {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                a.b(th, this);
            }
        }
    }

    private final void n(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        int length;
        if (!a.d(this)) {
            try {
                String optString = jSONObject.optString("text", "");
                l.c(optString, "view.optString(TEXT_KEY, \"\")");
                String lowerCase = optString.toLowerCase();
                l.c(lowerCase, "(this as java.lang.String).toLowerCase()");
                String optString2 = jSONObject.optString("hint", "");
                l.c(optString2, "view.optString(HINT_KEY, \"\")");
                String lowerCase2 = optString2.toLowerCase();
                l.c(lowerCase2, "(this as java.lang.String).toLowerCase()");
                boolean z = true;
                int i2 = 0;
                if (lowerCase.length() > 0) {
                    sb.append(lowerCase);
                    sb.append(" ");
                }
                if (lowerCase2.length() <= 0) {
                    z = false;
                }
                if (z) {
                    sb2.append(lowerCase2);
                    sb2.append(" ");
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                    while (true) {
                        int i3 = i2 + 1;
                        try {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                            l.c(jSONObject2, "currentChildView");
                            n(jSONObject2, sb, sb2);
                        } catch (JSONException unused) {
                        }
                        if (i3 < length) {
                            i2 = i3;
                        } else {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                a.b(th, this);
            }
        }
    }
}
