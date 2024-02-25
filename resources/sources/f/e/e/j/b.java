package f.e.e.j;

import java.util.Arrays;

public final class b implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    private final int f4468e;

    /* renamed from: f  reason: collision with root package name */
    private final int f4469f;

    /* renamed from: g  reason: collision with root package name */
    private final int f4470g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f4471h;

    public b(int i2) {
        this(i2, i2);
    }

    public b(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f4468e = i2;
        this.f4469f = i3;
        int i4 = (i2 + 31) / 32;
        this.f4470g = i4;
        this.f4471h = new int[(i4 * i3)];
    }

    private b(int i2, int i3, int i4, int[] iArr) {
        this.f4468e = i2;
        this.f4469f = i3;
        this.f4470g = i4;
        this.f4471h = iArr;
    }

    private String b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f4469f * (this.f4468e + 1));
        for (int i2 = 0; i2 < this.f4469f; i2++) {
            for (int i3 = 0; i3 < this.f4468e; i3++) {
                sb.append(f(i3, i2) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    public void d() {
        int length = this.f4471h.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f4471h[i2] = 0;
        }
    }

    /* renamed from: e */
    public b clone() {
        return new b(this.f4468e, this.f4469f, this.f4470g, (int[]) this.f4471h.clone());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4468e == bVar.f4468e && this.f4469f == bVar.f4469f && this.f4470g == bVar.f4470g && Arrays.equals(this.f4471h, bVar.f4471h);
    }

    public boolean f(int i2, int i3) {
        return ((this.f4471h[(i3 * this.f4470g) + (i2 / 32)] >>> (i2 & 31)) & 1) != 0;
    }

    public int h() {
        return this.f4469f;
    }

    public int hashCode() {
        int i2 = this.f4468e;
        return (((((((i2 * 31) + i2) * 31) + this.f4469f) * 31) + this.f4470g) * 31) + Arrays.hashCode(this.f4471h);
    }

    public int i() {
        return this.f4468e;
    }

    public void j(int i2, int i3) {
        int i4 = (i3 * this.f4470g) + (i2 / 32);
        int[] iArr = this.f4471h;
        iArr[i4] = (1 << (i2 & 31)) | iArr[i4];
    }

    public void k(int i2, int i3, int i4, int i5) {
        if (i3 < 0 || i2 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i5 <= 0 || i4 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i6 = i4 + i2;
            int i7 = i5 + i3;
            if (i7 > this.f4469f || i6 > this.f4468e) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i3 < i7) {
                int i8 = this.f4470g * i3;
                for (int i9 = i2; i9 < i6; i9++) {
                    int[] iArr = this.f4471h;
                    int i10 = (i9 / 32) + i8;
                    iArr[i10] = iArr[i10] | (1 << (i9 & 31));
                }
                i3++;
            }
        }
    }

    public String l(String str, String str2) {
        return b(str, str2, "\n");
    }

    public String toString() {
        return l("X ", "  ");
    }
}
