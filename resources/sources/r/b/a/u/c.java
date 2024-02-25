package r.b.a.u;

import r.b.a.e;
import r.b.a.h;
import r.b.a.q;
import r.b.a.r;
import r.b.a.u.b;
import r.b.a.x.a;
import r.b.a.x.d;
import r.b.a.x.f;
import r.b.a.x.i;
import r.b.a.x.j;
import r.b.a.x.k;
import r.b.a.x.l;

public abstract class c<D extends b> extends r.b.a.w.b implements d, f, Comparable<c<?>> {
    /* renamed from: A */
    public c<D> m(long j2, l lVar) {
        return E().x().f(super.m(j2, lVar));
    }

    /* renamed from: B */
    public abstract c<D> s(long j2, l lVar);

    public long C(r rVar) {
        r.b.a.w.d.i(rVar, "offset");
        return ((E().D() * 86400) + ((long) F().R())) - ((long) rVar.y());
    }

    public e D(r rVar) {
        return e.C(C(rVar), (long) F().B());
    }

    public abstract D E();

    public abstract h F();

    /* renamed from: G */
    public c<D> h(f fVar) {
        return E().x().f(super.h(fVar));
    }

    /* renamed from: H */
    public abstract c<D> k(i iVar, long j2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && compareTo((c) obj) == 0;
    }

    public <R> R f(k<R> kVar) {
        if (kVar == j.a()) {
            return x();
        }
        if (kVar == j.e()) {
            return r.b.a.x.b.NANOS;
        }
        if (kVar == j.b()) {
            return r.b.a.f.b0(E().D());
        }
        if (kVar == j.c()) {
            return F();
        }
        if (kVar == j.f() || kVar == j.g() || kVar == j.d()) {
            return null;
        }
        return super.f(kVar);
    }

    public int hashCode() {
        return E().hashCode() ^ F().hashCode();
    }

    public d t(d dVar) {
        return dVar.k(a.EPOCH_DAY, E().D()).k(a.NANO_OF_DAY, F().Q());
    }

    public String toString() {
        return E().toString() + 'T' + F().toString();
    }

    public abstract f<D> v(q qVar);

    /* JADX WARNING: type inference failed for: r3v0, types: [r.b.a.u.c<?>, r.b.a.u.c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(r.b.a.u.c<?> r3) {
        /*
            r2 = this;
            r.b.a.u.b r0 = r2.E()
            r.b.a.u.b r1 = r3.E()
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0028
            r.b.a.h r0 = r2.F()
            r.b.a.h r1 = r3.F()
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0028
            r.b.a.u.h r0 = r2.x()
            r.b.a.u.h r3 = r3.x()
            int r0 = r0.compareTo(r3)
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r.b.a.u.c.compareTo(r.b.a.u.c):int");
    }

    public h x() {
        return E().x();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [r.b.a.u.c<?>, r.b.a.u.c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean y(r.b.a.u.c<?> r6) {
        /*
            r5 = this;
            r.b.a.u.b r0 = r5.E()
            long r0 = r0.D()
            r.b.a.u.b r2 = r6.E()
            long r2 = r2.D()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x002d
            if (r4 != 0) goto L_0x002b
            r.b.a.h r0 = r5.F()
            long r0 = r0.Q()
            r.b.a.h r6 = r6.F()
            long r2 = r6.Q()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r6 = 0
            goto L_0x002e
        L_0x002d:
            r6 = 1
        L_0x002e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r.b.a.u.c.y(r.b.a.u.c):boolean");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [r.b.a.u.c<?>, r.b.a.u.c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean z(r.b.a.u.c<?> r6) {
        /*
            r5 = this;
            r.b.a.u.b r0 = r5.E()
            long r0 = r0.D()
            r.b.a.u.b r2 = r6.E()
            long r2 = r2.D()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x002d
            if (r4 != 0) goto L_0x002b
            r.b.a.h r0 = r5.F()
            long r0 = r0.Q()
            r.b.a.h r6 = r6.F()
            long r2 = r6.Q()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r6 = 0
            goto L_0x002e
        L_0x002d:
            r6 = 1
        L_0x002e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r.b.a.u.c.z(r.b.a.u.c):boolean");
    }
}
