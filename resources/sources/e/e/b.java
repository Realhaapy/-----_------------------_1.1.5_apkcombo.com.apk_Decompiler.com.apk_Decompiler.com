package e.e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f3245i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    private static final Object[] f3246j = new Object[0];

    /* renamed from: k  reason: collision with root package name */
    private static Object[] f3247k;

    /* renamed from: l  reason: collision with root package name */
    private static int f3248l;

    /* renamed from: m  reason: collision with root package name */
    private static Object[] f3249m;

    /* renamed from: n  reason: collision with root package name */
    private static int f3250n;

    /* renamed from: e  reason: collision with root package name */
    private int[] f3251e;

    /* renamed from: f  reason: collision with root package name */
    Object[] f3252f;

    /* renamed from: g  reason: collision with root package name */
    int f3253g;

    /* renamed from: h  reason: collision with root package name */
    private f<E, E> f3254h;

    class a extends f<E, E> {
        a() {
        }

        /* access modifiers changed from: protected */
        public void a() {
            b.this.clear();
        }

        /* access modifiers changed from: protected */
        public Object b(int i2, int i3) {
            return b.this.f3252f[i2];
        }

        /* access modifiers changed from: protected */
        public Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        public int d() {
            return b.this.f3253g;
        }

        /* access modifiers changed from: protected */
        public int e(Object obj) {
            return b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        public int f(Object obj) {
            return b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        public void g(E e2, E e3) {
            b.this.add(e2);
        }

        /* access modifiers changed from: protected */
        public void h(int i2) {
            b.this.n(i2);
        }

        /* access modifiers changed from: protected */
        public E i(int i2, E e2) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    public b(int i2) {
        if (i2 == 0) {
            this.f3251e = f3245i;
            this.f3252f = f3246j;
        } else {
            h(i2);
        }
        this.f3253g = 0;
    }

    private void h(int i2) {
        if (i2 == 8) {
            synchronized (b.class) {
                Object[] objArr = f3249m;
                if (objArr != null) {
                    this.f3252f = objArr;
                    f3249m = (Object[]) objArr[0];
                    this.f3251e = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f3250n--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f3247k;
                if (objArr2 != null) {
                    this.f3252f = objArr2;
                    f3247k = (Object[]) objArr2[0];
                    this.f3251e = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f3248l--;
                    return;
                }
            }
        }
        this.f3251e = new int[i2];
        this.f3252f = new Object[i2];
    }

    private static void j(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f3250n < 10) {
                    objArr[0] = f3249m;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f3249m = objArr;
                    f3250n++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (b.class) {
                if (f3248l < 10) {
                    objArr[0] = f3247k;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f3247k = objArr;
                    f3248l++;
                }
            }
        }
    }

    private f<E, E> k() {
        if (this.f3254h == null) {
            this.f3254h = new a();
        }
        return this.f3254h;
    }

    private int l(Object obj, int i2) {
        int i3 = this.f3253g;
        if (i3 == 0) {
            return -1;
        }
        int a2 = c.a(this.f3251e, i3, i2);
        if (a2 < 0 || obj.equals(this.f3252f[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f3251e[i4] == i2) {
            if (obj.equals(this.f3252f[i4])) {
                return i4;
            }
            i4++;
        }
        int i5 = a2 - 1;
        while (i5 >= 0 && this.f3251e[i5] == i2) {
            if (obj.equals(this.f3252f[i5])) {
                return i5;
            }
            i5--;
        }
        return ~i4;
    }

    private int m() {
        int i2 = this.f3253g;
        if (i2 == 0) {
            return -1;
        }
        int a2 = c.a(this.f3251e, i2, 0);
        if (a2 < 0 || this.f3252f[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f3251e[i3] == 0) {
            if (this.f3252f[i3] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = a2 - 1;
        while (i4 >= 0 && this.f3251e[i4] == 0) {
            if (this.f3252f[i4] == null) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public boolean add(E e2) {
        int i2;
        int i3;
        if (e2 == null) {
            i3 = m();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            i3 = l(e2, hashCode);
        }
        if (i3 >= 0) {
            return false;
        }
        int i4 = ~i3;
        int i5 = this.f3253g;
        int[] iArr = this.f3251e;
        if (i5 >= iArr.length) {
            int i6 = 4;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.f3252f;
            h(i6);
            int[] iArr2 = this.f3251e;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f3252f, 0, objArr.length);
            }
            j(iArr, objArr, this.f3253g);
        }
        int i7 = this.f3253g;
        if (i4 < i7) {
            int[] iArr3 = this.f3251e;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.f3252f;
            System.arraycopy(objArr2, i4, objArr2, i8, this.f3253g - i4);
        }
        this.f3251e[i4] = i2;
        this.f3252f[i4] = e2;
        this.f3253g++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        i(this.f3253g + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public void clear() {
        int i2 = this.f3253g;
        if (i2 != 0) {
            j(this.f3251e, this.f3252f, i2);
            this.f3251e = f3245i;
            this.f3252f = f3246j;
            this.f3253g = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f3253g) {
                try {
                    if (!set.contains(o(i2))) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f3251e;
        int i2 = this.f3253g;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public void i(int i2) {
        int[] iArr = this.f3251e;
        if (iArr.length < i2) {
            Object[] objArr = this.f3252f;
            h(i2);
            int i3 = this.f3253g;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f3251e, 0, i3);
                System.arraycopy(objArr, 0, this.f3252f, 0, this.f3253g);
            }
            j(iArr, objArr, this.f3253g);
        }
    }

    public int indexOf(Object obj) {
        return obj == null ? m() : l(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f3253g <= 0;
    }

    public Iterator<E> iterator() {
        return k().m().iterator();
    }

    public E n(int i2) {
        E[] eArr = this.f3252f;
        E e2 = eArr[i2];
        int i3 = this.f3253g;
        if (i3 <= 1) {
            j(this.f3251e, eArr, i3);
            this.f3251e = f3245i;
            this.f3252f = f3246j;
            this.f3253g = 0;
        } else {
            int[] iArr = this.f3251e;
            int i4 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i5 = i3 - 1;
                this.f3253g = i5;
                if (i2 < i5) {
                    int i6 = i2 + 1;
                    System.arraycopy(iArr, i6, iArr, i2, i5 - i2);
                    Object[] objArr = this.f3252f;
                    System.arraycopy(objArr, i6, objArr, i2, this.f3253g - i2);
                }
                this.f3252f[this.f3253g] = null;
            } else {
                if (i3 > 8) {
                    i4 = i3 + (i3 >> 1);
                }
                h(i4);
                this.f3253g--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f3251e, 0, i2);
                    System.arraycopy(eArr, 0, this.f3252f, 0, i2);
                }
                int i7 = this.f3253g;
                if (i2 < i7) {
                    int i8 = i2 + 1;
                    System.arraycopy(iArr, i8, this.f3251e, i2, i7 - i2);
                    System.arraycopy(eArr, i8, this.f3252f, i2, this.f3253g - i2);
                }
            }
        }
        return e2;
    }

    public E o(int i2) {
        return this.f3252f[i2];
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        n(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.f3253g - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f3252f[i2])) {
                n(i2);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f3253g;
    }

    public Object[] toArray() {
        int i2 = this.f3253g;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f3252f, 0, objArr, 0, i2);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f3253g) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f3253g);
        }
        System.arraycopy(this.f3252f, 0, tArr, 0, this.f3253g);
        int length = tArr.length;
        int i2 = this.f3253g;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3253g * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f3253g; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object o2 = o(i2);
            if (o2 != this) {
                sb.append(o2);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
