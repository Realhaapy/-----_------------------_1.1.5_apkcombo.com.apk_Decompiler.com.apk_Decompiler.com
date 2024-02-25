package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class f0 extends BroadcastReceiver {
    Context a;
    private final e0 b;

    public f0(e0 e0Var) {
        this.b = e0Var;
    }

    public final void a(Context context) {
        this.a = context;
    }

    public final synchronized void b() {
        Context context = this.a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.b.a();
            b();
        }
    }
}
