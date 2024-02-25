package f.e.a.c.d.d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class o implements IInterface {
    private final IBinder a;
    private final String b = "com.android.vending.billing.IInAppBillingService";

    protected o(IBinder iBinder, String str) {
        this.a = iBinder;
    }

    /* access modifiers changed from: protected */
    public final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final Parcel b(int i2, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.a.transact(i2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }
}
