package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.p0;
import com.facebook.internal.u0.c;
import java.io.IOException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import m.y.d.l;

public final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    private final String f1802e;

    /* renamed from: f  reason: collision with root package name */
    private final String f1803f;

    /* renamed from: g  reason: collision with root package name */
    private final a0 f1804g;

    /* renamed from: h  reason: collision with root package name */
    private final z f1805h;

    /* renamed from: i  reason: collision with root package name */
    private final String f1806i;

    public static final class a implements Parcelable.Creator<y> {
        a() {
        }

        /* renamed from: a */
        public y createFromParcel(Parcel parcel) {
            l.d(parcel, "source");
            return new y(parcel);
        }

        /* renamed from: b */
        public y[] newArray(int i2) {
            return new y[i2];
        }
    }

    public y(Parcel parcel) {
        l.d(parcel, "parcel");
        String readString = parcel.readString();
        p0 p0Var = p0.a;
        p0.k(readString, "token");
        this.f1802e = readString;
        String readString2 = parcel.readString();
        p0.k(readString2, "expectedNonce");
        this.f1803f = readString2;
        Parcelable readParcelable = parcel.readParcelable(a0.class.getClassLoader());
        if (readParcelable != null) {
            this.f1804g = (a0) readParcelable;
            Parcelable readParcelable2 = parcel.readParcelable(z.class.getClassLoader());
            if (readParcelable2 != null) {
                this.f1805h = (z) readParcelable2;
                String readString3 = parcel.readString();
                p0.k(readString3, "signature");
                this.f1806i = readString3;
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public y(String str, String str2) {
        l.d(str, "token");
        l.d(str2, "expectedNonce");
        p0 p0Var = p0.a;
        p0.g(str, "token");
        p0.g(str2, "expectedNonce");
        List U = q.U(str, new String[]{"."}, false, 0, 6, (Object) null);
        if (U.size() == 3) {
            String str3 = (String) U.get(0);
            String str4 = (String) U.get(1);
            String str5 = (String) U.get(2);
            this.f1802e = str;
            this.f1803f = str2;
            a0 a0Var = new a0(str3);
            this.f1804g = a0Var;
            this.f1805h = new z(str4, str2);
            if (a(str3, str4, str5, a0Var.a())) {
                this.f1806i = str5;
                return;
            }
            throw new IllegalArgumentException("Invalid Signature".toString());
        }
        throw new IllegalArgumentException("Invalid IdToken string".toString());
    }

    private final boolean a(String str, String str2, String str3, String str4) {
        try {
            c cVar = c.a;
            String b = c.b(str4);
            if (b == null) {
                return false;
            }
            PublicKey a2 = c.a(b);
            return c.e(a2, str + '.' + str2, str3);
        } catch (IOException | InvalidKeySpecException unused) {
            return false;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return l.a(this.f1802e, yVar.f1802e) && l.a(this.f1803f, yVar.f1803f) && l.a(this.f1804g, yVar.f1804g) && l.a(this.f1805h, yVar.f1805h) && l.a(this.f1806i, yVar.f1806i);
    }

    public int hashCode() {
        return ((((((((527 + this.f1802e.hashCode()) * 31) + this.f1803f.hashCode()) * 31) + this.f1804g.hashCode()) * 31) + this.f1805h.hashCode()) * 31) + this.f1806i.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "dest");
        parcel.writeString(this.f1802e);
        parcel.writeString(this.f1803f);
        parcel.writeParcelable(this.f1804g, i2);
        parcel.writeParcelable(this.f1805h, i2);
        parcel.writeString(this.f1806i);
    }
}
