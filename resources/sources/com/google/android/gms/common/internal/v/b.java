package com.google.android.gms.common.internal.v;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public class b {

    public static class a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                int r1 = r1 + 41
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.v.b.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static Bundle a(Parcel parcel, int i2) {
        int o2 = o(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (o2 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + o2);
        return readBundle;
    }

    public static int[] b(Parcel parcel, int i2) {
        int o2 = o(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (o2 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + o2);
        return createIntArray;
    }

    public static <T extends Parcelable> T c(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int o2 = o(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (o2 == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + o2);
        return t;
    }

    public static String d(Parcel parcel, int i2) {
        int o2 = o(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (o2 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + o2);
        return readString;
    }

    public static ArrayList<String> e(Parcel parcel, int i2) {
        int o2 = o(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (o2 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + o2);
        return createStringArrayList;
    }

    public static <T> T[] f(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int o2 = o(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (o2 == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + o2);
        return createTypedArray;
    }

    public static <T> ArrayList<T> g(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int o2 = o(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (o2 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + o2);
        return createTypedArrayList;
    }

    public static void h(Parcel parcel, int i2) {
        if (parcel.dataPosition() != i2) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i2);
            throw new a(sb.toString(), parcel);
        }
    }

    public static int i(int i2) {
        return (char) i2;
    }

    public static boolean j(Parcel parcel, int i2) {
        r(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static int k(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder l(Parcel parcel, int i2) {
        int o2 = o(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (o2 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + o2);
        return readStrongBinder;
    }

    public static int m(Parcel parcel, int i2) {
        r(parcel, i2, 4);
        return parcel.readInt();
    }

    public static long n(Parcel parcel, int i2) {
        r(parcel, i2, 8);
        return parcel.readLong();
    }

    public static int o(Parcel parcel, int i2) {
        return (i2 & -65536) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    public static void p(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + o(parcel, i2));
    }

    public static int q(Parcel parcel) {
        int k2 = k(parcel);
        int o2 = o(parcel, k2);
        int dataPosition = parcel.dataPosition();
        if (i(k2) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(k2));
            throw new a(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i2 = o2 + dataPosition;
        if (i2 >= dataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new a(sb.toString(), parcel);
    }

    private static void r(Parcel parcel, int i2, int i3) {
        int o2 = o(parcel, i2);
        if (o2 != i3) {
            String hexString = Integer.toHexString(o2);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(o2);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new a(sb.toString(), parcel);
        }
    }
}
