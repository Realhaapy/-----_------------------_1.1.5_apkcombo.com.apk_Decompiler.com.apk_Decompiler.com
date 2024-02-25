package f.e.a.a.i.a0.j;

import f.e.a.a.i.j;
import f.e.a.a.i.p;
import java.util.Objects;

final class h0 extends q0 {
    private final long a;
    private final p b;
    private final j c;

    h0(long j2, p pVar, j jVar) {
        this.a = j2;
        Objects.requireNonNull(pVar, "Null transportContext");
        this.b = pVar;
        Objects.requireNonNull(jVar, "Null event");
        this.c = jVar;
    }

    public j b() {
        return this.c;
    }

    public long c() {
        return this.a;
    }

    public p d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.a == q0Var.c() && this.b.equals(q0Var.d()) && this.c.equals(q0Var.b());
    }

    public int hashCode() {
        long j2 = this.a;
        return this.c.hashCode() ^ ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
