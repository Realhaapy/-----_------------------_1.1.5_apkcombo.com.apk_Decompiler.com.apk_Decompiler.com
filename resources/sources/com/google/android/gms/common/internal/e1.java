package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

final class e1 implements ServiceConnection, i1 {
    private final Map<ServiceConnection, ServiceConnection> a = new HashMap();
    private int b = 2;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private IBinder f2534d;

    /* renamed from: e  reason: collision with root package name */
    private final d1 f2535e;

    /* renamed from: f  reason: collision with root package name */
    private ComponentName f2536f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ h1 f2537g;

    public e1(h1 h1Var, d1 d1Var) {
        this.f2537g = h1Var;
        this.f2535e = d1Var;
    }

    public final int a() {
        return this.b;
    }

    public final ComponentName b() {
        return this.f2536f;
    }

    public final IBinder c() {
        return this.f2534d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        this.b = 3;
        h1 h1Var = this.f2537g;
        boolean d2 = h1Var.f2558j.d(h1Var.f2555g, str, this.f2535e.c(h1Var.f2555g), this, this.f2535e.a(), executor);
        this.c = d2;
        if (d2) {
            this.f2537g.f2556h.sendMessageDelayed(this.f2537g.f2556h.obtainMessage(1, this.f2535e), this.f2537g.f2560l);
            return;
        }
        this.b = 2;
        try {
            h1 h1Var2 = this.f2537g;
            h1Var2.f2558j.c(h1Var2.f2555g, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.a.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f2537g.f2556h.removeMessages(1, this.f2535e);
        h1 h1Var = this.f2537g;
        h1Var.f2558j.c(h1Var.f2555g, this);
        this.c = false;
        this.b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.a.isEmpty();
    }

    public final boolean j() {
        return this.c;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f2537g.f2554f) {
            this.f2537g.f2556h.removeMessages(1, this.f2535e);
            this.f2534d = iBinder;
            this.f2536f = componentName;
            for (ServiceConnection onServiceConnected : this.a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f2537g.f2554f) {
            this.f2537g.f2556h.removeMessages(1, this.f2535e);
            this.f2534d = null;
            this.f2536f = componentName;
            for (ServiceConnection onServiceDisconnected : this.a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
