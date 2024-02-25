package f.e.c.a.z.a;

import f.e.c.a.z.a.u1;
import java.util.List;

final class k implements g1 {
    private final j a;
    private int b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f4128d = 0;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                f.e.c.a.z.a.u1$b[] r0 = f.e.c.a.z.a.u1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0060 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006c }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0078 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0084 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0090 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x009c }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00cc }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.z.a.k.a.<clinit>():void");
        }
    }

    private k(j jVar) {
        b0.b(jVar, "input");
        j jVar2 = jVar;
        this.a = jVar2;
        jVar2.c = this;
    }

    public static k Q(j jVar) {
        k kVar = jVar.c;
        return kVar != null ? kVar : new k(jVar);
    }

    private Object R(u1.b bVar, Class<?> cls, q qVar) {
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(t());
            case 2:
                return z();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(c());
            case 5:
                return Integer.valueOf(r());
            case 6:
                return Long.valueOf(h());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(C());
            case 9:
                return Long.valueOf(L());
            case 10:
                return s(cls, qVar);
            case 11:
                return Integer.valueOf(E());
            case 12:
                return Long.valueOf(w());
            case 13:
                return Integer.valueOf(j());
            case 14:
                return Long.valueOf(l());
            case 15:
                return M();
            case 16:
                return Integer.valueOf(B());
            case 17:
                return Long.valueOf(f());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private <T> T S(h1<T> h1Var, q qVar) {
        int i2 = this.c;
        this.c = u1.c(u1.a(this.b), 4);
        try {
            T i3 = h1Var.i();
            h1Var.d(i3, this, qVar);
            h1Var.e(i3);
            if (this.b == this.c) {
                return i3;
            }
            throw c0.g();
        } finally {
            this.c = i2;
        }
    }

    private <T> T T(h1<T> h1Var, q qVar) {
        int A = this.a.A();
        j jVar = this.a;
        if (jVar.a < jVar.b) {
            int j2 = jVar.j(A);
            T i2 = h1Var.i();
            this.a.a++;
            h1Var.d(i2, this, qVar);
            h1Var.e(i2);
            this.a.a(0);
            j jVar2 = this.a;
            jVar2.a--;
            jVar2.i(j2);
            return i2;
        }
        throw c0.h();
    }

    private void V(int i2) {
        if (this.a.d() != i2) {
            throw c0.j();
        }
    }

    private void W(int i2) {
        if (u1.b(this.b) != i2) {
            throw c0.d();
        }
    }

    private void X(int i2) {
        if ((i2 & 3) != 0) {
            throw c0.g();
        }
    }

    private void Y(int i2) {
        if ((i2 & 7) != 0) {
            throw c0.g();
        }
    }

    public void A(List<Float> list) {
        int z;
        int z2;
        if (list instanceof x) {
            x xVar = (x) list;
            int b2 = u1.b(this.b);
            if (b2 == 2) {
                int A = this.a.A();
                X(A);
                int d2 = this.a.d() + A;
                do {
                    xVar.k(this.a.q());
                } while (this.a.d() < d2);
            } else if (b2 == 5) {
                do {
                    xVar.k(this.a.q());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f4128d = z2;
            } else {
                throw c0.d();
            }
        } else {
            int b3 = u1.b(this.b);
            if (b3 == 2) {
                int A2 = this.a.A();
                X(A2);
                int d3 = this.a.d() + A2;
                do {
                    list.add(Float.valueOf(this.a.q()));
                } while (this.a.d() < d3);
            } else if (b3 == 5) {
                do {
                    list.add(Float.valueOf(this.a.q()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f4128d = z;
            } else {
                throw c0.d();
            }
        }
    }

    public int B() {
        W(0);
        return this.a.A();
    }

    public int C() {
        W(0);
        return this.a.r();
    }

    public boolean D() {
        int i2;
        if (this.a.e() || (i2 = this.b) == this.c) {
            return false;
        }
        return this.a.C(i2);
    }

    public int E() {
        W(5);
        return this.a.t();
    }

    public void F(List<i> list) {
        int z;
        if (u1.b(this.b) == 2) {
            do {
                list.add(z());
                if (!this.a.e()) {
                    z = this.a.z();
                } else {
                    return;
                }
            } while (z == this.b);
            this.f4128d = z;
            return;
        }
        throw c0.d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (D() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        throw new f.e.c.a.z.a.c0("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <K, V> void G(java.util.Map<K, V> r8, f.e.c.a.z.a.l0.a<K, V> r9, f.e.c.a.z.a.q r10) {
        /*
            r7 = this;
            r0 = 2
            r7.W(r0)
            f.e.c.a.z.a.j r1 = r7.a
            int r1 = r1.A()
            f.e.c.a.z.a.j r2 = r7.a
            int r1 = r2.j(r1)
            K r2 = r9.b
            V r3 = r9.f4152d
        L_0x0014:
            int r4 = r7.u()     // Catch:{ all -> 0x0065 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005c
            f.e.c.a.z.a.j r5 = r7.a     // Catch:{ all -> 0x0065 }
            boolean r5 = r5.e()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x0026
            goto L_0x005c
        L_0x0026:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0047
            if (r4 == r0) goto L_0x003a
            boolean r4 = r7.D()     // Catch:{ a -> 0x004f }
            if (r4 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            f.e.c.a.z.a.c0 r4 = new f.e.c.a.z.a.c0     // Catch:{ a -> 0x004f }
            r4.<init>(r6)     // Catch:{ a -> 0x004f }
            throw r4     // Catch:{ a -> 0x004f }
        L_0x003a:
            f.e.c.a.z.a.u1$b r4 = r9.c     // Catch:{ a -> 0x004f }
            V r5 = r9.f4152d     // Catch:{ a -> 0x004f }
            java.lang.Class r5 = r5.getClass()     // Catch:{ a -> 0x004f }
            java.lang.Object r3 = r7.R(r4, r5, r10)     // Catch:{ a -> 0x004f }
            goto L_0x0014
        L_0x0047:
            f.e.c.a.z.a.u1$b r4 = r9.a     // Catch:{ a -> 0x004f }
            r5 = 0
            java.lang.Object r2 = r7.R(r4, r5, r5)     // Catch:{ a -> 0x004f }
            goto L_0x0014
        L_0x004f:
            boolean r4 = r7.D()     // Catch:{ all -> 0x0065 }
            if (r4 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            f.e.c.a.z.a.c0 r8 = new f.e.c.a.z.a.c0     // Catch:{ all -> 0x0065 }
            r8.<init>(r6)     // Catch:{ all -> 0x0065 }
            throw r8     // Catch:{ all -> 0x0065 }
        L_0x005c:
            r8.put(r2, r3)     // Catch:{ all -> 0x0065 }
            f.e.c.a.z.a.j r8 = r7.a
            r8.i(r1)
            return
        L_0x0065:
            r8 = move-exception
            f.e.c.a.z.a.j r9 = r7.a
            r9.i(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.z.a.k.G(java.util.Map, f.e.c.a.z.a.l0$a, f.e.c.a.z.a.q):void");
    }

    public void H(List<Double> list) {
        int z;
        int z2;
        if (list instanceof n) {
            n nVar = (n) list;
            int b2 = u1.b(this.b);
            if (b2 == 1) {
                do {
                    nVar.k(this.a.m());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f4128d = z2;
            } else if (b2 == 2) {
                int A = this.a.A();
                Y(A);
                int d2 = this.a.d() + A;
                do {
                    nVar.k(this.a.m());
                } while (this.a.d() < d2);
            } else {
                throw c0.d();
            }
        } else {
            int b3 = u1.b(this.b);
            if (b3 == 1) {
                do {
                    list.add(Double.valueOf(this.a.m()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f4128d = z;
            } else if (b3 == 2) {
                int A2 = this.a.A();
                Y(A2);
                int d3 = this.a.d() + A2;
                do {
                    list.add(Double.valueOf(this.a.m()));
                } while (this.a.d() < d3);
            } else {
                throw c0.d();
            }
        }
    }

    public void I(List<Long> list) {
        int i2;
        int z;
        int z2;
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            int b2 = u1.b(this.b);
            if (b2 == 0) {
                do {
                    j0Var.l(this.a.s());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f4128d = z2;
                return;
            } else if (b2 == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    j0Var.l(this.a.s());
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        } else {
            int b3 = u1.b(this.b);
            if (b3 == 0) {
                do {
                    list.add(Long.valueOf(this.a.s()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f4128d = z;
                return;
            } else if (b3 == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    list.add(Long.valueOf(this.a.s()));
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        }
        V(i2);
    }

    public void J(List<Long> list) {
        int z;
        int z2;
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            int b2 = u1.b(this.b);
            if (b2 == 1) {
                do {
                    j0Var.l(this.a.u());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f4128d = z2;
            } else if (b2 == 2) {
                int A = this.a.A();
                Y(A);
                int d2 = this.a.d() + A;
                do {
                    j0Var.l(this.a.u());
                } while (this.a.d() < d2);
            } else {
                throw c0.d();
            }
        } else {
            int b3 = u1.b(this.b);
            if (b3 == 1) {
                do {
                    list.add(Long.valueOf(this.a.u()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f4128d = z;
            } else if (b3 == 2) {
                int A2 = this.a.A();
                Y(A2);
                int d3 = this.a.d() + A2;
                do {
                    list.add(Long.valueOf(this.a.u()));
                } while (this.a.d() < d3);
            } else {
                throw c0.d();
            }
        }
    }

    public <T> void K(List<T> list, h1<T> h1Var, q qVar) {
        int z;
        if (u1.b(this.b) == 3) {
            int i2 = this.b;
            do {
                list.add(S(h1Var, qVar));
                if (!this.a.e() && this.f4128d == 0) {
                    z = this.a.z();
                } else {
                    return;
                }
            } while (z == i2);
            this.f4128d = z;
            return;
        }
        throw c0.d();
    }

    public long L() {
        W(0);
        return this.a.s();
    }

    public String M() {
        W(2);
        return this.a.y();
    }

    public void N(List<Long> list) {
        int z;
        int z2;
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            int b2 = u1.b(this.b);
            if (b2 == 1) {
                do {
                    j0Var.l(this.a.p());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f4128d = z2;
            } else if (b2 == 2) {
                int A = this.a.A();
                Y(A);
                int d2 = this.a.d() + A;
                do {
                    j0Var.l(this.a.p());
                } while (this.a.d() < d2);
            } else {
                throw c0.d();
            }
        } else {
            int b3 = u1.b(this.b);
            if (b3 == 1) {
                do {
                    list.add(Long.valueOf(this.a.p()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f4128d = z;
            } else if (b3 == 2) {
                int A2 = this.a.A();
                Y(A2);
                int d3 = this.a.d() + A2;
                do {
                    list.add(Long.valueOf(this.a.p()));
                } while (this.a.d() < d3);
            } else {
                throw c0.d();
            }
        }
    }

    public void O(List<Integer> list) {
        int i2;
        int z;
        int z2;
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            int b2 = u1.b(this.b);
            if (b2 == 0) {
                do {
                    a0Var.k(this.a.r());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f4128d = z2;
                return;
            } else if (b2 == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    a0Var.k(this.a.r());
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        } else {
            int b3 = u1.b(this.b);
            if (b3 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.r()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f4128d = z;
                return;
            } else if (b3 == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    list.add(Integer.valueOf(this.a.r()));
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        }
        V(i2);
    }

    public void P(List<Integer> list) {
        int i2;
        int z;
        int z2;
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            int b2 = u1.b(this.b);
            if (b2 == 0) {
                do {
                    a0Var.k(this.a.n());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f4128d = z2;
                return;
            } else if (b2 == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    a0Var.k(this.a.n());
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        } else {
            int b3 = u1.b(this.b);
            if (b3 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.n()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f4128d = z;
                return;
            } else if (b3 == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    list.add(Integer.valueOf(this.a.n()));
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        }
        V(i2);
    }

    public void U(List<String> list, boolean z) {
        int z2;
        int z3;
        if (u1.b(this.b) != 2) {
            throw c0.d();
        } else if (!(list instanceof h0) || z) {
            do {
                list.add(z ? M() : p());
                if (!this.a.e()) {
                    z2 = this.a.z();
                } else {
                    return;
                }
            } while (z2 == this.b);
            this.f4128d = z2;
        } else {
            h0 h0Var = (h0) list;
            do {
                h0Var.c(z());
                if (!this.a.e()) {
                    z3 = this.a.z();
                } else {
                    return;
                }
            } while (z3 == this.b);
            this.f4128d = z3;
        }
    }

    public <T> T a(h1<T> h1Var, q qVar) {
        W(3);
        return S(h1Var, qVar);
    }

    public void b(List<Integer> list) {
        int i2;
        int z;
        int z2;
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            int b2 = u1.b(this.b);
            if (b2 == 0) {
                do {
                    a0Var.k(this.a.v());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f4128d = z2;
                return;
            } else if (b2 == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    a0Var.k(this.a.v());
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        } else {
            int b3 = u1.b(this.b);
            if (b3 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.v()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f4128d = z;
                return;
            } else if (b3 == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    list.add(Integer.valueOf(this.a.v()));
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        }
        V(i2);
    }

    public int c() {
        W(0);
        return this.a.n();
    }

    public <T> T d(h1<T> h1Var, q qVar) {
        W(2);
        return T(h1Var, qVar);
    }

    public int e() {
        return this.b;
    }

    public long f() {
        W(0);
        return this.a.B();
    }

    public void g(List<Integer> list) {
        int z;
        int z2;
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            int b2 = u1.b(this.b);
            if (b2 == 2) {
                int A = this.a.A();
                X(A);
                int d2 = this.a.d() + A;
                do {
                    a0Var.k(this.a.o());
                } while (this.a.d() < d2);
            } else if (b2 == 5) {
                do {
                    a0Var.k(this.a.o());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f4128d = z2;
            } else {
                throw c0.d();
            }
        } else {
            int b3 = u1.b(this.b);
            if (b3 == 2) {
                int A2 = this.a.A();
                X(A2);
                int d3 = this.a.d() + A2;
                do {
                    list.add(Integer.valueOf(this.a.o()));
                } while (this.a.d() < d3);
            } else if (b3 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.o()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f4128d = z;
            } else {
                throw c0.d();
            }
        }
    }

    public long h() {
        W(1);
        return this.a.p();
    }

    public void i(List<Integer> list) {
        int z;
        int z2;
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            int b2 = u1.b(this.b);
            if (b2 == 2) {
                int A = this.a.A();
                X(A);
                int d2 = this.a.d() + A;
                do {
                    a0Var.k(this.a.t());
                } while (this.a.d() < d2);
            } else if (b2 == 5) {
                do {
                    a0Var.k(this.a.t());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f4128d = z2;
            } else {
                throw c0.d();
            }
        } else {
            int b3 = u1.b(this.b);
            if (b3 == 2) {
                int A2 = this.a.A();
                X(A2);
                int d3 = this.a.d() + A2;
                do {
                    list.add(Integer.valueOf(this.a.t()));
                } while (this.a.d() < d3);
            } else if (b3 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.t()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f4128d = z;
            } else {
                throw c0.d();
            }
        }
    }

    public int j() {
        W(0);
        return this.a.v();
    }

    public void k(List<Long> list) {
        int i2;
        int z;
        int z2;
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            int b2 = u1.b(this.b);
            if (b2 == 0) {
                do {
                    j0Var.l(this.a.w());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f4128d = z2;
                return;
            } else if (b2 == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    j0Var.l(this.a.w());
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        } else {
            int b3 = u1.b(this.b);
            if (b3 == 0) {
                do {
                    list.add(Long.valueOf(this.a.w()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f4128d = z;
                return;
            } else if (b3 == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    list.add(Long.valueOf(this.a.w()));
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        }
        V(i2);
    }

    public long l() {
        W(0);
        return this.a.w();
    }

    public void m(List<Integer> list) {
        int i2;
        int z;
        int z2;
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            int b2 = u1.b(this.b);
            if (b2 == 0) {
                do {
                    a0Var.k(this.a.A());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f4128d = z2;
                return;
            } else if (b2 == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    a0Var.k(this.a.A());
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        } else {
            int b3 = u1.b(this.b);
            if (b3 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.A()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f4128d = z;
                return;
            } else if (b3 == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    list.add(Integer.valueOf(this.a.A()));
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        }
        V(i2);
    }

    public <T> T n(Class<T> cls, q qVar) {
        W(3);
        return S(d1.a().d(cls), qVar);
    }

    public void o(List<Boolean> list) {
        int i2;
        int z;
        int z2;
        if (list instanceof g) {
            g gVar = (g) list;
            int b2 = u1.b(this.b);
            if (b2 == 0) {
                do {
                    gVar.l(this.a.k());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f4128d = z2;
                return;
            } else if (b2 == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    gVar.l(this.a.k());
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        } else {
            int b3 = u1.b(this.b);
            if (b3 == 0) {
                do {
                    list.add(Boolean.valueOf(this.a.k()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f4128d = z;
                return;
            } else if (b3 == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    list.add(Boolean.valueOf(this.a.k()));
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        }
        V(i2);
    }

    public String p() {
        W(2);
        return this.a.x();
    }

    public <T> void q(List<T> list, h1<T> h1Var, q qVar) {
        int z;
        if (u1.b(this.b) == 2) {
            int i2 = this.b;
            do {
                list.add(T(h1Var, qVar));
                if (!this.a.e() && this.f4128d == 0) {
                    z = this.a.z();
                } else {
                    return;
                }
            } while (z == i2);
            this.f4128d = z;
            return;
        }
        throw c0.d();
    }

    public int r() {
        W(5);
        return this.a.o();
    }

    public double readDouble() {
        W(1);
        return this.a.m();
    }

    public float readFloat() {
        W(5);
        return this.a.q();
    }

    public <T> T s(Class<T> cls, q qVar) {
        W(2);
        return T(d1.a().d(cls), qVar);
    }

    public boolean t() {
        W(0);
        return this.a.k();
    }

    public int u() {
        int i2 = this.f4128d;
        if (i2 != 0) {
            this.b = i2;
            this.f4128d = 0;
        } else {
            this.b = this.a.z();
        }
        int i3 = this.b;
        if (i3 == 0 || i3 == this.c) {
            return Integer.MAX_VALUE;
        }
        return u1.a(i3);
    }

    public void v(List<String> list) {
        U(list, false);
    }

    public long w() {
        W(1);
        return this.a.u();
    }

    public void x(List<Long> list) {
        int i2;
        int z;
        int z2;
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            int b2 = u1.b(this.b);
            if (b2 == 0) {
                do {
                    j0Var.l(this.a.B());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f4128d = z2;
                return;
            } else if (b2 == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    j0Var.l(this.a.B());
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        } else {
            int b3 = u1.b(this.b);
            if (b3 == 0) {
                do {
                    list.add(Long.valueOf(this.a.B()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f4128d = z;
                return;
            } else if (b3 == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    list.add(Long.valueOf(this.a.B()));
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        }
        V(i2);
    }

    public void y(List<String> list) {
        U(list, true);
    }

    public i z() {
        W(2);
        return this.a.l();
    }
}
