package f.e.e.m.b;

import java.lang.reflect.Array;

public final class a {
    private final b[] a;
    private int b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4524d;

    a(int i2, int i3) {
        b[] bVarArr = new b[i2];
        this.a = bVarArr;
        int length = bVarArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.a[i4] = new b(((i3 + 4) * 17) + 1);
        }
        this.f4524d = i3 * 17;
        this.c = i2;
        this.b = -1;
    }

    /* access modifiers changed from: package-private */
    public b a() {
        return this.a[this.b];
    }

    public byte[][] b(int i2, int i3) {
        int[] iArr = new int[2];
        iArr[1] = this.f4524d * i2;
        iArr[0] = this.c * i3;
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, iArr);
        int i4 = this.c * i3;
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[(i4 - i5) - 1] = this.a[i5 / i3].b(i2);
        }
        return bArr;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.b++;
    }
}
