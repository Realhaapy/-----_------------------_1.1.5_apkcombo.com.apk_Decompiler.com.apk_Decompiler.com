package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.internal.o0;
import com.facebook.internal.p0;
import com.facebook.u;
import m.y.d.g;
import m.y.d.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class q0 implements Parcelable {
    public static final Parcelable.Creator<q0> CREATOR = new a();

    /* renamed from: l  reason: collision with root package name */
    public static final b f1727l = new b((g) null);
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final String f1728m;

    /* renamed from: e  reason: collision with root package name */
    private final String f1729e;

    /* renamed from: f  reason: collision with root package name */
    private final String f1730f;

    /* renamed from: g  reason: collision with root package name */
    private final String f1731g;

    /* renamed from: h  reason: collision with root package name */
    private final String f1732h;

    /* renamed from: i  reason: collision with root package name */
    private final String f1733i;

    /* renamed from: j  reason: collision with root package name */
    private final Uri f1734j;

    /* renamed from: k  reason: collision with root package name */
    private final Uri f1735k;

    public static final class a implements Parcelable.Creator<q0> {
        a() {
        }

        /* renamed from: a */
        public q0 createFromParcel(Parcel parcel) {
            l.d(parcel, "source");
            return new q0(parcel, (g) null);
        }

        /* renamed from: b */
        public q0[] newArray(int i2) {
            return new q0[i2];
        }
    }

    public static final class b {

        public static final class a implements o0.a {
            a() {
            }

            public void a(c0 c0Var) {
                Log.e(q0.f1728m, l.j("Got unexpected exception: ", c0Var));
            }

            public void b(JSONObject jSONObject) {
                Uri uri = null;
                String optString = jSONObject == null ? null : jSONObject.optString("id");
                if (optString == null) {
                    Log.w(q0.f1728m, "No user ID returned on Me request");
                    return;
                }
                String optString2 = jSONObject.optString("link");
                String optString3 = jSONObject.optString("profile_picture", (String) null);
                String optString4 = jSONObject.optString("first_name");
                String optString5 = jSONObject.optString("middle_name");
                String optString6 = jSONObject.optString("last_name");
                String optString7 = jSONObject.optString("name");
                Uri parse = optString2 != null ? Uri.parse(optString2) : null;
                if (optString3 != null) {
                    uri = Uri.parse(optString3);
                }
                q0.f1727l.c(new q0(optString, optString4, optString5, optString6, optString7, parse, uri));
            }
        }

        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final void a() {
            u.c cVar = u.f1749p;
            u e2 = cVar.e();
            if (e2 != null) {
                if (!cVar.g()) {
                    c((q0) null);
                    return;
                }
                o0 o0Var = o0.a;
                o0.B(e2.l(), new a());
            }
        }

        public final q0 b() {
            return s0.f1741d.a().c();
        }

        public final void c(q0 q0Var) {
            s0.f1741d.a().f(q0Var);
        }
    }

    static {
        String simpleName = q0.class.getSimpleName();
        l.c(simpleName, "Profile::class.java.simpleName");
        f1728m = simpleName;
    }

    private q0(Parcel parcel) {
        this.f1729e = parcel.readString();
        this.f1730f = parcel.readString();
        this.f1731g = parcel.readString();
        this.f1732h = parcel.readString();
        this.f1733i = parcel.readString();
        String readString = parcel.readString();
        Uri uri = null;
        this.f1734j = readString == null ? null : Uri.parse(readString);
        String readString2 = parcel.readString();
        this.f1735k = readString2 != null ? Uri.parse(readString2) : uri;
    }

    public /* synthetic */ q0(Parcel parcel, g gVar) {
        this(parcel);
    }

    public q0(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        p0 p0Var = p0.a;
        p0.k(str, "id");
        this.f1729e = str;
        this.f1730f = str2;
        this.f1731g = str3;
        this.f1732h = str4;
        this.f1733i = str5;
        this.f1734j = uri;
        this.f1735k = uri2;
    }

    public q0(JSONObject jSONObject) {
        l.d(jSONObject, "jsonObject");
        Uri uri = null;
        this.f1729e = jSONObject.optString("id", (String) null);
        this.f1730f = jSONObject.optString("first_name", (String) null);
        this.f1731g = jSONObject.optString("middle_name", (String) null);
        this.f1732h = jSONObject.optString("last_name", (String) null);
        this.f1733i = jSONObject.optString("name", (String) null);
        String optString = jSONObject.optString("link_uri", (String) null);
        this.f1734j = optString == null ? null : Uri.parse(optString);
        String optString2 = jSONObject.optString("picture_uri", (String) null);
        this.f1735k = optString2 != null ? Uri.parse(optString2) : uri;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f1729e);
            jSONObject.put("first_name", this.f1730f);
            jSONObject.put("middle_name", this.f1731g);
            jSONObject.put("last_name", this.f1732h);
            jSONObject.put("name", this.f1733i);
            Uri uri = this.f1734j;
            if (uri != null) {
                jSONObject.put("link_uri", uri.toString());
            }
            Uri uri2 = this.f1735k;
            if (uri2 != null) {
                jSONObject.put("picture_uri", uri2.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r1 = r4.f1730f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        r1 = r4.f1731g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        r1 = r4.f1732h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        r1 = r4.f1733i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
        r1 = r4.f1734j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008e, code lost:
        r1 = r4.f1735k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.facebook.q0
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = r4.f1729e
            if (r1 != 0) goto L_0x0015
            r3 = r5
            com.facebook.q0 r3 = (com.facebook.q0) r3
            java.lang.String r3 = r3.f1729e
            if (r3 == 0) goto L_0x0020
        L_0x0015:
            r3 = r5
            com.facebook.q0 r3 = (com.facebook.q0) r3
            java.lang.String r3 = r3.f1729e
            boolean r1 = m.y.d.l.a(r1, r3)
            if (r1 == 0) goto L_0x00a4
        L_0x0020:
            java.lang.String r1 = r4.f1730f
            if (r1 != 0) goto L_0x002b
            r3 = r5
            com.facebook.q0 r3 = (com.facebook.q0) r3
            java.lang.String r3 = r3.f1730f
            if (r3 == 0) goto L_0x0036
        L_0x002b:
            r3 = r5
            com.facebook.q0 r3 = (com.facebook.q0) r3
            java.lang.String r3 = r3.f1730f
            boolean r1 = m.y.d.l.a(r1, r3)
            if (r1 == 0) goto L_0x00a4
        L_0x0036:
            java.lang.String r1 = r4.f1731g
            if (r1 != 0) goto L_0x0041
            r3 = r5
            com.facebook.q0 r3 = (com.facebook.q0) r3
            java.lang.String r3 = r3.f1731g
            if (r3 == 0) goto L_0x004c
        L_0x0041:
            r3 = r5
            com.facebook.q0 r3 = (com.facebook.q0) r3
            java.lang.String r3 = r3.f1731g
            boolean r1 = m.y.d.l.a(r1, r3)
            if (r1 == 0) goto L_0x00a4
        L_0x004c:
            java.lang.String r1 = r4.f1732h
            if (r1 != 0) goto L_0x0057
            r3 = r5
            com.facebook.q0 r3 = (com.facebook.q0) r3
            java.lang.String r3 = r3.f1732h
            if (r3 == 0) goto L_0x0062
        L_0x0057:
            r3 = r5
            com.facebook.q0 r3 = (com.facebook.q0) r3
            java.lang.String r3 = r3.f1732h
            boolean r1 = m.y.d.l.a(r1, r3)
            if (r1 == 0) goto L_0x00a4
        L_0x0062:
            java.lang.String r1 = r4.f1733i
            if (r1 != 0) goto L_0x006d
            r3 = r5
            com.facebook.q0 r3 = (com.facebook.q0) r3
            java.lang.String r3 = r3.f1733i
            if (r3 == 0) goto L_0x0078
        L_0x006d:
            r3 = r5
            com.facebook.q0 r3 = (com.facebook.q0) r3
            java.lang.String r3 = r3.f1733i
            boolean r1 = m.y.d.l.a(r1, r3)
            if (r1 == 0) goto L_0x00a4
        L_0x0078:
            android.net.Uri r1 = r4.f1734j
            if (r1 != 0) goto L_0x0083
            r3 = r5
            com.facebook.q0 r3 = (com.facebook.q0) r3
            android.net.Uri r3 = r3.f1734j
            if (r3 == 0) goto L_0x008e
        L_0x0083:
            r3 = r5
            com.facebook.q0 r3 = (com.facebook.q0) r3
            android.net.Uri r3 = r3.f1734j
            boolean r1 = m.y.d.l.a(r1, r3)
            if (r1 == 0) goto L_0x00a4
        L_0x008e:
            android.net.Uri r1 = r4.f1735k
            if (r1 != 0) goto L_0x0099
            r3 = r5
            com.facebook.q0 r3 = (com.facebook.q0) r3
            android.net.Uri r3 = r3.f1735k
            if (r3 == 0) goto L_0x00a5
        L_0x0099:
            com.facebook.q0 r5 = (com.facebook.q0) r5
            android.net.Uri r5 = r5.f1735k
            boolean r5 = m.y.d.l.a(r1, r5)
            if (r5 == 0) goto L_0x00a4
            goto L_0x00a5
        L_0x00a4:
            r0 = 0
        L_0x00a5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.q0.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f1729e;
        int hashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.f1730f;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.f1731g;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.f1732h;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        String str5 = this.f1733i;
        if (str5 != null) {
            hashCode = (hashCode * 31) + str5.hashCode();
        }
        Uri uri = this.f1734j;
        if (uri != null) {
            hashCode = (hashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.f1735k;
        return uri2 != null ? (hashCode * 31) + uri2.hashCode() : hashCode;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "dest");
        parcel.writeString(this.f1729e);
        parcel.writeString(this.f1730f);
        parcel.writeString(this.f1731g);
        parcel.writeString(this.f1732h);
        parcel.writeString(this.f1733i);
        Uri uri = this.f1734j;
        String str = null;
        parcel.writeString(uri == null ? null : uri.toString());
        Uri uri2 = this.f1735k;
        if (uri2 != null) {
            str = uri2.toString();
        }
        parcel.writeString(str);
    }
}
