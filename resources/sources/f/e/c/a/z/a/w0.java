package f.e.c.a.z.a;

import f.e.c.a.z.a.e0;
import f.e.c.a.z.a.u1;
import f.e.c.a.z.a.v;
import java.util.Iterator;
import java.util.Map;

final class w0<T> implements h1<T> {
    private final s0 a;
    private final o1<?, ?> b;
    private final boolean c;

    /* renamed from: d  reason: collision with root package name */
    private final r<?> f4245d;

    private w0(o1<?, ?> o1Var, r<?> rVar, s0 s0Var) {
        this.b = o1Var;
        this.c = rVar.e(s0Var);
        this.f4245d = rVar;
        this.a = s0Var;
    }

    private <UT, UB> int k(o1<UT, UB> o1Var, T t) {
        return o1Var.i(o1Var.g(t));
    }

    private <UT, UB, ET extends v.b<ET>> void l(o1<UT, UB> o1Var, r<ET> rVar, T t, g1 g1Var, q qVar) {
        UB f2 = o1Var.f(t);
        v<ET> d2 = rVar.d(t);
        do {
            try {
                if (g1Var.u() == Integer.MAX_VALUE) {
                    o1Var.o(t, f2);
                    return;
                }
            } finally {
                o1Var.o(t, f2);
            }
        } while (n(g1Var, qVar, rVar, d2, o1Var, f2));
    }

    static <T> w0<T> m(o1<?, ?> o1Var, r<?> rVar, s0 s0Var) {
        return new w0<>(o1Var, rVar, s0Var);
    }

    private <UT, UB, ET extends v.b<ET>> boolean n(g1 g1Var, q qVar, r<ET> rVar, v<ET> vVar, o1<UT, UB> o1Var, UB ub) {
        int e2 = g1Var.e();
        if (e2 == u1.a) {
            int i2 = 0;
            Object obj = null;
            i iVar = null;
            while (g1Var.u() != Integer.MAX_VALUE) {
                int e3 = g1Var.e();
                if (e3 == u1.c) {
                    i2 = g1Var.B();
                    obj = rVar.b(qVar, this.a, i2);
                } else if (e3 == u1.f4177d) {
                    if (obj != null) {
                        rVar.h(g1Var, obj, qVar, vVar);
                    } else {
                        iVar = g1Var.z();
                    }
                } else if (!g1Var.D()) {
                    break;
                }
            }
            if (g1Var.e() == u1.b) {
                if (iVar != null) {
                    if (obj != null) {
                        rVar.i(iVar, obj, qVar, vVar);
                    } else {
                        o1Var.d(ub, i2, iVar);
                    }
                }
                return true;
            }
            throw c0.a();
        } else if (u1.b(e2) != 2) {
            return g1Var.D();
        } else {
            Object b2 = rVar.b(qVar, this.a, u1.a(e2));
            if (b2 == null) {
                return o1Var.m(ub, g1Var);
            }
            rVar.h(g1Var, b2, qVar, vVar);
            return true;
        }
    }

    private <UT, UB> void o(o1<UT, UB> o1Var, T t, v1 v1Var) {
        o1Var.s(o1Var.g(t), v1Var);
    }

    public void a(T t, T t2) {
        j1.G(this.b, t, t2);
        if (this.c) {
            j1.E(this.f4245d, t, t2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: f.e.c.a.z.a.z$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(T r11, byte[] r12, int r13, int r14, f.e.c.a.z.a.e.b r15) {
        /*
            r10 = this;
            r0 = r11
            f.e.c.a.z.a.z r0 = (f.e.c.a.z.a.z) r0
            f.e.c.a.z.a.p1 r1 = r0.unknownFields
            f.e.c.a.z.a.p1 r2 = f.e.c.a.z.a.p1.e()
            if (r1 != r2) goto L_0x0011
            f.e.c.a.z.a.p1 r1 = f.e.c.a.z.a.p1.l()
            r0.unknownFields = r1
        L_0x0011:
            f.e.c.a.z.a.z$c r11 = (f.e.c.a.z.a.z.c) r11
            f.e.c.a.z.a.v r11 = r11.N()
            r0 = 0
            r2 = r0
        L_0x0019:
            if (r13 >= r14) goto L_0x00d7
            int r4 = f.e.c.a.z.a.e.I(r12, r13, r15)
            int r13 = r15.a
            int r3 = f.e.c.a.z.a.u1.a
            r5 = 2
            if (r13 == r3) goto L_0x006b
            int r3 = f.e.c.a.z.a.u1.b(r13)
            if (r3 != r5) goto L_0x0066
            f.e.c.a.z.a.r<?> r2 = r10.f4245d
            f.e.c.a.z.a.q r3 = r15.f4089d
            f.e.c.a.z.a.s0 r5 = r10.a
            int r6 = f.e.c.a.z.a.u1.a(r13)
            java.lang.Object r2 = r2.b(r3, r5, r6)
            r8 = r2
            f.e.c.a.z.a.z$e r8 = (f.e.c.a.z.a.z.e) r8
            if (r8 == 0) goto L_0x005b
            f.e.c.a.z.a.d1 r13 = f.e.c.a.z.a.d1.a()
            f.e.c.a.z.a.s0 r2 = r8.b()
            java.lang.Class r2 = r2.getClass()
            f.e.c.a.z.a.h1 r13 = r13.d(r2)
            int r13 = f.e.c.a.z.a.e.p(r13, r12, r4, r14, r15)
            f.e.c.a.z.a.z$d r2 = r8.b
            java.lang.Object r3 = r15.c
            r11.x(r2, r3)
            goto L_0x0064
        L_0x005b:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = f.e.c.a.z.a.e.G(r2, r3, r4, r5, r6, r7)
        L_0x0064:
            r2 = r8
            goto L_0x0019
        L_0x0066:
            int r13 = f.e.c.a.z.a.e.N(r13, r12, r4, r14, r15)
            goto L_0x0019
        L_0x006b:
            r13 = 0
            r3 = r0
        L_0x006d:
            if (r4 >= r14) goto L_0x00cb
            int r4 = f.e.c.a.z.a.e.I(r12, r4, r15)
            int r6 = r15.a
            int r7 = f.e.c.a.z.a.u1.a(r6)
            int r8 = f.e.c.a.z.a.u1.b(r6)
            if (r7 == r5) goto L_0x00ac
            r9 = 3
            if (r7 == r9) goto L_0x0083
            goto L_0x00c1
        L_0x0083:
            if (r2 == 0) goto L_0x00a1
            f.e.c.a.z.a.d1 r6 = f.e.c.a.z.a.d1.a()
            f.e.c.a.z.a.s0 r7 = r2.b()
            java.lang.Class r7 = r7.getClass()
            f.e.c.a.z.a.h1 r6 = r6.d(r7)
            int r4 = f.e.c.a.z.a.e.p(r6, r12, r4, r14, r15)
            f.e.c.a.z.a.z$d r6 = r2.b
            java.lang.Object r7 = r15.c
            r11.x(r6, r7)
            goto L_0x006d
        L_0x00a1:
            if (r8 != r5) goto L_0x00c1
            int r4 = f.e.c.a.z.a.e.b(r12, r4, r15)
            java.lang.Object r3 = r15.c
            f.e.c.a.z.a.i r3 = (f.e.c.a.z.a.i) r3
            goto L_0x006d
        L_0x00ac:
            if (r8 != 0) goto L_0x00c1
            int r4 = f.e.c.a.z.a.e.I(r12, r4, r15)
            int r13 = r15.a
            f.e.c.a.z.a.r<?> r2 = r10.f4245d
            f.e.c.a.z.a.q r6 = r15.f4089d
            f.e.c.a.z.a.s0 r7 = r10.a
            java.lang.Object r2 = r2.b(r6, r7, r13)
            f.e.c.a.z.a.z$e r2 = (f.e.c.a.z.a.z.e) r2
            goto L_0x006d
        L_0x00c1:
            int r7 = f.e.c.a.z.a.u1.b
            if (r6 != r7) goto L_0x00c6
            goto L_0x00cb
        L_0x00c6:
            int r4 = f.e.c.a.z.a.e.N(r6, r12, r4, r14, r15)
            goto L_0x006d
        L_0x00cb:
            if (r3 == 0) goto L_0x00d4
            int r13 = f.e.c.a.z.a.u1.c(r13, r5)
            r1.n(r13, r3)
        L_0x00d4:
            r13 = r4
            goto L_0x0019
        L_0x00d7:
            if (r13 != r14) goto L_0x00da
            return
        L_0x00da:
            f.e.c.a.z.a.c0 r11 = f.e.c.a.z.a.c0.g()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.z.a.w0.b(java.lang.Object, byte[], int, int, f.e.c.a.z.a.e$b):void");
    }

    public void c(T t, v1 v1Var) {
        Iterator<Map.Entry<?, Object>> s2 = this.f4245d.c(t).s();
        while (s2.hasNext()) {
            Map.Entry next = s2.next();
            v.b bVar = (v.b) next.getKey();
            if (bVar.q() != u1.c.MESSAGE || bVar.e() || bVar.r()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            v1Var.h(bVar.b(), next instanceof e0.b ? ((e0.b) next).a().e() : next.getValue());
        }
        o(this.b, t, v1Var);
    }

    public void d(T t, g1 g1Var, q qVar) {
        l(this.b, this.f4245d, t, g1Var, qVar);
    }

    public void e(T t) {
        this.b.j(t);
        this.f4245d.f(t);
    }

    public final boolean f(T t) {
        return this.f4245d.c(t).p();
    }

    public boolean g(T t, T t2) {
        if (!this.b.g(t).equals(this.b.g(t2))) {
            return false;
        }
        if (this.c) {
            return this.f4245d.c(t).equals(this.f4245d.c(t2));
        }
        return true;
    }

    public int h(T t) {
        int k2 = k(this.b, t) + 0;
        return this.c ? k2 + this.f4245d.c(t).j() : k2;
    }

    public T i() {
        return this.a.i().o();
    }

    public int j(T t) {
        int hashCode = this.b.g(t).hashCode();
        return this.c ? (hashCode * 53) + this.f4245d.c(t).hashCode() : hashCode;
    }
}
