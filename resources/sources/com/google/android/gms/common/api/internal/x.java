package com.google.android.gms.common.api.internal;

final class x implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ y f2476e;

    x(y yVar) {
        this.f2476e = yVar;
    }

    public final void run() {
        z zVar = this.f2476e.a;
        zVar.b.e(String.valueOf(zVar.b.getClass().getName()).concat(" disconnecting because it was signed out."));
    }
}
