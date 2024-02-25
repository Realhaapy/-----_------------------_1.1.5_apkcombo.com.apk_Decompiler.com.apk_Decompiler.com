package m.c0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m.y.d.l;

class h extends g {

    public static final class a implements Iterable<T>, m.y.d.u.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f4988e;

        public a(b bVar) {
            this.f4988e = bVar;
        }

        public Iterator<T> iterator() {
            return this.f4988e.iterator();
        }
    }

    public static <T> Iterable<T> c(b<? extends T> bVar) {
        l.d(bVar, "<this>");
        return new a(bVar);
    }

    public static <T, R> b<R> d(b<? extends T> bVar, m.y.c.l<? super T, ? extends R> lVar) {
        l.d(bVar, "<this>");
        l.d(lVar, "transform");
        return new i(bVar, lVar);
    }

    public static final <T, C extends Collection<? super T>> C e(b<? extends T> bVar, C c) {
        l.d(bVar, "<this>");
        l.d(c, "destination");
        for (Object add : bVar) {
            c.add(add);
        }
        return c;
    }

    public static <T> List<T> f(b<? extends T> bVar) {
        l.d(bVar, "<this>");
        return j.h(g(bVar));
    }

    public static final <T> List<T> g(b<? extends T> bVar) {
        l.d(bVar, "<this>");
        ArrayList arrayList = new ArrayList();
        e(bVar, arrayList);
        return arrayList;
    }
}
