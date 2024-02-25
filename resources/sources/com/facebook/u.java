package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.internal.o0;
import com.facebook.internal.p0;
import com.facebook.o0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import m.y.d.g;
import m.y.d.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new b();

    /* renamed from: p  reason: collision with root package name */
    public static final c f1749p = new c((g) null);

    /* renamed from: q  reason: collision with root package name */
    private static final Date f1750q;

    /* renamed from: r  reason: collision with root package name */
    private static final Date f1751r;

    /* renamed from: s  reason: collision with root package name */
    private static final Date f1752s = new Date();
    private static final x t = x.FACEBOOK_APPLICATION_WEB;

    /* renamed from: e  reason: collision with root package name */
    private final Date f1753e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<String> f1754f;

    /* renamed from: g  reason: collision with root package name */
    private final Set<String> f1755g;

    /* renamed from: h  reason: collision with root package name */
    private final Set<String> f1756h;

    /* renamed from: i  reason: collision with root package name */
    private final String f1757i;

    /* renamed from: j  reason: collision with root package name */
    private final x f1758j;

    /* renamed from: k  reason: collision with root package name */
    private final Date f1759k;

    /* renamed from: l  reason: collision with root package name */
    private final String f1760l;

    /* renamed from: m  reason: collision with root package name */
    private final String f1761m;

    /* renamed from: n  reason: collision with root package name */
    private final Date f1762n;

    /* renamed from: o  reason: collision with root package name */
    private final String f1763o;

    public interface a {
        void a(c0 c0Var);

        void b(u uVar);
    }

    public static final class b implements Parcelable.Creator<u> {
        b() {
        }

        /* renamed from: a */
        public u createFromParcel(Parcel parcel) {
            l.d(parcel, "source");
            return new u(parcel);
        }

        /* renamed from: b */
        public u[] newArray(int i2) {
            return new u[i2];
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(g gVar) {
            this();
        }

        public final u a(u uVar) {
            l.d(uVar, "current");
            return new u(uVar.l(), uVar.c(), uVar.m(), uVar.j(), uVar.e(), uVar.f(), uVar.k(), new Date(), new Date(), uVar.d(), (String) null, 1024, (g) null);
        }

        public final u b(JSONObject jSONObject) {
            l.d(jSONObject, "jsonObject");
            if (jSONObject.getInt("version") <= 1) {
                String string = jSONObject.getString("token");
                Date date = new Date(jSONObject.getLong("expires_at"));
                JSONArray jSONArray = jSONObject.getJSONArray("permissions");
                JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
                JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
                Date date2 = new Date(jSONObject.getLong("last_refresh"));
                String string2 = jSONObject.getString("source");
                l.c(string2, "jsonObject.getString(SOURCE_KEY)");
                x valueOf = x.valueOf(string2);
                String string3 = jSONObject.getString("application_id");
                String string4 = jSONObject.getString("user_id");
                Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0));
                String optString = jSONObject.optString("graph_domain", (String) null);
                l.c(string, "token");
                l.c(string3, "applicationId");
                l.c(string4, "userId");
                o0 o0Var = o0.a;
                l.c(jSONArray, "permissionsArray");
                List<String> Z = o0.Z(jSONArray);
                l.c(jSONArray2, "declinedPermissionsArray");
                return new u(string, string3, string4, Z, o0.Z(jSONArray2), optJSONArray == null ? new ArrayList() : o0.Z(optJSONArray), valueOf, date, date2, date3, optString);
            }
            throw new c0("Unknown AccessToken serialization format.");
        }

        public final u c(Bundle bundle) {
            String str;
            Bundle bundle2 = bundle;
            l.d(bundle2, "bundle");
            List<String> f2 = f(bundle2, "com.facebook.TokenCachingStrategy.Permissions");
            List<String> f3 = f(bundle2, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
            List<String> f4 = f(bundle2, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
            o0.a aVar = o0.c;
            String a = aVar.a(bundle2);
            com.facebook.internal.o0 o0Var = com.facebook.internal.o0.a;
            if (com.facebook.internal.o0.V(a)) {
                g0 g0Var = g0.a;
                a = g0.d();
            }
            String str2 = a;
            String f5 = aVar.f(bundle2);
            if (f5 == null) {
                return null;
            }
            JSONObject d2 = com.facebook.internal.o0.d(f5);
            if (d2 == null) {
                str = null;
            } else {
                try {
                    str = d2.getString("id");
                } catch (JSONException unused) {
                    return null;
                }
            }
            if (str2 == null || str == null) {
                return null;
            }
            return new u(f5, str2, str, f2, f3, f4, aVar.e(bundle2), aVar.c(bundle2), aVar.d(bundle2), (Date) null, (String) null, 1024, (g) null);
        }

        public final void d() {
            u e2 = w.f1771f.e().e();
            if (e2 != null) {
                h(a(e2));
            }
        }

        public final u e() {
            return w.f1771f.e().e();
        }

        public final List<String> f(Bundle bundle, String str) {
            l.d(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            if (stringArrayList == null) {
                return j.e();
            }
            List<String> unmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            l.c(unmodifiableList, "{\n            Collections.unmodifiableList(ArrayList(originalPermissions))\n          }");
            return unmodifiableList;
        }

        public final boolean g() {
            u e2 = w.f1771f.e().e();
            return e2 != null && !e2.n();
        }

        public final void h(u uVar) {
            w.f1771f.e().r(uVar);
        }
    }

    public /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[x.values().length];
            iArr[x.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            iArr[x.CHROME_CUSTOM_TAB.ordinal()] = 2;
            iArr[x.WEB_VIEW.ordinal()] = 3;
            a = iArr;
        }
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        f1750q = date;
        f1751r = date;
    }

    public u(Parcel parcel) {
        l.d(parcel, "parcel");
        this.f1753e = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        l.c(unmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.f1754f = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        l.c(unmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.f1755g = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        l.c(unmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.f1756h = unmodifiableSet3;
        String readString = parcel.readString();
        p0 p0Var = p0.a;
        p0.k(readString, "token");
        this.f1757i = readString;
        String readString2 = parcel.readString();
        this.f1758j = readString2 != null ? x.valueOf(readString2) : t;
        this.f1759k = new Date(parcel.readLong());
        String readString3 = parcel.readString();
        p0.k(readString3, "applicationId");
        this.f1760l = readString3;
        String readString4 = parcel.readString();
        p0.k(readString4, "userId");
        this.f1761m = readString4;
        this.f1762n = new Date(parcel.readLong());
        this.f1763o = parcel.readString();
    }

    public u(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, x xVar, Date date, Date date2, Date date3, String str4) {
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        l.d(str, "accessToken");
        l.d(str2, "applicationId");
        l.d(str3, "userId");
        p0 p0Var = p0.a;
        p0.g(str, "accessToken");
        p0.g(str2, "applicationId");
        p0.g(str3, "userId");
        this.f1753e = date == null ? f1751r : date;
        if (collection == null) {
            hashSet = new HashSet();
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        l.c(unmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.f1754f = unmodifiableSet;
        if (collection2 == null) {
            hashSet2 = new HashSet();
        }
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(hashSet2);
        l.c(unmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.f1755g = unmodifiableSet2;
        if (collection3 == null) {
            hashSet3 = new HashSet();
        }
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(hashSet3);
        l.c(unmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.f1756h = unmodifiableSet3;
        this.f1757i = str;
        this.f1758j = b(xVar == null ? t : xVar, str4);
        this.f1759k = date2 == null ? f1752s : date2;
        this.f1760l = str2;
        this.f1761m = str3;
        this.f1762n = (date3 == null || date3.getTime() == 0) ? f1751r : date3;
        this.f1763o = str4 == null ? "facebook" : str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, x xVar, Date date, Date date2, Date date3, String str4, int i2, g gVar) {
        this(str, str2, str3, collection, collection2, collection3, xVar, date, date2, date3, (i2 & 1024) != 0 ? "facebook" : str4);
    }

    private final void a(StringBuilder sb) {
        sb.append(" permissions:");
        sb.append("[");
        sb.append(TextUtils.join(", ", this.f1754f));
        sb.append("]");
    }

    private final x b(x xVar, String str) {
        if (str == null || !str.equals("instagram")) {
            return xVar;
        }
        int i2 = d.a[xVar.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? xVar : x.INSTAGRAM_WEB_VIEW : x.INSTAGRAM_CUSTOM_CHROME_TAB : x.INSTAGRAM_APPLICATION_WEB;
    }

    private final String p() {
        g0 g0Var = g0.a;
        return g0.x(p0.INCLUDE_ACCESS_TOKENS) ? this.f1757i : "ACCESS_TOKEN_REMOVED";
    }

    public final String c() {
        return this.f1760l;
    }

    public final Date d() {
        return this.f1762n;
    }

    public int describeContents() {
        return 0;
    }

    public final Set<String> e() {
        return this.f1755g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (l.a(this.f1753e, uVar.f1753e) && l.a(this.f1754f, uVar.f1754f) && l.a(this.f1755g, uVar.f1755g) && l.a(this.f1756h, uVar.f1756h) && l.a(this.f1757i, uVar.f1757i) && this.f1758j == uVar.f1758j && l.a(this.f1759k, uVar.f1759k) && l.a(this.f1760l, uVar.f1760l) && l.a(this.f1761m, uVar.f1761m) && l.a(this.f1762n, uVar.f1762n)) {
            String str = this.f1763o;
            String str2 = uVar.f1763o;
            if (str == null ? str2 == null : l.a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public final Set<String> f() {
        return this.f1756h;
    }

    public final Date g() {
        return this.f1753e;
    }

    public final String h() {
        return this.f1763o;
    }

    public int hashCode() {
        int hashCode = (((((((((((((((((((527 + this.f1753e.hashCode()) * 31) + this.f1754f.hashCode()) * 31) + this.f1755g.hashCode()) * 31) + this.f1756h.hashCode()) * 31) + this.f1757i.hashCode()) * 31) + this.f1758j.hashCode()) * 31) + this.f1759k.hashCode()) * 31) + this.f1760l.hashCode()) * 31) + this.f1761m.hashCode()) * 31) + this.f1762n.hashCode()) * 31;
        String str = this.f1763o;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final Date i() {
        return this.f1759k;
    }

    public final Set<String> j() {
        return this.f1754f;
    }

    public final x k() {
        return this.f1758j;
    }

    public final String l() {
        return this.f1757i;
    }

    public final String m() {
        return this.f1761m;
    }

    public final boolean n() {
        return new Date().after(this.f1753e);
    }

    public final JSONObject o() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f1757i);
        jSONObject.put("expires_at", this.f1753e.getTime());
        jSONObject.put("permissions", new JSONArray(this.f1754f));
        jSONObject.put("declined_permissions", new JSONArray(this.f1755g));
        jSONObject.put("expired_permissions", new JSONArray(this.f1756h));
        jSONObject.put("last_refresh", this.f1759k.getTime());
        jSONObject.put("source", this.f1758j.name());
        jSONObject.put("application_id", this.f1760l);
        jSONObject.put("user_id", this.f1761m);
        jSONObject.put("data_access_expiration_time", this.f1762n.getTime());
        String str = this.f1763o;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        sb.append(p());
        a(sb);
        sb.append("}");
        String sb2 = sb.toString();
        l.c(sb2, "builder.toString()");
        return sb2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "dest");
        parcel.writeLong(this.f1753e.getTime());
        parcel.writeStringList(new ArrayList(this.f1754f));
        parcel.writeStringList(new ArrayList(this.f1755g));
        parcel.writeStringList(new ArrayList(this.f1756h));
        parcel.writeString(this.f1757i);
        parcel.writeString(this.f1758j.name());
        parcel.writeLong(this.f1759k.getTime());
        parcel.writeString(this.f1760l);
        parcel.writeString(this.f1761m);
        parcel.writeLong(this.f1762n.getTime());
        parcel.writeString(this.f1763o);
    }
}
