package f.e.a.c.b;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import f.e.a.c.b.c;

public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new g();

    /* renamed from: e  reason: collision with root package name */
    Messenger f3853e;

    /* renamed from: f  reason: collision with root package name */
    c f3854f;

    public i(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3853e = new Messenger(iBinder);
        } else {
            this.f3854f = new c.a(iBinder);
        }
    }

    public final IBinder a() {
        Messenger messenger = this.f3853e;
        return messenger != null ? messenger.getBinder() : this.f3854f.asBinder();
    }

    public final void b(Message message) {
        Messenger messenger = this.f3853e;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f3854f.v(message);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((i) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        Messenger messenger = this.f3853e;
        parcel.writeStrongBinder(messenger != null ? messenger.getBinder() : this.f3854f.asBinder());
    }
}
