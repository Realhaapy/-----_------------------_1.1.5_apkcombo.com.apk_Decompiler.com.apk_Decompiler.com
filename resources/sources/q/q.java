package q;

import java.util.Arrays;

final class q extends f {

    /* renamed from: j  reason: collision with root package name */
    final transient byte[][] f5510j;

    /* renamed from: k  reason: collision with root package name */
    final transient int[] f5511k;

    q(c cVar, int i2) {
        super((byte[]) null);
        u.b(cVar.f5477f, 0, (long) i2);
        o oVar = cVar.f5476e;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = oVar.c;
            int i7 = oVar.b;
            if (i6 != i7) {
                i4 += i6 - i7;
                i5++;
                oVar = oVar.f5508f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f5510j = new byte[i5][];
        this.f5511k = new int[(i5 * 2)];
        o oVar2 = cVar.f5476e;
        int i8 = 0;
        while (i3 < i2) {
            byte[][] bArr = this.f5510j;
            bArr[i8] = oVar2.a;
            int i9 = oVar2.c;
            int i10 = oVar2.b;
            i3 += i9 - i10;
            if (i3 > i2) {
                i3 = i2;
            }
            int[] iArr = this.f5511k;
            iArr[i8] = i3;
            iArr[bArr.length + i8] = i10;
            oVar2.f5506d = true;
            i8++;
            oVar2 = oVar2.f5508f;
        }
    }

    private int C(int i2) {
        int binarySearch = Arrays.binarySearch(this.f5511k, 0, this.f5510j.length, i2 + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    private f D() {
        return new f(z());
    }

    private Object writeReplace() {
        return D();
    }

    public String A() {
        return D().A();
    }

    /* access modifiers changed from: package-private */
    public void B(c cVar) {
        int length = this.f5510j.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr = this.f5511k;
            int i4 = iArr[length + i2];
            int i5 = iArr[i2];
            o oVar = new o(this.f5510j[i2], i4, (i4 + i5) - i3, true, false);
            o oVar2 = cVar.f5476e;
            if (oVar2 == null) {
                oVar.f5509g = oVar;
                oVar.f5508f = oVar;
                cVar.f5476e = oVar;
            } else {
                oVar2.f5509g.c(oVar);
            }
            i2++;
            i3 = i5;
        }
        cVar.f5477f += (long) i3;
    }

    public String a() {
        return D().a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return fVar.v() == v() && n(0, fVar, 0, v());
        }
    }

    public int hashCode() {
        int i2 = this.f5481f;
        if (i2 != 0) {
            return i2;
        }
        int length = this.f5510j.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i3 < length) {
            byte[] bArr = this.f5510j[i3];
            int[] iArr = this.f5511k;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            int i8 = (i7 - i4) + i6;
            while (i6 < i8) {
                i5 = (i5 * 31) + bArr[i6];
                i6++;
            }
            i3++;
            i4 = i7;
        }
        this.f5481f = i5;
        return i5;
    }

    public byte k(int i2) {
        u.b((long) this.f5511k[this.f5510j.length - 1], (long) i2, 1);
        int C = C(i2);
        int i3 = C == 0 ? 0 : this.f5511k[C - 1];
        int[] iArr = this.f5511k;
        byte[][] bArr = this.f5510j;
        return bArr[C][(i2 - i3) + iArr[bArr.length + C]];
    }

    public String l() {
        return D().l();
    }

    public boolean n(int i2, f fVar, int i3, int i4) {
        if (i2 < 0 || i2 > v() - i4) {
            return false;
        }
        int C = C(i2);
        while (i4 > 0) {
            int i5 = C == 0 ? 0 : this.f5511k[C - 1];
            int min = Math.min(i4, ((this.f5511k[C] - i5) + i5) - i2);
            int[] iArr = this.f5511k;
            byte[][] bArr = this.f5510j;
            if (!fVar.o(i3, bArr[C], (i2 - i5) + iArr[bArr.length + C], min)) {
                return false;
            }
            i2 += min;
            i3 += min;
            i4 -= min;
            C++;
        }
        return true;
    }

    public boolean o(int i2, byte[] bArr, int i3, int i4) {
        if (i2 < 0 || i2 > v() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int C = C(i2);
        while (i4 > 0) {
            int i5 = C == 0 ? 0 : this.f5511k[C - 1];
            int min = Math.min(i4, ((this.f5511k[C] - i5) + i5) - i2);
            int[] iArr = this.f5511k;
            byte[][] bArr2 = this.f5510j;
            if (!u.a(bArr2[C], (i2 - i5) + iArr[bArr2.length + C], bArr, i3, min)) {
                return false;
            }
            i2 += min;
            i3 += min;
            i4 -= min;
            C++;
        }
        return true;
    }

    public f t() {
        return D().t();
    }

    public String toString() {
        return D().toString();
    }

    public f u() {
        return D().u();
    }

    public int v() {
        return this.f5511k[this.f5510j.length - 1];
    }

    public f x(int i2, int i3) {
        return D().x(i2, i3);
    }

    public f y() {
        return D().y();
    }

    public byte[] z() {
        int[] iArr = this.f5511k;
        byte[][] bArr = this.f5510j;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr2 = this.f5511k;
            int i4 = iArr2[length + i2];
            int i5 = iArr2[i2];
            System.arraycopy(this.f5510j[i2], i4, bArr2, i3, i5 - i3);
            i2++;
            i3 = i5;
        }
        return bArr2;
    }
}
