package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public final class v0 extends o0 {
    private c a;
    private final int b;

    public v0(c cVar, int i2) {
        this.a = cVar;
        this.b = i2;
    }

    public final void I(int i2, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    public final void b0(int i2, IBinder iBinder, Bundle bundle) {
        n.i(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.M(i2, iBinder, bundle, this.b);
        this.a = null;
    }

    public final void g(int i2, IBinder iBinder, z0 z0Var) {
        c cVar = this.a;
        n.i(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        n.h(z0Var);
        c.a0(cVar, z0Var);
        b0(i2, iBinder, z0Var.f2597e);
    }
}
