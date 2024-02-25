package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: i  reason: collision with root package name */
    private static final c f2400i = new c();

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f2401e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f2402f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<a> f2403g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private boolean f2404h = false;

    public interface a {
        void a(boolean z);
    }

    private c() {
    }

    public static c b() {
        return f2400i;
    }

    public static void c(Application application) {
        c cVar = f2400i;
        synchronized (cVar) {
            if (!cVar.f2404h) {
                application.registerActivityLifecycleCallbacks(cVar);
                application.registerComponentCallbacks(cVar);
                cVar.f2404h = true;
            }
        }
    }

    private final void f(boolean z) {
        synchronized (f2400i) {
            Iterator<a> it = this.f2403g.iterator();
            while (it.hasNext()) {
                it.next().a(z);
            }
        }
    }

    public void a(a aVar) {
        synchronized (f2400i) {
            this.f2403g.add(aVar);
        }
    }

    public boolean d() {
        return this.f2401e.get();
    }

    @TargetApi(16)
    public boolean e(boolean z) {
        if (!this.f2402f.get()) {
            if (!j.b()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f2402f.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f2401e.set(true);
            }
        }
        return d();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f2401e.compareAndSet(true, false);
        this.f2402f.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f2401e.compareAndSet(true, false);
        this.f2402f.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i2) {
        if (i2 == 20 && this.f2401e.compareAndSet(false, true)) {
            this.f2402f.set(true);
            f(true);
        }
    }
}
