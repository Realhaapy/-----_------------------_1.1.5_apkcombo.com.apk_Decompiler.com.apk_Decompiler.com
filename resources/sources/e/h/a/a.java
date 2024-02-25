package e.h.a;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: f  reason: collision with root package name */
    public static final a f3456f = new C0085a();

    /* renamed from: e  reason: collision with root package name */
    private final Parcelable f3457e;

    /* renamed from: e.h.a.a$a  reason: collision with other inner class name */
    static class C0085a extends a {
        C0085a() {
            super((C0085a) null);
        }
    }

    static class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f3456f;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    private a() {
        this.f3457e = null;
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f3457e = readParcelable == null ? f3456f : readParcelable;
    }

    protected a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f3457e = parcelable == f3456f ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* synthetic */ a(C0085a aVar) {
        this();
    }

    public final Parcelable a() {
        return this.f3457e;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f3457e, i2);
    }
}
