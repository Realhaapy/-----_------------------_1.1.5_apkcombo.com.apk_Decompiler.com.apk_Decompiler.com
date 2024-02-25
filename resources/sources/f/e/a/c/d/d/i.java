package f.e.a.c.d.d;

import java.util.Iterator;

public abstract class i implements Iterator {
    protected i() {
    }

    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
