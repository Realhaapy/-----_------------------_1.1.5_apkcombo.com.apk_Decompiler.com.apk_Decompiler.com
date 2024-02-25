package com.facebook.login;

import com.facebook.g0;
import com.facebook.internal.p0;
import com.facebook.internal.v;
import e.c.b.c;
import java.util.Set;
import m.y.d.g;
import m.y.d.l;

public class a0 {
    public static final a a;
    /* access modifiers changed from: private */
    public static final Set<String> b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final Set<String> b() {
            return e0.f("ads_management", "create_event", "rsvp_event");
        }

        public final boolean c(String str) {
            if (str != null) {
                return p.t(str, "publish", false, 2, (Object) null) || p.t(str, "manage", false, 2, (Object) null) || a0.b.contains(str);
            }
            return false;
        }
    }

    static {
        a aVar = new a((g) null);
        a = aVar;
        b = aVar.b();
        l.c(a0.class.toString(), "LoginManager::class.java.toString()");
    }

    public a0() {
        w wVar = w.NATIVE_WITH_FALLBACK;
        p pVar = p.FRIENDS;
        c0 c0Var = c0.FACEBOOK;
        p0 p0Var = p0.a;
        p0.l();
        g0 g0Var = g0.a;
        l.c(g0.c().getSharedPreferences("com.facebook.loginManager", 0), "getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, Context.MODE_PRIVATE)");
        if (g0.f1394p) {
            v vVar = v.a;
            if (v.a() != null) {
                c.a(g0.c(), "com.android.chrome", new o());
                c.b(g0.c(), g0.c().getPackageName());
            }
        }
    }
}
