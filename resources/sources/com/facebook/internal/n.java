package com.facebook.internal;

import android.content.DialogInterface;

public final /* synthetic */ class n implements DialogInterface.OnCancelListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ q0 f1463e;

    public /* synthetic */ n(q0 q0Var) {
        this.f1463e = q0Var;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        q0.v(this.f1463e, dialogInterface);
    }
}
