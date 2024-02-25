package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

public class a1 {

    /* renamed from: e  reason: collision with root package name */
    private static a1 f2715e;
    private String a = null;
    private Boolean b = null;
    private Boolean c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Queue<Intent> f2716d = new ArrayDeque();

    private a1() {
    }

    private int a(Context context, Intent intent) {
        ComponentName componentName;
        String f2 = f(context, intent);
        if (f2 != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + f2);
            }
            intent.setClassName(context.getPackageName(), f2);
        }
        try {
            if (e(context)) {
                componentName = i1.e(context, intent);
            } else {
                componentName = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentName != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (SecurityException e2) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
            return 401;
        } catch (IllegalStateException e3) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e3);
            return 402;
        }
    }

    static synchronized a1 b() {
        a1 a1Var;
        synchronized (a1.class) {
            if (f2715e == null) {
                f2715e = new a1();
            }
            a1Var = f2715e;
        }
        return a1Var;
    }

    private synchronized String f(Context context, Intent intent) {
        String str;
        String str2 = this.a;
        if (str2 != null) {
            return str2;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null) {
            ServiceInfo serviceInfo = resolveService.serviceInfo;
            if (serviceInfo != null) {
                if (context.getPackageName().equals(serviceInfo.packageName)) {
                    String str3 = serviceInfo.name;
                    if (str3 != null) {
                        if (str3.startsWith(".")) {
                            str = context.getPackageName() + serviceInfo.name;
                        } else {
                            str = serviceInfo.name;
                        }
                        this.a = str;
                        return this.a;
                    }
                }
                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                return null;
            }
        }
        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    /* access modifiers changed from: package-private */
    public Intent c() {
        return this.f2716d.poll();
    }

    /* access modifiers changed from: package-private */
    public boolean d(Context context) {
        if (this.c == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.c.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public boolean e(Context context) {
        if (this.b == null) {
            this.b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.b.booleanValue();
    }

    public int g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f2716d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
