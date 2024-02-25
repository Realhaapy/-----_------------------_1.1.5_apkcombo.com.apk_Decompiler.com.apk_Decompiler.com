package androidx.window.java.layout;

import e.f.q.a;
import kotlinx.coroutines.k2.c;
import m.s;
import m.v.d;

public final class WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1 implements c<T> {
    final /* synthetic */ a $consumer$inlined;

    public WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1(a aVar) {
        this.$consumer$inlined = aVar;
    }

    public Object emit(T t, d<? super s> dVar) {
        this.$consumer$inlined.accept(t);
        return s.a;
    }
}
