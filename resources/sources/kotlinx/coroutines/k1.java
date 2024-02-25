package kotlinx.coroutines;

import m.s;
import m.y.c.l;

final class k1 extends k {

    /* renamed from: e  reason: collision with root package name */
    private final l<Throwable, s> f4854e;

    public k1(l<? super Throwable, s> lVar) {
        this.f4854e = lVar;
    }

    public void a(Throwable th) {
        this.f4854e.invoke(th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return s.a;
    }

    public String toString() {
        return "InvokeOnCancel[" + p0.a(this.f4854e) + '@' + p0.b(this) + ']';
    }
}
