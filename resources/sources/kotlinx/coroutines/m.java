package kotlinx.coroutines;

import m.s;
import m.v.d;
import m.y.c.l;

public interface m<T> extends d<T> {

    public static final class a {
        public static /* synthetic */ Object a(m mVar, Object obj, Object obj2, int i2, Object obj3) {
            if (obj3 == null) {
                if ((i2 & 2) != 0) {
                    obj2 = null;
                }
                return mVar.d(obj, obj2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
        }
    }

    Object b(T t, Object obj, l<? super Throwable, s> lVar);

    Object d(T t, Object obj);

    void f(T t, l<? super Throwable, s> lVar);

    void h(l<? super Throwable, s> lVar);

    Object i(Throwable th);

    void j(Object obj);
}
