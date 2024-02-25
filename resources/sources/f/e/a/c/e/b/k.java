package f.e.a.c.e.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.j0;
import com.google.android.gms.common.internal.v.b;

public final class k implements Parcelable.Creator<j> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q2 = b.q(parcel);
        int i2 = 0;
        j0 j0Var = null;
        while (parcel.dataPosition() < q2) {
            int k2 = b.k(parcel);
            int i3 = b.i(k2);
            if (i3 == 1) {
                i2 = b.m(parcel, k2);
            } else if (i3 != 2) {
                b.p(parcel, k2);
            } else {
                j0Var = (j0) b.c(parcel, k2, j0.CREATOR);
            }
        }
        b.h(parcel, q2);
        return new j(i2, j0Var);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new j[i2];
    }
}
