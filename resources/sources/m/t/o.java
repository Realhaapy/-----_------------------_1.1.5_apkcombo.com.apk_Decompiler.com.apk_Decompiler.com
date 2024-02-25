package m.t;

import java.util.Collection;
import m.y.d.l;

class o extends n {
    public static <T> boolean m(Collection<? super T> collection, Iterable<? extends T> iterable) {
        l.d(collection, "<this>");
        l.d(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }
}
