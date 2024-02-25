package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m.s;
import m.y.c.l;

final class l1 extends p1 {

    /* renamed from: j  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f4872j = AtomicIntegerFieldUpdater.newUpdater(l1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: i  reason: collision with root package name */
    private final l<Throwable, s> f4873i;

    public l1(l<? super Throwable, s> lVar) {
        this.f4873i = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        x((Throwable) obj);
        return s.a;
    }

    public void x(Throwable th) {
        if (f4872j.compareAndSet(this, 0, 1)) {
            this.f4873i.invoke(th);
        }
    }
}
