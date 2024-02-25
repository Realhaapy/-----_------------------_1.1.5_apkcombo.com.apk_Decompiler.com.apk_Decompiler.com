package com.google.firebase.remoteconfig.internal;

import f.e.a.c.g.c;
import f.e.a.c.g.e;
import f.e.a.c.g.f;
import f.e.a.c.g.i;
import f.e.a.c.g.l;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class j {

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, j> f2893d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final Executor f2894e = i.f2892e;
    private final ExecutorService a;
    private final o b;
    private i<k> c = null;

    private static class b<TResult> implements f<TResult>, e, c {
        private final CountDownLatch a;

        private b() {
            this.a = new CountDownLatch(1);
        }

        public void a(Exception exc) {
            this.a.countDown();
        }

        public void b() {
            this.a.countDown();
        }

        public boolean c(long j2, TimeUnit timeUnit) {
            return this.a.await(j2, timeUnit);
        }

        public void onSuccess(TResult tresult) {
            this.a.countDown();
        }
    }

    private j(ExecutorService executorService, o oVar) {
        this.a = executorService;
        this.b = oVar;
    }

    private static <TResult> TResult a(i<TResult> iVar, long j2, TimeUnit timeUnit) {
        b bVar = new b();
        Executor executor = f2894e;
        iVar.e(executor, bVar);
        iVar.d(executor, bVar);
        iVar.a(executor, bVar);
        if (!bVar.c(j2, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        } else if (iVar.m()) {
            return iVar.i();
        } else {
            throw new ExecutionException(iVar.h());
        }
    }

    public static synchronized j f(ExecutorService executorService, o oVar) {
        j jVar;
        synchronized (j.class) {
            String b2 = oVar.b();
            Map<String, j> map = f2893d;
            if (!map.containsKey(b2)) {
                map.put(b2, new j(executorService, oVar));
            }
            jVar = map.get(b2);
        }
        return jVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ Void h(k kVar) {
        return this.b.e(kVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ i j(boolean z, k kVar, Void voidR) {
        if (z) {
            m(kVar);
        }
        return l.f(kVar);
    }

    private synchronized void m(k kVar) {
        this.c = l.f(kVar);
    }

    public void b() {
        synchronized (this) {
            this.c = l.f(null);
        }
        this.b.a();
    }

    public synchronized i<k> c() {
        i<k> iVar = this.c;
        if (iVar == null || (iVar.l() && !this.c.m())) {
            ExecutorService executorService = this.a;
            o oVar = this.b;
            Objects.requireNonNull(oVar);
            this.c = l.d(executorService, new h(oVar));
        }
        return this.c;
    }

    public k d() {
        return e(5);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return (com.google.firebase.remoteconfig.internal.k) a(c(), r3, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        android.util.Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.remoteconfig.internal.k e(long r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            f.e.a.c.g.i<com.google.firebase.remoteconfig.internal.k> r0 = r2.c     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.m()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0015
            f.e.a.c.g.i<com.google.firebase.remoteconfig.internal.k> r3 = r2.c     // Catch:{ all -> 0x0031 }
            java.lang.Object r3 = r3.i()     // Catch:{ all -> 0x0031 }
            com.google.firebase.remoteconfig.internal.k r3 = (com.google.firebase.remoteconfig.internal.k) r3     // Catch:{ all -> 0x0031 }
            monitor-exit(r2)     // Catch:{ all -> 0x0031 }
            return r3
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x0031 }
            f.e.a.c.g.i r0 = r2.c()     // Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x0025, TimeoutException -> 0x0023 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x0025, TimeoutException -> 0x0023 }
            java.lang.Object r3 = a(r0, r3, r1)     // Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x0025, TimeoutException -> 0x0023 }
            com.google.firebase.remoteconfig.internal.k r3 = (com.google.firebase.remoteconfig.internal.k) r3     // Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x0025, TimeoutException -> 0x0023 }
            return r3
        L_0x0023:
            r3 = move-exception
            goto L_0x0028
        L_0x0025:
            r3 = move-exception
            goto L_0x0028
        L_0x0027:
            r3 = move-exception
        L_0x0028:
            java.lang.String r4 = "FirebaseRemoteConfig"
            java.lang.String r0 = "Reading from storage file failed."
            android.util.Log.d(r4, r0, r3)
            r3 = 0
            return r3
        L_0x0031:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0031 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.j.e(long):com.google.firebase.remoteconfig.internal.k");
    }

    public i<k> k(k kVar) {
        return l(kVar, true);
    }

    public i<k> l(k kVar, boolean z) {
        return l.d(this.a, new a(this, kVar)).o(this.a, new b(this, z, kVar));
    }
}
