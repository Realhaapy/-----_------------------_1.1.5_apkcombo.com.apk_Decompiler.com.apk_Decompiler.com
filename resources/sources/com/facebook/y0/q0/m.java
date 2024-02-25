package com.facebook.y0.q0;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.g0;
import java.util.UUID;
import m.y.d.g;
import m.y.d.l;

public final class m {

    /* renamed from: g  reason: collision with root package name */
    public static final a f2108g = new a((g) null);
    private final Long a;
    private Long b;
    private UUID c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f2109d;

    /* renamed from: e  reason: collision with root package name */
    private Long f2110e;

    /* renamed from: f  reason: collision with root package name */
    private o f2111f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a() {
            g0 g0Var = g0.a;
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(g0.c()).edit();
            edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            edit.remove("com.facebook.appevents.SessionInfo.sessionId");
            edit.apply();
            o.c.a();
        }

        public final m b() {
            g0 g0Var = g0.a;
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(g0.c());
            long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0);
            long j3 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0);
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", (String) null);
            if (j2 == 0 || j3 == 0 || string == null) {
                return null;
            }
            m mVar = new m(Long.valueOf(j2), Long.valueOf(j3), (UUID) null, 4, (g) null);
            mVar.f2109d = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
            mVar.l(o.c.b());
            mVar.i(Long.valueOf(System.currentTimeMillis()));
            UUID fromString = UUID.fromString(string);
            l.c(fromString, "fromString(sessionIDStr)");
            mVar.j(fromString);
            return mVar;
        }
    }

    public m(Long l2, Long l3, UUID uuid) {
        l.d(uuid, "sessionId");
        this.a = l2;
        this.b = l3;
        this.c = uuid;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ m(java.lang.Long r1, java.lang.Long r2, java.util.UUID r3, int r4, m.y.d.g r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L_0x000d
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r4 = "randomUUID()"
            m.y.d.l.c(r3, r4)
        L_0x000d:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.q0.m.<init>(java.lang.Long, java.lang.Long, java.util.UUID, int, m.y.d.g):void");
    }

    public final Long b() {
        Long l2 = this.f2110e;
        if (l2 == null) {
            return 0L;
        }
        return l2;
    }

    public final int c() {
        return this.f2109d;
    }

    public final UUID d() {
        return this.c;
    }

    public final Long e() {
        return this.b;
    }

    public final long f() {
        Long l2;
        if (this.a == null || (l2 = this.b) == null) {
            return 0;
        }
        if (l2 != null) {
            return l2.longValue() - this.a.longValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final o g() {
        return this.f2111f;
    }

    public final void h() {
        this.f2109d++;
    }

    public final void i(Long l2) {
        this.f2110e = l2;
    }

    public final void j(UUID uuid) {
        l.d(uuid, "<set-?>");
        this.c = uuid;
    }

    public final void k(Long l2) {
        this.b = l2;
    }

    public final void l(o oVar) {
        this.f2111f = oVar;
    }

    public final void m() {
        g0 g0Var = g0.a;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(g0.c()).edit();
        Long l2 = this.a;
        long j2 = 0;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l2 == null ? 0 : l2.longValue());
        Long l3 = this.b;
        if (l3 != null) {
            j2 = l3.longValue();
        }
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", j2);
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f2109d);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.c.toString());
        edit.apply();
        o oVar = this.f2111f;
        if (oVar != null && oVar != null) {
            oVar.a();
        }
    }
}
