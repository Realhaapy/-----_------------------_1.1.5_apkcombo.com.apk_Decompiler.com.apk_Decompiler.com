package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import androidx.fragment.app.e;
import com.facebook.c0;
import com.facebook.e0;
import com.facebook.g0;
import com.facebook.i0;
import com.facebook.internal.o0;
import com.facebook.login.b0;
import com.facebook.login.x;
import com.facebook.u;
import m.y.d.l;

public abstract class f0 extends b0 {

    /* renamed from: h  reason: collision with root package name */
    private String f1595h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f0(Parcel parcel) {
        super(parcel);
        l.d(parcel, "source");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f0(x xVar) {
        super(xVar);
        l.d(xVar, "loginClient");
    }

    private final String t() {
        Context i2 = d().i();
        if (i2 == null) {
            g0 g0Var = g0.a;
            i2 = g0.c();
        }
        return i2.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    private final void v(String str) {
        Context i2 = d().i();
        if (i2 == null) {
            g0 g0Var = g0.a;
            i2 = g0.c();
        }
        i2.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
    }

    /* access modifiers changed from: protected */
    public Bundle p(Bundle bundle, x.e eVar) {
        String str;
        String str2;
        String str3;
        l.d(bundle, "parameters");
        l.d(eVar, "request");
        bundle.putString("redirect_uri", g());
        if (eVar.r()) {
            str2 = eVar.a();
            str = "app_id";
        } else {
            str2 = eVar.a();
            str = "client_id";
        }
        bundle.putString(str, str2);
        bundle.putString("e2e", x.f1658q.a());
        if (eVar.r()) {
            str3 = "token,signed_request,graph_domain,granted_scopes";
        } else {
            if (eVar.n().contains("openid")) {
                bundle.putString("nonce", eVar.m());
            }
            str3 = "id_token,token,signed_request,graph_domain";
        }
        bundle.putString("response_type", str3);
        bundle.putString("code_challenge", eVar.d());
        m e2 = eVar.e();
        bundle.putString("code_challenge_method", e2 == null ? null : e2.name());
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", eVar.c());
        bundle.putString("login_behavior", eVar.j().name());
        g0 g0Var = g0.a;
        bundle.putString("sdk", l.j("android-", g0.r()));
        if (r() != null) {
            bundle.putString("sso", r());
        }
        String str4 = "1";
        bundle.putString("cct_prefetching", g0.f1394p ? str4 : "0");
        if (eVar.q()) {
            bundle.putString("fx_app", eVar.k().toString());
        }
        if (eVar.u()) {
            bundle.putString("skip_dedupe", "true");
        }
        if (eVar.l() != null) {
            bundle.putString("messenger_page_id", eVar.l());
            if (!eVar.o()) {
                str4 = "0";
            }
            bundle.putString("reset_messenger_state", str4);
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    public Bundle q(x.e eVar) {
        l.d(eVar, "request");
        Bundle bundle = new Bundle();
        o0 o0Var = o0.a;
        if (!o0.W(eVar.n())) {
            String join = TextUtils.join(",", eVar.n());
            bundle.putString("scope", join);
            a("scope", join);
        }
        p g2 = eVar.g();
        if (g2 == null) {
            g2 = p.NONE;
        }
        bundle.putString("default_audience", g2.c());
        bundle.putString("state", c(eVar.b()));
        u e2 = u.f1749p.e();
        String l2 = e2 == null ? null : e2.l();
        String str = "0";
        if (l2 == null || !l.a(l2, t())) {
            e i2 = d().i();
            if (i2 != null) {
                o0.g(i2);
            }
            a("access_token", str);
        } else {
            bundle.putString("access_token", l2);
            a("access_token", "1");
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        g0 g0Var = g0.a;
        if (g0.g()) {
            str = "1";
        }
        bundle.putString("ies", str);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public String r() {
        return null;
    }

    public abstract com.facebook.x s();

    public void u(x.e eVar, Bundle bundle, c0 c0Var) {
        x.f fVar;
        String str;
        l.d(eVar, "request");
        x d2 = d();
        this.f1595h = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f1595h = bundle.getString("e2e");
            }
            try {
                b0.a aVar = b0.f1579g;
                u b = aVar.b(eVar.n(), bundle, s(), eVar.a());
                fVar = x.f.f1686m.b(d2.o(), b, aVar.d(bundle, eVar.m()));
                if (d2.i() != null) {
                    try {
                        CookieSyncManager.createInstance(d2.i()).sync();
                    } catch (Exception unused) {
                    }
                    if (b != null) {
                        v(b.l());
                    }
                }
            } catch (c0 e2) {
                fVar = x.f.c.d(x.f.f1686m, d2.o(), (String) null, e2.getMessage(), (String) null, 8, (Object) null);
            }
        } else if (c0Var instanceof e0) {
            fVar = x.f.f1686m.a(d2.o(), "User canceled log in.");
        } else {
            this.f1595h = null;
            String message = c0Var == null ? null : c0Var.getMessage();
            if (c0Var instanceof i0) {
                com.facebook.f0 c = ((i0) c0Var).c();
                str = String.valueOf(c.b());
                message = c.toString();
            } else {
                str = null;
            }
            fVar = x.f.f1686m.c(d2.o(), (String) null, message, str);
        }
        o0 o0Var = o0.a;
        if (!o0.V(this.f1595h)) {
            h(this.f1595h);
        }
        d2.g(fVar);
    }
}
