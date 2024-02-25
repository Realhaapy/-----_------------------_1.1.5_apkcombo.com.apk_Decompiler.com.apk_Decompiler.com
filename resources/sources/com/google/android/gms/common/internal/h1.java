package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.k.a;
import f.e.a.c.d.c.e;
import java.util.HashMap;
import java.util.concurrent.Executor;

final class h1 extends h {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<d1, e1> f2554f = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Context f2555g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public volatile Handler f2556h;

    /* renamed from: i  reason: collision with root package name */
    private final g1 f2557i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final a f2558j;

    /* renamed from: k  reason: collision with root package name */
    private final long f2559k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final long f2560l;

    h1(Context context, Looper looper) {
        g1 g1Var = new g1(this, (f1) null);
        this.f2557i = g1Var;
        this.f2555g = context.getApplicationContext();
        this.f2556h = new e(looper, g1Var);
        this.f2558j = a.b();
        this.f2559k = 5000;
        this.f2560l = 300000;
    }

    /* access modifiers changed from: protected */
    public final void d(d1 d1Var, ServiceConnection serviceConnection, String str) {
        n.i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f2554f) {
            e1 e1Var = this.f2554f.get(d1Var);
            if (e1Var == null) {
                String obj = d1Var.toString();
                StringBuilder sb = new StringBuilder(obj.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString());
            } else if (e1Var.h(serviceConnection)) {
                e1Var.f(serviceConnection, str);
                if (e1Var.i()) {
                    this.f2556h.sendMessageDelayed(this.f2556h.obtainMessage(0, d1Var), this.f2559k);
                }
            } else {
                String obj2 = d1Var.toString();
                StringBuilder sb2 = new StringBuilder(obj2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(obj2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean f(d1 d1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j2;
        n.i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f2554f) {
            e1 e1Var = this.f2554f.get(d1Var);
            if (e1Var == null) {
                e1Var = new e1(this, d1Var);
                e1Var.d(serviceConnection, serviceConnection, str);
                e1Var.e(str, executor);
                this.f2554f.put(d1Var, e1Var);
            } else {
                this.f2556h.removeMessages(0, d1Var);
                if (!e1Var.h(serviceConnection)) {
                    e1Var.d(serviceConnection, serviceConnection, str);
                    int a = e1Var.a();
                    if (a == 1) {
                        serviceConnection.onServiceConnected(e1Var.b(), e1Var.c());
                    } else if (a == 2) {
                        e1Var.e(str, executor);
                    }
                } else {
                    String obj = d1Var.toString();
                    StringBuilder sb = new StringBuilder(obj.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString());
                }
            }
            j2 = e1Var.j();
        }
        return j2;
    }
}
