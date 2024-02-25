package com.facebook.internal;

import android.content.Context;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f1439e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f1440f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f1441g;

    public /* synthetic */ e(String str, Context context, String str2) {
        this.f1439e = str;
        this.f1440f = context;
        this.f1441g = str2;
    }

    public final void run() {
        b0.i(this.f1439e, this.f1440f, this.f1441g);
    }
}
