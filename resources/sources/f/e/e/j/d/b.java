package f.e.e.j.d;

final class b {
    private final a a;
    private final int[] b;

    b(a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.b = iArr;
                return;
            }
            int i2 = 1;
            while (i2 < length && iArr[i2] == 0) {
                i2++;
            }
            if (i2 == length) {
                this.b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i2)];
            this.b = iArr2;
            System.arraycopy(iArr, i2, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public b a(b bVar) {
        if (!this.a.equals(bVar.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (f()) {
            return bVar;
        } else {
            if (bVar.f()) {
                return this;
            }
            int[] iArr = this.b;
            int[] iArr2 = bVar.b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i2 = length; i2 < iArr.length; i2++) {
                iArr4[i2] = a.a(iArr2[i2 - length], iArr[i2]);
            }
            return new b(this.a, iArr4);
        }
    }

    /* access modifiers changed from: package-private */
    public b[] b(b bVar) {
        if (!this.a.equals(bVar.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (!bVar.f()) {
            b e2 = this.a.e();
            int f2 = this.a.f(bVar.c(bVar.e()));
            b bVar2 = this;
            while (bVar2.e() >= bVar.e() && !bVar2.f()) {
                int e3 = bVar2.e() - bVar.e();
                int h2 = this.a.h(bVar2.c(bVar2.e()), f2);
                b h3 = bVar.h(e3, h2);
                e2 = e2.a(this.a.b(e3, h2));
                bVar2 = bVar2.a(h3);
            }
            return new b[]{e2, bVar2};
        } else {
            throw new IllegalArgumentException("Divide by 0");
        }
    }

    /* access modifiers changed from: package-private */
    public int c(int i2) {
        int[] iArr = this.b;
        return iArr[(iArr.length - 1) - i2];
    }

    /* access modifiers changed from: package-private */
    public int[] d() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.b.length - 1;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.b[0] == 0;
    }

    /* access modifiers changed from: package-private */
    public b g(b bVar) {
        if (!this.a.equals(bVar.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (f() || bVar.f()) {
            return this.a.e();
        } else {
            int[] iArr = this.b;
            int length = iArr.length;
            int[] iArr2 = bVar.b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = iArr[i2];
                for (int i4 = 0; i4 < length2; i4++) {
                    int i5 = i2 + i4;
                    iArr3[i5] = a.a(iArr3[i5], this.a.h(i3, iArr2[i4]));
                }
            }
            return new b(this.a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    public b h(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        } else if (i3 == 0) {
            return this.a.e();
        } else {
            int length = this.b.length;
            int[] iArr = new int[(i2 + length)];
            for (int i4 = 0; i4 < length; i4++) {
                iArr[i4] = this.a.h(this.b[i4], i3);
            }
            return new b(this.a, iArr);
        }
    }

    public String toString() {
        char c;
        StringBuilder sb = new StringBuilder(e() * 8);
        for (int e2 = e(); e2 >= 0; e2--) {
            int c2 = c(e2);
            if (c2 != 0) {
                if (c2 < 0) {
                    sb.append(" - ");
                    c2 = -c2;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (e2 == 0 || c2 != 1) {
                    int g2 = this.a.g(c2);
                    if (g2 == 0) {
                        c = '1';
                    } else if (g2 == 1) {
                        c = 'a';
                    } else {
                        sb.append("a^");
                        sb.append(g2);
                    }
                    sb.append(c);
                }
                if (e2 != 0) {
                    if (e2 == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(e2);
                    }
                }
            }
        }
        return sb.toString();
    }
}
