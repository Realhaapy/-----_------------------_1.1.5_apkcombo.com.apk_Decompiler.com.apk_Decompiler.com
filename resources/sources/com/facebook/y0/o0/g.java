package com.facebook.y0.o0;

import com.facebook.internal.s0.n.a;
import com.facebook.y0.o0.h;

public final class g {
    public static final g a = new g();

    private g() {
    }

    private final void c() {
        if (!a.d(this)) {
            try {
                j jVar = j.a;
                h.b bVar = h.f2059s;
                j.e(bVar.d(), bVar.e());
                bVar.d().clear();
            } catch (Throwable th) {
                a.b(th, this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r1 = com.facebook.y0.o0.h.f2059s;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(android.content.Context r3) {
        /*
            java.lang.Class<com.facebook.y0.o0.g> r0 = com.facebook.y0.o0.g.class
            boolean r1 = com.facebook.internal.s0.n.a.d(r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r1 = "context"
            m.y.d.l.d(r3, r1)     // Catch:{ all -> 0x0042 }
            com.facebook.y0.o0.m r1 = com.facebook.y0.o0.m.a     // Catch:{ all -> 0x0042 }
            java.lang.String r1 = "com.android.billingclient.api.Purchase"
            java.lang.Class r1 = com.facebook.y0.o0.m.a(r1)     // Catch:{ all -> 0x0042 }
            if (r1 != 0) goto L_0x0019
            return
        L_0x0019:
            com.facebook.y0.o0.h$b r1 = com.facebook.y0.o0.h.f2059s     // Catch:{ all -> 0x0042 }
            com.facebook.y0.o0.h r3 = r1.c(r3)     // Catch:{ all -> 0x0042 }
            if (r3 != 0) goto L_0x0022
            return
        L_0x0022:
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.f()     // Catch:{ all -> 0x0042 }
            boolean r1 = r1.get()     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x0041
            com.facebook.y0.o0.j r1 = com.facebook.y0.o0.j.a     // Catch:{ all -> 0x0042 }
            boolean r1 = com.facebook.y0.o0.j.d()     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "inapp"
            if (r1 == 0) goto L_0x003c
            com.facebook.y0.o0.c r1 = com.facebook.y0.o0.c.f2049e     // Catch:{ all -> 0x0042 }
            r3.p(r2, r1)     // Catch:{ all -> 0x0042 }
            goto L_0x0041
        L_0x003c:
            com.facebook.y0.o0.d r1 = com.facebook.y0.o0.d.f2050e     // Catch:{ all -> 0x0042 }
            r3.o(r2, r1)     // Catch:{ all -> 0x0042 }
        L_0x0041:
            return
        L_0x0042:
            r3 = move-exception
            com.facebook.internal.s0.n.a.b(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.o0.g.d(android.content.Context):void");
    }

    /* access modifiers changed from: private */
    public static final void e() {
        Class<g> cls = g.class;
        if (!a.d(cls)) {
            try {
                a.c();
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void f() {
        Class<g> cls = g.class;
        if (!a.d(cls)) {
            try {
                a.c();
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }
}
