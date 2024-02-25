package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

public final class b implements Parcelable.Creator<GoogleSignInAccount> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int q2 = com.google.android.gms.common.internal.v.b.q(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList<Scope> arrayList = null;
        String str7 = null;
        String str8 = null;
        long j2 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < q2) {
            int k2 = com.google.android.gms.common.internal.v.b.k(parcel);
            switch (com.google.android.gms.common.internal.v.b.i(k2)) {
                case 1:
                    i2 = com.google.android.gms.common.internal.v.b.m(parcel2, k2);
                    break;
                case 2:
                    str = com.google.android.gms.common.internal.v.b.d(parcel2, k2);
                    break;
                case 3:
                    str2 = com.google.android.gms.common.internal.v.b.d(parcel2, k2);
                    break;
                case 4:
                    str3 = com.google.android.gms.common.internal.v.b.d(parcel2, k2);
                    break;
                case 5:
                    str4 = com.google.android.gms.common.internal.v.b.d(parcel2, k2);
                    break;
                case 6:
                    uri = (Uri) com.google.android.gms.common.internal.v.b.c(parcel2, k2, Uri.CREATOR);
                    break;
                case 7:
                    str5 = com.google.android.gms.common.internal.v.b.d(parcel2, k2);
                    break;
                case 8:
                    j2 = com.google.android.gms.common.internal.v.b.n(parcel2, k2);
                    break;
                case 9:
                    str6 = com.google.android.gms.common.internal.v.b.d(parcel2, k2);
                    break;
                case 10:
                    arrayList = com.google.android.gms.common.internal.v.b.g(parcel2, k2, Scope.CREATOR);
                    break;
                case 11:
                    str7 = com.google.android.gms.common.internal.v.b.d(parcel2, k2);
                    break;
                case 12:
                    str8 = com.google.android.gms.common.internal.v.b.d(parcel2, k2);
                    break;
                default:
                    com.google.android.gms.common.internal.v.b.p(parcel2, k2);
                    break;
            }
        }
        com.google.android.gms.common.internal.v.b.h(parcel2, q2);
        return new GoogleSignInAccount(i2, str, str2, str3, str4, uri, str5, j2, str6, arrayList, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new GoogleSignInAccount[i2];
    }
}
