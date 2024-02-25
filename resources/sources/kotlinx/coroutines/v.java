package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import m.v.g;
import m.y.d.l;

public final class v extends e1 {

    /* renamed from: f  reason: collision with root package name */
    public static final v f4953f = new v();

    /* renamed from: g  reason: collision with root package name */
    private static final int f4954g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f4955h;
    private static volatile Executor pool;

    static {
        String str;
        int i2;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            i2 = -1;
        } else {
            Integer f2 = o.f(str);
            if (f2 == null || f2.intValue() < 1) {
                throw new IllegalStateException(l.j("Expected positive number in kotlinx.coroutines.default.parallelism, but has ", str).toString());
            }
            i2 = f2.intValue();
        }
        f4954g = i2;
    }

    private v() {
    }

    private final ExecutorService V() {
        return Executors.newFixedThreadPool(Z(), new b(new AtomicInteger()));
    }

    /* access modifiers changed from: private */
    public static final Thread W(AtomicInteger atomicInteger, Runnable runnable) {
        Thread thread = new Thread(runnable, l.j("CommonPool-worker-", Integer.valueOf(atomicInteger.incrementAndGet())));
        thread.setDaemon(true);
        return thread;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.concurrent.ExecutorService X() {
        /*
            r6 = this;
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 == 0) goto L_0x000b
            java.util.concurrent.ExecutorService r0 = r6.V()
            return r0
        L_0x000b:
            r0 = 0
            java.lang.String r1 = "java.util.concurrent.ForkJoinPool"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0013 }
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r1 != 0) goto L_0x001b
            java.util.concurrent.ExecutorService r0 = r6.V()
            return r0
        L_0x001b:
            boolean r2 = f4955h
            r3 = 0
            if (r2 != 0) goto L_0x004b
            int r2 = f4954g
            if (r2 >= 0) goto L_0x004b
            java.lang.String r2 = "commonPool"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0039 }
            java.lang.reflect.Method r2 = r1.getMethod(r2, r4)     // Catch:{ all -> 0x0039 }
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0039 }
            java.lang.Object r2 = r2.invoke(r0, r4)     // Catch:{ all -> 0x0039 }
            boolean r4 = r2 instanceof java.util.concurrent.ExecutorService     // Catch:{ all -> 0x0039 }
            if (r4 == 0) goto L_0x0039
            java.util.concurrent.ExecutorService r2 = (java.util.concurrent.ExecutorService) r2     // Catch:{ all -> 0x0039 }
            goto L_0x003a
        L_0x0039:
            r2 = r0
        L_0x003a:
            if (r2 != 0) goto L_0x003d
            goto L_0x004b
        L_0x003d:
            kotlinx.coroutines.v r4 = f4953f
            boolean r4 = r4.a0(r1, r2)
            if (r4 == 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r2 = r0
        L_0x0047:
            if (r2 != 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            return r2
        L_0x004b:
            r2 = 1
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ all -> 0x0070 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0070 }
            r4[r3] = r5     // Catch:{ all -> 0x0070 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r4)     // Catch:{ all -> 0x0070 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0070 }
            kotlinx.coroutines.v r4 = f4953f     // Catch:{ all -> 0x0070 }
            int r4 = r4.Z()     // Catch:{ all -> 0x0070 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0070 }
            r2[r3] = r4     // Catch:{ all -> 0x0070 }
            java.lang.Object r1 = r1.newInstance(r2)     // Catch:{ all -> 0x0070 }
            boolean r2 = r1 instanceof java.util.concurrent.ExecutorService     // Catch:{ all -> 0x0070 }
            if (r2 == 0) goto L_0x0071
            java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1     // Catch:{ all -> 0x0070 }
            r0 = r1
            goto L_0x0071
        L_0x0070:
        L_0x0071:
            if (r0 != 0) goto L_0x0077
            java.util.concurrent.ExecutorService r0 = r6.V()
        L_0x0077:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.v.X():java.util.concurrent.ExecutorService");
    }

    private final synchronized Executor Y() {
        Executor executor;
        executor = pool;
        if (executor == null) {
            executor = X();
            pool = executor;
        }
        return executor;
    }

    private final int Z() {
        Integer valueOf = Integer.valueOf(f4954g);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        return valueOf == null ? f.a(Runtime.getRuntime().availableProcessors() - 1, 1) : valueOf.intValue();
    }

    /* access modifiers changed from: private */
    public static final void b0() {
    }

    public void T(g gVar, Runnable runnable) {
        try {
            Executor executor = pool;
            if (executor == null) {
                executor = Y();
            }
            d a = e.a();
            executor.execute(a == null ? runnable : a.h(runnable));
        } catch (RejectedExecutionException unused) {
            d a2 = e.a();
            if (a2 != null) {
                a2.e();
            }
            q0.f4936k.l0(runnable);
        }
    }

    public final boolean a0(Class<?> cls, ExecutorService executorService) {
        executorService.submit(a.f4781e);
        Integer num = null;
        try {
            Object invoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
            if (invoke instanceof Integer) {
                num = (Integer) invoke;
            }
        } catch (Throwable unused) {
        }
        return num != null && num.intValue() >= 1;
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    public String toString() {
        return "CommonPool";
    }
}
