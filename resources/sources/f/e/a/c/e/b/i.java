package f.e.a.c.e.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.v.b;
import java.util.ArrayList;

public final class i implements Parcelable.Creator<h> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q2 = b.q(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < q2) {
            int k2 = b.k(parcel);
            int i2 = b.i(k2);
            if (i2 == 1) {
                arrayList = b.e(parcel, k2);
            } else if (i2 != 2) {
                b.p(parcel, k2);
            } else {
                str = b.d(parcel, k2);
            }
        }
        b.h(parcel, q2);
        return new h(arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new h[i2];
    }
}
