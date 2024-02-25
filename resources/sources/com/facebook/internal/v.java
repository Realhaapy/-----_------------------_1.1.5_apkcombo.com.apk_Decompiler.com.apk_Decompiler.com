package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.facebook.g0;
import com.facebook.internal.s0.n.a;
import java.util.HashSet;
import java.util.List;
import m.y.d.l;

public final class v {
    public static final v a = new v();
    private static final String[] b = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    private v() {
    }

    public static final String a() {
        Class<v> cls = v.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            g0 g0Var = g0.a;
            Context c = g0.c();
            List<ResolveInfo> queryIntentServices = c.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (queryIntentServices != null) {
                HashSet r2 = f.r(b);
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    if (serviceInfo != null && r2.contains(serviceInfo.packageName)) {
                        return serviceInfo.packageName;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    public static final String b() {
        Class<v> cls = v.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            g0 g0Var = g0.a;
            return l.j("fbconnect://cct.", g0.c().getPackageName());
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    public static final String c(String str) {
        Class<v> cls = v.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(str, "developerDefinedRedirectURI");
            p0 p0Var = p0.a;
            g0 g0Var = g0.a;
            return p0.d(g0.c(), str) ? str : p0.d(g0.c(), b()) ? b() : "";
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }
}
