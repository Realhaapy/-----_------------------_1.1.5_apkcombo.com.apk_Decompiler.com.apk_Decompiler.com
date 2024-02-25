package f.e.e.j;

import java.util.Arrays;

public final class a implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    private int[] f4466e;

    /* renamed from: f  reason: collision with root package name */
    private int f4467f;

    public a() {
        this.f4467f = 0;
        this.f4466e = new int[1];
    }

    a(int[] iArr, int i2) {
        this.f4466e = iArr;
        this.f4467f = i2;
    }

    private void h(int i2) {
        if (i2 > (this.f4466e.length << 5)) {
            int[] l2 = l(i2);
            int[] iArr = this.f4466e;
            System.arraycopy(iArr, 0, l2, 0, iArr.length);
            this.f4466e = l2;
        }
    }

    private static int[] l(int i2) {
        return new int[((i2 + 31) / 32)];
    }

    public void b(boolean z) {
        h(this.f4467f + 1);
        if (z) {
            int[] iArr = this.f4466e;
            int i2 = this.f4467f;
            int i3 = i2 / 32;
            iArr[i3] = (1 << (i2 & 31)) | iArr[i3];
        }
        this.f4467f++;
    }

    public void d(a aVar) {
        int i2 = aVar.f4467f;
        h(this.f4467f + i2);
        for (int i3 = 0; i3 < i2; i3++) {
            b(aVar.i(i3));
        }
    }

    public void e(int i2, int i3) {
        if (i3 < 0 || i3 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        h(this.f4467f + i3);
        while (i3 > 0) {
            boolean z = true;
            if (((i2 >> (i3 - 1)) & 1) != 1) {
                z = false;
            }
            b(z);
            i3--;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4467f == aVar.f4467f && Arrays.equals(this.f4466e, aVar.f4466e);
    }

    /* renamed from: f */
    public a clone() {
        return new a((int[]) this.f4466e.clone(), this.f4467f);
    }

    public int hashCode() {
        return (this.f4467f * 31) + Arrays.hashCode(this.f4466e);
    }

    public boolean i(int i2) {
        return ((1 << (i2 & 31)) & this.f4466e[i2 / 32]) != 0;
    }

    public int j() {
        return this.f4467f;
    }

    public int k() {
        return (this.f4467f + 7) / 8;
    }

    public void m(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = 0;
            for (int i7 = 0; i7 < 8; i7++) {
                if (i(i2)) {
                    i6 |= 1 << (7 - i7);
                }
                i2++;
            }
            bArr[i3 + i5] = (byte) i6;
        }
    }

    public void n(a aVar) {
        if (this.f4467f == aVar.f4467f) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f4466e;
                if (i2 < iArr.length) {
                    iArr[i2] = iArr[i2] ^ aVar.f4466e[i2];
                    i2++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }

    public String toString() {
        int i2 = this.f4467f;
        StringBuilder sb = new StringBuilder(i2 + (i2 / 8) + 1);
        for (int i3 = 0; i3 < this.f4467f; i3++) {
            if ((i3 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(i(i3) ? 'X' : '.');
        }
        return sb.toString();
    }
}
