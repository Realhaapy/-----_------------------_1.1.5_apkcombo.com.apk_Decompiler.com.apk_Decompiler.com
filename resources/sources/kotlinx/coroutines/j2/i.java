package kotlinx.coroutines.j2;

import m.y.d.g;
import m.y.d.l;

public final class i<T> {
    public static final b a = new b((g) null);
    /* access modifiers changed from: private */
    public static final c b = new c();

    public static final class a extends c {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && l.a(this.a, ((a) obj).a);
        }

        public int hashCode() {
            Throwable th = this.a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Closed(" + this.a + ')';
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final <E> Object a(Throwable th) {
            a aVar = new a(th);
            i.b(aVar);
            return aVar;
        }

        public final <E> Object b() {
            c a = i.b;
            i.b(a);
            return a;
        }

        public final <E> Object c(E e2) {
            i.b(e2);
            return e2;
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public static <T> Object b(Object obj) {
        return obj;
    }
}
