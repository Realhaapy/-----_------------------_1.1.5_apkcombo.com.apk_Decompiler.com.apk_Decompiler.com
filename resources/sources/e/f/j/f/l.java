package e.f.j.f;

final class l {

    /* renamed from: k  reason: collision with root package name */
    static final l f3343k = k(d.c, (float) ((((double) d.h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    private final float a;
    private final float b;
    private final float c;

    /* renamed from: d  reason: collision with root package name */
    private final float f3344d;

    /* renamed from: e  reason: collision with root package name */
    private final float f3345e;

    /* renamed from: f  reason: collision with root package name */
    private final float f3346f;

    /* renamed from: g  reason: collision with root package name */
    private final float[] f3347g;

    /* renamed from: h  reason: collision with root package name */
    private final float f3348h;

    /* renamed from: i  reason: collision with root package name */
    private final float f3349i;

    /* renamed from: j  reason: collision with root package name */
    private final float f3350j;

    private l(float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, float f8, float f9, float f10) {
        this.f3346f = f2;
        this.a = f3;
        this.b = f4;
        this.c = f5;
        this.f3344d = f6;
        this.f3345e = f7;
        this.f3347g = fArr;
        this.f3348h = f8;
        this.f3349i = f9;
        this.f3350j = f10;
    }

    static l k(float[] fArr, float f2, float f3, float f4, boolean z) {
        float f5 = f2;
        float[][] fArr2 = d.a;
        float f6 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f7 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f8 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f9 = (f4 / 10.0f) + 0.8f;
        float d2 = ((double) f9) >= 0.9d ? d.d(0.59f, 0.69f, (f9 - 0.9f) * 10.0f) : d.d(0.525f, 0.59f, (f9 - 0.8f) * 10.0f);
        float exp = z ? 1.0f : (1.0f - (((float) Math.exp((double) (((-f5) - 42.0f) / 92.0f))) * 0.2777778f)) * f9;
        double d3 = (double) exp;
        if (d3 > 1.0d) {
            exp = 1.0f;
        } else if (d3 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f6) * exp) + 1.0f) - exp, (((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp};
        float f10 = 1.0f / ((5.0f * f5) + 1.0f);
        float f11 = f10 * f10 * f10 * f10;
        float f12 = 1.0f - f11;
        float cbrt = (f11 * f5) + (0.1f * f12 * f12 * ((float) Math.cbrt(((double) f5) * 5.0d)));
        float h2 = d.h(f3) / fArr[1];
        double d4 = (double) h2;
        float sqrt = ((float) Math.sqrt(d4)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d4, 0.2d));
        float[] fArr4 = {(float) Math.pow(((double) ((fArr3[0] * cbrt) * f6)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[1] * cbrt) * f7)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[2] * cbrt) * f8)) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new l(h2, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * pow, pow, pow, d2, f9, fArr3, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    /* access modifiers changed from: package-private */
    public float a() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public float b() {
        return this.f3344d;
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.f3348h;
    }

    /* access modifiers changed from: package-private */
    public float d() {
        return this.f3349i;
    }

    /* access modifiers changed from: package-private */
    public float e() {
        return this.f3346f;
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public float g() {
        return this.f3345e;
    }

    /* access modifiers changed from: package-private */
    public float h() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public float[] i() {
        return this.f3347g;
    }

    /* access modifiers changed from: package-private */
    public float j() {
        return this.f3350j;
    }
}
