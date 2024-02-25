package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    private final IntentSender f92e;

    /* renamed from: f  reason: collision with root package name */
    private final Intent f93f;

    /* renamed from: g  reason: collision with root package name */
    private final int f94g;

    /* renamed from: h  reason: collision with root package name */
    private final int f95h;

    class a implements Parcelable.Creator<e> {
        a() {
        }

        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        /* renamed from: b */
        public e[] newArray(int i2) {
            return new e[i2];
        }
    }

    public static final class b {
        private IntentSender a;
        private Intent b;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private int f96d;

        public b(IntentSender intentSender) {
            this.a = intentSender;
        }

        public e a() {
            return new e(this.a, this.b, this.c, this.f96d);
        }

        public b b(Intent intent) {
            this.b = intent;
            return this;
        }

        public b c(int i2, int i3) {
            this.f96d = i2;
            this.c = i3;
            return this;
        }
    }

    e(IntentSender intentSender, Intent intent, int i2, int i3) {
        this.f92e = intentSender;
        this.f93f = intent;
        this.f94g = i2;
        this.f95h = i3;
    }

    e(Parcel parcel) {
        this.f92e = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f93f = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f94g = parcel.readInt();
        this.f95h = parcel.readInt();
    }

    public Intent a() {
        return this.f93f;
    }

    public int b() {
        return this.f94g;
    }

    public int c() {
        return this.f95h;
    }

    public IntentSender d() {
        return this.f92e;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f92e, i2);
        parcel.writeParcelable(this.f93f, i2);
        parcel.writeInt(this.f94g);
        parcel.writeInt(this.f95h);
    }
}
