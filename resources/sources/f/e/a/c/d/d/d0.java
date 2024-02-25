package f.e.a.c.d.d;

import java.util.Arrays;

public final class d0 {
    Object[] a = new Object[8];
    int b = 0;
    c0 c;

    public final d0 a(Object obj, Object obj2) {
        int i2 = this.b + 1;
        int i3 = i2 + i2;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i3 > length) {
            int i4 = length + (length >> 1) + 1;
            if (i4 < i3) {
                int highestOneBit = Integer.highestOneBit(i3 - 1);
                i4 = highestOneBit + highestOneBit;
            }
            if (i4 < 0) {
                i4 = Integer.MAX_VALUE;
            }
            this.a = Arrays.copyOf(objArr, i4);
        }
        w.a(obj, obj2);
        Object[] objArr2 = this.a;
        int i5 = this.b;
        int i6 = i5 + i5;
        objArr2[i6] = obj;
        objArr2[i6 + 1] = obj2;
        this.b = i5 + 1;
        return this;
    }

    public final e0 b() {
        c0 c0Var = this.c;
        if (c0Var == null) {
            g f2 = g.f(this.b, this.a, this);
            c0 c0Var2 = this.c;
            if (c0Var2 == null) {
                return f2;
            }
            throw c0Var2.a();
        }
        throw c0Var.a();
    }
}
