package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.v.b;
import java.util.ArrayList;

public final class x implements Parcelable.Creator<r> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q2 = b.q(parcel);
        int i2 = 0;
        ArrayList<l> arrayList = null;
        while (parcel.dataPosition() < q2) {
            int k2 = b.k(parcel);
            int i3 = b.i(k2);
            if (i3 == 1) {
                i2 = b.m(parcel, k2);
            } else if (i3 != 2) {
                b.p(parcel, k2);
            } else {
                arrayList = b.g(parcel, k2, l.CREATOR);
            }
        }
        b.h(parcel, q2);
        return new r(i2, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new r[i2];
    }
}
