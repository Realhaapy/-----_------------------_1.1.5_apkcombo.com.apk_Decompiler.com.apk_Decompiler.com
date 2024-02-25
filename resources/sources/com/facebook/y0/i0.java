package com.facebook.y0;

import com.facebook.internal.q;
import com.facebook.internal.s0.n.a;
import java.util.ArrayList;
import java.util.List;
import m.y.d.l;

public final class i0 {

    /* renamed from: f  reason: collision with root package name */
    private static final String f1842f;

    /* renamed from: g  reason: collision with root package name */
    private static final int f1843g = 1000;
    private final q a;
    private final String b;
    private List<v> c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final List<v> f1844d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private int f1845e;

    static {
        String simpleName = i0.class.getSimpleName();
        l.c(simpleName, "SessionEventsState::class.java.simpleName");
        f1842f = simpleName;
    }

    public i0(q qVar, String str) {
        l.d(qVar, "attributionIdentifiers");
        l.d(str, "anonymousAppDeviceGUID");
        this.a = qVar;
        this.b = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        com.facebook.internal.s0.n.a.b(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r5 = new org.json.JSONObject();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void f(com.facebook.j0 r4, android.content.Context r5, int r6, org.json.JSONArray r7, boolean r8) {
        /*
            r3 = this;
            boolean r0 = com.facebook.internal.s0.n.a.d(r3)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            com.facebook.y0.q0.h r0 = com.facebook.y0.q0.h.a     // Catch:{ JSONException -> 0x001f }
            com.facebook.y0.q0.h$a r0 = com.facebook.y0.q0.h.a.CUSTOM_APP_EVENTS     // Catch:{ JSONException -> 0x001f }
            com.facebook.internal.q r1 = r3.a     // Catch:{ JSONException -> 0x001f }
            java.lang.String r2 = r3.b     // Catch:{ JSONException -> 0x001f }
            org.json.JSONObject r5 = com.facebook.y0.q0.h.a(r0, r1, r2, r8, r5)     // Catch:{ JSONException -> 0x001f }
            int r8 = r3.f1845e     // Catch:{ JSONException -> 0x001f }
            if (r8 <= 0) goto L_0x0024
            java.lang.String r8 = "num_skipped_events"
            r5.put(r8, r6)     // Catch:{ JSONException -> 0x001f }
            goto L_0x0024
        L_0x001d:
            r4 = move-exception
            goto L_0x0040
        L_0x001f:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x001d }
            r5.<init>()     // Catch:{ all -> 0x001d }
        L_0x0024:
            r4.E(r5)     // Catch:{ all -> 0x001d }
            android.os.Bundle r5 = r4.t()     // Catch:{ all -> 0x001d }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x001d }
            java.lang.String r7 = "events.toString()"
            m.y.d.l.c(r6, r7)     // Catch:{ all -> 0x001d }
            java.lang.String r7 = "custom_events"
            r5.putString(r7, r6)     // Catch:{ all -> 0x001d }
            r4.H(r6)     // Catch:{ all -> 0x001d }
            r4.G(r5)     // Catch:{ all -> 0x001d }
            return
        L_0x0040:
            com.facebook.internal.s0.n.a.b(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.i0.f(com.facebook.j0, android.content.Context, int, org.json.JSONArray, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(com.facebook.y0.v r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = com.facebook.internal.s0.n.a.d(r2)     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r2)
            return
        L_0x0009:
            java.lang.String r0 = "event"
            m.y.d.l.d(r3, r0)     // Catch:{ all -> 0x002d }
            java.util.List<com.facebook.y0.v> r0 = r2.c     // Catch:{ all -> 0x002d }
            int r0 = r0.size()     // Catch:{ all -> 0x002d }
            java.util.List<com.facebook.y0.v> r1 = r2.f1844d     // Catch:{ all -> 0x002d }
            int r1 = r1.size()     // Catch:{ all -> 0x002d }
            int r0 = r0 + r1
            int r1 = f1843g     // Catch:{ all -> 0x002d }
            if (r0 < r1) goto L_0x0026
            int r3 = r2.f1845e     // Catch:{ all -> 0x002d }
            int r3 = r3 + 1
            r2.f1845e = r3     // Catch:{ all -> 0x002d }
            goto L_0x002b
        L_0x0026:
            java.util.List<com.facebook.y0.v> r0 = r2.c     // Catch:{ all -> 0x002d }
            r0.add(r3)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r2)
            return
        L_0x002d:
            r3 = move-exception
            com.facebook.internal.s0.n.a.b(r3, r2)     // Catch:{ all -> 0x0033 }
            monitor-exit(r2)
            return
        L_0x0033:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.i0.a(com.facebook.y0.v):void");
    }

    public final synchronized void b(boolean z) {
        if (!a.d(this)) {
            if (z) {
                try {
                    this.c.addAll(this.f1844d);
                } catch (Throwable th) {
                    a.b(th, this);
                    return;
                }
            }
            this.f1844d.clear();
            this.f1845e = 0;
        }
    }

    public final synchronized int c() {
        if (a.d(this)) {
            return 0;
        }
        try {
            return this.c.size();
        } catch (Throwable th) {
            a.b(th, this);
            return 0;
        }
    }

    public final synchronized List<v> d() {
        if (a.d(this)) {
            return null;
        }
        try {
            List<v> list = this.c;
            this.c = new ArrayList();
            return list;
        } catch (Throwable th) {
            a.b(th, this);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007e, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007f, code lost:
        com.facebook.internal.s0.n.a.b(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0082, code lost:
        return 0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e(com.facebook.j0 r9, android.content.Context r10, boolean r11, boolean r12) {
        /*
            r8 = this;
            boolean r0 = com.facebook.internal.s0.n.a.d(r8)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r0 = "request"
            m.y.d.l.d(r9, r0)     // Catch:{ all -> 0x007e }
            java.lang.String r0 = "applicationContext"
            m.y.d.l.d(r10, r0)     // Catch:{ all -> 0x007e }
            monitor-enter(r8)     // Catch:{ all -> 0x007e }
            int r5 = r8.f1845e     // Catch:{ all -> 0x007b }
            com.facebook.y0.n0.a r0 = com.facebook.y0.n0.a.a     // Catch:{ all -> 0x007b }
            java.util.List<com.facebook.y0.v> r0 = r8.c     // Catch:{ all -> 0x007b }
            com.facebook.y0.n0.a.d(r0)     // Catch:{ all -> 0x007b }
            java.util.List<com.facebook.y0.v> r0 = r8.f1844d     // Catch:{ all -> 0x007b }
            java.util.List<com.facebook.y0.v> r2 = r8.c     // Catch:{ all -> 0x007b }
            r0.addAll(r2)     // Catch:{ all -> 0x007b }
            java.util.List<com.facebook.y0.v> r0 = r8.c     // Catch:{ all -> 0x007b }
            r0.clear()     // Catch:{ all -> 0x007b }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ all -> 0x007b }
            r0.<init>()     // Catch:{ all -> 0x007b }
            java.util.List<com.facebook.y0.v> r2 = r8.f1844d     // Catch:{ all -> 0x007b }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x007b }
        L_0x0033:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x007b }
            if (r3 == 0) goto L_0x0063
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x007b }
            com.facebook.y0.v r3 = (com.facebook.y0.v) r3     // Catch:{ all -> 0x007b }
            boolean r4 = r3.g()     // Catch:{ all -> 0x007b }
            if (r4 == 0) goto L_0x0055
            if (r11 != 0) goto L_0x004d
            boolean r4 = r3.h()     // Catch:{ all -> 0x007b }
            if (r4 != 0) goto L_0x0033
        L_0x004d:
            org.json.JSONObject r3 = r3.e()     // Catch:{ all -> 0x007b }
            r0.put(r3)     // Catch:{ all -> 0x007b }
            goto L_0x0033
        L_0x0055:
            com.facebook.internal.o0 r4 = com.facebook.internal.o0.a     // Catch:{ all -> 0x007b }
            java.lang.String r4 = f1842f     // Catch:{ all -> 0x007b }
            java.lang.String r6 = "Event with invalid checksum: "
            java.lang.String r3 = m.y.d.l.j(r6, r3)     // Catch:{ all -> 0x007b }
            com.facebook.internal.o0.e0(r4, r3)     // Catch:{ all -> 0x007b }
            goto L_0x0033
        L_0x0063:
            int r11 = r0.length()     // Catch:{ all -> 0x007b }
            if (r11 != 0) goto L_0x006b
            monitor-exit(r8)     // Catch:{ all -> 0x007e }
            return r1
        L_0x006b:
            m.s r11 = m.s.a     // Catch:{ all -> 0x007b }
            monitor-exit(r8)     // Catch:{ all -> 0x007e }
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r0
            r7 = r12
            r2.f(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x007e }
            int r9 = r0.length()     // Catch:{ all -> 0x007e }
            return r9
        L_0x007b:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x007e }
            throw r9     // Catch:{ all -> 0x007e }
        L_0x007e:
            r9 = move-exception
            com.facebook.internal.s0.n.a.b(r9, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.i0.e(com.facebook.j0, android.content.Context, boolean, boolean):int");
    }
}
