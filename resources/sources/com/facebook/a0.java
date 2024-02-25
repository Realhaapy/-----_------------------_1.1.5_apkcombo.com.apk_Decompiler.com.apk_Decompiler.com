package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.internal.p0;
import m.d0.d;
import m.y.d.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    private final String f1354e;

    /* renamed from: f  reason: collision with root package name */
    private final String f1355f;

    /* renamed from: g  reason: collision with root package name */
    private final String f1356g;

    public static final class a implements Parcelable.Creator<a0> {
        a() {
        }

        /* renamed from: a */
        public a0 createFromParcel(Parcel parcel) {
            l.d(parcel, "source");
            return new a0(parcel);
        }

        /* renamed from: b */
        public a0[] newArray(int i2) {
            return new a0[i2];
        }
    }

    public a0(Parcel parcel) {
        l.d(parcel, "parcel");
        String readString = parcel.readString();
        p0 p0Var = p0.a;
        p0.k(readString, "alg");
        this.f1354e = readString;
        String readString2 = parcel.readString();
        p0.k(readString2, "typ");
        this.f1355f = readString2;
        String readString3 = parcel.readString();
        p0.k(readString3, "kid");
        this.f1356g = readString3;
    }

    public a0(String str) {
        l.d(str, "encodedHeaderString");
        if (b(str)) {
            byte[] decode = Base64.decode(str, 0);
            l.c(decode, "decodedBytes");
            JSONObject jSONObject = new JSONObject(new String(decode, d.a));
            String string = jSONObject.getString("alg");
            l.c(string, "jsonObj.getString(\"alg\")");
            this.f1354e = string;
            String string2 = jSONObject.getString("typ");
            l.c(string2, "jsonObj.getString(\"typ\")");
            this.f1355f = string2;
            String string3 = jSONObject.getString("kid");
            l.c(string3, "jsonObj.getString(\"kid\")");
            this.f1356g = string3;
            return;
        }
        throw new IllegalArgumentException("Invalid Header".toString());
    }

    private final boolean b(String str) {
        p0 p0Var = p0.a;
        p0.g(str, "encodedHeaderString");
        byte[] decode = Base64.decode(str, 0);
        l.c(decode, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(decode, d.a));
            String optString = jSONObject.optString("alg");
            l.c(optString, "alg");
            boolean z = (optString.length() > 0) && l.a(optString, "RS256");
            String optString2 = jSONObject.optString("kid");
            l.c(optString2, "jsonObj.optString(\"kid\")");
            boolean z2 = optString2.length() > 0;
            String optString3 = jSONObject.optString("typ");
            l.c(optString3, "jsonObj.optString(\"typ\")");
            return z && z2 && (optString3.length() > 0);
        } catch (JSONException unused) {
            return false;
        }
    }

    public final String a() {
        return this.f1356g;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.f1354e);
        jSONObject.put("typ", this.f1355f);
        jSONObject.put("kid", this.f1356g);
        return jSONObject;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return l.a(this.f1354e, a0Var.f1354e) && l.a(this.f1355f, a0Var.f1355f) && l.a(this.f1356g, a0Var.f1356g);
    }

    public int hashCode() {
        return ((((527 + this.f1354e.hashCode()) * 31) + this.f1355f.hashCode()) * 31) + this.f1356g.hashCode();
    }

    public String toString() {
        String jSONObject = c().toString();
        l.c(jSONObject, "headerJsonObject.toString()");
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "dest");
        parcel.writeString(this.f1354e);
        parcel.writeString(this.f1355f);
        parcel.writeString(this.f1356g);
    }
}
