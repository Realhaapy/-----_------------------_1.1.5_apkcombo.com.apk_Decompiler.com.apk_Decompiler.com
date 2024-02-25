package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.v.a;
import com.google.android.gms.common.internal.v.c;
import java.util.ArrayList;
import java.util.List;

public class r extends a {
    public static final Parcelable.Creator<r> CREATOR = new x();

    /* renamed from: e  reason: collision with root package name */
    private final int f2588e;

    /* renamed from: f  reason: collision with root package name */
    private List<l> f2589f;

    public r(int i2, List<l> list) {
        this.f2588e = i2;
        this.f2589f = list;
    }

    public final int b() {
        return this.f2588e;
    }

    public final List<l> c() {
        return this.f2589f;
    }

    public final void d(l lVar) {
        if (this.f2589f == null) {
            this.f2589f = new ArrayList();
        }
        this.f2589f.add(lVar);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.f(parcel, 1, this.f2588e);
        c.m(parcel, 2, this.f2589f, false);
        c.b(parcel, a);
    }
}
