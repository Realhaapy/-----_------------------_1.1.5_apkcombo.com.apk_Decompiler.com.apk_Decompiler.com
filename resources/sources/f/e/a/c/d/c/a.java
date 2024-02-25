package f.e.a.c.d.c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {
    private final IBinder a;
    private final String b;

    protected a(IBinder iBinder, String str) {
        this.a = iBinder;
        this.b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel a(int i2, Parcel parcel) {
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

    public final IBinder asBinder() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final Parcel b() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }
}
