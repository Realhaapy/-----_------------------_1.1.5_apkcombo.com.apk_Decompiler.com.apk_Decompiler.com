package com.facebook.y0.o0;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.g0;
import com.facebook.y0.q0.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import m.y.d.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class f {
    public static final f a = new f();
    private static final String b = "com.facebook.y0.o0.f";
    private static final AtomicBoolean c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private static Boolean f2053d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f2054e;

    /* renamed from: f  reason: collision with root package name */
    private static ServiceConnection f2055f;

    /* renamed from: g  reason: collision with root package name */
    private static Application.ActivityLifecycleCallbacks f2056g;

    /* renamed from: h  reason: collision with root package name */
    private static Intent f2057h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static Object f2058i;

    public static final class a implements ServiceConnection {
        a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            l.d(componentName, "name");
            l.d(iBinder, "service");
            f fVar = f.a;
            i iVar = i.a;
            g0 g0Var = g0.a;
            f.f2058i = i.a(g0.c(), iBinder);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            l.d(componentName, "name");
        }
    }

    public static final class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        /* access modifiers changed from: private */
        public static final void c() {
            g0 g0Var = g0.a;
            Context c = g0.c();
            i iVar = i.a;
            ArrayList<String> i2 = i.i(c, f.f2058i);
            f fVar = f.a;
            fVar.f(c, i2, false);
            fVar.f(c, i.j(c, f.f2058i), true);
        }

        /* access modifiers changed from: private */
        public static final void d() {
            g0 g0Var = g0.a;
            Context c = g0.c();
            i iVar = i.a;
            ArrayList<String> i2 = i.i(c, f.f2058i);
            if (i2.isEmpty()) {
                i2 = i.g(c, f.f2058i);
            }
            f.a.f(c, i2, false);
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            l.d(activity, "activity");
        }

        public void onActivityDestroyed(Activity activity) {
            l.d(activity, "activity");
        }

        public void onActivityPaused(Activity activity) {
            l.d(activity, "activity");
        }

        public void onActivityResumed(Activity activity) {
            l.d(activity, "activity");
            try {
                g0 g0Var = g0.a;
                g0.k().execute(a.f2047e);
            } catch (Exception unused) {
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            l.d(activity, "activity");
            l.d(bundle, "outState");
        }

        public void onActivityStarted(Activity activity) {
            l.d(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            l.d(activity, "activity");
            try {
                if (l.a(f.f2054e, Boolean.TRUE) && l.a(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                    g0 g0Var = g0.a;
                    g0.k().execute(b.f2048e);
                }
            } catch (Exception unused) {
            }
        }
    }

    private f() {
    }

    private final void e() {
        if (f2053d == null) {
            m mVar = m.a;
            boolean z = true;
            Boolean valueOf = Boolean.valueOf(m.a("com.android.vending.billing.IInAppBillingService$Stub") != null);
            f2053d = valueOf;
            if (!l.a(valueOf, Boolean.FALSE)) {
                if (m.a("com.android.billingclient.api.ProxyBillingActivity") == null) {
                    z = false;
                }
                f2054e = Boolean.valueOf(z);
                i iVar = i.a;
                i.b();
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                l.c(intent, "Intent(\"com.android.vending.billing.InAppBillingService.BIND\")\n            .setPackage(\"com.android.vending\")");
                f2057h = intent;
                f2055f = new a();
                f2056g = new b();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void f(Context context, ArrayList<String> arrayList, boolean z) {
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    String string = new JSONObject(next).getString("productId");
                    l.c(string, "sku");
                    l.c(next, "purchase");
                    hashMap.put(string, next);
                    arrayList2.add(string);
                } catch (JSONException e2) {
                    Log.e(b, "Error parsing in-app purchase data.", e2);
                }
            }
            i iVar = i.a;
            for (Map.Entry next2 : i.k(context, arrayList2, f2058i, z).entrySet()) {
                String str = (String) next2.getValue();
                String str2 = (String) hashMap.get((String) next2.getKey());
                if (str2 != null) {
                    i iVar2 = i.a;
                    i.f(str2, str, z);
                }
            }
        }
    }

    public static final void g() {
        f fVar = a;
        fVar.e();
        if (!l.a(f2053d, Boolean.FALSE)) {
            i iVar = i.a;
            if (i.c()) {
                fVar.h();
            }
        }
    }

    private final void h() {
        if (c.compareAndSet(false, true)) {
            g0 g0Var = g0.a;
            Context c2 = g0.c();
            if (c2 instanceof Application) {
                Application application = (Application) c2;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f2056g;
                if (activityLifecycleCallbacks != null) {
                    application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                    Intent intent = f2057h;
                    if (intent != null) {
                        ServiceConnection serviceConnection = f2055f;
                        if (serviceConnection != null) {
                            c2.bindService(intent, serviceConnection, 1);
                        } else {
                            l.n("serviceConnection");
                            throw null;
                        }
                    } else {
                        l.n("intent");
                        throw null;
                    }
                } else {
                    l.n("callbacks");
                    throw null;
                }
            }
        }
    }
}
