package kotlinx.coroutines;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final /* synthetic */ class b implements ThreadFactory {
    public final /* synthetic */ AtomicInteger a;

    public /* synthetic */ b(AtomicInteger atomicInteger) {
        this.a = atomicInteger;
    }

    public final Thread newThread(Runnable runnable) {
        return v.W(this.a, runnable);
    }
}
