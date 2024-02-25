package com.facebook.y0.o0;

import com.facebook.g0;
import com.facebook.internal.a0;
import com.facebook.internal.s0.n.a;
import java.util.concurrent.atomic.AtomicBoolean;

public final class k {
    public static final k a = new k();
    private static final AtomicBoolean b = new AtomicBoolean(false);

    private k() {
    }

    public static final void a() {
        Class<k> cls = k.class;
        if (!a.d(cls)) {
            try {
                b.set(true);
                b();
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    public static final void b() {
        Class<k> cls = k.class;
        if (!a.d(cls)) {
            try {
                if (b.get()) {
                    if (a.c()) {
                        a0 a0Var = a0.a;
                        if (a0.g(a0.b.IapLoggingLib2)) {
                            g gVar = g.a;
                            g0 g0Var = g0.a;
                            g.d(g0.c());
                            return;
                        }
                    }
                    f fVar = f.a;
                    f.g();
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r3 = r0.metaData.getString("com.google.android.play.billingclient.version");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean c() {
        /*
            r9 = this;
            boolean r0 = com.facebook.internal.s0.n.a.d(r9)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            com.facebook.g0 r0 = com.facebook.g0.a     // Catch:{ Exception -> 0x004a, all -> 0x0046 }
            android.content.Context r0 = com.facebook.g0.c()     // Catch:{ Exception -> 0x004a, all -> 0x0046 }
            android.content.pm.PackageManager r2 = r0.getPackageManager()     // Catch:{ Exception -> 0x004a, all -> 0x0046 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ Exception -> 0x004a, all -> 0x0046 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo(r0, r3)     // Catch:{ Exception -> 0x004a, all -> 0x0046 }
            if (r0 == 0) goto L_0x004a
            android.os.Bundle r0 = r0.metaData     // Catch:{ Exception -> 0x004a, all -> 0x0046 }
            java.lang.String r2 = "com.google.android.play.billingclient.version"
            java.lang.String r3 = r0.getString(r2)     // Catch:{ Exception -> 0x004a, all -> 0x0046 }
            if (r3 != 0) goto L_0x0029
            return r1
        L_0x0029:
            java.lang.String r0 = "."
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x004a, all -> 0x0046 }
            r5 = 0
            r6 = 3
            r7 = 2
            r8 = 0
            java.util.List r0 = m.d0.q.U(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x004a, all -> 0x0046 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x004a, all -> 0x0046 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x004a, all -> 0x0046 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x004a, all -> 0x0046 }
            r2 = 2
            if (r0 < r2) goto L_0x0045
            r1 = 1
        L_0x0045:
            return r1
        L_0x0046:
            r0 = move-exception
            com.facebook.internal.s0.n.a.b(r0, r9)
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.o0.k.c():boolean");
    }
}
