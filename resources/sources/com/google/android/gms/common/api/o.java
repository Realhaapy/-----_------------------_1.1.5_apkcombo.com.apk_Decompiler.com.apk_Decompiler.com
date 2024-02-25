package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.v.b;

public final class o implements Parcelable.Creator<Scope> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q2 = b.q(parcel);
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < q2) {
            int k2 = b.k(parcel);
            int i3 = b.i(k2);
            if (i3 == 1) {
                i2 = b.m(parcel, k2);
            } else if (i3 != 2) {
                b.p(parcel, k2);
            } else {
                str = b.d(parcel, k2);
            }
        }
        b.h(parcel, q2);
        return new Scope(i2, str);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new Scope[i2];
    }
}
