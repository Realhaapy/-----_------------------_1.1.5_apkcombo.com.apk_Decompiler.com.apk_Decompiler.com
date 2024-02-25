package f.e.a.c.e.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.v.a;
import com.google.android.gms.common.internal.v.c;

public final class b extends a implements k {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: e  reason: collision with root package name */
    final int f3924e;

    /* renamed from: f  reason: collision with root package name */
    private int f3925f;

    /* renamed from: g  reason: collision with root package name */
    private Intent f3926g;

    public b() {
        this(2, 0, (Intent) null);
    }

    b(int i2, int i3, Intent intent) {
        this.f3924e = i2;
        this.f3925f = i3;
        this.f3926g = intent;
    }

    public final Status a() {
        return this.f3925f == 0 ? Status.f2374j : Status.f2376l;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.f(parcel, 1, this.f3924e);
        c.f(parcel, 2, this.f3925f);
        c.i(parcel, 3, this.f3926g, i2, false);
        c.b(parcel, a);
    }
}
