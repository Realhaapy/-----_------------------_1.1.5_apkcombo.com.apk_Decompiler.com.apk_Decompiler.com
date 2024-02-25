package f.e.a.c.d.d;

import android.os.Parcel;
import android.os.Parcelable;

public final class q {
    static {
        q.class.getClassLoader();
    }

    private q() {
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
