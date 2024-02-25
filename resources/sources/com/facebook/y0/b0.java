package com.facebook.y0;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.facebook.c0;
import com.facebook.g0;
import com.facebook.internal.a0;
import com.facebook.internal.d0;
import com.facebook.internal.f0;
import com.facebook.internal.i0;
import com.facebook.internal.o0;
import com.facebook.p0;
import com.facebook.u;
import com.facebook.y0.a0;
import com.facebook.y0.q0.f;
import com.facebook.y0.q0.i;
import com.facebook.y0.s0.c;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import m.s;
import m.y.d.g;
import m.y.d.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class b0 {
    public static final a c = new a((g) null);

    /* renamed from: d  reason: collision with root package name */
    private static final String f1812d;

    /* renamed from: e  reason: collision with root package name */
    private static ScheduledThreadPoolExecutor f1813e;

    /* renamed from: f  reason: collision with root package name */
    private static a0.b f1814f = a0.b.AUTO;

    /* renamed from: g  reason: collision with root package name */
    private static final Object f1815g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private static String f1816h;

    /* renamed from: i  reason: collision with root package name */
    private static boolean f1817i;

    /* renamed from: j  reason: collision with root package name */
    private static String f1818j;
    private final String a;
    private t b;

    public static final class a {

        /* renamed from: com.facebook.y0.b0$a$a  reason: collision with other inner class name */
        public static final class C0029a implements f0.a {
            C0029a() {
            }

            public void a(String str) {
                b0.c.t(str);
            }
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public static final void l(Context context, b0 b0Var) {
            l.d(context, "$context");
            l.d(b0Var, "$logger");
            Bundle bundle = new Bundle();
            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = i2 + 1;
                String str = strArr[i2];
                String str2 = strArr2[i2];
                try {
                    Class.forName(str);
                    bundle.putInt(str2, 1);
                    i3 |= 1 << i2;
                } catch (ClassNotFoundException unused) {
                }
                if (i4 > 10) {
                    break;
                }
                i2 = i4;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (sharedPreferences.getInt("kitsBitmask", 0) != i3) {
                sharedPreferences.edit().putInt("kitsBitmask", i3).apply();
                b0Var.r("fb_sdk_initialize", (Double) null, bundle);
            }
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
            r3 = com.facebook.y0.i.f1841e;
            r2 = com.facebook.y0.b0.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
            if (r2 == null) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
            r2.scheduleAtFixedRate(r3, 0, 86400, java.util.concurrent.TimeUnit.SECONDS);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
            throw new java.lang.IllegalStateException("Required value was null.".toString());
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void m() {
            /*
                r9 = this;
                java.lang.Object r0 = com.facebook.y0.b0.e()
                monitor-enter(r0)
                java.util.concurrent.ScheduledThreadPoolExecutor r1 = com.facebook.y0.b0.b()     // Catch:{ all -> 0x003a }
                if (r1 == 0) goto L_0x000d
                monitor-exit(r0)
                return
            L_0x000d:
                com.facebook.y0.b0$a r1 = com.facebook.y0.b0.c     // Catch:{ all -> 0x003a }
                java.util.concurrent.ScheduledThreadPoolExecutor r1 = new java.util.concurrent.ScheduledThreadPoolExecutor     // Catch:{ all -> 0x003a }
                r2 = 1
                r1.<init>(r2)     // Catch:{ all -> 0x003a }
                com.facebook.y0.b0.i(r1)     // Catch:{ all -> 0x003a }
                m.s r1 = m.s.a     // Catch:{ all -> 0x003a }
                monitor-exit(r0)
                com.facebook.y0.i r3 = com.facebook.y0.i.f1841e
                java.util.concurrent.ScheduledThreadPoolExecutor r2 = com.facebook.y0.b0.b()
                if (r2 == 0) goto L_0x002e
                r4 = 0
                r6 = 86400(0x15180, double:4.26873E-319)
                java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
                r2.scheduleAtFixedRate(r3, r4, r6, r8)
                return
            L_0x002e:
                java.lang.String r0 = "Required value was null."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L_0x003a:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.b0.a.m():void");
        }

        /* access modifiers changed from: private */
        public static final void n() {
            HashSet<String> hashSet = new HashSet<>();
            y yVar = y.a;
            for (t b : y.j()) {
                hashSet.add(b.b());
            }
            for (String n2 : hashSet) {
                d0 d0Var = d0.a;
                d0.n(n2, true);
            }
        }

        /* access modifiers changed from: private */
        public final void q(v vVar, t tVar) {
            y yVar = y.a;
            y.a(tVar, vVar);
            com.facebook.internal.a0 a0Var = com.facebook.internal.a0.a;
            if (com.facebook.internal.a0.g(a0.b.OnDevicePostInstallEventProcessing)) {
                c cVar = c.a;
                if (c.b()) {
                    c.e(tVar.b(), vVar);
                }
            }
            if (!vVar.c() && !b0.f()) {
                if (l.a(vVar.f(), "fb_mobile_activate_app")) {
                    b0.g(true);
                } else {
                    i0.f1448e.b(p0.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
                }
            }
        }

        /* access modifiers changed from: private */
        public final void r(String str) {
            i0.f1448e.b(p0.DEVELOPER_ERRORS, "AppEvents", str);
        }

        public final void d(Application application, String str) {
            l.d(application, "application");
            g0 g0Var = g0.a;
            if (g0.v()) {
                u uVar = u.a;
                u.c();
                j0 j0Var = j0.a;
                j0.f();
                if (str == null) {
                    str = g0.d();
                }
                g0.J(application, str);
                f fVar = f.a;
                f.x(application, str);
                return;
            }
            throw new c0("The Facebook sdk must be initialized before calling activateApp");
        }

        public final void e() {
            if (h() != a0.b.EXPLICIT_ONLY) {
                y yVar = y.a;
                y.f(d0.EAGER_FLUSHING_EVENT);
            }
        }

        public final Executor f() {
            if (b0.b() == null) {
                m();
            }
            ScheduledThreadPoolExecutor b = b0.b();
            if (b != null) {
                return b;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public final String g(Context context) {
            l.d(context, "context");
            if (b0.a() == null) {
                synchronized (b0.e()) {
                    if (b0.a() == null) {
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                        a aVar = b0.c;
                        b0.h(sharedPreferences.getString("anonymousAppDeviceGUID", (String) null));
                        if (b0.a() == null) {
                            UUID randomUUID = UUID.randomUUID();
                            l.c(randomUUID, "randomUUID()");
                            b0.h(l.j("XZ", randomUUID));
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", b0.a()).apply();
                        }
                    }
                    s sVar = s.a;
                }
            }
            String a = b0.a();
            if (a != null) {
                return a;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public final a0.b h() {
            a0.b c;
            synchronized (b0.e()) {
                c = b0.c();
            }
            return c;
        }

        public final String i() {
            f0 f0Var = f0.a;
            f0.d(new C0029a());
            g0 g0Var = g0.a;
            return g0.c().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", (String) null);
        }

        public final String j() {
            String d2;
            synchronized (b0.e()) {
                d2 = b0.d();
            }
            return d2;
        }

        public final void k(Context context, String str) {
            l.d(context, "context");
            g0 g0Var = g0.a;
            if (g0.g()) {
                b0 b0Var = new b0(context, str, (u) null);
                ScheduledThreadPoolExecutor b = b0.b();
                if (b != null) {
                    b.execute(new j(context, b0Var));
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
        }

        public final void s() {
            y yVar = y.a;
            y.s();
        }

        public final void t(String str) {
            g0 g0Var = g0.a;
            SharedPreferences sharedPreferences = g0.c().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (str != null) {
                sharedPreferences.edit().putString("install_referrer", str).apply();
            }
        }
    }

    static {
        String canonicalName = b0.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        f1812d = canonicalName;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b0(Context context, String str, u uVar) {
        this(o0.r(context), str, uVar);
        o0 o0Var = o0.a;
    }

    public b0(String str, String str2, u uVar) {
        t tVar;
        l.d(str, "activityName");
        com.facebook.internal.p0 p0Var = com.facebook.internal.p0.a;
        com.facebook.internal.p0.l();
        this.a = str;
        uVar = uVar == null ? u.f1749p.e() : uVar;
        if (uVar == null || uVar.n() || (str2 != null && !l.a(str2, uVar.c()))) {
            if (str2 == null) {
                o0 o0Var = o0.a;
                g0 g0Var = g0.a;
                str2 = o0.D(g0.c());
            }
            if (str2 != null) {
                tVar = new t((String) null, str2);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        } else {
            tVar = new t(uVar);
        }
        this.b = tVar;
        c.m();
    }

    public static final /* synthetic */ String a() {
        Class<b0> cls = b0.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return f1816h;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor b() {
        Class<b0> cls = b0.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return f1813e;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ a0.b c() {
        Class<b0> cls = b0.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return f1814f;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ String d() {
        Class<b0> cls = b0.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return f1818j;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ Object e() {
        Class<b0> cls = b0.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return f1815g;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ boolean f() {
        Class<b0> cls = b0.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return false;
        }
        try {
            return f1817i;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return false;
        }
    }

    public static final /* synthetic */ void g(boolean z) {
        Class<b0> cls = b0.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                f1817i = z;
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    public static final /* synthetic */ void h(String str) {
        Class<b0> cls = b0.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                f1816h = str;
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    public static final /* synthetic */ void i(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        Class<b0> cls = b0.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                f1813e = scheduledThreadPoolExecutor;
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    public final void j() {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                y yVar = y.a;
                y.f(d0.EXPLICIT);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public final String k() {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return null;
        }
        try {
            return this.b.b();
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return null;
        }
    }

    public final void l(String str) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                o(str, (Bundle) null);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public final void m(String str, double d2) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                n(str, d2, (Bundle) null);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public final void n(String str, double d2, Bundle bundle) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                Double valueOf = Double.valueOf(d2);
                f fVar = f.a;
                p(str, valueOf, bundle, false, f.h());
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public final void o(String str, Bundle bundle) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                f fVar = f.a;
                p(str, (Double) null, bundle, false, f.h());
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public final void p(String str, Double d2, Bundle bundle, boolean z, UUID uuid) {
        if (!com.facebook.internal.s0.n.a.d(this) && str != null) {
            try {
                if (!(str.length() == 0)) {
                    com.facebook.internal.b0 b0Var = com.facebook.internal.b0.a;
                    g0 g0Var = g0.a;
                    if (com.facebook.internal.b0.b("app_events_killswitch", g0.d(), false)) {
                        i0.f1448e.c(p0.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                        return;
                    }
                    String str2 = this.a;
                    f fVar = f.a;
                    c.q(new v(str2, str, d2, bundle, z, f.j(), uuid), this.b);
                }
            } catch (JSONException e2) {
                i0.f1448e.c(p0.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e2.toString());
            } catch (c0 e3) {
                i0.f1448e.c(p0.APP_EVENTS, "AppEvents", "Invalid app event: %s", e3.toString());
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public final void q(String str, String str2) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("_is_suggested_event", "1");
                bundle.putString("_button_text", str2);
                o(str, bundle);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public final void r(String str, Double d2, Bundle bundle) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                f fVar = f.a;
                p(str, d2, bundle, true, f.h());
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public final void s(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            if (bigDecimal == null || currency == null) {
                o0 o0Var = o0.a;
                o0.e0(f1812d, "purchaseAmount and currency cannot be null");
                return;
            }
            if (bundle == null) {
                try {
                    bundle = new Bundle();
                } catch (Throwable th) {
                    com.facebook.internal.s0.n.a.b(th, this);
                    return;
                }
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            Double valueOf = Double.valueOf(bigDecimal.doubleValue());
            f fVar = f.a;
            p(str, valueOf, bundle2, true, f.h());
        }
    }

    public final void t(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                i iVar = i.a;
                if (i.c()) {
                    Log.w(f1812d, "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events");
                }
                u(bigDecimal, currency, bundle, false);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public final void u(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            if (bigDecimal == null) {
                try {
                    c.r("purchaseAmount cannot be null");
                } catch (Throwable th) {
                    com.facebook.internal.s0.n.a.b(th, this);
                }
            } else if (currency == null) {
                c.r("currency cannot be null");
            } else {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = bundle;
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                Double valueOf = Double.valueOf(bigDecimal.doubleValue());
                f fVar = f.a;
                p("fb_mobile_purchase", valueOf, bundle2, z, f.h());
                c.e();
            }
        }
    }

    public final void v(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                u(bigDecimal, currency, bundle, true);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public final void w(Bundle bundle, String str) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                l.d(bundle, "payload");
                String str2 = null;
                try {
                    String string = bundle.getString("fb_push_payload");
                    o0 o0Var = o0.a;
                    if (!o0.V(string)) {
                        str2 = new JSONObject(string).getString("campaign");
                        if (str2 == null) {
                            i0.f1448e.b(p0.DEVELOPER_ERRORS, f1812d, "Malformed payload specified for logging a push notification open.");
                            return;
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("fb_push_campaign", str2);
                        if (str != null) {
                            bundle2.putString("fb_push_action", str);
                        }
                        o("fb_mobile_push_opened", bundle2);
                    }
                } catch (JSONException unused) {
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }
}
