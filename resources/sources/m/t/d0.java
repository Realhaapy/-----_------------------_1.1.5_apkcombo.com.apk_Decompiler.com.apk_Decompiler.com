package m.t;

import java.util.Collections;
import java.util.Set;
import m.y.d.l;

class d0 {
    public static final <T> Set<T> a(T t) {
        Set<T> singleton = Collections.singleton(t);
        l.c(singleton, "singleton(element)");
        return singleton;
    }
}
