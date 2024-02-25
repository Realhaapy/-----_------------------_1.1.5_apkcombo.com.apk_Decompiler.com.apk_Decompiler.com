package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import f.e.a.c.g.i;
import f.e.a.c.g.j;
import f.e.a.c.g.l;
import java.util.concurrent.Executor;

final class u0 {
    private static boolean a(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    static void b(Context context) {
        if (!v0.b(context)) {
            d(x.f2848e, context, e(context));
        }
    }

    static /* synthetic */ void c(Context context, boolean z, j jVar) {
        try {
            if (!a(context)) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            v0.c(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate((String) null);
            }
            jVar.e(null);
        } finally {
            jVar.e(null);
        }
    }

    @TargetApi(29)
    static i<Void> d(Executor executor, Context context, boolean z) {
        if (!com.google.android.gms.common.util.j.i()) {
            return l.f(null);
        }
        j jVar = new j();
        executor.execute(new y(context, z, jVar));
        return jVar.a();
    }

    private static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
