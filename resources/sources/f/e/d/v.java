package f.e.d;

import f.e.d.a0.b;
import f.e.d.a0.c;
import f.e.d.y.n.e;
import f.e.d.y.n.f;
import java.io.IOException;

public abstract class v<T> {

    class a extends v<T> {
        a() {
        }

        public T c(f.e.d.a0.a aVar) {
            if (aVar.d0() != b.NULL) {
                return v.this.c(aVar);
            }
            aVar.Z();
            return null;
        }

        public void e(c cVar, T t) {
            if (t == null) {
                cVar.S();
            } else {
                v.this.e(cVar, t);
            }
        }
    }

    public final T a(l lVar) {
        try {
            return c(new e(lVar));
        } catch (IOException e2) {
            throw new m((Throwable) e2);
        }
    }

    public final v<T> b() {
        return new a();
    }

    public abstract T c(f.e.d.a0.a aVar);

    public final l d(T t) {
        try {
            f fVar = new f();
            e(fVar, t);
            return fVar.i0();
        } catch (IOException e2) {
            throw new m((Throwable) e2);
        }
    }

    public abstract void e(c cVar, T t);
}
