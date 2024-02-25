package f.e.d.y.n;

import f.e.d.a0.c;
import f.e.d.f;
import f.e.d.v;
import f.e.d.w;
import f.e.d.y.b;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class a<E> extends v<Object> {
    public static final w c = new C0131a();
    private final Class<E> a;
    private final v<E> b;

    /* renamed from: f.e.d.y.n.a$a  reason: collision with other inner class name */
    class C0131a implements w {
        C0131a() {
        }

        public <T> v<T> create(f fVar, f.e.d.z.a<T> aVar) {
            Type e2 = aVar.e();
            if (!(e2 instanceof GenericArrayType) && (!(e2 instanceof Class) || !((Class) e2).isArray())) {
                return null;
            }
            Type g2 = b.g(e2);
            return new a(fVar, fVar.j(f.e.d.z.a.b(g2)), b.k(g2));
        }
    }

    public a(f fVar, v<E> vVar, Class<E> cls) {
        this.b = new m(fVar, vVar, cls);
        this.a = cls;
    }

    public Object c(f.e.d.a0.a aVar) {
        if (aVar.d0() == f.e.d.a0.b.NULL) {
            aVar.Z();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.L()) {
            arrayList.add(this.b.c(aVar));
        }
        aVar.z();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.a, size);
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(newInstance, i2, arrayList.get(i2));
        }
        return newInstance;
    }

    public void e(c cVar, Object obj) {
        if (obj == null) {
            cVar.S();
            return;
        }
        cVar.g();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.b.e(cVar, Array.get(obj, i2));
        }
        cVar.z();
    }
}
