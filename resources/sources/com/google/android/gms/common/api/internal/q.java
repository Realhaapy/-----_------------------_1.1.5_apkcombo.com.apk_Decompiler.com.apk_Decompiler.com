package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import f.e.a.c.g.j;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class q {
    private final Map<BasePendingResult<?>, Boolean> a = Collections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */
    public final Map<j<?>, Boolean> b = Collections.synchronizedMap(new WeakHashMap());

    private final void f(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.a) {
            hashMap = new HashMap(this.a);
        }
        synchronized (this.b) {
            hashMap2 = new HashMap(this.b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).b(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((j) entry2.getKey()).d(new b(status));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final <TResult> void b(j<TResult> jVar, boolean z) {
        this.b.put(jVar, Boolean.valueOf(z));
        jVar.a().b(new p(this, jVar));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The connection to Google Play services was lost"
            r0.<init>(r1)
            r1 = 1
            if (r4 != r1) goto L_0x0010
            java.lang.String r4 = " due to service disconnection."
        L_0x000c:
            r0.append(r4)
            goto L_0x0016
        L_0x0010:
            r2 = 3
            if (r4 != r2) goto L_0x0016
            java.lang.String r4 = " due to dead object exception."
            goto L_0x000c
        L_0x0016:
            if (r5 == 0) goto L_0x0020
            java.lang.String r4 = " Last reason for disconnect: "
            r0.append(r4)
            r0.append(r5)
        L_0x0020:
            com.google.android.gms.common.api.Status r4 = new com.google.android.gms.common.api.Status
            r5 = 20
            java.lang.String r0 = r0.toString()
            r4.<init>((int) r5, (java.lang.String) r0)
            r3.f(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.q.c(int, java.lang.String):void");
    }

    public final void d() {
        f(false, e.f2416r);
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        return !this.a.isEmpty() || !this.b.isEmpty();
    }
}
