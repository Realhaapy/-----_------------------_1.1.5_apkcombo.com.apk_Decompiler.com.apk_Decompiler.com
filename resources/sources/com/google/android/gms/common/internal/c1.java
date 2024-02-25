package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.v.b;
import com.google.android.gms.common.internal.v.c;

public final class c1 implements Parcelable.Creator<f> {
    static void a(f fVar, Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.f(parcel, 1, fVar.f2538e);
        c.f(parcel, 2, fVar.f2539f);
        c.f(parcel, 3, fVar.f2540g);
        c.j(parcel, 4, fVar.f2541h, false);
        c.e(parcel, 5, fVar.f2542i, false);
        c.l(parcel, 6, fVar.f2543j, i2, false);
        c.d(parcel, 7, fVar.f2544k, false);
        c.i(parcel, 8, fVar.f2545l, i2, false);
        c.l(parcel, 10, fVar.f2546m, i2, false);
        c.l(parcel, 11, fVar.f2547n, i2, false);
        c.c(parcel, 12, fVar.f2548o);
        c.f(parcel, 13, fVar.f2549p);
        c.c(parcel, 14, fVar.f2550q);
        c.j(parcel, 15, fVar.b(), false);
        c.b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int q2 = b.q(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        com.google.android.gms.common.c[] cVarArr = null;
        com.google.android.gms.common.c[] cVarArr2 = null;
        String str2 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < q2) {
            int k2 = b.k(parcel);
            switch (b.i(k2)) {
                case 1:
                    i2 = b.m(parcel2, k2);
                    break;
                case 2:
                    i3 = b.m(parcel2, k2);
                    break;
                case 3:
                    i4 = b.m(parcel2, k2);
                    break;
                case 4:
                    str = b.d(parcel2, k2);
                    break;
                case 5:
                    iBinder = b.l(parcel2, k2);
                    break;
                case 6:
                    scopeArr = (Scope[]) b.f(parcel2, k2, Scope.CREATOR);
                    break;
                case 7:
                    bundle = b.a(parcel2, k2);
                    break;
                case 8:
                    account = (Account) b.c(parcel2, k2, Account.CREATOR);
                    break;
                case 10:
                    cVarArr = (com.google.android.gms.common.c[]) b.f(parcel2, k2, com.google.android.gms.common.c.CREATOR);
                    break;
                case 11:
                    cVarArr2 = (com.google.android.gms.common.c[]) b.f(parcel2, k2, com.google.android.gms.common.c.CREATOR);
                    break;
                case 12:
                    z = b.j(parcel2, k2);
                    break;
                case 13:
                    i5 = b.m(parcel2, k2);
                    break;
                case 14:
                    z2 = b.j(parcel2, k2);
                    break;
                case 15:
                    str2 = b.d(parcel2, k2);
                    break;
                default:
                    b.p(parcel2, k2);
                    break;
            }
        }
        b.h(parcel2, q2);
        return new f(i2, i3, i4, str, iBinder, scopeArr, bundle, account, cVarArr, cVarArr2, z, i5, z2, str2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new f[i2];
    }
}
