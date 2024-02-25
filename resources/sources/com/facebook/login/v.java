package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import m.y.d.l;

public final class v extends d0 {
    public static final Parcelable.Creator<v> CREATOR = new a();

    /* renamed from: i  reason: collision with root package name */
    private final String f1643i = "katana_proxy_auth";

    public static final class a implements Parcelable.Creator<v> {
        a() {
        }

        /* renamed from: a */
        public v createFromParcel(Parcel parcel) {
            l.d(parcel, "source");
            return new v(parcel);
        }

        /* renamed from: b */
        public v[] newArray(int i2) {
            return new v[i2];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(Parcel parcel) {
        super(parcel);
        l.d(parcel, "source");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(x xVar) {
        super(xVar);
        l.d(xVar, "loginClient");
    }

    public int describeContents() {
        return 0;
    }

    public String f() {
        return this.f1643i;
    }

    public boolean n() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int o(com.facebook.login.x.e r24) {
        /*
            r23 = this;
            r0 = r23
            java.lang.String r1 = "request"
            r2 = r24
            m.y.d.l.d(r2, r1)
            com.facebook.login.w r1 = r24.j()
            boolean r3 = com.facebook.g0.f1395q
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0023
            com.facebook.internal.v r3 = com.facebook.internal.v.a
            java.lang.String r3 = com.facebook.internal.v.a()
            if (r3 == 0) goto L_0x0023
            boolean r1 = r1.c()
            if (r1 == 0) goto L_0x0023
            r15 = 1
            goto L_0x0024
        L_0x0023:
            r15 = 0
        L_0x0024:
            com.facebook.login.x$c r1 = com.facebook.login.x.f1658q
            java.lang.String r1 = r1.a()
            com.facebook.internal.j0 r3 = com.facebook.internal.j0.a
            com.facebook.login.x r3 = r23.d()
            androidx.fragment.app.e r6 = r3.i()
            java.lang.String r7 = r24.a()
            java.util.Set r8 = r24.n()
            boolean r10 = r24.s()
            boolean r11 = r24.p()
            com.facebook.login.p r3 = r24.g()
            if (r3 != 0) goto L_0x004c
            com.facebook.login.p r3 = com.facebook.login.p.NONE
        L_0x004c:
            r12 = r3
            java.lang.String r3 = r24.b()
            java.lang.String r13 = r0.c(r3)
            java.lang.String r14 = r24.c()
            java.lang.String r16 = r24.l()
            boolean r17 = r24.o()
            boolean r18 = r24.q()
            boolean r19 = r24.u()
            java.lang.String r20 = r24.m()
            java.lang.String r21 = r24.d()
            com.facebook.login.m r2 = r24.e()
            if (r2 != 0) goto L_0x0079
            r2 = 0
            goto L_0x007d
        L_0x0079:
            java.lang.String r2 = r2.name()
        L_0x007d:
            r22 = r2
            r9 = r1
            java.util.List r2 = com.facebook.internal.j0.m(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r3 = "e2e"
            r0.a(r3, r1)
            java.util.Iterator r1 = r2.iterator()
            r2 = 0
        L_0x008e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00a8
            int r2 = r2 + r4
            java.lang.Object r3 = r1.next()
            android.content.Intent r3 = (android.content.Intent) r3
            com.facebook.login.x$c r6 = com.facebook.login.x.f1658q
            int r6 = r6.b()
            boolean r3 = r0.A(r3, r6)
            if (r3 == 0) goto L_0x008e
            return r2
        L_0x00a8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.v.o(com.facebook.login.x$e):int");
    }
}
