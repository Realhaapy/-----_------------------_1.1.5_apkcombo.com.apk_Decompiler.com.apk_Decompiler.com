package r.b.a.u;

import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import r.b.a.e;
import r.b.a.q;
import r.b.a.r;
import r.b.a.u.b;
import r.b.a.w.d;
import r.b.a.x.i;
import r.b.a.x.l;

final class g<D extends b> extends f<D> implements Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* renamed from: e  reason: collision with root package name */
    private final d<D> f5591e;

    /* renamed from: f  reason: collision with root package name */
    private final r f5592f;

    /* renamed from: g  reason: collision with root package name */
    private final q f5593g;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                r.b.a.x.a[] r0 = r.b.a.x.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                r.b.a.x.a r1 = r.b.a.x.a.INSTANT_SECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                r.b.a.x.a r1 = r.b.a.x.a.OFFSET_SECONDS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r.b.a.u.g.a.<clinit>():void");
        }
    }

    private g(d<D> dVar, r rVar, q qVar) {
        d.i(dVar, "dateTime");
        this.f5591e = dVar;
        d.i(rVar, "offset");
        this.f5592f = rVar;
        d.i(qVar, "zone");
        this.f5593g = qVar;
    }

    private g<D> J(e eVar, q qVar) {
        return L(D().x(), eVar, qVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
        if (r2.contains(r8) != false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <R extends r.b.a.u.b> r.b.a.u.f<R> K(r.b.a.u.d<R> r6, r.b.a.q r7, r.b.a.r r8) {
        /*
            java.lang.String r0 = "localDateTime"
            r.b.a.w.d.i(r6, r0)
            java.lang.String r0 = "zone"
            r.b.a.w.d.i(r7, r0)
            boolean r0 = r7 instanceof r.b.a.r
            if (r0 == 0) goto L_0x0017
            r.b.a.u.g r8 = new r.b.a.u.g
            r0 = r7
            r.b.a.r r0 = (r.b.a.r) r0
            r8.<init>(r6, r0, r7)
            return r8
        L_0x0017:
            r.b.a.y.f r0 = r7.c()
            r.b.a.g r1 = r.b.a.g.L(r6)
            java.util.List r2 = r0.c(r1)
            int r3 = r2.size()
            r4 = 1
            r5 = 0
            if (r3 != r4) goto L_0x0032
        L_0x002b:
            java.lang.Object r8 = r2.get(r5)
            r.b.a.r r8 = (r.b.a.r) r8
            goto L_0x0055
        L_0x0032:
            int r3 = r2.size()
            if (r3 != 0) goto L_0x004d
            r.b.a.y.d r8 = r0.b(r1)
            r.b.a.d r0 = r8.f()
            long r0 = r0.f()
            r.b.a.u.d r6 = r6.O(r0)
            r.b.a.r r8 = r8.j()
            goto L_0x0055
        L_0x004d:
            if (r8 == 0) goto L_0x002b
            boolean r0 = r2.contains(r8)
            if (r0 == 0) goto L_0x002b
        L_0x0055:
            java.lang.String r0 = "offset"
            r.b.a.w.d.i(r8, r0)
            r.b.a.u.g r0 = new r.b.a.u.g
            r0.<init>(r6, r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r.b.a.u.g.K(r.b.a.u.d, r.b.a.q, r.b.a.r):r.b.a.u.f");
    }

    static <R extends b> g<R> L(h hVar, e eVar, q qVar) {
        r a2 = qVar.c().a(eVar);
        d.i(a2, "offset");
        return new g<>((d) hVar.n(r.b.a.g.X(eVar.x(), eVar.y(), a2)), a2, qVar);
    }

    static f<?> M(ObjectInput objectInput) {
        return ((c) objectInput.readObject()).v((r) objectInput.readObject()).I((q) objectInput.readObject());
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new u((byte) 13, this);
    }

    /* renamed from: A */
    public f<D> s(long j2, l lVar) {
        return lVar instanceof r.b.a.x.b ? h(this.f5591e.s(j2, lVar)) : D().x().g(lVar.c(this, j2));
    }

    public c<D> E() {
        return this.f5591e;
    }

    /* renamed from: H */
    public f<D> k(i iVar, long j2) {
        if (!(iVar instanceof r.b.a.x.a)) {
            return D().x().g(iVar.d(this, j2));
        }
        r.b.a.x.a aVar = (r.b.a.x.a) iVar;
        int i2 = a.a[aVar.ordinal()];
        if (i2 == 1) {
            return s(j2 - B(), r.b.a.x.b.SECONDS);
        }
        if (i2 != 2) {
            return K(this.f5591e.k(iVar, j2), this.f5593g, this.f5592f);
        }
        return J(this.f5591e.D(r.B(aVar.l(j2))), this.f5593g);
    }

    public f<D> I(q qVar) {
        return K(this.f5591e, qVar, this.f5592f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && compareTo((f) obj) == 0;
    }

    public int hashCode() {
        return (E().hashCode() ^ w().hashCode()) ^ Integer.rotateLeft(x().hashCode(), 3);
    }

    public boolean j(i iVar) {
        return (iVar instanceof r.b.a.x.a) || (iVar != null && iVar.c(this));
    }

    public String toString() {
        String str = E().toString() + w().toString();
        if (w() == x()) {
            return str;
        }
        return str + '[' + x().toString() + ']';
    }

    public r w() {
        return this.f5592f;
    }

    /* access modifiers changed from: package-private */
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f5591e);
        objectOutput.writeObject(this.f5592f);
        objectOutput.writeObject(this.f5593g);
    }

    public q x() {
        return this.f5593g;
    }
}
