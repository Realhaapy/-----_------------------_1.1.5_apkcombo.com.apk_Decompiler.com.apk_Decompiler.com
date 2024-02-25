package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import e.e.a;
import f.e.a.c.g.i;
import f.e.a.c.g.j;
import f.e.a.c.g.l;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class g1 {

    /* renamed from: i  reason: collision with root package name */
    private static final long f2747i = TimeUnit.HOURS.toSeconds(8);
    private final Context a;
    private final r0 b;
    private final o0 c;

    /* renamed from: d  reason: collision with root package name */
    private final FirebaseMessaging f2748d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, ArrayDeque<j<Void>>> f2749e = new a();

    /* renamed from: f  reason: collision with root package name */
    private final ScheduledExecutorService f2750f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2751g = false;

    /* renamed from: h  reason: collision with root package name */
    private final f1 f2752h;

    private g1(FirebaseMessaging firebaseMessaging, r0 r0Var, f1 f1Var, o0 o0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f2748d = firebaseMessaging;
        this.b = r0Var;
        this.f2752h = f1Var;
        this.c = o0Var;
        this.a = context;
        this.f2750f = scheduledExecutorService;
    }

    private void a(e1 e1Var, j<Void> jVar) {
        ArrayDeque arrayDeque;
        synchronized (this.f2749e) {
            String e2 = e1Var.e();
            if (this.f2749e.containsKey(e2)) {
                arrayDeque = this.f2749e.get(e2);
            } else {
                ArrayDeque arrayDeque2 = new ArrayDeque();
                this.f2749e.put(e2, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(jVar);
        }
    }

    private static <T> void b(i<T> iVar) {
        try {
            l.b(iVar, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e2);
            }
        } catch (InterruptedException | TimeoutException e3) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e3);
        }
    }

    private void c(String str) {
        b(this.c.l(this.f2748d.c(), str));
    }

    private void d(String str) {
        b(this.c.m(this.f2748d.c(), str));
    }

    static i<g1> e(FirebaseMessaging firebaseMessaging, r0 r0Var, o0 o0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        return l.d(scheduledExecutorService, new b0(context, scheduledExecutorService, firebaseMessaging, r0Var, o0Var));
    }

    static boolean g() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    static /* synthetic */ g1 i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, r0 r0Var, o0 o0Var) {
        return new g1(firebaseMessaging, r0Var, f1.b(context, scheduledExecutorService), o0Var, context, scheduledExecutorService);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void j(com.google.firebase.messaging.e1 r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, java.util.ArrayDeque<f.e.a.c.g.j<java.lang.Void>>> r0 = r4.f2749e
            monitor-enter(r0)
            java.lang.String r5 = r5.e()     // Catch:{ all -> 0x0032 }
            java.util.Map<java.lang.String, java.util.ArrayDeque<f.e.a.c.g.j<java.lang.Void>>> r1 = r4.f2749e     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.containsKey(r5)     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0011:
            java.util.Map<java.lang.String, java.util.ArrayDeque<f.e.a.c.g.j<java.lang.Void>>> r1 = r4.f2749e     // Catch:{ all -> 0x0032 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0032 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x0032 }
            java.lang.Object r2 = r1.poll()     // Catch:{ all -> 0x0032 }
            f.e.a.c.g.j r2 = (f.e.a.c.g.j) r2     // Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x0025
            r3 = 0
            r2.c(r3)     // Catch:{ all -> 0x0032 }
        L_0x0025:
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0030
            java.util.Map<java.lang.String, java.util.ArrayDeque<f.e.a.c.g.j<java.lang.Void>>> r1 = r4.f2749e     // Catch:{ all -> 0x0032 }
            r1.remove(r5)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.g1.j(com.google.firebase.messaging.e1):void");
    }

    private void o() {
        if (!h()) {
            s(0);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.f2752h.c() != null;
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean h() {
        return this.f2751g;
    }

    /* access modifiers changed from: package-private */
    public boolean k(e1 e1Var) {
        String str;
        String str2;
        try {
            String b2 = e1Var.b();
            char c2 = 65535;
            int hashCode = b2.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85) {
                    if (b2.equals("U")) {
                        c2 = 1;
                    }
                }
            } else if (b2.equals("S")) {
                c2 = 0;
            }
            if (c2 == 0) {
                c(e1Var.c());
                if (g()) {
                    str2 = "Subscribe to topic: " + e1Var.c() + " succeeded.";
                }
                return true;
            } else if (c2 != 1) {
                if (g()) {
                    str2 = "Unknown topic operation" + e1Var + ".";
                }
                return true;
            } else {
                d(e1Var.c());
                if (g()) {
                    str2 = "Unsubscribe from topic: " + e1Var.c() + " succeeded.";
                }
                return true;
            }
            Log.d("FirebaseMessaging", str2);
            return true;
        } catch (IOException e2) {
            if ("SERVICE_NOT_AVAILABLE".equals(e2.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e2.getMessage())) {
                str = "Topic operation failed: " + e2.getMessage() + ". Will retry Topic operation.";
            } else if (e2.getMessage() == null) {
                str = "Topic operation failed without exception message. Will retry Topic operation.";
            } else {
                throw e2;
            }
            Log.e("FirebaseMessaging", str);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void l(Runnable runnable, long j2) {
        this.f2750f.schedule(runnable, j2, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    public i<Void> m(e1 e1Var) {
        this.f2752h.a(e1Var);
        j jVar = new j();
        a(e1Var, jVar);
        return jVar.a();
    }

    /* access modifiers changed from: package-private */
    public synchronized void n(boolean z) {
        this.f2751g = z;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        if (f()) {
            o();
        }
    }

    /* access modifiers changed from: package-private */
    public i<Void> q(String str) {
        i<Void> m2 = m(e1.f(str));
        p();
        return m2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (k(r0) != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean r() {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            com.google.firebase.messaging.f1 r0 = r2.f2752h     // Catch:{ all -> 0x002b }
            com.google.firebase.messaging.e1 r0 = r0.c()     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0019
            boolean r0 = g()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x002b }
        L_0x0016:
            r0 = 1
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            return r0
        L_0x0019:
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            boolean r1 = r2.k(r0)
            if (r1 != 0) goto L_0x0022
            r0 = 0
            return r0
        L_0x0022:
            com.google.firebase.messaging.f1 r1 = r2.f2752h
            r1.e(r0)
            r2.j(r0)
            goto L_0x0000
        L_0x002b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.g1.r():boolean");
    }

    /* access modifiers changed from: package-private */
    public void s(long j2) {
        l(new h1(this, this.a, this.b, Math.min(Math.max(30, 2 * j2), f2747i)), j2);
        n(true);
    }

    /* access modifiers changed from: package-private */
    public i<Void> t(String str) {
        i<Void> m2 = m(e1.g(str));
        p();
        return m2;
    }
}
