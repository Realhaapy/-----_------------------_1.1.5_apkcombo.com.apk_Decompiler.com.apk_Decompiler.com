package m.c0;

import java.util.Iterator;
import m.y.d.l;

class f extends e {

    public static final class a implements b<T> {
        final /* synthetic */ Iterator a;

        public a(Iterator it) {
            this.a = it;
        }

        public Iterator<T> iterator() {
            return this.a;
        }
    }

    public static <T> b<T> a(Iterator<? extends T> it) {
        l.d(it, "<this>");
        return b(new a(it));
    }

    public static final <T> b<T> b(b<? extends T> bVar) {
        l.d(bVar, "<this>");
        return bVar instanceof a ? bVar : new a(bVar);
    }
}
