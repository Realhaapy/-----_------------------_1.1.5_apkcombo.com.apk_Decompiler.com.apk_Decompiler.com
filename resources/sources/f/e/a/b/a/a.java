package f.e.a.b.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface a extends IInterface {

    /* renamed from: f.e.a.b.a.a$a  reason: collision with other inner class name */
    public static abstract class C0104a extends Binder implements a {

        /* renamed from: f.e.a.b.a.a$a$a  reason: collision with other inner class name */
        private static class C0105a implements a {
            private IBinder a;

            C0105a(IBinder iBinder) {
                this.a = iBinder;
            }

            public Bundle N(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0105a(iBinder) : (a) queryLocalInterface;
        }
    }

    Bundle N(Bundle bundle);
}
