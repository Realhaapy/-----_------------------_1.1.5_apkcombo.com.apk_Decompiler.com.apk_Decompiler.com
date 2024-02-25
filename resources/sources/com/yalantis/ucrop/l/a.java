package com.yalantis.ucrop.l;

import android.os.Parcel;
import android.os.Parcelable;

public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0053a();

    /* renamed from: e  reason: collision with root package name */
    private final String f2993e;

    /* renamed from: f  reason: collision with root package name */
    private final float f2994f;

    /* renamed from: g  reason: collision with root package name */
    private final float f2995g;

    /* renamed from: com.yalantis.ucrop.l.a$a  reason: collision with other inner class name */
    static class C0053a implements Parcelable.Creator<a> {
        C0053a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: b */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    protected a(Parcel parcel) {
        this.f2993e = parcel.readString();
        this.f2994f = parcel.readFloat();
        this.f2995g = parcel.readFloat();
    }

    public a(String str, float f2, float f3) {
        this.f2993e = str;
        this.f2994f = f2;
        this.f2995g = f3;
    }

    public String a() {
        return this.f2993e;
    }

    public float b() {
        return this.f2994f;
    }

    public float c() {
        return this.f2995g;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f2993e);
        parcel.writeFloat(this.f2994f);
        parcel.writeFloat(this.f2995g);
    }
}
