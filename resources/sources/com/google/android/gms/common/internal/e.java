package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.v.a;
import com.google.android.gms.common.internal.v.c;

public class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new b1();

    /* renamed from: e  reason: collision with root package name */
    private final p f2528e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f2529f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f2530g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f2531h;

    /* renamed from: i  reason: collision with root package name */
    private final int f2532i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f2533j;

    public e(p pVar, boolean z, boolean z2, int[] iArr, int i2, int[] iArr2) {
        this.f2528e = pVar;
        this.f2529f = z;
        this.f2530g = z2;
        this.f2531h = iArr;
        this.f2532i = i2;
        this.f2533j = iArr2;
    }

    public int b() {
        return this.f2532i;
    }

    public int[] c() {
        return this.f2531h;
    }

    public int[] d() {
        return this.f2533j;
    }

    public boolean e() {
        return this.f2529f;
    }

    public boolean f() {
        return this.f2530g;
    }

    public final p g() {
        return this.f2528e;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.i(parcel, 1, this.f2528e, i2, false);
        c.c(parcel, 2, e());
        c.c(parcel, 3, f());
        c.g(parcel, 4, c(), false);
        c.f(parcel, 5, b());
        c.g(parcel, 6, d(), false);
        c.b(parcel, a);
    }
}
