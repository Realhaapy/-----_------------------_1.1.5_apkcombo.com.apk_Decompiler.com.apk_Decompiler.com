package kotlinx.coroutines;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public final class q0 extends z0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: k  reason: collision with root package name */
    public static final q0 f4936k;

    /* renamed from: l  reason: collision with root package name */
    private static final long f4937l;

    static {
        Long l2;
        q0 q0Var = new q0();
        f4936k = q0Var;
        y0.a0(q0Var, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f4937l = timeUnit.toNanos(l2.longValue());
    }

    private q0() {
    }

    private final synchronized void w0() {
        if (y0()) {
            debugStatus = 3;
            r0();
            notifyAll();
        }
    }

    private final synchronized Thread x0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean y0() {
        int i2 = debugStatus;
        return i2 == 2 || i2 == 3;
    }

    private final synchronized boolean z0() {
        if (y0()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* access modifiers changed from: protected */
    public Thread f0() {
        Thread thread = _thread;
        return thread == null ? x0() : thread;
    }

    public void run() {
        e2.a.c(this);
        d a = e.a();
        if (a != null) {
            a.c();
        }
        try {
            if (z0()) {
                long j2 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long p0 = p0();
                    if (p0 == Long.MAX_VALUE) {
                        d a2 = e.a();
                        long nanoTime = a2 == null ? System.nanoTime() : a2.a();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f4937l + nanoTime;
                        }
                        long j3 = j2 - nanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            w0();
                            d a3 = e.a();
                            if (a3 != null) {
                                a3.g();
                            }
                            if (!o0()) {
                                f0();
                                return;
                            }
                            return;
                        }
                        p0 = f.d(p0, j3);
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (p0 > 0) {
                        if (y0()) {
                            _thread = null;
                            w0();
                            d a4 = e.a();
                            if (a4 != null) {
                                a4.g();
                            }
                            if (!o0()) {
                                f0();
                                return;
                            }
                            return;
                        }
                        d a5 = e.a();
                        if (a5 == null) {
                            LockSupport.parkNanos(this, p0);
                        } else {
                            a5.b(this, p0);
                        }
                    }
                }
            }
        } finally {
            _thread = null;
            w0();
            d a6 = e.a();
            if (a6 != null) {
                a6.g();
            }
            if (!o0()) {
                f0();
            }
        }
    }
}
