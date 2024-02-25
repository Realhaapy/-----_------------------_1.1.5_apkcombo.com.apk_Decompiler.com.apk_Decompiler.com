package com.facebook.y0.q0;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.g0;
import com.facebook.internal.a0;
import com.facebook.internal.c0;
import com.facebook.internal.d0;
import com.facebook.internal.i0;
import com.facebook.internal.o0;
import com.facebook.p0;
import com.facebook.y0.a0;
import com.facebook.y0.k0.c;
import com.facebook.y0.m0.i;
import com.facebook.y0.o0.k;
import com.facebook.y0.u0.h;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import m.s;
import m.y.d.g;
import m.y.d.l;

public final class f {
    public static final f a = new f();
    /* access modifiers changed from: private */
    public static final String b;
    private static final ScheduledExecutorService c = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: d  reason: collision with root package name */
    private static volatile ScheduledFuture<?> f2095d;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f2096e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicInteger f2097f = new AtomicInteger(0);

    /* renamed from: g  reason: collision with root package name */
    private static volatile m f2098g;

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicBoolean f2099h = new AtomicBoolean(false);

    /* renamed from: i  reason: collision with root package name */
    private static String f2100i;

    /* renamed from: j  reason: collision with root package name */
    private static long f2101j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static int f2102k;

    /* renamed from: l  reason: collision with root package name */
    private static WeakReference<Activity> f2103l;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            l.d(activity, "activity");
            i0.f1448e.b(p0.APP_EVENTS, f.b, "onActivityCreated");
            g gVar = g.a;
            g.a();
            f fVar = f.a;
            f.p(activity);
        }

        public void onActivityDestroyed(Activity activity) {
            l.d(activity, "activity");
            i0.f1448e.b(p0.APP_EVENTS, f.b, "onActivityDestroyed");
            f.a.r(activity);
        }

        public void onActivityPaused(Activity activity) {
            l.d(activity, "activity");
            i0.f1448e.b(p0.APP_EVENTS, f.b, "onActivityPaused");
            g gVar = g.a;
            g.a();
            f.a.s(activity);
        }

        public void onActivityResumed(Activity activity) {
            l.d(activity, "activity");
            i0.f1448e.b(p0.APP_EVENTS, f.b, "onActivityResumed");
            g gVar = g.a;
            g.a();
            f fVar = f.a;
            f.v(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            l.d(activity, "activity");
            l.d(bundle, "outState");
            i0.f1448e.b(p0.APP_EVENTS, f.b, "onActivitySaveInstanceState");
        }

        public void onActivityStarted(Activity activity) {
            l.d(activity, "activity");
            f fVar = f.a;
            f.f2102k = f.f2102k + 1;
            i0.f1448e.b(p0.APP_EVENTS, f.b, "onActivityStarted");
        }

        public void onActivityStopped(Activity activity) {
            l.d(activity, "activity");
            i0.f1448e.b(p0.APP_EVENTS, f.b, "onActivityStopped");
            a0.b.i();
            f fVar = f.a;
            f.f2102k = f.f2102k - 1;
        }
    }

    static {
        String canonicalName = f.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        b = canonicalName;
    }

    private f() {
    }

    private final void f() {
        synchronized (f2096e) {
            if (f2095d != null) {
                ScheduledFuture<?> scheduledFuture = f2095d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
            }
            f2095d = null;
            s sVar = s.a;
        }
    }

    public static final Activity g() {
        WeakReference<Activity> weakReference = f2103l;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public static final UUID h() {
        m mVar;
        if (f2098g == null || (mVar = f2098g) == null) {
            return null;
        }
        return mVar.d();
    }

    private final int i() {
        d0 d0Var = d0.a;
        g0 g0Var = g0.a;
        c0 c2 = d0.c(g0.d());
        if (c2 != null) {
            return c2.i();
        }
        j jVar = j.a;
        return j.a();
    }

    public static final boolean j() {
        return f2102k == 0;
    }

    public static final void p(Activity activity) {
        c.execute(c.f2092e);
    }

    /* access modifiers changed from: private */
    public static final void q() {
        if (f2098g == null) {
            f2098g = m.f2108g.b();
        }
    }

    /* access modifiers changed from: private */
    public final void r(Activity activity) {
        i iVar = i.a;
        i.j(activity);
    }

    /* access modifiers changed from: private */
    public final void s(Activity activity) {
        AtomicInteger atomicInteger = f2097f;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(b, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        f();
        long currentTimeMillis = System.currentTimeMillis();
        o0 o0Var = o0.a;
        String r2 = o0.r(activity);
        i iVar = i.a;
        i.k(activity);
        c.execute(new a(currentTimeMillis, r2));
    }

    /* access modifiers changed from: private */
    public static final void t(long j2, String str) {
        l.d(str, "$activityName");
        if (f2098g == null) {
            f2098g = new m(Long.valueOf(j2), (Long) null, (UUID) null, 4, (g) null);
        }
        m mVar = f2098g;
        if (mVar != null) {
            mVar.k(Long.valueOf(j2));
        }
        if (f2097f.get() <= 0) {
            e eVar = new e(j2, str);
            synchronized (f2096e) {
                f2095d = c.schedule(eVar, (long) a.i(), TimeUnit.SECONDS);
                s sVar = s.a;
            }
        }
        long j3 = f2101j;
        long j4 = 0;
        if (j3 > 0) {
            j4 = (j2 - j3) / ((long) 1000);
        }
        i iVar = i.a;
        i.e(str, j4);
        m mVar2 = f2098g;
        if (mVar2 != null) {
            mVar2.m();
        }
    }

    /* access modifiers changed from: private */
    public static final void u(long j2, String str) {
        l.d(str, "$activityName");
        if (f2098g == null) {
            f2098g = new m(Long.valueOf(j2), (Long) null, (UUID) null, 4, (g) null);
        }
        if (f2097f.get() <= 0) {
            n nVar = n.a;
            n.e(str, f2098g, f2100i);
            m.f2108g.a();
            f2098g = null;
        }
        synchronized (f2096e) {
            f2095d = null;
            s sVar = s.a;
        }
    }

    public static final void v(Activity activity) {
        l.d(activity, "activity");
        f fVar = a;
        f2103l = new WeakReference<>(activity);
        f2097f.incrementAndGet();
        fVar.f();
        long currentTimeMillis = System.currentTimeMillis();
        f2101j = currentTimeMillis;
        o0 o0Var = o0.a;
        String r2 = o0.r(activity);
        i iVar = i.a;
        i.l(activity);
        c cVar = c.a;
        c.d(activity);
        h hVar = h.a;
        h.h(activity);
        k kVar = k.a;
        k.b();
        c.execute(new b(currentTimeMillis, r2, activity.getApplicationContext()));
    }

    /* access modifiers changed from: private */
    public static final void w(long j2, String str, Context context) {
        m mVar;
        l.d(str, "$activityName");
        m mVar2 = f2098g;
        Long e2 = mVar2 == null ? null : mVar2.e();
        if (f2098g == null) {
            f2098g = new m(Long.valueOf(j2), (Long) null, (UUID) null, 4, (g) null);
            n nVar = n.a;
            String str2 = f2100i;
            l.c(context, "appContext");
            n.c(str, (o) null, str2, context);
        } else if (e2 != null) {
            long longValue = j2 - e2.longValue();
            if (longValue > ((long) (a.i() * 1000))) {
                n nVar2 = n.a;
                n.e(str, f2098g, f2100i);
                String str3 = f2100i;
                l.c(context, "appContext");
                n.c(str, (o) null, str3, context);
                f2098g = new m(Long.valueOf(j2), (Long) null, (UUID) null, 4, (g) null);
            } else if (longValue > 1000 && (mVar = f2098g) != null) {
                mVar.h();
            }
        }
        m mVar3 = f2098g;
        if (mVar3 != null) {
            mVar3.k(Long.valueOf(j2));
        }
        m mVar4 = f2098g;
        if (mVar4 != null) {
            mVar4.m();
        }
    }

    public static final void x(Application application, String str) {
        l.d(application, "application");
        if (f2099h.compareAndSet(false, true)) {
            com.facebook.internal.a0 a0Var = com.facebook.internal.a0.a;
            com.facebook.internal.a0.a(a0.b.CodelessEvents, d.a);
            f2100i = str;
            application.registerActivityLifecycleCallbacks(new a());
        }
    }

    /* access modifiers changed from: private */
    public static final void y(boolean z) {
        if (z) {
            i iVar = i.a;
            i.d();
            return;
        }
        i iVar2 = i.a;
        i.c();
    }
}
