package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0006a();

    /* renamed from: e  reason: collision with root package name */
    private final int f90e;

    /* renamed from: f  reason: collision with root package name */
    private final Intent f91f;

    /* renamed from: androidx.activity.result.a$a  reason: collision with other inner class name */
    class C0006a implements Parcelable.Creator<a> {
        C0006a() {
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

    public a(int i2, Intent intent) {
        this.f90e = i2;
        this.f91f = intent;
    }

    a(Parcel parcel) {
        this.f90e = parcel.readInt();
        this.f91f = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    public static String c(int i2) {
        return i2 != -1 ? i2 != 0 ? String.valueOf(i2) : "RESULT_CANCELED" : "RESULT_OK";
    }

    public Intent a() {
        return this.f91f;
    }

    public int b() {
        return this.f90e;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + c(this.f90e) + ", data=" + this.f91f + '}';
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f90e);
        parcel.writeInt(this.f91f == null ? 0 : 1);
        Intent intent = this.f91f;
        if (intent != null) {
            intent.writeToParcel(parcel, i2);
        }
    }
}
