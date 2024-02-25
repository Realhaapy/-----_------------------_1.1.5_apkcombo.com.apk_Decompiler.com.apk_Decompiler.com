package f.e.d.y.n;

import f.e.d.a0.a;
import f.e.d.a0.c;
import f.e.d.f;
import f.e.d.v;
import f.e.d.y.n.i;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class m<T> extends v<T> {
    private final f a;
    private final v<T> b;
    private final Type c;

    m(f fVar, v<T> vVar, Type type) {
        this.a = fVar;
        this.b = vVar;
        this.c = type;
    }

    private Type f(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    public T c(a aVar) {
        return this.b.c(aVar);
    }

    public void e(c cVar, T t) {
        v<T> vVar = this.b;
        Type f2 = f(this.c, t);
        if (f2 != this.c) {
            vVar = this.a.j(f.e.d.z.a.b(f2));
            if (vVar instanceof i.b) {
                v<T> vVar2 = this.b;
                if (!(vVar2 instanceof i.b)) {
                    vVar = vVar2;
                }
            }
        }
        vVar.e(cVar, t);
    }
}
