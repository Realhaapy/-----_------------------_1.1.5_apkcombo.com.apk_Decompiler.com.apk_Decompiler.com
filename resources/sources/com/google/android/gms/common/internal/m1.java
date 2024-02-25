package com.google.android.gms.common.internal;

import android.os.Parcel;
import f.e.a.c.c.a;
import f.e.a.c.d.c.b;
import f.e.a.c.d.c.c;

public abstract class m1 extends b implements n1 {
    public m1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            a s2 = s();
            parcel2.writeNoException();
            c.b(parcel2, s2);
        } else if (i2 != 2) {
            return false;
        } else {
            int Z = Z();
            parcel2.writeNoException();
            parcel2.writeInt(Z);
        }
        return true;
    }
}
