package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.internal.i;

final class c0 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ a f2405e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ d0 f2406f;

    c0(d0 d0Var, a aVar) {
        this.f2406f = d0Var;
        this.f2405e = aVar;
    }

    public final void run() {
        d0 d0Var = this.f2406f;
        z zVar = (z) d0Var.f2411f.f2426l.get(d0Var.b);
        if (zVar != null) {
            if (this.f2405e.f()) {
                this.f2406f.f2410e = true;
                if (this.f2406f.a.o()) {
                    this.f2406f.h();
                    return;
                }
                try {
                    d0 d0Var2 = this.f2406f;
                    d0Var2.a.d((i) null, d0Var2.a.c());
                } catch (SecurityException e2) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
                    this.f2406f.a.e("Failed to get service from broker.");
                    zVar.H(new a(10), (Exception) null);
                }
            } else {
                zVar.H(this.f2405e, (Exception) null);
            }
        }
    }
}
