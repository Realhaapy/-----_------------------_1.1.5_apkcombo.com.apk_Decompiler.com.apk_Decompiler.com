package com.facebook.y0.k0;

import android.app.Activity;
import com.facebook.g0;
import com.facebook.internal.c0;
import com.facebook.internal.d0;
import com.facebook.internal.o0;
import com.facebook.internal.q;
import com.facebook.internal.s0.n.a;
import m.y.d.l;

public final class c {
    public static final c a = new c();
    private static final String b = "com.facebook.y0.k0.c";
    private static boolean c;

    private c() {
    }

    public static final void a() {
        Class<c> cls = c.class;
        if (!a.d(cls)) {
            try {
                g0 g0Var = g0.a;
                g0.k().execute(a.f1851e);
            } catch (Exception e2) {
                o0 o0Var = o0.a;
                o0.d0(b, e2);
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void b() {
        Class<c> cls = c.class;
        if (!a.d(cls)) {
            try {
                g0 g0Var = g0.a;
                if (!q.f1478f.h(g0.c())) {
                    a.e();
                    c = true;
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    public static final void d(Activity activity) {
        Class<c> cls = c.class;
        if (!a.d(cls)) {
            try {
                l.d(activity, "activity");
                try {
                    if (!c) {
                        return;
                    }
                    if (!e.f1854d.c().isEmpty()) {
                        f.f1856i.e(activity);
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    private final void e() {
        String f2;
        if (!a.d(this)) {
            try {
                d0 d0Var = d0.a;
                g0 g0Var = g0.a;
                c0 n2 = d0.n(g0.d(), false);
                if (n2 != null && (f2 = n2.f()) != null) {
                    e.f1854d.d(f2);
                }
            } catch (Throwable th) {
                a.b(th, this);
            }
        }
    }
}
