package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import e.f.q.a;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import m.s;
import m.y.d.l;

public final class ExtensionWindowLayoutInfoBackend implements WindowBackend {
    private final Map<Activity, MulticastConsumer> activityToListeners = new LinkedHashMap();
    private final WindowLayoutComponent component;
    private final ReentrantLock extensionWindowBackendLock = new ReentrantLock();
    private final Map<a<WindowLayoutInfo>, Activity> listenerToActivity = new LinkedHashMap();

    @SuppressLint({"NewApi"})
    private static final class MulticastConsumer implements Consumer<WindowLayoutInfo> {
        private final Activity activity;
        private WindowLayoutInfo lastKnownValue;
        private final ReentrantLock multicastConsumerLock = new ReentrantLock();
        private final Set<a<WindowLayoutInfo>> registeredListeners = new LinkedHashSet();

        public MulticastConsumer(Activity activity2) {
            l.d(activity2, "activity");
            this.activity = activity2;
        }

        public void accept(WindowLayoutInfo windowLayoutInfo) {
            l.d(windowLayoutInfo, "value");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                this.lastKnownValue = ExtensionsWindowLayoutInfoAdapter.INSTANCE.translate$window_release(this.activity, windowLayoutInfo);
                for (a accept : this.registeredListeners) {
                    accept.accept(this.lastKnownValue);
                }
                s sVar = s.a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void addListener(a<WindowLayoutInfo> aVar) {
            l.d(aVar, "listener");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                WindowLayoutInfo windowLayoutInfo = this.lastKnownValue;
                if (windowLayoutInfo != null) {
                    aVar.accept(windowLayoutInfo);
                }
                this.registeredListeners.add(aVar);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final boolean isEmpty() {
            return this.registeredListeners.isEmpty();
        }

        public final void removeListener(a<WindowLayoutInfo> aVar) {
            l.d(aVar, "listener");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                this.registeredListeners.remove(aVar);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public ExtensionWindowLayoutInfoBackend(WindowLayoutComponent windowLayoutComponent) {
        l.d(windowLayoutComponent, "component");
        this.component = windowLayoutComponent;
    }

    public void registerLayoutChangeCallback(Activity activity, Executor executor, a<WindowLayoutInfo> aVar) {
        s sVar;
        l.d(activity, "activity");
        l.d(executor, "executor");
        l.d(aVar, "callback");
        ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = this.activityToListeners.get(activity);
            if (multicastConsumer == null) {
                sVar = null;
            } else {
                multicastConsumer.addListener(aVar);
                this.listenerToActivity.put(aVar, activity);
                sVar = s.a;
            }
            if (sVar == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(activity);
                this.activityToListeners.put(activity, multicastConsumer2);
                this.listenerToActivity.put(aVar, activity);
                multicastConsumer2.addListener(aVar);
                this.component.addWindowLayoutInfoListener(activity, multicastConsumer2);
            }
            s sVar2 = s.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void unregisterLayoutChangeCallback(a<WindowLayoutInfo> aVar) {
        l.d(aVar, "callback");
        ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            Activity activity = this.listenerToActivity.get(aVar);
            if (activity != null) {
                MulticastConsumer multicastConsumer = this.activityToListeners.get(activity);
                if (multicastConsumer == null) {
                    reentrantLock.unlock();
                    return;
                }
                multicastConsumer.removeListener(aVar);
                if (multicastConsumer.isEmpty()) {
                    this.component.removeWindowLayoutInfoListener(multicastConsumer);
                }
                s sVar = s.a;
                reentrantLock.unlock();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
