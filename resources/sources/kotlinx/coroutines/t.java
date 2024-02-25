package kotlinx.coroutines;

import m.s;

public final class t extends p1 implements s {

    /* renamed from: i  reason: collision with root package name */
    public final u f4942i;

    public t(u uVar) {
        this.f4942i = uVar;
    }

    public boolean f(Throwable th) {
        return y().v(th);
    }

    public n1 getParent() {
        return y();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        x((Throwable) obj);
        return s.a;
    }

    public void x(Throwable th) {
        this.f4942i.L(y());
    }
}
