package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import com.facebook.g0;
import com.facebook.h0;
import java.util.Collection;
import java.util.List;
import m.y.d.l;

public final class p0 {
    public static final p0 a = new p0();
    private static final String b;

    static {
        String name = p0.class.getName();
        l.c(name, "Validate::class.java.name");
        b = name;
    }

    private p0() {
    }

    public static final <T> void a(Collection<? extends T> collection, String str) {
        l.d(collection, "container");
        l.d(str, "name");
        for (Object obj : collection) {
            if (obj == null) {
                throw new NullPointerException("Container '" + str + "' cannot contain null values");
            }
        }
    }

    public static final String b() {
        g0 g0Var = g0.a;
        String d2 = g0.d();
        if (d2 != null) {
            return d2;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.".toString());
    }

    public static final String c() {
        g0 g0Var = g0.a;
        String i2 = g0.i();
        if (i2 != null) {
            return i2;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token. Please follow https://developers.facebook.com/docs/android/getting-started/#client-access-token to get the token and fill it in AndroidManifest.xml".toString());
    }

    public static final boolean d(Context context, String str) {
        List<ResolveInfo> list;
        l.d(context, "context");
        l.d(str, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        boolean z = false;
        for (ResolveInfo resolveInfo : list) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!l.a(activityInfo.name, "com.facebook.CustomTabActivity") || !l.a(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(android.content.Context r4, boolean r5) {
        /*
            java.lang.String r0 = "context"
            m.y.d.l.d(r4, r0)
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            r1 = 1
            if (r0 == 0) goto L_0x0018
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r3 = "com.facebook.FacebookActivity"
            r2.<init>(r4, r3)
            android.content.pm.ActivityInfo r4 = r0.getActivityInfo(r2, r1)     // Catch:{ NameNotFoundException -> 0x0018 }
            goto L_0x0019
        L_0x0018:
            r4 = 0
        L_0x0019:
            if (r4 != 0) goto L_0x0031
            r4 = r5 ^ 1
            java.lang.String r5 = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info."
            if (r4 == 0) goto L_0x0027
            java.lang.String r4 = b
            android.util.Log.w(r4, r5)
            goto L_0x0031
        L_0x0027:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.p0.e(android.content.Context, boolean):void");
    }

    public static final void f(Context context, boolean z) {
        l.d(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") != -1) {
            return;
        }
        if (!z) {
            Log.w(b, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
            return;
        }
        throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.".toString());
    }

    public static final void g(String str, String str2) {
        l.d(str, "arg");
        l.d(str2, "name");
        if (!(str.length() > 0)) {
            throw new IllegalArgumentException(("Argument '" + str2 + "' cannot be empty").toString());
        }
    }

    public static final <T> void h(Collection<? extends T> collection, String str) {
        l.d(collection, "container");
        l.d(str, "name");
        if (!(!collection.isEmpty())) {
            throw new IllegalArgumentException(("Container '" + str + "' cannot be empty").toString());
        }
    }

    public static final <T> void i(Collection<? extends T> collection, String str) {
        l.d(collection, "container");
        l.d(str, "name");
        a(collection, str);
        h(collection, str);
    }

    public static final void j(Object obj, String str) {
        l.d(str, "name");
        if (obj == null) {
            throw new NullPointerException("Argument '" + str + "' cannot be null");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if ((r3.length() > 0) != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String k(java.lang.String r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "name"
            m.y.d.l.d(r4, r0)
            r0 = 1
            r1 = 0
            if (r3 == 0) goto L_0x0015
            int r2 = r3.length()
            if (r2 <= 0) goto L_0x0011
            r2 = 1
            goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            if (r2 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x0019
            return r3
        L_0x0019:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Argument '"
            r3.append(r0)
            r3.append(r4)
            java.lang.String r4 = "' cannot be null or empty"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.p0.k(java.lang.String, java.lang.String):java.lang.String");
    }

    public static final void l() {
        g0 g0Var = g0.a;
        if (!g0.v()) {
            throw new h0("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}
