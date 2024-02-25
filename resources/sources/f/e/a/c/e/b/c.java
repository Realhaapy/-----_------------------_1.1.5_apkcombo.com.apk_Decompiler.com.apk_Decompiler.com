package f.e.a.c.e.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.v.b;

public final class c implements Parcelable.Creator<b> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q2 = b.q(parcel);
        int i2 = 0;
        Intent intent = null;
        int i3 = 0;
        while (parcel.dataPosition() < q2) {
            int k2 = b.k(parcel);
            int i4 = b.i(k2);
            if (i4 == 1) {
                i2 = b.m(parcel, k2);
            } else if (i4 == 2) {
                i3 = b.m(parcel, k2);
            } else if (i4 != 3) {
                b.p(parcel, k2);
            } else {
                intent = (Intent) b.c(parcel, k2, Intent.CREATOR);
            }
        }
        b.h(parcel, q2);
        return new b(i2, i3, intent);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new b[i2];
    }
}
