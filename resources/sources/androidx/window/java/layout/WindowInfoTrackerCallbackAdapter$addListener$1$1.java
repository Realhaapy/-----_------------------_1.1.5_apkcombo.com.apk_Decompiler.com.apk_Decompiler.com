package androidx.window.java.layout;

import e.f.q.a;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.k2.b;
import m.n;
import m.s;
import m.v.d;
import m.v.j.a.f;
import m.v.j.a.k;
import m.y.c.p;

@f(c = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1", f = "WindowInfoTrackerCallbackAdapter.kt", l = {96}, m = "invokeSuspend")
final class WindowInfoTrackerCallbackAdapter$addListener$1$1 extends k implements p<k0, d<? super s>, Object> {
    final /* synthetic */ a<T> $consumer;
    final /* synthetic */ b<T> $flow;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WindowInfoTrackerCallbackAdapter$addListener$1$1(b<? extends T> bVar, a<T> aVar, d<? super WindowInfoTrackerCallbackAdapter$addListener$1$1> dVar) {
        super(2, dVar);
        this.$flow = bVar;
        this.$consumer = aVar;
    }

    public final d<s> create(Object obj, d<?> dVar) {
        return new WindowInfoTrackerCallbackAdapter$addListener$1$1(this.$flow, this.$consumer, dVar);
    }

    public final Object invoke(k0 k0Var, d<? super s> dVar) {
        return ((WindowInfoTrackerCallbackAdapter$addListener$1$1) create(k0Var, dVar)).invokeSuspend(s.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = d.c();
        int i2 = this.label;
        if (i2 == 0) {
            n.b(obj);
            b<T> bVar = this.$flow;
            WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1 windowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1 = new WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1(this.$consumer);
            this.label = 1;
            if (bVar.a(windowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1, this) == c) {
                return c;
            }
        } else if (i2 == 1) {
            n.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return s.a;
    }
}
