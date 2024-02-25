package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.common.util.d;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d f2889e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f2890f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ k f2891g;

    public /* synthetic */ g(d dVar, String str, k kVar) {
        this.f2889e = dVar;
        this.f2890f = str;
        this.f2891g = kVar;
    }

    public final void run() {
        this.f2889e.a(this.f2890f, this.f2891g);
    }
}
