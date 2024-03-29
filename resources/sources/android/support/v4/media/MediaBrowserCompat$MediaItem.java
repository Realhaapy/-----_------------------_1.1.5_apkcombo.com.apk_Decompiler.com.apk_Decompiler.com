package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    private final int f5e;

    /* renamed from: f  reason: collision with root package name */
    private final MediaDescriptionCompat f6f;

    static class a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        a() {
        }

        /* renamed from: a */
        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        /* renamed from: b */
        public MediaBrowserCompat$MediaItem[] newArray(int i2) {
            return new MediaBrowserCompat$MediaItem[i2];
        }
    }

    MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f5e = parcel.readInt();
        this.f6f = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{" + "mFlags=" + this.f5e + ", mDescription=" + this.f6f + '}';
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f5e);
        this.f6f.writeToParcel(parcel, i2);
    }
}
