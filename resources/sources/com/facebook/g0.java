package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.facebook.internal.a0;
import com.facebook.internal.m0;
import com.facebook.internal.o0;
import com.facebook.internal.p0;
import com.facebook.internal.q;
import com.facebook.internal.s0.j;
import com.facebook.j0;
import com.facebook.q0;
import com.facebook.y0.a0;
import com.facebook.y0.c0;
import com.facebook.y0.q0.f;
import com.facebook.y0.q0.h;
import com.facebook.y0.s0.c;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import m.y.d.l;
import m.y.d.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class g0 {
    public static final g0 a = new g0();
    private static final String b = "com.facebook.g0";
    private static final HashSet<p0> c = e0.c(p0.DEVELOPER_ERRORS);

    /* renamed from: d  reason: collision with root package name */
    private static Executor f1382d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile String f1383e;

    /* renamed from: f  reason: collision with root package name */
    private static volatile String f1384f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile String f1385g;

    /* renamed from: h  reason: collision with root package name */
    private static volatile Boolean f1386h;

    /* renamed from: i  reason: collision with root package name */
    private static AtomicLong f1387i = new AtomicLong(65536);

    /* renamed from: j  reason: collision with root package name */
    private static volatile boolean f1388j;

    /* renamed from: k  reason: collision with root package name */
    private static boolean f1389k;

    /* renamed from: l  reason: collision with root package name */
    private static Context f1390l;

    /* renamed from: m  reason: collision with root package name */
    private static int f1391m = 64206;

    /* renamed from: n  reason: collision with root package name */
    private static final ReentrantLock f1392n = new ReentrantLock();

    /* renamed from: o  reason: collision with root package name */
    private static String f1393o = m0.a();

    /* renamed from: p  reason: collision with root package name */
    public static boolean f1394p;

    /* renamed from: q  reason: collision with root package name */
    public static boolean f1395q;

    /* renamed from: r  reason: collision with root package name */
    public static boolean f1396r;

    /* renamed from: s  reason: collision with root package name */
    private static final AtomicBoolean f1397s = new AtomicBoolean(false);
    private static volatile String t = "instagram.com";
    private static volatile String u = "facebook.com";
    private static a v = n.a;
    private static boolean w;

    public interface a {
        j0 a(u uVar, String str, JSONObject jSONObject, j0.b bVar);
    }

    public interface b {
        void a();
    }

    static {
        m0 m0Var = m0.a;
    }

    private g0() {
    }

    public static final void H(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo.metaData != null) {
                    if (f1383e == null) {
                        Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                        if (obj instanceof String) {
                            String str = (String) obj;
                            Locale locale = Locale.ROOT;
                            l.c(locale, "ROOT");
                            String lowerCase = str.toLowerCase(locale);
                            l.c(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            if (p.t(lowerCase, "fb", false, 2, (Object) null)) {
                                str = str.substring(2);
                                l.c(str, "(this as java.lang.String).substring(startIndex)");
                            }
                            f1383e = str;
                        } else if (obj instanceof Number) {
                            throw new c0("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                        }
                    }
                    if (f1384f == null) {
                        f1384f = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
                    }
                    if (f1385g == null) {
                        f1385g = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
                    }
                    if (f1391m == 64206) {
                        f1391m = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
                    }
                    if (f1386h == null) {
                        f1386h = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    private final void I(Context context, String str) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                q e2 = q.f1478f.e(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                String j2 = l.j(str, "ping");
                long j3 = sharedPreferences.getLong(j2, 0);
                h hVar = h.a;
                JSONObject a2 = h.a(h.a.MOBILE_INSTALL_EVENT, e2, a0.b.d(context), p(context), context);
                s sVar = s.a;
                String format = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
                l.c(format, "java.lang.String.format(format, *args)");
                j0 a3 = v.a((u) null, format, a2, (j0.b) null);
                if (j3 == 0 && a3.j().b() == null) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong(j2, System.currentTimeMillis());
                    edit.apply();
                }
            } catch (JSONException e3) {
                throw new c0("An error occurred while publishing install.", e3);
            } catch (Exception e4) {
                try {
                    o0 o0Var = o0.a;
                    o0.d0("Facebook-publish", e4);
                } catch (Throwable th) {
                    com.facebook.internal.s0.n.a.b(th, this);
                }
            }
        }
    }

    public static final void J(Context context, String str) {
        Class<g0> cls = g0.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                l.d(context, "context");
                l.d(str, "applicationId");
                k().execute(new k(context.getApplicationContext(), str));
                com.facebook.internal.a0 a0Var = com.facebook.internal.a0.a;
                if (com.facebook.internal.a0.g(a0.b.OnDeviceEventProcessing)) {
                    c cVar = c.a;
                    if (c.b()) {
                        c.g(str, "com.facebook.sdk.attributionTracking");
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void K(Context context, String str) {
        l.d(str, "$applicationId");
        g0 g0Var = a;
        l.c(context, "applicationContext");
        g0Var.I(context, str);
    }

    public static final synchronized void L(Context context) {
        synchronized (g0.class) {
            l.d(context, "applicationContext");
            M(context, (b) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void M(android.content.Context r5, com.facebook.g0.b r6) {
        /*
            java.lang.Class<com.facebook.g0> r0 = com.facebook.g0.class
            monitor-enter(r0)
            java.lang.String r1 = "applicationContext"
            m.y.d.l.d(r5, r1)     // Catch:{ all -> 0x00fb }
            java.util.concurrent.atomic.AtomicBoolean r1 = f1397s     // Catch:{ all -> 0x00fb }
            boolean r2 = r1.get()     // Catch:{ all -> 0x00fb }
            if (r2 == 0) goto L_0x0018
            if (r6 != 0) goto L_0x0013
            goto L_0x0016
        L_0x0013:
            r6.a()     // Catch:{ all -> 0x00fb }
        L_0x0016:
            monitor-exit(r0)
            return
        L_0x0018:
            com.facebook.internal.p0 r2 = com.facebook.internal.p0.a     // Catch:{ all -> 0x00fb }
            r2 = 0
            com.facebook.internal.p0.e(r5, r2)     // Catch:{ all -> 0x00fb }
            com.facebook.internal.p0.f(r5, r2)     // Catch:{ all -> 0x00fb }
            android.content.Context r3 = r5.getApplicationContext()     // Catch:{ all -> 0x00fb }
            java.lang.String r4 = "applicationContext.applicationContext"
            m.y.d.l.c(r3, r4)     // Catch:{ all -> 0x00fb }
            f1390l = r3     // Catch:{ all -> 0x00fb }
            com.facebook.y0.a0$a r3 = com.facebook.y0.a0.b     // Catch:{ all -> 0x00fb }
            r3.d(r5)     // Catch:{ all -> 0x00fb }
            android.content.Context r5 = f1390l     // Catch:{ all -> 0x00fb }
            r3 = 0
            if (r5 == 0) goto L_0x00f5
            H(r5)     // Catch:{ all -> 0x00fb }
            java.lang.String r5 = f1383e     // Catch:{ all -> 0x00fb }
            r4 = 1
            if (r5 == 0) goto L_0x0047
            int r5 = r5.length()     // Catch:{ all -> 0x00fb }
            if (r5 != 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r5 = 0
            goto L_0x0048
        L_0x0047:
            r5 = 1
        L_0x0048:
            if (r5 != 0) goto L_0x00ed
            java.lang.String r5 = f1385g     // Catch:{ all -> 0x00fb }
            if (r5 == 0) goto L_0x0054
            int r5 = r5.length()     // Catch:{ all -> 0x00fb }
            if (r5 != 0) goto L_0x0055
        L_0x0054:
            r2 = 1
        L_0x0055:
            if (r2 != 0) goto L_0x00e5
            r1.set(r4)     // Catch:{ all -> 0x00fb }
            boolean r5 = f()     // Catch:{ all -> 0x00fb }
            if (r5 == 0) goto L_0x0063
            a()     // Catch:{ all -> 0x00fb }
        L_0x0063:
            android.content.Context r5 = f1390l     // Catch:{ all -> 0x00fb }
            if (r5 == 0) goto L_0x00df
            boolean r5 = r5 instanceof android.app.Application     // Catch:{ all -> 0x00fb }
            if (r5 == 0) goto L_0x0087
            com.facebook.x0 r5 = com.facebook.x0.a     // Catch:{ all -> 0x00fb }
            boolean r5 = com.facebook.x0.c()     // Catch:{ all -> 0x00fb }
            if (r5 == 0) goto L_0x0087
            com.facebook.y0.q0.f r5 = com.facebook.y0.q0.f.a     // Catch:{ all -> 0x00fb }
            android.content.Context r5 = f1390l     // Catch:{ all -> 0x00fb }
            if (r5 == 0) goto L_0x0081
            android.app.Application r5 = (android.app.Application) r5     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = f1383e     // Catch:{ all -> 0x00fb }
            com.facebook.y0.q0.f.x(r5, r1)     // Catch:{ all -> 0x00fb }
            goto L_0x0087
        L_0x0081:
            java.lang.String r5 = "applicationContext"
            m.y.d.l.n(r5)     // Catch:{ all -> 0x00fb }
            throw r3
        L_0x0087:
            com.facebook.internal.d0 r5 = com.facebook.internal.d0.a     // Catch:{ all -> 0x00fb }
            com.facebook.internal.d0.g()     // Catch:{ all -> 0x00fb }
            com.facebook.internal.j0 r5 = com.facebook.internal.j0.a     // Catch:{ all -> 0x00fb }
            com.facebook.internal.j0.x()     // Catch:{ all -> 0x00fb }
            com.facebook.internal.r$a r5 = com.facebook.internal.r.b     // Catch:{ all -> 0x00fb }
            android.content.Context r1 = f1390l     // Catch:{ all -> 0x00fb }
            if (r1 == 0) goto L_0x00d9
            r5.a(r1)     // Catch:{ all -> 0x00fb }
            com.facebook.internal.h0 r5 = new com.facebook.internal.h0     // Catch:{ all -> 0x00fb }
            com.facebook.m r1 = com.facebook.m.a     // Catch:{ all -> 0x00fb }
            r5.<init>(r1)     // Catch:{ all -> 0x00fb }
            com.facebook.internal.a0 r5 = com.facebook.internal.a0.a     // Catch:{ all -> 0x00fb }
            com.facebook.internal.a0$b r5 = com.facebook.internal.a0.b.Instrument     // Catch:{ all -> 0x00fb }
            com.facebook.f r1 = com.facebook.f.a     // Catch:{ all -> 0x00fb }
            com.facebook.internal.a0.a(r5, r1)     // Catch:{ all -> 0x00fb }
            com.facebook.internal.a0$b r5 = com.facebook.internal.a0.b.AppEvents     // Catch:{ all -> 0x00fb }
            com.facebook.j r1 = com.facebook.j.a     // Catch:{ all -> 0x00fb }
            com.facebook.internal.a0.a(r5, r1)     // Catch:{ all -> 0x00fb }
            com.facebook.internal.a0$b r5 = com.facebook.internal.a0.b.ChromeCustomTabsPrefetching     // Catch:{ all -> 0x00fb }
            com.facebook.l r1 = com.facebook.l.a     // Catch:{ all -> 0x00fb }
            com.facebook.internal.a0.a(r5, r1)     // Catch:{ all -> 0x00fb }
            com.facebook.internal.a0$b r5 = com.facebook.internal.a0.b.IgnoreAppSwitchToLoggedOut     // Catch:{ all -> 0x00fb }
            com.facebook.g r1 = com.facebook.g.a     // Catch:{ all -> 0x00fb }
            com.facebook.internal.a0.a(r5, r1)     // Catch:{ all -> 0x00fb }
            com.facebook.internal.a0$b r5 = com.facebook.internal.a0.b.BypassAppSwitch     // Catch:{ all -> 0x00fb }
            com.facebook.h r1 = com.facebook.h.a     // Catch:{ all -> 0x00fb }
            com.facebook.internal.a0.a(r5, r1)     // Catch:{ all -> 0x00fb }
            java.util.concurrent.FutureTask r5 = new java.util.concurrent.FutureTask     // Catch:{ all -> 0x00fb }
            com.facebook.i r1 = new com.facebook.i     // Catch:{ all -> 0x00fb }
            r1.<init>(r6)     // Catch:{ all -> 0x00fb }
            r5.<init>(r1)     // Catch:{ all -> 0x00fb }
            java.util.concurrent.Executor r6 = k()     // Catch:{ all -> 0x00fb }
            r6.execute(r5)     // Catch:{ all -> 0x00fb }
            monitor-exit(r0)
            return
        L_0x00d9:
            java.lang.String r5 = "applicationContext"
            m.y.d.l.n(r5)     // Catch:{ all -> 0x00fb }
            throw r3
        L_0x00df:
            java.lang.String r5 = "applicationContext"
            m.y.d.l.n(r5)     // Catch:{ all -> 0x00fb }
            throw r3
        L_0x00e5:
            com.facebook.c0 r5 = new com.facebook.c0     // Catch:{ all -> 0x00fb }
            java.lang.String r6 = "A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk."
            r5.<init>((java.lang.String) r6)     // Catch:{ all -> 0x00fb }
            throw r5     // Catch:{ all -> 0x00fb }
        L_0x00ed:
            com.facebook.c0 r5 = new com.facebook.c0     // Catch:{ all -> 0x00fb }
            java.lang.String r6 = "A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk."
            r5.<init>((java.lang.String) r6)     // Catch:{ all -> 0x00fb }
            throw r5     // Catch:{ all -> 0x00fb }
        L_0x00f5:
            java.lang.String r5 = "applicationContext"
            m.y.d.l.n(r5)     // Catch:{ all -> 0x00fb }
            throw r3
        L_0x00fb:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.g0.M(android.content.Context, com.facebook.g0$b):void");
    }

    /* access modifiers changed from: private */
    public static final File N() {
        Context context = f1390l;
        if (context != null) {
            return context.getCacheDir();
        }
        l.n("applicationContext");
        throw null;
    }

    /* access modifiers changed from: private */
    public static final void O(boolean z) {
        if (z) {
            j jVar = j.a;
            j.d();
        }
    }

    /* access modifiers changed from: private */
    public static final void P(boolean z) {
        if (z) {
            c0 c0Var = c0.a;
            c0.a();
        }
    }

    /* access modifiers changed from: private */
    public static final void Q(boolean z) {
        if (z) {
            f1394p = true;
        }
    }

    /* access modifiers changed from: private */
    public static final void R(boolean z) {
        if (z) {
            f1395q = true;
        }
    }

    /* access modifiers changed from: private */
    public static final void S(boolean z) {
        if (z) {
            f1396r = true;
        }
    }

    /* access modifiers changed from: private */
    public static final Void T(b bVar) {
        w.f1771f.e().j();
        s0.f1741d.a().d();
        if (u.f1749p.g()) {
            q0.b bVar2 = q0.f1727l;
            if (bVar2.b() == null) {
                bVar2.a();
            }
        }
        if (bVar != null) {
            bVar.a();
        }
        a0.a aVar = com.facebook.y0.a0.b;
        aVar.g(c(), f1383e);
        x0 x0Var = x0.a;
        x0.k();
        Context applicationContext = c().getApplicationContext();
        l.c(applicationContext, "getApplicationContext().applicationContext");
        aVar.h(applicationContext).a();
        return null;
    }

    public static final void U(boolean z) {
        x0 x0Var = x0.a;
        x0.o(z);
        if (z) {
            f fVar = f.a;
            f.x((Application) c(), d());
        }
    }

    public static final void V(String[] strArr, int i2, int i3) {
        Class<g0> cls = g0.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            if (strArr == null) {
                try {
                    strArr = new String[0];
                } catch (Throwable th) {
                    com.facebook.internal.s0.n.a.b(th, cls);
                    return;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("data_processing_options", new JSONArray(f.s(strArr)));
                jSONObject.put("data_processing_options_country", i2);
                jSONObject.put("data_processing_options_state", i3);
                Context context = f1390l;
                if (context != null) {
                    context.getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).edit().putString("data_processing_options", jSONObject.toString()).apply();
                } else {
                    l.n("applicationContext");
                    throw null;
                }
            } catch (JSONException unused) {
            }
        }
    }

    public static final void a() {
        w = true;
    }

    public static final boolean b() {
        x0 x0Var = x0.a;
        return x0.a();
    }

    public static final Context c() {
        p0 p0Var = p0.a;
        p0.l();
        Context context = f1390l;
        if (context != null) {
            return context;
        }
        l.n("applicationContext");
        throw null;
    }

    public static final String d() {
        p0 p0Var = p0.a;
        p0.l();
        String str = f1383e;
        if (str != null) {
            return str;
        }
        throw new c0("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final String e() {
        p0 p0Var = p0.a;
        p0.l();
        return f1384f;
    }

    public static final boolean f() {
        x0 x0Var = x0.a;
        return x0.b();
    }

    public static final boolean g() {
        x0 x0Var = x0.a;
        return x0.c();
    }

    public static final int h() {
        p0 p0Var = p0.a;
        p0.l();
        return f1391m;
    }

    public static final String i() {
        p0 p0Var = p0.a;
        p0.l();
        String str = f1385g;
        if (str != null) {
            return str;
        }
        throw new c0("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    public static final boolean j() {
        x0 x0Var = x0.a;
        return x0.d();
    }

    /* JADX INFO: finally extract failed */
    public static final Executor k() {
        ReentrantLock reentrantLock = f1392n;
        reentrantLock.lock();
        try {
            if (f1382d == null) {
                f1382d = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            m.s sVar = m.s.a;
            reentrantLock.unlock();
            Executor executor = f1382d;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String l() {
        return u;
    }

    public static final String m() {
        o0 o0Var = o0.a;
        String str = b;
        s sVar = s.a;
        String format = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{f1393o}, 1));
        l.c(format, "java.lang.String.format(format, *args)");
        o0.e0(str, format);
        return f1393o;
    }

    public static final String n() {
        u e2 = u.f1749p.e();
        String h2 = e2 != null ? e2.h() : null;
        o0 o0Var = o0.a;
        return o0.z(h2);
    }

    public static final String o() {
        return t;
    }

    public static final boolean p(Context context) {
        l.d(context, "context");
        p0 p0Var = p0.a;
        p0.l();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static final long q() {
        p0 p0Var = p0.a;
        p0.l();
        return f1387i.get();
    }

    public static final String r() {
        return "14.1.1";
    }

    /* access modifiers changed from: private */
    public static final j0 s(u uVar, String str, JSONObject jSONObject, j0.b bVar) {
        return j0.f1546n.A(uVar, str, jSONObject, bVar);
    }

    public static final boolean t() {
        return f1388j;
    }

    public static final synchronized boolean u() {
        boolean z;
        synchronized (g0.class) {
            z = w;
        }
        return z;
    }

    public static final boolean v() {
        return f1397s.get();
    }

    public static final boolean w() {
        return f1389k;
    }

    public static final boolean x(p0 p0Var) {
        boolean z;
        l.d(p0Var, "behavior");
        HashSet<p0> hashSet = c;
        synchronized (hashSet) {
            z = t() && hashSet.contains(p0Var);
        }
        return z;
    }
}
