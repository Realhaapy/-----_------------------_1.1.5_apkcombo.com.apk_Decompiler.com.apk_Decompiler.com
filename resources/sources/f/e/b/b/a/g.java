package f.e.b.b.a;

import f.e.b.a.b;
import java.lang.Thread;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class g {
    private String a = null;
    private Boolean b = null;
    private Integer c = null;

    /* renamed from: d  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f3995d = null;

    /* renamed from: e  reason: collision with root package name */
    private ThreadFactory f3996e = null;

    static class a implements ThreadFactory {
        final /* synthetic */ ThreadFactory a;
        final /* synthetic */ String b;
        final /* synthetic */ AtomicLong c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Boolean f3997d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Integer f3998e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f3999f;

        a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.a = threadFactory;
            this.b = str;
            this.c = atomicLong;
            this.f3997d = bool;
            this.f3998e = num;
            this.f3999f = uncaughtExceptionHandler;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = this.a.newThread(runnable);
            String str = this.b;
            if (str != null) {
                newThread.setName(g.d(str, Long.valueOf(this.c.getAndIncrement())));
            }
            Boolean bool = this.f3997d;
            if (bool != null) {
                newThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f3998e;
            if (num != null) {
                newThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f3999f;
            if (uncaughtExceptionHandler != null) {
                newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return newThread;
        }
    }

    private static ThreadFactory c(g gVar) {
        String str = gVar.a;
        Boolean bool = gVar.b;
        Integer num = gVar.c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = gVar.f3995d;
        ThreadFactory threadFactory = gVar.f3996e;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactory, str, str != null ? new AtomicLong(0) : null, bool, num, uncaughtExceptionHandler);
    }

    /* access modifiers changed from: private */
    public static String d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public ThreadFactory b() {
        return c(this);
    }

    public g e(String str) {
        d(str, 0);
        this.a = str;
        return this;
    }

    public g f(int i2) {
        boolean z = false;
        b.a(i2 >= 1, "Thread priority (%s) must be >= %s", i2, 1);
        if (i2 <= 10) {
            z = true;
        }
        b.a(z, "Thread priority (%s) must be <= %s", i2, 10);
        this.c = Integer.valueOf(i2);
        return this;
    }
}
