package e.f.j.f;

import e.f.k.a;

class c {
    private final float a;
    private final float b;
    private final float c;

    /* renamed from: d  reason: collision with root package name */
    private final float f3335d;

    /* renamed from: e  reason: collision with root package name */
    private final float f3336e;

    /* renamed from: f  reason: collision with root package name */
    private final float f3337f;

    c(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.f3335d = f8;
        this.f3336e = f9;
        this.f3337f = f10;
    }

    private static c b(float f2, float f3, float f4) {
        float f5 = 1000.0f;
        c cVar = null;
        float f6 = 1000.0f;
        float f7 = 100.0f;
        float f8 = 0.0f;
        while (Math.abs(f8 - f7) > 0.01f) {
            float f9 = ((f7 - f8) / 2.0f) + f8;
            int p2 = e(f9, f3, f2).p();
            float b2 = d.b(p2);
            float abs = Math.abs(f4 - b2);
            if (abs < 0.2f) {
                c c2 = c(p2);
                float a2 = c2.a(e(c2.k(), c2.i(), f2));
                if (a2 <= 1.0f) {
                    cVar = c2;
                    f5 = abs;
                    f6 = a2;
                }
            }
            if (f5 == 0.0f && f6 == 0.0f) {
                break;
            } else if (b2 < f4) {
                f8 = f9;
            } else {
                f7 = f9;
            }
        }
        return cVar;
    }

    static c c(int i2) {
        return d(i2, l.f3343k);
    }

    static c d(int i2, l lVar) {
        float[] f2 = d.f(i2);
        float[][] fArr = d.a;
        float f3 = (f2[0] * fArr[0][0]) + (f2[1] * fArr[0][1]) + (f2[2] * fArr[0][2]);
        float f4 = (f2[0] * fArr[1][0]) + (f2[1] * fArr[1][1]) + (f2[2] * fArr[1][2]);
        float f5 = (f2[0] * fArr[2][0]) + (f2[1] * fArr[2][1]) + (f2[2] * fArr[2][2]);
        float f6 = lVar.i()[0] * f3;
        float f7 = lVar.i()[1] * f4;
        float f8 = lVar.i()[2] * f5;
        float pow = (float) Math.pow(((double) (lVar.c() * Math.abs(f6))) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (lVar.c() * Math.abs(f7))) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (lVar.c() * Math.abs(f8))) / 100.0d, 0.42d);
        float signum = ((Math.signum(f6) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f7) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f8) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d2 = (double) signum3;
        float f9 = ((float) (((((double) signum) * 11.0d) + (((double) signum2) * -12.0d)) + d2)) / 11.0f;
        float f10 = ((float) (((double) (signum + signum2)) - (d2 * 2.0d))) / 9.0f;
        float f11 = signum2 * 20.0f;
        float f12 = (((signum * 20.0f) + f11) + (21.0f * signum3)) / 20.0f;
        float f13 = (((signum * 40.0f) + f11) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f10, (double) f9)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f14 = atan2;
        float f15 = (3.1415927f * f14) / 180.0f;
        float pow4 = ((float) Math.pow((double) ((f13 * lVar.f()) / lVar.a()), (double) (lVar.b() * lVar.j()))) * 100.0f;
        float d3 = lVar.d() * (4.0f / lVar.b()) * ((float) Math.sqrt((double) (pow4 / 100.0f))) * (lVar.a() + 4.0f);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) lVar.e()), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) (((double) f14) < 20.14d ? 360.0f + f14 : f14)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.g()) * lVar.h()) * ((float) Math.sqrt((double) ((f9 * f9) + (f10 * f10))))) / (f12 + 0.305f)), 0.9d));
        float sqrt = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        float d4 = sqrt * lVar.d();
        float sqrt2 = ((float) Math.sqrt((double) ((pow5 * lVar.b()) / (lVar.a() + 4.0f)))) * 50.0f;
        float f16 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((0.0228f * d4) + 1.0f))) * 43.85965f;
        double d5 = (double) f15;
        return new c(f14, sqrt, pow4, d3, d4, sqrt2, f16, log * ((float) Math.cos(d5)), log * ((float) Math.sin(d5)));
    }

    private static c e(float f2, float f3, float f4) {
        return f(f2, f3, f4, l.f3343k);
    }

    private static c f(float f2, float f3, float f4, l lVar) {
        float f5 = f2;
        double d2 = ((double) f5) / 100.0d;
        float b2 = (4.0f / lVar.b()) * ((float) Math.sqrt(d2)) * (lVar.a() + 4.0f) * lVar.d();
        float d3 = f3 * lVar.d();
        float sqrt = ((float) Math.sqrt((double) (((f3 / ((float) Math.sqrt(d2))) * lVar.b()) / (lVar.a() + 4.0f)))) * 50.0f;
        float f6 = (1.7f * f5) / ((0.007f * f5) + 1.0f);
        float log = ((float) Math.log((((double) d3) * 0.0228d) + 1.0d)) * 43.85965f;
        double d4 = (double) ((3.1415927f * f4) / 180.0f);
        return new c(f4, f3, f5, b2, d3, sqrt, f6, log * ((float) Math.cos(d4)), log * ((float) Math.sin(d4)));
    }

    static int m(float f2, float f3, float f4) {
        return n(f2, f3, f4, l.f3343k);
    }

    static int n(float f2, float f3, float f4, l lVar) {
        if (((double) f3) < 1.0d || ((double) Math.round(f4)) <= 0.0d || ((double) Math.round(f4)) >= 100.0d) {
            return d.a(f4);
        }
        float min = f2 < 0.0f ? 0.0f : Math.min(360.0f, f2);
        float f5 = f3;
        c cVar = null;
        float f6 = 0.0f;
        boolean z = true;
        while (Math.abs(f6 - f3) >= 0.4f) {
            c b2 = b(min, f5, f4);
            if (z) {
                if (b2 != null) {
                    return b2.o(lVar);
                }
                z = false;
            } else if (b2 == null) {
                f3 = f5;
            } else {
                f6 = f5;
                cVar = b2;
            }
            f5 = ((f3 - f6) / 2.0f) + f6;
        }
        return cVar == null ? d.a(f4) : cVar.o(lVar);
    }

    /* access modifiers changed from: package-private */
    public float a(c cVar) {
        float l2 = l() - cVar.l();
        float g2 = g() - cVar.g();
        float h2 = h() - cVar.h();
        return (float) (Math.pow(Math.sqrt((double) ((l2 * l2) + (g2 * g2) + (h2 * h2))), 0.63d) * 1.41d);
    }

    /* access modifiers changed from: package-private */
    public float g() {
        return this.f3336e;
    }

    /* access modifiers changed from: package-private */
    public float h() {
        return this.f3337f;
    }

    /* access modifiers changed from: package-private */
    public float i() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public float j() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public float k() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public float l() {
        return this.f3335d;
    }

    /* access modifiers changed from: package-private */
    public int o(l lVar) {
        float pow = (float) Math.pow(((double) ((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(((double) k()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, (double) lVar.e()), 0.73d), 1.1111111111111112d);
        double j2 = (double) ((j() * 3.1415927f) / 180.0f);
        float a2 = lVar.a() * ((float) Math.pow(((double) k()) / 100.0d, (1.0d / ((double) lVar.b())) / ((double) lVar.j())));
        float cos = ((float) (Math.cos(2.0d + j2) + 3.8d)) * 0.25f * 3846.1538f * lVar.g() * lVar.h();
        float f2 = a2 / lVar.f();
        float sin = (float) Math.sin(j2);
        float cos2 = (float) Math.cos(j2);
        float f3 = (((0.305f + f2) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f4 = cos2 * f3;
        float f5 = f3 * sin;
        float f6 = f2 * 460.0f;
        float f7 = (((451.0f * f4) + f6) + (288.0f * f5)) / 1403.0f;
        float f8 = ((f6 - (891.0f * f4)) - (261.0f * f5)) / 1403.0f;
        float f9 = ((f6 - (f4 * 220.0f)) - (f5 * 6300.0f)) / 1403.0f;
        float signum = Math.signum(f7) * (100.0f / lVar.c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f7)) * 27.13d) / (400.0d - ((double) Math.abs(f7))))), 2.380952380952381d));
        float signum2 = Math.signum(f8) * (100.0f / lVar.c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f8)) * 27.13d) / (400.0d - ((double) Math.abs(f8))))), 2.380952380952381d));
        float signum3 = Math.signum(f9) * (100.0f / lVar.c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f9)) * 27.13d) / (400.0d - ((double) Math.abs(f9))))), 2.380952380952381d));
        float f10 = signum / lVar.i()[0];
        float f11 = signum2 / lVar.i()[1];
        float f12 = signum3 / lVar.i()[2];
        float[][] fArr = d.b;
        return a.a((double) ((fArr[0][0] * f10) + (fArr[0][1] * f11) + (fArr[0][2] * f12)), (double) ((fArr[1][0] * f10) + (fArr[1][1] * f11) + (fArr[1][2] * f12)), (double) ((f10 * fArr[2][0]) + (f11 * fArr[2][1]) + (f12 * fArr[2][2])));
    }

    /* access modifiers changed from: package-private */
    public int p() {
        return o(l.f3343k);
    }
}
