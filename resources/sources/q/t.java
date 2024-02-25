package q;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class t {

    /* renamed from: d  reason: collision with root package name */
    public static final t f5512d = new a();
    private boolean a;
    private long b;
    private long c;

    class a extends t {
        a() {
        }

        public t d(long j2) {
            return this;
        }

        public void f() {
        }

        public t g(long j2, TimeUnit timeUnit) {
            return this;
        }
    }

    public t a() {
        this.a = false;
        return this;
    }

    public t b() {
        this.c = 0;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public t d(long j2) {
        this.a = true;
        this.b = j2;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public t g(long j2, TimeUnit timeUnit) {
        if (j2 < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j2);
        } else if (timeUnit != null) {
            this.c = timeUnit.toNanos(j2);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public long h() {
        return this.c;
    }
}
