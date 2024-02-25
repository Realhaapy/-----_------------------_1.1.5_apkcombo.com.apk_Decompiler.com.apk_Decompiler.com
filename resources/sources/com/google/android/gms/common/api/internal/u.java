package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.c;

final class u implements c.a {
    final /* synthetic */ e a;

    u(e eVar) {
        this.a = eVar;
    }

    public final void a(boolean z) {
        e eVar = this.a;
        eVar.f2430p.sendMessage(eVar.f2430p.obtainMessage(1, Boolean.valueOf(z)));
    }
}
