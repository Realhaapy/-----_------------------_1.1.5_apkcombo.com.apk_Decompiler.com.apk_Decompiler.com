package f.e.c.a.z.a;

import f.e.c.a.z.a.b0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class x extends c<Float> implements b0.f, RandomAccess, b1 {

    /* renamed from: h  reason: collision with root package name */
    private static final x f4246h;

    /* renamed from: f  reason: collision with root package name */
    private float[] f4247f;

    /* renamed from: g  reason: collision with root package name */
    private int f4248g;

    static {
        x xVar = new x(new float[0], 0);
        f4246h = xVar;
        xVar.a();
    }

    x() {
        this(new float[10], 0);
    }

    private x(float[] fArr, int i2) {
        this.f4247f = fArr;
        this.f4248g = i2;
    }

    private void l(int i2, float f2) {
        int i3;
        h();
        if (i2 < 0 || i2 > (i3 = this.f4248g)) {
            throw new IndexOutOfBoundsException(p(i2));
        }
        float[] fArr = this.f4247f;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[(((i3 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.f4247f, i2, fArr2, i2 + 1, this.f4248g - i2);
            this.f4247f = fArr2;
        }
        this.f4247f[i2] = f2;
        this.f4248g++;
        this.modCount++;
    }

    private void m(int i2) {
        if (i2 < 0 || i2 >= this.f4248g) {
            throw new IndexOutOfBoundsException(p(i2));
        }
    }

    private String p(int i2) {
        return "Index:" + i2 + ", Size:" + this.f4248g;
    }

    public boolean addAll(Collection<? extends Float> collection) {
        h();
        b0.a(collection);
        if (!(collection instanceof x)) {
            return super.addAll(collection);
        }
        x xVar = (x) collection;
        int i2 = xVar.f4248g;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f4248g;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            float[] fArr = this.f4247f;
            if (i4 > fArr.length) {
                this.f4247f = Arrays.copyOf(fArr, i4);
            }
            System.arraycopy(xVar.f4247f, 0, this.f4247f, this.f4248g, xVar.f4248g);
            this.f4248g = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return super.equals(obj);
        }
        x xVar = (x) obj;
        if (this.f4248g != xVar.f4248g) {
            return false;
        }
        float[] fArr = xVar.f4247f;
        for (int i2 = 0; i2 < this.f4248g; i2++) {
            if (Float.floatToIntBits(this.f4247f[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f4248g; i3++) {
            i2 = (i2 * 31) + Float.floatToIntBits(this.f4247f[i3]);
        }
        return i2;
    }

    /* renamed from: i */
    public void add(int i2, Float f2) {
        l(i2, f2.floatValue());
    }

    /* renamed from: j */
    public boolean add(Float f2) {
        k(f2.floatValue());
        return true;
    }

    public void k(float f2) {
        h();
        int i2 = this.f4248g;
        float[] fArr = this.f4247f;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.f4247f = fArr2;
        }
        float[] fArr3 = this.f4247f;
        int i3 = this.f4248g;
        this.f4248g = i3 + 1;
        fArr3[i3] = f2;
    }

    /* renamed from: n */
    public Float get(int i2) {
        return Float.valueOf(o(i2));
    }

    public float o(int i2) {
        m(i2);
        return this.f4247f[i2];
    }

    /* renamed from: q */
    public b0.f b(int i2) {
        if (i2 >= this.f4248g) {
            return new x(Arrays.copyOf(this.f4247f, i2), this.f4248g);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: r */
    public Float remove(int i2) {
        h();
        m(i2);
        float[] fArr = this.f4247f;
        float f2 = fArr[i2];
        int i3 = this.f4248g;
        if (i2 < i3 - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (i3 - i2) - 1);
        }
        this.f4248g--;
        this.modCount++;
        return Float.valueOf(f2);
    }

    public boolean remove(Object obj) {
        h();
        for (int i2 = 0; i2 < this.f4248g; i2++) {
            if (obj.equals(Float.valueOf(this.f4247f[i2]))) {
                float[] fArr = this.f4247f;
                System.arraycopy(fArr, i2 + 1, fArr, i2, (this.f4248g - i2) - 1);
                this.f4248g--;
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
            float[] fArr = this.f4247f;
            System.arraycopy(fArr, i3, fArr, i2, this.f4248g - i3);
            this.f4248g -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Float set(int i2, Float f2) {
        return Float.valueOf(t(i2, f2.floatValue()));
    }

    public int size() {
        return this.f4248g;
    }

    public float t(int i2, float f2) {
        h();
        m(i2);
        float[] fArr = this.f4247f;
        float f3 = fArr[i2];
        fArr[i2] = f2;
        return f3;
    }
}
