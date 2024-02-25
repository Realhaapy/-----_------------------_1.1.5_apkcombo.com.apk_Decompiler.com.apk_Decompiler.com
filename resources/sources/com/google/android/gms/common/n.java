package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.v.b;

public final class n implements Parcelable.Creator<a> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q2 = b.q(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < q2) {
            int k2 = b.k(parcel);
            int i4 = b.i(k2);
            if (i4 == 1) {
                i2 = b.m(parcel, k2);
            } else if (i4 == 2) {
                i3 = b.m(parcel, k2);
            } else if (i4 == 3) {
                pendingIntent = (PendingIntent) b.c(parcel, k2, PendingIntent.CREATOR);
            } else if (i4 != 4) {
                b.p(parcel, k2);
            } else {
                str = b.d(parcel, k2);
            }
        }
        b.h(parcel, q2);
        return new a(i2, i3, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new a[i2];
    }
}
