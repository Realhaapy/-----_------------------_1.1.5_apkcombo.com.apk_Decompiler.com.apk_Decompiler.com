package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.v.a;
import com.google.android.gms.common.internal.v.c;
import com.google.android.gms.common.util.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new b();

    /* renamed from: e  reason: collision with root package name */
    final int f2352e;

    /* renamed from: f  reason: collision with root package name */
    private String f2353f;

    /* renamed from: g  reason: collision with root package name */
    private String f2354g;

    /* renamed from: h  reason: collision with root package name */
    private String f2355h;

    /* renamed from: i  reason: collision with root package name */
    private String f2356i;

    /* renamed from: j  reason: collision with root package name */
    private Uri f2357j;

    /* renamed from: k  reason: collision with root package name */
    private String f2358k;

    /* renamed from: l  reason: collision with root package name */
    private long f2359l;

    /* renamed from: m  reason: collision with root package name */
    private String f2360m;

    /* renamed from: n  reason: collision with root package name */
    List<Scope> f2361n;

    /* renamed from: o  reason: collision with root package name */
    private String f2362o;

    /* renamed from: p  reason: collision with root package name */
    private String f2363p;

    /* renamed from: q  reason: collision with root package name */
    private Set<Scope> f2364q = new HashSet();

    static {
        f.c();
    }

    GoogleSignInAccount(int i2, String str, String str2, String str3, String str4, Uri uri, String str5, long j2, String str6, List<Scope> list, String str7, String str8) {
        this.f2352e = i2;
        this.f2353f = str;
        this.f2354g = str2;
        this.f2355h = str3;
        this.f2356i = str4;
        this.f2357j = uri;
        this.f2358k = str5;
        this.f2359l = j2;
        this.f2360m = str6;
        this.f2361n = list;
        this.f2362o = str7;
        this.f2363p = str8;
    }

    public static GoogleSignInAccount l(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l2, String str7, Set<Scope> set) {
        long longValue = l2.longValue();
        n.d(str7);
        n.h(set);
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, longValue, str7, new ArrayList(set), str5, str6);
    }

    public static GoogleSignInAccount m(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        GoogleSignInAccount l2 = l(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str2 = jSONObject.optString("serverAuthCode");
        }
        l2.f2358k = str2;
        return l2;
    }

    public Account b() {
        String str = this.f2355h;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public String c() {
        return this.f2356i;
    }

    public String d() {
        return this.f2355h;
    }

    public String e() {
        return this.f2363p;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f2360m.equals(this.f2360m) && googleSignInAccount.j().equals(j());
    }

    public String f() {
        return this.f2362o;
    }

    public String g() {
        return this.f2353f;
    }

    public String h() {
        return this.f2354g;
    }

    public int hashCode() {
        return ((this.f2360m.hashCode() + 527) * 31) + j().hashCode();
    }

    public Uri i() {
        return this.f2357j;
    }

    public Set<Scope> j() {
        HashSet hashSet = new HashSet(this.f2361n);
        hashSet.addAll(this.f2364q);
        return hashSet;
    }

    public String k() {
        return this.f2358k;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.f(parcel, 1, this.f2352e);
        c.j(parcel, 2, g(), false);
        c.j(parcel, 3, h(), false);
        c.j(parcel, 4, d(), false);
        c.j(parcel, 5, c(), false);
        c.i(parcel, 6, i(), i2, false);
        c.j(parcel, 7, k(), false);
        c.h(parcel, 8, this.f2359l);
        c.j(parcel, 9, this.f2360m, false);
        c.m(parcel, 10, this.f2361n, false);
        c.j(parcel, 11, f(), false);
        c.j(parcel, 12, e(), false);
        c.b(parcel, a);
    }
}
