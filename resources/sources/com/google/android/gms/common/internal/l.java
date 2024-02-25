package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.v.a;
import com.google.android.gms.common.internal.v.c;

public class l extends a {
    public static final Parcelable.Creator<l> CREATOR = new i0();

    /* renamed from: e  reason: collision with root package name */
    private final int f2566e;

    /* renamed from: f  reason: collision with root package name */
    private final int f2567f;

    /* renamed from: g  reason: collision with root package name */
    private final int f2568g;

    /* renamed from: h  reason: collision with root package name */
    private final long f2569h;

    /* renamed from: i  reason: collision with root package name */
    private final long f2570i;

    /* renamed from: j  reason: collision with root package name */
    private final String f2571j;

    /* renamed from: k  reason: collision with root package name */
    private final String f2572k;

    /* renamed from: l  reason: collision with root package name */
    private final int f2573l;

    /* renamed from: m  reason: collision with root package name */
    private final int f2574m;

    public l(int i2, int i3, int i4, long j2, long j3, String str, String str2, int i5, int i6) {
        this.f2566e = i2;
        this.f2567f = i3;
        this.f2568g = i4;
        this.f2569h = j2;
        this.f2570i = j3;
        this.f2571j = str;
        this.f2572k = str2;
        this.f2573l = i5;
        this.f2574m = i6;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.f(parcel, 1, this.f2566e);
        c.f(parcel, 2, this.f2567f);
        c.f(parcel, 3, this.f2568g);
        c.h(parcel, 4, this.f2569h);
        c.h(parcel, 5, this.f2570i);
        c.j(parcel, 6, this.f2571j, false);
        c.j(parcel, 7, this.f2572k, false);
        c.f(parcel, 8, this.f2573l);
        c.f(parcel, 9, this.f2574m);
        c.b(parcel, a);
    }
}
