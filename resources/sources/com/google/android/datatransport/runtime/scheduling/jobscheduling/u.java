package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.backends.m;
import f.e.a.a.i.a0.j.i0;
import f.e.a.a.i.a0.j.j0;
import f.e.a.a.i.a0.j.q0;
import f.e.a.a.i.b0.b;
import f.e.a.a.i.c0.a;
import f.e.a.a.i.i;
import f.e.a.a.i.j;
import f.e.a.a.i.p;
import f.e.a.a.i.x.a.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

public class u {
    private final Context a;
    private final e b;
    private final j0 c;

    /* renamed from: d  reason: collision with root package name */
    private final y f2338d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f2339e;

    /* renamed from: f  reason: collision with root package name */
    private final b f2340f;

    /* renamed from: g  reason: collision with root package name */
    private final a f2341g;

    /* renamed from: h  reason: collision with root package name */
    private final a f2342h;

    /* renamed from: i  reason: collision with root package name */
    private final i0 f2343i;

    public u(Context context, e eVar, j0 j0Var, y yVar, Executor executor, b bVar, a aVar, a aVar2, i0 i0Var) {
        this.a = context;
        this.b = eVar;
        this.c = j0Var;
        this.f2338d = yVar;
        this.f2339e = executor;
        this.f2340f = bVar;
        this.f2341g = aVar;
        this.f2342h = aVar2;
        this.f2343i = i0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ Boolean d(p pVar) {
        return Boolean.valueOf(this.c.I(pVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ Iterable f(p pVar) {
        return this.c.n(pVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ Object h(Iterable iterable, p pVar, long j2) {
        this.c.K(iterable);
        this.c.r(pVar, this.f2341g.a() + j2);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Object j(Iterable iterable) {
        this.c.i(iterable);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ Object l() {
        this.f2343i.o();
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Object n(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f2343i.g((long) ((Integer) entry.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object p(p pVar, long j2) {
        this.c.r(pVar, this.f2341g.a() + j2);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object r(p pVar, int i2) {
        this.f2338d.a(pVar, i2 + 1);
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        r6.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r3.f2338d.a(r4, r5 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0026 */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void t(f.e.a.a.i.p r4, int r5, java.lang.Runnable r6) {
        /*
            r3 = this;
            f.e.a.a.i.b0.b r0 = r3.f2340f     // Catch:{ a -> 0x0026 }
            f.e.a.a.i.a0.j.j0 r1 = r3.c     // Catch:{ a -> 0x0026 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ a -> 0x0026 }
            com.google.android.datatransport.runtime.scheduling.jobscheduling.b r2 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.b     // Catch:{ a -> 0x0026 }
            r2.<init>(r1)     // Catch:{ a -> 0x0026 }
            r0.a(r2)     // Catch:{ a -> 0x0026 }
            boolean r0 = r3.b()     // Catch:{ a -> 0x0026 }
            if (r0 != 0) goto L_0x0020
            f.e.a.a.i.b0.b r0 = r3.f2340f     // Catch:{ a -> 0x0026 }
            com.google.android.datatransport.runtime.scheduling.jobscheduling.k r1 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.k     // Catch:{ a -> 0x0026 }
            r1.<init>(r3, r4, r5)     // Catch:{ a -> 0x0026 }
            r0.a(r1)     // Catch:{ a -> 0x0026 }
            goto L_0x002d
        L_0x0020:
            r3.u(r4, r5)     // Catch:{ a -> 0x0026 }
            goto L_0x002d
        L_0x0024:
            r4 = move-exception
            goto L_0x0031
        L_0x0026:
            com.google.android.datatransport.runtime.scheduling.jobscheduling.y r0 = r3.f2338d     // Catch:{ all -> 0x0024 }
            int r5 = r5 + 1
            r0.a(r4, r5)     // Catch:{ all -> 0x0024 }
        L_0x002d:
            r6.run()
            return
        L_0x0031:
            r6.run()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.u.t(f.e.a.a.i.p, int, java.lang.Runnable):void");
    }

    public j a(m mVar) {
        b bVar = this.f2340f;
        i0 i0Var = this.f2343i;
        Objects.requireNonNull(i0Var);
        j.a a2 = j.a();
        a2.i(this.f2341g.a());
        a2.k(this.f2342h.a());
        a2.j("GDT_CLIENT_METRICS");
        a2.h(new i(f.e.a.a.b.b("proto"), ((f.e.a.a.i.x.a.a) bVar.a(new o(i0Var))).f()));
        return mVar.a(a2.d());
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    public g u(p pVar, int i2) {
        g b2;
        m a2 = this.b.a(pVar.b());
        long j2 = 0;
        g e2 = g.e(0);
        while (true) {
            long j3 = j2;
            while (((Boolean) this.f2340f.a(new e(this, pVar))).booleanValue()) {
                Iterable<q0> iterable = (Iterable) this.f2340f.a(new g(this, pVar));
                if (!iterable.iterator().hasNext()) {
                    return e2;
                }
                if (a2 == null) {
                    f.e.a.a.i.y.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                    b2 = g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (q0 b3 : iterable) {
                        arrayList.add(b3.b());
                    }
                    if (pVar.e()) {
                        arrayList.add(a(a2));
                    }
                    f.a a3 = f.a();
                    a3.b(arrayList);
                    a3.c(pVar.c());
                    b2 = a2.b(a3.a());
                }
                e2 = b2;
                if (e2.c() == g.a.TRANSIENT_ERROR) {
                    this.f2340f.a(new h(this, iterable, pVar, j3));
                    this.f2338d.b(pVar, i2 + 1, true);
                    return e2;
                }
                this.f2340f.a(new j(this, iterable));
                if (e2.c() == g.a.OK) {
                    j2 = Math.max(j3, e2.b());
                    if (pVar.e()) {
                        this.f2340f.a(new l(this));
                    }
                } else if (e2.c() == g.a.INVALID_PAYLOAD) {
                    HashMap hashMap = new HashMap();
                    for (q0 b4 : iterable) {
                        String j4 = b4.b().j();
                        hashMap.put(j4, !hashMap.containsKey(j4) ? 1 : Integer.valueOf(((Integer) hashMap.get(j4)).intValue() + 1));
                    }
                    this.f2340f.a(new f(this, hashMap));
                }
            }
            this.f2340f.a(new i(this, pVar, j3));
            return e2;
        }
    }

    public void v(p pVar, int i2, Runnable runnable) {
        this.f2339e.execute(new d(this, pVar, i2, runnable));
    }
}
