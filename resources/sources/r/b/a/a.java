package r.b.a;

import java.io.Serializable;
import r.b.a.w.d;

public abstract class a {

    /* renamed from: r.b.a.a$a  reason: collision with other inner class name */
    static final class C0153a extends a implements Serializable {
        private static final long serialVersionUID = 6740630888130243051L;

        /* renamed from: e  reason: collision with root package name */
        private final q f5514e;

        C0153a(q qVar) {
            this.f5514e = qVar;
        }

        public q a() {
            return this.f5514e;
        }

        public e b() {
            return e.A(d());
        }

        public long d() {
            return System.currentTimeMillis();
        }

        public boolean equals(Object obj) {
            if (obj instanceof C0153a) {
                return this.f5514e.equals(((C0153a) obj).f5514e);
            }
            return false;
        }

        public int hashCode() {
            return this.f5514e.hashCode() + 1;
        }

        public String toString() {
            return "SystemClock[" + this.f5514e + "]";
        }
    }

    protected a() {
    }

    public static a c(q qVar) {
        d.i(qVar, "zone");
        return new C0153a(qVar);
    }

    public abstract q a();

    public abstract e b();
}
