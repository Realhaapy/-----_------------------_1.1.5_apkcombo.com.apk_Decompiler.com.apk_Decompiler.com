package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import m.y.d.g;
import m.y.d.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class v {
    private final SharedPreferences a;
    private final a b;
    private o0 c;

    public static final class a {
        public final o0 a() {
            g0 g0Var = g0.a;
            return new o0(g0.c(), (String) null, 2, (g) null);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v() {
        /*
            r3 = this;
            com.facebook.g0 r0 = com.facebook.g0.a
            android.content.Context r0 = com.facebook.g0.c()
            java.lang.String r1 = "com.facebook.AccessTokenManager.SharedPreferences"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)"
            m.y.d.l.c(r0, r1)
            com.facebook.v$a r1 = new com.facebook.v$a
            r1.<init>()
            r3.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.v.<init>():void");
    }

    public v(SharedPreferences sharedPreferences, a aVar) {
        l.d(sharedPreferences, "sharedPreferences");
        l.d(aVar, "tokenCachingStrategyFactory");
        this.a = sharedPreferences;
        this.b = aVar;
    }

    private final u b() {
        String string = this.a.getString("com.facebook.AccessTokenManager.CachedAccessToken", (String) null);
        if (string == null) {
            return null;
        }
        try {
            return u.f1749p.b(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final u c() {
        Bundle c2 = d().c();
        if (c2 == null || !o0.c.g(c2)) {
            return null;
        }
        return u.f1749p.c(c2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        com.facebook.internal.s0.n.a.b(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0035, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.facebook.o0 d() {
        /*
            r3 = this;
            boolean r0 = com.facebook.internal.s0.n.a.d(r3)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            com.facebook.o0 r0 = r3.c     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x0020
            monitor-enter(r3)     // Catch:{ all -> 0x0031 }
            com.facebook.o0 r0 = r3.c     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x0019
            com.facebook.v$a r0 = r3.b     // Catch:{ all -> 0x001d }
            com.facebook.o0 r0 = r0.a()     // Catch:{ all -> 0x001d }
            r3.c = r0     // Catch:{ all -> 0x001d }
        L_0x0019:
            m.s r0 = m.s.a     // Catch:{ all -> 0x001d }
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            goto L_0x0020
        L_0x001d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            throw r0     // Catch:{ all -> 0x0031 }
        L_0x0020:
            com.facebook.o0 r0 = r3.c     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0025
            return r0
        L_0x0025:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0031 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0031 }
            r2.<init>(r0)     // Catch:{ all -> 0x0031 }
            throw r2     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            com.facebook.internal.s0.n.a.b(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.v.d():com.facebook.o0");
    }

    private final boolean e() {
        return this.a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    private final boolean h() {
        g0 g0Var = g0.a;
        return g0.w();
    }

    public final void a() {
        this.a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (h()) {
            d().a();
        }
    }

    public final u f() {
        if (e()) {
            return b();
        }
        if (!h()) {
            return null;
        }
        u c2 = c();
        if (c2 == null) {
            return c2;
        }
        g(c2);
        d().a();
        return c2;
    }

    public final void g(u uVar) {
        l.d(uVar, "accessToken");
        try {
            this.a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", uVar.o().toString()).apply();
        } catch (JSONException unused) {
        }
    }
}
