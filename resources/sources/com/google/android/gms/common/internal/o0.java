package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import f.e.a.c.d.c.b;
import f.e.a.c.d.c.c;

public abstract class o0 extends b implements j {
    public o0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            b0(parcel.readInt(), parcel.readStrongBinder(), (Bundle) c.a(parcel, Bundle.CREATOR));
        } else if (i2 == 2) {
            I(parcel.readInt(), (Bundle) c.a(parcel, Bundle.CREATOR));
        } else if (i2 != 3) {
            return false;
        } else {
            g(parcel.readInt(), parcel.readStrongBinder(), (z0) c.a(parcel, z0.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
