package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.g0;
import com.facebook.internal.j0;
import com.facebook.login.x;
import com.facebook.x;
import java.util.Set;
import m.y.d.l;

public final class u extends d0 {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* renamed from: i  reason: collision with root package name */
    private final String f1641i = "instagram_login";

    /* renamed from: j  reason: collision with root package name */
    private final x f1642j = x.INSTAGRAM_APPLICATION_WEB;

    public static final class a implements Parcelable.Creator<u> {
        a() {
        }

        /* renamed from: a */
        public u createFromParcel(Parcel parcel) {
            l.d(parcel, "source");
            return new u(parcel);
        }

        /* renamed from: b */
        public u[] newArray(int i2) {
            return new u[i2];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(Parcel parcel) {
        super(parcel);
        l.d(parcel, "source");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(x xVar) {
        super(xVar);
        l.d(xVar, "loginClient");
    }

    public int describeContents() {
        return 0;
    }

    public String f() {
        return this.f1641i;
    }

    public int o(x.e eVar) {
        l.d(eVar, "request");
        x.c cVar = x.f1658q;
        String a2 = cVar.a();
        j0 j0Var = j0.a;
        Context i2 = d().i();
        if (i2 == null) {
            g0 g0Var = g0.a;
            i2 = g0.c();
        }
        String a3 = eVar.a();
        Set<String> n2 = eVar.n();
        boolean s2 = eVar.s();
        boolean p2 = eVar.p();
        p g2 = eVar.g();
        if (g2 == null) {
            g2 = p.NONE;
        }
        Intent i3 = j0.i(i2, a3, n2, a2, s2, p2, g2, c(eVar.b()), eVar.c(), eVar.l(), eVar.o(), eVar.q(), eVar.u());
        a("e2e", a2);
        return A(i3, cVar.b()) ? 1 : 0;
    }

    public com.facebook.x s() {
        return this.f1642j;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "dest");
        super.writeToParcel(parcel, i2);
    }
}
