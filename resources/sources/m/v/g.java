package m.v;

import m.v.e;
import m.y.c.p;
import m.y.d.l;
import m.y.d.m;

public interface g {

    public static final class a {

        /* renamed from: m.v.g$a$a  reason: collision with other inner class name */
        static final class C0145a extends m implements p<g, b, g> {

            /* renamed from: e  reason: collision with root package name */
            public static final C0145a f5034e = new C0145a();

            C0145a() {
                super(2);
            }

            /* renamed from: a */
            public final g invoke(g gVar, b bVar) {
                c cVar;
                l.d(gVar, "acc");
                l.d(bVar, "element");
                g minusKey = gVar.minusKey(bVar.getKey());
                h hVar = h.f5035e;
                if (minusKey == hVar) {
                    return bVar;
                }
                e.b bVar2 = e.b;
                e eVar = (e) minusKey.get(bVar2);
                if (eVar == null) {
                    cVar = new c(minusKey, bVar);
                } else {
                    g minusKey2 = minusKey.minusKey(bVar2);
                    if (minusKey2 == hVar) {
                        return new c(bVar, eVar);
                    }
                    cVar = new c(new c(minusKey2, bVar), eVar);
                }
                return cVar;
            }
        }

        public static g a(g gVar, g gVar2) {
            l.d(gVar, "this");
            l.d(gVar2, "context");
            return gVar2 == h.f5035e ? gVar : (g) gVar2.fold(gVar, C0145a.f5034e);
        }
    }

    public interface b extends g {

        public static final class a {
            public static <R> R a(b bVar, R r2, p<? super R, ? super b, ? extends R> pVar) {
                l.d(bVar, "this");
                l.d(pVar, "operation");
                return pVar.invoke(r2, bVar);
            }

            public static <E extends b> E b(b bVar, c<E> cVar) {
                l.d(bVar, "this");
                l.d(cVar, "key");
                if (l.a(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            public static g c(b bVar, c<?> cVar) {
                l.d(bVar, "this");
                l.d(cVar, "key");
                return l.a(bVar.getKey(), cVar) ? h.f5035e : bVar;
            }

            public static g d(b bVar, g gVar) {
                l.d(bVar, "this");
                l.d(gVar, "context");
                return a.a(bVar, gVar);
            }
        }

        <E extends b> E get(c<E> cVar);

        c<?> getKey();
    }

    public interface c<E extends b> {
    }

    <R> R fold(R r2, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    g minusKey(c<?> cVar);

    g plus(g gVar);
}
