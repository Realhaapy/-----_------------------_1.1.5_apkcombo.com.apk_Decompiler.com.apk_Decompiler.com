package f.e.c.a.z.a;

import f.e.c.a.z.a.b0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class j0 extends c<Long> implements b0.h, RandomAccess, b1 {

    /* renamed from: h  reason: collision with root package name */
    private static final j0 f4124h;

    /* renamed from: f  reason: collision with root package name */
    private long[] f4125f;

    /* renamed from: g  reason: collision with root package name */
    private int f4126g;

    static {
        j0 j0Var = new j0(new long[0], 0);
        f4124h = j0Var;
        j0Var.a();
    }

    j0() {
        this(new long[10], 0);
    }

    private j0(long[] jArr, int i2) {
        this.f4125f = jArr;
        this.f4126g = i2;
    }

    private void k(int i2, long j2) {
        int i3;
        h();
        if (i2 < 0 || i2 > (i3 = this.f4126g)) {
            throw new IndexOutOfBoundsException(p(i2));
        }
        long[] jArr = this.f4125f;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[(((i3 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.f4125f, i2, jArr2, i2 + 1, this.f4126g - i2);
            this.f4125f = jArr2;
        }
        this.f4125f[i2] = j2;
        this.f4126g++;
        this.modCount++;
    }

    private void m(int i2) {
        if (i2 < 0 || i2 >= this.f4126g) {
            throw new IndexOutOfBoundsException(p(i2));
        }
    }

    private String p(int i2) {
        return "Index:" + i2 + ", Size:" + this.f4126g;
    }

    public boolean addAll(Collection<? extends Long> collection) {
        h();
        b0.a(collection);
        if (!(collection instanceof j0)) {
            return super.addAll(collection);
        }
        j0 j0Var = (j0) collection;
        int i2 = j0Var.f4126g;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f4126g;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            long[] jArr = this.f4125f;
            if (i4 > jArr.length) {
                this.f4125f = Arrays.copyOf(jArr, i4);
            }
            System.arraycopy(j0Var.f4125f, 0, this.f4125f, this.f4126g, j0Var.f4126g);
            this.f4126g = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return super.equals(obj);
        }
        j0 j0Var = (j0) obj;
        if (this.f4126g != j0Var.f4126g) {
            return false;
        }
        long[] jArr = j0Var.f4125f;
        for (int i2 = 0; i2 < this.f4126g; i2++) {
            if (this.f4125f[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f4126g; i3++) {
            i2 = (i2 * 31) + b0.f(this.f4125f[i3]);
        }
        return i2;
    }

    /* renamed from: i */
    public void add(int i2, Long l2) {
        k(i2, l2.longValue());
    }

    /* renamed from: j */
    public boolean add(Long l2) {
        l(l2.longValue());
        return true;
    }

    public void l(long j2) {
        h();
        int i2 = this.f4126g;
        long[] jArr = this.f4125f;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.f4125f = jArr2;
        }
        long[] jArr3 = this.f4125f;
        int i3 = this.f4126g;
        this.f4126g = i3 + 1;
        jArr3[i3] = j2;
    }

    /* renamed from: n */
    public Long get(int i2) {
        return Long.valueOf(o(i2));
    }

    public long o(int i2) {
        m(i2);
        return this.f4125f[i2];
    }

    /* renamed from: q */
    public b0.h b(int i2) {
        if (i2 >= this.f4126g) {
            return new j0(Arrays.copyOf(this.f4125f, i2), this.f4126g);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: r */
    public Long remove(int i2) {
        h();
        m(i2);
        long[] jArr = this.f4125f;
        long j2 = jArr[i2];
        int i3 = this.f4126g;
        if (i2 < i3 - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (i3 - i2) - 1);
        }
        this.f4126g--;
        this.modCount++;
        return Long.valueOf(j2);
    }

    public boolean remove(Object obj) {
        h();
        for (int i2 = 0; i2 < this.f4126g; i2++) {
            if (obj.equals(Long.valueOf(this.f4125f[i2]))) {
                long[] jArr = this.f4125f;
                System.arraycopy(jArr, i2 + 1, jArr, i2, (this.f4126g - i2) - 1);
                this.f4126g--;
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
            long[] jArr = this.f4125f;
            System.arraycopy(jArr, i3, jArr, i2, this.f4126g - i3);
            this.f4126g -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Long set(int i2, Long l2) {
        return Long.valueOf(t(i2, l2.longValue()));
    }

    public int size() {
        return this.f4126g;
    }

    public long t(int i2, long j2) {
        h();
        m(i2);
        long[] jArr = this.f4125f;
        long j3 = jArr[i2];
        jArr[i2] = j2;
        return j3;
    }
}
