package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    final String f1104e;

    /* renamed from: f  reason: collision with root package name */
    final String f1105f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f1106g;

    /* renamed from: h  reason: collision with root package name */
    final int f1107h;

    /* renamed from: i  reason: collision with root package name */
    final int f1108i;

    /* renamed from: j  reason: collision with root package name */
    final String f1109j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f1110k;

    /* renamed from: l  reason: collision with root package name */
    final boolean f1111l;

    /* renamed from: m  reason: collision with root package name */
    final boolean f1112m;

    /* renamed from: n  reason: collision with root package name */
    final Bundle f1113n;

    /* renamed from: o  reason: collision with root package name */
    final boolean f1114o;

    /* renamed from: p  reason: collision with root package name */
    final int f1115p;

    /* renamed from: q  reason: collision with root package name */
    Bundle f1116q;

    class a implements Parcelable.Creator<t> {
        a() {
        }

        /* renamed from: a */
        public t createFromParcel(Parcel parcel) {
            return new t(parcel);
        }

        /* renamed from: b */
        public t[] newArray(int i2) {
            return new t[i2];
        }
    }

    t(Parcel parcel) {
        this.f1104e = parcel.readString();
        this.f1105f = parcel.readString();
        boolean z = true;
        this.f1106g = parcel.readInt() != 0;
        this.f1107h = parcel.readInt();
        this.f1108i = parcel.readInt();
        this.f1109j = parcel.readString();
        this.f1110k = parcel.readInt() != 0;
        this.f1111l = parcel.readInt() != 0;
        this.f1112m = parcel.readInt() != 0;
        this.f1113n = parcel.readBundle();
        this.f1114o = parcel.readInt() == 0 ? false : z;
        this.f1116q = parcel.readBundle();
        this.f1115p = parcel.readInt();
    }

    t(Fragment fragment) {
        this.f1104e = fragment.getClass().getName();
        this.f1105f = fragment.mWho;
        this.f1106g = fragment.mFromLayout;
        this.f1107h = fragment.mFragmentId;
        this.f1108i = fragment.mContainerId;
        this.f1109j = fragment.mTag;
        this.f1110k = fragment.mRetainInstance;
        this.f1111l = fragment.mRemoving;
        this.f1112m = fragment.mDetached;
        this.f1113n = fragment.mArguments;
        this.f1114o = fragment.mHidden;
        this.f1115p = fragment.mMaxState.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1104e);
        sb.append(" (");
        sb.append(this.f1105f);
        sb.append(")}:");
        if (this.f1106g) {
            sb.append(" fromLayout");
        }
        if (this.f1108i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1108i));
        }
        String str = this.f1109j;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f1109j);
        }
        if (this.f1110k) {
            sb.append(" retainInstance");
        }
        if (this.f1111l) {
            sb.append(" removing");
        }
        if (this.f1112m) {
            sb.append(" detached");
        }
        if (this.f1114o) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1104e);
        parcel.writeString(this.f1105f);
        parcel.writeInt(this.f1106g ? 1 : 0);
        parcel.writeInt(this.f1107h);
        parcel.writeInt(this.f1108i);
        parcel.writeString(this.f1109j);
        parcel.writeInt(this.f1110k ? 1 : 0);
        parcel.writeInt(this.f1111l ? 1 : 0);
        parcel.writeInt(this.f1112m ? 1 : 0);
        parcel.writeBundle(this.f1113n);
        parcel.writeInt(this.f1114o ? 1 : 0);
        parcel.writeBundle(this.f1116q);
        parcel.writeInt(this.f1115p);
    }
}
