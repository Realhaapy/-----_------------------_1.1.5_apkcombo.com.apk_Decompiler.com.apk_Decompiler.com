package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;

public final class g {
    private static Boolean a;
    private static Boolean b;
    private static Boolean c;

    /* renamed from: d  reason: collision with root package name */
    private static Boolean f2601d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f2601d == null) {
            boolean z = false;
            if (j.g() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            f2601d = Boolean.valueOf(z);
        }
        return f2601d.booleanValue();
    }

    @TargetApi(20)
    public static boolean b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (a == null) {
            boolean z = false;
            if (j.d() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            a = Boolean.valueOf(z);
        }
        return a.booleanValue();
    }

    @TargetApi(26)
    public static boolean c(Context context) {
        if (b(context)) {
            if (j.f()) {
                return d(context) && !j.g();
            }
            return true;
        }
    }

    @TargetApi(21)
    public static boolean d(Context context) {
        if (b == null) {
            boolean z = false;
            if (j.e() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            b = Boolean.valueOf(z);
        }
        return b.booleanValue();
    }

    public static boolean e(Context context) {
        if (c == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            c = Boolean.valueOf(z);
        }
        return c.booleanValue();
    }
}
