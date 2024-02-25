package f.e.c.a.z.a;

import f.e.c.a.z.a.b0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class a0 extends c<Integer> implements b0.g, RandomAccess, b1 {

    /* renamed from: h  reason: collision with root package name */
    private static final a0 f4068h;

    /* renamed from: f  reason: collision with root package name */
    private int[] f4069f;

    /* renamed from: g  reason: collision with root package name */
    private int f4070g;

    static {
        a0 a0Var = new a0(new int[0], 0);
        f4068h = a0Var;
        a0Var.a();
    }

    a0() {
        this(new int[10], 0);
    }

    private a0(int[] iArr, int i2) {
        this.f4069f = iArr;
        this.f4070g = i2;
    }

    private void l(int i2, int i3) {
        int i4;
        h();
        if (i2 < 0 || i2 > (i4 = this.f4070g)) {
            throw new IndexOutOfBoundsException(p(i2));
        }
        int[] iArr = this.f4069f;
        if (i4 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i4 - i2);
        } else {
            int[] iArr2 = new int[(((i4 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f4069f, i2, iArr2, i2 + 1, this.f4070g - i2);
            this.f4069f = iArr2;
        }
        this.f4069f[i2] = i3;
        this.f4070g++;
        this.modCount++;
    }

    private void m(int i2) {
        if (i2 < 0 || i2 >= this.f4070g) {
            throw new IndexOutOfBoundsException(p(i2));
        }
    }

    private String p(int i2) {
        return "Index:" + i2 + ", Size:" + this.f4070g;
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        h();
        b0.a(collection);
        if (!(collection instanceof a0)) {
            return super.addAll(collection);
        }
        a0 a0Var = (a0) collection;
        int i2 = a0Var.f4070g;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f4070g;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            int[] iArr = this.f4069f;
            if (i4 > iArr.length) {
                this.f4069f = Arrays.copyOf(iArr, i4);
            }
            System.arraycopy(a0Var.f4069f, 0, this.f4069f, this.f4070g, a0Var.f4070g);
            this.f4070g = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return super.equals(obj);
        }
        a0 a0Var = (a0) obj;
        if (this.f4070g != a0Var.f4070g) {
            return false;
        }
        int[] iArr = a0Var.f4069f;
        for (int i2 = 0; i2 < this.f4070g; i2++) {
            if (this.f4069f[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f4070g; i3++) {
            i2 = (i2 * 31) + this.f4069f[i3];
        }
        return i2;
    }

    /* renamed from: i */
    public void add(int i2, Integer num) {
        l(i2, num.intValue());
    }

    /* renamed from: j */
    public boolean add(Integer num) {
        k(num.intValue());
        return true;
    }

    public void k(int i2) {
        h();
        int i3 = this.f4070g;
        int[] iArr = this.f4069f;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f4069f = iArr2;
        }
        int[] iArr3 = this.f4069f;
        int i4 = this.f4070g;
        this.f4070g = i4 + 1;
        iArr3[i4] = i2;
    }

    /* renamed from: n */
    public Integer get(int i2) {
        return Integer.valueOf(o(i2));
    }

    public int o(int i2) {
        m(i2);
        return this.f4069f[i2];
    }

    /* renamed from: q */
    public b0.g b(int i2) {
        if (i2 >= this.f4070g) {
            return new a0(Arrays.copyOf(this.f4069f, i2), this.f4070g);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: r */
    public Integer remove(int i2) {
        h();
        m(i2);
        int[] iArr = this.f4069f;
        int i3 = iArr[i2];
        int i4 = this.f4070g;
        if (i2 < i4 - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (i4 - i2) - 1);
        }
        this.f4070g--;
        this.modCount++;
        return Integer.valueOf(i3);
    }

    public boolean remove(Object obj) {
        h();
        for (int i2 = 0; i2 < this.f4070g; i2++) {
            if (obj.equals(Integer.valueOf(this.f4069f[i2]))) {
                int[] iArr = this.f4069f;
                System.arraycopy(iArr, i2 + 1, iArr, i2, (this.f4070g - i2) - 1);
                this.f4070g--;
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
            int[] iArr = this.f4069f;
            System.arraycopy(iArr, i3, iArr, i2, this.f4070g - i3);
            this.f4070g -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Integer set(int i2, Integer num) {
        return Integer.valueOf(t(i2, num.intValue()));
    }

    public int size() {
        return this.f4070g;
    }

    public int t(int i2, int i3) {
        h();
        m(i2);
        int[] iArr = this.f4069f;
        int i4 = iArr[i2];
        iArr[i2] = i3;
        return i4;
    }
}
