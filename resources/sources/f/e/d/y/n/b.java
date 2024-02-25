package f.e.d.y.n;

import f.e.d.f;
import f.e.d.v;
import f.e.d.w;
import f.e.d.y.c;
import f.e.d.y.i;
import java.lang.reflect.Type;
import java.util.Collection;

public final class b implements w {

    /* renamed from: e  reason: collision with root package name */
    private final c f4378e;

    private static final class a<E> extends v<Collection<E>> {
        private final v<E> a;
        private final i<? extends Collection<E>> b;

        public a(f fVar, Type type, v<E> vVar, i<? extends Collection<E>> iVar) {
            this.a = new m(fVar, vVar, type);
            this.b = iVar;
        }

        /* renamed from: f */
        public Collection<E> c(f.e.d.a0.a aVar) {
            if (aVar.d0() == f.e.d.a0.b.NULL) {
                aVar.Z();
                return null;
            }
            Collection<E> collection = (Collection) this.b.a();
            aVar.a();
            while (aVar.L()) {
                collection.add(this.a.c(aVar));
            }
            aVar.z();
            return collection;
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, Collection<E> collection) {
            if (collection == null) {
                cVar.S();
                return;
            }
            cVar.g();
            for (E e2 : collection) {
                this.a.e(cVar, e2);
            }
            cVar.z();
        }
    }

    public b(c cVar) {
        this.f4378e = cVar;
    }

    public <T> v<T> create(f fVar, f.e.d.z.a<T> aVar) {
        Type e2 = aVar.e();
        Class<? super T> c = aVar.c();
        if (!Collection.class.isAssignableFrom(c)) {
            return null;
        }
        Type h2 = f.e.d.y.b.h(e2, c);
        return new a(fVar, h2, fVar.j(f.e.d.z.a.b(h2)), this.f4378e.a(aVar));
    }
}
