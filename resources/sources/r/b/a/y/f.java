package r.b.a.y;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import r.b.a.e;
import r.b.a.g;
import r.b.a.r;
import r.b.a.w.d;

public abstract class f {

    static final class a extends f implements Serializable {
        private static final long serialVersionUID = -8733721350312276297L;

        /* renamed from: e  reason: collision with root package name */
        private final r f5822e;

        a(r rVar) {
            this.f5822e = rVar;
        }

        public r a(e eVar) {
            return this.f5822e;
        }

        public d b(g gVar) {
            return null;
        }

        public List<r> c(g gVar) {
            return Collections.singletonList(this.f5822e);
        }

        public boolean d() {
            return true;
        }

        public boolean e(g gVar, r rVar) {
            return this.f5822e.equals(rVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f5822e.equals(((a) obj).f5822e);
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.d() && this.f5822e.equals(bVar.a(e.f5527g));
        }

        public int hashCode() {
            return ((((this.f5822e.hashCode() + 31) ^ 1) ^ 1) ^ (this.f5822e.hashCode() + 31)) ^ 1;
        }

        public String toString() {
            return "FixedRules:" + this.f5822e;
        }
    }

    f() {
    }

    public static f f(r rVar) {
        d.i(rVar, "offset");
        return new a(rVar);
    }

    public abstract r a(e eVar);

    public abstract d b(g gVar);

    public abstract List<r> c(g gVar);

    public abstract boolean d();

    public abstract boolean e(g gVar, r rVar);
}
