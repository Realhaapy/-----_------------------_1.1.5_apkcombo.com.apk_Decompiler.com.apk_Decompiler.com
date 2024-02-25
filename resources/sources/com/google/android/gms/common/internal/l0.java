package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.v.a;
import com.google.android.gms.common.internal.v.c;

public final class l0 extends a {
    public static final Parcelable.Creator<l0> CREATOR = new m0();

    /* renamed from: e  reason: collision with root package name */
    final int f2575e;

    /* renamed from: f  reason: collision with root package name */
    final IBinder f2576f;

    /* renamed from: g  reason: collision with root package name */
    private final com.google.android.gms.common.a f2577g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f2578h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f2579i;

    l0(int i2, IBinder iBinder, com.google.android.gms.common.a aVar, boolean z, boolean z2) {
        this.f2575e = i2;
        this.f2576f = iBinder;
        this.f2577g = aVar;
        this.f2578h = z;
        this.f2579i = z2;
    }

    public final com.google.android.gms.common.a b() {
        return this.f2577g;
    }

    public final i c() {
        IBinder iBinder = this.f2576f;
        if (iBinder == null) {
            return null;
        }
        return i.a.b(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f2577g.equals(l0Var.f2577g) && m.a(c(), l0Var.c());
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.f(parcel, 1, this.f2575e);
        c.e(parcel, 2, this.f2576f, false);
        c.i(parcel, 3, this.f2577g, i2, false);
        c.c(parcel, 4, this.f2578h);
        c.c(parcel, 5, this.f2579i);
        c.b(parcel, a);
    }
}
