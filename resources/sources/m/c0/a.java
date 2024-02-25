package m.c0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import m.y.d.l;

public final class a<T> implements b<T> {
    private final AtomicReference<b<T>> a;

    public a(b<? extends T> bVar) {
        l.d(bVar, "sequence");
        this.a = new AtomicReference<>(bVar);
    }

    public Iterator<T> iterator() {
        b andSet = this.a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
