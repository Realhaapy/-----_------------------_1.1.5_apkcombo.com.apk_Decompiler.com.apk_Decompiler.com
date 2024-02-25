package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.internal.c0;
import com.facebook.internal.d0;
import com.facebook.internal.o0;
import com.facebook.internal.q;
import com.facebook.j0;
import com.facebook.y0.g0;
import java.util.concurrent.atomic.AtomicBoolean;
import m.y.d.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class x0 {
    public static final x0 a = new x0();
    private static final String b;
    private static final AtomicBoolean c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicBoolean f1794d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private static final a f1795e = new a(true, "com.facebook.sdk.AutoInitEnabled");

    /* renamed from: f  reason: collision with root package name */
    private static final a f1796f = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* renamed from: g  reason: collision with root package name */
    private static final a f1797g = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* renamed from: h  reason: collision with root package name */
    private static final a f1798h = new a(false, "auto_event_setup_enabled");

    /* renamed from: i  reason: collision with root package name */
    private static final a f1799i = new a(true, "com.facebook.sdk.MonitorEnabled");

    /* renamed from: j  reason: collision with root package name */
    private static SharedPreferences f1800j;

    private static final class a {
        private boolean a;
        private String b;
        private Boolean c;

        /* renamed from: d  reason: collision with root package name */
        private long f1801d;

        public a(boolean z, String str) {
            l.d(str, "key");
            this.a = z;
            this.b = str;
        }

        public final boolean a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final long c() {
            return this.f1801d;
        }

        public final Boolean d() {
            return this.c;
        }

        public final boolean e() {
            Boolean bool = this.c;
            return bool == null ? this.a : bool.booleanValue();
        }

        public final void f(long j2) {
            this.f1801d = j2;
        }

        public final void g(Boolean bool) {
            this.c = bool;
        }
    }

    static {
        String name = x0.class.getName();
        l.c(name, "UserSettingsManager::class.java.name");
        b = name;
    }

    private x0() {
    }

    public static final boolean a() {
        Class<x0> cls = x0.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return false;
        }
        try {
            a.g();
            return f1797g.e();
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return false;
        }
    }

    public static final boolean b() {
        Class<x0> cls = x0.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return false;
        }
        try {
            a.g();
            return f1795e.e();
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return false;
        }
    }

    public static final boolean c() {
        Class<x0> cls = x0.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return false;
        }
        try {
            a.g();
            return f1796f.e();
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return false;
        }
    }

    public static final boolean d() {
        Class<x0> cls = x0.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return false;
        }
        try {
            a.g();
            return f1798h.e();
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return false;
        }
    }

    private final void e() {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                a aVar = f1798h;
                n(aVar);
                long currentTimeMillis = System.currentTimeMillis();
                if (aVar.d() == null || currentTimeMillis - aVar.c() >= 604800000) {
                    aVar.g((Boolean) null);
                    aVar.f(0);
                    if (f1794d.compareAndSet(false, true)) {
                        g0 g0Var = g0.a;
                        g0.k().execute(new t(currentTimeMillis));
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void f(long j2) {
        Class<x0> cls = x0.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                if (f1797g.e()) {
                    d0 d0Var = d0.a;
                    g0 g0Var = g0.a;
                    c0 n2 = d0.n(g0.d(), false);
                    if (n2 != null && n2.b()) {
                        q e2 = q.f1478f.e(g0.c());
                        String h2 = (e2 == null || e2.h() == null) ? null : e2.h();
                        if (h2 != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("advertiser_id", h2);
                            bundle.putString("fields", "auto_event_setup_enabled");
                            j0 x = j0.f1546n.x((u) null, "app", (j0.b) null);
                            x.G(bundle);
                            JSONObject c2 = x.j().c();
                            if (c2 != null) {
                                a aVar = f1798h;
                                aVar.g(Boolean.valueOf(c2.optBoolean("auto_event_setup_enabled", false)));
                                aVar.f(j2);
                                a.q(aVar);
                            }
                        }
                    }
                }
                f1794d.set(false);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    private final void g() {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                g0 g0Var = g0.a;
                if (g0.v() && c.compareAndSet(false, true)) {
                    SharedPreferences sharedPreferences = g0.c().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                    l.c(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
                    f1800j = sharedPreferences;
                    h(f1796f, f1797g, f1795e);
                    e();
                    m();
                    l();
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    private final void h(a... aVarArr) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            int i2 = 0;
            try {
                int length = aVarArr.length;
                while (i2 < length) {
                    a aVar = aVarArr[i2];
                    i2++;
                    if (aVar == f1798h) {
                        e();
                    } else if (aVar.d() == null) {
                        n(aVar);
                        if (aVar.d() == null) {
                            j(aVar);
                        }
                    } else {
                        q(aVar);
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    private final void j(a aVar) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                p();
                g0 g0Var = g0.a;
                Context c2 = g0.c();
                ApplicationInfo applicationInfo = c2.getPackageManager().getApplicationInfo(c2.getPackageName(), 128);
                if ((applicationInfo == null ? null : applicationInfo.metaData) != null && applicationInfo.metaData.containsKey(aVar.b())) {
                    aVar.g(Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.b(), aVar.a())));
                }
            } catch (PackageManager.NameNotFoundException e2) {
                o0 o0Var = o0.a;
                o0.d0(b, e2);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public static final void k() {
        Class<x0> cls = x0.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                g0 g0Var = g0.a;
                Context c2 = g0.c();
                ApplicationInfo applicationInfo = c2.getPackageManager().getApplicationInfo(c2.getPackageName(), 128);
                if ((applicationInfo == null ? null : applicationInfo.metaData) != null && applicationInfo.metaData.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                    g0 g0Var2 = new g0(c2);
                    Bundle bundle = new Bundle();
                    o0 o0Var = o0.a;
                    if (!o0.N()) {
                        bundle.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                        Log.w(b, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                    }
                    g0Var2.d("fb_auto_applink", bundle);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    private final void l() {
        int i2;
        int i3;
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                if (c.get()) {
                    g0 g0Var = g0.a;
                    if (g0.v()) {
                        Context c2 = g0.c();
                        int i4 = 0;
                        int i5 = ((f1795e.e() ? 1 : 0) << 0) | 0 | ((f1796f.e() ? 1 : 0) << 1) | ((f1797g.e() ? 1 : 0) << 2) | ((f1799i.e() ? 1 : 0) << 3);
                        SharedPreferences sharedPreferences = f1800j;
                        Bundle bundle = null;
                        if (sharedPreferences != null) {
                            int i6 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                            if (i6 != i5) {
                                SharedPreferences sharedPreferences2 = f1800j;
                                if (sharedPreferences2 != null) {
                                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i5).apply();
                                    try {
                                        ApplicationInfo applicationInfo = c2.getPackageManager().getApplicationInfo(c2.getPackageName(), 128);
                                        if (applicationInfo != null) {
                                            bundle = applicationInfo.metaData;
                                        }
                                        if (bundle != null) {
                                            String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                                            boolean[] zArr = {true, true, true, true};
                                            int i7 = 0;
                                            i3 = 0;
                                            i2 = 0;
                                            while (true) {
                                                int i8 = i7 + 1;
                                                try {
                                                    i3 |= (applicationInfo.metaData.containsKey(strArr[i7]) ? 1 : 0) << i7;
                                                    i2 |= (applicationInfo.metaData.getBoolean(strArr[i7], zArr[i7]) ? 1 : 0) << i7;
                                                    if (i8 > 3) {
                                                        break;
                                                    }
                                                    i7 = i8;
                                                } catch (PackageManager.NameNotFoundException unused) {
                                                    i4 = i2;
                                                    i2 = i4;
                                                    i4 = i3;
                                                    g0 g0Var2 = new g0(c2);
                                                    Bundle bundle2 = new Bundle();
                                                    bundle2.putInt("usage", i4);
                                                    bundle2.putInt("initial", i2);
                                                    bundle2.putInt("previous", i6);
                                                    bundle2.putInt("current", i5);
                                                    g0Var2.b(bundle2);
                                                }
                                            }
                                            i4 = i3;
                                            g0 g0Var22 = new g0(c2);
                                            Bundle bundle22 = new Bundle();
                                            bundle22.putInt("usage", i4);
                                            bundle22.putInt("initial", i2);
                                            bundle22.putInt("previous", i6);
                                            bundle22.putInt("current", i5);
                                            g0Var22.b(bundle22);
                                        }
                                        i2 = 0;
                                        g0 g0Var222 = new g0(c2);
                                        Bundle bundle222 = new Bundle();
                                        bundle222.putInt("usage", i4);
                                        bundle222.putInt("initial", i2);
                                        bundle222.putInt("previous", i6);
                                        bundle222.putInt("current", i5);
                                        g0Var222.b(bundle222);
                                    } catch (PackageManager.NameNotFoundException unused2) {
                                        i3 = 0;
                                        i2 = i4;
                                        i4 = i3;
                                        g0 g0Var2222 = new g0(c2);
                                        Bundle bundle2222 = new Bundle();
                                        bundle2222.putInt("usage", i4);
                                        bundle2222.putInt("initial", i2);
                                        bundle2222.putInt("previous", i6);
                                        bundle2222.putInt("current", i5);
                                        g0Var2222.b(bundle2222);
                                    }
                                } else {
                                    l.n("userSettingPref");
                                    throw null;
                                }
                            }
                        } else {
                            l.n("userSettingPref");
                            throw null;
                        }
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    private final void m() {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                g0 g0Var = g0.a;
                Context c2 = g0.c();
                ApplicationInfo applicationInfo = c2.getPackageManager().getApplicationInfo(c2.getPackageName(), 128);
                if ((applicationInfo == null ? null : applicationInfo.metaData) != null) {
                    if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled")) {
                        Log.w(b, "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                    }
                    if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                        Log.w(b, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                    }
                    if (!a()) {
                        Log.w(b, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    private final void n(a aVar) {
        String str = "";
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                p();
                SharedPreferences sharedPreferences = f1800j;
                if (sharedPreferences != null) {
                    String string = sharedPreferences.getString(aVar.b(), str);
                    if (string != null) {
                        str = string;
                    }
                    if (str.length() > 0) {
                        JSONObject jSONObject = new JSONObject(str);
                        aVar.g(Boolean.valueOf(jSONObject.getBoolean("value")));
                        aVar.f(jSONObject.getLong("last_timestamp"));
                        return;
                    }
                    return;
                }
                l.n("userSettingPref");
                throw null;
            } catch (JSONException e2) {
                o0 o0Var = o0.a;
                o0.d0(b, e2);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public static final void o(boolean z) {
        Class<x0> cls = x0.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                a aVar = f1796f;
                aVar.g(Boolean.valueOf(z));
                aVar.f(System.currentTimeMillis());
                if (c.get()) {
                    a.q(aVar);
                } else {
                    a.g();
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    private final void p() {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                if (!c.get()) {
                    throw new h0("The UserSettingManager has not been initialized successfully");
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    private final void q(a aVar) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                p();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", aVar.d());
                jSONObject.put("last_timestamp", aVar.c());
                SharedPreferences sharedPreferences = f1800j;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString(aVar.b(), jSONObject.toString()).apply();
                    l();
                    return;
                }
                l.n("userSettingPref");
                throw null;
            } catch (Exception e2) {
                o0 o0Var = o0.a;
                o0.d0(b, e2);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }
}
