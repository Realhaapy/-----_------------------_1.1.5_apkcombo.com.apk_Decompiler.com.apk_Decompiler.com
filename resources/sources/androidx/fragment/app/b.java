package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.w;
import androidx.lifecycle.e;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    final int[] f974e;

    /* renamed from: f  reason: collision with root package name */
    final ArrayList<String> f975f;

    /* renamed from: g  reason: collision with root package name */
    final int[] f976g;

    /* renamed from: h  reason: collision with root package name */
    final int[] f977h;

    /* renamed from: i  reason: collision with root package name */
    final int f978i;

    /* renamed from: j  reason: collision with root package name */
    final String f979j;

    /* renamed from: k  reason: collision with root package name */
    final int f980k;

    /* renamed from: l  reason: collision with root package name */
    final int f981l;

    /* renamed from: m  reason: collision with root package name */
    final CharSequence f982m;

    /* renamed from: n  reason: collision with root package name */
    final int f983n;

    /* renamed from: o  reason: collision with root package name */
    final CharSequence f984o;

    /* renamed from: p  reason: collision with root package name */
    final ArrayList<String> f985p;

    /* renamed from: q  reason: collision with root package name */
    final ArrayList<String> f986q;

    /* renamed from: r  reason: collision with root package name */
    final boolean f987r;

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

    public b(Parcel parcel) {
        this.f974e = parcel.createIntArray();
        this.f975f = parcel.createStringArrayList();
        this.f976g = parcel.createIntArray();
        this.f977h = parcel.createIntArray();
        this.f978i = parcel.readInt();
        this.f979j = parcel.readString();
        this.f980k = parcel.readInt();
        this.f981l = parcel.readInt();
        this.f982m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f983n = parcel.readInt();
        this.f984o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f985p = parcel.createStringArrayList();
        this.f986q = parcel.createStringArrayList();
        this.f987r = parcel.readInt() != 0;
    }

    public b(a aVar) {
        int size = aVar.a.size();
        this.f974e = new int[(size * 5)];
        if (aVar.f1123g) {
            this.f975f = new ArrayList<>(size);
            this.f976g = new int[size];
            this.f977h = new int[size];
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                w.a aVar2 = aVar.a.get(i2);
                int i4 = i3 + 1;
                this.f974e[i3] = aVar2.a;
                ArrayList<String> arrayList = this.f975f;
                Fragment fragment = aVar2.b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f974e;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.c;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f1133d;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.f1134e;
                iArr[i7] = aVar2.f1135f;
                this.f976g[i2] = aVar2.f1136g.ordinal();
                this.f977h[i2] = aVar2.f1137h.ordinal();
                i2++;
                i3 = i7 + 1;
            }
            this.f978i = aVar.f1122f;
            this.f979j = aVar.f1124h;
            this.f980k = aVar.f970s;
            this.f981l = aVar.f1125i;
            this.f982m = aVar.f1126j;
            this.f983n = aVar.f1127k;
            this.f984o = aVar.f1128l;
            this.f985p = aVar.f1129m;
            this.f986q = aVar.f1130n;
            this.f987r = aVar.f1131o;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public a a(n nVar) {
        a aVar = new a(nVar);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.f974e;
            if (i2 < iArr.length) {
                w.a aVar2 = new w.a();
                int i4 = i2 + 1;
                aVar2.a = iArr[i2];
                if (n.F0(2)) {
                    Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i3 + " base fragment #" + this.f974e[i4]);
                }
                String str = this.f975f.get(i3);
                aVar2.b = str != null ? nVar.g0(str) : null;
                aVar2.f1136g = e.c.values()[this.f976g[i3]];
                aVar2.f1137h = e.c.values()[this.f977h[i3]];
                int[] iArr2 = this.f974e;
                int i5 = i4 + 1;
                int i6 = iArr2[i4];
                aVar2.c = i6;
                int i7 = i5 + 1;
                int i8 = iArr2[i5];
                aVar2.f1133d = i8;
                int i9 = i7 + 1;
                int i10 = iArr2[i7];
                aVar2.f1134e = i10;
                int i11 = iArr2[i9];
                aVar2.f1135f = i11;
                aVar.b = i6;
                aVar.c = i8;
                aVar.f1120d = i10;
                aVar.f1121e = i11;
                aVar.e(aVar2);
                i3++;
                i2 = i9 + 1;
            } else {
                aVar.f1122f = this.f978i;
                aVar.f1124h = this.f979j;
                aVar.f970s = this.f980k;
                aVar.f1123g = true;
                aVar.f1125i = this.f981l;
                aVar.f1126j = this.f982m;
                aVar.f1127k = this.f983n;
                aVar.f1128l = this.f984o;
                aVar.f1129m = this.f985p;
                aVar.f1130n = this.f986q;
                aVar.f1131o = this.f987r;
                aVar.m(1);
                return aVar;
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f974e);
        parcel.writeStringList(this.f975f);
        parcel.writeIntArray(this.f976g);
        parcel.writeIntArray(this.f977h);
        parcel.writeInt(this.f978i);
        parcel.writeString(this.f979j);
        parcel.writeInt(this.f980k);
        parcel.writeInt(this.f981l);
        TextUtils.writeToParcel(this.f982m, parcel, 0);
        parcel.writeInt(this.f983n);
        TextUtils.writeToParcel(this.f984o, parcel, 0);
        parcel.writeStringList(this.f985p);
        parcel.writeStringList(this.f986q);
        parcel.writeInt(this.f987r ? 1 : 0);
    }
}
