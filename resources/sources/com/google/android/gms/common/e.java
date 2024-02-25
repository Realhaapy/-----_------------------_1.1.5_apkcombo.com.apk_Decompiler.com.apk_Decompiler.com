package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.j1;
import com.google.android.gms.common.l.c;
import com.google.android.gms.common.util.g;
import f.e.a.c.d.c.d;

public class e {
    public static final int a = g.a;

    e() {
    }

    public Intent a(Context context, int i2, String str) {
        if (i2 == 1 || i2 == 2) {
            if (context != null && g.c(context)) {
                return j1.a();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(a);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(c.a(context).d(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return j1.b("com.google.android.gms", sb.toString());
        } else if (i2 != 3) {
            return null;
        } else {
            return j1.c("com.google.android.gms");
        }
    }

    public PendingIntent b(Context context, int i2, int i3) {
        return c(context, i2, i3, (String) null);
    }

    public PendingIntent c(Context context, int i2, int i3, String str) {
        Intent a2 = a(context, i2, str);
        if (a2 == null) {
            return null;
        }
        return d.a(context, i3, a2, d.a | 134217728);
    }

    public String d(int i2) {
        return g.a(i2);
    }

    public int e(Context context) {
        return f(context, a);
    }

    public int f(Context context, int i2) {
        int c = g.c(context, i2);
        if (g.d(context, c)) {
            return 18;
        }
        return c;
    }

    public boolean g(Context context, String str) {
        return g.g(context, str);
    }

    public boolean h(int i2) {
        return g.f(i2);
    }
}
