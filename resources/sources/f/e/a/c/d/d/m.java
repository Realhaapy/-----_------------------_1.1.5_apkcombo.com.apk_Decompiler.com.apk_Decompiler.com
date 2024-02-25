package f.e.a.c.d.d;

import android.os.IBinder;
import android.os.IInterface;

public abstract class m extends p implements n {
    public static n a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        return queryLocalInterface instanceof n ? (n) queryLocalInterface : new l(iBinder);
    }
}
