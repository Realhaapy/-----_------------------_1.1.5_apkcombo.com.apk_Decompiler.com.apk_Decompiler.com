package e.f.r;

import android.os.Build;
import android.view.ViewGroup;

public final class k {

    static class a {
        static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        static int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        static boolean d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        static void e(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
            marginLayoutParams.resolveLayoutDirection(i2);
        }

        static void f(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
            marginLayoutParams.setLayoutDirection(i2);
        }

        static void g(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
            marginLayoutParams.setMarginEnd(i2);
        }

        static void h(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
            marginLayoutParams.setMarginStart(i2);
        }
    }

    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return Build.VERSION.SDK_INT >= 17 ? a.b(marginLayoutParams) : marginLayoutParams.rightMargin;
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return Build.VERSION.SDK_INT >= 17 ? a.c(marginLayoutParams) : marginLayoutParams.leftMargin;
    }
}
