package kotlinx.coroutines.j2;

import kotlinx.coroutines.internal.z;
import m.s;
import m.y.c.l;

public class n<E> extends a<E> {
    public n(l<? super E, s> lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    public Object i(E e2) {
        q<?> k2;
        do {
            Object i2 = super.i(e2);
            z zVar = b.b;
            if (i2 == zVar) {
                return zVar;
            }
            if (i2 == b.c) {
                k2 = k(e2);
                if (k2 == null) {
                    return zVar;
                }
            } else if (i2 instanceof j) {
                return i2;
            } else {
                throw new IllegalStateException(m.y.d.l.j("Invalid offerInternal result ", i2).toString());
            }
        } while (!(k2 instanceof j));
        return k2;
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        return true;
    }
}
