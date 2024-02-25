package f.e.e.n.c;

import java.lang.reflect.Array;
import java.util.Arrays;

public final class b {
    private final byte[][] a;
    private final int b;
    private final int c;

    public b(int i2, int i3) {
        int[] iArr = new int[2];
        iArr[1] = i2;
        iArr[0] = i3;
        this.a = (byte[][]) Array.newInstance(byte.class, iArr);
        this.b = i2;
        this.c = i3;
    }

    public void a(byte b2) {
        for (byte[] fill : this.a) {
            Arrays.fill(fill, b2);
        }
    }

    public byte b(int i2, int i3) {
        return this.a[i3][i2];
    }

    public byte[][] c() {
        return this.a;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.b;
    }

    public void f(int i2, int i3, int i4) {
        this.a[i3][i2] = (byte) i4;
    }

    public void g(int i2, int i3, boolean z) {
        this.a[i3][i2] = z ? (byte) 1 : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.b * 2 * this.c) + 2);
        for (int i2 = 0; i2 < this.c; i2++) {
            byte[] bArr = this.a[i2];
            for (int i3 = 0; i3 < this.b; i3++) {
                byte b2 = bArr[i3];
                sb.append(b2 != 0 ? b2 != 1 ? "  " : " 1" : " 0");
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
