package com.facebook.y0.s0;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.g0;
import com.facebook.internal.s0.n.a;
import com.facebook.y0.v;
import java.util.Set;
import m.y.d.l;

public final class c {
    public static final c a = new c();
    private static final Set<String> b = e0.f("fb_mobile_purchase", "StartTrial", "Subscribe");

    private c() {
    }

    private final boolean a(v vVar) {
        if (a.d(this)) {
            return false;
        }
        try {
            return (vVar.h() ^ true) || (vVar.h() && b.contains(vVar.f()));
        } catch (Throwable th) {
            a.b(th, this);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024 A[Catch:{ all -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean b() {
        /*
            java.lang.Class<com.facebook.y0.s0.c> r0 = com.facebook.y0.s0.c.class
            boolean r1 = com.facebook.internal.s0.n.a.d(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            com.facebook.g0 r1 = com.facebook.g0.a     // Catch:{ all -> 0x002e }
            android.content.Context r1 = com.facebook.g0.c()     // Catch:{ all -> 0x002e }
            boolean r1 = com.facebook.g0.p(r1)     // Catch:{ all -> 0x002e }
            r3 = 1
            if (r1 != 0) goto L_0x0021
            com.facebook.internal.o0 r1 = com.facebook.internal.o0.a     // Catch:{ all -> 0x002e }
            boolean r1 = com.facebook.internal.o0.S()     // Catch:{ all -> 0x002e }
            if (r1 != 0) goto L_0x0021
            r1 = 1
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            if (r1 == 0) goto L_0x002d
            com.facebook.y0.s0.e r1 = com.facebook.y0.s0.e.a     // Catch:{ all -> 0x002e }
            boolean r0 = com.facebook.y0.s0.e.b()     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x002d
            r2 = 1
        L_0x002d:
            return r2
        L_0x002e:
            r1 = move-exception
            com.facebook.internal.s0.n.a.b(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.s0.c.b():boolean");
    }

    public static final void e(String str, v vVar) {
        Class<c> cls = c.class;
        if (!a.d(cls)) {
            try {
                l.d(str, "applicationId");
                l.d(vVar, "event");
                if (a.a(vVar)) {
                    g0 g0Var = g0.a;
                    g0.k().execute(new b(str, vVar));
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void f(String str, v vVar) {
        Class<c> cls = c.class;
        if (!a.d(cls)) {
            try {
                l.d(str, "$applicationId");
                l.d(vVar, "$event");
                e eVar = e.a;
                e.c(str, i.b(vVar));
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    public static final void g(String str, String str2) {
        Class<c> cls = c.class;
        if (!a.d(cls)) {
            try {
                g0 g0Var = g0.a;
                Context c = g0.c();
                if (c != null && str != null && str2 != null) {
                    g0.k().execute(new a(c, str2, str));
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void h(Context context, String str, String str2) {
        Class<c> cls = c.class;
        if (!a.d(cls)) {
            try {
                l.d(context, "$context");
                SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                String j2 = l.j(str2, "pingForOnDevice");
                if (sharedPreferences.getLong(j2, 0) == 0) {
                    e eVar = e.a;
                    e.e(str2);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong(j2, System.currentTimeMillis());
                    edit.apply();
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }
}
