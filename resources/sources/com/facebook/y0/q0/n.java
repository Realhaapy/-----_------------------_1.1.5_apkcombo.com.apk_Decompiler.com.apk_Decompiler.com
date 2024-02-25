package com.facebook.y0.q0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.internal.i0;
import com.facebook.internal.s0.n.a;
import com.facebook.internal.u0.b;
import com.facebook.p0;
import com.facebook.u;
import com.facebook.y0.a0;
import com.facebook.y0.g0;
import java.util.Arrays;
import java.util.Locale;
import m.y.d.l;
import m.y.d.s;

public final class n {
    public static final n a = new n();
    private static final String b = "com.facebook.y0.q0.n";
    private static final long[] c = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    private n() {
    }

    private final String a(Context context) {
        if (a.d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String j2 = l.j("PCKGCHKSUM;", packageManager.getPackageInfo(context.getPackageName(), 0).versionName);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string = sharedPreferences.getString(j2, (String) null);
            if (string != null && string.length() == 32) {
                return string;
            }
            l lVar = l.a;
            String c2 = l.c(context, (Long) null);
            if (c2 == null) {
                c2 = l.b(packageManager.getApplicationInfo(context.getPackageName(), 0).sourceDir);
            }
            sharedPreferences.edit().putString(j2, c2).apply();
            return c2;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            a.b(th, this);
            return null;
        }
    }

    public static final int b(long j2) {
        Class<n> cls = n.class;
        if (a.d(cls)) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            try {
                long[] jArr = c;
                if (i2 >= jArr.length || jArr[i2] >= j2) {
                    return i2;
                }
                i2++;
            } catch (Throwable th) {
                a.b(th, cls);
                return 0;
            }
        }
        return i2;
    }

    public static final void c(String str, o oVar, String str2, Context context) {
        Class<n> cls = n.class;
        if (!a.d(cls)) {
            try {
                l.d(str, "activityName");
                l.d(context, "context");
                String str3 = "Unclassified";
                if (oVar != null) {
                    String oVar2 = oVar.toString();
                    if (oVar2 != null) {
                        str3 = oVar2;
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putString("fb_mobile_launch_source", str3);
                bundle.putString("fb_mobile_pckg_fp", a.a(context));
                b bVar = b.a;
                bundle.putString("fb_mobile_app_cert_hash", b.a(context));
                g0.a aVar = g0.b;
                g0 a2 = aVar.a(str, str2, (u) null);
                a2.d("fb_mobile_activate_app", bundle);
                if (aVar.c() != a0.b.EXPLICIT_ONLY) {
                    a2.a();
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    private final void d() {
        if (!a.d(this)) {
            try {
                i0.a aVar = i0.f1448e;
                p0 p0Var = p0.APP_EVENTS;
                String str = b;
                l.b(str);
                aVar.b(p0Var, str, "Clock skew detected");
            } catch (Throwable th) {
                a.b(th, this);
            }
        }
    }

    public static final void e(String str, m mVar, String str2) {
        long j2;
        String str3 = str;
        Class<n> cls = n.class;
        if (!a.d(cls)) {
            try {
                l.d(str, "activityName");
                if (mVar != null) {
                    Long b2 = mVar.b();
                    long j3 = 0;
                    if (b2 == null) {
                        Long e2 = mVar.e();
                        j2 = 0 - (e2 == null ? 0 : e2.longValue());
                    } else {
                        j2 = b2.longValue();
                    }
                    if (j2 < 0) {
                        a.d();
                        j2 = 0;
                    }
                    long f2 = mVar.f();
                    if (f2 < 0) {
                        a.d();
                        f2 = 0;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("fb_mobile_app_interruptions", mVar.c());
                    s sVar = s.a;
                    String format = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(b(j2))}, 1));
                    l.c(format, "java.lang.String.format(locale, format, *args)");
                    bundle.putString("fb_mobile_time_between_sessions", format);
                    o g2 = mVar.g();
                    String str4 = "Unclassified";
                    if (g2 != null) {
                        String oVar = g2.toString();
                        if (oVar != null) {
                            str4 = oVar;
                        }
                    }
                    bundle.putString("fb_mobile_launch_source", str4);
                    Long e3 = mVar.e();
                    if (e3 != null) {
                        j3 = e3.longValue();
                    }
                    bundle.putLong("_logTime", j3 / ((long) 1000));
                    g0.b.a(str, str2, (u) null).c("fb_mobile_deactivate_app", ((double) f2) / ((double) 1000), bundle);
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }
}
