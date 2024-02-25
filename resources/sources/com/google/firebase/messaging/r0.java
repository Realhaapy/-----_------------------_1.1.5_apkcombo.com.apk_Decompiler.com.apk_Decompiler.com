package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.j;
import com.google.firebase.h;
import java.util.List;

class r0 {
    private final Context a;
    private String b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private int f2824d;

    /* renamed from: e  reason: collision with root package name */
    private int f2825e = 0;

    r0(Context context) {
        this.a = context;
    }

    static String c(h hVar) {
        String f2 = hVar.o().f();
        if (f2 != null) {
            return f2;
        }
        String c2 = hVar.o().c();
        if (!c2.startsWith("1:")) {
            return c2;
        }
        String[] split = c2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo f(String str) {
        try {
            return this.a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("FirebaseMessaging", "Failed to find package " + e2);
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo f2 = f(this.a.getPackageName());
        if (f2 != null) {
            this.b = Integer.toString(f2.versionCode);
            this.c = f2.versionName;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized String a() {
        if (this.b == null) {
            h();
        }
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public synchronized String b() {
        if (this.c == null) {
            h();
        }
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public synchronized int d() {
        PackageInfo f2;
        if (this.f2824d == 0 && (f2 = f("com.google.android.gms")) != null) {
            this.f2824d = f2.versionCode;
        }
        return this.f2824d;
    }

    /* access modifiers changed from: package-private */
    public synchronized int e() {
        int i2 = this.f2825e;
        if (i2 != 0) {
            return i2;
        }
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!j.g()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f2825e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
            if (j.g()) {
                this.f2825e = 2;
            } else {
                this.f2825e = 1;
            }
            return this.f2825e;
        }
        this.f2825e = 2;
        return 2;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return e() != 0;
    }
}
