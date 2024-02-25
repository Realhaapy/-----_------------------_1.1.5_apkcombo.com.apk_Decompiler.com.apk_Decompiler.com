package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.l0;
import com.google.android.gms.common.internal.n;
import f.e.a.c.e.b.d;
import f.e.a.c.e.b.l;
import java.util.Set;

public final class q0 extends d implements f, g {

    /* renamed from: h  reason: collision with root package name */
    private static final a.C0039a<? extends f.e.a.c.e.g, f.e.a.c.e.a> f2463h = f.e.a.c.e.f.c;
    private final Context a;
    private final Handler b;
    private final a.C0039a<? extends f.e.a.c.e.g, f.e.a.c.e.a> c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<Scope> f2464d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.android.gms.common.internal.d f2465e;

    /* renamed from: f  reason: collision with root package name */
    private f.e.a.c.e.g f2466f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public p0 f2467g;

    public q0(Context context, Handler handler, com.google.android.gms.common.internal.d dVar) {
        a.C0039a<? extends f.e.a.c.e.g, f.e.a.c.e.a> aVar = f2463h;
        this.a = context;
        this.b = handler;
        n.i(dVar, "ClientSettings must not be null");
        this.f2465e = dVar;
        this.f2464d = dVar.e();
        this.c = aVar;
    }

    static /* bridge */ /* synthetic */ void f0(q0 q0Var, l lVar) {
        com.google.android.gms.common.a b2 = lVar.b();
        if (b2.f()) {
            l0 c2 = lVar.c();
            n.h(c2);
            l0 l0Var = c2;
            b2 = l0Var.b();
            if (!b2.f()) {
                String valueOf = String.valueOf(b2);
                String.valueOf(valueOf).length();
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(valueOf)), new Exception());
            } else {
                q0Var.f2467g.b(l0Var.c(), q0Var.f2464d);
                q0Var.f2466f.n();
            }
        }
        q0Var.f2467g.c(b2);
        q0Var.f2466f.n();
    }

    public final void B(l lVar) {
        this.b.post(new o0(this, lVar));
    }

    public final void a(int i2) {
        this.f2466f.n();
    }

    public final void b(com.google.android.gms.common.a aVar) {
        this.f2467g.c(aVar);
    }

    public final void c(Bundle bundle) {
        this.f2466f.g(this);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.common.api.a$f, f.e.a.c.e.g] */
    public final void g0(p0 p0Var) {
        f.e.a.c.e.g gVar = this.f2466f;
        if (gVar != null) {
            gVar.n();
        }
        this.f2465e.i(Integer.valueOf(System.identityHashCode(this)));
        a.C0039a aVar = this.c;
        Context context = this.a;
        Looper looper = this.b.getLooper();
        com.google.android.gms.common.internal.d dVar = this.f2465e;
        this.f2466f = aVar.a(context, looper, dVar, dVar.f(), this, this);
        this.f2467g = p0Var;
        Set<Scope> set = this.f2464d;
        if (set == null || set.isEmpty()) {
            this.b.post(new n0(this));
        } else {
            this.f2466f.p();
        }
    }

    public final void h0() {
        f.e.a.c.e.g gVar = this.f2466f;
        if (gVar != null) {
            gVar.n();
        }
    }
}
