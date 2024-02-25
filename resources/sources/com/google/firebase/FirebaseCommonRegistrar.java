package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.m;
import com.google.firebase.components.q;
import com.google.firebase.q.g;
import com.google.firebase.t.d;
import com.google.firebase.t.f;
import com.google.firebase.t.h;
import java.util.ArrayList;
import java.util.List;

public class FirebaseCommonRegistrar implements q {
    static /* synthetic */ String a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    static /* synthetic */ String b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    static /* synthetic */ String c(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 16 || !context.getPackageManager().hasSystemFeature("android.hardware.type.television")) ? (i2 < 20 || !context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) ? (i2 < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? (i2 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded" : "auto" : "watch" : "tv";
    }

    static /* synthetic */ String d(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? e(installerPackageName) : "";
    }

    private static String e(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public List<m<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(d.b());
        arrayList.add(g.c());
        arrayList.add(h.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(h.a("fire-core", "20.1.1"));
        arrayList.add(h.a("device-name", e(Build.PRODUCT)));
        arrayList.add(h.a("device-model", e(Build.DEVICE)));
        arrayList.add(h.a("device-brand", e(Build.BRAND)));
        arrayList.add(h.b("android-target-sdk", d.a));
        arrayList.add(h.b("android-min-sdk", e.a));
        arrayList.add(h.b("android-platform", f.a));
        arrayList.add(h.b("android-installer", c.a));
        String a = f.a();
        if (a != null) {
            arrayList.add(h.a("kotlin", a));
        }
        return arrayList;
    }
}
