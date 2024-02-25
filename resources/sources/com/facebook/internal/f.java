package com.facebook.internal;

import android.content.Context;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Context f1442e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f1443f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f1444g;

    public /* synthetic */ f(Context context, String str, String str2) {
        this.f1442e = context;
        this.f1443f = str;
        this.f1444g = str2;
    }

    public final void run() {
        d0.h(this.f1442e, this.f1443f, this.f1444g);
    }
}
