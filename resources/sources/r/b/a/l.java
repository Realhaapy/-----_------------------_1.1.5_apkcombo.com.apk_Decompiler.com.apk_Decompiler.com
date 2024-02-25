package r.b.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import r.b.a.w.c;
import r.b.a.x.a;
import r.b.a.x.b;
import r.b.a.x.d;
import r.b.a.x.f;
import r.b.a.x.i;
import r.b.a.x.j;
import r.b.a.x.k;
import r.b.a.x.n;

public final class l extends c implements d, f, Comparable<l>, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;

    /* renamed from: e  reason: collision with root package name */
    private final h f5565e;

    /* renamed from: f  reason: collision with root package name */
    private final r f5566f;

    static {
        h.f5540i.u(r.f5580k);
        h.f5541j.u(r.f5579j);
    }

    private l(h hVar, r rVar) {
        r.b.a.w.d.i(hVar, "time");
        this.f5565e = hVar;
        r.b.a.w.d.i(rVar, "offset");
        this.f5566f = rVar;
    }

    private long A() {
        return this.f5565e.Q() - (((long) this.f5566f.y()) * 1000000000);
    }

    private l B(h hVar, r rVar) {
        return (this.f5565e != hVar || !this.f5566f.equals(rVar)) ? new l(hVar, rVar) : this;
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 66, this);
    }

    public static l x(h hVar, r rVar) {
        return new l(hVar, rVar);
    }

    static l z(DataInput dataInput) {
        return x(h.P(dataInput), r.D(dataInput));
    }

    /* renamed from: C */
    public l h(f fVar) {
        return fVar instanceof h ? B((h) fVar, this.f5566f) : fVar instanceof r ? B(this.f5565e, (r) fVar) : fVar instanceof l ? (l) fVar : (l) fVar.t(this);
    }

    /* renamed from: D */
    public l k(i iVar, long j2) {
        return iVar instanceof a ? iVar == a.OFFSET_SECONDS ? B(this.f5565e, r.B(((a) iVar).l(j2))) : B(this.f5565e.k(iVar, j2), this.f5566f) : (l) iVar.d(this, j2);
    }

    /* access modifiers changed from: package-private */
    public void E(DataOutput dataOutput) {
        this.f5565e.Y(dataOutput);
        this.f5566f.G(dataOutput);
    }

    public n d(i iVar) {
        return iVar instanceof a ? iVar == a.OFFSET_SECONDS ? iVar.k() : this.f5565e.d(iVar) : iVar.h(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f5565e.equals(lVar.f5565e) && this.f5566f.equals(lVar.f5566f);
    }

    public <R> R f(k<R> kVar) {
        if (kVar == j.e()) {
            return b.NANOS;
        }
        if (kVar == j.d() || kVar == j.f()) {
            return v();
        }
        if (kVar == j.c()) {
            return this.f5565e;
        }
        if (kVar == j.a() || kVar == j.b() || kVar == j.g()) {
            return null;
        }
        return super.f(kVar);
    }

    public int hashCode() {
        return this.f5565e.hashCode() ^ this.f5566f.hashCode();
    }

    public boolean j(i iVar) {
        return iVar instanceof a ? iVar.g() || iVar == a.OFFSET_SECONDS : iVar != null && iVar.c(this);
    }

    public int l(i iVar) {
        return super.l(iVar);
    }

    public long n(i iVar) {
        return iVar instanceof a ? iVar == a.OFFSET_SECONDS ? (long) v().y() : this.f5565e.n(iVar) : iVar.f(this);
    }

    public d t(d dVar) {
        return dVar.k(a.NANO_OF_DAY, this.f5565e.Q()).k(a.OFFSET_SECONDS, (long) v().y());
    }

    public String toString() {
        return this.f5565e.toString() + this.f5566f.toString();
    }

    /* renamed from: u */
    public int compareTo(l lVar) {
        if (this.f5566f.equals(lVar.f5566f)) {
            return this.f5565e.compareTo(lVar.f5565e);
        }
        int b = r.b.a.w.d.b(A(), lVar.A());
        return b == 0 ? this.f5565e.compareTo(lVar.f5565e) : b;
    }

    public r v() {
        return this.f5566f;
    }

    /* renamed from: w */
    public l m(long j2, r.b.a.x.l lVar) {
        return j2 == Long.MIN_VALUE ? s(Long.MAX_VALUE, lVar).s(1, lVar) : s(-j2, lVar);
    }

    /* renamed from: y */
    public l s(long j2, r.b.a.x.l lVar) {
        return lVar instanceof b ? B(this.f5565e.s(j2, lVar), this.f5566f) : (l) lVar.c(this, j2);
    }
}
