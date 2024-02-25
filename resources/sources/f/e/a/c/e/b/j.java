package f.e.a.c.e.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.j0;
import com.google.android.gms.common.internal.v.a;
import com.google.android.gms.common.internal.v.c;

public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: e  reason: collision with root package name */
    final int f3929e;

    /* renamed from: f  reason: collision with root package name */
    final j0 f3930f;

    j(int i2, j0 j0Var) {
        this.f3929e = i2;
        this.f3930f = j0Var;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.f(parcel, 1, this.f3929e);
        c.i(parcel, 2, this.f3930f, i2, false);
        c.b(parcel, a);
    }
}
