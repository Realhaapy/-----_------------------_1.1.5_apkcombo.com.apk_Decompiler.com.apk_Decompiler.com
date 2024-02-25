package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.facebook.CustomTabMainActivity;
import com.facebook.c0;
import com.facebook.e0;
import com.facebook.g0;
import com.facebook.internal.o0;
import com.facebook.internal.u;
import com.facebook.internal.v;
import com.facebook.login.o;
import com.facebook.login.x;
import com.facebook.x;
import m.y.d.g;
import m.y.d.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class n extends f0 {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: n  reason: collision with root package name */
    public static final b f1615n = new b((g) null);

    /* renamed from: o  reason: collision with root package name */
    public static boolean f1616o;

    /* renamed from: i  reason: collision with root package name */
    private String f1617i;

    /* renamed from: j  reason: collision with root package name */
    private String f1618j;

    /* renamed from: k  reason: collision with root package name */
    private String f1619k;

    /* renamed from: l  reason: collision with root package name */
    private final String f1620l = "custom_tab";

    /* renamed from: m  reason: collision with root package name */
    private final x f1621m = x.CHROME_CUSTOM_TAB;

    public static final class a implements Parcelable.Creator<n> {
        a() {
        }

        /* renamed from: a */
        public n createFromParcel(Parcel parcel) {
            l.d(parcel, "source");
            return new n(parcel);
        }

        /* renamed from: b */
        public n[] newArray(int i2) {
            return new n[i2];
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(Parcel parcel) {
        super(parcel);
        l.d(parcel, "source");
        this.f1618j = parcel.readString();
        v vVar = v.a;
        this.f1619k = v.c(x());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(x xVar) {
        super(xVar);
        l.d(xVar, "loginClient");
        o0 o0Var = o0.a;
        this.f1618j = o0.q(20);
        f1616o = false;
        v vVar = v.a;
        this.f1619k = v.c(x());
    }

    /* access modifiers changed from: private */
    public static final void A(n nVar, x.e eVar, Bundle bundle) {
        l.d(nVar, "this$0");
        l.d(eVar, "$request");
        l.d(bundle, "$values");
        try {
            nVar.k(eVar, bundle);
            nVar.u(eVar, bundle, (c0) null);
        } catch (c0 e2) {
            nVar.u(eVar, (Bundle) null, e2);
        }
    }

    private final boolean B(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return l.a(new JSONObject(string).getString("7_challenge"), this.f1618j);
        } catch (JSONException unused) {
            return false;
        }
    }

    private final String w() {
        String str = this.f1617i;
        if (str != null) {
            return str;
        }
        v vVar = v.a;
        String a2 = v.a();
        this.f1617i = a2;
        return a2;
    }

    private final String x() {
        return super.g();
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void z(java.lang.String r7, com.facebook.login.x.e r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x00cf
            java.lang.String r0 = "fbconnect://cct."
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r0 = m.d0.p.t(r7, r0, r1, r2, r3)
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = super.g()
            boolean r0 = m.d0.p.t(r7, r0, r1, r2, r3)
            if (r0 == 0) goto L_0x00cf
        L_0x0017:
            android.net.Uri r7 = android.net.Uri.parse(r7)
            com.facebook.internal.o0 r0 = com.facebook.internal.o0.a
            java.lang.String r0 = r7.getQuery()
            android.os.Bundle r0 = com.facebook.internal.o0.j0(r0)
            java.lang.String r7 = r7.getFragment()
            android.os.Bundle r7 = com.facebook.internal.o0.j0(r7)
            r0.putAll(r7)
            boolean r7 = r6.B(r0)
            if (r7 != 0) goto L_0x0041
            com.facebook.c0 r7 = new com.facebook.c0
            java.lang.String r0 = "Invalid state parameter"
            r7.<init>((java.lang.String) r0)
            super.u(r8, r3, r7)
            return
        L_0x0041:
            java.lang.String r7 = "error"
            java.lang.String r7 = r0.getString(r7)
            if (r7 != 0) goto L_0x004f
            java.lang.String r7 = "error_type"
            java.lang.String r7 = r0.getString(r7)
        L_0x004f:
            java.lang.String r1 = "error_msg"
            java.lang.String r1 = r0.getString(r1)
            if (r1 != 0) goto L_0x005d
            java.lang.String r1 = "error_message"
            java.lang.String r1 = r0.getString(r1)
        L_0x005d:
            if (r1 != 0) goto L_0x0065
            java.lang.String r1 = "error_description"
            java.lang.String r1 = r0.getString(r1)
        L_0x0065:
            java.lang.String r2 = "error_code"
            java.lang.String r2 = r0.getString(r2)
            r4 = -1
            if (r2 != 0) goto L_0x006f
            goto L_0x0074
        L_0x006f:
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0074 }
            goto L_0x0075
        L_0x0074:
            r2 = -1
        L_0x0075:
            com.facebook.internal.o0 r5 = com.facebook.internal.o0.a
            boolean r5 = com.facebook.internal.o0.V(r7)
            if (r5 == 0) goto L_0x00a0
            boolean r5 = com.facebook.internal.o0.V(r1)
            if (r5 == 0) goto L_0x00a0
            if (r2 != r4) goto L_0x00a0
            java.lang.String r7 = "access_token"
            boolean r7 = r0.containsKey(r7)
            if (r7 == 0) goto L_0x0091
            super.u(r8, r0, r3)
            return
        L_0x0091:
            com.facebook.g0 r7 = com.facebook.g0.a
            java.util.concurrent.Executor r7 = com.facebook.g0.k()
            com.facebook.login.a r1 = new com.facebook.login.a
            r1.<init>(r6, r8, r0)
            r7.execute(r1)
            goto L_0x00cf
        L_0x00a0:
            if (r7 == 0) goto L_0x00b8
            java.lang.String r0 = "access_denied"
            boolean r0 = m.y.d.l.a(r7, r0)
            if (r0 != 0) goto L_0x00b2
            java.lang.String r0 = "OAuthAccessDeniedException"
            boolean r0 = m.y.d.l.a(r7, r0)
            if (r0 == 0) goto L_0x00b8
        L_0x00b2:
            com.facebook.e0 r7 = new com.facebook.e0
            r7.<init>()
            goto L_0x00cc
        L_0x00b8:
            r0 = 4201(0x1069, float:5.887E-42)
            if (r2 != r0) goto L_0x00c2
            com.facebook.e0 r7 = new com.facebook.e0
            r7.<init>()
            goto L_0x00cc
        L_0x00c2:
            com.facebook.f0 r0 = new com.facebook.f0
            r0.<init>(r2, r7, r1)
            com.facebook.i0 r7 = new com.facebook.i0
            r7.<init>(r0, r1)
        L_0x00cc:
            super.u(r8, r3, r7)
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.n.z(java.lang.String, com.facebook.login.x$e):void");
    }

    public int describeContents() {
        return 0;
    }

    public String f() {
        return this.f1620l;
    }

    /* access modifiers changed from: protected */
    public String g() {
        return this.f1619k;
    }

    public boolean j(int i2, int i3, Intent intent) {
        if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f1347n, false)) {
            return super.j(i2, i3, intent);
        }
        if (i2 != 1) {
            return super.j(i2, i3, intent);
        }
        x.e o2 = d().o();
        if (o2 == null) {
            return false;
        }
        String str = null;
        if (i3 == -1) {
            if (intent != null) {
                str = intent.getStringExtra(CustomTabMainActivity.f1344k);
            }
            z(str, o2);
            return true;
        }
        super.u(o2, (Bundle) null, new e0());
        return false;
    }

    public void l(JSONObject jSONObject) {
        l.d(jSONObject, "param");
        jSONObject.put("7_challenge", this.f1618j);
    }

    public int o(x.e eVar) {
        Uri uri;
        o.a aVar;
        l.d(eVar, "request");
        x d2 = d();
        if (g().length() == 0) {
            return 0;
        }
        Bundle q2 = q(eVar);
        p(q2, eVar);
        if (f1616o) {
            q2.putString("cct_over_app_switch", "1");
        }
        if (g0.f1394p) {
            if (eVar.r()) {
                aVar = o.b;
                uri = com.facebook.internal.e0.c.a("oauth", q2);
            } else {
                aVar = o.b;
                uri = u.b.a("oauth", q2);
            }
            aVar.c(uri);
        }
        e i2 = d2.i();
        if (i2 == null) {
            return 0;
        }
        Intent intent = new Intent(i2, CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f1341h, "oauth");
        intent.putExtra(CustomTabMainActivity.f1342i, q2);
        intent.putExtra(CustomTabMainActivity.f1343j, w());
        intent.putExtra(CustomTabMainActivity.f1345l, eVar.k().toString());
        Fragment k2 = d2.k();
        if (k2 != null) {
            k2.startActivityForResult(intent, 1);
        }
        return 1;
    }

    /* access modifiers changed from: protected */
    public String r() {
        return "chrome_custom_tab";
    }

    public com.facebook.x s() {
        return this.f1621m;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "dest");
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f1618j);
    }
}
