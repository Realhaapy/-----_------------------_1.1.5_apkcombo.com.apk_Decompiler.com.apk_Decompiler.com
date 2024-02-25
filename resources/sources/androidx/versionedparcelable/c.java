package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import e.e.a;
import java.lang.reflect.Method;

class c extends b {

    /* renamed from: d  reason: collision with root package name */
    private final SparseIntArray f1242d;

    /* renamed from: e  reason: collision with root package name */
    private final Parcel f1243e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1244f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1245g;

    /* renamed from: h  reason: collision with root package name */
    private final String f1246h;

    /* renamed from: i  reason: collision with root package name */
    private int f1247i;

    /* renamed from: j  reason: collision with root package name */
    private int f1248j;

    /* renamed from: k  reason: collision with root package name */
    private int f1249k;

    c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new a(), new a(), new a());
    }

    private c(Parcel parcel, int i2, int i3, String str, a<String, Method> aVar, a<String, Method> aVar2, a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f1242d = new SparseIntArray();
        this.f1247i = -1;
        this.f1248j = 0;
        this.f1249k = -1;
        this.f1243e = parcel;
        this.f1244f = i2;
        this.f1245g = i3;
        this.f1248j = i2;
        this.f1246h = str;
    }

    public void A(byte[] bArr) {
        if (bArr != null) {
            this.f1243e.writeInt(bArr.length);
            this.f1243e.writeByteArray(bArr);
            return;
        }
        this.f1243e.writeInt(-1);
    }

    /* access modifiers changed from: protected */
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f1243e, 0);
    }

    public void E(int i2) {
        this.f1243e.writeInt(i2);
    }

    public void G(Parcelable parcelable) {
        this.f1243e.writeParcelable(parcelable, 0);
    }

    public void I(String str) {
        this.f1243e.writeString(str);
    }

    public void a() {
        int i2 = this.f1247i;
        if (i2 >= 0) {
            int i3 = this.f1242d.get(i2);
            int dataPosition = this.f1243e.dataPosition();
            this.f1243e.setDataPosition(i3);
            this.f1243e.writeInt(dataPosition - i3);
            this.f1243e.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    public b b() {
        Parcel parcel = this.f1243e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f1248j;
        if (i2 == this.f1244f) {
            i2 = this.f1245g;
        }
        int i3 = i2;
        return new c(parcel, dataPosition, i3, this.f1246h + "  ", this.a, this.b, this.c);
    }

    public boolean g() {
        return this.f1243e.readInt() != 0;
    }

    public byte[] i() {
        int readInt = this.f1243e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f1243e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f1243e);
    }

    public boolean m(int i2) {
        while (this.f1248j < this.f1245g) {
            int i3 = this.f1249k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.f1243e.setDataPosition(this.f1248j);
            int readInt = this.f1243e.readInt();
            this.f1249k = this.f1243e.readInt();
            this.f1248j += readInt;
        }
        return this.f1249k == i2;
    }

    public int o() {
        return this.f1243e.readInt();
    }

    public <T extends Parcelable> T q() {
        return this.f1243e.readParcelable(c.class.getClassLoader());
    }

    public String s() {
        return this.f1243e.readString();
    }

    public void w(int i2) {
        a();
        this.f1247i = i2;
        this.f1242d.put(i2, this.f1243e.dataPosition());
        E(0);
        E(i2);
    }

    public void y(boolean z) {
        this.f1243e.writeInt(z ? 1 : 0);
    }
}
