package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

final class g1 implements Handler.Callback {
    final /* synthetic */ h1 a;

    /* synthetic */ g1(h1 h1Var, f1 f1Var) {
        this.a = h1Var;
    }

    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            synchronized (this.a.f2554f) {
                d1 d1Var = (d1) message.obj;
                e1 e1Var = (e1) this.a.f2554f.get(d1Var);
                if (e1Var != null && e1Var.i()) {
                    if (e1Var.j()) {
                        e1Var.g("GmsClientSupervisor");
                    }
                    this.a.f2554f.remove(d1Var);
                }
            }
            return true;
        } else if (i2 != 1) {
            return false;
        } else {
            synchronized (this.a.f2554f) {
                d1 d1Var2 = (d1) message.obj;
                e1 e1Var2 = (e1) this.a.f2554f.get(d1Var2);
                if (e1Var2 != null && e1Var2.a() == 3) {
                    String valueOf = String.valueOf(d1Var2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName b = e1Var2.b();
                    if (b == null) {
                        b = d1Var2.b();
                    }
                    if (b == null) {
                        String d2 = d1Var2.d();
                        n.h(d2);
                        b = new ComponentName(d2, "unknown");
                    }
                    e1Var2.onServiceDisconnected(b);
                }
            }
            return true;
        }
    }
}
