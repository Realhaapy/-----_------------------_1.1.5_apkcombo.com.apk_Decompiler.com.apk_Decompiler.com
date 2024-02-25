package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.internal.o0;
import com.facebook.internal.p0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import m.d0.d;
import m.y.d.g;
import m.y.d.k;
import m.y.d.l;
import m.y.d.s;
import org.json.JSONArray;
import org.json.JSONObject;

public final class z implements Parcelable {
    public static final Parcelable.Creator<z> CREATOR = new a();
    public static final b y = new b((g) null);

    /* renamed from: e  reason: collision with root package name */
    private final String f2199e;

    /* renamed from: f  reason: collision with root package name */
    private final String f2200f;

    /* renamed from: g  reason: collision with root package name */
    private final String f2201g;

    /* renamed from: h  reason: collision with root package name */
    private final String f2202h;

    /* renamed from: i  reason: collision with root package name */
    private final long f2203i;

    /* renamed from: j  reason: collision with root package name */
    private final long f2204j;

    /* renamed from: k  reason: collision with root package name */
    private final String f2205k;

    /* renamed from: l  reason: collision with root package name */
    private final String f2206l;

    /* renamed from: m  reason: collision with root package name */
    private final String f2207m;

    /* renamed from: n  reason: collision with root package name */
    private final String f2208n;

    /* renamed from: o  reason: collision with root package name */
    private final String f2209o;

    /* renamed from: p  reason: collision with root package name */
    private final String f2210p;

    /* renamed from: q  reason: collision with root package name */
    private final String f2211q;

    /* renamed from: r  reason: collision with root package name */
    private final Set<String> f2212r;

    /* renamed from: s  reason: collision with root package name */
    private final String f2213s;
    private final Map<String, Integer> t;
    private final Map<String, String> u;
    private final Map<String, String> v;
    private final String w;
    private final String x;

    public static final class a implements Parcelable.Creator<z> {
        a() {
        }

        /* renamed from: a */
        public z createFromParcel(Parcel parcel) {
            l.d(parcel, "source");
            return new z(parcel);
        }

        /* renamed from: b */
        public z[] newArray(int i2) {
            return new z[i2];
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final String a(JSONObject jSONObject, String str) {
            l.d(jSONObject, "<this>");
            l.d(str, "name");
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }
    }

    public z(Parcel parcel) {
        l.d(parcel, "parcel");
        String readString = parcel.readString();
        p0 p0Var = p0.a;
        p0.k(readString, "jti");
        this.f2199e = readString;
        String readString2 = parcel.readString();
        p0.k(readString2, "iss");
        this.f2200f = readString2;
        String readString3 = parcel.readString();
        p0.k(readString3, "aud");
        this.f2201g = readString3;
        String readString4 = parcel.readString();
        p0.k(readString4, "nonce");
        this.f2202h = readString4;
        this.f2203i = parcel.readLong();
        this.f2204j = parcel.readLong();
        String readString5 = parcel.readString();
        p0.k(readString5, "sub");
        this.f2205k = readString5;
        this.f2206l = parcel.readString();
        this.f2207m = parcel.readString();
        this.f2208n = parcel.readString();
        this.f2209o = parcel.readString();
        this.f2210p = parcel.readString();
        this.f2211q = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        Map<String, String> map = null;
        this.f2212r = createStringArrayList != null ? Collections.unmodifiableSet(new HashSet(createStringArrayList)) : null;
        this.f2213s = parcel.readString();
        HashMap readHashMap = parcel.readHashMap(k.a.getClass().getClassLoader());
        readHashMap = !(readHashMap instanceof HashMap) ? null : readHashMap;
        this.t = readHashMap != null ? Collections.unmodifiableMap(readHashMap) : null;
        s sVar = s.a;
        HashMap readHashMap2 = parcel.readHashMap(sVar.getClass().getClassLoader());
        readHashMap2 = !(readHashMap2 instanceof HashMap) ? null : readHashMap2;
        this.u = readHashMap2 != null ? Collections.unmodifiableMap(readHashMap2) : null;
        HashMap readHashMap3 = parcel.readHashMap(sVar.getClass().getClassLoader());
        readHashMap3 = !(readHashMap3 instanceof HashMap) ? null : readHashMap3;
        this.v = readHashMap3 != null ? Collections.unmodifiableMap(readHashMap3) : map;
        this.w = parcel.readString();
        this.x = parcel.readString();
    }

    public z(String str, String str2) {
        Set<String> set;
        Map<String, Integer> map;
        Map<String, String> map2;
        l.d(str, "encodedClaims");
        l.d(str2, "expectedNonce");
        p0 p0Var = p0.a;
        p0.g(str, "encodedClaims");
        byte[] decode = Base64.decode(str, 8);
        l.c(decode, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decode, d.a));
        if (a(jSONObject, str2)) {
            String string = jSONObject.getString("jti");
            l.c(string, "jsonObj.getString(JSON_KEY_JIT)");
            this.f2199e = string;
            String string2 = jSONObject.getString("iss");
            l.c(string2, "jsonObj.getString(JSON_KEY_ISS)");
            this.f2200f = string2;
            String string3 = jSONObject.getString("aud");
            l.c(string3, "jsonObj.getString(JSON_KEY_AUD)");
            this.f2201g = string3;
            String string4 = jSONObject.getString("nonce");
            l.c(string4, "jsonObj.getString(JSON_KEY_NONCE)");
            this.f2202h = string4;
            this.f2203i = jSONObject.getLong("exp");
            this.f2204j = jSONObject.getLong("iat");
            String string5 = jSONObject.getString("sub");
            l.c(string5, "jsonObj.getString(JSON_KEY_SUB)");
            this.f2205k = string5;
            b bVar = y;
            this.f2206l = bVar.a(jSONObject, "name");
            this.f2207m = bVar.a(jSONObject, "given_name");
            this.f2208n = bVar.a(jSONObject, "middle_name");
            this.f2209o = bVar.a(jSONObject, "family_name");
            this.f2210p = bVar.a(jSONObject, "email");
            this.f2211q = bVar.a(jSONObject, "picture");
            JSONArray optJSONArray = jSONObject.optJSONArray("user_friends");
            Map<String, String> map3 = null;
            if (optJSONArray == null) {
                set = null;
            } else {
                o0 o0Var = o0.a;
                set = Collections.unmodifiableSet(o0.Y(optJSONArray));
            }
            this.f2212r = set;
            this.f2213s = bVar.a(jSONObject, "user_birthday");
            JSONObject optJSONObject = jSONObject.optJSONObject("user_age_range");
            if (optJSONObject == null) {
                map = null;
            } else {
                o0 o0Var2 = o0.a;
                map = Collections.unmodifiableMap(o0.l(optJSONObject));
            }
            this.t = map;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("user_hometown");
            if (optJSONObject2 == null) {
                map2 = null;
            } else {
                o0 o0Var3 = o0.a;
                map2 = Collections.unmodifiableMap(o0.m(optJSONObject2));
            }
            this.u = map2;
            JSONObject optJSONObject3 = jSONObject.optJSONObject("user_location");
            if (optJSONObject3 != null) {
                o0 o0Var4 = o0.a;
                map3 = Collections.unmodifiableMap(o0.m(optJSONObject3));
            }
            this.v = map3;
            this.w = bVar.a(jSONObject, "user_gender");
            this.x = bVar.a(jSONObject, "user_link");
            return;
        }
        throw new IllegalArgumentException("Invalid claims".toString());
    }

    private final boolean a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return false;
        }
        String optString = jSONObject.optString("jti");
        l.c(optString, "jti");
        if (optString.length() == 0) {
            return false;
        }
        try {
            String optString2 = jSONObject.optString("iss");
            l.c(optString2, "iss");
            if (!(optString2.length() == 0) && (l.a(new URL(optString2).getHost(), "facebook.com") || l.a(new URL(optString2).getHost(), "www.facebook.com"))) {
                String optString3 = jSONObject.optString("aud");
                l.c(optString3, "aud");
                if (!(optString3.length() == 0)) {
                    g0 g0Var = g0.a;
                    if (l.a(optString3, g0.d())) {
                        long j2 = (long) 1000;
                        if (new Date().after(new Date(jSONObject.optLong("exp") * j2))) {
                            return false;
                        }
                        if (new Date().after(new Date((jSONObject.optLong("iat") * j2) + 600000))) {
                            return false;
                        }
                        String optString4 = jSONObject.optString("sub");
                        l.c(optString4, "sub");
                        if (optString4.length() == 0) {
                            return false;
                        }
                        String optString5 = jSONObject.optString("nonce");
                        l.c(optString5, "nonce");
                        return !(optString5.length() == 0) && l.a(optString5, str);
                    }
                }
            }
        } catch (MalformedURLException unused) {
        }
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.f2199e);
        jSONObject.put("iss", this.f2200f);
        jSONObject.put("aud", this.f2201g);
        jSONObject.put("nonce", this.f2202h);
        jSONObject.put("exp", this.f2203i);
        jSONObject.put("iat", this.f2204j);
        String str = this.f2205k;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.f2206l;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.f2207m;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.f2208n;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.f2209o;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.f2210p;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.f2211q;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        if (this.f2212r != null) {
            jSONObject.put("user_friends", new JSONArray(this.f2212r));
        }
        String str8 = this.f2213s;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        if (this.t != null) {
            jSONObject.put("user_age_range", new JSONObject(this.t));
        }
        if (this.u != null) {
            jSONObject.put("user_hometown", new JSONObject(this.u));
        }
        if (this.v != null) {
            jSONObject.put("user_location", new JSONObject(this.v));
        }
        String str9 = this.w;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.x;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        return jSONObject;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return l.a(this.f2199e, zVar.f2199e) && l.a(this.f2200f, zVar.f2200f) && l.a(this.f2201g, zVar.f2201g) && l.a(this.f2202h, zVar.f2202h) && this.f2203i == zVar.f2203i && this.f2204j == zVar.f2204j && l.a(this.f2205k, zVar.f2205k) && l.a(this.f2206l, zVar.f2206l) && l.a(this.f2207m, zVar.f2207m) && l.a(this.f2208n, zVar.f2208n) && l.a(this.f2209o, zVar.f2209o) && l.a(this.f2210p, zVar.f2210p) && l.a(this.f2211q, zVar.f2211q) && l.a(this.f2212r, zVar.f2212r) && l.a(this.f2213s, zVar.f2213s) && l.a(this.t, zVar.t) && l.a(this.u, zVar.u) && l.a(this.v, zVar.v) && l.a(this.w, zVar.w) && l.a(this.x, zVar.x);
    }

    public int hashCode() {
        int hashCode = (((((((((((((527 + this.f2199e.hashCode()) * 31) + this.f2200f.hashCode()) * 31) + this.f2201g.hashCode()) * 31) + this.f2202h.hashCode()) * 31) + c.a(this.f2203i)) * 31) + c.a(this.f2204j)) * 31) + this.f2205k.hashCode()) * 31;
        String str = this.f2206l;
        int i2 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2207m;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2208n;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f2209o;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f2210p;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f2211q;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Set<String> set = this.f2212r;
        int hashCode8 = (hashCode7 + (set == null ? 0 : set.hashCode())) * 31;
        String str7 = this.f2213s;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, Integer> map = this.t;
        int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.u;
        int hashCode11 = (hashCode10 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.v;
        int hashCode12 = (hashCode11 + (map3 == null ? 0 : map3.hashCode())) * 31;
        String str8 = this.w;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.x;
        if (str9 != null) {
            i2 = str9.hashCode();
        }
        return hashCode13 + i2;
    }

    public String toString() {
        String jSONObject = b().toString();
        l.c(jSONObject, "claimsJsonObject.toString()");
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "dest");
        parcel.writeString(this.f2199e);
        parcel.writeString(this.f2200f);
        parcel.writeString(this.f2201g);
        parcel.writeString(this.f2202h);
        parcel.writeLong(this.f2203i);
        parcel.writeLong(this.f2204j);
        parcel.writeString(this.f2205k);
        parcel.writeString(this.f2206l);
        parcel.writeString(this.f2207m);
        parcel.writeString(this.f2208n);
        parcel.writeString(this.f2209o);
        parcel.writeString(this.f2210p);
        parcel.writeString(this.f2211q);
        parcel.writeStringList(this.f2212r == null ? null : new ArrayList(this.f2212r));
        parcel.writeString(this.f2213s);
        parcel.writeMap(this.t);
        parcel.writeMap(this.u);
        parcel.writeMap(this.v);
        parcel.writeString(this.w);
        parcel.writeString(this.x);
    }
}
