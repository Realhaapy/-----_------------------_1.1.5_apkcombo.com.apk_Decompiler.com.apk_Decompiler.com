package e.e;

public class d<E> implements Cloneable {

    /* renamed from: i  reason: collision with root package name */
    private static final Object f3256i = new Object();

    /* renamed from: e  reason: collision with root package name */
    private boolean f3257e;

    /* renamed from: f  reason: collision with root package name */
    private long[] f3258f;

    /* renamed from: g  reason: collision with root package name */
    private Object[] f3259g;

    /* renamed from: h  reason: collision with root package name */
    private int f3260h;

    public d() {
        this(10);
    }

    public d(int i2) {
        this.f3257e = false;
        if (i2 == 0) {
            this.f3258f = c.b;
            this.f3259g = c.c;
            return;
        }
        int f2 = c.f(i2);
        this.f3258f = new long[f2];
        this.f3259g = new Object[f2];
    }

    private void f() {
        int i2 = this.f3260h;
        long[] jArr = this.f3258f;
        Object[] objArr = this.f3259g;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f3256i) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f3257e = false;
        this.f3260h = i3;
    }

    public void b(long j2, E e2) {
        int i2 = this.f3260h;
        if (i2 == 0 || j2 > this.f3258f[i2 - 1]) {
            if (this.f3257e && i2 >= this.f3258f.length) {
                f();
            }
            int i3 = this.f3260h;
            if (i3 >= this.f3258f.length) {
                int f2 = c.f(i3 + 1);
                long[] jArr = new long[f2];
                Object[] objArr = new Object[f2];
                long[] jArr2 = this.f3258f;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f3259g;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f3258f = jArr;
                this.f3259g = objArr;
            }
            this.f3258f[i3] = j2;
            this.f3259g[i3] = e2;
            this.f3260h = i3 + 1;
            return;
        }
        l(j2, e2);
    }

    public void d() {
        int i2 = this.f3260h;
        Object[] objArr = this.f3259g;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f3260h = 0;
        this.f3257e = false;
    }

    /* renamed from: e */
    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f3258f = (long[]) this.f3258f.clone();
            dVar.f3259g = (Object[]) this.f3259g.clone();
            return dVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E h(long j2) {
        return i(j2, (Object) null);
    }

    public E i(long j2, E e2) {
        int b = c.b(this.f3258f, this.f3260h, j2);
        if (b >= 0) {
            E[] eArr = this.f3259g;
            if (eArr[b] != f3256i) {
                return eArr[b];
            }
        }
        return e2;
    }

    public int j(long j2) {
        if (this.f3257e) {
            f();
        }
        return c.b(this.f3258f, this.f3260h, j2);
    }

    public long k(int i2) {
        if (this.f3257e) {
            f();
        }
        return this.f3258f[i2];
    }

    public void l(long j2, E e2) {
        int b = c.b(this.f3258f, this.f3260h, j2);
        if (b >= 0) {
            this.f3259g[b] = e2;
            return;
        }
        int i2 = ~b;
        int i3 = this.f3260h;
        if (i2 < i3) {
            Object[] objArr = this.f3259g;
            if (objArr[i2] == f3256i) {
                this.f3258f[i2] = j2;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f3257e && i3 >= this.f3258f.length) {
            f();
            i2 = ~c.b(this.f3258f, this.f3260h, j2);
        }
        int i4 = this.f3260h;
        if (i4 >= this.f3258f.length) {
            int f2 = c.f(i4 + 1);
            long[] jArr = new long[f2];
            Object[] objArr2 = new Object[f2];
            long[] jArr2 = this.f3258f;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f3259g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3258f = jArr;
            this.f3259g = objArr2;
        }
        int i5 = this.f3260h;
        if (i5 - i2 != 0) {
            long[] jArr3 = this.f3258f;
            int i6 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i6, i5 - i2);
            Object[] objArr4 = this.f3259g;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f3260h - i2);
        }
        this.f3258f[i2] = j2;
        this.f3259g[i2] = e2;
        this.f3260h++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f3259g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f3258f
            int r1 = r2.f3260h
            int r3 = e.e.c.b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f3259g
            r0 = r4[r3]
            java.lang.Object r1 = f3256i
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f3257e = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.d.m(long):void");
    }

    public int n() {
        if (this.f3257e) {
            f();
        }
        return this.f3260h;
    }

    public E p(int i2) {
        if (this.f3257e) {
            f();
        }
        return this.f3259g[i2];
    }

    public String toString() {
        if (n() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3260h * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f3260h; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(k(i2));
            sb.append('=');
            Object p2 = p(i2);
            if (p2 != this) {
                sb.append(p2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
