package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.v.b;

public final class s0 implements Parcelable.Creator<p> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q2 = b.q(parcel);
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < q2) {
            int k2 = b.k(parcel);
            int i5 = b.i(k2);
            if (i5 == 1) {
                i2 = b.m(parcel, k2);
            } else if (i5 == 2) {
                z = b.j(parcel, k2);
            } else if (i5 == 3) {
                z2 = b.j(parcel, k2);
            } else if (i5 == 4) {
                i3 = b.m(parcel, k2);
            } else if (i5 != 5) {
                b.p(parcel, k2);
            } else {
                i4 = b.m(parcel, k2);
            }
        }
        b.h(parcel, q2);
        return new p(i2, z, z2, i3, i4);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new p[i2];
    }
}
