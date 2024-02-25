package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.v.a;

public final class z0 extends a {
    public static final Parcelable.Creator<z0> CREATOR = new a1();

    /* renamed from: e  reason: collision with root package name */
    Bundle f2597e;

    /* renamed from: f  reason: collision with root package name */
    c[] f2598f;

    /* renamed from: g  reason: collision with root package name */
    int f2599g;

    /* renamed from: h  reason: collision with root package name */
    e f2600h;

    public z0() {
    }

    z0(Bundle bundle, c[] cVarArr, int i2, e eVar) {
        this.f2597e = bundle;
        this.f2598f = cVarArr;
        this.f2599g = i2;
        this.f2600h = eVar;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = com.google.android.gms.common.internal.v.c.a(parcel);
        com.google.android.gms.common.internal.v.c.d(parcel, 1, this.f2597e, false);
        com.google.android.gms.common.internal.v.c.l(parcel, 2, this.f2598f, i2, false);
        com.google.android.gms.common.internal.v.c.f(parcel, 3, this.f2599g);
        com.google.android.gms.common.internal.v.c.i(parcel, 4, this.f2600h, i2, false);
        com.google.android.gms.common.internal.v.c.b(parcel, a);
    }
}
