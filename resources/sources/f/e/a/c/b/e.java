package f.e.a.c.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.v.b;

public final class e implements Parcelable.Creator<a> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q2 = b.q(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < q2) {
            int k2 = b.k(parcel);
            if (b.i(k2) != 1) {
                b.p(parcel, k2);
            } else {
                intent = (Intent) b.c(parcel, k2, Intent.CREATOR);
            }
        }
        b.h(parcel, q2);
        return new a(intent);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new a[i2];
    }
}
