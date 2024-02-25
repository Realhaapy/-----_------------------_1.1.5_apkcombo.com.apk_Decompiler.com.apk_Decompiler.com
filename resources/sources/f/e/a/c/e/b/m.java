package f.e.a.c.e.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.a;
import com.google.android.gms.common.internal.l0;
import com.google.android.gms.common.internal.v.b;

public final class m implements Parcelable.Creator<l> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q2 = b.q(parcel);
        a aVar = null;
        l0 l0Var = null;
        int i2 = 0;
        while (parcel.dataPosition() < q2) {
            int k2 = b.k(parcel);
            int i3 = b.i(k2);
            if (i3 == 1) {
                i2 = b.m(parcel, k2);
            } else if (i3 == 2) {
                aVar = (a) b.c(parcel, k2, a.CREATOR);
            } else if (i3 != 3) {
                b.p(parcel, k2);
            } else {
                l0Var = (l0) b.c(parcel, k2, l0.CREATOR);
            }
        }
        b.h(parcel, q2);
        return new l(i2, aVar, l0Var);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new l[i2];
    }
}
