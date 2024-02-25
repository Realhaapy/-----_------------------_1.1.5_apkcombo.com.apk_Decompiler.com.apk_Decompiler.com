package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

final class c0 extends e0 {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Intent f2513e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Activity f2514f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f2515g;

    c0(Intent intent, Activity activity, int i2) {
        this.f2513e = intent;
        this.f2514f = activity;
        this.f2515g = i2;
    }

    public final void a() {
        Intent intent = this.f2513e;
        if (intent != null) {
            this.f2514f.startActivityForResult(intent, this.f2515g);
        }
    }
}
