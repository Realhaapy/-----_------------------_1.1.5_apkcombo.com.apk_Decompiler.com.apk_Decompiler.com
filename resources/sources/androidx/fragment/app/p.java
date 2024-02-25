package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.n;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    ArrayList<t> f1089e;

    /* renamed from: f  reason: collision with root package name */
    ArrayList<String> f1090f;

    /* renamed from: g  reason: collision with root package name */
    b[] f1091g;

    /* renamed from: h  reason: collision with root package name */
    int f1092h;

    /* renamed from: i  reason: collision with root package name */
    String f1093i = null;

    /* renamed from: j  reason: collision with root package name */
    ArrayList<String> f1094j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    ArrayList<Bundle> f1095k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    ArrayList<n.m> f1096l;

    class a implements Parcelable.Creator<p> {
        a() {
        }

        /* renamed from: a */
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        /* renamed from: b */
        public p[] newArray(int i2) {
            return new p[i2];
        }
    }

    public p() {
    }

    public p(Parcel parcel) {
        this.f1089e = parcel.createTypedArrayList(t.CREATOR);
        this.f1090f = parcel.createStringArrayList();
        this.f1091g = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f1092h = parcel.readInt();
        this.f1093i = parcel.readString();
        this.f1094j = parcel.createStringArrayList();
        this.f1095k = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f1096l = parcel.createTypedArrayList(n.m.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.f1089e);
        parcel.writeStringList(this.f1090f);
        parcel.writeTypedArray(this.f1091g, i2);
        parcel.writeInt(this.f1092h);
        parcel.writeString(this.f1093i);
        parcel.writeStringList(this.f1094j);
        parcel.writeTypedList(this.f1095k);
        parcel.writeTypedList(this.f1096l);
    }
}
