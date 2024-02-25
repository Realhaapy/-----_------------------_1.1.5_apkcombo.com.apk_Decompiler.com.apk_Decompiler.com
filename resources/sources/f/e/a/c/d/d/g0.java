package f.e.a.c.d.d;

import java.util.Iterator;

public final class g0 {
    public static Object a(Iterable iterable, Object obj) {
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }
}
