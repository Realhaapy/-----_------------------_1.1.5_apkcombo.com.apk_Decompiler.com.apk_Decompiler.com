package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.v.b;
import com.google.android.gms.common.internal.v.c;

public class x0 implements Parcelable.Creator<w0> {
    static void c(w0 w0Var, Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.d(parcel, 2, w0Var.f2830e, false);
        c.b(parcel, a);
    }

    /* renamed from: a */
    public w0 createFromParcel(Parcel parcel) {
        int q2 = b.q(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < q2) {
            int k2 = b.k(parcel);
            if (b.i(k2) != 2) {
                b.p(parcel, k2);
            } else {
                bundle = b.a(parcel, k2);
            }
        }
        b.h(parcel, q2);
        return new w0(bundle);
    }

    /* renamed from: b */
    public w0[] newArray(int i2) {
        return new w0[i2];
    }
}
