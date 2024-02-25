package r.b.a.y;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public abstract class h {
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private static final AtomicReference<h> b = new AtomicReference<>();

    static class a extends h {
        a() {
        }

        /* access modifiers changed from: protected */
        public void b() {
            Class<i> cls = i.class;
            Iterator<S> it = ServiceLoader.load(cls, cls.getClassLoader()).iterator();
            while (it.hasNext()) {
                try {
                    i.f((i) it.next());
                } catch (ServiceConfigurationError e2) {
                    if (!(e2.getCause() instanceof SecurityException)) {
                        throw e2;
                    }
                }
            }
        }
    }

    static void a() {
        if (!a.getAndSet(true)) {
            AtomicReference<h> atomicReference = b;
            atomicReference.compareAndSet((Object) null, new a());
            atomicReference.get().b();
            return;
        }
        throw new IllegalStateException("Already initialized");
    }

    public static void c(h hVar) {
        if (a.get()) {
            throw new IllegalStateException("Already initialized");
        } else if (!b.compareAndSet((Object) null, hVar)) {
            throw new IllegalStateException("Initializer was already set, possibly with a default during initialization");
        }
    }

    /* access modifiers changed from: protected */
    public abstract void b();
}
