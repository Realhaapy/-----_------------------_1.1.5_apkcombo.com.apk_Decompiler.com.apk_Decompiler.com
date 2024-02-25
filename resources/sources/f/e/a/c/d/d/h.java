package f.e.a.c.d.d;

import java.util.Iterator;
import java.util.Set;

public final class h {
    static int a(Set set) {
        Iterator it = set.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i2 += next != null ? next.hashCode() : 0;
        }
        return i2;
    }
}
