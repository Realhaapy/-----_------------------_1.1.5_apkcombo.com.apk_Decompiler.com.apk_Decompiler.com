package kotlinx.coroutines.k2.g;

import kotlinx.coroutines.k2.c;
import m.s;
import m.y.c.q;
import m.y.d.j;
import m.y.d.t;

public final class d {
    /* access modifiers changed from: private */
    public static final q<c<Object>, Object, m.v.d<? super s>, Object> a;

    /* synthetic */ class a extends j implements q<c<? super Object>, Object, s> {

        /* renamed from: e  reason: collision with root package name */
        public static final a f4870e = new a();

        a() {
            super(3, c.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* renamed from: b */
        public final Object c(c<Object> cVar, Object obj, m.v.d<? super s> dVar) {
            return cVar.emit(obj, dVar);
        }
    }

    static {
        a aVar = a.f4870e;
        t.b(aVar, 3);
        a = aVar;
    }
}
