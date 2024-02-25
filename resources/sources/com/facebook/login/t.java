package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.c0;
import com.facebook.g0;
import com.facebook.internal.k0;
import com.facebook.internal.o0;
import com.facebook.login.b0;
import com.facebook.login.x;
import m.y.d.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class t extends b0 {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    private s f1639h;

    /* renamed from: i  reason: collision with root package name */
    private final String f1640i = "get_token";

    public static final class a implements Parcelable.Creator<t> {
        a() {
        }

        /* renamed from: a */
        public t createFromParcel(Parcel parcel) {
            l.d(parcel, "source");
            return new t(parcel);
        }

        /* renamed from: b */
        public t[] newArray(int i2) {
            return new t[i2];
        }
    }

    public static final class b implements o0.a {
        final /* synthetic */ Bundle a;
        final /* synthetic */ t b;
        final /* synthetic */ x.e c;

        b(Bundle bundle, t tVar, x.e eVar) {
            this.a = bundle;
            this.b = tVar;
            this.c = eVar;
        }

        public void a(c0 c0Var) {
            this.b.d().f(x.f.c.d(x.f.f1686m, this.b.d().o(), "Caught exception", c0Var == null ? null : c0Var.getMessage(), (String) null, 8, (Object) null));
        }

        public void b(JSONObject jSONObject) {
            try {
                this.a.putString("com.facebook.platform.extra.USER_ID", jSONObject == null ? null : jSONObject.getString("id"));
                this.b.s(this.c, this.a);
            } catch (JSONException e2) {
                this.b.d().f(x.f.c.d(x.f.f1686m, this.b.d().o(), "Caught exception", e2.getMessage(), (String) null, 8, (Object) null));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(Parcel parcel) {
        super(parcel);
        l.d(parcel, "source");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(x xVar) {
        super(xVar);
        l.d(xVar, "loginClient");
    }

    /* access modifiers changed from: private */
    public static final void t(t tVar, x.e eVar, Bundle bundle) {
        l.d(tVar, "this$0");
        l.d(eVar, "$request");
        tVar.q(eVar, bundle);
    }

    public void b() {
        s sVar = this.f1639h;
        if (sVar != null) {
            sVar.b();
            sVar.g((k0.b) null);
            this.f1639h = null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public String f() {
        return this.f1640i;
    }

    public int o(x.e eVar) {
        l.d(eVar, "request");
        Context i2 = d().i();
        if (i2 == null) {
            g0 g0Var = g0.a;
            i2 = g0.c();
        }
        s sVar = new s(i2, eVar);
        this.f1639h = sVar;
        if (l.a(sVar == null ? null : Boolean.valueOf(sVar.h()), Boolean.FALSE)) {
            return 0;
        }
        d().r();
        i iVar = new i(this, eVar);
        s sVar2 = this.f1639h;
        if (sVar2 == null) {
            return 1;
        }
        sVar2.g(iVar);
        return 1;
    }

    public final void p(x.e eVar, Bundle bundle) {
        l.d(eVar, "request");
        l.d(bundle, "result");
        String string = bundle.getString("com.facebook.platform.extra.USER_ID");
        if (string == null || string.length() == 0) {
            d().r();
            String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            if (string2 != null) {
                o0 o0Var = o0.a;
                o0.B(string2, new b(bundle, this, eVar));
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        s(eVar, bundle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        if ((r2 == null || r2.length() == 0) != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(com.facebook.login.x.e r6, android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.String r0 = "request"
            m.y.d.l.d(r6, r0)
            com.facebook.login.s r0 = r5.f1639h
            r1 = 0
            if (r0 != 0) goto L_0x000b
            goto L_0x000e
        L_0x000b:
            r0.g(r1)
        L_0x000e:
            r5.f1639h = r1
            com.facebook.login.x r0 = r5.d()
            r0.s()
            if (r7 == 0) goto L_0x004c
            java.lang.String r0 = "com.facebook.platform.extra.PERMISSIONS"
            java.util.ArrayList r0 = r7.getStringArrayList(r0)
            if (r0 != 0) goto L_0x0025
            java.util.List r0 = m.t.j.e()
        L_0x0025:
            java.util.Set r1 = r6.n()
            if (r1 != 0) goto L_0x002f
            java.util.Set r1 = m.t.e0.b()
        L_0x002f:
            java.lang.String r2 = "com.facebook.platform.extra.ID_TOKEN"
            java.lang.String r2 = r7.getString(r2)
            java.lang.String r3 = "openid"
            boolean r3 = r1.contains(r3)
            r4 = 1
            if (r3 == 0) goto L_0x0054
            if (r2 == 0) goto L_0x0049
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r2 = 0
            goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            if (r2 == 0) goto L_0x0054
        L_0x004c:
            com.facebook.login.x r6 = r5.d()
            r6.A()
            return
        L_0x0054:
            boolean r2 = r0.containsAll(r1)
            if (r2 == 0) goto L_0x005e
            r5.p(r6, r7)
            return
        L_0x005e:
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0067:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x007d
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r0.contains(r2)
            if (r3 != 0) goto L_0x0067
            r7.add(r2)
            goto L_0x0067
        L_0x007d:
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ r4
            if (r0 == 0) goto L_0x008f
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r7)
            java.lang.String r1 = "new_permissions"
            r5.a(r1, r0)
        L_0x008f:
            r6.t(r7)
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.t.q(com.facebook.login.x$e, android.os.Bundle):void");
    }

    public final void s(x.e eVar, Bundle bundle) {
        x.f fVar;
        l.d(eVar, "request");
        l.d(bundle, "result");
        try {
            b0.a aVar = b0.f1579g;
            fVar = x.f.f1686m.b(eVar, aVar.a(bundle, com.facebook.x.FACEBOOK_APPLICATION_SERVICE, eVar.a()), aVar.c(bundle, eVar.m()));
        } catch (c0 e2) {
            fVar = x.f.c.d(x.f.f1686m, d().o(), (String) null, e2.getMessage(), (String) null, 8, (Object) null);
        }
        d().g(fVar);
    }
}
