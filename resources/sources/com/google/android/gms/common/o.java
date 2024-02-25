package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.v.b;

public final class o implements Parcelable.Creator<c> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q2 = b.q(parcel);
        String str = null;
        int i2 = 0;
        long j2 = -1;
        while (parcel.dataPosition() < q2) {
            int k2 = b.k(parcel);
            int i3 = b.i(k2);
            if (i3 == 1) {
                str = b.d(parcel, k2);
            } else if (i3 == 2) {
                i2 = b.m(parcel, k2);
            } else if (i3 != 3) {
                b.p(parcel, k2);
            } else {
                j2 = b.n(parcel, k2);
            }
        }
        b.h(parcel, q2);
        return new c(str, i2, j2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new c[i2];
    }
}
