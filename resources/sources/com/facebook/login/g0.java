package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.e;
import com.facebook.c0;
import com.facebook.internal.o0;
import com.facebook.internal.q0;
import com.facebook.internal.w;
import com.facebook.login.x;
import com.facebook.x;
import java.util.Objects;
import m.y.d.l;

public class g0 extends f0 {
    public static final Parcelable.Creator<g0> CREATOR = new b();

    /* renamed from: i  reason: collision with root package name */
    private q0 f1597i;

    /* renamed from: j  reason: collision with root package name */
    private String f1598j;

    /* renamed from: k  reason: collision with root package name */
    private final String f1599k = "web_view";

    /* renamed from: l  reason: collision with root package name */
    private final x f1600l = x.WEB_VIEW;

    public final class a extends q0.a {

        /* renamed from: h  reason: collision with root package name */
        private String f1601h = "fbconnect://success";

        /* renamed from: i  reason: collision with root package name */
        private w f1602i = w.NATIVE_WITH_FALLBACK;

        /* renamed from: j  reason: collision with root package name */
        private c0 f1603j = c0.FACEBOOK;

        /* renamed from: k  reason: collision with root package name */
        private boolean f1604k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f1605l;

        /* renamed from: m  reason: collision with root package name */
        public String f1606m;

        /* renamed from: n  reason: collision with root package name */
        public String f1607n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(g0 g0Var, Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
            l.d(g0Var, "this$0");
            l.d(context, "context");
            l.d(str, "applicationId");
            l.d(bundle, "parameters");
        }

        public q0 a() {
            Bundle f2 = f();
            Objects.requireNonNull(f2, "null cannot be cast to non-null type android.os.Bundle");
            f2.putString("redirect_uri", this.f1601h);
            f2.putString("client_id", c());
            f2.putString("e2e", j());
            f2.putString("response_type", this.f1603j == c0.INSTAGRAM ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain");
            f2.putString("return_scopes", "true");
            f2.putString("auth_type", i());
            f2.putString("login_behavior", this.f1602i.name());
            if (this.f1604k) {
                f2.putString("fx_app", this.f1603j.toString());
            }
            if (this.f1605l) {
                f2.putString("skip_dedupe", "true");
            }
            q0.b bVar = q0.f1483q;
            Context d2 = d();
            Objects.requireNonNull(d2, "null cannot be cast to non-null type android.content.Context");
            return bVar.d(d2, "oauth", f2, g(), this.f1603j, e());
        }

        public final String i() {
            String str = this.f1607n;
            if (str != null) {
                return str;
            }
            l.n("authType");
            throw null;
        }

        public final String j() {
            String str = this.f1606m;
            if (str != null) {
                return str;
            }
            l.n("e2e");
            throw null;
        }

        public final a k(String str) {
            l.d(str, "authType");
            l(str);
            return this;
        }

        public final void l(String str) {
            l.d(str, "<set-?>");
            this.f1607n = str;
        }

        public final a m(String str) {
            l.d(str, "e2e");
            n(str);
            return this;
        }

        public final void n(String str) {
            l.d(str, "<set-?>");
            this.f1606m = str;
        }

        public final a o(boolean z) {
            this.f1604k = z;
            return this;
        }

        public final a p(boolean z) {
            this.f1601h = z ? "fbconnect://chrome_os_success" : "fbconnect://success";
            return this;
        }

        public final a q(w wVar) {
            l.d(wVar, "loginBehavior");
            this.f1602i = wVar;
            return this;
        }

        public final a r(c0 c0Var) {
            l.d(c0Var, "targetApp");
            this.f1603j = c0Var;
            return this;
        }

        public final a s(boolean z) {
            this.f1605l = z;
            return this;
        }
    }

    public static final class b implements Parcelable.Creator<g0> {
        b() {
        }

        /* renamed from: a */
        public g0 createFromParcel(Parcel parcel) {
            l.d(parcel, "source");
            return new g0(parcel);
        }

        /* renamed from: b */
        public g0[] newArray(int i2) {
            return new g0[i2];
        }
    }

    public static final class c implements q0.e {
        final /* synthetic */ g0 a;
        final /* synthetic */ x.e b;

        c(g0 g0Var, x.e eVar) {
            this.a = g0Var;
            this.b = eVar;
        }

        public void a(Bundle bundle, c0 c0Var) {
            this.a.w(this.b, bundle, c0Var);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g0(Parcel parcel) {
        super(parcel);
        l.d(parcel, "source");
        this.f1598j = parcel.readString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g0(x xVar) {
        super(xVar);
        l.d(xVar, "loginClient");
    }

    public void b() {
        q0 q0Var = this.f1597i;
        if (q0Var != null) {
            if (q0Var != null) {
                q0Var.cancel();
            }
            this.f1597i = null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public String f() {
        return this.f1599k;
    }

    public boolean i() {
        return true;
    }

    public int o(x.e eVar) {
        l.d(eVar, "request");
        Bundle q2 = q(eVar);
        c cVar = new c(this, eVar);
        String a2 = x.f1658q.a();
        this.f1598j = a2;
        a("e2e", a2);
        e i2 = d().i();
        if (i2 == null) {
            return 0;
        }
        o0 o0Var = o0.a;
        boolean P = o0.P(i2);
        a aVar = new a(this, i2, eVar.a(), q2);
        String str = this.f1598j;
        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
        aVar.m(str);
        aVar.p(P);
        aVar.k(eVar.c());
        aVar.q(eVar.j());
        aVar.r(eVar.k());
        aVar.o(eVar.q());
        aVar.s(eVar.u());
        aVar.h(cVar);
        this.f1597i = aVar.a();
        w wVar = new w();
        wVar.setRetainInstance(true);
        wVar.x(this.f1597i);
        wVar.p(i2.getSupportFragmentManager(), "FacebookDialogFragment");
        return 1;
    }

    public com.facebook.x s() {
        return this.f1600l;
    }

    public final void w(x.e eVar, Bundle bundle, c0 c0Var) {
        l.d(eVar, "request");
        super.u(eVar, bundle, c0Var);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "dest");
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f1598j);
    }
}
