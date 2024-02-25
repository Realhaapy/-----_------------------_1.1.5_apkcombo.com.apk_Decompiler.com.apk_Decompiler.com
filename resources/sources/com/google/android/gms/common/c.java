package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.v.a;

public class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new o();

    /* renamed from: e  reason: collision with root package name */
    private final String f2493e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    private final int f2494f;

    /* renamed from: g  reason: collision with root package name */
    private final long f2495g;

    public c(String str, int i2, long j2) {
        this.f2493e = str;
        this.f2494f = i2;
        this.f2495g = j2;
    }

    public c(String str, long j2) {
        this.f2493e = str;
        this.f2495g = j2;
        this.f2494f = -1;
    }

    public String b() {
        return this.f2493e;
    }

    public long c() {
        long j2 = this.f2495g;
        return j2 == -1 ? (long) this.f2494f : j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            return ((b() != null && b().equals(cVar.b())) || (b() == null && cVar.b() == null)) && c() == cVar.c();
        }
    }

    public final int hashCode() {
        return m.b(b(), Long.valueOf(c()));
    }

    public final String toString() {
        m.a c = m.c(this);
        c.a("name", b());
        c.a("version", Long.valueOf(c()));
        return c.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = com.google.android.gms.common.internal.v.c.a(parcel);
        com.google.android.gms.common.internal.v.c.j(parcel, 1, b(), false);
        com.google.android.gms.common.internal.v.c.f(parcel, 2, this.f2494f);
        com.google.android.gms.common.internal.v.c.h(parcel, 3, c());
        com.google.android.gms.common.internal.v.c.b(parcel, a);
    }
}
