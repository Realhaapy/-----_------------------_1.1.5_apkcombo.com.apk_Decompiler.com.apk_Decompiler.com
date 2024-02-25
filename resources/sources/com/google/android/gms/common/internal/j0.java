package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.v.a;
import com.google.android.gms.common.internal.v.c;

public final class j0 extends a {
    public static final Parcelable.Creator<j0> CREATOR = new k0();

    /* renamed from: e  reason: collision with root package name */
    final int f2561e;

    /* renamed from: f  reason: collision with root package name */
    private final Account f2562f;

    /* renamed from: g  reason: collision with root package name */
    private final int f2563g;

    /* renamed from: h  reason: collision with root package name */
    private final GoogleSignInAccount f2564h;

    j0(int i2, Account account, int i3, GoogleSignInAccount googleSignInAccount) {
        this.f2561e = i2;
        this.f2562f = account;
        this.f2563g = i3;
        this.f2564h = googleSignInAccount;
    }

    public j0(Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i2, googleSignInAccount);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.f(parcel, 1, this.f2561e);
        c.i(parcel, 2, this.f2562f, i2, false);
        c.f(parcel, 3, this.f2563g);
        c.i(parcel, 4, this.f2564h, i2, false);
        c.b(parcel, a);
    }
}
