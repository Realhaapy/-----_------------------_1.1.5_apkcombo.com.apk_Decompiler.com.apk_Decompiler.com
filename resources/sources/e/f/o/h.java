package e.f.o;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class h {

    private static class a implements ThreadFactory {
        private String a;
        private int b;

        /* renamed from: e.f.o.h$a$a  reason: collision with other inner class name */
        private static class C0074a extends Thread {

            /* renamed from: e  reason: collision with root package name */
            private final int f3379e;

            C0074a(Runnable runnable, String str, int i2) {
                super(runnable, str);
                this.f3379e = i2;
            }

            public void run() {
                Process.setThreadPriority(this.f3379e);
                super.run();
            }
        }

        a(String str, int i2) {
            this.a = str;
            this.b = i2;
        }

        public Thread newThread(Runnable runnable) {
            return new C0074a(runnable, this.a, this.b);
        }
    }

    private static class b<T> implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private Callable<T> f3380e;

        /* renamed from: f  reason: collision with root package name */
        private e.f.q.a<T> f3381f;

        /* renamed from: g  reason: collision with root package name */
        private Handler f3382g;

        class a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ e.f.q.a f3383e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Object f3384f;

            a(b bVar, e.f.q.a aVar, Object obj) {
                this.f3383e = aVar;
                this.f3384f = obj;
            }

            public void run() {
                this.f3383e.accept(this.f3384f);
            }
        }

        b(Handler handler, Callable<T> callable, e.f.q.a<T> aVar) {
            this.f3380e = callable;
            this.f3381f = aVar;
            this.f3382g = handler;
        }

        public void run() {
            T t;
            try {
                t = this.f3380e.call();
            } catch (Exception unused) {
                t = null;
            }
            this.f3382g.post(new a(this, this.f3381f, t));
        }
    }

    static ThreadPoolExecutor a(String str, int i2, int i3) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) i3, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static <T> void b(Executor executor, Callable<T> callable, e.f.q.a<T> aVar) {
        executor.execute(new b(c.a(), callable, aVar));
    }

    static <T> T c(ExecutorService executorService, Callable<T> callable, int i2) {
        try {
            return executorService.submit(callable).get((long) i2, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (InterruptedException e3) {
            throw e3;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
