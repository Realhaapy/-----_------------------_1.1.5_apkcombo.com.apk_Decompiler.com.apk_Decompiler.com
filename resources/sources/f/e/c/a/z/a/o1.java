package f.e.c.a.z.a;

abstract class o1<T, B> {
    o1() {
    }

    /* access modifiers changed from: package-private */
    public abstract void a(B b, int i2, int i3);

    /* access modifiers changed from: package-private */
    public abstract void b(B b, int i2, long j2);

    /* access modifiers changed from: package-private */
    public abstract void c(B b, int i2, T t);

    /* access modifiers changed from: package-private */
    public abstract void d(B b, int i2, i iVar);

    /* access modifiers changed from: package-private */
    public abstract void e(B b, int i2, long j2);

    /* access modifiers changed from: package-private */
    public abstract B f(Object obj);

    /* access modifiers changed from: package-private */
    public abstract T g(Object obj);

    /* access modifiers changed from: package-private */
    public abstract int h(T t);

    /* access modifiers changed from: package-private */
    public abstract int i(T t);

    /* access modifiers changed from: package-private */
    public abstract void j(Object obj);

    /* access modifiers changed from: package-private */
    public abstract T k(T t, T t2);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000d, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(B r3, f.e.c.a.z.a.g1 r4) {
        /*
            r2 = this;
        L_0x0000:
            int r0 = r4.u()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x000f
            boolean r0 = r2.m(r3, r4)
            if (r0 != 0) goto L_0x0000
        L_0x000f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.z.a.o1.l(java.lang.Object, f.e.c.a.z.a.g1):void");
    }

    /* access modifiers changed from: package-private */
    public final boolean m(B b, g1 g1Var) {
        int e2 = g1Var.e();
        int a = u1.a(e2);
        int b2 = u1.b(e2);
        if (b2 == 0) {
            e(b, a, g1Var.L());
            return true;
        } else if (b2 == 1) {
            b(b, a, g1Var.h());
            return true;
        } else if (b2 == 2) {
            d(b, a, g1Var.z());
            return true;
        } else if (b2 == 3) {
            Object n2 = n();
            int c = u1.c(a, 4);
            l(n2, g1Var);
            if (c == g1Var.e()) {
                c(b, a, r(n2));
                return true;
            }
            throw c0.a();
        } else if (b2 == 4) {
            return false;
        } else {
            if (b2 == 5) {
                a(b, a, g1Var.r());
                return true;
            }
            throw c0.d();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract B n();

    /* access modifiers changed from: package-private */
    public abstract void o(Object obj, B b);

    /* access modifiers changed from: package-private */
    public abstract void p(Object obj, T t);

    /* access modifiers changed from: package-private */
    public abstract boolean q(g1 g1Var);

    /* access modifiers changed from: package-private */
    public abstract T r(B b);

    /* access modifiers changed from: package-private */
    public abstract void s(T t, v1 v1Var);

    /* access modifiers changed from: package-private */
    public abstract void t(T t, v1 v1Var);
}
