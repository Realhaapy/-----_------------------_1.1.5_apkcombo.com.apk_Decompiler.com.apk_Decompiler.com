package m.t;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import m.y.d.l;

class n extends m {
    public static <T extends Comparable<? super T>> void k(List<T> list) {
        l.d(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static <T> void l(List<T> list, Comparator<? super T> comparator) {
        l.d(list, "<this>");
        l.d(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
