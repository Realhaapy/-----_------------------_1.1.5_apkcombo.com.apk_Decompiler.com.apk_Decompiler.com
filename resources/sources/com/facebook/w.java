package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.internal.o0;
import com.facebook.j0;
import com.facebook.u;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import m.y.d.g;
import m.y.d.l;
import org.json.JSONArray;
import org.json.JSONObject;

public final class w {

    /* renamed from: f  reason: collision with root package name */
    public static final a f1771f = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static w f1772g;
    private final e.n.a.a a;
    private final v b;
    private u c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f1773d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private Date f1774e = new Date(0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final j0 c(u uVar, j0.b bVar) {
            e f2 = f(uVar);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", f2.b());
            bundle.putString("client_id", uVar.c());
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            j0 x = j0.f1546n.x(uVar, f2.a(), bVar);
            x.G(bundle);
            x.F(n0.GET);
            return x;
        }

        /* access modifiers changed from: private */
        public final j0 d(u uVar, j0.b bVar) {
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            j0 x = j0.f1546n.x(uVar, "me/permissions", bVar);
            x.G(bundle);
            x.F(n0.GET);
            return x;
        }

        private final e f(u uVar) {
            String h2 = uVar.h();
            if (h2 == null) {
                h2 = "facebook";
            }
            return l.a(h2, "instagram") ? new c() : new b();
        }

        public final w e() {
            w a;
            w a2 = w.f1772g;
            if (a2 != null) {
                return a2;
            }
            synchronized (this) {
                a = w.f1772g;
                if (a == null) {
                    g0 g0Var = g0.a;
                    e.n.a.a b = e.n.a.a.b(g0.c());
                    l.c(b, "getInstance(applicationContext)");
                    w wVar = new w(b, new v());
                    a aVar = w.f1771f;
                    w.f1772g = wVar;
                    a = wVar;
                }
            }
            return a;
        }
    }

    public static final class b implements e {
        private final String a = "oauth/access_token";
        private final String b = "fb_extend_sso_token";

        public String a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    public static final class c implements e {
        private final String a = "refresh_access_token";
        private final String b = "ig_refresh_token";

        public String a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    private static final class d {
        private String a;
        private int b;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private Long f1775d;

        /* renamed from: e  reason: collision with root package name */
        private String f1776e;

        public final String a() {
            return this.a;
        }

        public final Long b() {
            return this.f1775d;
        }

        public final int c() {
            return this.b;
        }

        public final int d() {
            return this.c;
        }

        public final String e() {
            return this.f1776e;
        }

        public final void f(String str) {
            this.a = str;
        }

        public final void g(Long l2) {
            this.f1775d = l2;
        }

        public final void h(int i2) {
            this.b = i2;
        }

        public final void i(int i2) {
            this.c = i2;
        }

        public final void j(String str) {
            this.f1776e = str;
        }
    }

    public interface e {
        String a();

        String b();
    }

    public w(e.n.a.a aVar, v vVar) {
        l.d(aVar, "localBroadcastManager");
        l.d(vVar, "accessTokenCache");
        this.a = aVar;
        this.b = vVar;
    }

    /* access modifiers changed from: private */
    public static final void l(w wVar, u.a aVar) {
        l.d(wVar, "this$0");
        wVar.m(aVar);
    }

    private final void m(u.a aVar) {
        u e2 = e();
        if (e2 == null) {
            if (aVar != null) {
                aVar.a(new c0("No current access token to refresh"));
            }
        } else if (this.f1773d.compareAndSet(false, true)) {
            this.f1774e = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            d dVar = new d();
            a aVar2 = f1771f;
            l0 l0Var = new l0(aVar2.d(e2, new d(atomicBoolean, hashSet, hashSet2, hashSet3)), aVar2.c(e2, new b(dVar)));
            l0Var.j(new c(dVar, e2, aVar, atomicBoolean, hashSet, hashSet2, hashSet3, this));
            l0Var.n();
        } else if (aVar != null) {
            aVar.a(new c0("Refresh already in progress"));
        }
    }

    /* access modifiers changed from: private */
    public static final void n(AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, m0 m0Var) {
        JSONArray optJSONArray;
        l.d(atomicBoolean, "$permissionsCallSucceeded");
        l.d(set, "$permissions");
        l.d(set2, "$declinedPermissions");
        l.d(set3, "$expiredPermissions");
        l.d(m0Var, "response");
        JSONObject d2 = m0Var.d();
        if (d2 != null && (optJSONArray = d2.optJSONArray("data")) != null) {
            atomicBoolean.set(true);
            int i2 = 0;
            int length = optJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i3 = i2 + 1;
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("permission");
                        String optString2 = optJSONObject.optString("status");
                        o0 o0Var = o0.a;
                        if (!o0.V(optString) && !o0.V(optString2)) {
                            l.c(optString2, "status");
                            Locale locale = Locale.US;
                            l.c(locale, "US");
                            String lowerCase = optString2.toLowerCase(locale);
                            l.c(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            l.c(lowerCase, "status");
                            int hashCode = lowerCase.hashCode();
                            if (hashCode != -1309235419) {
                                if (hashCode != 280295099) {
                                    if (hashCode == 568196142 && lowerCase.equals("declined")) {
                                        set2.add(optString);
                                    }
                                } else if (lowerCase.equals("granted")) {
                                    set.add(optString);
                                }
                            } else if (lowerCase.equals("expired")) {
                                set3.add(optString);
                            }
                            Log.w("AccessTokenManager", l.j("Unexpected status: ", lowerCase));
                        }
                    }
                    if (i3 < length) {
                        i2 = i3;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void o(d dVar, m0 m0Var) {
        l.d(dVar, "$refreshResult");
        l.d(m0Var, "response");
        JSONObject d2 = m0Var.d();
        if (d2 != null) {
            dVar.f(d2.optString("access_token"));
            dVar.h(d2.optInt("expires_at"));
            dVar.i(d2.optInt("expires_in"));
            dVar.g(Long.valueOf(d2.optLong("data_access_expiration_time")));
            dVar.j(d2.optString("graph_domain", (String) null));
        }
    }

    /* access modifiers changed from: private */
    public static final void p(d dVar, u uVar, u.a aVar, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, w wVar, l0 l0Var) {
        u uVar2;
        u.a aVar2 = aVar;
        w wVar2 = wVar;
        l.d(dVar, "$refreshResult");
        l.d(atomicBoolean, "$permissionsCallSucceeded");
        Set set4 = set;
        l.d(set4, "$permissions");
        Set set5 = set2;
        l.d(set5, "$declinedPermissions");
        Set set6 = set3;
        l.d(set6, "$expiredPermissions");
        l.d(wVar2, "this$0");
        l.d(l0Var, "it");
        String a2 = dVar.a();
        int c2 = dVar.c();
        Long b2 = dVar.b();
        String e2 = dVar.e();
        try {
            a aVar3 = f1771f;
            if (aVar3.e().e() != null) {
                u e3 = aVar3.e().e();
                if ((e3 == null ? null : e3.m()) == uVar.m()) {
                    if (!atomicBoolean.get() && a2 == null && c2 == 0) {
                        if (aVar2 != null) {
                            aVar2.a(new c0("Failed to refresh access token"));
                        }
                        wVar2.f1773d.set(false);
                        return;
                    }
                    Date g2 = uVar.g();
                    if (dVar.c() != 0) {
                        g2 = new Date(((long) dVar.c()) * 1000);
                    } else if (dVar.d() != 0) {
                        g2 = new Date((((long) dVar.d()) * 1000) + new Date().getTime());
                    }
                    Date date = g2;
                    if (a2 == null) {
                        a2 = uVar.l();
                    }
                    String str = a2;
                    String c3 = uVar.c();
                    String m2 = uVar.m();
                    Set<String> j2 = atomicBoolean.get() ? set4 : uVar.j();
                    Set<String> e4 = atomicBoolean.get() ? set5 : uVar.e();
                    Set<String> f2 = atomicBoolean.get() ? set6 : uVar.f();
                    x k2 = uVar.k();
                    Date date2 = new Date();
                    Date date3 = b2 != null ? new Date(b2.longValue() * 1000) : uVar.d();
                    if (e2 == null) {
                        e2 = uVar.h();
                    }
                    u uVar3 = new u(str, c3, m2, j2, e4, f2, k2, date, date2, date3, e2);
                    try {
                        aVar3.e().r(uVar3);
                        wVar2.f1773d.set(false);
                        if (aVar2 != null) {
                            aVar2.b(uVar3);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        uVar2 = uVar3;
                        wVar2.f1773d.set(false);
                        if (!(aVar2 == null || uVar2 == null)) {
                            aVar2.b(uVar2);
                        }
                        throw th;
                    }
                }
            }
            if (aVar2 != null) {
                aVar2.a(new c0("No current access token to refresh"));
            }
            wVar2.f1773d.set(false);
        } catch (Throwable th2) {
            th = th2;
            uVar2 = null;
            wVar2.f1773d.set(false);
            aVar2.b(uVar2);
            throw th;
        }
    }

    private final void q(u uVar, u uVar2) {
        g0 g0Var = g0.a;
        Intent intent = new Intent(g0.c(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", uVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", uVar2);
        this.a.d(intent);
    }

    private final void s(u uVar, boolean z) {
        u uVar2 = this.c;
        this.c = uVar;
        this.f1773d.set(false);
        this.f1774e = new Date(0);
        if (z) {
            v vVar = this.b;
            if (uVar != null) {
                vVar.g(uVar);
            } else {
                vVar.a();
                o0 o0Var = o0.a;
                g0 g0Var = g0.a;
                o0.g(g0.c());
            }
        }
        o0 o0Var2 = o0.a;
        if (!o0.c(uVar2, uVar)) {
            q(uVar2, uVar);
            t();
        }
    }

    private final void t() {
        g0 g0Var = g0.a;
        Context c2 = g0.c();
        u.c cVar = u.f1749p;
        u e2 = cVar.e();
        AlarmManager alarmManager = (AlarmManager) c2.getSystemService("alarm");
        if (cVar.g()) {
            if ((e2 == null ? null : e2.g()) != null && alarmManager != null) {
                Intent intent = new Intent(c2, CurrentAccessTokenExpirationBroadcastReceiver.class);
                intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                try {
                    alarmManager.set(1, e2.g().getTime(), Build.VERSION.SDK_INT >= 23 ? PendingIntent.getBroadcast(c2, 0, intent, 67108864) : PendingIntent.getBroadcast(c2, 0, intent, 0));
                } catch (Exception unused) {
                }
            }
        }
    }

    private final boolean u() {
        u e2 = e();
        if (e2 == null) {
            return false;
        }
        long time = new Date().getTime();
        return e2.k().c() && time - this.f1774e.getTime() > 3600000 && time - e2.i().getTime() > 86400000;
    }

    public final void c() {
        q(e(), e());
    }

    public final void d() {
        if (u()) {
            k((u.a) null);
        }
    }

    public final u e() {
        return this.c;
    }

    public final boolean j() {
        u f2 = this.b.f();
        if (f2 == null) {
            return false;
        }
        s(f2, false);
        return true;
    }

    public final void k(u.a aVar) {
        if (l.a(Looper.getMainLooper(), Looper.myLooper())) {
            m(aVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new a(this, aVar));
        }
    }

    public final void r(u uVar) {
        s(uVar, true);
    }
}
