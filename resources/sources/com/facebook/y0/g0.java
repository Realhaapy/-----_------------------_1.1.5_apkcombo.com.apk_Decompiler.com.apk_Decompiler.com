package com.facebook.y0;

import android.content.Context;
import android.os.Bundle;
import com.facebook.u;
import com.facebook.y0.a0;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import m.y.d.g;
import m.y.d.l;

public final class g0 {
    public static final a b = new a((g) null);
    private final b0 a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final g0 a(String str, String str2, u uVar) {
            l.d(str, "activityName");
            return new g0(str, str2, uVar);
        }

        public final Executor b() {
            return b0.c.f();
        }

        public final a0.b c() {
            return b0.c.h();
        }

        public final String d() {
            return b0.c.j();
        }

        public final void e(Map<String, String> map) {
            l.d(map, "ud");
            j0 j0Var = j0.a;
            j0.l(map);
        }
    }

    public g0(Context context) {
        this(new b0(context, (String) null, (u) null));
    }

    public g0(Context context, String str) {
        this(new b0(context, str, (u) null));
    }

    public g0(b0 b0Var) {
        l.d(b0Var, "loggerImpl");
        this.a = b0Var;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public g0(String str, String str2, u uVar) {
        this(new b0(str, str2, uVar));
        l.d(str, "activityName");
    }

    public final void a() {
        this.a.j();
    }

    public final void b(Bundle bundle) {
        l.d(bundle, "parameters");
        if (!((bundle.getInt("previous") & 2) != 0)) {
            com.facebook.g0 g0Var = com.facebook.g0.a;
            if (!com.facebook.g0.g()) {
                return;
            }
        }
        this.a.r("fb_sdk_settings_changed", (Double) null, bundle);
    }

    public final void c(String str, double d2, Bundle bundle) {
        com.facebook.g0 g0Var = com.facebook.g0.a;
        if (com.facebook.g0.g()) {
            this.a.n(str, d2, bundle);
        }
    }

    public final void d(String str, Bundle bundle) {
        com.facebook.g0 g0Var = com.facebook.g0.a;
        if (com.facebook.g0.g()) {
            this.a.o(str, bundle);
        }
    }

    public final void e(String str, String str2) {
        this.a.q(str, str2);
    }

    public final void f(String str) {
        com.facebook.g0 g0Var = com.facebook.g0.a;
        if (com.facebook.g0.g()) {
            this.a.r(str, (Double) null, (Bundle) null);
        }
    }

    public final void g(String str, Bundle bundle) {
        com.facebook.g0 g0Var = com.facebook.g0.a;
        if (com.facebook.g0.g()) {
            this.a.r(str, (Double) null, bundle);
        }
    }

    public final void h(String str, Double d2, Bundle bundle) {
        com.facebook.g0 g0Var = com.facebook.g0.a;
        if (com.facebook.g0.g()) {
            this.a.r(str, d2, bundle);
        }
    }

    public final void i(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        com.facebook.g0 g0Var = com.facebook.g0.a;
        if (com.facebook.g0.g()) {
            this.a.s(str, bigDecimal, currency, bundle);
        }
    }

    public final void j(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        com.facebook.g0 g0Var = com.facebook.g0.a;
        if (com.facebook.g0.g()) {
            this.a.v(bigDecimal, currency, bundle);
        }
    }
}
