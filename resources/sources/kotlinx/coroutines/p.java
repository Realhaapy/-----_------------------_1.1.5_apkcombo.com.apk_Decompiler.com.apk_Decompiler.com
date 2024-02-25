package kotlinx.coroutines;

import kotlinx.coroutines.internal.g;
import m.v.d;

public final class p {
    public static final <T> n<T> a(d<? super T> dVar) {
        if (!(dVar instanceof g)) {
            return new n<>(dVar, 1);
        }
        n<T> n2 = ((g) dVar).n();
        if (n2 == null || !n2.G()) {
            n2 = null;
        }
        return n2 == null ? new n<>(dVar, 2) : n2;
    }
}
