package f.e.a.c.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.v.c;

public final class a extends com.google.android.gms.common.internal.v.a {
    public static final Parcelable.Creator<a> CREATOR = new e();

    /* renamed from: e  reason: collision with root package name */
    Intent f3842e;

    public a(Intent intent) {
        this.f3842e = intent;
    }

    public Intent b() {
        return this.f3842e;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.i(parcel, 1, this.f3842e, i2, false);
        c.b(parcel, a);
    }
}
