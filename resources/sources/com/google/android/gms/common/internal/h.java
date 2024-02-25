package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

public abstract class h {
    private static int a = 4225;
    private static final Object b = new Object();
    private static h1 c = null;

    /* renamed from: d  reason: collision with root package name */
    static HandlerThread f2552d = null;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f2553e = false;

    public static int a() {
        return a;
    }

    public static h b(Context context) {
        synchronized (b) {
            if (c == null) {
                c = new h1(context.getApplicationContext(), f2553e ? c().getLooper() : context.getMainLooper());
            }
        }
        return c;
    }

    public static HandlerThread c() {
        synchronized (b) {
            HandlerThread handlerThread = f2552d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f2552d = handlerThread2;
            handlerThread2.start();
            HandlerThread handlerThread3 = f2552d;
            return handlerThread3;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void d(d1 d1Var, ServiceConnection serviceConnection, String str);

    public final void e(String str, String str2, int i2, ServiceConnection serviceConnection, String str3, boolean z) {
        d(new d1(str, str2, i2, z), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    public abstract boolean f(d1 d1Var, ServiceConnection serviceConnection, String str, Executor executor);
}
