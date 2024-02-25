package com.facebook.y0;

import com.facebook.internal.a0;
import com.facebook.internal.d0;
import com.facebook.y0.k0.c;
import com.facebook.y0.l0.f;
import com.facebook.y0.o0.k;
import com.facebook.y0.r0.h;

public final class c0 {
    public static final c0 a = new c0();

    public static final class a implements d0.b {
        a() {
        }

        /* access modifiers changed from: private */
        public static final void i(boolean z) {
            if (z) {
                c cVar = c.a;
                c.a();
            }
        }

        /* access modifiers changed from: private */
        public static final void j(boolean z) {
            if (z) {
                com.facebook.y0.t0.a aVar = com.facebook.y0.t0.a.a;
                com.facebook.y0.t0.a.a();
            }
        }

        /* access modifiers changed from: private */
        public static final void k(boolean z) {
            if (z) {
                h hVar = h.a;
                h.c();
            }
        }

        /* access modifiers changed from: private */
        public static final void l(boolean z) {
            if (z) {
                com.facebook.y0.n0.a aVar = com.facebook.y0.n0.a.a;
                com.facebook.y0.n0.a.a();
            }
        }

        /* access modifiers changed from: private */
        public static final void m(boolean z) {
            if (z) {
                k kVar = k.a;
                k.a();
            }
        }

        /* access modifiers changed from: private */
        public static final void n(boolean z) {
            if (z) {
                f fVar = f.a;
                f.a();
            }
        }

        public void a() {
        }

        public void b(com.facebook.internal.c0 c0Var) {
            a0 a0Var = a0.a;
            a0.a(a0.b.AAM, m.a);
            a0.a(a0.b.RestrictiveDataFiltering, p.a);
            a0.a(a0.b.PrivacyProtection, k.a);
            a0.a(a0.b.EventDeactivation, o.a);
            a0.a(a0.b.IapLogging, n.a);
            a0.a(a0.b.CloudBridge, l.a);
        }
    }

    private c0() {
    }

    public static final void a() {
        Class<c0> cls = c0.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                d0 d0Var = d0.a;
                d0.a(new a());
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }
}
