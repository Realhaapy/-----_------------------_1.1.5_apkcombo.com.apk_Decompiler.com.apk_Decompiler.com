package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.c0;
import com.facebook.internal.d0;
import com.facebook.internal.x;
import java.net.HttpURLConnection;
import m.y.d.g;
import m.y.d.l;
import org.json.JSONObject;

public final class f0 implements Parcelable {
    public static final Parcelable.Creator<f0> CREATOR = new b();

    /* renamed from: o  reason: collision with root package name */
    public static final c f1366o = new c((g) null);
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final d f1367p = new d(200, 299);

    /* renamed from: e  reason: collision with root package name */
    private final int f1368e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1369f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1370g;

    /* renamed from: h  reason: collision with root package name */
    private final String f1371h;

    /* renamed from: i  reason: collision with root package name */
    private final String f1372i;

    /* renamed from: j  reason: collision with root package name */
    private final String f1373j;

    /* renamed from: k  reason: collision with root package name */
    private final Object f1374k;

    /* renamed from: l  reason: collision with root package name */
    private final String f1375l;

    /* renamed from: m  reason: collision with root package name */
    private c0 f1376m;

    /* renamed from: n  reason: collision with root package name */
    private final a f1377n;

    public enum a {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    public static final class b implements Parcelable.Creator<f0> {
        b() {
        }

        /* renamed from: a */
        public f0 createFromParcel(Parcel parcel) {
            l.d(parcel, "parcel");
            return new f0(parcel, (g) null);
        }

        /* renamed from: b */
        public f0[] newArray(int i2) {
            return new f0[i2];
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(g gVar) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:50:0x00d1 A[Catch:{ JSONException -> 0x012f }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.facebook.f0 a(org.json.JSONObject r20, java.lang.Object r21, java.net.HttpURLConnection r22) {
            /*
                r19 = this;
                r9 = r20
                java.lang.String r0 = "error_code"
                java.lang.String r1 = "error"
                java.lang.String r2 = "FACEBOOK_NON_JSON_RESULT"
                java.lang.String r3 = "body"
                java.lang.String r4 = "code"
                java.lang.String r5 = "singleResult"
                m.y.d.l.d(r9, r5)
                r15 = 0
                boolean r5 = r9.has(r4)     // Catch:{ JSONException -> 0x012f }
                if (r5 == 0) goto L_0x012f
                int r5 = r9.getInt(r4)     // Catch:{ JSONException -> 0x012f }
                com.facebook.internal.o0 r6 = com.facebook.internal.o0.a     // Catch:{ JSONException -> 0x012f }
                java.lang.Object r6 = com.facebook.internal.o0.I(r9, r3, r2)     // Catch:{ JSONException -> 0x012f }
                if (r6 == 0) goto L_0x00f2
                boolean r7 = r6 instanceof org.json.JSONObject     // Catch:{ JSONException -> 0x012f }
                if (r7 == 0) goto L_0x00f2
                r7 = r6
                org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ JSONException -> 0x012f }
                boolean r7 = r7.has(r1)     // Catch:{ JSONException -> 0x012f }
                r8 = 1
                java.lang.String r10 = "error_subcode"
                r11 = 0
                r12 = -1
                if (r7 == 0) goto L_0x0085
                r0 = r6
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x012f }
                java.lang.Object r0 = com.facebook.internal.o0.I(r0, r1, r15)     // Catch:{ JSONException -> 0x012f }
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x012f }
                if (r0 != 0) goto L_0x0043
                r1 = r15
                goto L_0x0049
            L_0x0043:
                java.lang.String r1 = "type"
                java.lang.String r1 = r0.optString(r1, r15)     // Catch:{ JSONException -> 0x012f }
            L_0x0049:
                if (r0 != 0) goto L_0x004d
                r7 = r15
                goto L_0x0053
            L_0x004d:
                java.lang.String r7 = "message"
                java.lang.String r7 = r0.optString(r7, r15)     // Catch:{ JSONException -> 0x012f }
            L_0x0053:
                if (r0 != 0) goto L_0x0057
                r4 = -1
                goto L_0x005b
            L_0x0057:
                int r4 = r0.optInt(r4, r12)     // Catch:{ JSONException -> 0x012f }
            L_0x005b:
                if (r0 != 0) goto L_0x005e
                goto L_0x0062
            L_0x005e:
                int r12 = r0.optInt(r10, r12)     // Catch:{ JSONException -> 0x012f }
            L_0x0062:
                if (r0 != 0) goto L_0x0066
                r10 = r15
                goto L_0x006c
            L_0x0066:
                java.lang.String r10 = "error_user_msg"
                java.lang.String r10 = r0.optString(r10, r15)     // Catch:{ JSONException -> 0x012f }
            L_0x006c:
                if (r0 != 0) goto L_0x0070
                r13 = r15
                goto L_0x0076
            L_0x0070:
                java.lang.String r13 = "error_user_title"
                java.lang.String r13 = r0.optString(r13, r15)     // Catch:{ JSONException -> 0x012f }
            L_0x0076:
                if (r0 != 0) goto L_0x0079
                goto L_0x007f
            L_0x0079:
                java.lang.String r14 = "is_transient"
                boolean r11 = r0.optBoolean(r14, r11)     // Catch:{ JSONException -> 0x012f }
            L_0x007f:
                r8 = r7
                r14 = r11
                r7 = r12
                r11 = 1
                r12 = r4
                goto L_0x00ce
            L_0x0085:
                r1 = r6
                org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x012f }
                boolean r1 = r1.has(r0)     // Catch:{ JSONException -> 0x012f }
                java.lang.String r4 = "error_msg"
                java.lang.String r7 = "error_reason"
                if (r1 != 0) goto L_0x00ac
                r1 = r6
                org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x012f }
                boolean r1 = r1.has(r4)     // Catch:{ JSONException -> 0x012f }
                if (r1 != 0) goto L_0x00ac
                r1 = r6
                org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x012f }
                boolean r1 = r1.has(r7)     // Catch:{ JSONException -> 0x012f }
                if (r1 == 0) goto L_0x00a5
                goto L_0x00ac
            L_0x00a5:
                r4 = r15
                r8 = r4
                r10 = r8
                r13 = r10
                r7 = -1
                r14 = 0
                goto L_0x00cf
            L_0x00ac:
                r1 = r6
                org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x012f }
                java.lang.String r1 = r1.optString(r7, r15)     // Catch:{ JSONException -> 0x012f }
                r7 = r6
                org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ JSONException -> 0x012f }
                java.lang.String r4 = r7.optString(r4, r15)     // Catch:{ JSONException -> 0x012f }
                r7 = r6
                org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ JSONException -> 0x012f }
                int r0 = r7.optInt(r0, r12)     // Catch:{ JSONException -> 0x012f }
                r7 = r6
                org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ JSONException -> 0x012f }
                int r7 = r7.optInt(r10, r12)     // Catch:{ JSONException -> 0x012f }
                r12 = r0
                r8 = r4
                r10 = r15
                r13 = r10
                r11 = 1
                r14 = 0
            L_0x00ce:
                r4 = r1
            L_0x00cf:
                if (r11 == 0) goto L_0x00f2
                com.facebook.f0 r16 = new com.facebook.f0     // Catch:{ JSONException -> 0x012f }
                r11 = r6
                org.json.JSONObject r11 = (org.json.JSONObject) r11     // Catch:{ JSONException -> 0x012f }
                r17 = 0
                r18 = 0
                r0 = r16
                r1 = r5
                r2 = r12
                r3 = r7
                r5 = r8
                r6 = r13
                r7 = r10
                r8 = r11
                r9 = r20
                r10 = r21
                r11 = r22
                r12 = r17
                r13 = r14
                r14 = r18
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x012f }
                return r16
            L_0x00f2:
                com.facebook.f0$d r0 = r19.c()     // Catch:{ JSONException -> 0x012f }
                boolean r0 = r0.a(r5)     // Catch:{ JSONException -> 0x012f }
                if (r0 != 0) goto L_0x012f
                com.facebook.f0 r16 = new com.facebook.f0     // Catch:{ JSONException -> 0x012f }
                r4 = -1
                r6 = -1
                r7 = 0
                r8 = 0
                r10 = 0
                r11 = 0
                boolean r0 = r9.has(r3)     // Catch:{ JSONException -> 0x012f }
                if (r0 == 0) goto L_0x0112
                java.lang.Object r0 = com.facebook.internal.o0.I(r9, r3, r2)     // Catch:{ JSONException -> 0x012f }
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x012f }
                r12 = r0
                goto L_0x0113
            L_0x0112:
                r12 = r15
            L_0x0113:
                r13 = 0
                r14 = 0
                r17 = 0
                r0 = r16
                r1 = r5
                r2 = r4
                r3 = r6
                r4 = r7
                r5 = r8
                r6 = r10
                r7 = r11
                r8 = r12
                r9 = r20
                r10 = r21
                r11 = r22
                r12 = r13
                r13 = r14
                r14 = r17
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x012f }
                return r16
            L_0x012f:
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.f0.c.a(org.json.JSONObject, java.lang.Object, java.net.HttpURLConnection):com.facebook.f0");
        }

        public final synchronized x b() {
            d0 d0Var = d0.a;
            g0 g0Var = g0.a;
            c0 c = d0.c(g0.d());
            if (c == null) {
                return x.f1541g.b();
            }
            return c.c();
        }

        public final d c() {
            return f0.f1367p;
        }
    }

    public static final class d {
        private final int a;
        private final int b;

        public d(int i2, int i3) {
            this.a = i2;
            this.b = i3;
        }

        public final boolean a(int i2) {
            return i2 <= this.b && this.a <= i2;
        }
    }

    private f0(int i2, int i3, int i4, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, c0 c0Var, boolean z) {
        boolean z2;
        this.f1368e = i2;
        this.f1369f = i3;
        this.f1370g = i4;
        this.f1371h = str;
        this.f1372i = str3;
        this.f1373j = str4;
        this.f1374k = obj;
        this.f1375l = str2;
        if (c0Var != null) {
            this.f1376m = c0Var;
            z2 = true;
        } else {
            this.f1376m = new i0(this, c());
            z2 = false;
        }
        a c2 = z2 ? a.OTHER : f1366o.b().c(i3, i4, z);
        this.f1377n = c2;
        f1366o.b().d(c2);
    }

    public /* synthetic */ f0(int i2, int i3, int i4, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, c0 c0Var, boolean z, g gVar) {
        this(i2, i3, i4, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, c0Var, z);
    }

    public f0(int i2, String str, String str2) {
        this(-1, i2, -1, str, str2, (String) null, (String) null, (JSONObject) null, (JSONObject) null, (Object) null, (HttpURLConnection) null, (c0) null, false);
    }

    private f0(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (JSONObject) null, (JSONObject) null, (Object) null, (HttpURLConnection) null, (c0) null, false);
    }

    public /* synthetic */ f0(Parcel parcel, g gVar) {
        this(parcel);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f0(java.net.HttpURLConnection r17, java.lang.Exception r18) {
        /*
            r16 = this;
            r0 = r18
            boolean r1 = r0 instanceof com.facebook.c0
            if (r1 == 0) goto L_0x000a
            com.facebook.c0 r0 = (com.facebook.c0) r0
            r14 = r0
            goto L_0x0010
        L_0x000a:
            com.facebook.c0 r1 = new com.facebook.c0
            r1.<init>((java.lang.Throwable) r0)
            r14 = r1
        L_0x0010:
            r15 = 0
            r3 = -1
            r4 = -1
            r5 = -1
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r16
            r13 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.f0.<init>(java.net.HttpURLConnection, java.lang.Exception):void");
    }

    public final int b() {
        return this.f1369f;
    }

    public final String c() {
        String str = this.f1375l;
        if (str != null) {
            return str;
        }
        c0 c0Var = this.f1376m;
        if (c0Var == null) {
            return null;
        }
        return c0Var.getLocalizedMessage();
    }

    public final String d() {
        return this.f1371h;
    }

    public int describeContents() {
        return 0;
    }

    public final c0 e() {
        return this.f1376m;
    }

    public final int f() {
        return this.f1368e;
    }

    public final int g() {
        return this.f1370g;
    }

    public String toString() {
        String str = "{HttpStatus: " + this.f1368e + ", errorCode: " + this.f1369f + ", subErrorCode: " + this.f1370g + ", errorType: " + this.f1371h + ", errorMessage: " + c() + "}";
        l.c(str, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "out");
        parcel.writeInt(this.f1368e);
        parcel.writeInt(this.f1369f);
        parcel.writeInt(this.f1370g);
        parcel.writeString(this.f1371h);
        parcel.writeString(c());
        parcel.writeString(this.f1372i);
        parcel.writeString(this.f1373j);
    }
}
