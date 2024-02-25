package kotlinx.coroutines;

import m.s;
import m.y.c.l;

final class m1 extends t1 {

    /* renamed from: i  reason: collision with root package name */
    private final l<Throwable, s> f4879i;

    public m1(l<? super Throwable, s> lVar) {
        this.f4879i = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        x((Throwable) obj);
        return s.a;
    }

    public void x(Throwable th) {
        this.f4879i.invoke(th);
    }
}
