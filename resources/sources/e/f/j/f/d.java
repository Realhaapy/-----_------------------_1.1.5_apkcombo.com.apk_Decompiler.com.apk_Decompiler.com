package e.f.j.f;

import android.graphics.Color;
import e.f.k.a;

final class d {
    static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    static final float[] c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d  reason: collision with root package name */
    static final float[][] f3338d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    static int a(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = (f2 > 8.0f ? 1 : (f2 == 8.0f ? 0 : -1)) > 0 ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return a.a((double) (f6 * fArr[0]), (double) (f4 * fArr[1]), (double) (f5 * fArr[2]));
    }

    static float b(int i2) {
        return c(g(i2));
    }

    static float c(float f2) {
        float f3 = f2 / 100.0f;
        return f3 <= 0.008856452f ? f3 * 903.2963f : (((float) Math.cbrt((double) f3)) * 116.0f) - 16.0f;
    }

    static float d(float f2, float f3, float f4) {
        return f2 + ((f3 - f2) * f4);
    }

    static float e(int i2) {
        float f2 = ((float) i2) / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((double) ((f2 + 0.055f) / 1.055f), 2.4000000953674316d)) * 100.0f;
    }

    static float[] f(int i2) {
        float e2 = e(Color.red(i2));
        float e3 = e(Color.green(i2));
        float e4 = e(Color.blue(i2));
        float[][] fArr = f3338d;
        return new float[]{(fArr[0][0] * e2) + (fArr[0][1] * e3) + (fArr[0][2] * e4), (fArr[1][0] * e2) + (fArr[1][1] * e3) + (fArr[1][2] * e4), (e2 * fArr[2][0]) + (e3 * fArr[2][1]) + (e4 * fArr[2][2])};
    }

    static float g(int i2) {
        float e2 = e(Color.red(i2));
        float e3 = e(Color.green(i2));
        float e4 = e(Color.blue(i2));
        float[][] fArr = f3338d;
        return (e2 * fArr[1][0]) + (e3 * fArr[1][1]) + (e4 * fArr[1][2]);
    }

    static float h(float f2) {
        return (f2 > 8.0f ? (float) Math.pow((((double) f2) + 16.0d) / 116.0d, 3.0d) : f2 / 903.2963f) * 100.0f;
    }
}
