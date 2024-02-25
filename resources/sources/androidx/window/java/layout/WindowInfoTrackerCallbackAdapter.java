package androidx.window.java.layout;

import android.app.Activity;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import e.f.q.a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.k2.b;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.n1;
import m.s;
import m.v.d;
import m.v.g;
import m.y.d.l;

public final class WindowInfoTrackerCallbackAdapter implements WindowInfoTracker {
    private final Map<a<?>, n1> consumerToJobMap = new LinkedHashMap();
    private final ReentrantLock lock = new ReentrantLock();
    private final WindowInfoTracker tracker;

    public WindowInfoTrackerCallbackAdapter(WindowInfoTracker windowInfoTracker) {
        l.d(windowInfoTracker, "tracker");
        this.tracker = windowInfoTracker;
    }

    private final <T> void addListener(Executor executor, a<T> aVar, b<? extends T> bVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.consumerToJobMap.get(aVar) == null) {
                this.consumerToJobMap.put(aVar, j.b(l0.a(g1.a(executor)), (g) null, (m0) null, new WindowInfoTrackerCallbackAdapter$addListener$1$1(bVar, aVar, (d<? super WindowInfoTrackerCallbackAdapter$addListener$1$1>) null), 3, (Object) null));
            }
            s sVar = s.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void removeListener(a<?> aVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            n1 n1Var = this.consumerToJobMap.get(aVar);
            if (n1Var != null) {
                n1.a.a(n1Var, (CancellationException) null, 1, (Object) null);
            }
            n1 remove = this.consumerToJobMap.remove(aVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void addWindowLayoutInfoListener(Activity activity, Executor executor, a<WindowLayoutInfo> aVar) {
        l.d(activity, "activity");
        l.d(executor, "executor");
        l.d(aVar, "consumer");
        addListener(executor, aVar, this.tracker.windowLayoutInfo(activity));
    }

    public final void removeWindowLayoutInfoListener(a<WindowLayoutInfo> aVar) {
        l.d(aVar, "consumer");
        removeListener(aVar);
    }

    public b<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        l.d(activity, "activity");
        return this.tracker.windowLayoutInfo(activity);
    }
}
