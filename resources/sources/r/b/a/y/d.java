package r.b.a.y;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import r.b.a.e;
import r.b.a.g;
import r.b.a.r;

public final class d implements Comparable<d>, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* renamed from: e  reason: collision with root package name */
    private final g f5806e;

    /* renamed from: f  reason: collision with root package name */
    private final r f5807f;

    /* renamed from: g  reason: collision with root package name */
    private final r f5808g;

    d(long j2, r rVar, r rVar2) {
        this.f5806e = g.X(j2, 0, rVar);
        this.f5807f = rVar;
        this.f5808g = rVar2;
    }

    d(g gVar, r rVar, r rVar2) {
        this.f5806e = gVar;
        this.f5807f = rVar;
        this.f5808g = rVar2;
    }

    private int g() {
        return j().y() - k().y();
    }

    static d n(DataInput dataInput) {
        long b = a.b(dataInput);
        r d2 = a.d(dataInput);
        r d3 = a.d(dataInput);
        if (!d2.equals(d3)) {
            return new d(b, d2, d3);
        }
        throw new IllegalArgumentException("Offsets must not be equal");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    /* renamed from: a */
    public int compareTo(d dVar) {
        return h().compareTo(dVar.h());
    }

    public g c() {
        return this.f5806e.f0((long) g());
    }

    public g d() {
        return this.f5806e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f5806e.equals(dVar.f5806e) && this.f5807f.equals(dVar.f5807f) && this.f5808g.equals(dVar.f5808g);
    }

    public r.b.a.d f() {
        return r.b.a.d.h((long) g());
    }

    public e h() {
        return this.f5806e.D(this.f5807f);
    }

    public int hashCode() {
        return (this.f5806e.hashCode() ^ this.f5807f.hashCode()) ^ Integer.rotateLeft(this.f5808g.hashCode(), 16);
    }

    public r j() {
        return this.f5808g;
    }

    public r k() {
        return this.f5807f;
    }

    /* access modifiers changed from: package-private */
    public List<r> l() {
        if (m()) {
            return Collections.emptyList();
        }
        return Arrays.asList(new r[]{k(), j()});
    }

    public boolean m() {
        return j().y() > k().y();
    }

    public long o() {
        return this.f5806e.C(this.f5807f);
    }

    /* access modifiers changed from: package-private */
    public void s(DataOutput dataOutput) {
        a.e(o(), dataOutput);
        a.g(this.f5807f, dataOutput);
        a.g(this.f5808g, dataOutput);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transition[");
        sb.append(m() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f5806e);
        sb.append(this.f5807f);
        sb.append(" to ");
        sb.append(this.f5808g);
        sb.append(']');
        return sb.toString();
    }
}
