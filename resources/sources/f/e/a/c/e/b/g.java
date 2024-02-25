package f.e.a.c.e.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import f.e.a.c.d.a.a;
import f.e.a.c.d.a.c;

public final class g extends a implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void d0(j jVar, f fVar) {
        Parcel a = a();
        c.b(a, jVar);
        c.c(a, fVar);
        b(12, a);
    }
}
