package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.a;
import com.google.android.gms.common.internal.v.b;

public final class m0 implements Parcelable.Creator<l0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q2 = b.q(parcel);
        IBinder iBinder = null;
        a aVar = null;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < q2) {
            int k2 = b.k(parcel);
            int i3 = b.i(k2);
            if (i3 == 1) {
                i2 = b.m(parcel, k2);
            } else if (i3 == 2) {
                iBinder = b.l(parcel, k2);
            } else if (i3 == 3) {
                aVar = (a) b.c(parcel, k2, a.CREATOR);
            } else if (i3 == 4) {
                z = b.j(parcel, k2);
            } else if (i3 != 5) {
                b.p(parcel, k2);
            } else {
                z2 = b.j(parcel, k2);
            }
        }
        b.h(parcel, q2);
        return new l0(i2, iBinder, aVar, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new l0[i2];
    }
}
