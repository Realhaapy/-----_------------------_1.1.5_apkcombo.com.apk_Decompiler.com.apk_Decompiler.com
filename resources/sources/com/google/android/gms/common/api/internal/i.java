package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.n;
import java.util.Collections;
import java.util.Set;

public final class i implements a.f, ServiceConnection {
    private final String a;
    private final String b;
    private final ComponentName c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f2437d;

    /* renamed from: e  reason: collision with root package name */
    private final d f2438e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f2439f;

    /* renamed from: g  reason: collision with root package name */
    private final j f2440g;

    /* renamed from: h  reason: collision with root package name */
    private IBinder f2441h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2442i;

    /* renamed from: j  reason: collision with root package name */
    private String f2443j;

    static {
        Class<i> cls = i.class;
    }

    private final void s() {
        if (Thread.currentThread() != this.f2439f.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    private final void t(String str) {
        String.valueOf(String.valueOf(this.f2441h)).length();
    }

    public final void a(c.e eVar) {
    }

    public final boolean b() {
        s();
        return this.f2441h != null;
    }

    public final Set<Scope> c() {
        return Collections.emptySet();
    }

    public final void d(com.google.android.gms.common.internal.i iVar, Set<Scope> set) {
    }

    public final void e(String str) {
        s();
        this.f2443j = str;
        n();
    }

    public final boolean f() {
        return false;
    }

    public final int h() {
        return 0;
    }

    public final boolean i() {
        s();
        return this.f2442i;
    }

    public final com.google.android.gms.common.c[] j() {
        return new com.google.android.gms.common.c[0];
    }

    public final String k() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        n.h(this.c);
        return this.c.getPackageName();
    }

    public final String l() {
        return this.f2443j;
    }

    public final void m(c.C0042c cVar) {
        s();
        t("Connect started.");
        if (b()) {
            try {
                e("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.a).setAction(this.b);
            }
            boolean bindService = this.f2437d.bindService(intent, this, h.a());
            this.f2442i = bindService;
            if (!bindService) {
                this.f2441h = null;
                this.f2440g.b(new com.google.android.gms.common.a(16));
            }
            t("Finished connect.");
        } catch (SecurityException e2) {
            this.f2442i = false;
            this.f2441h = null;
            throw e2;
        }
    }

    public final void n() {
        s();
        t("Disconnect called.");
        try {
            this.f2437d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f2442i = false;
        this.f2441h = null;
    }

    public final boolean o() {
        return false;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f2439f.post(new k0(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f2439f.post(new j0(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void p() {
        this.f2442i = false;
        this.f2441h = null;
        t("Disconnected.");
        this.f2438e.a(1);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void q(IBinder iBinder) {
        this.f2442i = false;
        this.f2441h = iBinder;
        t("Connected.");
        this.f2438e.c(new Bundle());
    }

    public final void r(String str) {
    }
}
