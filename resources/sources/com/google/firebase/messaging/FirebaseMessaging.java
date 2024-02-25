package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.n;
import com.google.firebase.h;
import com.google.firebase.messaging.c1;
import com.google.firebase.p.b;
import com.google.firebase.p.d;
import com.google.firebase.q.k;
import f.e.a.a.g;
import f.e.a.c.g.i;
import f.e.a.c.g.j;
import f.e.a.c.g.l;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FirebaseMessaging {

    /* renamed from: n  reason: collision with root package name */
    private static final long f2698n = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: o  reason: collision with root package name */
    private static c1 f2699o;
    @SuppressLint({"FirebaseUnknownNullness"})

    /* renamed from: p  reason: collision with root package name */
    static g f2700p;

    /* renamed from: q  reason: collision with root package name */
    static ScheduledExecutorService f2701q;
    /* access modifiers changed from: private */
    public final h a;
    private final com.google.firebase.iid.a.a b;
    private final com.google.firebase.installations.h c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f2702d;

    /* renamed from: e  reason: collision with root package name */
    private final o0 f2703e;

    /* renamed from: f  reason: collision with root package name */
    private final y0 f2704f;

    /* renamed from: g  reason: collision with root package name */
    private final a f2705g;

    /* renamed from: h  reason: collision with root package name */
    private final Executor f2706h;

    /* renamed from: i  reason: collision with root package name */
    private final Executor f2707i;

    /* renamed from: j  reason: collision with root package name */
    private final i<g1> f2708j;

    /* renamed from: k  reason: collision with root package name */
    private final r0 f2709k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f2710l;

    /* renamed from: m  reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f2711m;

    private class a {
        private final d a;
        private boolean b;
        private b<com.google.firebase.g> c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f2712d;

        a(d dVar) {
            this.a = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void d(com.google.firebase.p.a aVar) {
            if (b()) {
                FirebaseMessaging.this.L();
            }
        }

        private Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context j2 = FirebaseMessaging.this.a.j();
            SharedPreferences sharedPreferences = j2.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = j2.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(j2.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public synchronized void a() {
            if (!this.b) {
                Boolean e2 = e();
                this.f2712d = e2;
                if (e2 == null) {
                    l lVar = new l(this);
                    this.c = lVar;
                    this.a.a(com.google.firebase.g.class, lVar);
                }
                this.b = true;
            }
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean b() {
            Boolean bool;
            a();
            bool = this.f2712d;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.a.u();
        }

        /* access modifiers changed from: package-private */
        public synchronized void f(boolean z) {
            a();
            b<com.google.firebase.g> bVar = this.c;
            if (bVar != null) {
                this.a.c(com.google.firebase.g.class, bVar);
                this.c = null;
            }
            SharedPreferences.Editor edit = FirebaseMessaging.this.a.j().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z);
            edit.apply();
            if (z) {
                FirebaseMessaging.this.L();
            }
            this.f2712d = Boolean.valueOf(z);
        }
    }

    FirebaseMessaging(h hVar, com.google.firebase.iid.a.a aVar, com.google.firebase.installations.h hVar2, g gVar, d dVar, r0 r0Var, o0 o0Var, Executor executor, Executor executor2, Executor executor3) {
        this.f2710l = false;
        f2700p = gVar;
        this.a = hVar;
        this.b = aVar;
        this.c = hVar2;
        this.f2705g = new a(dVar);
        Context j2 = hVar.j();
        this.f2702d = j2;
        n0 n0Var = new n0();
        this.f2711m = n0Var;
        this.f2709k = r0Var;
        this.f2703e = o0Var;
        this.f2704f = new y0(executor);
        this.f2706h = executor2;
        this.f2707i = executor3;
        Context j3 = hVar.j();
        if (j3 instanceof Application) {
            ((Application) j3).registerActivityLifecycleCallbacks(n0Var);
        } else {
            Log.w("FirebaseMessaging", "Context " + j3 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.c(new o(this));
        }
        executor2.execute(new q(this));
        i<g1> e2 = g1.e(this, r0Var, o0Var, j2, m0.g());
        this.f2708j = e2;
        e2.e(executor2, new p(this));
        executor2.execute(new k(this));
    }

    FirebaseMessaging(h hVar, com.google.firebase.iid.a.a aVar, com.google.firebase.r.b<com.google.firebase.t.i> bVar, com.google.firebase.r.b<k> bVar2, com.google.firebase.installations.h hVar2, g gVar, d dVar) {
        this(hVar, aVar, bVar, bVar2, hVar2, gVar, dVar, new r0(hVar.j()));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    FirebaseMessaging(com.google.firebase.h r12, com.google.firebase.iid.a.a r13, com.google.firebase.r.b<com.google.firebase.t.i> r14, com.google.firebase.r.b<com.google.firebase.q.k> r15, com.google.firebase.installations.h r16, f.e.a.a.g r17, com.google.firebase.p.d r18, com.google.firebase.messaging.r0 r19) {
        /*
            r11 = this;
            com.google.firebase.messaging.o0 r7 = new com.google.firebase.messaging.o0
            r0 = r7
            r1 = r12
            r2 = r19
            r3 = r14
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ExecutorService r8 = com.google.firebase.messaging.m0.f()
            java.util.concurrent.ScheduledExecutorService r9 = com.google.firebase.messaging.m0.c()
            java.util.concurrent.Executor r10 = com.google.firebase.messaging.m0.b()
            r0 = r11
            r2 = r13
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessaging.<init>(com.google.firebase.h, com.google.firebase.iid.a.a, com.google.firebase.r.b, com.google.firebase.r.b, com.google.firebase.installations.h, f.e.a.a.g, com.google.firebase.p.d, com.google.firebase.messaging.r0):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void C(g1 g1Var) {
        if (n()) {
            g1Var.p();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void E() {
        u0.b(this.f2702d);
    }

    private synchronized void K() {
        if (!this.f2710l) {
            N(0);
        }
    }

    /* access modifiers changed from: private */
    public void L() {
        com.google.firebase.iid.a.a aVar = this.b;
        if (aVar != null) {
            aVar.d();
        } else if (O(k())) {
            K();
        }
    }

    public static synchronized FirebaseMessaging g() {
        FirebaseMessaging instance;
        synchronized (FirebaseMessaging.class) {
            instance = getInstance(h.l());
        }
        return instance;
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(h hVar) {
        FirebaseMessaging firebaseMessaging;
        Class cls = FirebaseMessaging.class;
        synchronized (cls) {
            firebaseMessaging = (FirebaseMessaging) hVar.h(cls);
            n.i(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    private static synchronized c1 h(Context context) {
        c1 c1Var;
        synchronized (FirebaseMessaging.class) {
            if (f2699o == null) {
                f2699o = new c1(context);
            }
            c1Var = f2699o;
        }
        return c1Var;
    }

    private String i() {
        return "[DEFAULT]".equals(this.a.n()) ? "" : this.a.p();
    }

    public static g l() {
        return f2700p;
    }

    private void m(String str) {
        if ("[DEFAULT]".equals(this.a.n())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.a.n());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new l0(this.f2702d).g(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ i q(String str, c1.a aVar) {
        return this.f2703e.e().o(this.f2707i, new j(this, str, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ i s(String str, c1.a aVar, String str2) {
        h(this.f2702d).g(i(), str, str2, this.f2709k.a());
        if (aVar == null || !str2.equals(aVar.a)) {
            m(str2);
        }
        return l.f(str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void u(j jVar) {
        try {
            this.b.b(r0.c(this.a), "FCM");
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void w(j jVar) {
        try {
            l.a(this.f2703e.b());
            h(this.f2702d).d(i(), r0.c(this.a));
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void y(j jVar) {
        try {
            jVar.c(c());
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void A() {
        if (n()) {
            L();
        }
    }

    public void H(w0 w0Var) {
        if (!TextUtils.isEmpty(w0Var.k())) {
            Intent intent = new Intent("com.google.android.gcm.intent.SEND");
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            intent.putExtra("app", PendingIntent.getBroadcast(this.f2702d, 0, intent2, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
            intent.setPackage("com.google.android.gms");
            w0Var.m(intent);
            this.f2702d.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        throw new IllegalArgumentException("Missing 'to'");
    }

    public void I(boolean z) {
        this.f2705g.f(z);
    }

    /* access modifiers changed from: package-private */
    public synchronized void J(boolean z) {
        this.f2710l = z;
    }

    public i<Void> M(String str) {
        return this.f2708j.n(new t(str));
    }

    /* access modifiers changed from: package-private */
    public synchronized void N(long j2) {
        e(new d1(this, Math.min(Math.max(30, 2 * j2), f2698n)), j2);
        this.f2710l = true;
    }

    /* access modifiers changed from: package-private */
    public boolean O(c1.a aVar) {
        return aVar == null || aVar.b(this.f2709k.a());
    }

    public i<Void> P(String str) {
        return this.f2708j.n(new m(str));
    }

    /* access modifiers changed from: package-private */
    public String c() {
        com.google.firebase.iid.a.a aVar = this.b;
        if (aVar != null) {
            try {
                return (String) l.a(aVar.a());
            } catch (InterruptedException | ExecutionException e2) {
                throw new IOException(e2);
            }
        } else {
            c1.a k2 = k();
            if (!O(k2)) {
                return k2.a;
            }
            String c2 = r0.c(this.a);
            try {
                return (String) l.a(this.f2704f.a(c2, new i(this, c2, k2)));
            } catch (InterruptedException | ExecutionException e3) {
                throw new IOException(e3);
            }
        }
    }

    public i<Void> d() {
        if (this.b != null) {
            j jVar = new j();
            this.f2706h.execute(new n(this, jVar));
            return jVar.a();
        } else if (k() == null) {
            return l.f(null);
        } else {
            j jVar2 = new j();
            m0.e().execute(new s(this, jVar2));
            return jVar2.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void e(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            if (f2701q == null) {
                f2701q = new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.n.a("TAG"));
            }
            f2701q.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    /* access modifiers changed from: package-private */
    public Context f() {
        return this.f2702d;
    }

    public i<String> j() {
        com.google.firebase.iid.a.a aVar = this.b;
        if (aVar != null) {
            return aVar.a();
        }
        j jVar = new j();
        this.f2706h.execute(new r(this, jVar));
        return jVar.a();
    }

    /* access modifiers changed from: package-private */
    public c1.a k() {
        return h(this.f2702d).e(i(), r0.c(this.a));
    }

    public boolean n() {
        return this.f2705g.b();
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        return this.f2709k.g();
    }
}
