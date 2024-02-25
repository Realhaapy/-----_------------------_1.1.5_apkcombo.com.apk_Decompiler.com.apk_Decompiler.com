package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import f.e.a.c.d.a.f;

@SuppressLint({"HandlerLeak"})
final class m extends f {
    private final Context a;
    final /* synthetic */ d b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(d dVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.b = dVar;
        this.a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i2);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int e2 = this.b.e(this.a);
        if (this.b.h(e2)) {
            this.b.m(this.a, e2);
        }
    }
}
