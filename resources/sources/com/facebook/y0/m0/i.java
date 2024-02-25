package com.facebook.y0.m0;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.facebook.g0;
import com.facebook.internal.c0;
import com.facebook.internal.d0;
import com.facebook.internal.o0;
import com.facebook.internal.q;
import com.facebook.internal.s0.n.a;
import com.facebook.j0;
import com.facebook.u;
import com.facebook.y0.q0.g;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import m.y.d.l;
import m.y.d.s;
import org.json.JSONArray;
import org.json.JSONObject;

public final class i {
    public static final i a = new i();
    private static final m b = new m();
    private static SensorManager c;

    /* renamed from: d  reason: collision with root package name */
    private static l f1998d;

    /* renamed from: e  reason: collision with root package name */
    private static String f1999e;

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicBoolean f2000f = new AtomicBoolean(true);

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicBoolean f2001g = new AtomicBoolean(false);

    /* renamed from: h  reason: collision with root package name */
    private static volatile boolean f2002h;

    private i() {
    }

    private final void a(String str) {
        if (!a.d(this)) {
            try {
                if (!f2002h) {
                    f2002h = true;
                    g0 g0Var = g0.a;
                    g0.k().execute(new b(str));
                }
            } catch (Throwable th) {
                a.b(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void b(String str) {
        String str2 = "0";
        Class<i> cls = i.class;
        if (!a.d(cls)) {
            try {
                Bundle bundle = new Bundle();
                g0 g0Var = g0.a;
                q e2 = q.f1478f.e(g0.c());
                JSONArray jSONArray = new JSONArray();
                String str3 = Build.MODEL;
                if (str3 == null) {
                    str3 = "";
                }
                jSONArray.put(str3);
                if ((e2 == null ? null : e2.h()) != null) {
                    jSONArray.put(e2.h());
                } else {
                    jSONArray.put("");
                }
                jSONArray.put(str2);
                g gVar = g.a;
                if (g.f()) {
                    str2 = "1";
                }
                jSONArray.put(str2);
                o0 o0Var = o0.a;
                Locale w = o0.w();
                jSONArray.put(w.getLanguage() + '_' + w.getCountry());
                String jSONArray2 = jSONArray.toString();
                l.c(jSONArray2, "extInfoArray.toString()");
                bundle.putString("device_session_id", e());
                bundle.putString("extinfo", jSONArray2);
                j0.c cVar = j0.f1546n;
                s sVar = s.a;
                boolean z = true;
                String format = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1));
                l.c(format, "java.lang.String.format(locale, format, *args)");
                JSONObject c2 = cVar.B((u) null, format, bundle, (j0.b) null).j().c();
                AtomicBoolean atomicBoolean = f2001g;
                if (c2 == null || !c2.optBoolean("is_app_indexing_enabled", false)) {
                    z = false;
                }
                atomicBoolean.set(z);
                if (!atomicBoolean.get()) {
                    f1999e = null;
                } else {
                    l lVar = f1998d;
                    if (lVar != null) {
                        lVar.h();
                    }
                }
                f2002h = false;
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    public static final void c() {
        Class<i> cls = i.class;
        if (!a.d(cls)) {
            try {
                f2000f.set(false);
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    public static final void d() {
        Class<i> cls = i.class;
        if (!a.d(cls)) {
            try {
                f2000f.set(true);
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    public static final String e() {
        Class<i> cls = i.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            if (f1999e == null) {
                f1999e = UUID.randomUUID().toString();
            }
            String str = f1999e;
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    public static final boolean f() {
        Class<i> cls = i.class;
        if (a.d(cls)) {
            return false;
        }
        try {
            return f2001g.get();
        } catch (Throwable th) {
            a.b(th, cls);
            return false;
        }
    }

    private final boolean g() {
        boolean d2 = a.d(this);
        return false;
    }

    public static final void j(Activity activity) {
        Class<i> cls = i.class;
        if (!a.d(cls)) {
            try {
                l.d(activity, "activity");
                j.f2003f.a().e(activity);
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    public static final void k(Activity activity) {
        Class<i> cls = i.class;
        if (!a.d(cls)) {
            try {
                l.d(activity, "activity");
                if (f2000f.get()) {
                    j.f2003f.a().h(activity);
                    l lVar = f1998d;
                    if (lVar != null) {
                        lVar.l();
                    }
                    SensorManager sensorManager = c;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(b);
                    }
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    public static final void l(Activity activity) {
        Class<i> cls = i.class;
        if (!a.d(cls)) {
            try {
                l.d(activity, "activity");
                if (f2000f.get()) {
                    j.f2003f.a().d(activity);
                    Context applicationContext = activity.getApplicationContext();
                    g0 g0Var = g0.a;
                    String d2 = g0.d();
                    d0 d0Var = d0.a;
                    c0 c2 = d0.c(d2);
                    if (l.a(c2 == null ? null : Boolean.valueOf(c2.b()), Boolean.TRUE) || a.g()) {
                        SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                        if (sensorManager != null) {
                            c = sensorManager;
                            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                            l lVar = new l(activity);
                            f1998d = lVar;
                            m mVar = b;
                            mVar.a(new c(c2, d2));
                            sensorManager.registerListener(mVar, defaultSensor, 2);
                            if (c2 != null && c2.b()) {
                                lVar.h();
                            }
                        } else {
                            return;
                        }
                    }
                    i iVar = a;
                    if (iVar.g() && !f2001g.get()) {
                        iVar.a(d2);
                    }
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void m(c0 c0Var, String str) {
        Class<i> cls = i.class;
        if (!a.d(cls)) {
            try {
                l.d(str, "$appId");
                boolean z = true;
                boolean z2 = c0Var != null && c0Var.b();
                g0 g0Var = g0.a;
                if (!g0.j()) {
                    z = false;
                }
                if (z2 && z) {
                    a.a(str);
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    public static final void n(boolean z) {
        Class<i> cls = i.class;
        if (!a.d(cls)) {
            try {
                f2001g.set(z);
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }
}
