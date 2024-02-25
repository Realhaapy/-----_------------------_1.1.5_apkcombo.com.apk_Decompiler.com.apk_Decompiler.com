package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

final class p0 implements k {
    private final IBinder a;

    p0(IBinder iBinder) {
        this.a = iBinder;
    }

    public final IBinder asBinder() {
        return this.a;
    }

    public final void z(j jVar, f fVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
            if (fVar != null) {
                obtain.writeInt(1);
                c1.a(fVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
