package f.e.c.a.z.a;

import f.e.c.a.z.a.b0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class g extends c<Boolean> implements b0.a, RandomAccess, b1 {

    /* renamed from: h  reason: collision with root package name */
    private static final g f4101h;

    /* renamed from: f  reason: collision with root package name */
    private boolean[] f4102f;

    /* renamed from: g  reason: collision with root package name */
    private int f4103g;

    static {
        g gVar = new g(new boolean[0], 0);
        f4101h = gVar;
        gVar.a();
    }

    g() {
        this(new boolean[10], 0);
    }

    private g(boolean[] zArr, int i2) {
        this.f4102f = zArr;
        this.f4103g = i2;
    }

    private void k(int i2, boolean z) {
        int i3;
        h();
        if (i2 < 0 || i2 > (i3 = this.f4103g)) {
            throw new IndexOutOfBoundsException(p(i2));
        }
        boolean[] zArr = this.f4102f;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[(((i3 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.f4102f, i2, zArr2, i2 + 1, this.f4103g - i2);
            this.f4102f = zArr2;
        }
        this.f4102f[i2] = z;
        this.f4103g++;
        this.modCount++;
    }

    private void m(int i2) {
        if (i2 < 0 || i2 >= this.f4103g) {
            throw new IndexOutOfBoundsException(p(i2));
        }
    }

    private String p(int i2) {
        return "Index:" + i2 + ", Size:" + this.f4103g;
    }

    public boolean addAll(Collection<? extends Boolean> collection) {
        h();
        b0.a(collection);
        if (!(collection instanceof g)) {
            return super.addAll(collection);
        }
        g gVar = (g) collection;
        int i2 = gVar.f4103g;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f4103g;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            boolean[] zArr = this.f4102f;
            if (i4 > zArr.length) {
                this.f4102f = Arrays.copyOf(zArr, i4);
            }
            System.arraycopy(gVar.f4102f, 0, this.f4102f, this.f4103g, gVar.f4103g);
            this.f4103g = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return super.equals(obj);
        }
        g gVar = (g) obj;
        if (this.f4103g != gVar.f4103g) {
            return false;
        }
        boolean[] zArr = gVar.f4102f;
        for (int i2 = 0; i2 < this.f4103g; i2++) {
            if (this.f4102f[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f4103g; i3++) {
            i2 = (i2 * 31) + b0.c(this.f4102f[i3]);
        }
        return i2;
    }

    /* renamed from: i */
    public void add(int i2, Boolean bool) {
        k(i2, bool.booleanValue());
    }

    /* renamed from: j */
    public boolean add(Boolean bool) {
        l(bool.booleanValue());
        return true;
    }

    public void l(boolean z) {
        h();
        int i2 = this.f4103g;
        boolean[] zArr = this.f4102f;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f4102f = zArr2;
        }
        boolean[] zArr3 = this.f4102f;
        int i3 = this.f4103g;
        this.f4103g = i3 + 1;
        zArr3[i3] = z;
    }

    /* renamed from: n */
    public Boolean get(int i2) {
        return Boolean.valueOf(o(i2));
    }

    public boolean o(int i2) {
        m(i2);
        return this.f4102f[i2];
    }

    /* renamed from: q */
    public b0.a b(int i2) {
        if (i2 >= this.f4103g) {
            return new g(Arrays.copyOf(this.f4102f, i2), this.f4103g);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: r */
    public Boolean remove(int i2) {
        h();
        m(i2);
        boolean[] zArr = this.f4102f;
        boolean z = zArr[i2];
        int i3 = this.f4103g;
        if (i2 < i3 - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (i3 - i2) - 1);
        }
        this.f4103g--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public boolean remove(Object obj) {
        h();
        for (int i2 = 0; i2 < this.f4103g; i2++) {
            if (obj.equals(Boolean.valueOf(this.f4102f[i2]))) {
                boolean[] zArr = this.f4102f;
                System.arraycopy(zArr, i2 + 1, zArr, i2, (this.f4103g - i2) - 1);
                this.f4103g--;
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
            boolean[] zArr = this.f4102f;
            System.arraycopy(zArr, i3, zArr, i2, this.f4103g - i3);
            this.f4103g -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Boolean set(int i2, Boolean bool) {
        return Boolean.valueOf(t(i2, bool.booleanValue()));
    }

    public int size() {
        return this.f4103g;
    }

    public boolean t(int i2, boolean z) {
        h();
        m(i2);
        boolean[] zArr = this.f4102f;
        boolean z2 = zArr[i2];
        zArr[i2] = z;
        return z2;
    }
}
