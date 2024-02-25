package m.v;

import m.v.g;
import m.y.d.l;

public interface e extends g.b {
    public static final b b = b.f5033e;

    public static final class a {
        public static <E extends g.b> E a(e eVar, g.c<E> cVar) {
            l.d(eVar, "this");
            l.d(cVar, "key");
            if (cVar instanceof b) {
                b bVar = (b) cVar;
                if (!bVar.a(eVar.getKey())) {
                    return null;
                }
                E b = bVar.b(eVar);
                if (b instanceof g.b) {
                    return b;
                }
                return null;
            } else if (e.b == cVar) {
                return eVar;
            } else {
                return null;
            }
        }

        public static g b(e eVar, g.c<?> cVar) {
            l.d(eVar, "this");
            l.d(cVar, "key");
            if (!(cVar instanceof b)) {
                return e.b == cVar ? h.f5035e : eVar;
            }
            b bVar = (b) cVar;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : h.f5035e;
        }
    }

    public static final class b implements g.c<e> {

        /* renamed from: e  reason: collision with root package name */
        static final /* synthetic */ b f5033e = new b();

        private b() {
        }
    }

    void c(d<?> dVar);

    <T> d<T> g(d<? super T> dVar);
}
