package m.t;

import java.util.Iterator;
import m.y.d.u.a;

public abstract class w implements Iterator<Integer>, a {
    public abstract int b();

    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
