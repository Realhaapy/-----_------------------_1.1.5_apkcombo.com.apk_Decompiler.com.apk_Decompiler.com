package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import f.e.a.c.g.i;
import f.e.a.c.g.j;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class k1 implements ServiceConnection {
    private final Context a;
    private final Intent b;
    private final ScheduledExecutorService c;

    /* renamed from: d  reason: collision with root package name */
    private final Queue<a> f2764d;

    /* renamed from: e  reason: collision with root package name */
    private j1 f2765e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2766f;

    static class a {
        final Intent a;
        private final j<Void> b = new j<>();

        a(Intent intent) {
            this.a = intent;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void e() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.a.getAction() + " App may get closed.");
            b();
        }

        /* access modifiers changed from: package-private */
        public void a(ScheduledExecutorService scheduledExecutorService) {
            c().c(scheduledExecutorService, new e0(scheduledExecutorService.schedule(new d0(this), 9000, TimeUnit.MILLISECONDS)));
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.b.e(null);
        }

        /* access modifiers changed from: package-private */
        public i<Void> c() {
            return this.b.a();
        }
    }

    k1(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new com.google.android.gms.common.util.n.a("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    k1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f2764d = new ArrayDeque();
        this.f2766f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.c = scheduledExecutorService;
    }

    private void a() {
        while (!this.f2764d.isEmpty()) {
            this.f2764d.poll().b();
        }
    }

    private synchronized void b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f2764d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            j1 j1Var = this.f2765e;
            if (j1Var == null || !j1Var.isBinderAlive()) {
                d();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f2765e.b(this.f2764d.poll());
        }
    }

    private void d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f2766f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (!this.f2766f) {
            this.f2766f = true;
            try {
                if (!com.google.android.gms.common.k.a.b().a(this.a, this.b, this, 65)) {
                    Log.e("FirebaseMessaging", "binding to the service failed");
                    this.f2766f = false;
                    a();
                }
            } catch (SecurityException e2) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized i<Void> c(Intent intent) {
        a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new a(intent);
        aVar.a(this.c);
        this.f2764d.add(aVar);
        b();
        return aVar.c();
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f2766f = false;
        if (!(iBinder instanceof j1)) {
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            a();
            return;
        }
        this.f2765e = (j1) iBinder;
        b();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        b();
    }
}
