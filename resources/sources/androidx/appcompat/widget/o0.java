package androidx.appcompat.widget;

class o0 {
    private int a = 0;
    private int b = 0;
    private int c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    private int f637d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private int f638e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f639f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f640g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f641h = false;

    o0() {
    }

    public int a() {
        return this.f640g ? this.a : this.b;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.f640g ? this.b : this.a;
    }

    public void e(int i2, int i3) {
        this.f641h = false;
        if (i2 != Integer.MIN_VALUE) {
            this.f638e = i2;
            this.a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f639f = i3;
            this.b = i3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f640g
            if (r2 != r0) goto L_0x0005
            return
        L_0x0005:
            r1.f640g = r2
            boolean r0 = r1.f641h
            if (r0 == 0) goto L_0x002b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x001d
            int r2 = r1.f637d
            if (r2 == r0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            int r2 = r1.f638e
        L_0x0016:
            r1.a = r2
            int r2 = r1.c
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x001d:
            int r2 = r1.c
            if (r2 == r0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            int r2 = r1.f638e
        L_0x0024:
            r1.a = r2
            int r2 = r1.f637d
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x002b:
            int r2 = r1.f638e
            r1.a = r2
        L_0x002f:
            int r2 = r1.f639f
        L_0x0031:
            r1.b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0.f(boolean):void");
    }

    public void g(int i2, int i3) {
        this.c = i2;
        this.f637d = i3;
        this.f641h = true;
        if (this.f640g) {
            if (i3 != Integer.MIN_VALUE) {
                this.a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.b = i3;
        }
    }
}
