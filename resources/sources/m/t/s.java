package m.t;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import m.y.d.u.a;

public final class s implements ListIterator, a {

    /* renamed from: e  reason: collision with root package name */
    public static final s f5021e = new s();

    private s() {
    }

    public /* bridge */ /* synthetic */ void add(Object obj) {
        b((Void) obj);
        throw null;
    }

    public void b(Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Void c() {
        throw new NoSuchElementException();
    }

    public Void d() {
        throw new NoSuchElementException();
    }

    public void e(Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public /* bridge */ /* synthetic */ Object next() {
        c();
        throw null;
    }

    public int nextIndex() {
        return 0;
    }

    public /* bridge */ /* synthetic */ Object previous() {
        d();
        throw null;
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void set(Object obj) {
        e((Void) obj);
        throw null;
    }
}
