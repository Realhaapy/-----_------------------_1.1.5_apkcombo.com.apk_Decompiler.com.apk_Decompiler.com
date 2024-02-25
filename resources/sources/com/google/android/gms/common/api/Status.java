package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.v.a;
import com.google.android.gms.common.internal.v.c;

public final class Status extends a implements k, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new p();

    /* renamed from: j  reason: collision with root package name */
    public static final Status f2374j = new Status(0);

    /* renamed from: k  reason: collision with root package name */
    public static final Status f2375k = new Status(15);

    /* renamed from: l  reason: collision with root package name */
    public static final Status f2376l = new Status(16);

    /* renamed from: e  reason: collision with root package name */
    final int f2377e;

    /* renamed from: f  reason: collision with root package name */
    private final int f2378f;

    /* renamed from: g  reason: collision with root package name */
    private final String f2379g;

    /* renamed from: h  reason: collision with root package name */
    private final PendingIntent f2380h;

    /* renamed from: i  reason: collision with root package name */
    private final com.google.android.gms.common.a f2381i;

    public Status(int i2) {
        this(i2, (String) null);
    }

    Status(int i2, int i3, String str, PendingIntent pendingIntent) {
        this(i2, i3, str, pendingIntent, (com.google.android.gms.common.a) null);
    }

    Status(int i2, int i3, String str, PendingIntent pendingIntent, com.google.android.gms.common.a aVar) {
        this.f2377e = i2;
        this.f2378f = i3;
        this.f2379g = str;
        this.f2380h = pendingIntent;
        this.f2381i = aVar;
    }

    public Status(int i2, String str) {
        this(1, i2, str, (PendingIntent) null);
    }

    public Status(com.google.android.gms.common.a aVar, String str) {
        this(aVar, str, 17);
    }

    @Deprecated
    public Status(com.google.android.gms.common.a aVar, String str, int i2) {
        this(1, i2, str, aVar.d(), aVar);
    }

    public Status a() {
        return this;
    }

    public com.google.android.gms.common.a b() {
        return this.f2381i;
    }

    public int c() {
        return this.f2378f;
    }

    public String d() {
        return this.f2379g;
    }

    public boolean e() {
        return this.f2380h != null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f2377e == status.f2377e && this.f2378f == status.f2378f && m.a(this.f2379g, status.f2379g) && m.a(this.f2380h, status.f2380h) && m.a(this.f2381i, status.f2381i);
    }

    public final String f() {
        String str = this.f2379g;
        return str != null ? str : d.a(this.f2378f);
    }

    public int hashCode() {
        return m.b(Integer.valueOf(this.f2377e), Integer.valueOf(this.f2378f), this.f2379g, this.f2380h, this.f2381i);
    }

    public String toString() {
        m.a c = m.c(this);
        c.a("statusCode", f());
        c.a("resolution", this.f2380h);
        return c.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.f(parcel, 1, c());
        c.j(parcel, 2, d(), false);
        c.i(parcel, 3, this.f2380h, i2, false);
        c.i(parcel, 4, b(), i2, false);
        c.f(parcel, 1000, this.f2377e);
        c.b(parcel, a);
    }
}
