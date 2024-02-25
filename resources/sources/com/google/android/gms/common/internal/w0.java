package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

public final class w0 implements ServiceConnection {
    private final int a;
    final /* synthetic */ c b;

    public w0(c cVar, int i2) {
        this.b = cVar;
        this.a = i2;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c cVar = this.b;
        if (iBinder == null) {
            c.b0(cVar, 16);
            return;
        }
        synchronized (cVar.f2500g) {
            c cVar2 = this.b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            cVar2.f2501h = (queryLocalInterface == null || !(queryLocalInterface instanceof k)) ? new p0(iBinder) : (k) queryLocalInterface;
        }
        this.b.c0(0, (Bundle) null, this.a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.b.f2500g) {
            this.b.f2501h = null;
        }
        Handler handler = this.b.f2498e;
        handler.sendMessage(handler.obtainMessage(6, this.a, 1));
    }
}
