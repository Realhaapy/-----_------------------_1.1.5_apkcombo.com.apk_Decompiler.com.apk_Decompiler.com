package f.e.c.a.z.a;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class r1 extends AbstractList<String> implements h0, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final h0 f4164e;

    class a implements ListIterator<String> {

        /* renamed from: e  reason: collision with root package name */
        ListIterator<String> f4165e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f4166f;

        a(int i2) {
            this.f4166f = i2;
            this.f4165e = r1.this.f4164e.listIterator(i2);
        }

        public /* bridge */ /* synthetic */ void add(Object obj) {
            b((String) obj);
            throw null;
        }

        public void b(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public String next() {
            return this.f4165e.next();
        }

        /* renamed from: d */
        public String previous() {
            return this.f4165e.previous();
        }

        public void e(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f4165e.hasNext();
        }

        public boolean hasPrevious() {
            return this.f4165e.hasPrevious();
        }

        public int nextIndex() {
            return this.f4165e.nextIndex();
        }

        public int previousIndex() {
            return this.f4165e.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* bridge */ /* synthetic */ void set(Object obj) {
            e((String) obj);
            throw null;
        }
    }

    class b implements Iterator<String> {

        /* renamed from: e  reason: collision with root package name */
        Iterator<String> f4168e;

        b() {
            this.f4168e = r1.this.f4164e.iterator();
        }

        /* renamed from: b */
        public String next() {
            return this.f4168e.next();
        }

        public boolean hasNext() {
            return this.f4168e.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public r1(h0 h0Var) {
        this.f4164e = h0Var;
    }

    public void c(i iVar) {
        throw new UnsupportedOperationException();
    }

    public h0 d() {
        return this;
    }

    public Object e(int i2) {
        return this.f4164e.e(i2);
    }

    public List<?> f() {
        return this.f4164e.f();
    }

    /* renamed from: i */
    public String get(int i2) {
        return (String) this.f4164e.get(i2);
    }

    public Iterator<String> iterator() {
        return new b();
    }

    public ListIterator<String> listIterator(int i2) {
        return new a(i2);
    }

    public int size() {
        return this.f4164e.size();
    }
}
