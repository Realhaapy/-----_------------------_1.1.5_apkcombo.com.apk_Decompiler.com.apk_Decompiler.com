package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.c;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.v.a;

public class f extends a {
    public static final Parcelable.Creator<f> CREATOR = new c1();

    /* renamed from: e  reason: collision with root package name */
    final int f2538e;

    /* renamed from: f  reason: collision with root package name */
    final int f2539f;

    /* renamed from: g  reason: collision with root package name */
    int f2540g;

    /* renamed from: h  reason: collision with root package name */
    String f2541h;

    /* renamed from: i  reason: collision with root package name */
    IBinder f2542i;

    /* renamed from: j  reason: collision with root package name */
    Scope[] f2543j;

    /* renamed from: k  reason: collision with root package name */
    Bundle f2544k;

    /* renamed from: l  reason: collision with root package name */
    Account f2545l;

    /* renamed from: m  reason: collision with root package name */
    c[] f2546m;

    /* renamed from: n  reason: collision with root package name */
    c[] f2547n;

    /* renamed from: o  reason: collision with root package name */
    boolean f2548o;

    /* renamed from: p  reason: collision with root package name */
    int f2549p;

    /* renamed from: q  reason: collision with root package name */
    boolean f2550q;

    /* renamed from: r  reason: collision with root package name */
    private String f2551r;

    f(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, c[] cVarArr, c[] cVarArr2, boolean z, int i5, boolean z2, String str2) {
        this.f2538e = i2;
        this.f2539f = i3;
        this.f2540g = i4;
        if ("com.google.android.gms".equals(str)) {
            this.f2541h = "com.google.android.gms";
        } else {
            this.f2541h = str;
        }
        if (i2 < 2) {
            this.f2545l = iBinder != null ? a.c(i.a.b(iBinder)) : null;
        } else {
            this.f2542i = iBinder;
            this.f2545l = account;
        }
        this.f2543j = scopeArr;
        this.f2544k = bundle;
        this.f2546m = cVarArr;
        this.f2547n = cVarArr2;
        this.f2548o = z;
        this.f2549p = i5;
        this.f2550q = z2;
        this.f2551r = str2;
    }

    public f(int i2, String str) {
        this.f2538e = 6;
        this.f2540g = e.a;
        this.f2539f = i2;
        this.f2548o = true;
        this.f2551r = str;
    }

    public final String b() {
        return this.f2551r;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        c1.a(this, parcel, i2);
    }
}
