package f.e.a.c.e.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.v.a;
import com.google.android.gms.common.internal.v.c;
import java.util.List;

public final class h extends a implements k {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f3927e;

    /* renamed from: f  reason: collision with root package name */
    private final String f3928f;

    public h(List<String> list, String str) {
        this.f3927e = list;
        this.f3928f = str;
    }

    public final Status a() {
        return this.f3928f != null ? Status.f2374j : Status.f2376l;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.k(parcel, 1, this.f3927e, false);
        c.j(parcel, 2, this.f3928f, false);
        c.b(parcel, a);
    }
}
