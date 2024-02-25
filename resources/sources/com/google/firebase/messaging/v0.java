package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;

final class v0 {
    private static SharedPreferences a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    static boolean b(Context context) {
        return a(context).getBoolean("proxy_notification_initialized", false);
    }

    static void c(Context context, boolean z) {
        SharedPreferences.Editor edit = a(context).edit();
        edit.putBoolean("proxy_notification_initialized", z);
        edit.apply();
    }
}
