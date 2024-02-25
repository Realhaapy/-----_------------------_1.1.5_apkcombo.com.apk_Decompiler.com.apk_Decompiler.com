package m;

import java.io.Serializable;
import m.y.d.g;
import m.y.d.l;

public final class m<T> implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final a f5014e = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public static final class b implements Serializable {

        /* renamed from: e  reason: collision with root package name */
        public final Throwable f5015e;

        public b(Throwable th) {
            l.d(th, "exception");
            this.f5015e = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && l.a(this.f5015e, ((b) obj).f5015e);
        }

        public int hashCode() {
            return this.f5015e.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f5015e + ')';
        }
    }

    public static <T> Object a(Object obj) {
        return obj;
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f5015e;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return obj instanceof b;
    }

    public static final boolean d(Object obj) {
        return !(obj instanceof b);
    }
}
