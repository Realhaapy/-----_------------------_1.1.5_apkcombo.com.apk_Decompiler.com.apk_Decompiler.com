package com.google.android.gms.common.internal.v;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class c {
    public static int a(Parcel parcel) {
        return n(parcel, 20293);
    }

    public static void b(Parcel parcel, int i2) {
        o(parcel, i2);
    }

    public static void c(Parcel parcel, int i2, boolean z) {
        p(parcel, i2, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void d(Parcel parcel, int i2, Bundle bundle, boolean z) {
        if (bundle != null) {
            int n2 = n(parcel, i2);
            parcel.writeBundle(bundle);
            o(parcel, n2);
        } else if (z) {
            p(parcel, i2, 0);
        }
    }

    public static void e(Parcel parcel, int i2, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int n2 = n(parcel, i2);
            parcel.writeStrongBinder(iBinder);
            o(parcel, n2);
        } else if (z) {
            p(parcel, i2, 0);
        }
    }

    public static void f(Parcel parcel, int i2, int i3) {
        p(parcel, i2, 4);
        parcel.writeInt(i3);
    }

    public static void g(Parcel parcel, int i2, int[] iArr, boolean z) {
        if (iArr != null) {
            int n2 = n(parcel, i2);
            parcel.writeIntArray(iArr);
            o(parcel, n2);
        } else if (z) {
            p(parcel, i2, 0);
        }
    }

    public static void h(Parcel parcel, int i2, long j2) {
        p(parcel, i2, 8);
        parcel.writeLong(j2);
    }

    public static void i(Parcel parcel, int i2, Parcelable parcelable, int i3, boolean z) {
        if (parcelable != null) {
            int n2 = n(parcel, i2);
            parcelable.writeToParcel(parcel, i3);
            o(parcel, n2);
        } else if (z) {
            p(parcel, i2, 0);
        }
    }

    public static void j(Parcel parcel, int i2, String str, boolean z) {
        if (str != null) {
            int n2 = n(parcel, i2);
            parcel.writeString(str);
            o(parcel, n2);
        } else if (z) {
            p(parcel, i2, 0);
        }
    }

    public static void k(Parcel parcel, int i2, List<String> list, boolean z) {
        if (list != null) {
            int n2 = n(parcel, i2);
            parcel.writeStringList(list);
            o(parcel, n2);
        } else if (z) {
            p(parcel, i2, 0);
        }
    }

    public static <T extends Parcelable> void l(Parcel parcel, int i2, T[] tArr, int i3, boolean z) {
        if (tArr != null) {
            int n2 = n(parcel, i2);
            parcel.writeInt(r7);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    q(parcel, t, i3);
                }
            }
            o(parcel, n2);
        } else if (z) {
            p(parcel, i2, 0);
        }
    }

    public static <T extends Parcelable> void m(Parcel parcel, int i2, List<T> list, boolean z) {
        if (list != null) {
            int n2 = n(parcel, i2);
            int size = list.size();
            parcel.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                Parcelable parcelable = (Parcelable) list.get(i3);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    q(parcel, parcelable, 0);
                }
            }
            o(parcel, n2);
        } else if (z) {
            p(parcel, i2, 0);
        }
    }

    private static int n(Parcel parcel, int i2) {
        parcel.writeInt(i2 | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void o(Parcel parcel, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(dataPosition - i2);
        parcel.setDataPosition(dataPosition);
    }

    private static void p(Parcel parcel, int i2, int i3) {
        parcel.writeInt(i2 | (i3 << 16));
    }

    private static <T extends Parcelable> void q(Parcel parcel, T t, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i2);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
