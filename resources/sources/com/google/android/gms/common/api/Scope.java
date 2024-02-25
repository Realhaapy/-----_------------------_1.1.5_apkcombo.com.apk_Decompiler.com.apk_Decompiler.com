package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.v.a;
import com.google.android.gms.common.internal.v.c;

public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new o();

    /* renamed from: e  reason: collision with root package name */
    final int f2372e;

    /* renamed from: f  reason: collision with root package name */
    private final String f2373f;

    Scope(int i2, String str) {
        n.e(str, "scopeUri must not be null or empty");
        this.f2372e = i2;
        this.f2373f = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public String b() {
        return this.f2373f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f2373f.equals(((Scope) obj).f2373f);
    }

    public int hashCode() {
        return this.f2373f.hashCode();
    }

    public String toString() {
        return this.f2373f;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.f(parcel, 1, this.f2372e);
        c.j(parcel, 2, b(), false);
        c.b(parcel, a);
    }
}
