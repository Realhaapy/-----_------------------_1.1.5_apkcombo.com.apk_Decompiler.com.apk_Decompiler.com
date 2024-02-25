package f.e.c.a.z.a;

import java.util.Arrays;
import java.util.RandomAccess;

final class e1<E> extends c<E> implements RandomAccess {

    /* renamed from: h  reason: collision with root package name */
    private static final e1<Object> f4093h;

    /* renamed from: f  reason: collision with root package name */
    private E[] f4094f;

    /* renamed from: g  reason: collision with root package name */
    private int f4095g;

    static {
        e1<Object> e1Var = new e1<>(new Object[0], 0);
        f4093h = e1Var;
        e1Var.a();
    }

    private e1(E[] eArr, int i2) {
        this.f4094f = eArr;
        this.f4095g = i2;
    }

    private static <E> E[] i(int i2) {
        return new Object[i2];
    }

    public static <E> e1<E> j() {
        return f4093h;
    }

    private void k(int i2) {
        if (i2 < 0 || i2 >= this.f4095g) {
            throw new IndexOutOfBoundsException(l(i2));
        }
    }

    private String l(int i2) {
        return "Index:" + i2 + ", Size:" + this.f4095g;
    }

    public void add(int i2, E e2) {
        int i3;
        h();
        if (i2 < 0 || i2 > (i3 = this.f4095g)) {
            throw new IndexOutOfBoundsException(l(i2));
        }
        E[] eArr = this.f4094f;
        if (i3 < eArr.length) {
            System.arraycopy(eArr, i2, eArr, i2 + 1, i3 - i2);
        } else {
            E[] i4 = i(((i3 * 3) / 2) + 1);
            System.arraycopy(this.f4094f, 0, i4, 0, i2);
            System.arraycopy(this.f4094f, i2, i4, i2 + 1, this.f4095g - i2);
            this.f4094f = i4;
        }
        this.f4094f[i2] = e2;
        this.f4095g++;
        this.modCount++;
    }

    public boolean add(E e2) {
        h();
        int i2 = this.f4095g;
        E[] eArr = this.f4094f;
        if (i2 == eArr.length) {
            this.f4094f = Arrays.copyOf(eArr, ((i2 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f4094f;
        int i3 = this.f4095g;
        this.f4095g = i3 + 1;
        eArr2[i3] = e2;
        this.modCount++;
        return true;
    }

    public E get(int i2) {
        k(i2);
        return this.f4094f[i2];
    }

    /* renamed from: m */
    public e1<E> b(int i2) {
        if (i2 >= this.f4095g) {
            return new e1<>(Arrays.copyOf(this.f4094f, i2), this.f4095g);
        }
        throw new IllegalArgumentException();
    }

    public E remove(int i2) {
        h();
        k(i2);
        E[] eArr = this.f4094f;
        E e2 = eArr[i2];
        int i3 = this.f4095g;
        if (i2 < i3 - 1) {
            System.arraycopy(eArr, i2 + 1, eArr, i2, (i3 - i2) - 1);
        }
        this.f4095g--;
        this.modCount++;
        return e2;
    }

    public E set(int i2, E e2) {
        h();
        k(i2);
        E[] eArr = this.f4094f;
        E e3 = eArr[i2];
        eArr[i2] = e2;
        this.modCount++;
        return e3;
    }

    public int size() {
        return this.f4095g;
    }
}
