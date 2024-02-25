package com.facebook.login;

import android.os.Bundle;
import com.facebook.g0;
import com.facebook.j0;
import com.facebook.n0;
import com.facebook.u;
import m.y.d.l;

public final class e0 {
    public static final e0 a = new e0();

    private e0() {
    }

    public static final j0 a(String str, String str2, String str3) {
        l.d(str, "authorizationCode");
        l.d(str2, "redirectUri");
        l.d(str3, "codeVerifier");
        Bundle bundle = new Bundle();
        bundle.putString("code", str);
        g0 g0Var = g0.a;
        bundle.putString("client_id", g0.d());
        bundle.putString("redirect_uri", str2);
        bundle.putString("code_verifier", str3);
        j0 x = j0.f1546n.x((u) null, "oauth/access_token", (j0.b) null);
        x.F(n0.GET);
        x.G(bundle);
        return x;
    }
}
