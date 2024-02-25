package com.facebook.internal.s0.l;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import com.facebook.g0;
import com.facebook.internal.s0.i;
import com.facebook.internal.s0.k;
import com.facebook.internal.s0.n.a;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import m.y.d.l;

public final class d {
    public static final d a = new d();
    private static final int b = Process.myUid();
    private static final ScheduledExecutorService c = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: d  reason: collision with root package name */
    private static String f1517d = "";

    /* renamed from: e  reason: collision with root package name */
    private static final Runnable f1518e = a.f1516e;

    private d() {
    }

    /* access modifiers changed from: private */
    public static final void a() {
        Class<d> cls = d.class;
        if (!a.d(cls)) {
            try {
                g0 g0Var = g0.a;
                Object systemService = g0.c().getSystemService("activity");
                if (systemService != null) {
                    b((ActivityManager) systemService);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            } catch (Exception unused) {
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    public static final void b(ActivityManager activityManager) {
        Class<d> cls = d.class;
        if (!a.d(cls) && activityManager != null) {
            try {
                List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
                if (processesInErrorState != null) {
                    for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                        if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == b) {
                            Thread thread = Looper.getMainLooper().getThread();
                            l.c(thread, "getMainLooper().thread");
                            k kVar = k.a;
                            String d2 = k.d(thread);
                            if (!l.a(d2, f1517d)) {
                                if (k.g(thread)) {
                                    f1517d = d2;
                                    i.a aVar = i.a.a;
                                    i.a.a(processErrorStateInfo.shortMsg, d2).g();
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    public static final void d() {
        Class<d> cls = d.class;
        if (!a.d(cls)) {
            try {
                c.scheduleAtFixedRate(f1518e, 0, (long) 500, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }
}
