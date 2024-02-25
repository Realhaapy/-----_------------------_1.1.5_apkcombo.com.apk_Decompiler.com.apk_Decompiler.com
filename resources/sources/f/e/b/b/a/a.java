package f.e.b.b.a;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public abstract class a<V> extends f.e.b.b.a.i.a implements e<V> {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f3977h = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: i  reason: collision with root package name */
    private static final Logger f3978i = Logger.getLogger(a.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final b f3979j;

    /* renamed from: k  reason: collision with root package name */
    private static final Object f3980k = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f3981e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public volatile e f3982f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public volatile l f3983g;

    private static abstract class b {
        private b() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a(a<?> aVar, e eVar, e eVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        public abstract boolean c(a<?> aVar, l lVar, l lVar2);

        /* access modifiers changed from: package-private */
        public abstract void d(l lVar, l lVar2);

        /* access modifiers changed from: package-private */
        public abstract void e(l lVar, Thread thread);
    }

    private static final class c {
        static final c c;

        /* renamed from: d  reason: collision with root package name */
        static final c f3984d;
        final boolean a;
        final Throwable b;

        static {
            if (a.f3977h) {
                f3984d = null;
                c = null;
                return;
            }
            f3984d = new c(false, (Throwable) null);
            c = new c(true, (Throwable) null);
        }

        c(boolean z, Throwable th) {
            this.a = z;
            this.b = th;
        }
    }

    private static final class d {
        final Throwable a;

        /* renamed from: f.e.b.b.a.a$d$a  reason: collision with other inner class name */
        static class C0110a extends Throwable {
            C0110a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new d(new C0110a("Failure occurred while trying to finish a future."));
        }

        d(Throwable th) {
            f.e.b.a.b.b(th);
            this.a = th;
        }
    }

    private static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f3985d = new e((Runnable) null, (Executor) null);
        final Runnable a;
        final Executor b;
        e c;

        e(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }

    private static final class f extends b {
        final AtomicReferenceFieldUpdater<l, Thread> a;
        final AtomicReferenceFieldUpdater<l, l> b;
        final AtomicReferenceFieldUpdater<a, l> c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f3986d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f3987e;

        f(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.f3986d = atomicReferenceFieldUpdater4;
            this.f3987e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return this.f3986d.compareAndSet(aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            return this.f3987e.compareAndSet(aVar, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public boolean c(a<?> aVar, l lVar, l lVar2) {
            return this.c.compareAndSet(aVar, lVar, lVar2);
        }

        /* access modifiers changed from: package-private */
        public void d(l lVar, l lVar2) {
            this.b.lazySet(lVar, lVar2);
        }

        /* access modifiers changed from: package-private */
        public void e(l lVar, Thread thread) {
            this.a.lazySet(lVar, thread);
        }
    }

    private static final class g<V> implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final a<V> f3988e;

        /* renamed from: f  reason: collision with root package name */
        final e<? extends V> f3989f;

        public void run() {
            if (this.f3988e.f3981e == this) {
                if (a.f3979j.b(this.f3988e, this, a.t(this.f3989f))) {
                    a.q(this.f3988e);
                }
            }
        }
    }

    private static final class h extends b {
        private h() {
            super();
        }

        /* access modifiers changed from: package-private */
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f3982f != eVar) {
                    return false;
                }
                e unused = aVar.f3982f = eVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f3981e != obj) {
                    return false;
                }
                Object unused = aVar.f3981e = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(a<?> aVar, l lVar, l lVar2) {
            synchronized (aVar) {
                if (aVar.f3983g != lVar) {
                    return false;
                }
                l unused = aVar.f3983g = lVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public void d(l lVar, l lVar2) {
            lVar.b = lVar2;
        }

        /* access modifiers changed from: package-private */
        public void e(l lVar, Thread thread) {
            lVar.a = thread;
        }
    }

    interface i<V> extends e<V> {
    }

    static abstract class j<V> extends a<V> implements i<V> {
        j() {
        }

        public final void a(Runnable runnable, Executor executor) {
            a.super.a(runnable, executor);
        }

        public final boolean cancel(boolean z) {
            return a.super.cancel(z);
        }

        public final V get() {
            return a.super.get();
        }

        public final V get(long j2, TimeUnit timeUnit) {
            return a.super.get(j2, timeUnit);
        }

        public final boolean isCancelled() {
            return a.super.isCancelled();
        }

        public final boolean isDone() {
            return a.super.isDone();
        }
    }

    private static final class k extends b {
        static final Unsafe a;
        static final long b;
        static final long c;

        /* renamed from: d  reason: collision with root package name */
        static final long f3990d;

        /* renamed from: e  reason: collision with root package name */
        static final long f3991e;

        /* renamed from: f  reason: collision with root package name */
        static final long f3992f;

        /* renamed from: f.e.b.b.a.a$k$a  reason: collision with other inner class name */
        static class C0111a implements PrivilegedExceptionAction<Unsafe> {
            C0111a() {
            }

            /* renamed from: a */
            public Unsafe run() {
                Class<Unsafe> cls = Unsafe.class;
                for (Field field : cls.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get((Object) null);
                    if (cls.isInstance(obj)) {
                        return cls.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
            r1 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new f.e.b.b.a.a.k.C0111a());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        static {
            /*
                java.lang.Class<f.e.b.b.a.a$l> r0 = f.e.b.b.a.a.l.class
                sun.misc.Unsafe r1 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0007 }
                goto L_0x0012
            L_0x0007:
                f.e.b.b.a.a$k$a r1 = new f.e.b.b.a.a$k$a     // Catch:{ PrivilegedActionException -> 0x005d }
                r1.<init>()     // Catch:{ PrivilegedActionException -> 0x005d }
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch:{ PrivilegedActionException -> 0x005d }
                sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch:{ PrivilegedActionException -> 0x005d }
            L_0x0012:
                java.lang.Class<f.e.b.b.a.a> r2 = f.e.b.b.a.a.class
                java.lang.String r3 = "g"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                c = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "f"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                b = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "e"
                java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                f3990d = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "a"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                f3991e = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "b"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
                f3992f = r2     // Catch:{ Exception -> 0x0053 }
                a = r1     // Catch:{ Exception -> 0x0053 }
                return
            L_0x0053:
                r0 = move-exception
                f.e.b.a.d.e(r0)
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x005d:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.Throwable r0 = r0.getCause()
                java.lang.String r2 = "Could not initialize intrinsics"
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.b.b.a.a.k.<clinit>():void");
        }

        private k() {
            super();
        }

        /* access modifiers changed from: package-private */
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return a.compareAndSwapObject(aVar, b, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            return a.compareAndSwapObject(aVar, f3990d, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public boolean c(a<?> aVar, l lVar, l lVar2) {
            return a.compareAndSwapObject(aVar, c, lVar, lVar2);
        }

        /* access modifiers changed from: package-private */
        public void d(l lVar, l lVar2) {
            a.putObject(lVar, f3992f, lVar2);
        }

        /* access modifiers changed from: package-private */
        public void e(l lVar, Thread thread) {
            a.putObject(lVar, f3991e, thread);
        }
    }

    private static final class l {
        static final l c = new l(false);
        volatile Thread a;
        volatile l b;

        l() {
            a.f3979j.e(this, Thread.currentThread());
        }

        l(boolean z) {
        }

        /* access modifiers changed from: package-private */
        public void a(l lVar) {
            a.f3979j.d(this, lVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Thread thread = this.a;
            if (thread != null) {
                this.a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        b bVar;
        Class<l> cls = l.class;
        Throwable th = null;
        try {
            bVar = new k();
            th = null;
        } catch (Throwable th2) {
            bVar = new h();
            th = th2;
        }
        f3979j = bVar;
        Class<LockSupport> cls2 = LockSupport.class;
        if (th != null) {
            Logger logger = f3978i;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th);
        }
    }

    protected a() {
    }

    private String B(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private void m(StringBuilder sb) {
        String str = "]";
        try {
            Object u = u(this);
            sb.append("SUCCESS, result=[");
            sb.append(B(u));
            sb.append(str);
            return;
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
        } catch (CancellationException unused) {
            str = "CANCELLED";
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            str = " thrown from get()]";
        }
        sb.append(str);
    }

    private static CancellationException o(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private e p(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f3982f;
        } while (!f3979j.a(this, eVar2, e.f3985d));
        e eVar3 = eVar2;
        e eVar4 = eVar;
        e eVar5 = eVar3;
        while (eVar5 != null) {
            e eVar6 = eVar5.c;
            eVar5.c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    /* access modifiers changed from: private */
    public static void q(a<?> aVar) {
        e eVar = null;
        a<V> aVar2 = aVar;
        while (true) {
            aVar2.x();
            aVar2.n();
            e p2 = aVar2.p(eVar);
            while (true) {
                if (p2 != null) {
                    eVar = p2.c;
                    Runnable runnable = p2.a;
                    if (runnable instanceof g) {
                        g gVar = (g) runnable;
                        a<V> aVar3 = gVar.f3988e;
                        if (aVar3.f3981e == gVar) {
                            if (f3979j.b(aVar3, gVar, t(gVar.f3989f))) {
                                aVar2 = aVar3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        r(runnable, p2.b);
                    }
                    p2 = eVar;
                } else {
                    return;
                }
            }
        }
    }

    private static void r(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f3978i;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e2);
        }
    }

    private V s(Object obj) {
        if (obj instanceof c) {
            throw o("Task was cancelled.", ((c) obj).b);
        } else if (obj instanceof d) {
            throw new ExecutionException(((d) obj).a);
        } else if (obj == f3980k) {
            return null;
        } else {
            return obj;
        }
    }

    /* access modifiers changed from: private */
    public static Object t(e<?> eVar) {
        Throwable a;
        if (eVar instanceof i) {
            Object obj = ((a) eVar).f3981e;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.a ? cVar.b != null ? new c(false, cVar.b) : c.f3984d : obj;
        } else if ((eVar instanceof f.e.b.b.a.i.a) && (a = f.e.b.b.a.i.b.a((f.e.b.b.a.i.a) eVar)) != null) {
            return new d(a);
        } else {
            boolean isCancelled = eVar.isCancelled();
            if ((!f3977h) && isCancelled) {
                return c.f3984d;
            }
            try {
                Object u = u(eVar);
                if (!isCancelled) {
                    return u == null ? f3980k : u;
                }
                return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + eVar));
            } catch (ExecutionException e2) {
                if (!isCancelled) {
                    return new d(e2.getCause());
                }
                return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + eVar, e2));
            } catch (CancellationException e3) {
                if (isCancelled) {
                    return new c(false, e3);
                }
                return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + eVar, e3));
            } catch (Throwable th) {
                return new d(th);
            }
        }
    }

    private static <V> V u(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    private void x() {
        l lVar;
        do {
            lVar = this.f3983g;
        } while (!f3979j.c(this, lVar, l.c));
        while (lVar != null) {
            lVar.b();
            lVar = lVar.b;
        }
    }

    private void y(l lVar) {
        lVar.a = null;
        while (true) {
            l lVar2 = this.f3983g;
            if (lVar2 != l.c) {
                l lVar3 = null;
                while (lVar2 != null) {
                    l lVar4 = lVar2.b;
                    if (lVar2.a != null) {
                        lVar3 = lVar2;
                    } else if (lVar3 != null) {
                        lVar3.b = lVar4;
                        if (lVar3.a == null) {
                        }
                    } else if (!f3979j.c(this, lVar2, lVar4)) {
                    }
                    lVar2 = lVar4;
                }
                return;
            }
            return;
        }
    }

    /* access modifiers changed from: protected */
    public boolean A(Throwable th) {
        f.e.b.a.b.b(th);
        if (!f3979j.b(this, (Object) null, new d(th))) {
            return false;
        }
        q(this);
        return true;
    }

    public void a(Runnable runnable, Executor executor) {
        e eVar;
        f.e.b.a.b.c(runnable, "Runnable was null.");
        f.e.b.a.b.c(executor, "Executor was null.");
        if (isDone() || (eVar = this.f3982f) == e.f3985d) {
            r(runnable, executor);
        }
        e eVar2 = new e(runnable, executor);
        do {
            eVar2.c = eVar;
            if (!f3979j.a(this, eVar, eVar2)) {
                eVar = this.f3982f;
            } else {
                return;
            }
        } while (eVar != e.f3985d);
        r(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public final Throwable b() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.f3981e;
        if (obj instanceof d) {
            return ((d) obj).a;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, f.e.b.b.a.e<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f3981e
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof f.e.b.b.a.a.g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f3977h
            if (r3 == 0) goto L_0x001f
            f.e.b.b.a.a$c r3 = new f.e.b.b.a.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            f.e.b.b.a.a$c r3 = f.e.b.b.a.a.c.c
            goto L_0x0026
        L_0x0024:
            f.e.b.b.a.a$c r3 = f.e.b.b.a.a.c.f3984d
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            f.e.b.b.a.a$b r6 = f3979j
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.v()
        L_0x0035:
            q(r4)
            boolean r4 = r0 instanceof f.e.b.b.a.a.g
            if (r4 == 0) goto L_0x0062
            f.e.b.b.a.a$g r0 = (f.e.b.b.a.a.g) r0
            f.e.b.b.a.e<? extends V> r0 = r0.f3989f
            boolean r4 = r0 instanceof f.e.b.b.a.a.i
            if (r4 == 0) goto L_0x0055
            r4 = r0
            f.e.b.b.a.a r4 = (f.e.b.b.a.a) r4
            java.lang.Object r0 = r4.f3981e
            if (r0 != 0) goto L_0x004d
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            boolean r6 = r0 instanceof f.e.b.b.a.a.g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = 1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f3981e
            boolean r6 = r0 instanceof f.e.b.b.a.a.g
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.b.b.a.a.cancel(boolean):boolean");
    }

    public V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f3981e;
            if ((obj2 != null) && (!(obj2 instanceof g))) {
                return s(obj2);
            }
            l lVar = this.f3983g;
            if (lVar != l.c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (f3979j.c(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3981e;
                            } else {
                                y(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return s(obj);
                    }
                    lVar = this.f3983g;
                } while (lVar != l.c);
            }
            return s(this.f3981e);
        }
        throw new InterruptedException();
    }

    public V get(long j2, TimeUnit timeUnit) {
        long j3 = j2;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.f3981e;
            if ((obj != null) && (!(obj instanceof g))) {
                return s(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                l lVar = this.f3983g;
                if (lVar != l.c) {
                    l lVar2 = new l();
                    do {
                        lVar2.a(lVar);
                        if (f3979j.c(this, lVar, lVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f3981e;
                                    if ((obj2 != null) && (!(obj2 instanceof g))) {
                                        return s(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    y(lVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            y(lVar2);
                        } else {
                            lVar = this.f3983g;
                        }
                    } while (lVar != l.c);
                }
                return s(this.f3981e);
            }
            while (nanos > 0) {
                Object obj3 = this.f3981e;
                if ((obj3 != null) && (!(obj3 instanceof g))) {
                    return s(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String timeUnit3 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit3.toLowerCase(locale);
            String str = "Waited " + j3 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j4 = -nanos;
                long convert = timeUnit2.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit2.toNanos(convert);
                int i2 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z = i2 == 0 || nanos2 > 1000;
                if (i2 > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    public boolean isCancelled() {
        return this.f3981e instanceof c;
    }

    public boolean isDone() {
        Object obj = this.f3981e;
        return (!(obj instanceof g)) & (obj != null);
    }

    /* access modifiers changed from: protected */
    public void n() {
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            str2 = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    str = w();
                } catch (RuntimeException e2) {
                    str = "Exception thrown from implementation: " + e2.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                } else if (!isDone()) {
                    str2 = "PENDING";
                }
            }
            m(sb);
            sb.append("]");
            return sb.toString();
        }
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public void v() {
    }

    /* access modifiers changed from: protected */
    public String w() {
        Object obj = this.f3981e;
        if (obj instanceof g) {
            return "setFuture=[" + B(((g) obj).f3989f) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* access modifiers changed from: protected */
    public boolean z(V v) {
        if (v == null) {
            v = f3980k;
        }
        if (!f3979j.b(this, (Object) null, v)) {
            return false;
        }
        q(this);
        return true;
    }
}
