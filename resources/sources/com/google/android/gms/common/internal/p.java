package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.v.a;
import com.google.android.gms.common.internal.v.c;

public class p extends a {
    public static final Parcelable.Creator<p> CREATOR = new s0();

    /* renamed from: e  reason: collision with root package name */
    private final int f2583e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f2584f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f2585g;

    /* renamed from: h  reason: collision with root package name */
    private final int f2586h;

    /* renamed from: i  reason: collision with root package name */
    private final int f2587i;

    public p(int i2, boolean z, boolean z2, int i3, int i4) {
        this.f2583e = i2;
        this.f2584f = z;
        this.f2585g = z2;
        this.f2586h = i3;
        this.f2587i = i4;
    }

    public int b() {
        return this.f2586h;
    }

    public int c() {
        return this.f2587i;
    }

    public boolean d() {
        return this.f2584f;
    }

    public boolean e() {
        return this.f2585g;
    }

    public int f() {
        return this.f2583e;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.f(parcel, 1, f());
        c.c(parcel, 2, d());
        c.c(parcel, 3, e());
        c.f(parcel, 4, b());
        c.f(parcel, 5, c());
        c.b(parcel, a);
    }
}
