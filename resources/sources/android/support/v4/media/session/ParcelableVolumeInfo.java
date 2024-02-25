package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public int f37e;

    /* renamed from: f  reason: collision with root package name */
    public int f38f;

    /* renamed from: g  reason: collision with root package name */
    public int f39g;

    /* renamed from: h  reason: collision with root package name */
    public int f40h;

    /* renamed from: i  reason: collision with root package name */
    public int f41i;

    static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i2) {
            return new ParcelableVolumeInfo[i2];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f37e = parcel.readInt();
        this.f39g = parcel.readInt();
        this.f40h = parcel.readInt();
        this.f41i = parcel.readInt();
        this.f38f = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f37e);
        parcel.writeInt(this.f39g);
        parcel.writeInt(this.f40h);
        parcel.writeInt(this.f41i);
        parcel.writeInt(this.f38f);
    }
}
