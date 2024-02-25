package f.e.a.c.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;

interface c extends IInterface {

    public static class a implements c {
        private final IBinder a;

        a(IBinder iBinder) {
            this.a = iBinder;
        }

        public IBinder asBinder() {
            return this.a;
        }

        public void v(Message message) {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.a.transact(1, obtain, (Parcel) null, 1);
            } finally {
                obtain.recycle();
            }
        }
    }

    void v(Message message);
}
