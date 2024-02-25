package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class s {
    private final Map<String, Object> a = new HashMap();
    private volatile boolean b = false;

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.b = true;
        Map<String, Object> map = this.a;
        if (map != null) {
            synchronized (map) {
                for (Object b2 : this.a.values()) {
                    b(b2);
                }
            }
        }
        d();
    }

    /* access modifiers changed from: package-private */
    public <T> T c(String str) {
        T t;
        Map<String, Object> map = this.a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = this.a.get(str);
        }
        return t;
    }

    /* access modifiers changed from: protected */
    public void d() {
    }

    /* access modifiers changed from: package-private */
    public <T> T e(String str, T t) {
        T t2;
        synchronized (this.a) {
            t2 = this.a.get(str);
            if (t2 == null) {
                this.a.put(str, t);
            }
        }
        if (t2 != null) {
            t = t2;
        }
        if (this.b) {
            b(t);
        }
        return t;
    }
}
