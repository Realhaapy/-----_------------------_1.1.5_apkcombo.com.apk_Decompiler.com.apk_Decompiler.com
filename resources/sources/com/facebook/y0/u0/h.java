package com.facebook.y0.u0;

import android.app.Activity;
import com.facebook.g0;
import com.facebook.internal.c0;
import com.facebook.internal.d0;
import com.facebook.internal.s0.n.a;
import com.facebook.y0.q0.f;
import com.facebook.y0.r0.h;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import m.y.d.l;

public final class h {
    public static final h a = new h();
    private static final AtomicBoolean b = new AtomicBoolean(false);
    private static final Set<String> c = new LinkedHashSet();

    /* renamed from: d  reason: collision with root package name */
    private static final Set<String> f2172d = new LinkedHashSet();

    private h() {
    }

    public static final synchronized void a() {
        Class<h> cls = h.class;
        synchronized (cls) {
            if (!a.d(cls)) {
                try {
                    g0 g0Var = g0.a;
                    g0.k().execute(a.f2160e);
                } catch (Throwable th) {
                    a.b(th, cls);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void b() {
        Class<h> cls = h.class;
        if (!a.d(cls)) {
            try {
                AtomicBoolean atomicBoolean = b;
                if (!atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    a.c();
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    private final void c() {
        String k2;
        if (!a.d(this)) {
            try {
                d0 d0Var = d0.a;
                g0 g0Var = g0.a;
                c0 n2 = d0.n(g0.d(), false);
                if (n2 != null && (k2 = n2.k()) != null) {
                    g(k2);
                    if ((!c.isEmpty()) || (!f2172d.isEmpty())) {
                        com.facebook.y0.r0.h hVar = com.facebook.y0.r0.h.a;
                        File i2 = com.facebook.y0.r0.h.i(h.a.MTML_APP_EVENT_PREDICTION);
                        if (i2 != null) {
                            e eVar = e.a;
                            e.d(i2);
                            f fVar = f.a;
                            Activity g2 = f.g();
                            if (g2 != null) {
                                h(g2);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                a.b(th, this);
            }
        }
    }

    public static final boolean d(String str) {
        Class<h> cls = h.class;
        if (a.d(cls)) {
            return false;
        }
        try {
            l.d(str, "event");
            return f2172d.contains(str);
        } catch (Throwable th) {
            a.b(th, cls);
            return false;
        }
    }

    public static final boolean e(String str) {
        Class<h> cls = h.class;
        if (a.d(cls)) {
            return false;
        }
        try {
            l.d(str, "event");
            return c.contains(str);
        } catch (Throwable th) {
            a.b(th, cls);
            return false;
        }
    }

    public static final void h(Activity activity) {
        Class<h> cls = h.class;
        if (!a.d(cls)) {
            try {
                l.d(activity, "activity");
                try {
                    if (b.get()) {
                        e eVar = e.a;
                        if (e.f() && (!c.isEmpty() || !f2172d.isEmpty())) {
                            i.f2173h.a(activity);
                            return;
                        }
                    }
                    i.f2173h.b(activity);
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        r9 = r2.getJSONArray("eligible_for_prediction_events");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "eligible_for_prediction_events"
            java.lang.String r1 = "production_events"
            boolean r2 = com.facebook.internal.s0.n.a.d(r8)
            if (r2 == 0) goto L_0x000b
            return
        L_0x000b:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            r2.<init>(r9)     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            boolean r9 = r2.has(r1)     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            java.lang.String r3 = "jsonArray.getString(i)"
            r4 = 0
            if (r9 == 0) goto L_0x0037
            org.json.JSONArray r9 = r2.getJSONArray(r1)     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            int r1 = r9.length()     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            if (r1 <= 0) goto L_0x0037
            r5 = 0
        L_0x0024:
            int r6 = r5 + 1
            java.util.Set<java.lang.String> r7 = c     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            java.lang.String r5 = r9.getString(r5)     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            m.y.d.l.c(r5, r3)     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            r7.add(r5)     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            if (r6 < r1) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r5 = r6
            goto L_0x0024
        L_0x0037:
            boolean r9 = r2.has(r0)     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            if (r9 == 0) goto L_0x005e
            org.json.JSONArray r9 = r2.getJSONArray(r0)     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            int r0 = r9.length()     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            if (r0 <= 0) goto L_0x005e
        L_0x0047:
            int r1 = r4 + 1
            java.util.Set<java.lang.String> r2 = f2172d     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            java.lang.String r4 = r9.getString(r4)     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            m.y.d.l.c(r4, r3)     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            r2.add(r4)     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            if (r1 < r0) goto L_0x0058
            goto L_0x005e
        L_0x0058:
            r4 = r1
            goto L_0x0047
        L_0x005a:
            r9 = move-exception
            com.facebook.internal.s0.n.a.b(r9, r8)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.u0.h.g(java.lang.String):void");
    }
}
