package e.f.k;

import android.graphics.Color;

public final class a {
    static {
        new ThreadLocal();
    }

    public static int a(double d2, double d3, double d4) {
        double d5 = (((3.2406d * d2) + (-1.5372d * d3)) + (-0.4986d * d4)) / 100.0d;
        double d6 = (((-0.9689d * d2) + (1.8758d * d3)) + (0.0415d * d4)) / 100.0d;
        double d7 = (((0.0557d * d2) + (-0.204d * d3)) + (1.057d * d4)) / 100.0d;
        return Color.rgb(e((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d), 0, 255), e((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d), 0, 255), e((int) Math.round((d7 > 0.0031308d ? (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d : d7 * 12.92d) * 255.0d), 0, 255));
    }

    private static int b(int i2, int i3) {
        return 255 - (((255 - i3) * (255 - i2)) / 255);
    }

    public static int c(int i2, int i3) {
        int alpha = Color.alpha(i3);
        int alpha2 = Color.alpha(i2);
        int b = b(alpha2, alpha);
        return Color.argb(b, d(Color.red(i2), alpha2, Color.red(i3), alpha, b), d(Color.green(i2), alpha2, Color.green(i3), alpha, b), d(Color.blue(i2), alpha2, Color.blue(i3), alpha, b));
    }

    private static int d(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            return 0;
        }
        return (((i2 * 255) * i3) + ((i4 * i5) * (255 - i3))) / (i6 * 255);
    }

    private static int e(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : Math.min(i2, i4);
    }

    public static int f(int i2, int i3) {
        if (i3 >= 0 && i3 <= 255) {
            return (i2 & 16777215) | (i3 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
