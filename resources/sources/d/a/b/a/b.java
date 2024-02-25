package d.a.b.a;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import d.a.b.a.a;

@SuppressLint({"BanParcelableUsage"})
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    final Handler f3096e = null;

    /* renamed from: f  reason: collision with root package name */
    a f3097f;

    class a implements Parcelable.Creator<b> {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: b */
        public b[] newArray(int i2) {
            return new b[i2];
        }
    }

    /* renamed from: d.a.b.a.b$b  reason: collision with other inner class name */
    class C0060b extends a.C0058a {
        C0060b() {
        }

        public void a0(int i2, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f3096e;
            if (handler != null) {
                handler.post(new c(i2, bundle));
            } else {
                bVar.a(i2, bundle);
            }
        }
    }

    class c implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final int f3098e;

        /* renamed from: f  reason: collision with root package name */
        final Bundle f3099f;

        c(int i2, Bundle bundle) {
            this.f3098e = i2;
            this.f3099f = bundle;
        }

        public void run() {
            b.this.a(this.f3098e, this.f3099f);
        }
    }

    b(Parcel parcel) {
        this.f3097f = a.C0058a.a(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    public void a(int i2, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        synchronized (this) {
            if (this.f3097f == null) {
                this.f3097f = new C0060b();
            }
            parcel.writeStrongBinder(this.f3097f.asBinder());
        }
    }
}
