package com.google.android.gms.common.api.internal;

import android.app.Dialog;

final class b1 extends e0 {
    final /* synthetic */ Dialog a;
    final /* synthetic */ c1 b;

    b1(c1 c1Var, Dialog dialog) {
        this.b = c1Var;
        this.a = dialog;
    }

    public final void a() {
        this.b.f2408f.o();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
