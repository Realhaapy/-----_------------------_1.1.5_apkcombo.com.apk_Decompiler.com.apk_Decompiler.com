package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

class h1 implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    private static final Object f2755j = new Object();

    /* renamed from: k  reason: collision with root package name */
    private static Boolean f2756k;

    /* renamed from: l  reason: collision with root package name */
    private static Boolean f2757l;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Context f2758e;

    /* renamed from: f  reason: collision with root package name */
    private final r0 f2759f;

    /* renamed from: g  reason: collision with root package name */
    private final PowerManager.WakeLock f2760g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final g1 f2761h;

    /* renamed from: i  reason: collision with root package name */
    private final long f2762i;

    class a extends BroadcastReceiver {
        private h1 a;

        public a(h1 h1Var) {
            this.a = h1Var;
        }

        public void a() {
            if (h1.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            h1.this.f2758e.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public synchronized void onReceive(Context context, Intent intent) {
            h1 h1Var = this.a;
            if (h1Var != null) {
                if (h1Var.i()) {
                    if (h1.j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.a.f2761h.l(this.a, 0);
                    context.unregisterReceiver(this);
                    this.a = null;
                }
            }
        }
    }

    h1(g1 g1Var, Context context, r0 r0Var, long j2) {
        this.f2761h = g1Var;
        this.f2758e = context;
        this.f2762i = j2;
        this.f2759f = r0Var;
        this.f2760g = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean booleanValue;
        synchronized (f2755j) {
            Boolean bool = f2757l;
            Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            f2757l = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z;
    }

    private static boolean h(Context context) {
        boolean booleanValue;
        synchronized (f2755j) {
            Boolean bool = f2756k;
            Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            f2756k = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* access modifiers changed from: private */
    public synchronized boolean i() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f2758e.getSystemService("connectivity");
        activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: private */
    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    @SuppressLint({"Wakelock"})
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (h(this.f2758e)) {
            this.f2760g.acquire(i0.a);
        }
        try {
            this.f2761h.n(true);
            if (!this.f2759f.g()) {
                this.f2761h.n(false);
                if (h(this.f2758e)) {
                    try {
                        this.f2760g.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else if (!f(this.f2758e) || i()) {
                if (this.f2761h.r()) {
                    this.f2761h.n(false);
                } else {
                    this.f2761h.s(this.f2762i);
                }
                if (h(this.f2758e)) {
                    try {
                        wakeLock = this.f2760g;
                        wakeLock.release();
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else {
                new a(this).a();
                if (h(this.f2758e)) {
                    try {
                        this.f2760g.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (IOException e2) {
            Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e2.getMessage());
            this.f2761h.n(false);
            if (h(this.f2758e)) {
                wakeLock = this.f2760g;
            }
        } catch (Throwable th) {
            if (h(this.f2758e)) {
                try {
                    this.f2760g.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
