package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.a;

public final class y0 extends n0 {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ c f2596g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y0(c cVar, int i2, Bundle bundle) {
        super(cVar, i2, (Bundle) null);
        this.f2596g = cVar;
    }

    /* access modifiers changed from: protected */
    public final void f(a aVar) {
        if (!this.f2596g.s() || !c.f0(this.f2596g)) {
            this.f2596g.f2502i.a(aVar);
            this.f2596g.K(aVar);
            return;
        }
        c.b0(this.f2596g, 16);
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        this.f2596g.f2502i.a(a.f2366i);
        return true;
    }
}
