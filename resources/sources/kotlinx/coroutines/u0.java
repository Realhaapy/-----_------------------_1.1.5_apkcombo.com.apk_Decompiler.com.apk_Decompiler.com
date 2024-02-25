package kotlinx.coroutines;

import java.util.concurrent.Executor;
import m.v.h;

final class u0 implements Executor {

    /* renamed from: e  reason: collision with root package name */
    public final f0 f4944e;

    public void execute(Runnable runnable) {
        this.f4944e.T(h.f5035e, runnable);
    }

    public String toString() {
        return this.f4944e.toString();
    }
}
