package com.facebook.y0;

import com.facebook.internal.o0;
import java.io.Serializable;
import m.y.d.l;

public final class t implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: e  reason: collision with root package name */
    private final String f2152e;

    /* renamed from: f  reason: collision with root package name */
    private final String f2153f;

    public static final class a implements Serializable {
        private static final long serialVersionUID = -2488473066578201069L;

        /* renamed from: e  reason: collision with root package name */
        private final String f2154e;

        /* renamed from: f  reason: collision with root package name */
        private final String f2155f;

        public a(String str, String str2) {
            l.d(str2, "appId");
            this.f2154e = str;
            this.f2155f = str2;
        }

        private final Object readResolve() {
            return new t(this.f2154e, this.f2155f);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t(com.facebook.u r2) {
        /*
            r1 = this;
            java.lang.String r0 = "accessToken"
            m.y.d.l.d(r2, r0)
            java.lang.String r2 = r2.l()
            com.facebook.g0 r0 = com.facebook.g0.a
            java.lang.String r0 = com.facebook.g0.d()
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.t.<init>(com.facebook.u):void");
    }

    public t(String str, String str2) {
        l.d(str2, "applicationId");
        this.f2152e = str2;
        o0 o0Var = o0.a;
        this.f2153f = o0.V(str) ? null : str;
    }

    private final Object writeReplace() {
        return new a(this.f2153f, this.f2152e);
    }

    public final String a() {
        return this.f2153f;
    }

    public final String b() {
        return this.f2152e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        o0 o0Var = o0.a;
        t tVar = (t) obj;
        return o0.c(tVar.f2153f, this.f2153f) && o0.c(tVar.f2152e, this.f2152e);
    }

    public int hashCode() {
        String str = this.f2153f;
        return (str == null ? 0 : str.hashCode()) ^ this.f2152e.hashCode();
    }
}
