package com.facebook.a1.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface a extends IInterface {

    /* renamed from: com.facebook.a1.a.a$a  reason: collision with other inner class name */
    public static abstract class C0023a extends Binder implements a {

        /* renamed from: com.facebook.a1.a.a$a$a  reason: collision with other inner class name */
        private static class C0024a implements a {
            public static a b;
            private IBinder a;

            C0024a(IBinder iBinder) {
                this.a = iBinder;
            }

            public IBinder asBinder() {
                return this.a;
            }

            public int r(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.a.transact(1, obtain, obtain2, 0) && C0023a.b() != null) {
                        return C0023a.b().r(bundle);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0024a(iBinder) : (a) queryLocalInterface;
        }

        public static a b() {
            return C0024a.b;
        }
    }

    int r(Bundle bundle);
}
