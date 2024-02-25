package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.v.b;

public final class b1 implements Parcelable.Creator<e> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q2 = b.q(parcel);
        p pVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        while (parcel.dataPosition() < q2) {
            int k2 = b.k(parcel);
            switch (b.i(k2)) {
                case 1:
                    pVar = (p) b.c(parcel, k2, p.CREATOR);
                    break;
                case 2:
                    z = b.j(parcel, k2);
                    break;
                case 3:
                    z2 = b.j(parcel, k2);
                    break;
                case 4:
                    iArr = b.b(parcel, k2);
                    break;
                case 5:
                    i2 = b.m(parcel, k2);
                    break;
                case 6:
                    iArr2 = b.b(parcel, k2);
                    break;
                default:
                    b.p(parcel, k2);
                    break;
            }
        }
        b.h(parcel, q2);
        return new e(pVar, z, z2, iArr, i2, iArr2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new e[i2];
    }
}
