package e.b.a.a;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class b extends c {
    private final Object a = new Object();
    private final ExecutorService b = Executors.newFixedThreadPool(4, new a(this));

    class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(0);

        a(b bVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.a.getAndIncrement())}));
            return thread;
        }
    }

    public boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
