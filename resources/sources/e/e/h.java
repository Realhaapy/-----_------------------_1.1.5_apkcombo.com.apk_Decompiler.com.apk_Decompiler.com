package e.e;

public class h<E> implements Cloneable {

    /* renamed from: i  reason: collision with root package name */
    private static final Object f3285i = new Object();

    /* renamed from: e  reason: collision with root package name */
    private boolean f3286e;

    /* renamed from: f  reason: collision with root package name */
    private int[] f3287f;

    /* renamed from: g  reason: collision with root package name */
    private Object[] f3288g;

    /* renamed from: h  reason: collision with root package name */
    private int f3289h;

    public h() {
        this(10);
    }

    public h(int i2) {
        this.f3286e = false;
        if (i2 == 0) {
            this.f3287f = c.a;
            this.f3288g = c.c;
            return;
        }
        int e2 = c.e(i2);
        this.f3287f = new int[e2];
        this.f3288g = new Object[e2];
    }

    private void f() {
        int i2 = this.f3289h;
        int[] iArr = this.f3287f;
        Object[] objArr = this.f3288g;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f3285i) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f3286e = false;
        this.f3289h = i3;
    }

    public void b(int i2, E e2) {
        int i3 = this.f3289h;
        if (i3 == 0 || i2 > this.f3287f[i3 - 1]) {
            if (this.f3286e && i3 >= this.f3287f.length) {
                f();
            }
            int i4 = this.f3289h;
            if (i4 >= this.f3287f.length) {
                int e3 = c.e(i4 + 1);
                int[] iArr = new int[e3];
                Object[] objArr = new Object[e3];
                int[] iArr2 = this.f3287f;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f3288g;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f3287f = iArr;
                this.f3288g = objArr;
            }
            this.f3287f[i4] = i2;
            this.f3288g[i4] = e2;
            this.f3289h = i4 + 1;
            return;
        }
        k(i2, e2);
    }

    public void d() {
        int i2 = this.f3289h;
        Object[] objArr = this.f3288g;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f3289h = 0;
        this.f3286e = false;
    }

    /* renamed from: e */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f3287f = (int[]) this.f3287f.clone();
            hVar.f3288g = (Object[]) this.f3288g.clone();
            return hVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E h(int i2) {
        return i(i2, (Object) null);
    }

    public E i(int i2, E e2) {
        int a = c.a(this.f3287f, this.f3289h, i2);
        if (a >= 0) {
            E[] eArr = this.f3288g;
            if (eArr[a] != f3285i) {
                return eArr[a];
            }
        }
        return e2;
    }

    public int j(int i2) {
        if (this.f3286e) {
            f();
        }
        return this.f3287f[i2];
    }

    public void k(int i2, E e2) {
        int a = c.a(this.f3287f, this.f3289h, i2);
        if (a >= 0) {
            this.f3288g[a] = e2;
            return;
        }
        int i3 = ~a;
        int i4 = this.f3289h;
        if (i3 < i4) {
            Object[] objArr = this.f3288g;
            if (objArr[i3] == f3285i) {
                this.f3287f[i3] = i2;
                objArr[i3] = e2;
                return;
            }
        }
        if (this.f3286e && i4 >= this.f3287f.length) {
            f();
            i3 = ~c.a(this.f3287f, this.f3289h, i2);
        }
        int i5 = this.f3289h;
        if (i5 >= this.f3287f.length) {
            int e3 = c.e(i5 + 1);
            int[] iArr = new int[e3];
            Object[] objArr2 = new Object[e3];
            int[] iArr2 = this.f3287f;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f3288g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3287f = iArr;
            this.f3288g = objArr2;
        }
        int i6 = this.f3289h;
        if (i6 - i3 != 0) {
            int[] iArr3 = this.f3287f;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr4 = this.f3288g;
            System.arraycopy(objArr4, i3, objArr4, i7, this.f3289h - i3);
        }
        this.f3287f[i3] = i2;
        this.f3288g[i3] = e2;
        this.f3289h++;
    }

    public int l() {
        if (this.f3286e) {
            f();
        }
        return this.f3289h;
    }

    public E m(int i2) {
        if (this.f3286e) {
            f();
        }
        return this.f3288g[i2];
    }

    public String toString() {
        if (l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3289h * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f3289h; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(j(i2));
            sb.append('=');
            Object m2 = m(i2);
            if (m2 != this) {
                sb.append(m2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
