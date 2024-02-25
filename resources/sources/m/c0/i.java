package m.c0;

import java.util.Iterator;
import m.y.c.l;

public final class i<T, R> implements b<R> {
    /* access modifiers changed from: private */
    public final b<T> a;
    /* access modifiers changed from: private */
    public final l<T, R> b;

    public static final class a implements Iterator<R>, m.y.d.u.a {

        /* renamed from: e  reason: collision with root package name */
        private final Iterator<T> f4989e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i<T, R> f4990f;

        a(i<T, R> iVar) {
            this.f4990f = iVar;
            this.f4989e = iVar.a.iterator();
        }

        public boolean hasNext() {
            return this.f4989e.hasNext();
        }

        public R next() {
            return this.f4990f.b.invoke(this.f4989e.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public i(b<? extends T> bVar, l<? super T, ? extends R> lVar) {
        m.y.d.l.d(bVar, "sequence");
        m.y.d.l.d(lVar, "transformer");
        this.a = bVar;
        this.b = lVar;
    }

    public Iterator<R> iterator() {
        return new a(this);
    }
}
