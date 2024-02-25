package com.facebook.y0;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.u;
import java.math.BigDecimal;
import java.util.Currency;
import m.y.d.g;
import m.y.d.l;

public final class a0 {
    public static final a b = new a((g) null);
    private final b0 a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(Application application, String str) {
            l.d(application, "application");
            b0.c.d(application, str);
        }

        public final void b() {
            j0 j0Var = j0.a;
            j0.a();
        }

        public final void c() {
            u uVar = u.a;
            u.g((String) null);
        }

        public final String d(Context context) {
            l.d(context, "context");
            return b0.c.g(context);
        }

        public final b e() {
            return b0.c.h();
        }

        public final String f() {
            u uVar = u.a;
            return u.a();
        }

        public final void g(Context context, String str) {
            l.d(context, "context");
            b0.c.k(context, str);
        }

        public final a0 h(Context context) {
            l.d(context, "context");
            return new a0(context, (String) null, (u) null, (g) null);
        }

        public final void i() {
            b0.c.s();
        }

        public final void j(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            j0 j0Var = j0.a;
            j0.n(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
        }

        public final void k(String str) {
            u uVar = u.a;
            u.g(str);
        }
    }

    public enum b {
        AUTO,
        EXPLICIT_ONLY
    }

    private a0(Context context, String str, u uVar) {
        this.a = new b0(context, str, uVar);
    }

    public /* synthetic */ a0(Context context, String str, u uVar, g gVar) {
        this(context, str, uVar);
    }

    public final void a() {
        this.a.j();
    }

    public final String b() {
        return this.a.k();
    }

    public final void c(String str) {
        this.a.l(str);
    }

    public final void d(String str, double d2) {
        this.a.m(str, d2);
    }

    public final void e(String str, double d2, Bundle bundle) {
        this.a.n(str, d2, bundle);
    }

    public final void f(String str, Bundle bundle) {
        this.a.o(str, bundle);
    }

    public final void g(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        this.a.t(bigDecimal, currency, bundle);
    }

    public final void h(Bundle bundle) {
        l.d(bundle, "payload");
        this.a.w(bundle, (String) null);
    }

    public final void i(Bundle bundle, String str) {
        l.d(bundle, "payload");
        this.a.w(bundle, str);
    }
}
