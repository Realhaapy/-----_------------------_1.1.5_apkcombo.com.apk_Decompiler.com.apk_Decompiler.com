package kotlinx.coroutines;

import java.util.List;
import m.v.g;

public final class g0 {
    private static final List<CoroutineExceptionHandler> a = h.f(f.a(a.a()));

    public static final void a(g gVar, Throwable th) {
        for (CoroutineExceptionHandler handleException : a) {
            try {
                handleException.handleException(gVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, h0.b(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
