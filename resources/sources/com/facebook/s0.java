package com.facebook;

import android.content.Intent;
import com.facebook.internal.o0;
import m.y.d.g;
import m.y.d.l;

public final class s0 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f1741d = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static volatile s0 f1742e;
    private final e.n.a.a a;
    private final r0 b;
    private q0 c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final synchronized s0 a() {
            s0 a;
            if (s0.f1742e == null) {
                g0 g0Var = g0.a;
                e.n.a.a b = e.n.a.a.b(g0.c());
                l.c(b, "getInstance(applicationContext)");
                s0.f1742e = new s0(b, new r0());
            }
            a = s0.f1742e;
            if (a == null) {
                l.n("instance");
                throw null;
            }
            return a;
        }
    }

    public s0(e.n.a.a aVar, r0 r0Var) {
        l.d(aVar, "localBroadcastManager");
        l.d(r0Var, "profileCache");
        this.a = aVar;
        this.b = r0Var;
    }

    private final void e(q0 q0Var, q0 q0Var2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", q0Var);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", q0Var2);
        this.a.d(intent);
    }

    private final void g(q0 q0Var, boolean z) {
        q0 q0Var2 = this.c;
        this.c = q0Var;
        if (z) {
            r0 r0Var = this.b;
            if (q0Var != null) {
                r0Var.c(q0Var);
            } else {
                r0Var.a();
            }
        }
        o0 o0Var = o0.a;
        if (!o0.c(q0Var2, q0Var)) {
            e(q0Var2, q0Var);
        }
    }

    public final q0 c() {
        return this.c;
    }

    public final boolean d() {
        q0 b2 = this.b.b();
        if (b2 == null) {
            return false;
        }
        g(b2, false);
        return true;
    }

    public final void f(q0 q0Var) {
        g(q0Var, true);
    }
}
