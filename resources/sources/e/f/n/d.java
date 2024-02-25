package e.f.n;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class d {

    private static class a implements Executor {

        /* renamed from: e  reason: collision with root package name */
        private final Handler f3366e;

        a(Handler handler) {
            e.f.q.d.d(handler);
            this.f3366e = handler;
        }

        public void execute(Runnable runnable) {
            Handler handler = this.f3366e;
            e.f.q.d.d(runnable);
            if (!handler.post(runnable)) {
                throw new RejectedExecutionException(this.f3366e + " is shutting down");
            }
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
