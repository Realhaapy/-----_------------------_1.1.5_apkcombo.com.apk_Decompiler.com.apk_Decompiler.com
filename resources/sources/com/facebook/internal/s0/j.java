package com.facebook.internal.s0;

import com.facebook.g0;
import com.facebook.internal.a0;
import com.facebook.internal.s0.m.c;
import com.facebook.internal.s0.n.a;
import com.facebook.internal.s0.o.e;

public final class j {
    public static final j a = new j();

    private j() {
    }

    public static final void d() {
        g0 g0Var = g0.a;
        if (g0.g()) {
            a0 a0Var = a0.a;
            a0.a(a0.b.CrashReport, b.a);
            a0.a(a0.b.ErrorReport, d.a);
            a0.a(a0.b.AnrReport, c.a);
        }
    }

    /* access modifiers changed from: private */
    public static final void e(boolean z) {
        if (z) {
            c.b.a();
            a0 a0Var = a0.a;
            if (a0.g(a0.b.CrashShield)) {
                h hVar = h.a;
                h.a();
                a aVar = a.a;
                a.a();
            }
            if (a0.g(a0.b.ThreadCheck)) {
                com.facebook.internal.s0.p.a aVar2 = com.facebook.internal.s0.p.a.a;
                com.facebook.internal.s0.p.a.a();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void f(boolean z) {
        if (z) {
            e eVar = e.a;
            e.a();
        }
    }

    /* access modifiers changed from: private */
    public static final void g(boolean z) {
        if (z) {
            com.facebook.internal.s0.l.e eVar = com.facebook.internal.s0.l.e.a;
            com.facebook.internal.s0.l.e.a();
        }
    }
}
