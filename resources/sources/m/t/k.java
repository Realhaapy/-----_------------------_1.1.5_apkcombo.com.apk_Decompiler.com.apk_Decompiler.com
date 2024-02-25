package m.t;

import java.util.Collection;
import m.y.d.l;

class k extends j {
    public static <T> int j(Iterable<? extends T> iterable, int i2) {
        l.d(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }
}
