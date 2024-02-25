package com.google.android.gms.common.api.internal;

import android.os.IBinder;

public final /* synthetic */ class k0 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ i f2453e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ IBinder f2454f;

    public /* synthetic */ k0(i iVar, IBinder iBinder) {
        this.f2453e = iVar;
        this.f2454f = iBinder;
    }

    public final void run() {
        this.f2453e.q(this.f2454f);
    }
}
