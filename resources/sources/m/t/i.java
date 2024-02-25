package m.t;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import m.y.d.l;

class i {
    public static final <T> Object[] a(T[] tArr, boolean z) {
        Class<Object[]> cls = Object[].class;
        l.d(tArr, "<this>");
        if (z && l.a(tArr.getClass(), cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        l.c(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public static <T> List<T> b(T t) {
        List<T> singletonList = Collections.singletonList(t);
        l.c(singletonList, "singletonList(element)");
        return singletonList;
    }
}
