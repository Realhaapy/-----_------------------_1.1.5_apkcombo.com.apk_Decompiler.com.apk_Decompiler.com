package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.v.b;

public final class k0 implements Parcelable.Creator<j0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q2 = b.q(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < q2) {
            int k2 = b.k(parcel);
            int i4 = b.i(k2);
            if (i4 == 1) {
                i2 = b.m(parcel, k2);
            } else if (i4 == 2) {
                account = (Account) b.c(parcel, k2, Account.CREATOR);
            } else if (i4 == 3) {
                i3 = b.m(parcel, k2);
            } else if (i4 != 4) {
                b.p(parcel, k2);
            } else {
                googleSignInAccount = (GoogleSignInAccount) b.c(parcel, k2, GoogleSignInAccount.CREATOR);
            }
        }
        b.h(parcel, q2);
        return new j0(i2, account, i3, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new j0[i2];
    }
}
