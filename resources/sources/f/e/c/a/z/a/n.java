package f.e.c.a.z.a;

import f.e.c.a.z.a.b0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class n extends c<Double> implements b0.b, RandomAccess, b1 {

    /* renamed from: h  reason: collision with root package name */
    private static final n f4157h;

    /* renamed from: f  reason: collision with root package name */
    private double[] f4158f;

    /* renamed from: g  reason: collision with root package name */
    private int f4159g;

    static {
        n nVar = new n(new double[0], 0);
        f4157h = nVar;
        nVar.a();
    }

    n() {
        this(new double[10], 0);
    }

    private n(double[] dArr, int i2) {
        this.f4158f = dArr;
        this.f4159g = i2;
    }

    private void l(int i2, double d2) {
        int i3;
        h();
        if (i2 < 0 || i2 > (i3 = this.f4159g)) {
            throw new IndexOutOfBoundsException(p(i2));
        }
        double[] dArr = this.f4158f;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[(((i3 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.f4158f, i2, dArr2, i2 + 1, this.f4159g - i2);
            this.f4158f = dArr2;
        }
        this.f4158f[i2] = d2;
        this.f4159g++;
        this.modCount++;
    }

    private void m(int i2) {
        if (i2 < 0 || i2 >= this.f4159g) {
            throw new IndexOutOfBoundsException(p(i2));
        }
    }

    private String p(int i2) {
        return "Index:" + i2 + ", Size:" + this.f4159g;
    }

    public boolean addAll(Collection<? extends Double> collection) {
        h();
        b0.a(collection);
        if (!(collection instanceof n)) {
            return super.addAll(collection);
        }
        n nVar = (n) collection;
        int i2 = nVar.f4159g;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f4159g;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            double[] dArr = this.f4158f;
            if (i4 > dArr.length) {
                this.f4158f = Arrays.copyOf(dArr, i4);
            }
            System.arraycopy(nVar.f4158f, 0, this.f4158f, this.f4159g, nVar.f4159g);
            this.f4159g = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return super.equals(obj);
        }
        n nVar = (n) obj;
        if (this.f4159g != nVar.f4159g) {
            return false;
        }
        double[] dArr = nVar.f4158f;
        for (int i2 = 0; i2 < this.f4159g; i2++) {
            if (Double.doubleToLongBits(this.f4158f[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f4159g; i3++) {
            i2 = (i2 * 31) + b0.f(Double.doubleToLongBits(this.f4158f[i3]));
        }
        return i2;
    }

    /* renamed from: i */
    public void add(int i2, Double d2) {
        l(i2, d2.doubleValue());
    }

    /* renamed from: j */
    public boolean add(Double d2) {
        k(d2.doubleValue());
        return true;
    }

    public void k(double d2) {
        h();
        int i2 = this.f4159g;
        double[] dArr = this.f4158f;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.f4158f = dArr2;
        }
        double[] dArr3 = this.f4158f;
        int i3 = this.f4159g;
        this.f4159g = i3 + 1;
        dArr3[i3] = d2;
    }

    /* renamed from: n */
    public Double get(int i2) {
        return Double.valueOf(o(i2));
    }

    public double o(int i2) {
        m(i2);
        return this.f4158f[i2];
    }

    /* renamed from: q */
    public b0.b b(int i2) {
        if (i2 >= this.f4159g) {
            return new n(Arrays.copyOf(this.f4158f, i2), this.f4159g);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: r */
    public Double remove(int i2) {
        h();
        m(i2);
        double[] dArr = this.f4158f;
        double d2 = dArr[i2];
        int i3 = this.f4159g;
        if (i2 < i3 - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (i3 - i2) - 1);
        }
        this.f4159g--;
        this.modCount++;
        return Double.valueOf(d2);
    }

    public boolean remove(Object obj) {
        h();
        for (int i2 = 0; i2 < this.f4159g; i2++) {
            if (obj.equals(Double.valueOf(this.f4158f[i2]))) {
                double[] dArr = this.f4158f;
                System.arraycopy(dArr, i2 + 1, dArr, i2, (this.f4159g - i2) - 1);
                this.f4159g--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i2, int i3) {
        h();
        if (i3 >= i2) {
            double[] dArr = this.f4158f;
            System.arraycopy(dArr, i3, dArr, i2, this.f4159g - i3);
            this.f4159g -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Double set(int i2, Double d2) {
        return Double.valueOf(t(i2, d2.doubleValue()));
    }

    public int size() {
        return this.f4159g;
    }

    public double t(int i2, double d2) {
        h();
        m(i2);
        double[] dArr = this.f4158f;
        double d3 = dArr[i2];
        dArr[i2] = d2;
        return d3;
    }
}
