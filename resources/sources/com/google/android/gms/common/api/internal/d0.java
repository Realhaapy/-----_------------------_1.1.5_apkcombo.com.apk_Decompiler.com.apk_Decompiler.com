package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.i;
import java.util.Set;

final class d0 implements c.C0042c, p0 {
    /* access modifiers changed from: private */
    public final a.f a;
    /* access modifiers changed from: private */
    public final b<?> b;
    private i c = null;

    /* renamed from: d  reason: collision with root package name */
    private Set<Scope> f2409d = null;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f2410e = false;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ e f2411f;

    public d0(e eVar, a.f fVar, b<?> bVar) {
        this.f2411f = eVar;
        this.a = fVar;
        this.b = bVar;
    }

    /* access modifiers changed from: private */
    public final void h() {
        i iVar;
        if (this.f2410e && (iVar = this.c) != null) {
            this.a.d(iVar, this.f2409d);
        }
    }

    public final void a(com.google.android.gms.common.a aVar) {
        this.f2411f.f2430p.post(new c0(this, aVar));
    }

    public final void b(i iVar, Set<Scope> set) {
        if (iVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            c(new com.google.android.gms.common.a(4));
            return;
        }
        this.c = iVar;
        this.f2409d = set;
        h();
    }

    public final void c(com.google.android.gms.common.a aVar) {
        z zVar = (z) this.f2411f.f2426l.get(this.b);
        if (zVar != null) {
            zVar.I(aVar);
        }
    }
}
