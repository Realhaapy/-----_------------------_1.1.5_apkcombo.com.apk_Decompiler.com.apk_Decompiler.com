package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.v.b;

public final class i0 implements Parcelable.Creator<l> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int q2 = b.q(parcel);
        String str = null;
        String str2 = null;
        long j2 = 0;
        long j3 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        while (parcel.dataPosition() < q2) {
            int k2 = b.k(parcel);
            switch (b.i(k2)) {
                case 1:
                    i2 = b.m(parcel2, k2);
                    break;
                case 2:
                    i3 = b.m(parcel2, k2);
                    break;
                case 3:
                    i4 = b.m(parcel2, k2);
                    break;
                case 4:
                    j2 = b.n(parcel2, k2);
                    break;
                case 5:
                    j3 = b.n(parcel2, k2);
                    break;
                case 6:
                    str = b.d(parcel2, k2);
                    break;
                case 7:
                    str2 = b.d(parcel2, k2);
                    break;
                case 8:
                    i5 = b.m(parcel2, k2);
                    break;
                case 9:
                    i6 = b.m(parcel2, k2);
                    break;
                default:
                    b.p(parcel2, k2);
                    break;
            }
        }
        b.h(parcel2, q2);
        return new l(i2, i3, i4, j2, j3, str, str2, i5, i6);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new l[i2];
    }
}
