package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import f.e.a.a.i.p;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ u f2326e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ p f2327f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f2328g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Runnable f2329h;

    public /* synthetic */ d(u uVar, p pVar, int i2, Runnable runnable) {
        this.f2326e = uVar;
        this.f2327f = pVar;
        this.f2328g = i2;
        this.f2329h = runnable;
    }

    public final void run() {
        this.f2326e.t(this.f2327f, this.f2328g, this.f2329h);
    }
}
