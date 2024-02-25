package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface a extends IInterface {

    /* renamed from: android.support.v4.app.a$a  reason: collision with other inner class name */
    public static abstract class C0000a extends Binder implements a {

        /* renamed from: android.support.v4.app.a$a$a  reason: collision with other inner class name */
        private static class C0001a implements a {
            public static a b;
            private IBinder a;

            C0001a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void F(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    if (this.a.transact(3, obtain, (Parcel) null, 1) || C0000a.b() == null) {
                        obtain.recycle();
                    } else {
                        C0000a.b().F(str);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void U(String str, int i2, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.a.transact(1, obtain, (Parcel) null, 1) || C0000a.b() == null) {
                        obtain.recycle();
                    } else {
                        C0000a.b().U(str, i2, str2, notification);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void j(String str, int i2, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    if (this.a.transact(2, obtain, (Parcel) null, 1) || C0000a.b() == null) {
                        obtain.recycle();
                    } else {
                        C0000a.b().j(str, i2, str2);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0001a(iBinder) : (a) queryLocalInterface;
        }

        public static a b() {
            return C0001a.b;
        }
    }

    void F(String str);

    void U(String str, int i2, String str2, Notification notification);

    void j(String str, int i2, String str2);
}
