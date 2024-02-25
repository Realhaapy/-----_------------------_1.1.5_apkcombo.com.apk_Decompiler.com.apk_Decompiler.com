package com.facebook.y0.q0;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.Window;
import com.facebook.g0;
import com.facebook.internal.o0;
import com.facebook.internal.s0.n.a;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m.y.d.l;
import m.y.d.s;

public final class g {
    public static final g a = new g();

    private g() {
    }

    public static final void a() {
    }

    public static final void b() {
    }

    public static final String c(byte[] bArr) {
        l.d(bArr, "bytes");
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b = bArr[i2];
            i2++;
            s sVar = s.a;
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            l.c(format, "java.lang.String.format(format, *args)");
            stringBuffer.append(format);
        }
        String stringBuffer2 = stringBuffer.toString();
        l.c(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    public static final String d() {
        g0 g0Var = g0.a;
        Context c = g0.c();
        try {
            String str = c.getPackageManager().getPackageInfo(c.getPackageName(), 0).versionName;
            l.c(str, "{\n      val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)\n      packageInfo.versionName\n    }");
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static final View e(Activity activity) {
        Class<g> cls = g.class;
        if (a.d(cls) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0069, code lost:
        if (m.d0.p.t(r0, "generic", false, 2, (java.lang.Object) null) == false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean f() {
        /*
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "FINGERPRINT"
            m.y.d.l.c(r0, r1)
            java.lang.String r2 = "generic"
            r3 = 0
            r4 = 2
            r5 = 0
            boolean r6 = m.d0.p.t(r0, r2, r3, r4, r5)
            if (r6 != 0) goto L_0x0073
            m.y.d.l.c(r0, r1)
            java.lang.String r1 = "unknown"
            boolean r0 = m.d0.p.t(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "MODEL"
            m.y.d.l.c(r0, r1)
            java.lang.String r6 = "google_sdk"
            boolean r7 = m.d0.q.w(r0, r6, r3, r4, r5)
            if (r7 != 0) goto L_0x0073
            m.y.d.l.c(r0, r1)
            java.lang.String r7 = "Emulator"
            boolean r7 = m.d0.q.w(r0, r7, r3, r4, r5)
            if (r7 != 0) goto L_0x0073
            m.y.d.l.c(r0, r1)
            java.lang.String r1 = "Android SDK built for x86"
            boolean r0 = m.d0.q.w(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            m.y.d.l.c(r0, r1)
            java.lang.String r1 = "Genymotion"
            boolean r0 = m.d0.q.w(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "BRAND"
            m.y.d.l.c(r0, r1)
            boolean r0 = m.d0.p.t(r0, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r1 = "DEVICE"
            m.y.d.l.c(r0, r1)
            boolean r0 = m.d0.p.t(r0, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x0073
        L_0x006b:
            java.lang.String r0 = android.os.Build.PRODUCT
            boolean r0 = m.y.d.l.a(r6, r0)
            if (r0 == 0) goto L_0x0074
        L_0x0073:
            r3 = 1
        L_0x0074:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.q0.g.f():boolean");
    }

    public static final double g(String str) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(str);
            if (!matcher.find()) {
                return 0.0d;
            }
            String group = matcher.group(0);
            o0 o0Var = o0.a;
            return NumberFormat.getNumberInstance(o0.w()).parse(group).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }
}
