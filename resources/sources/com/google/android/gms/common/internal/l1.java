package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import f.e.a.c.d.c.a;
import f.e.a.c.d.c.c;

public final class l1 extends a implements i {
    l1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account M() {
        Parcel a = a(2, b());
        Account account = (Account) c.a(a, Account.CREATOR);
        a.recycle();
        return account;
    }
}
