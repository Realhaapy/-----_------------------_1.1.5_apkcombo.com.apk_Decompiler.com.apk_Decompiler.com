package f.e.a.c.g;

import android.os.Handler;
import android.os.Looper;
import f.e.a.c.d.f.a;
import java.util.concurrent.Executor;

final class i0 implements Executor {

    /* renamed from: e  reason: collision with root package name */
    private final Handler f3956e = new a(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f3956e.post(runnable);
    }
}
