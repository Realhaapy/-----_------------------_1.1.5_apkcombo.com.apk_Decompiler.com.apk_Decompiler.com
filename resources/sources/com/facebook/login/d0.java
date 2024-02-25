package com.facebook.login;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcel;
import androidx.activity.result.c;
import androidx.fragment.app.Fragment;
import com.facebook.c0;
import com.facebook.f0;
import com.facebook.g0;
import com.facebook.i0;
import com.facebook.internal.m0;
import com.facebook.internal.o0;
import com.facebook.login.b0;
import com.facebook.login.n;
import com.facebook.login.x;
import com.facebook.x;
import java.util.List;
import m.s;
import m.y.d.l;

public abstract class d0 extends b0 {

    /* renamed from: h  reason: collision with root package name */
    private final x f1587h = x.FACEBOOK_APPLICATION_WEB;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0(Parcel parcel) {
        super(parcel);
        l.d(parcel, "source");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0(x xVar) {
        super(xVar);
        l.d(xVar, "loginClient");
    }

    private final void p(x.f fVar) {
        if (fVar != null) {
            d().g(fVar);
        } else {
            d().A();
        }
    }

    private final boolean w(Intent intent) {
        g0 g0Var = g0.a;
        List<ResolveInfo> queryIntentActivities = g0.c().getPackageManager().queryIntentActivities(intent, 65536);
        l.c(queryIntentActivities, "FacebookSdk.getApplicationContext()\n            .packageManager\n            .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
        return !queryIntentActivities.isEmpty();
    }

    private final void y(x.e eVar, Bundle bundle) {
        if (bundle.containsKey("code")) {
            o0 o0Var = o0.a;
            if (!o0.V(bundle.getString("code"))) {
                g0 g0Var = g0.a;
                g0.k().execute(new l(this, eVar, bundle));
                return;
            }
        }
        v(eVar, bundle);
    }

    /* access modifiers changed from: private */
    public static final void z(d0 d0Var, x.e eVar, Bundle bundle) {
        l.d(d0Var, "this$0");
        l.d(eVar, "$request");
        l.d(bundle, "$extras");
        try {
            d0Var.k(eVar, bundle);
            d0Var.v(eVar, bundle);
        } catch (i0 e2) {
            f0 c = e2.c();
            d0Var.u(eVar, c.d(), c.c(), String.valueOf(c.b()));
        } catch (c0 e3) {
            d0Var.u(eVar, (String) null, e3.getMessage(), (String) null);
        }
    }

    /* access modifiers changed from: protected */
    public boolean A(Intent intent, int i2) {
        c<Intent> g2;
        if (intent == null || !w(intent)) {
            return false;
        }
        Fragment k2 = d().k();
        s sVar = null;
        y yVar = k2 instanceof y ? (y) k2 : null;
        if (!(yVar == null || (g2 = yVar.g()) == null)) {
            g2.a(intent);
            sVar = s.a;
        }
        return sVar != null;
    }

    public boolean j(int i2, int i3, Intent intent) {
        x.f d2;
        x.e o2 = d().o();
        if (intent == null) {
            d2 = x.f.f1686m.a(o2, "Operation canceled");
        } else {
            if (i3 == 0) {
                t(o2, intent);
            } else if (i3 != -1) {
                d2 = x.f.c.d(x.f.f1686m, o2, "Unexpected resultCode from authorization.", (String) null, (String) null, 8, (Object) null);
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    p(x.f.c.d(x.f.f1686m, o2, "Unexpected null from returned authorization data.", (String) null, (String) null, 8, (Object) null));
                    return true;
                }
                String q2 = q(extras);
                Object obj = extras.get("error_code");
                String obj2 = obj == null ? null : obj.toString();
                String r2 = r(extras);
                String string = extras.getString("e2e");
                o0 o0Var = o0.a;
                if (!o0.V(string)) {
                    h(string);
                }
                if (q2 == null && obj2 == null && r2 == null && o2 != null) {
                    y(o2, extras);
                } else {
                    u(o2, q2, r2, obj2);
                }
            }
            return true;
        }
        p(d2);
        return true;
    }

    /* access modifiers changed from: protected */
    public String q(Bundle bundle) {
        String string = bundle == null ? null : bundle.getString("error");
        if (string != null) {
            return string;
        }
        if (bundle == null) {
            return null;
        }
        return bundle.getString("error_type");
    }

    /* access modifiers changed from: protected */
    public String r(Bundle bundle) {
        String string = bundle == null ? null : bundle.getString("error_message");
        if (string != null) {
            return string;
        }
        if (bundle == null) {
            return null;
        }
        return bundle.getString("error_description");
    }

    public com.facebook.x s() {
        return this.f1587h;
    }

    /* access modifiers changed from: protected */
    public void t(x.e eVar, Intent intent) {
        x.f a;
        Object obj;
        l.d(intent, "data");
        Bundle extras = intent.getExtras();
        String q2 = q(extras);
        String str = null;
        if (!(extras == null || (obj = extras.get("error_code")) == null)) {
            str = obj.toString();
        }
        m0 m0Var = m0.a;
        if (l.a(m0.c(), str)) {
            a = x.f.f1686m.c(eVar, q2, r(extras), str);
        } else {
            a = x.f.f1686m.a(eVar, q2);
        }
        p(a);
    }

    /* access modifiers changed from: protected */
    public void u(x.e eVar, String str, String str2, String str3) {
        if (str == null || !l.a(str, "logged_out")) {
            m0 m0Var = m0.a;
            if (!r.n(m0.d(), str)) {
                p(r.n(m0.e(), str) ? x.f.f1686m.a(eVar, (String) null) : x.f.f1686m.c(eVar, str, str2, str3));
                return;
            }
        } else {
            n.b bVar = n.f1615n;
            n.f1616o = true;
        }
        p((x.f) null);
    }

    /* access modifiers changed from: protected */
    public void v(x.e eVar, Bundle bundle) {
        l.d(eVar, "request");
        l.d(bundle, "extras");
        try {
            b0.a aVar = b0.f1579g;
            p(x.f.f1686m.b(eVar, aVar.b(eVar.n(), bundle, s(), eVar.a()), aVar.d(bundle, eVar.m())));
        } catch (c0 e2) {
            p(x.f.c.d(x.f.f1686m, eVar, (String) null, e2.getMessage(), (String) null, 8, (Object) null));
        }
    }
}
