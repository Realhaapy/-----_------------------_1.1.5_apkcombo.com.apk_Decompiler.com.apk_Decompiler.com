package f.e.a.c.d.d;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class l extends o implements n {
    l(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    public final Bundle H(int i2, String str, String str2, String str3, Bundle bundle) {
        Parcel a = a();
        a.writeInt(8);
        a.writeString(str);
        a.writeString(str2);
        a.writeString("subs");
        q.b(a, bundle);
        Parcel b = b(801, a);
        Bundle bundle2 = (Bundle) q.a(b, Bundle.CREATOR);
        b.recycle();
        return bundle2;
    }

    public final int K(int i2, String str, String str2, Bundle bundle) {
        Parcel a = a();
        a.writeInt(i2);
        a.writeString(str);
        a.writeString(str2);
        q.b(a, bundle);
        Parcel b = b(10, a);
        int readInt = b.readInt();
        b.recycle();
        return readInt;
    }

    public final Bundle L(int i2, String str, String str2, String str3) {
        Parcel a = a();
        a.writeInt(3);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        Parcel b = b(4, a);
        Bundle bundle = (Bundle) q.a(b, Bundle.CREATOR);
        b.recycle();
        return bundle;
    }

    public final Bundle P(int i2, String str, String str2, String str3, Bundle bundle) {
        Parcel a = a();
        a.writeInt(9);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        q.b(a, bundle);
        Parcel b = b(11, a);
        Bundle bundle2 = (Bundle) q.a(b, Bundle.CREATOR);
        b.recycle();
        return bundle2;
    }

    public final Bundle Q(int i2, String str, String str2, String str3, String str4) {
        Parcel a = a();
        a.writeInt(3);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        a.writeString((String) null);
        Parcel b = b(3, a);
        Bundle bundle = (Bundle) q.a(b, Bundle.CREATOR);
        b.recycle();
        return bundle;
    }

    public final Bundle W(int i2, String str, String str2, Bundle bundle) {
        Parcel a = a();
        a.writeInt(9);
        a.writeString(str);
        a.writeString(str2);
        q.b(a, bundle);
        Parcel b = b(902, a);
        Bundle bundle2 = (Bundle) q.a(b, Bundle.CREATOR);
        b.recycle();
        return bundle2;
    }

    public final Bundle k(int i2, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel a = a();
        a.writeInt(i2);
        a.writeString(str);
        a.writeString(str2);
        q.b(a, bundle);
        q.b(a, bundle2);
        Parcel b = b(901, a);
        Bundle bundle3 = (Bundle) q.a(b, Bundle.CREATOR);
        b.recycle();
        return bundle3;
    }

    public final int l(int i2, String str, String str2) {
        Parcel a = a();
        a.writeInt(i2);
        a.writeString(str);
        a.writeString(str2);
        Parcel b = b(1, a);
        int readInt = b.readInt();
        b.recycle();
        return readInt;
    }

    public final int m(int i2, String str, String str2) {
        Parcel a = a();
        a.writeInt(3);
        a.writeString(str);
        a.writeString(str2);
        Parcel b = b(5, a);
        int readInt = b.readInt();
        b.recycle();
        return readInt;
    }

    public final Bundle o(int i2, String str, String str2, Bundle bundle) {
        Parcel a = a();
        a.writeInt(9);
        a.writeString(str);
        a.writeString(str2);
        q.b(a, bundle);
        Parcel b = b(12, a);
        Bundle bundle2 = (Bundle) q.a(b, Bundle.CREATOR);
        b.recycle();
        return bundle2;
    }

    public final Bundle u(int i2, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel a = a();
        a.writeInt(i2);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        a.writeString((String) null);
        q.b(a, bundle);
        Parcel b = b(8, a);
        Bundle bundle2 = (Bundle) q.a(b, Bundle.CREATOR);
        b.recycle();
        return bundle2;
    }

    public final Bundle x(int i2, String str, String str2, Bundle bundle) {
        Parcel a = a();
        a.writeInt(3);
        a.writeString(str);
        a.writeString(str2);
        q.b(a, bundle);
        Parcel b = b(2, a);
        Bundle bundle2 = (Bundle) q.a(b, Bundle.CREATOR);
        b.recycle();
        return bundle2;
    }

    public final Bundle y(int i2, String str, String str2, String str3, Bundle bundle) {
        Parcel a = a();
        a.writeInt(6);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        q.b(a, bundle);
        Parcel b = b(9, a);
        Bundle bundle2 = (Bundle) q.a(b, Bundle.CREATOR);
        b.recycle();
        return bundle2;
    }
}
