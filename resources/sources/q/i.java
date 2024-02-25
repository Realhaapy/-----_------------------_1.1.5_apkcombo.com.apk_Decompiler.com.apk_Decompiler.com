package q;

import java.util.concurrent.TimeUnit;

public class i extends t {

    /* renamed from: e  reason: collision with root package name */
    private t f5485e;

    public i(t tVar) {
        if (tVar != null) {
            this.f5485e = tVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public t a() {
        return this.f5485e.a();
    }

    public t b() {
        return this.f5485e.b();
    }

    public long c() {
        return this.f5485e.c();
    }

    public t d(long j2) {
        return this.f5485e.d(j2);
    }

    public boolean e() {
        return this.f5485e.e();
    }

    public void f() {
        this.f5485e.f();
    }

    public t g(long j2, TimeUnit timeUnit) {
        return this.f5485e.g(j2, timeUnit);
    }

    public final t i() {
        return this.f5485e;
    }

    public final i j(t tVar) {
        if (tVar != null) {
            this.f5485e = tVar;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }
}
