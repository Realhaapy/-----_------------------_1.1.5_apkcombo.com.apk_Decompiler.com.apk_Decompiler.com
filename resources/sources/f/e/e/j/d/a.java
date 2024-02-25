package f.e.e.j.d;

public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f4487g = new a(4201, 4096, 1);

    /* renamed from: h  reason: collision with root package name */
    public static final a f4488h = new a(1033, 1024, 1);

    /* renamed from: i  reason: collision with root package name */
    public static final a f4489i = new a(67, 64, 1);

    /* renamed from: j  reason: collision with root package name */
    public static final a f4490j = new a(19, 16, 1);

    /* renamed from: k  reason: collision with root package name */
    public static final a f4491k = new a(285, 256, 0);

    /* renamed from: l  reason: collision with root package name */
    public static final a f4492l = new a(301, 256, 1);
    private final int[] a;
    private final int[] b;
    private final b c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4493d;

    /* renamed from: e  reason: collision with root package name */
    private final int f4494e;

    /* renamed from: f  reason: collision with root package name */
    private final int f4495f;

    public a(int i2, int i3, int i4) {
        this.f4494e = i2;
        this.f4493d = i3;
        this.f4495f = i4;
        this.a = new int[i3];
        this.b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.a[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.b[this.a[i7]] = i7;
        }
        this.c = new b(this, new int[]{0});
        new b(this, new int[]{1});
    }

    static int a(int i2, int i3) {
        return i2 ^ i3;
    }

    /* access modifiers changed from: package-private */
    public b b(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        } else if (i3 == 0) {
            return this.c;
        } else {
            int[] iArr = new int[(i2 + 1)];
            iArr[0] = i3;
            return new b(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    public int c(int i2) {
        return this.a[i2];
    }

    public int d() {
        return this.f4495f;
    }

    /* access modifiers changed from: package-private */
    public b e() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public int f(int i2) {
        if (i2 != 0) {
            return this.a[(this.f4493d - this.b[i2]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    public int g(int i2) {
        if (i2 != 0) {
            return this.b[i2];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public int h(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.a;
        int[] iArr2 = this.b;
        return iArr[(iArr2[i2] + iArr2[i3]) % (this.f4493d - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f4494e) + ',' + this.f4493d + ')';
    }
}
