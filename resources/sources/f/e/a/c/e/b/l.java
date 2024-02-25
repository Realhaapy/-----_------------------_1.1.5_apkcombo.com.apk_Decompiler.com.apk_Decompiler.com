package f.e.a.c.e.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.l0;
import com.google.android.gms.common.internal.v.a;
import com.google.android.gms.common.internal.v.c;

public final class l extends a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: e  reason: collision with root package name */
    final int f3931e;

    /* renamed from: f  reason: collision with root package name */
    private final com.google.android.gms.common.a f3932f;

    /* renamed from: g  reason: collision with root package name */
    private final l0 f3933g;

    l(int i2, com.google.android.gms.common.a aVar, l0 l0Var) {
        this.f3931e = i2;
        this.f3932f = aVar;
        this.f3933g = l0Var;
    }

    public final com.google.android.gms.common.a b() {
        return this.f3932f;
    }

    public final l0 c() {
        return this.f3933g;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.f(parcel, 1, this.f3931e);
        c.i(parcel, 2, this.f3932f, i2, false);
        c.i(parcel, 3, this.f3933g, i2, false);
        c.b(parcel, a);
    }
}
