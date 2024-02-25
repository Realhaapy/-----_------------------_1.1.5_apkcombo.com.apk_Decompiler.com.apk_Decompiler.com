package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.j;
import f.e.a.c.g.i;
import f.e.a.c.g.l;
import java.util.concurrent.Executor;

public class l0 {
    private static final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static k1 f2767d;
    private final Context a;
    private final Executor b = x.f2848e;

    public l0(Context context) {
        this.a = context;
    }

    private static i<Integer> a(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        return b(context, "com.google.firebase.MESSAGING_EVENT").c(intent).f(x.f2848e, e.a);
    }

    private static k1 b(Context context, String str) {
        k1 k1Var;
        synchronized (c) {
            if (f2767d == null) {
                f2767d = new k1(context, str);
            }
            k1Var = f2767d;
        }
        return k1Var;
    }

    static /* synthetic */ Integer c(i iVar) {
        return -1;
    }

    static /* synthetic */ Integer e(i iVar) {
        return 403;
    }

    static /* synthetic */ i f(Context context, Intent intent, i iVar) {
        return (!j.g() || ((Integer) iVar.i()).intValue() != 402) ? iVar : a(context, intent).f(x.f2848e, f.a);
    }

    public i<Integer> g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return h(this.a, intent);
    }

    @SuppressLint({"InlinedApi"})
    public i<Integer> h(Context context, Intent intent) {
        boolean z = true;
        boolean z2 = j.g() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) == 0) {
            z = false;
        }
        return (!z2 || z) ? l.d(this.b, new d(context, intent)).g(this.b, new g(context, intent)) : a(context, intent);
    }
}
