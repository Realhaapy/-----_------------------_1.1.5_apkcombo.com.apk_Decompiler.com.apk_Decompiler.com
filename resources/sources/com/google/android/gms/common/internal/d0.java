package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.g;

final class d0 extends e0 {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Intent f2523e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ g f2524f;

    d0(Intent intent, g gVar, int i2) {
        this.f2523e = intent;
        this.f2524f = gVar;
    }

    public final void a() {
        Intent intent = this.f2523e;
        if (intent != null) {
            this.f2524f.startActivityForResult(intent, 2);
        }
    }
}
