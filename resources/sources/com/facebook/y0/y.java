package com.facebook.y0;

import android.os.Bundle;
import com.facebook.f0;
import com.facebook.g0;
import com.facebook.internal.c0;
import com.facebook.internal.d0;
import com.facebook.internal.i0;
import com.facebook.internal.s0.n.a;
import com.facebook.j0;
import com.facebook.m0;
import com.facebook.p0;
import com.facebook.u;
import com.facebook.y0.a0;
import com.facebook.y0.l0.f;
import com.facebook.y0.l0.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import m.y.d.l;
import m.y.d.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class y {
    public static final y a = new y();
    private static final String b;
    private static final int c = 100;

    /* renamed from: d  reason: collision with root package name */
    private static volatile w f2195d = new w();

    /* renamed from: e  reason: collision with root package name */
    private static final ScheduledExecutorService f2196e = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: f  reason: collision with root package name */
    private static ScheduledFuture<?> f2197f;

    /* renamed from: g  reason: collision with root package name */
    private static final Runnable f2198g = d.f1820e;

    static {
        String name = y.class.getName();
        l.c(name, "AppEventQueue::class.java.name");
        b = name;
    }

    private y() {
    }

    public static final void a(t tVar, v vVar) {
        Class<y> cls = y.class;
        if (!a.d(cls)) {
            try {
                l.d(tVar, "accessTokenAppId");
                l.d(vVar, "appEvent");
                f2196e.execute(new e(tVar, vVar));
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void b(t tVar, v vVar) {
        Class<y> cls = y.class;
        if (!a.d(cls)) {
            try {
                l.d(tVar, "$accessTokenAppId");
                l.d(vVar, "$appEvent");
                f2195d.a(tVar, vVar);
                if (a0.b.e() != a0.b.EXPLICIT_ONLY && f2195d.d() > c) {
                    h(d0.EVENT_THRESHOLD);
                } else if (f2197f == null) {
                    f2197f = f2196e.schedule(f2198g, 15, TimeUnit.SECONDS);
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    public static final j0 c(t tVar, i0 i0Var, boolean z, f0 f0Var) {
        Class<y> cls = y.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(tVar, "accessTokenAppId");
            l.d(i0Var, "appEvents");
            l.d(f0Var, "flushState");
            String b2 = tVar.b();
            d0 d0Var = d0.a;
            boolean z2 = false;
            c0 n2 = d0.n(b2, false);
            j0.c cVar = j0.f1546n;
            s sVar = s.a;
            String format = String.format("%s/activities", Arrays.copyOf(new Object[]{b2}, 1));
            l.c(format, "java.lang.String.format(format, *args)");
            j0 A = cVar.A((u) null, format, (JSONObject) null, (j0.b) null);
            A.D(true);
            Bundle t = A.t();
            if (t == null) {
                t = new Bundle();
            }
            t.putString("access_token", tVar.a());
            String d2 = g0.b.d();
            if (d2 != null) {
                t.putString("device_token", d2);
            }
            String i2 = b0.c.i();
            if (i2 != null) {
                t.putString("install_referrer", i2);
            }
            A.G(t);
            if (n2 != null) {
                z2 = n2.l();
            }
            g0 g0Var = g0.a;
            int e2 = i0Var.e(A, g0.c(), z2, z);
            if (e2 == 0) {
                return null;
            }
            f0Var.c(f0Var.a() + e2);
            A.C(new f(tVar, A, i0Var, f0Var));
            return A;
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static final void d(t tVar, j0 j0Var, i0 i0Var, f0 f0Var, m0 m0Var) {
        Class<y> cls = y.class;
        if (!a.d(cls)) {
            try {
                l.d(tVar, "$accessTokenAppId");
                l.d(j0Var, "$postRequest");
                l.d(i0Var, "$appEvents");
                l.d(f0Var, "$flushState");
                l.d(m0Var, "response");
                k(tVar, j0Var, m0Var, i0Var, f0Var);
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    public static final List<j0> e(w wVar, f0 f0Var) {
        Class<y> cls = y.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(wVar, "appEventCollection");
            l.d(f0Var, "flushResults");
            g0 g0Var = g0.a;
            boolean p2 = g0.p(g0.c());
            ArrayList arrayList = new ArrayList();
            for (t next : wVar.f()) {
                i0 c2 = wVar.c(next);
                if (c2 != null) {
                    j0 c3 = c(next, c2, p2, f0Var);
                    if (c3 != null) {
                        arrayList.add(c3);
                        if (f.a.e()) {
                            h hVar = h.a;
                            h.l(c3);
                        }
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            return arrayList;
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    public static final void f(d0 d0Var) {
        Class<y> cls = y.class;
        if (!a.d(cls)) {
            try {
                l.d(d0Var, "reason");
                f2196e.execute(new g(d0Var));
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void g(d0 d0Var) {
        Class<y> cls = y.class;
        if (!a.d(cls)) {
            try {
                l.d(d0Var, "$reason");
                h(d0Var);
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(com.facebook.y0.d0 r4) {
        /*
            java.lang.Class<com.facebook.y0.y> r0 = com.facebook.y0.y.class
            boolean r1 = com.facebook.internal.s0.n.a.d(r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r1 = "reason"
            m.y.d.l.d(r4, r1)     // Catch:{ all -> 0x0051 }
            com.facebook.y0.x r1 = com.facebook.y0.x.a     // Catch:{ all -> 0x0051 }
            com.facebook.y0.h0 r1 = com.facebook.y0.x.a()     // Catch:{ all -> 0x0051 }
            com.facebook.y0.w r2 = f2195d     // Catch:{ all -> 0x0051 }
            r2.b(r1)     // Catch:{ all -> 0x0051 }
            com.facebook.y0.w r1 = f2195d     // Catch:{ Exception -> 0x0048 }
            com.facebook.y0.f0 r4 = u(r4, r1)     // Catch:{ Exception -> 0x0048 }
            if (r4 == 0) goto L_0x0047
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = "com.facebook.sdk.APP_EVENTS_FLUSHED"
            r1.<init>(r2)     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED"
            int r3 = r4.a()     // Catch:{ all -> 0x0051 }
            r1.putExtra(r2, r3)     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT"
            com.facebook.y0.e0 r4 = r4.b()     // Catch:{ all -> 0x0051 }
            r1.putExtra(r2, r4)     // Catch:{ all -> 0x0051 }
            com.facebook.g0 r4 = com.facebook.g0.a     // Catch:{ all -> 0x0051 }
            android.content.Context r4 = com.facebook.g0.c()     // Catch:{ all -> 0x0051 }
            e.n.a.a r4 = e.n.a.a.b(r4)     // Catch:{ all -> 0x0051 }
            r4.d(r1)     // Catch:{ all -> 0x0051 }
        L_0x0047:
            return
        L_0x0048:
            r4 = move-exception
            java.lang.String r1 = b     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = "Caught unexpected exception while flushing app events: "
            android.util.Log.w(r1, r2, r4)     // Catch:{ all -> 0x0051 }
            return
        L_0x0051:
            r4 = move-exception
            com.facebook.internal.s0.n.a.b(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.y.h(com.facebook.y0.d0):void");
    }

    /* access modifiers changed from: private */
    public static final void i() {
        Class<y> cls = y.class;
        if (!a.d(cls)) {
            try {
                f2197f = null;
                if (a0.b.e() != a0.b.EXPLICIT_ONLY) {
                    h(d0.TIMER);
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    public static final Set<t> j() {
        Class<y> cls = y.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            return f2195d.f();
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    public static final void k(t tVar, j0 j0Var, m0 m0Var, i0 i0Var, f0 f0Var) {
        String str;
        t tVar2 = tVar;
        i0 i0Var2 = i0Var;
        f0 f0Var2 = f0Var;
        Class<y> cls = y.class;
        if (!a.d(cls)) {
            try {
                l.d(tVar2, "accessTokenAppId");
                l.d(j0Var, "request");
                l.d(m0Var, "response");
                l.d(i0Var2, "appEvents");
                l.d(f0Var2, "flushState");
                f0 b2 = m0Var.b();
                String str2 = "Success";
                e0 e0Var = e0.SUCCESS;
                boolean z = true;
                if (b2 != null) {
                    if (b2.b() == -1) {
                        str2 = "Failed: No Connectivity";
                        e0Var = e0.NO_CONNECTIVITY;
                    } else {
                        s sVar = s.a;
                        str2 = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{m0Var.toString(), b2.toString()}, 2));
                        l.c(str2, "java.lang.String.format(format, *args)");
                        e0Var = e0.SERVER_ERROR;
                    }
                }
                g0 g0Var = g0.a;
                if (g0.x(p0.APP_EVENTS)) {
                    try {
                        str = new JSONArray((String) j0Var.v()).toString(2);
                        l.c(str, "{\n            val jsonArray = JSONArray(eventsJsonString)\n            jsonArray.toString(2)\n          }");
                    } catch (JSONException unused) {
                        str = "<Can't encode events for debug logging>";
                    }
                    i0.f1448e.c(p0.APP_EVENTS, b, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(j0Var.p()), str2, str);
                }
                if (b2 == null) {
                    z = false;
                }
                i0Var2.b(z);
                e0 e0Var2 = e0.NO_CONNECTIVITY;
                if (e0Var == e0Var2) {
                    g0 g0Var2 = g0.a;
                    g0.k().execute(new h(tVar2, i0Var2));
                }
                if (e0Var != e0.SUCCESS && f0Var.b() != e0Var2) {
                    f0Var2.d(e0Var);
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void l(t tVar, i0 i0Var) {
        Class<y> cls = y.class;
        if (!a.d(cls)) {
            try {
                l.d(tVar, "$accessTokenAppId");
                l.d(i0Var, "$appEvents");
                z zVar = z.a;
                z.a(tVar, i0Var);
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    public static final void s() {
        Class<y> cls = y.class;
        if (!a.d(cls)) {
            try {
                f2196e.execute(c.f1819e);
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void t() {
        Class<y> cls = y.class;
        if (!a.d(cls)) {
            try {
                z zVar = z.a;
                z.b(f2195d);
                f2195d = new w();
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    public static final f0 u(d0 d0Var, w wVar) {
        Class<y> cls = y.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(d0Var, "reason");
            l.d(wVar, "appEventCollection");
            f0 f0Var = new f0();
            List<j0> e2 = e(wVar, f0Var);
            if (!(!e2.isEmpty())) {
                return null;
            }
            i0.f1448e.c(p0.APP_EVENTS, b, "Flushing %d events due to %s.", Integer.valueOf(f0Var.a()), d0Var.toString());
            for (j0 j2 : e2) {
                j2.j();
            }
            return f0Var;
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }
}
