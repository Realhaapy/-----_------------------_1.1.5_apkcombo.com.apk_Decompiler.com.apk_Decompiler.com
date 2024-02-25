package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.v.b;

public final class a1 implements Parcelable.Creator<z0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q2 = b.q(parcel);
        Bundle bundle = null;
        c[] cVarArr = null;
        e eVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < q2) {
            int k2 = b.k(parcel);
            int i3 = b.i(k2);
            if (i3 == 1) {
                bundle = b.a(parcel, k2);
            } else if (i3 == 2) {
                cVarArr = (c[]) b.f(parcel, k2, c.CREATOR);
            } else if (i3 == 3) {
                i2 = b.m(parcel, k2);
            } else if (i3 != 4) {
                b.p(parcel, k2);
            } else {
                eVar = (e) b.c(parcel, k2, e.CREATOR);
            }
        }
        b.h(parcel, q2);
        return new z0(bundle, cVarArr, i2, eVar);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new z0[i2];
    }
}
