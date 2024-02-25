package kotlinx.coroutines.m2;

import kotlinx.coroutines.p0;

public final class k extends i {

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f4922g;

    public k(Runnable runnable, long j2, j jVar) {
        super(j2, jVar);
        this.f4922g = runnable;
    }

    public void run() {
        try {
            this.f4922g.run();
        } finally {
            this.f4921f.v();
        }
    }

    public String toString() {
        return "Task[" + p0.a(this.f4922g) + '@' + p0.b(this.f4922g) + ", " + this.f4920e + ", " + this.f4921f + ']';
    }
}
